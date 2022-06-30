package p2022_06_23;

public class GuGuDan {

	public static void main(String[] args) {
		
		 //단 title출력 
		for(int dan=2; dan<=9; dan++){ 
			System.out.print("[" + dan + "단]" + "\t");
		}
		//\t:수평
		//ptint:줄바꿈x
		
		
		System.out.println();   //줄바꿈
		
		for(int i=1; i<=9; i++){   //각 단 곱해줄 숫자  for문
			for(int j=2; j<=9;j++){	// 각 단 출력 for문:2-9단 루프		
				System.out.print(j + "*" + i + "=" + (j*i) + "\t");
			}// 줄바꿈x
			System.out.println();
		}
	} 
}

