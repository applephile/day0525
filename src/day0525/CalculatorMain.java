package day0525;

public class CalculatorMain {

	//정사각형과 직사각형의 넓이를 계산하는
	//areaRectangle 메서드를 오버로딩하여 작성
	//정사각형의 한 변의 길이 10
	//직사각형 가로 10, 세로 20 
	//각각 넓이 출력
	
	public static void main(String[] args) {
		
		System.out.println("한 변의 길이 10인 정사각형의 넓이 : " + Calculator.areaRectangle(10));
		System.out.println("가로 길이 10, 세로 길이 20인 직사각형의 넓이 : " + Calculator.areaRectangle(10, 20));
		
	}
	
}
