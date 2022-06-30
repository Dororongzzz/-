package p2022_06_22;

public class ImplicitConversion {

    public static void main( String[] args ) {
    	
	// char 변수 선언 및 초기화.
	char charValue = 'a';
	System.out.println( "charValue = " + charValue );
 
	// int 변수 선언 및 'a'의 값으로 초기화.
//	int intValueOfChar = charValue; // 'a'문자의 10진수 아스키코드 값은 97
	int intValueOfChar = 'a'; 
	System.out.println( "intValueOfChar = " + intValueOfChar );
		//왜 97이 나올까?
		//<아스키코드> 키보드 내부적으로 컴퓨터가 이해하는 기계어를 위해서 약속된 표 c언어에서 자주 사용됨
		//10진수:int형 변수
		//(기억)a=97  A=65
	    	
	// int 변수 선언 및 초기화.
	int intValue = 30;
	System.out.println( "intValue = " + intValue );

	// float 변수 선언 및 intValue 변수 값 할당
	float floatValue = intValue;  //자동 형변환
	System.out.println( "floatValue = " + floatValue );
	
	
	// double 변수 선언및 floatValue,intValue 변수 값 할당
	double doubleValue1 = floatValue; //자동 형변환
	double doubleValue2 = intValue;
	System.out.println("doubleValue1 ="+doubleValue1);
	System.out.println("doubleValue2 ="+doubleValue2);

    }//main end
}//class end



