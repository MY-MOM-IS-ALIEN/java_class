package ch02_operator;

public class Ex03_AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 10;
		int num2 = 7;
		
		// sysout 컨트롤+스페이스 하면 시스템아웃 바로 나옴
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		
		num1 += num2;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		// num1 = 17 , num2 = 7
		num1 += num2;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		// num1 = 24 , num2 = 7
		num1 -= num2;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		// num1 = 17 , num2 = 7
		num1 *= num2;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		// num1 = 119 , num2 = 7
		num1 /= num2;
		System.out.println("num1 : " + num1 + " num2 : " + num2);
		// num1 = 17 , num2 = 7
		
	}

}
