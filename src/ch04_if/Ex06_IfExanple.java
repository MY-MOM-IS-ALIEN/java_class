package ch04_if;

import java.util.Scanner;

public class Ex06_IfExanple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 정수를 입력받아서 3의배수인지 5의배수인지 3과5의 공배수인지 
		// 아무것도 아닌지 출력
		
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("숫자를 입력하세요");
	      int num = scanner.nextInt();
	      
	      if(num%3 == 0 && num%5 == 0) {
	    	  System.out.println("공배수입니다");
	      }else{
	    	  if(num%3 == 0) {
	    		  System.out.println("3의 배수입니다");
	    	  }else if(num%5 == 0) {
	    		  System.out.println("5의 배수입니다");
	    	  }else {
	    		  System.out.println("아무것도 아닙니다");
	    	  }
	      }
	    	
	    	  
	}

      
      
    		  
}
