package day0525;

public class Student {

	String name; //이름
	int ban; //반
	int no; //번호
	int kor; //국어
	int eng; //영어
	int math; //수학
	
	Student(){} //기본 생성자
	
	Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	int getTotal(){
		return kor + eng + math;
	}
	
	float getAverage(){
		return getTotal() / 3f;
//		return (int)(getTotal() / 3f * 10 + 0.5f) / 10f;
//		return (int)(getTotal() / 3f * 100 + 0.5f) / 100f;
	}
	
}
