package p2022_06_23;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//        <while문>
//		  while(조건식){
//		       반복 실행할 문장;
//		    }

		//while문을 이용해서 '사랑해요'메세지를 10번 출력하는 프로그램을 작성하세요?
		
		
		int i = 1; 					//***초기값 꼭 정의
		while(i<=10) { 				//조건식   i<11
			System.out.println(i+"사랑해요.");
			i++;                //증감식 : ++i, i=i+1 , i+=1   *** 증감식 정의 하지 않으면 무한루프에 빠지므로 주의
		}
		
		//for문은 명시적으로 초기값 조건식 정의 가능 
		//while문은 자리가 없더라도 꼭 정의 할 것
		//참이 아닌 경우, 아예 실행x   (do -while문은 1번이라도 실행이 됨)
		//while문은 {} 없으면x >> 1줄로 끝나지 않기 때문
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
