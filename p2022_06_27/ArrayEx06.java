package p2022_06_27;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//향상된  for문, 확장  for문
		//형식 : for ( 변수 : 순차적인 자료 구조 (배열 ,컬렉션(리스트))){
		//		실행될 문장;
	    //       }
		
		//원소들의 합 처리문  2가지 방식으로 처리해보는 예제
		int[] score = {95, 71, 84, 93, 87};
		
		//1.기본 for문
		int sum = 0;
		for(int i= 0; i <score.length; i++) {
			sum += score[i];
		}
		System.out.println("총합:"+sum);
		
		//2.확장 for문 :더 간결 
		//순차적인 자료 구조에(배열,collection) 사용 가능 (아무거나 사용x)
		int sum1 =0;
		for(int s : score) {   //score변수의 값을 s변수에 전달 하여 반복 수행
			sum1 += s;
		}
		System.out.println("총합:" +sum1);
		
		
		
		
		
		
	}

}
