package AMW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int A = scanner.nextInt();

        if(A%4 == 0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }



    }
}
