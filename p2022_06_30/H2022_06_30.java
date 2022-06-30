package p2022_06_30;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class H2022_06_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//    Calendar 클래스를 이용해서 오늘 날짜, 시간, 요일을 
//           출력하는 프로그램을 작성 하세요?

		// 1차원 배열 >, if-else문
		// 시작하는 요일 중요

		Calendar w1 = new GregorianCalendar();
		Calendar w = Calendar.getInstance();
		int y1 = w.get(Calendar.YEAR);

		int m1 = w.get(Calendar.MONTH) + 1;

		int d1 = w.get(Calendar.DATE);

		int h3 = w.get(Calendar.DAY_OF_WEEK); // 1 ~ 7
		//System.out.println(h3); // 5

		System.out.print(y1 + "/" + m1 + "/" + d1 +"/");
		
		String[] week = {"일","월","화","수","목","금","토"};
		
		System.out.print(week[h3-1]+"요일");
		//0번방부터 시작이므로  목=5이지만 4번방에 값이 저장되어 있으므로 -1을 해준다
		
		
	}

}
