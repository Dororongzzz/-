package p2022_06_29;

//2개의 클래스):정적필드 마지막 값 공유 확인 예제)
//정적필드 vs 인스턴스 필드: 저장공간, 공유영역 차이 확인

//클래스1)
class StaticTest{
  //*저장 위치 다름
  //정적필드 : 메소드 영역 저장
  static int a=10;
  //인스턴스 멤버변수(=필드) :heap영역 저장
  int b=20;
}



//클래스2)메인 메소드o
class  StaticTest01 {
  public static void main(String[] args){
	  
	//정적 필드 이므로 "."으로 접근
    System.out.println("StaticTest.a->" + StaticTest.a);   //초기값 설정됐던 10 출력
    
    //new연산자 사용 : b는 heap영역 저장
    
    
//	  a=10     //정적멤버변수
//	 (공유영역)
//
//s1             -------> 	b=20
//
//s2             ------->  	b=20 
//
//(Stack영역)                 (Heap영역)      
    
    StaticTest s1 = new StaticTest();
    StaticTest s2 = new StaticTest();
 
System.out.println("s1.a->" + s1.a + "\t  s2.a->" + s2.a);
System.out.println("s1.b->" + s1.b + "\t  s2.b->" + s2.b);


//a=100     //정적멤버변수
//(공유영역)
//
//s1             -------> 	b=20
//
//s2             ------->  	b=20 
//
//(Stack영역)                 (Heap영역)  
    s1.a=100; 
    System.out.print("s1.a->" + s1.a );
    //마지막 값 100출력
    System.out.println("\t  s2.a->" + s2.a+"  ");  
    //클래스 명 접근) 가장마지막 값 100출력
	System.out.println(StaticTest.a);

	
	
//a=100     //정적멤버변수
//(공유영역)
//
//s1             -------> 	b=200
//
//s2             ------->  	b=20 
//
//(Stack영역)                (Heap영역)  
    s1.b=200;
    System.out.print("s1.b->" + s1.b);                  //200
    //공유x :20 출력							
    System.out.println("\t  s2.b->" + s2.b);			//20
  }
}                              