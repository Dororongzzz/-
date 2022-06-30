package p2022_06_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

//날짜, 시간 관련 클래스 :Date, Timestamp, Calendar
//3.Calendar클래스):new연산자 객체생성x 
//				 →new는 새로운 공간을 생성하는건데 calendae는 시스템에 있는 정보이기 때문
//               sol>  1.calendar 자식 클래스 GregorianCalendar(상속관계)
//					  *2.Calendar클래스 방식으로 받으면 Calendar클래스 방식으로 받는 방식
public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Calendar c1 = new Calendar();		   //오류발생
		//1.calendar 자식 클래스 GregorianCalendar(상속관계)
		//자료 형변환 3)반드시 상속관계 전제
		//: 양쪽 클래스 명이 같아야 하는데 다름 → 자료 형변환 됐다고 생각
		//자식 클래스 것을 부모 클래스로 끌어다 쓰는 것
		Calendar c2 = new GregorianCalendar(); //업캐스팅
		
		//*2.Calendar클래스 방식으로 받으면 Calendar클래스 방식으로 받는 방식
		//get-:값 구하는 메소드 
		//set-:값 설정
		Calendar c =Calendar.getInstance();
		System.out.println(c); //unix:1970년 1월1일 0시부터 현재까지 흐른 시간 출력
		System.out.println(Calendar.YEAR);    //1
		//c가 가진 주소를 통해get메소드로 calendar가 가진 정보를 가져옴
		int y = c.get(Calendar.YEAR);  		  //년
		System.out.println(y);
		
		int m =c.get(Calendar.MONTH)+1;		  //월(0 ~ 11) +1
		System.out.println(y+"-" +m);
		
		int d =c.get(Calendar.DATE);          //일
		System.out.println(y+ "-"+ m +"-"+d);
	
		int h1 =c.get(Calendar.HOUR);		  //12시간
		int h2 =c.get(Calendar.HOUR_OF_DAY);  //24시간
		System.out.println(h1);
		System.out.println(h2);
		
		
		int ap =c.get(Calendar.AM_PM);  	  //0:오전 ,1:오후
		if(ap == 0) {
			System.out.println("오전");
		}else {
			System.out.println("오후");
			}
		
		int mm = c.get(Calendar.MINUTE);		//분
		int s = c.get(Calendar.SECOND);			//초

		
		System.out.println(h1+":"+mm+":"+s);
		System.out.println(h2+":"+mm+":"+s);
		
	
	}

}
