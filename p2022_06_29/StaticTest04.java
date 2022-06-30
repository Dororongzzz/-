package p2022_06_29;

//<정적 메소드 주의사항 3가지>
//1.this.x
//2.정적 필드만 사용 가능
//3.메소드 오버라이딩 x

class StaticTest4{
  private static int a=10;
  private int b=20;
  
  //정적 필드 주의사항 type 2)
  public static void printA(){  
    System.out.println(a);         
   //System.out.println(b);   //일반 필드 사용:컴파일 에러 발생
  }

  public void printB(){        
    System.out.println(b);     
  }                           
}


//메인 메소드o
public class StaticTest04 {
  public static void main(String[] args) {
    StaticTest4.printA();  
    StaticTest4 s1 = new StaticTest4();
    StaticTest4 s2 = new StaticTest4();
    s1.printB();
    s2.printB();
  }    
}    


