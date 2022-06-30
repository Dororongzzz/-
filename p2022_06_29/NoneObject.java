package p2022_06_29;
//정적 필드,멤버변수 예제)
//정적필드 + 정적메소드(메인메소드 x:반드시 있어야 필드,메소드 실행 가능)
//따로 객체 호출해도 되지만  클래스명+"."으로 접근 :누구나 쉽게 접근할 수 있도록 만든 것이기 때문
//static영역에 저장
public class NoneObject {
	//정적 필드
    static int number = 3;
    
  
    
    
    //정적 메소드 (메인x)
    public static void printNumber() {
        System.out.println("number = " + number);
    }
}            