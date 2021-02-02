package day0202;

import java.io.PrintStream;

/*
1. 상속(재사용성)
2. 캡슐화(은닉화) : private(직접할당, 간접할당) >> getter, setter
3. 다형성 : 하나의 타입으로 여러개의 객체 주소를 가지는것


>> method overloading
1. 성능향상(X) 관련없음
2. 개발자의 편리성을 위해 제공

문법) 함수의 이름은 같고 parameter[개수]와 [타입]
1. 함수의 이름은 같아야한다.
2. parameter 개수 또는 타입은 달라야한다.
3. return 타입은 관련없음
4.

 */
class Human2{
    String name;
    int age;
}
class Human{
    String name;
    int age;
}
class OverTest{
    int add(int i){
        return 100+i;
    }
    int add(int i, int j){
        return (i+j);
    }
    String add(String s){
        return "hello" + s;
    }
    String add(String s, int i){
        return null;
    }
    String add(int s, String i){
        return null;
    }
    void add (Human2 human){
        human.name="홍길동";
        human.age = 100;
        System.out.println("나이 : " + human.name + "이름 : " + human.age);
    }

}

public class Ex14_Method_Overloading {
    public static void main(String[] args){
        OverTest ot = new OverTest();
        ot.add(100);
        Human2 h2 = new Human2();
        ot.add(h2);
    }
}
