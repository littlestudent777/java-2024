interface MyValue {
    double getValue();
}

interface MyParamValue {
    double getValue(double v);
}

public class LamdaDem {
    public static void main(String[] args) {

        MyValue myVal;

        myVal = () -> 98.6;
        System.out.println("Постоянное значение"
                + myVal.getValue());

        MyParamValue myPval = (n) -> 1.0 / n;
        System.out.println("Обратная велечина для 4.0 "
                + myPval.getValue(4));
    }
}
