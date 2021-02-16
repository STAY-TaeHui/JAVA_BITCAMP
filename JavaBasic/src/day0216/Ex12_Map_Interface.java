package day0216;

import java.util.*;

/*
Map Interface
Map (key, value)
    key : 중복 X
    value : 중복 O
    Generic 지원 -> key, value 에도 Type 을 강제할 수 있다.

Map 인터페이스 구현
구버전 - HashTable - 동기화보장 >> LOCk
신버전 - HashMap - 동기화강제 X >> 성능이 좋다.
 */
public class Ex12_Map_Interface {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put("Tiger", "1004");
        map.put("scott", "1004");
        map.put("superman","1004");
        //사용자 ID, PWD관리
        System.out.println(map.containsKey("tiger"));//대소문자 구분
        System.out.println(map.containsKey("scott"));
        System.out.println(map.containsValue("1004"));//하나라도 있으면 true.

        //point
        //key 를 제공하면 value 를 알 수 있다.
        System.out.println(map.get("Tiger"));//없으면 null
        System.out.println(map);
        System.out.println(map.size());

        Object value = map.remove("superman");
        System.out.println("value : " + value);
        System.out.println(map);

        Set set = map.keySet(); //return Type : Set.   키들의 집합을 뽑는다. >> 데이터 순서 X, 중복 X >> 이게 Set
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        Collection clist = map.values();// return Type : Collection.

        //Map 하고 List 혼합 하는게 좋은 코드드

    }}
