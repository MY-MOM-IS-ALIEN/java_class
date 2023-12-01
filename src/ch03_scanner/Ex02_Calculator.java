package ch03_scanner;

import java.util.Scanner;

public class Ex02_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 각 2개를 각각 스캐너로 num1 ,num2에 입력받아서 입력받은 수의 합을 출력하세요
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요: ");		
//		int num1 = scanner.nextInt();
//		System.out.print("숫자를 입력하세요: ");
//		int num2 = scanner.nextInt();
//		System.out.print("값은: ");
//		System.out.println(num1+num2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력하세요");
		String height = sc.nextLine();
		System.out.print("입력하세요");
	    String kg = sc.nextLine();
		System.out.println(height+kg);
				

	}

}
