package day0215;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex02_ArrayList {
    public static void main(String[] args) {
        //List 인터페이스 구현 : 순서, 중복허용 데이터 집합 다룰때 ㅅ쓰는 클래스

        ArrayList arrayList = new ArrayList();

        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        System.out.println(arrayList.toString());

        //순차적인 데이터 다루기의 힘든점....
        arrayList.add(0, 111); //오버로딩 >> 나머지 값들 한칸씩 미룸
        System.out.println(arrayList);
        arrayList.add(400);

//        arrayList.remove(100);//.IndexOutOfBoundsException
        //ArrayList 함수 공부
        System.out.println(arrayList.contains(200)); //true
        System.out.println(arrayList.contains(2000)); //false

        arrayList.clear(); // 데이터만 삭제. 메모리는 그대로
        System.out.println(arrayList.size()); // >> size == 0;
        System.out.println(arrayList.isEmpty()); //true >> 데이터가 없는지 확인

        arrayList.add(101);
        arrayList.add(102);
        arrayList.add(103);
        System.out.println(arrayList.isEmpty());// false
        System.out.println(arrayList);
        System.out.println("삭제 전 : " +arrayList.size()); // size==3;

        Object vlaue = arrayList.remove(0); //0번째 방 값 삭제 후 그 값을 리턴.
        System.out.println("value : " + vlaue);
        System.out.println("삭제 후 : "+ arrayList.size());
        System.out.println(arrayList);

        //@@@@ POINT @@@@
        //다형성!!!
        List li = new ArrayList();
        li.add("가");
        li.add("나");
        li.add("다");
        li.add("라");
        System.out.println(li);

        List li2 = li.subList(0,2); //sublist를 통해 0부터 2까지의 데이터를 뽑아 데이터 집합을 생서
        System.out.println(li2);

        ArrayList  alist = new ArrayList();
        alist.add(50);
        alist.add(1);
        alist.add(7);
        alist.add(40);
        alist.add(46);
        alist.add(3);
        alist.add(15);
        System.out.println(alist);

        Collections.sort(alist); //List 타입만 가능
        System.out.println(alist);

        Collections.reverse(alist);// 뒤집기. 역시 List타입만 가능
        System.out.println(alist);



    }
}
