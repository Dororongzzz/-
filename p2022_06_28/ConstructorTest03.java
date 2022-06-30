package p2022_06_28;


class MyDate03{   
  //<필드>  
  private int year;  
  private int month;    
  private int day;
  
  //<생성자: 객체를 생성할 때 생성자가 호출되고, 필드값을 초기화를 시켜주는 역할을 한다.>
  //원하는 값으로 초기값 설정할 경우 생성자 사용
  public MyDate03(){ // 기본 생성자 :필드 값 초기화  
    year=2016;    
    month=4;
    day=1;   //다시 초기화
  }  
  
  //<메소드(Method): 1.출력 , 2.필드값 돌려줌 , 3.필드 값 수정>
  //가장 많은 기능을 가짐
  //메소드 1. 출력 예제)
  //메인메소드 x 독립수행x 
  //sol>1.클래스 안에 메인메소드 생성     2.밖에 만들어 불러들임
  public void print(){   //void: return값 생략 가능
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end


//메인메소드ㅇ 
public class ConstructorTest03 {     
  public static void main(String[] args) {
    MyDate03 d = new MyDate03(); //생성자 호출 코드
   d.print(); 
  }
}               