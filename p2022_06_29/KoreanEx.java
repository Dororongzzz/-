package p2022_06_29;

//p.207
//한 개의 파일에 클래스 2개)
//:Default 접근제어자
//:필드 + 생성자
//메인 메소드 x 1. 클래스 안에 만들기  2.밖에 메인 메소드 만들기 
class Korean{
	//필드(변수)
	//string형  name, ssn :null로 초기화
	String nation = "대한민국";
	String name;
	String ssn;
	
	//<this.>: 이클립스 활용 생성
	//this o :멤버
	//this x :매개
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
//	//생성자 :파일 명 일치()
//	//매개 멤버 같지 않음
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
}




//메인 메소드 o
//public 접근제어자 1개

//<접근제어자 위치>
//1.클래스 앞      2.필드 앞        3.생성자      4.메소드 앞
public class KoreanEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//위에 만들어 놓은 매개변수 2개  있는 생성자 호출)초기값 새로 설정
		//접근제어자: "."으로 접근
	    Korean k1 = new Korean("박자바","011225-1234567");
		System.out.println(" k1.name:" + k1.name);
		System.out.println(" k1.ssn:" + k1.ssn);

		//위에 만들어 놓은 매개변수 2개  있는 생성자 호출)초기값 새로 설정
		Korean k2 = new Korean("김자바","930525-0654321");
		System.out.println(" k2.name:" + k2.name);
		System.out.println(" k2.ssn:" + k2.ssn);
		
		

		

	}

}
