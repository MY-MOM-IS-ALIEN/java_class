package ch10_class.ex7;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            System.out.println("--------------------------------");
            System.out.println("1.덧셈 | 2.뺄셈 | 3.곱셈 | 4.나눗셈");
            System.out.println("--------------------------------");
            int ans = scanner.nextInt();
            if (ans == 4) {
                int result1 = calculator.div();
                System.out.println(result1);
            } else {
                System.out.println("숫자 1");
                int num1 = scanner.nextInt();
                System.out.println("숫자 2");
                int num2 = scanner.nextInt();
                if (ans == 1) {
                    calculator.sum(num1, num2);
                } else if (ans == 2) {
                    calculator.sub(num1, num2);
                } else if (ans == 3) {
                    int result = calculator.mul(num1, num2);
                    System.out.println(result);
                }
            }
        }
    }
}
