package p2022_06_23;

public class p2022_06_23_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		구구단(2~9단)을 열방향(세로방향)으로 출력하는 
//		   프로그램을 작성 하세요?
//
//		*가로 방향으로 출력할 것
//		*prinln \t를 쓸 것

	
		for(int i=2; i<=9; i++) {	
			System.out.print("["+i+"단]\t");
		}
			 System.out.println();
			
			for(int i=1; i<=9; i++) {   
				for(int dan=2; dan<=9; dan++) {
				System.out.print(dan + "*" +i + "=" +dan * i + "\t");   
			}
		    System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}