package p2022_06_27;

public class H2022_06_27_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

//	  구구단(2~9단)의 연산 결과를 2차원 배열에 저장하고,
//	       배열에 저장된 결과를 이용해서 구구단을 출력하는 
//	       프로그램을 작성하세요?
		//*8행 9열
		
		int[][] ggdan = new int[8][9];
		
		int i;
		for(i=0; i<ggdan.length; i++) {
			

			for(int j=0; j < ggdan[i].length; j++) {
				ggdan[i][j] =(i+2)*(j+1);
				System.out.print((i+2)+"*"+(j+1)+"="+ggdan[i][j]+"\t");
			}
			System.out.print("\n");
		} 
	}

}
