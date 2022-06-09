package day0525;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone p1 = new Phone("samsung", "black", 1200000);
		Phone p2 = new Phone("apple", "sierrablue", 1090000);
		
		System.out.printf("제조사 : %s, 색상 : %s, 가격 : %d\n", p1.make, p1.color, p1.price);
		System.out.printf("제조사 : %s, 색상 : %s, 가격 : %d\n", p2.make, p2.color, p2.price);

	}

}
