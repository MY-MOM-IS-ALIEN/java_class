package ch07_while;

public class Ex02_whileEx {
    public static void main(String[] args) {
        /**
         * while문으로 1~10까지 합계 출력
         */

        int i = 1;
        int sum = 0;

        while (i <= 10) {
//            System.out.print(i + " + ");
            System.out.print(i);
            sum = sum + i;
            if (i < 10) {
                System.out.print("+");
            } else {
                System.out.print(" = ");
            }
            i++;
        }
        System.out.print(sum);
    }
}
