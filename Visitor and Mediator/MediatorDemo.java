interface Mediator {
    void notify(Device sender, String event);
}

abstract class Device {
    protected Mediator mediator;

    public Device(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void executeAction(String event);
}

class LightMotionMediator implements Mediator {
    private Lights lights;

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void notify(Device sender, String event) {
        if (event.equals("motion_detected")) {
            System.out.println("Mediator: Движение обнаружено. Включаем свет.");
            lights.executeAction("turn_on");
        } else if (event.equals("no_motion")) {
            System.out.println("Mediator: Движение прекратилось. Выключаем свет.");
            lights.executeAction("turn_off");
        }
    }
}

class Lights extends Device {
    public Lights(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void executeAction(String event) {
        if (event.equals("turn_on")) {
            System.out.println("Свет: Включен.");
        } else if (event.equals("turn_off")) {
            System.out.println("Свет: Выключен.");
        }
    }
}

class MotionSensor extends Device {
    public MotionSensor(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void executeAction(String event) {
        if (event.equals("motion_detected")) {
            System.out.println("Датчик движения: Движение обнаружено.");
            mediator.notify(this, "motion_detected");
        } else if (event.equals("no_motion")) {
            System.out.println("Датчик движения: Движение прекратилось.");
            mediator.notify(this, "no_motion");
        }
    }

    public void detectMotion() {
        executeAction("motion_detected");
    }

    public void detectNoMotion() {
        executeAction("no_motion");
    }
}

public class MediatorDemo {
    public static void main(String[] args) {
        LightMotionMediator mediator = new LightMotionMediator();
        Lights lights = new Lights(mediator);
        MotionSensor motionSensor = new MotionSensor(mediator);
        mediator.setLights(lights);
        motionSensor.detectMotion();
        motionSensor.detectNoMotion();
    }
}
