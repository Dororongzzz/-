package p2022_06_29;

//메소드 영역과 heap영역의 차이를 보여주는 예제)

//메인 메소드o
public class Shared {
    public static void main( String[] args ) {
    
    	//정적 필드 가진 메소드)
    	//number:메소드 영역에 저장되어 있음 (heap x)
        StaticCount sc1 = new StaticCount();
        System.out.println("sc1.number = " + sc1.number);   //3
        
        //필드명 뒤에 증감식 붙음 3 + 1 = 4
        sc1.number++;
        System.out.println("sc1.number = " + sc1.number);  //4
        
        //새로운 객체 선언
        //heap이 아닌 메소드 영역에 저장됐으므로 새로 선언했더라도 가장 마지막에 저장된 값을 종료될 때까지 유지  
        //가장 마지막에 저장된 4가 출력
        StaticCount sc2 = new StaticCount();
        System.out.println("sc2.number = " + sc2.number);  //4
        
        //필드명 뒤에 증감식 붙음 4 + 1 = 5
        sc2.number++;
        System.out.println("sc2.number = " + sc2.number);  //5
        
        //정적 메소드 호출2) "."으로 접근
        //필드명 뒤에 증감식 붙음 5 + 1 = 6
        StaticCount.number++;
        System.out.println(StaticCount.number);			//6
    }
}
            
        
        
        