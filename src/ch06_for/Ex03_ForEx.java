package ch06_for;

public class Ex03_ForEx {
    public static void main(String[] args) {
        //1부터 10까지 합계를 출력
        //1부터 더해지는 과정까지 출력하기

        int sum = 0;

        for(int i = 1; i <= 10; i++){
            if(i < 10){
                System.out.print(i + "+");
            }else{
                System.out.print(i + "=");
            }
            sum = sum + i;

        }
        System.out.print(sum);




    }
}
