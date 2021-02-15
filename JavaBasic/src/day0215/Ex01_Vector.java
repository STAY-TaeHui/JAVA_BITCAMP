package day0215;

import java.util.Vector;

/*
Collection FrameWork

[다수의 데이터를]다루는 [표준화된 인터페이스]를 구현하고 있는 클래스 집합]

Collection 인터페이스
    -> List 인터페이스가 상속함. -> ArrayList가 구현함. : [ 순서가 있는 데이터의 집합 / 데이터의 중복 허용 ] ex) 대기자 명단
    -> Set 인퍼테이스가 상속 -> HashSet, TreeSet이 구현함. : [ 순서가 없는 데이터의 집합 / 데이터의 중복 허용안함 ]


Map 인터페이스 (Key , value) -> HashMap 구현 : [ 키와 값의 쌍으로 이루어진 데이터의 집합 / 순서 X 중복 X ]

1. List(줄을 서시오~ : 번호표) : 순서를 보장 , 중복 허용!!
    예) [홍길동][홍길동][홍길동]
    * 구현하고 있는 클래스 *
    1.1 Vector(구버전)  -> 동기화 보장(멀티 스레드 ) -> Lock -> 성능 떨어짐 -> but, 안전성 보장
    1.2 ArrayList(신버전) -> 동기화 미보장(멀티 스레드) -> Lock없음 : 필요에 따라 쓸수있긴 함 -> 성능이 우선시 -> 안전성 떨어짐.

< Collection >
List >> Vector , ArrayList
1. 배열의 크기를 동적으로 확장/축소 가능 <<실제로는 [배열의 재할당]>> -> 내부에서 자동으로 해줌
2. 순서를 유지( 내부적으로 해주고 배열을 사용함) >> 중복값 허용
3. 데이터 저장 공간 : 결국 Array임

 */
public class Ex01_Vector {
    public static void main(String[] args){
        Vector v = new Vector(5);
        System.out.println("초기 default 용량 : "+v.capacity()); //배열의 전체 크기 - default는 10
        System.out.println("SIZE : " + v.size()); // 데이터가 들어가있는 크기
        v.add("AA");
        v.add("BB");
        v.add("AA");
        System.out.println(v.toString()); //>> 재정의
        System.out.println("SIZE : " + v.size()); // 데이터가 들어가있는 크기 >> "2"
        for(int i=0; i<v.size(); i++){
            System.out.println(v.get(i));
        }
        for(Object o : v){
            System.out.println(o);
        }

        v.trimToSize(); // 빈공간을 없앤다. -> size만큼의 배열을 하나 더 만들어 복사시킴
        v.setSize(12);
        System.out.println("초기 default 용량 : "+v.capacity()); //배열의 전체 크기 - default는 10
        System.out.println("SIZE : " + v.size()); // 데이터가 들어가있는 크기

        v.clear(); // 데이터만 지워지고 메모리는 그대로 남음.

        Vector v3 = new Vector();
        System.out.println(v3.capacity());
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        v3.add("A");
        System.out.println(v3.capacity()); //default는 10개였지만 11개로 default이상이 되면 한번에 2배로 늘려버림.
        System.out.println(v3.size());


    }
}
