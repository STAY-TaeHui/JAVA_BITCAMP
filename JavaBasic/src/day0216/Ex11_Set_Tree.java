package day0216;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_Set_Tree {
    public static void main(String[] args){
        //Set 인터페이스 : 순서 X 중복 X

        //TreeSet : 순서 X 중복 X >> 정렬 O
        //데이터 검색 / 정렬에 많이 쓰임임

        //1. 이진트리 구조.
        //2. 데이터가 저장될때 정렬됨
        //3. 단, 검색과 정렬에 유리하지만, HashSet보다 추가,삭제 시간이 더 걸린다.
        Set<Integer> lotto = new TreeSet<Integer>();
        while(lotto.size()<6)
        lotto.add((int)(Math.random()*45+1));
        System.out.println(lotto);
    }}
