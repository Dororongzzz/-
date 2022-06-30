//강제형 변환을 하지 않은 경우

package p2022_06_22;
public class ExplicitConversion {

    public static void main( String[] args ) {
    	
	// int형 변수를 97로 초기화
	int intValue =97;
	
	// char형 변수에 int형 변수 값을 할당
	char charValue =(char)intValue;  //강제 형변환
    //큰 바이트를 작은 바이트로 자동 변환 해주지 않는 경우
	//(char)를 붙여주면 해결
	System.out.println( "charValue = " + charValue );

	
	// float형 변수 초기화.
	float floatValue = 3.14F;
	
	
	// int형 변수에 float형 변수 값을 할당
	int intValue2 = (int)floatValue;  //강제 형변환
	//(int)를 붙여주면 해결
	//소수점 이하 버림  결과물  3출력
	//형변환 과정에서 데이터 손실이 일어남
	System.out.println( "intValue2 = " + intValue2 );

	
	// float형 변수 초기화
	double doubleValue = 21.12345;
	//8바이트
	
	
	// float형 변수에 double형 변수 값을 할당
	float floatValue2 = (float)doubleValue; //강제 형변환
	//float은 정확성을 보장하지 않는 자료형
	System.out.println( "floatValue3 = " + floatValue2 );
    }
}