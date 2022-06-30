package p2022_06_29;

import java.util.Scanner;

class MemberInfo {
	//필드
	private String name;
	private int age;
	private String email;
	private String address;

	// 생성자(매개변수 4개)
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	//출력 메소드 
	public void print() {
		System.out.println(name + "/" + age + "/" + email + "/" + address);
	}

}



// 메인메소드
//<nextLine vs next>
//nextLine: 통째로 입력됨 길어도 다 나옴
//next:띄어쓰기 있으면 잘림 
class H_MemberInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력하세요?");
		String name = sc.next();
		
		System.out.println("나이을 입력하세요?");
		int age = sc.nextInt();
		
		System.out.println("이메일을 입력하세요?");
		String email = sc.next();	
		sc.nextLine();
		
		System.out.println("주소를 입력하세요?");
		String address = sc.nextLine();		

		MemberInfo m = new MemberInfo(name, age, email, address);

		//프린트 메소드 호출
		m.print();

	}
}

//             *scanner객체
//             *클래스 2개 
//		       *한 명씩 저장하고 한꺼번에 출력하는 프로그램
//             *출력을 위한 메소드 		
//		       *2명 이상 : 객체 배열, 리스트 


