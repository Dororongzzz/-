package p2022_06_28;
//생성자 이름과 매개변수가 이름이 같을 때 예제)
//sol>1.매개,멤버 변수 이름 다르게 하기  
//    2.this.값을 붙이면 가능 (더 자주 사용)
     


//<필드> 
//기본 접근 제어자(Default constructor)
class MyDate04{   
  int year;    
  int month;    
  int day;  

  public MyDate04(){		//기본 생성자 :매개변수x
   year=2016;  				//초기값 생성
   month=4;
   day=1;
      }
 
  
  
  
  //**매개변수 멤버변수 이름 같음
  //this o :멤버
  //this x :매개
  //*this:내부 레퍼런스 변수 =d2
  //heap메모리에 저장된 3개 값의 주소값을 가진 d2가  내부적으로 생성자 호출함 :this 
//  public MyDate04(int year,int month,int day){
//   this.year=year;		//2017
//   this.month=month;	//7
//   this.day=day;		//19
//  }

  
  
  
// 이클립스 생성자 자동 생성 방법)  
//오른쪽 버튼> source> generate constructor using field > omit 체크
  public MyDate04(int year, int month, int day) {
	this.year = year;
	this.month = month;
	this.day = day;
}

//메소드
  //메인메소드 x 독립수행x 
  //sol>1.클래스 안에 메인메소드 생성     2.밖에 만들어 불러들임
  public void print(){
	System.out.println(year+ "/" +month+ "/" +day); 
  }
}// MyDate end


//메인 메소드o
public class ConstructorTest04 {     
  public static void main(String[] args) {
    MyDate04 d = new MyDate04();
    				//생성자 호출 코드(생성자x)
    
    System.out.println(d.year);
    System.out.println(d.month);
    System.out.println(d.day);
    
    d.print();

    MyDate04 d2 = new MyDate04(2017, 7, 19);
    					//매개변수 3개로 되어있는 생성자를 호출하라
    System.out.println(d2.year);
    System.out.println(d2.month);
    System.out.println(d2.day);
    d2.print();
    
    MyDate04 d3 = new MyDate04(2022,6 , 28); //오늘 날짜로 초기값 설정
    										
    d3.print();
  }
}            