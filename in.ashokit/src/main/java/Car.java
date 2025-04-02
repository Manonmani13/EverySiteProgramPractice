

public class Car {

	private IEngine eng;

	public Car() {
		System.out.println("CAR :: constructor");
	}
	
	public void drive() {
		int drive=eng.start();
		if(drive>=1) {
			System.out.println("Journey Started ......");
		}else {
			System.out.println("Engine in trouble.....");
		}
	}
}
