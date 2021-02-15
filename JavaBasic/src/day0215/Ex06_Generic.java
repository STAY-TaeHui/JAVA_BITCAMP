package day0215;

import java.util.ArrayList;

/*
Collection 클래스 >> 데이터 저장 공간 타입 >> Object
1. Object 타입. 객체를 생성하면 타입변환을 했어야된느데 타입 강제를 하겠다.
2. 타입 안정성( 타입 강제성)
3. 강제 형변환 (casting)

 */
//클래스 설계할때도 제너릭 적용 가능
class MyGen<T>{ //Type parameter
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return this.obj;
    }

}
class Person extends Object{
    int age = 100;
}
public class Ex06_Generic {
    public static void main(String[] args){
        MyGen<String> mygen = new MyGen<String>(); //String으로 강제화
        mygen.add("문자열");
        String str = mygen.get();
        System.out.println(str);

        ArrayList list = new ArrayList();
        //내부적인 저장 곤간틔 타입 : Object
        list.add(10);
        list.add(new Person());

        for(Object obj : list){
            //방안에 있는 녀석들의 타입정보를 알아야하는데
            if(obj instanceof Person){
                Person p= (Person)obj;
                System.out.println(p.age);
            }
        }

        ArrayList<Person> plist = new ArrayList<Person>();
        plist.add(new Person());
    }
}
