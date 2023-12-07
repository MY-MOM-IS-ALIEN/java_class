package ch08_string;

import java.util.Scanner;

public class Ex02_StringEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 '종료'를 입력하세요");
        boolean run = true;
        String str1 = new String("안녕하세요");
        String str2 = new String("ㅎㅎㅎ");
        String str3 = new String("곧 점심시간");
        String str4 = new String("종료");

        while (run) {
            String ans1 = scanner.next();
            if (ans1.equals(str1)) ;
            {
                System.out.println(ans1);
                if (ans1.equals(str4)) {
                    run = false;
                }
            }
        }


    }
}
