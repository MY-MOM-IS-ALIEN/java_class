package Ch10_class.ex7;

import java.util.Scanner;

public class Calculator {


    //덧셈
    public void sum(int param1, int param2) {
        System.out.println(param1 + param2);
    }
    //뺄셈
    public void sub(int param1, int param2) {
        System.out.println(param1 - param2);
    }
    //곱셈
    public int mul(int param1, int param2){
        int result = param1 * param2;
        return result;
    }
    //나눗셈
    public int div(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자 1");
        int num1 = scanner.nextInt();
        System.out.println("숫자 2");
        int num2 = scanner.nextInt();
        int result1 = num1 / num2;

        return result1;


    }







}
