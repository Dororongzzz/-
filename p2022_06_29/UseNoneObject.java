package p2022_06_29;


public class UseNoneObject {

	// 메인메소드o
	//NoneObject(:정적필드+정적 메소드) 일반 메소드 호출처럼 가능하나  잘x
	//:일반 객체처럼 호출할것이라면 굳이 정적 메소드 사용 x
	//정적 메소드 호출 1):잘x
    public static void main( String[] args ) {
    
    //heap메모리x
    //static영역
    NoneObject no = new NoneObject();
    System.out.println("no.number = " + no.number);
    no.printNumber();
   

    //정적 메소드 호출 2):"클래스명."으로 접근
    System.out.println("NoneObject.number = " + 
									NoneObject.number);
    NoneObject.printNumber();
    
    }
}    