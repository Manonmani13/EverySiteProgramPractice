package in.ashokit.beans;

public class MainApp {

	public static void main(String args[]) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("Spring-Beans.xml");
		 Motor motor=context.getBean(Motor.class);
		 
		 motor.doWork();
	}
}
