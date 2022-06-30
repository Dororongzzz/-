package p2022_06_23;

import java.util.Scanner;

public class FatorialEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n; //f=1;  f=1반드시 1로 초기화 :*연산에 영향을 주지 않는 것이 1이기 때문
		long f =1L; //long형은 뒤에 L붙여줘야 long형으로 인식함
		System.out.print("정수를 입력 하세요?");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // n=3
		
		             //i>0
		for(int i=n; i>=1; i--){
			f = f * i;      // f *= i;
//   		3 = 1 * 3
//   		6 = 3 * 2
//   		6 = 6 * 1
			
		}
		System.out.println(n+"!="+f);	
	}

}
//17!= 21억이 넘어가므로 오버플로우가 발생해 음수값이 출력됨
//자료형의 크기만큼 만들 수 있으므로 값이 큰 팩토리얼은 수행 x
//long형으로 바꾸면조금 큰 값까지는 가능하나 한계가 있다.
