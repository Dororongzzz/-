//키보드 입력받는 경우

package p2022_06_22;

import java.util.Scanner;

public class Oper05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("정수 2개를 입력 하세요?");

		Scanner sc = new Scanner(System.in);
		// Scan: ctrl + sapace :자동 임포트
		// 생성자 =메소드 명 반드시 같아야함

		int n1 = sc.nextInt(); // 스페이스바 or 엔터키로 구분함
		int n2 = sc.nextInt();
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);

		if (n1 > n2) {
			System.out.println(n1 + "이" + n2 + "보다 크다.");
		} else {
			System.out.println(n2 + "이" + n1 + "보다 크다.");
		}
		
		sc.close();

	}

}
