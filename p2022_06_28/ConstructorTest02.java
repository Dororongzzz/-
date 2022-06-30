package p2022_06_28;

//클래스(필드 + 생성자 + 메소드)
//<필드: 값 저장>
class MyDate{   
  private int year;    //private 지우면 default로 바뀌어 아래쪽에서 출력 가능    
  private int month;    
  private int day;
  
  //모두 int형이라 자동 0초기화

  
//<생성자:값 초기화>
//형식상 ()괄호 가짐 :멤버 함수이기 때문
//클래스와 같은 파일명
//원하는 값으로 초기값 설정할 경우 생성자 사용
//생성자가 언제 생성되는지 확인하는 예제)
  public  MyDate() {		//기본 생성자(Default Constructor): 메개변수x
    System.out.println("[생성자] : 객체가 생성될 때 자동 호출됩니다.");
  }
  

  //static:특별한 경우가 아닌 이상 잘 쓰지 않음
  //<메소드(Method): 1.출력 , 2.필드값 돌려줌 , 3.필드 값 수정>
  //가장 많은 기능을 가짐
  //메소드 1. 출력 예제)
  // void/자료형 + 메소드
  //메인 메소드x 컴파일 까지만 가능   
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end




//메인메소드ㅇ 
public class ConstructorTest02 {     
  public static void main(String[] args) {
	  ConstructorTest02 c = new ConstructorTest02();    //자기 자신으로 객체 생성은 가능하지만 의미는없음
	  													
    MyDate d =  new MyDate();	//생성자 호출 코드:객체 생성 될 때 호출 됨
    d.print();  //0으로 초기화된 필드값을 출력한다
    			//"."으로 접근 
     			//생성자 호출
    
    
// System.out.println(d.year); //오류 이유: year앞에 오는 접근제어자(private)가 외부 클래스에서  접근 허용x:자바 접근제어자 4가지 존재 
    						   //private: 같은 클래스 내에서만 접근 가능
    						   //sol>메소드 이용
//	MyDate dd =  new MyDate();
 }
} 

