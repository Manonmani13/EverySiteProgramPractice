

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
//		Car c=new Car(new PetrolEngine());
//		c.drive();
		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("Beans.xml"));
		Car car=factory.getBean(Car.class);
		System.out.println("Application Execution Finished.....");
		ApplicationContext context=new ClassPAthXmlApplicationContext("Beans.xml");
	}

}
