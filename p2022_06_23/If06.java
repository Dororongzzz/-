package p2022_06_23;

public class If06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//난수 발생 공식
		//난수 = (정수화) (Math.random() * (상한값) - 하한값 +1)) + 하한값;
		
		//난수 발생 (난수:어떤 수가 나올지 알 수 없는 수)
		//    0.0 <= Math.random()	< 1.0   (실수 형태의 난수)
		//1.0은  포함x
		//		1		~				6
		
		
		System.out.println("E="+Math.E);      //E값
		System.out.println("PI="+Math.PI);    //PI값
		System.out.println(Math.random());    //난수 발생(2가지 있음)
		
		
		
		//교재 P.114 예제
		//주사위 뽑기 : 1 ~ 6
		
		//Math.m  = new Math();  오류 발생
		//정적 필드이므로 객체 생성 x
		
		int num = (int)(Math.random()*6) +1; 		//1 ~ 6
		//double 이므로 (int) 1~6으로 변환한 코드
		//5.99999로 나옴 거기에 (int)붙으므로 소수점 이하 수 버리므로 +1을 해줌
		//계산된 난수값은 num에 저장
		System.out.println("num"+num);
		
		if(num == 1) {
			System.out.println("1번");
		} else if (num == 2) {
			System.out.println("2번");
		} else if (num == 3) {
			System.out.println("3번");
		} else if (num == 4) {
			System.out.println("4번");
		}  else if (num == 5) {
			System.out.println("5번");
		} else {
			System.out.println("6번");
		}
		
		
		// 1 ~ 45 사이의 난수 발생sw

		int r = (int)(Math.random()*45) +1;
		System.out.println("난수:" + r);
		
		
		
		
		
		
		
		
	}

}
