package ch06_for;

import java.util.Scanner;

public class Ex05_ForEx {
    public static void main(String[] args) {
        //입력 예
        // 두개의 정수를 입력받아서 시작값부터 끝값까지의 합계 출력
        // 시작값 110
        // 끝값 555
        //출력예
        // 110부터 555까지의 합은 000

        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자");
        int num1 = scanner.nextInt();
        System.out.print("두번째 숫자");
        int num2 = scanner.nextInt();

        int sum = 0;

        for(int i = num1; i <= num2; i++){
        sum = sum + i;
        }
        System.out.println(num1 + "부터 " + num2 + "까지 합은 " + sum + " 입니다.");

    }
}
