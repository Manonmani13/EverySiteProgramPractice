

public class Car {

	private IEngine eng;
	//constructor engine
//	public Car(IEngine eng) {
//		this.eng=eng;
//	}
//	
//	//setter engine
//	public void setEng(IEngine eng) {
//		this.eng=eng;
//	}
	
	public void drive() {
		int drive=eng.start();
		if(drive>=1) {
			System.out.println("Journey Started ......");
		}else {
			System.out.println("Engine in trouble.....");
		}
	}
}
