package p2022_06_23;

public class For06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//구구단(2~9단)을 출력하는 프로그램을 작성하세요?
		//for문(for문) :다중 for문

		
		for(int dan=2; dan<=9; dan++) {		//단
			System.out.println("["+dan+"단]");
			for(int i=1; i<=9; i++) {    //i<=9를  1<=9로 하면 무한 루프 
				System.out.println(dan + "*" +i + "=" +dan * i);    //2x10이  없는 이유
			}
		    System.out.println();	//각 단 줄간격 벌리기     /한줄 띄기
		}
		
		
		//바깥 for문이 기준이므로 값을 만족하면 내부for문은 9번 루프한다.
		
		
		
		
		
		
		
		
		
	}

}
