
public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml"); 
		Car car=context.getBean(Car.class);
		car.drive();
	}

}
