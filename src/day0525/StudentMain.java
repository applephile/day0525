package day0525;

public class StudentMain {

	public static void main(String[] args) {
		
		Student s1 = new Student("자바", 1, 7, 84, 71, 65);
		
		int total = s1.getTotal();
		float average = s1.getAverage();
		
		System.out.printf("이름 : %s\n총점 : %d\n평균 : %.1f\n", s1.name, total, average);
//		System.out.println(average);
		
	}

}
