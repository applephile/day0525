package day0525;

public class MemberTest {

	public static void main(String[] args) {
		
		Member m = new Member("조던 풀", "010-2222-3333", "샌프란시스코");
		
		m.print();
		
		Member m2 = new Member("돈치치", "010-4444-5555", "댈러스");
		
		m2.print();
		
		Member m3 = new Member(); //생성자를 오버로딩 선언을 해서 매개변수 없이도 객체 생성 가능
		
	}

}
