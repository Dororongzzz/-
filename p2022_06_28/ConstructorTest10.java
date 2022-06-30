package p2022_06_28;

//this()에 대한 예제) : 같은 클래스 내에 있는 생성자 호출 (불편: 잘 사용x)
//


//필드
class MyDate10{   

  private int year;    
  private int month;    
  private int day;

  
  //기본생성자: 필요할 때(무조건 만들기 x)
  public MyDate10(){
    this(2016, 1, 1);                   
  }  
  
  //생성자 오버로딩:1개의 클래스에 여러개의 생성자를 정의 하는 것
  //<생성자 오버로딩 바르게 하는 법>
  //	셋 중 하나 만족
  //  1.매개변수의 자료형 :자료형을 다르게 기술
  //  2.매겨변수의 갯수 :매개변수 갯수 다르게 기술 
  //  3.매개변수의 순서 :매개변수 여러개일 때 순서를 바꿔 구분하는 법
 
  // 매개변수 1개) 생성자 오버로딩
  // this(): 같은 클래스 내에 있는 생성자 호출 (불편: 잘 사용x)
  public MyDate10(int new_year){
    this(new_year, 1, 1);                
  }  
  
  //매개변수 2개) 생성자 오버로딩
  public MyDate10(int new_year, int new_month){
     this(new_year, new_month, 1);   //같은 클래스 안에 있는  생성자 호출 (아래)  
  }  
 //매개변수 3개) 생성자 오버로딩
 public MyDate10(int new_year,int new_month,int new_day){
    year=new_year;
    month=new_month;
    day=new_day;
  }    
 
 
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}




//메인 메소드
public class ConstructorTest10 {     
  public static void main(String[] args) {
    MyDate10 d= new MyDate10(2017, 7, 19);  
    d.print();
    MyDate10 d2= new MyDate10(2017, 7);    //매개변수 2개 생성자 호출
    d2.print();
    MyDate10 d3= new MyDate10(2017);       //매개변수 1개 생성자 호출
    d3.print();
    MyDate10 d4= new MyDate10();       		//기본 생성자 호출   
    d4.print();
  }
}