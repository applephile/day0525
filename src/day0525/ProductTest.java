package day0525;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 serialNo : " + p1.serialNo);
		System.out.println("p2 serialNo : " + p2.serialNo);
		System.out.println("p3 serialNo : " + p3.serialNo);
		System.out.println("총 제품 수 : " + Product.count);

		
	}

}
