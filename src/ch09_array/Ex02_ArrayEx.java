package ch09_array;

public class Ex02_ArrayEx {
    public static void main(String[] args) {
        int[] numbers1 = {10, 20, 30, 40, 50};
        int sum = 0;
        int avg = 0;

        //for문을 이용하여 배열 데이터 출력

        for(int i = 0; i < numbers1.length; i++){
            System.out.println("numbers1 = " + numbers1[i]);
            sum = sum + numbers1[i];
            avg = sum/numbers1.length;
        }
            System.out.println("sum = " + sum);
            System.out.println("avg = " + avg);
    }
}
