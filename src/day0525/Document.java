package day0525;

public class Document {
	static int count = 0;
	String docName;
	
	Document(){
		this.docName = "제목없음" + ++count;
		System.out.println("문서 " + this.docName + "가(이) 생성됨");
	}
	
	Document(String DocName) {
		this.docName = DocName;
		System.out.println("문서 " + this.docName + "가(이) 생성됨");
	}
}
