package ch02_operator;

public class Ex05_IncreaseDecreaseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 증감연산자
		int num1 = 10 , num2 = 0, num3 = 0;
		
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3 );
		num2 = ++num1;
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3 );
		num2 = ++num1;
		num3 = num1++;
		// num1=12 num2=12
		// num1=13 num3=12
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3 );
		int result1 = num1++ + ++num2;
		System.out.println("num1: " + num1 + " num2: " + num2 + " num3: " + num3 );
	    System.out.println(result1);
        //result1 = 26?	    
	
	}

}
