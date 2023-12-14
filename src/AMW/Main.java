package AMW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("숫자를 입력하세요");
//        int A = scanner.nextInt();
//
//        if (A % 4 == 0) {
//            if (A % 100 != 0 && A % 400 == 0) {
//                System.out.println(1);
//            } else {
//                System.out.println(0);
//            }
//
//        }else{
//            System.out.println(0);
//        }

        for (int i = 1; i < 4000; i++) {
            if (i % 4 == 0 && i % 100 != 0 && i%400 == 0) {
                System.out.println(i);
            }
        }
    }
}
