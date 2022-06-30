package p2022_06_27;

public class ArrayEx07 {
	
	
	//형변환 예제)
	//절대값을 구해주는 메소드
	static int abs(int data) { //abs는 절대값 받기 때문에 양수 값으로 받아야 하는데 음수나옴
								//매개변수가 int형이기 때문에 
		if(data < 0)
			data = -data;    //그래서 음수를 양수로 바꿔서 전달
		return data; //앞에 int형 으로 정했기 때문
		
	}

	//메인 메소드
	public static void main(String[] args) { //string형 1차원 배열이기 때문에 문자열로 전달
		// TODO Auto-generated method stub

		//args[0] = "-10",  args[1] ="-20"
		System.out.println("args[0]:" +args[0]);
		System.out.println("args[1]:" +args[1]);
		
		//자료형 변환 2)
		//args[0] = "-10" →   -10 : 형변환(문자열 → 숫자)
		int num = Integer.parseInt(args[0]);   //자료형 마다 wrapper 클래스 존재  //int num =-10
												//int형 - integer 		//abs(-10)호출
												//형변환 된 값 전달해야함 
		System.out.println("절대값:" +abs(num));
		

		
		//*실행 방식 주의
		//▶옆에 작은화살표>  Run configurations > arguments >  program arguments -10 -20 입력
		//> Apply> Run
		
	}

}
