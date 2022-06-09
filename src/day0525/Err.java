package day0525;

class Data_1{
	int value;
	
	Data_1(){}
}

class Data_2{
	int value;
	
//	Data_2(){} 
	//생성자 오버로딩 가능
	
	Data_2(int x){
		value = x;
	}
}

public class Err {

	public static void main(String[] args) {
		Data_1 d1 = new Data_1();
		Data_2 d2 = new Data_2(2);
		
		
	}

}
