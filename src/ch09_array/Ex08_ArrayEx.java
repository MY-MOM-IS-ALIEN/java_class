package ch09_array;

import java.util.Scanner;

public class Ex08_ArrayEx {
    public static void main(String[] args) {
        /**
         * 스캐너로 입력받은 숫자의 크기를 갖는 배열을 만들어 봅시다
         * 5를 입력하면
         * 크기가 5인 배열이 만들어져야함
         */
        Scanner scanner = new Scanner(System.in);
        int[] box = null;
        System.out.print("배열 크기 입력 : ");
        int num = scanner.nextInt();
        box = new int[num];

        for (int i = 0; i < box.length; i++) {
        }
        System.out.println("배열 크기는 : " + box.length);


    }
}
