package day0525;

public class CardMain {

	public static void main(String[] args) {

		Card c1 = new Card("김그린", 10000);
		Card c2 = new Card("박자바", 30000);
		
		System.out.printf("%s의 구매금액 %d원에 대한 포인트 적립액은 %d입니다.\n", c1.name, c1.orderAmt, c1.pointAmt());
		System.out.printf("%s의 구매금액 %d원에 대한 포인트 적립액은 %d입니다.\n", c2.name, c2.orderAmt, c2.pointAmt());
		
//		c1.pointAmt();

	}

}
