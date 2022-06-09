package day0525;

public class CarCopy {

	public static void main(String[] args) {
		
		Car c1 = new Car();

		System.out.println("color : " + c1.color);
		System.out.println("gearType : " + c1.gearType);
		System.out.println("door : " + c1.door);
		
		Car c2 = new Car(c1);
		
		System.out.println("color : " + c2.color);
		System.out.println("gearType : " + c2.gearType);
		System.out.println("door : " + c2.door);
		
	}

}
