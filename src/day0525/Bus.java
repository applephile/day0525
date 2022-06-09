package day0525;

public class Bus {
	
	int num;
	double gas;
	
	Bus() {
		num = 1234;
		gas = 12.34;
		System.out.println("버스가 만들어짐");
	}
	
	public void show() {
		System.out.println("차량 번호 : " + num);
		System.out.println("연료량 : " + gas);
	}
	
}
