package ch09_array;

import java.util.Scanner;

public class Ex06_ArrayEx {
    public static void main(String[] args) {
        /**
         * 크기가 5인 정수형 배열을 선언하고
         * 스캐너로 배열에 값을 저장한 뒤
         * 입력된 값중에서 가장 큰 값을 출력
         */
        Scanner scanner = new Scanner(System.in);
        int[] box = null;
        box = new int[5];
        int max = 0;

        for (int i = 0; i < box.length; i++) {
            System.out.println(i + "번째" + "숫자를 입력하세요");
            int num = scanner.nextInt();
            box[i] = num;

            if (max < box[i])
            {
                max = box[i];
            }
        }
        System.out.println("최댓값은" + max);
    }
}