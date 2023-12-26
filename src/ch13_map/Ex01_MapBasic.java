package ch13_map;

import java.util.HashMap;
import java.util.Map;

public class Ex01_MapBasic {
    public static void main(String[] args) {
        //key타입은 정수 , value:String
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1,"안녕");
        map1.put(2,"hello");
        map1.put(3,"100");

        System.out.println(map1.get(1));
        String s1 = map1.get(2);
        System.out.println(s1);
        
        // 동일한 키에 다른 데이터를 넣는다면
        map1.put(1,"안녕하십니까");
        System.out.println("map1.get(1) = " + map1.get(1));

        for (Integer i : map1.keySet()){
            System.out.println(map1.get(i));
        }

        //key: string value: string
        Map<String , String>map2 = new HashMap<>();
        map2.put("가","안녕");
        map2.put("나","ㅎㅎㅎ");
        map2.put("다","ㅋㅋㅋ");

        System.out.println(map2.get("가"));

        for (String i : map2.keySet()){
            System.out.println(map2.get(i));
        }

        Map<Long,String> map3 = new HashMap<>();
        String ss1 = map3.put(1L,"Hi");
        System.out.println("ss1 = " + ss1);
        String ss2 = map3.put(2L,"hello");
        System.out.println("ss2 = " + ss2);
        String ss3 = map3.put(1L, "안녕");
        System.out.println("ss3 = " + ss3);
    }
}
