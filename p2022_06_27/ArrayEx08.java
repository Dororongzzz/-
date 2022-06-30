package p2022_06_27;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p.167 ~ 168
		//1차원 배열 )배열 복사 예제 : for문으로 배열 복사
		//특정 배열을 다른 배열로 복사 
		
		int[] oldArray = {10, 20, 30}; 		//원본 배열
		int[] newArray = new int[5];		//새로운 배열
											//int형이므로 모두 0으로 초기화

		for(int i=0; i<oldArray.length; i++) {
			newArray[i] = oldArray[i];		//배열 복사
		}
		
		//복사된 배열 출력
		//향상된 for문
		for(int i : newArray) {
			System.out.print(i+"\t"); //한 줄에출력
		}
		
		
		
	}

}
