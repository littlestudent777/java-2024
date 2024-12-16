
public class Client {
	public static void main(String[] args) {
		Worker_1 worker_1 = new Worker_1();
		
		worker_1.setActivity(new Resting());
		worker_1.executeActivity();
		
		worker_1.setActivity(new Reading());
		worker_1.executeActivity();
		
		worker_1.setActivity(new Coding());
		worker_1.executeActivity();
	}
}
