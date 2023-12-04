package ch04_if;

import java.util.Scanner;

public class Ex07_IfExample {

	public static void main(String[] args) {
		// 성적 출력 예제 응용
		// 입력값 : 학년 , 점수
		// 처리
		// 1~3학년은 60점 이상이면 합격
		// 4학년은 70점이상이여야 합격

		Scanner scanner = new Scanner(System.in);
		System.out.println("학년을 입력하세요");
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		if (num1 == 4) {
			if (num2 >= 70) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		} else if (num1 == 1 || num1 == 2 || num1 == 3) {
			if (num2 >= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
			}
		}
	}
}
