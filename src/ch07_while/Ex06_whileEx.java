package ch07_while;

import java.util.Scanner;

public class Ex06_whileEx {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하고 마지막에 0을 입력하세요.");
        boolean run = true;
        int count = 0;
        int sum = 0;
        int avg = 0;

        while (run) {
            int num = scanner.nextInt();
            sum = sum + num;
            if (num != 0) {
                count++;
            } else if (num == 0) {
                System.out.println("입력한 숫자는 " + count + "개 입니다.");
                avg = sum / count;
                System.out.println("평균은 " + avg + "입니다.");
                run = false;

            }
        }
    }

}
