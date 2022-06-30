package p2022_06_22;

public class OPer04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 비교 연산자 : >, >=,<, <=, ==(같다), !=(같지않다)
		//변수의 초기값(처음 부여된 값)이 할당되어야 한다
		// 비교 연산자의 결과가 참이면 true, 거짓이면 false값을 리턴한다.
		
		//기본 자료형=값 저장
		//참조형은 다르므로 조금 어려움
		
				
		String str1 = "자바";
		String str2 = "자바";
		String str3 = new String("자바");
		//문자열 바로 입력 + new 선언  2가지 모두 가능한 유일한 클래스:String
		//**아이패드 그림 참조
		//그래서 char형 잘 안씀
		//str1-2는 같은 주소값
		//자바라는 공간을 만든 후로는 다른 주소 안만듦
		//new:새로운 공간을 만들어 자바라는 값을 저장하겠다는 뜻
		//str3는 heap의 새로운 공간에 저장됨(new이기 때문)
		//주소값끼리 값끼리 비교가능 
	
		
		//비교 연산자로 주소 값을 비교
		if(str1 == str2) {
			System.out.println("같은 주소");	//같은 주소
			}else {
				System.out.println("다른 주소");
			}
		
		if(str1 == str3) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소"); //다른 주소
		}
		//주소 값은 비교 연산자o  값은 비교 연신자x
		//값은 equals문으로 가능
		
		
		//값을 비교(equals)
		System.out.println(str1.equals(str2)); //true
		System.out.println(str1.equals(str3));	//true	
		
		
		
		
		
	}

}
