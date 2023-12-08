package ch09_array;

public class Ex07_ArrayEx {
    public static void main(String[] args) {
        int[] num = {3, 1, 2, 5, 4};

        for (int i = 0; i < num.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < num.length; j++) {
                if (num[j] < num[mini]) {
                    mini = j;
                }
            }

            int temp = num[mini];
            num[mini] = num[i];
            num[i] = temp;
        }

        for (int i = 0; i < num.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(num[i]);
        }
    }
}