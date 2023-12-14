package ch11_array;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ListBasic {
    public static void main(String[] args) {
        //정수를 담는 intList 선언
        List<Integer> intList = new ArrayList<>();
        // 10이라는 데이터를 추가하고
        System.out.println(intList.add(10));
        System.out.println("intList.size() = " + intList.size());
        intList.add(1000);
        // 1번 인덱스에 999를 추가
        intList.add(1, 999);
        System.out.println("intList.size() = " + intList.size());
        // 0번 인덱스에 담긴 데이터 출력
        System.out.println("intList = " + intList.get(0));
        System.out.println("intList = " + intList.get(1));
        System.out.println("intList = " + intList.get(2));
        // remove()
//        intList.remove(1);
//        System.out.println("intList = " + intList.get(0));
//        System.out.println("intList = " + intList.get(1));
//        System.out.println("intList = " + intList.get(2));
        //String을 담는 strList
        List<String> strList = new ArrayList<>();
        strList.add("안녕");
        strList.add(1,"hello");
        System.out.println("strList = " + strList.get(0));
        System.out.println("strList = " + strList.get(1));
        String str1 = strList.get(1);
        System.out.println("str1 = " + str1);

        for(int i = 0; i < intList.size(); i++){
            System.out.println(intList.get(i));
        }
        for(int i = 0; i < strList.size(); i++){
            System.out.println(strList.get(i));
        }

        for (String bb: strList){
            System.out.println("bb = " + bb);

            strList.forEach(aa -> {
                System.out.println("aa = " + aa);
            });
        }

    }
}
