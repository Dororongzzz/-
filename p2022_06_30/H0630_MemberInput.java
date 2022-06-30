package p2022_06_30;

import java.util.Scanner;

//import p2022_06_29.MemberInfo;

class MemberInfo  {
	//필드
	private String name;
	private int age;
	private String email;
	private String address;
		public void setName(String name) {
		this.name = name;
	}



    //setter메소드
	public void setAge(int age) {
		this.age = age;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public void setAddress(String address) {
		this.address = address;
	}






//출력 메소드 
public void print() {
	System.out.println(name + "/" + age + "/" + email + "/" + address);
}

}



//메인 메소드o
public class H0630_MemberInput {

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

		MemberInfo g = new MemberInfo ();
		 g.setName(name);
		 g.setAge(age);
		 g.setEmail(email);
		 g.setAddress(address);

		//프린트 메소드 호출
		g.print();

		
	
	}

}
