package hello;

//서로다른 패키지로 접근 할 때는 public +import까지 해야함
//
//사용자 정의 클래스일 경우 :같은 패키지 Import x    → 접근제어자와 관련
//               :다른 패키지 Import o 

public class PackageHelloWorld {

    public void printHello() {
		System.out.println( "Hello, World" );
    }
}