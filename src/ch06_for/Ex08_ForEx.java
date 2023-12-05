package ch06_for;

public class Ex08_ForEx {
    public static void main(String[] args) {

        for (int i = 2; i <= 9; i++) {// 단 수
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {// 곱하는 수
                System.out.print(i + "x" + j + "=" + (i * j) + "  ");
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}
