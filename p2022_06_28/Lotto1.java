package p2022_06_28;



import java.util.Arrays;

class Lotto1 {

	public static void main(String[] args) {

		int num[] = new int[6];
		//다중 for문 :이전 지금 값 비교하기 위해서
        //           0번 방부터 시작이므로  
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1;	// 1 ~ 45
//(중복 발생 가정)			num[0]=5, num[1]=5,
			
               	//중복 제거 for문		
				for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {		
					i--;
					break; //안쪽 for문만 빠져나옴
				} // if end

			} // for end
		} // for end

		
		//<정렬하는 법 2가지>
		//<1. 정렬 알고리즘>
		// 오름차순 정렬 : 버블정렬 알고리즘(자신의 옆자리에 있는 것과 비교)
		int temp = 0;
		for (int i = 0; i < num.length; i++){
			for (int j = i+1; j < num.length; j++) {
				if(num[i] > num[j]){
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}

//      <2.Arrays클래스>
		Arrays.sort(num); // 오름차순 정렬

		for (int k : num) {
			System.out.print(k + "\t");
		}
	}
}

/*
 * 난수 발생 공식 난수 =(정수화) ((상한값-하한값+1)* Math.random()) + 하한값
 * 
 */