package day0525;

public class Car {
	
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white", "auto", 4); //Car(String, String, int)형의 생성자를 찾아가서 값을 대입한다
		
		color = "white";
		gearType = "auto";
		door = 4;
	}
	
	Car(String color){
		this(color, "auto", 4); //Car(String, String, int)형의 생성자를 찾아가서 값을 대입한다
//		this.color = color;
//		gearType = "auto";
//		door = 4;
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
	Car(Car c){
		color = c.color;
		gearType = c.gearType;
		door = c.door;
	}
}
