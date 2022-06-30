package p2022_06_28;

//p.202
//어떤 값으로 초기화 되는지 확인하는 예제)
class FieldIntValue {
	//필드 (Field)
	//*배열과 같은 값으로 초기화 됨
	
	//<기본 자료형>
	//정수형: 0으로 초기화    *int
	byte byteField;
	short shortField;
	int intField;
	long longField;
	

	//실수형 : 0.0으로 초기화    *double
	float floatField;
	double doubleField;
	
	//문자형,논리형 : x,false로 초기화     *boolean
	char charField;
	boolean booleanField;
	
	//배열,필드 :null로 초기화 :참조할 주소가 없다
	int[] arrField;
	String referenceField;
	
	
}


//메인 메소드
public class FieldEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FieldIntValue f = new FieldIntValue();
		
		System.out.println("byteField:" + f.byteField);
		System.out.println("shortField:" + f.shortField);
		System.out.println("intField:" + f.intField);
		System.out.println("longField:" + f.longField);
		
		
		System.out.println("floatField:" + f.floatField);
		System.out.println("doubleField:" + f.doubleField);
		
		System.out.println("charField:" + f.charField);
		System.out.println("booleanField:" + f.booleanField);
		
		System.out.println("arrField:" + f.arrField);
		System.out.println("referenceField:" + f.referenceField);
	
	}

}
