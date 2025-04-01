

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, InstantiationException, IllegalAccessException {
//		Car c=new Car(new PetrolEngine());
//		c.drive();
		Class<?> clz=Class.forName("com.example.Car");
		Field engField=clz.getDeclaredField("eng");
		engField.setAccessible(true);
		Object obj=clz.newInstance();
		Car car=(Car) obj;
		engField.set(car, new PetrolEngine());
		car.drive();
	}

}
