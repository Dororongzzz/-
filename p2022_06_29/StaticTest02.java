package p2022_06_29;
//private와 Static 충돌 예제 )
//private:접근x ↔ Static:공유  :모순 :같이 사용x →접근x

//메인 메소드 x
class StaticTest2{
	//private접근제어자 + 정적필드 +int형
  private static int a=10;
  	//인스턴스 필드
  private int b=20;
  
  
  //정적 메소드
  public static void setA(int new_a){  
     a = new_a;
  }
  
  //정적 메소드
  public static int getA(){
    return a;
  }
}



//메인 메소드o
public class StaticTest02 {
  public static void main(String[] args) {
 // System.out.println(StaticTest2.a); //a가 private으로 선언되어서 컴파일 에러 발생 
  									//private:접근x ↔ Static:공유  :모순 :같이 사용x
  System.out.println(StaticTest2.getA());  

    StaticTest2 s1=new StaticTest2();
    StaticTest2 s2=new StaticTest2();
  
    //"."접근 +새로운 객체 생성
    s1.setA(10000);
    int res1=s1.getA();
    System.out.println(res1);
    System.out.println(s2.getA());
 }    
}              