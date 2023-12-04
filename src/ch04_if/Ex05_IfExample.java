package ch04_if;

import java.util.Scanner;

public class Ex05_IfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scanner.nextInt();
		
		
		if(num == 0) {
			System.out.println("0 입니다");
		}else if(num > 0) {
			System.out.println("정수 입니다");
		}else {
			System.out.println("음수 입니다");
		}
	}

}
