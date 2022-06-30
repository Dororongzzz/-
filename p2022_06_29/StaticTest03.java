package p2022_06_29;

//<정적 메소드 주의사항 3가지>
//1.this.x
//2.정적 필드만 사용 가능
//3.메소드 오버라이딩 x


//정적 필드 주의사항 type 1,2)
class StaticTest3{
  //정적필드
  private static int a=10;
  //일반 필드
  private int b=20;
  //정적메소드) :정적 메서드에서는 this를 사용하지 못함 (this는 개별적인 레퍼런스 변수:heap영역이기 때문)
  //         :정적 필드만 사용 가능(일반 필드 사용 x)
  public static void printA(){    
    System.out.println(a);         
//    System.out.println(b);        //일반 필드 사용x        
//    System.out.println(this.a);   //컴파일 에러 발생
  }

  
  
  
  public void printB(){        //this는 인스턴스 메서드에서 여러 객체에 의해서 
    System.out.println(b); //메서드가 호출될 때 이를 구분하기 위해서 사용된다. 
  }                           
}



//메인 메소드o
public class StaticTest03 {
  public static void main(String[] args) {
    StaticTest3.printA();  
    StaticTest3 s1 = new StaticTest3();
    StaticTest3 s2 = new StaticTest3();
    s1.printB();
    s2.printB();
  }    
}     