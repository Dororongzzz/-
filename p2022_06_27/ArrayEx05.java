package p2022_06_27;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//p.154
		
		
		//1차원 배열 형식2):값이 정해져 있을 때 사용
		//매개변수가 있는 메소드를 이용하여 참조형 배열 생성
		int [] scores; //주소 없는 상태에서  아래new선언으로인해  주소 생김
		scores = new int[] {83,90,87};
		
	//	int [] scores = new int[] {83,90,87}; //이렇게 써도 됨
		
		
		int sum1 = 0; //지역변수라 초기화 따로 0 /+연산 영향 안주는 0으로 초기화
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합:"+sum1);     //총합:260
		
		//add 메소드를 호출해서, 리턴된 총합을 sum2에 저장
		int sum2 = add(new int [] {83, 90, 87}); //heap에 저정되어있음/아래 add값으로 전달되는 코드 
												// 재사용x: 메소드 사용중에만 사용 가능 데이터에서 삭제 됨
		System.out.println("총합:" + sum2);		
		
		
		
		
		
		
	}// main() end

	
	//사용자 정의 메소드 : 합을 구해주는 메소드
	// 위치는 상관없으나  메소드 중첩x이므로 메인 메소드   end후 사용 *괄호 주의
	//매개변수가 있는 메소드를 이용하여 참조형 배열 생성
	public static int add(int [] scores) { //참조형 중 배열/배열의 주소 값을 전달  call by reference방식
	//			void/int 둘 중 하나			  //아직 주소값 없는 상태이므로  같은 int형 주소 값을 받아야함  
										  //위에 add값을 호출하게 됨
										  //Method01_0624 참조
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum +=scores[i];
		}
		return sum;	//int형을 썼기 때문에 return문 사용
		
	}
	
	
	
	
}
