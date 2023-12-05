package ch06_for;

public class Ex06_ForEx {
    public static void main(String[] args) {

        int sum = 0;

        for(int i = 1; i <= 100; i++){
            if((i%3) == 0){
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.println("합계 = " + sum);


    }
}
