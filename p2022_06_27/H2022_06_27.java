package p2022_06_27;

public class H2022_06_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arr04참고)
		
		
//	   *2차원 배열을 이용해서 5명 학생들의 국어,영어,수학        
//	        점수를 저장 했을때, 과목별 총점과 학생별 총점을 
//	        출력하는 프로그램을 작성하세요?
//	       (단, 과목명(국어,영어,수학), 학생번호를 출력 하세요) 
//
//	      네이버 클라우드 - 문서 - 배열 -  Arr04.java
//		
//		
	
	
	
		    int [][]score = { { 85,  60,  70},   
						      { 90,  95,  80},   
						      { 75,  80, 100},   
		                      { 80,  70,  95},   
						      {100,  65,  80}    
							};
		    int [] subject = new int[3]; 
		    int [] student = new int[5]; 
		       
		    
		    
		    int  r, c;  
			    
		   String[] str1 = {"국어","수학","과학"};
		   String[] str2= {"학생1", "학생2", "학생3","학생4","학생5"};
		   
		   
		   
		   
		    System.out.println("각 과목별 총점구하기 ");
		    for(c = 0; c < 3 ; c++){ 	
		      for(r = 0; r < 5 ; r++){ 	     
		        subject[c] += score[r][c];   
		      }
		      System.out.println(str1[c]+":"+subject[c]);
		      
		    }

		    System.out.println("학생별 총점구하기");
		    for(r = 0; r < 5 ; r++){       
		      for(c = 0; c < 3 ; c++){  
		        student[r] += score[r][c];  
		      }
		      System.out.println(str2[r]+":"+student[r]);
		    }
		    
		    
		

		  }//main() end
		}// class end        
		
		
		
		
		
		
		
		
