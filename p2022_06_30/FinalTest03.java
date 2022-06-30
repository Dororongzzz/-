package p2022_06_30;
//클래스 3개
//3. final이 클래스 앞에 붙은 경우)


//클래스1)부모 클래스
//가장 마지막 클래스이기 때문에 : 상속을 허용하지 않는다.
final class FinalClass{				
  String str="Java ";
    public void setStr(String s){
      str=s;
    System.out.println(str);
  }
}

//클래스2)자식 클래스
//class FinalEx extends FinalClass{  //상속 시도 라인에서 오류 발생 
//   int a=10; 
//   public void setA(int a)  {
//    this.a=a;
//   }
//   public void setStr(String s){
//    str+=s;
//    System.out.println(str);
//   }
//}

//public class FinalTest03{
//   public static void main(String[] args) {
//    FinalEx fe= new FinalEx( );
//   }   
//}          