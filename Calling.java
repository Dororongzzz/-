import a.b.Called;

//Import와 접근제어자와의 상관관계)서로다른 패키지로 접근 할 때는 public +import까지 해야함
//사용자 정의 클래스일 경우 :같은 패키지 Import x → 접근제어자와 관련    (Calling_0630)(default_package_Calling_0630):메인메소드o
//                :다른 패키지 Import o                (Called_0630)(a.b _Called_0630):메인메소드x 

//1)  다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 접근 제어제가
//public 접근 제어자로 되어 있어야 한다.
//2)  다른 패키지 안에 들어 있는 클래스에 접근 하기 위해서는 해당 클래스를 import 를 
//해야된다.

public class Calling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Called c = new Called();
		c.check();
	}

}
