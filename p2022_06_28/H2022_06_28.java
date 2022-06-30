package p2022_06_28;

public class H2022_06_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~45사이의 숫자를 6개 추출 하는 프로그램을 작성 하세요? 
//			    (단, 중복된 숫자는 1번만 출력 되도록 한다.)
//			    Math.random() 이용해서 프로그램을 작성 하세요.
//
//			*0.0 <= Math.random() < 1.0
// 			*1차원 배열을 사용하시오
//		    *루프 6번 
		// 배열 방에 저장 이전에 저장 된 값 중복 값 잇는지 보기
		// 다중 for문 반복문 빠져 나오는  break문 사용



		
		
		int[] number = new int[6];
		
		for(int i=0; i<number.length; i++) {
			number[i] = (int)(Math.random() * 45) + 1;
			
			for(int j = i-1; j>=0; j--) {
				if(number[i] == number[j]) {
					i--;
					break;
				}
			}
					
				}
				
				for(int i=0; i<number.length; i++)
				System.out.println(number[i]+"");
			}
	
	
		
		

}

