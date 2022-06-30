package p2022_06_24;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열:동일한 자료형의 데이터를 저장하기 위한 정적인 자료 구조
		//변수 → 배열 → 자료구조(List)
		
		//1차원 형식1): 배열에 저장될 값이 정해져 있지 않은 경우에 주로 사용한다.
		int		[] 	score = 	new 	int[3];
	//  자료형       1차원	배열 변수		연산자       자료형[배열의 크기]
	//  =4byte짜리 기억공간을 heap메모리 상에 3개 연속 생성하라.
		
		
		//int형 배열은 자동으로 0으로 초기화 된다.
		System.out.println(score[0]);		//0
		System.out.println(score[1]);		//0
		System.out.println(score[2]);		//0

		//값 할당
		score[0] = 80; 				//0번 방에 80점을 할당
		score[1] = 90; 				//1번 방에 90점을 할당
		score[2] = 100; 			//2번 방에 100점을 할당		
		System.out.println(score[0]);		//80
		System.out.println(score[1]);		//90
		System.out.println(score[2]);		//100

	
		
		//double형 배열은 자동으로 0.0으로 초기화 된다.
		double[] d = new double[3];
		System.out.println(d[0]);		//0.0
		System.out.println(d[1]);		//0.0
		System.out.println(d[2]);		//0.0
		
		
		//char형 배열은 자동으로 초기화x
		char[] c = new char[3];
		System.out.println(c[0]);
		System.out.println(c[1]);
		System.out.println(c[2]);
	
		//boolean형 배열은 자동으로 false로 초기화 된다.
		boolean[] b = new boolean[3];
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[2]);
	
	// ----------------------------------기본 자료형 배열
		
		
		//참조형 
		 String[] str =new String[3];
		 System.out.println(str[0]);	//null : 값이 없다
		 System.out.println(str[1]);	//null
		 System.out.println(str[2]);	//null

		 
		 str[0] = "자바";
		 str[1] = "오라클";
		 str[2] = "스프링";
		 System.out.println(str[0]);  //자바
		 System.out.println(str[1]);  //오라클
		 System.out.println(str[2]);  //스프링
		 
		 
		 //1차원 형식2): 배열 선언과 동시에 초기화를 할 때 주로 사용
		 //			 (배열에 할당될 값이 정해져 있는 경우에 주로 사용)
		 int[] s1 = {80, 90, 100};
		 int[] s2 = new int[] {80, 90, 100};
		 System.out.println(s1[0]);		//80		
		 System.out.println(s1[1]);		//90		
		 System.out.println(s1[2]);		//100	
		 
		 
		 System.out.println("배열의  크기:" + s1.length);   //배열의 크기: 3 : 방이 몇 개냐?
		 												//s1.length:속성이기 때문에 괄호x
		 for(int i=0; i<s1.length; i++)  //배열의 방이 0부터 시작하기 때문에 i=0  
			 System.out.println(s1[i]+"\t");
		 System.out.println();
		 
		 
		 
		 //double형  형식2)
		 double [] dd = {3.14, 10.5, 42.195, 50}; //int형보다 double형이 크기 때문에 double형으로 바뀜
		 										  //반대 경우x
		 for(int i=0; i<dd.length; i++)
			 System.out.print(dd[i]+"\t");
		 System.out.println();
		 
		 
		 //char형 형식2)
		 char [] cc = {'j', 'a', 'v', 'a', '자', '바'};
		 for(int i=0; i<cc.length; i++)
			 System.out.print(cc[i]+"\t");
		 System.out.println();

		 
		 //boolean형 형식2)
		 boolean [] bb = {true, false, true};
		 for(int i=0; i<bb.length; i++)
			 System.out.print(bb[i]+"\t");
		 System.out.println();
		 
		 String[] str1 = {"자바", "오라클","스프링","파이썬","텐스플로우"};
		 String[] str2 = new String[] {"자바", "오라클","스프링","파이썬","텐스플로우"};
		 for(int i=0; i<str1.length; i++)
			 System.out.println(str1[i]+"\t");
			 
		 
		 
		 
		 	}

}
