package p2022_06_24;

public class Break02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// break : 반복문을 빠져나오는 역할
		// 무한 루프 : while문

		
		int i=1; //번호 값 붙이기
		while(true) {//항상 참인 조건식 (2>1)
			//break;    :break 다음에는 식이 없어야함
			System.out.println(i+"무한 출력");
			if(i == 100) break;
			i++; //번호 값 증감
		}		
		

		
	}

}
