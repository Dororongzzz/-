package p2022_06_30;

//클래스 2개 
//1. final이 멤버변수에 붙은 경우)

//기존 변수 앞에 final붙으면 : 상수
//상수:일정한 값을 가지기 때문에 값을 수정하면 오류 발생
class FinalMember {
  final int a=10;		// 상수
  public void setA(int a){
//    this.a = a;  //매개변수로 전달된 값을 할당해야하나 상수는 값을 수정할 수 없으므로  오류 발생
  }
}




//메인 메소드o
public class FinalTest01{
  public static void main(String[] args) {
    FinalMember ft= new FinalMember();
	final int a=1000;
    ft.setA(100);
    System.out.println(a);
  }
}                                                    
