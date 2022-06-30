package p2022_06_30;


//날짜, 시간 관련 클래스 :Date, Timestamp, Calendar
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Date
		Date d = new Date();
		System.out.println(d); //영미권 포맷 →원하는 포맷 :다른 클래스 도움 받아 바꿈가능
							   //sol>simple date 포맷 으로 가능:java.text
		SimpleDateFormat sd = 
				new SimpleDateFormat("yyyy-MM-dd EEE a:HH:mm:ss");//년 월 시 분 출력 :한글 작성 가능
																//영,한은 운영체제 영향
		SimpleDateFormat sd1 =
		new SimpleDateFormat("yyyy-MM-dd EEE a:HH:mm:ss",Locale.US);//Locale.US +Import :영미권
		System.out.println(sd.format(d));  //format메소드 사용
		System.out.println(sd1.format(d));
		
		//2.Timestamp :Date클래스의 자식클래스(상속 관계)
		//생성자:제공되는 것만 사용 가능
		//: java.sql
		
		Timestamp ts = new Timestamp(System.currentTimeMillis()); //currentTimeMillis:정적 메소드
																  //1/1000초 단위
		System.out.println(ts);
		
		
		//3.simple date 포맷으로 원하는 포맷으로 출력하기
		SimpleDateFormat sd3 =
				new SimpleDateFormat("yyyy년MM월dd일 HH:mm:ss");
		System.out.println(sd3.format(ts));
		
		
		
		
		
	}

}
