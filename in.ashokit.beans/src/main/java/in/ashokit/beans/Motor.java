package in.ashokit.beans;

public class Motor {
	
	public Motor() {
		System.out.println("Motor :: Constructor");
	}
	
	public void start() {
		System.out.println("Motor Starting.....");
	}

	public void stop() {
		System.out.println("Motor Stopped........");
	}
	
	public void doWork() {
		System.out.println("Motor Pulling Water.....");
	}
}
