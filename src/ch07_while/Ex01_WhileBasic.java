package ch07_while;

public class Ex01_WhileBasic {
    public static void main(String[] args) {

        int i = 1;

        while (i <= 3) {
            System.out.println("i = " + i);
            i++;
        }

        int j = 10;

        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 3);
        System.out.println("do while 종료 후 j = " + j);

        // 무한반복
        int k = 1;
        while (true) {
            System.out.println("무한반복~" + k);
            k++;
            if (k == 10) {
                break;
            }
        }

        int l = 1;
        boolean run = true;
        while (run){
            System.out.println("l = " + l);
            l++;
            if(l == 10){
                run = false;
            }
        }

    }
}
