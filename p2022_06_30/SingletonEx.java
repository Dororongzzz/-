package p2022_06_30;

//p.244
//2개의 클래스)
//싱글톤 + private + static(정적메소드통해 return 받아 공유) 
//Singleton getInstance():get으로 return받음




//싱글톤(Singleton):자기 자신의 클래스로 객체 생성을 1번만 수행 하는 것을 의미함 :서버 메모리 자원,시간 효율적 사용 가능 :DB연동에 사용 
//외부에서는 다이렉트로 졉근하지 못하도록 private 설정
//static: 아래쪽에서 정적메소드로 return하여 공유하는 방식
class Singleton{
	
	private static Singleton s = new Singleton(); //정적필드 : 공유하겠다 
	//            :클래스 형태의 자료형 (메소드 앞에는 클래스,인터페이스등 올 수 있으므로)
	public static Singleton getInstance() {       //정적 메소드 + return
		return s;
	}
	
	public void check () {
		 System.out.println("메소드 호출 성공");
	}
	
	public void check1() {
		 System.out.println("메소드 호출 성공");
	}
	
	
}



//메인 메소드
//Singleton. getInstance: "."으로 공유받음
public class SingletonEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//메소드 영역에 저장된  주소값이 뜸
		//싱글톤으로 공유되기 때문에 obj1,obj2가 같은 주소 →비교연산자로 같은 주소인지 비교
		//싱글톤 = 클래스 형태의 자료형  받는 자료형도 클래스 여야함 
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2= Singleton.getInstance();
		System.out.println(obj1);
		System.out.println(obj2);
		
		
		if(obj1 == obj2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		//결과적으로 check()호출하려고 함
		obj1.check();
		obj1.check1();
		obj2.check();
		obj2.check1();
		
		
	}

}
