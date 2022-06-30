package p2022_06_29;

//p.220 ~ 221
//메소드 예제 2)메소드의 매개변수  참조형(배열) :***주소값으로 전달 :call by reference
//2개의 클래스()


class Computer {
	//메소드 1):new 연산자 선언x:아직 heap에 주소값 부여x → 메인 메소드에서  new선언 
	//      주소값 전달에 의한 메소드 호출 (Call by Reference방식)
	//      *매개변수 : int형 1차원 배열  (참조형) → int형 1차원 배열 형식1) 주소값 전달 받음
	int sum1(int [] values) {
		int sum =0; //지역변수 : 자동 초기화x: +연산 영향x:0으로 초기화
		//방 갯수만큼 루프           
		for(int i=0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}


//메소드2) (...) vargus:여러 값을 받을 수 있음 (단, int형으로 받은 값은  int형으로 값 전달)
//	                 : *전달된 값은 배열로 받음 (위  sum1과 비슷한 역할)
//                   : 자주 사용x
//      매개변수 :기본 자료형
int sum2(int ... values) {
	int sum = 0;
	for (int i=0; i<values.length; i++){
		sum += values[i]; 
	}
	return sum;
	}
}






//메인 메소드
public class ComputerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer com = new Computer();
		
		//메소드1) *매개변수 : int형 1차원 배열 (참조형) → int형 1차원 배열 형식1) 주소값 전달 받음
		//1차원 배열 형식1):heap에 4byte짜리 3개의 방 생성하라
		int[] values = {1, 2 ,3 };
		int result1 = com.sum1(values);             //sum1() 메소드 주소값 호출 :call by reference
		System.out.println("result1:" + result1);   //:예제는 값이 적지만 매개변수 양이 많아지면 훨씬 효율적인 방식임

		//메소드1) 1차원 배열 형식2)로 주소값 전달 받음
		//1차원 배열 형식2):heap에 4byte짜리 5개의 방 생성하라
		//재사용 x
		int result2 =com.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2:" +result2);
		
		
		//메소드2)(...) vargus:여러 값을 받을 수 있음 (단, int형으로 받은 값은  int형으로 값 전달)
        //                  : *전달된 값은 배열로 받음 (위  sum1과 비슷한 역할)
		//                  :자주 사용 x
		int result3 = com.sum2(1,2,3);
		System.out.println("result3:" +result3);
		
		
		int result4 = com.sum2(1,2,3,4,5);
		System.out.println("result4:" +result4);
		
		
		
		
		
	}

}
