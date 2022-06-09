package day0525;

public class Box {

	int width;
	int length;
	int height;
	int volume;
	
	Box(){}
	
	//this : 인스턴스 자신을 가리키는 참조변수
	//static 메서드에서 사용 불가
	Box(int width, int length, int height){
		this.width = width;
		this.length = length;
		this.height = height;
		this.volume = width * length * height;
	}
	
	public int getVolume() {
		return volume;
	}
	
}
