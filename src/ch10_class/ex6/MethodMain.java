package ch10_class.ex6;

public class MethodMain {
    public static void main(String[] args) {
        MethodEx methodEx = new MethodEx();
        //method1 호출
        methodEx.method1();

        //method2 호출
        methodEx.method2("안녕하세요");
        String str1 = "오늘은 화요일";
        methodEx.method2(str1);

        //method3 호출
        String result = methodEx.method3();
        System.out.println("result = " + result);

        //method4
        int number1 = methodEx.method4();
        System.out.println("number1 = " + number1);

        //method5
        String result2 = methodEx.method5("안녕", 1000);
        System.out.println("result2 = " + result2);

        //method6
        int result3 = methodEx.method6(10, 20);
        System.out.println("result3 = " + result3);
    }
}
