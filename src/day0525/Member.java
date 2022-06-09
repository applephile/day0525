package day0525;

public class Member {
	
	String name; //명시적 초기화 : 일반적으로 잘 사용하지 않는 초기화 방법이며 '0' 또는 'null' 등의 값을 넣을 때만 가끔 사용
	String tel;
	String address;
	
	Member(){}
	Member(String name, String tel, String address){
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	void setMemberData(String setName, String setTel, String setAddress) {
		name = setName;
		tel = setTel;
		address = setAddress;
		
	}
	
	void print() {
		System.out.println("name : " + name);
		System.out.println("tel : " + tel);
		System.out.println("address : " + address);
	}
}
