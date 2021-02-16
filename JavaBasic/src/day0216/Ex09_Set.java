package day0216;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
Set 인터페이스를 구현하는 클래스
Set : 원안에 들어가세요~ (순서 X 중복 X : 순서가 없고 중복 안됨.)
 */
public class Ex09_Set {
    public static void main(String [] args){
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(1);
        hs.add(100);
        boolean bo2 = hs.add(55);
        System.out.println(bo2);

        bo2 = hs.add(1);
        System.out.println(bo2);
        System.out.println(hs);
        hs.add(200);
        System.out.println(hs.toString());
        hs.add(2);
        System.out.println(hs.toString());

        HashSet<String> hs2 = new HashSet<String>();
        hs2.add("b");
        hs2.add("A");
        hs2.add("F");
        hs2.add("c");
        hs2.add("z");
        hs2.add("A");
        hs2.add("A");
        hs2.add("A");
        System.out.println(hs2.toString());

        String[] obj = {"A", "A","C","D","D","F","A"};
        HashSet<String > hs3 = new HashSet<String>();
        for(int i=0; i<obj.length; i++){
            hs3.add(obj[i]);
        }
        System.out.println(hs3);

        HashSet<Integer> lotto = new HashSet<Integer>();
        while(lotto.size()<6){
            lotto.add((int)(Math.random()*45+1));
        }
        System.out.println(lotto);

        HashSet<String> set3 = new HashSet<String>();
        set3.add("AA");
        set3.add("DD");
        set3.add("ABC");
        set3.add("FF");
        System.out.println(set3);

       Iterator<String> st = set3.iterator();
       while(st.hasNext()){
           System.out.println(st.next()); //set은 배열은 아니다!! 하지만 순차적으로 데이터 출력은 가능
       }
    }
}
