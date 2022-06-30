package p2022_06_28;


//매개변수가 있는 생성자 호출 예제)
//호출 방법이 다릅
//필드 값을 원하는 값으로 초기화하기 위해 사용
//기본 생성자, 매개변수 있는 생성자 모두 역할은 같음


//<필드>  
class MyDate05{   
  private int year;    
  private int month;    
  private int day;

  
  //*(예외)기본생성자는 객체를 생성 할 때 컴파일러가 자동으로 만들어 주지만,
  //예외적으로 매개변수를 가진 생성자가 있을 경우에는 더이상 기본 생성자를 만들어 주지 않는다.
  public MyDate05(){		//기본생성자 x시,오류
  }
  public MyDate05(int new_year, int new_month, int new_day){ // 매개변수 있는 생성자 *메소드와 거의 동일하게 만듦 *지역변수
    year = new_year;  //2017   *매개변수 멤버변수 이름 달라야함
    month = new_month; //7     *같아도 오류는 나지 않지만, 값 전달 x
    day = new_day; //19
  }  
  
  //메소드
  public void print(){
    System.out.println(year+ "/" +month+ "/" +day); 
  }
}
public class ConstructorTest05 {     
  public static void main(String[] args) {
    MyDate05 d = new MyDate05();  
    // 				기본 생성자 호출: x시,호출x
   
    //System.out.println(d.year); 오류발생: 접근제어자 때문
    d.print();

    MyDate05 d2 = new MyDate05(2017, 7, 19);  
    				  //매개변수 3개로 되어있는 생성자를 호출하라
    d2.print();
  }
}      