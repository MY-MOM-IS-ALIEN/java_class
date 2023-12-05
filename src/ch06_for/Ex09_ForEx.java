package ch06_for;

public class Ex09_ForEx {
    public static void main(String[] args) {
        /** 4x + 5y = 60을 만족하는 x,y값을 출력
         * x, y는 1이상 10이하인 정수
         *
         * 출력(정답)
         * 5,8 10,4
         */

        // 4x 5y에 1,1 / 1,2 / 1,3 / 1,4 이런식으로 순서대로
        // 넣어보면서 답을 찾음
        int x;
        int y;

        for (x = 1; x <= 10; x++) {
            for (y = 1; y <= 10; y++)
                if ((4 * x) + (5 * y) == 60) {
                    System.out.println("x: " + x + " "+ "y: " + y);
                }
        }
    }
}