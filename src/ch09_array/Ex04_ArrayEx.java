package ch09_array;

import java.util.Scanner;

public class Ex04_ArrayEx {
    public static void main(String[] args) {
        int num[] = {5, 2, 1, 3, 4, 7, 6, 9, 10, 8};
        /**
         * 위와 같은 배열이 있을때 1~10사이를 입력하면
         * 그 숫자가 몇번 인덱스에 있는지 출력
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("찾을 숫자");
        int ans = scanner.nextInt();

        if (ans > num.length) {
            System.out.println("해당 숫자는 포함 되어있지 않습니다.");
        } else {
            for (int i = 0; i < num.length; i++) {
                if (ans == num[i]) {
                    System.out.println(ans + "는" + i + "번 인덱스에 있습니다");
                }

            }

        }
    }
}