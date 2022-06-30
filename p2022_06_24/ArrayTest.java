package p2022_06_24;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max, min;
		int[] s = new int[5];

		System.out.print("정수 5개를 입력 하세요?");
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < s.length; i++) {
			s[i] = sc.nextInt(); //값을 입력받는 for문
		}
		max = s[0]; //0번 방 초기값 설정  /값 모름 고정된 값 없으므로
		min = s[0];
		for (int i = 1; i < s.length; i++) {//0번방 값이 있으므로 i=1;
			//배열에 들어있는 값을 비교하는 for문 
			if (max < s[i]) max = s[i];
			if (min > s[i]) min = s[i]; 
		}
		System.out.println("max=" + max);
		System.out.println("min=" + min);
	}

}
