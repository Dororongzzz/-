package p2022_06_28;

//생성자를 통해 원하는 값으로 수정되었으나 수정하려고 함 -> 수정 작업: 메소드 (생성자x :객체 생성시 초기화 할 때만 부를 수 있기 때문) 
//생성자로 하면 heap메모리에 새로운 공간만 생길뿐임
//:매개변수 통해 수정

//필드
class MyDate06 {
	private int year;
	private int month;
	private int day;

	// 기본생성자: 필요할 때(무조건 만들기 x)
//  public MyDate(){//default 생성자
//  }  

	// 필드 값 수정)메소드
	public MyDate06(int new_year, int new_month, int new_day) {
		year = new_year; // 2017
		month = new_month; // 7
		day = new_day; // 19
	}



////필드 값 수정)set메소드로 년도 수정 메소드 
////                    자료형 매개변수                     
//  public void SetYear(int year){
//   // this.year=year; 
//       year=year;          //맴버 =매개 이름 같음(:값 전달x)
//  }

	
	
	//setters메소드,getters메소드 이클립스로 생성)
	
	//setters:매개변수 와 멤버변수가 같은 이름으로 되어 있을 때 매개변수로 전달된 값을 수정 
	//getters:자료형(int)이 와서 수정된  값을 return문으로 돌려줌 →출력
	
	//→한꺼번에 수정도 가능하지만 이클립스 내에서 생성하면 개별 생성됨 
	
	//오른쪽 버튼> source> generate getter and setter> select all
	//sort by> pairs(1쌍씩 만들어 줌)
	
	//getters method
	public int getYear() {
		return year;
	}
	
	
	//setters method
	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

//필드 값 수정)set메소드로 월 수정 메소드 
	public void SetMonth(int new_month) {
		month = new_month; // month=8
	} // 이름 다르므로 수정 ㅇ

//필드 값 수정)출력 
	public void print() {
		System.out.println(year + "/" + month + "/" + day);
	}
}

//메인 메소드
public class ConstructorTest06 {
	public static void main(String[] args) {
		MyDate06 d = new MyDate06(2017, 7, 19);
						//생성자 호출 코드(생성자x)
		d.print();
		
		d.setYear(2022);
		d.setMonth(6);
		d.setDay(28);
		d.print();    //간단하게 출력
		
		System.out.println("year:"+d.getYear());
		System.out.println("month:"+d.getMonth());
		System.out.println("day:"+d.getDay());
		
		

//		d.SetYear(2022); // 변경되지 않음
//		d.print();
//
//		d.SetMonth(8); // 변경됨
//		d.print();
	}
}