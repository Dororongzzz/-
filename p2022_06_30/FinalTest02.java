package p2022_06_30;
//클래스 3개
//2.final이 메소드 앞에 붙은 경우)

//클래스1) 부모 클래스
//set str메소드에 final이 붙었기 때문에 메소드 오버라이딩 허용x 
class FinalMethod{
  String str="Java ";
  //public void setStr(String s) {
  //final 붙이면 서브 클래스에서 오버라이딩이 불가.            
  public final void setStr(String s) {
    str=s;
    System.out.println(str);
  }
}

//클래스2) 자식 클래스 :부모클래스로부터 상속 받음 
//               :(형식) 자식클래스 extends 부모클래스
//:부모로부터 받은 필드와 메소드 상속받아 내 것처럼 사용
//class FinalEx extends FinalMethod{    
//  int a=10; // final 붙이면 밑에서 a값 대입 불가.
//  public void setA(int a) {
//    this.a=a;
//   }
//  public void setStr(String s) { // 메소드 오버라이딩:내용을 다르게 기술
//	  							 //위에서 메소드 오버라이딩 x 했는데 시도하여 오류 발생	
//    str+=s;
//    System.out.println(str);
//  }
//
//}
		

//클래스 3)메소드 앞에 final이 붙은 경우)		
//public class FinalTest02{
//  public static void main(String[] args) {
//    FinalEx  ft= new FinalEx( );
//    ft.setA(100);
//    ft.setStr("hi");// 슈퍼 클래스의 setStr을 실행.
//    FinalMethod ft1=new FinalMethod( );
//    ft1.setStr("hi");// 자신의 클래스의 setStr을 실행.
//  }   
//}           