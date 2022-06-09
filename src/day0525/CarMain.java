package day0525;

public class CarMain {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		
		System.out.println("color : " + c1.color);
		System.out.println("gearType : " + c1.gearType);
		System.out.println("door : " + c1.door);
		
		System.out.println();
		
		Car c2 = new Car();
		
		System.out.println("color : " + c2.color);
		System.out.println("gearType : " + c2.gearType);
		System.out.println("door : " + c2.door);
		
		System.out.println();
		
		Car c3 = new Car("orange", "auto", 6);
		
		System.out.println("color : " + c3.color);
		System.out.println("gearType : " + c3.gearType);
		System.out.println("door : " + c3.door);
		

	}

}
