package p2022_06_24;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//p.152 ~ 153
		
		int[] score = {83, 90 ,87};
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		
		//합 
		int sum =0;    //지역변수 이기 때문에 스택영역 자동 초기화 x 더하기 연산에 영향x인 0으로 초기값 설정
		for (int i=0; i<score.length; i++)
			sum += score[i]; 	//sum =sum + score[i]
		System.out.println("총점:"+sum);   //총점 :260
		double avg = (double)sum / 3;	  // 평균:86.66666666   
									   //데이터 손실 방지 위헤 분자,분모 중 하나에 (double)붙여준다.
		System.out.println("평균:"+avg);
			
		//평균 값을 소숫점 둘 째 자리까지 출력 하세요?
		System.out.printf("평균:%.2f",avg); // 평균 :86.67
		
		
		
	}

}
