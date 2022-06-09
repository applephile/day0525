package day0525;

public class Flower {

	String name;
	int cost;
	
	Flower(){}
	Flower(String name, int cost){
		this.name = name;
		this.cost = cost;
	}
	
	void FlowerInfo() {
//		System.out.println(name + " 한 송이의 가격은 " + cost + "입니다.");
		System.out.printf("%s 한 송이의 가격은 %,d입니다.\n", name, cost);
	}
	
	
}
