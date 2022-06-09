package day0525;

public class Card {
	
	String name;
	int orderAmt;
	
	Card(){}
	
	Card(String name, int orderAmt){
		this.name = name;
		this.orderAmt = orderAmt;
	}
	
	int pointAmt() {
		return (int)(orderAmt * 0.03);
	}
//	public void pointAmt() {
//		int point = (int)(orderAmt * 0.03); 
//		System.out.printf("%s의 구매금액 %d원에 대한 포인트 적립액은 %d입니다.\n", name, orderAmt, point);
//	}
	
}
