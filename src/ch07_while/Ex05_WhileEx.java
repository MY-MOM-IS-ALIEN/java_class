package ch07_while;

import java.util.Scanner;

public class Ex05_WhileEx {
    public static void main(String[] args) {
        /**
         * random() 메서드를 이용해서 1~100사이의 숫자를 하나 만들고
         * 반복문안에서 해당 숫자를 맞출 때까지 숫자를 입력받도록 하고
         * 숫자를 맞추면 종료하고 몇 번만에 맞췄는지를 출력해줌
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int ran = (int) (Math.random() * 100 + 1);
        boolean run = true;
        int count = 0;

        while (run) {
            int num = scanner.nextInt();
            if (num < 0 || num > 100) {
                System.out.println("입력 범위 초과");
            } else {
                if (num > ran) {
                    System.out.println("작게 입력하세요");
                    count++;
                } else if (num < ran) {
                    System.out.println("크게 입력하세요");
                    count++;
                } else if (num == ran) {
                    count++;
                    System.out.println("정답 입니다 시도 횟수 " + count + "번");
                    run = false;
                }
            }
        }
    }
}