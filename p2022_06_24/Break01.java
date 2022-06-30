package p2022_06_24;

public class Break01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//break :반복문을 빠져 나오는 역할
		//무한 루프 : for문 : 초기값,증감식등을 생략하고   세미콜론 2개를 정의함(;;)
		
//		for(;;) {
//			System.out.println("무한 출력");
//			}
		
		

		for(int i=1;; i++)	{   
		
			System.out.println(i+"무한출력");
			if(i ==100) break;      //100번만 출력    //위치에 따라 다름 syso위로 올라가면 99까지만 출력됨
			}									//그냥 for문 아래에 작성하면 바로 끝나버림
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
