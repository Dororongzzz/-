package p2022_06_29;

import java.util.Scanner;

public class MemberInput00 {

	//클래스 1)
	//메인 메소드
	//<nextLine vs next>
	//nextLine: 통째로 입력됨 길어도 다 나옴
	//next:띄어쓰기 있으면 잘림 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 배열):2명이상의 정보 저장 위해서
		MemberInfo00[] m = new MemberInfo00[5];
		int i = 0; //몇 번 루프가 돌아가는지 저장하는 i 1)
		String yn;
		Scanner sc = new Scanner(System.in);
		String name, email, address;
		int age;
		
		do {						
			System.out.print("성명을 입력하세요? ");
			name = sc.nextLine();
			System.out.print("나이를 입력하세요? ");
			age = sc.nextInt(); 				// 숫자를 입력받은후에 enter키를 
			sc.nextLine();	    				// 누르면 null값을 return하게 됨
												//=nextInt는 enter키도 하나의 문자로  인식하기 때문
												//sol>    sc.nextLine(); 추가
			System.out.print("E-Mail을 입력하세요? ");
			email = sc.nextLine();			
			System.out.print("주소를 입력하세요? ");
			address = sc.nextLine();		
	
			
			//m의 정보 저장하지 않으면 가장 마지막 사람 정보만 출력됨 → 객체배열 방에 m[0]의 방에 저장
			m[i] = new MemberInfo00(name, age, email, address);
			// m.name="홍길동";  :접근제어자 private라 다이렉트 접근x
			i++; //반복  i 2)
			

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine(); //yn에서 입력한 값 yn에 저장
			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) { //값 비교
				break;
			}

			
		} while (true);  //do ~ while:최소 1번은 실행된다느 점을 이용

		               //반복 i  3)
		for (int j = 0; j < i; j++) {
			m[j].print();
//			System.out.println("성명:" + m[j].getName());
//			System.out.println("나이:" + m[j].getAge());
//			System.out.println("E-Mail:" + m[j].getEmail());
//			System.out.println("주소:" + m[j].getAddress());
		}
	}

}


//클래스 2):회원1의 정보 일시적으로 저장
//DTO(Data Transfer Object)클래스
//필드
class MemberInfo00 {
	private String name;
	private int age;
	private String email;
	private String address;

	
	//생성자):private접근자 sol>
	//1. 생성자 매개변수 통해 새로운 값 전+매개/멤버 이름 같으므로  this사용 
	//2.setter메소드로 매개변수 값 수정
	public MemberInfo00(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}
	
   //getters메소드): 답 돌려받는 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	//<프린트>
	//1.프린트 메소드 호출
	//2.getters메소드로 출력
	public void print() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(email);
		System.out.println(address);
	}

}
