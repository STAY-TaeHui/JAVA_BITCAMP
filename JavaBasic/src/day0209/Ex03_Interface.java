package day0209;
/*
인터페이스 : 표쥰 ,약속, 규약 등을 만드는 규칙

추상클래스 :: 인터페이스의 공통점
1. 스스로 객체 생성 불가능 ( new 를 통한 객체생성 불가)
1.1 차이점 : 추상 클래스(완성 + 미완성), 인터페이스 ( 모든것이 미완성)

2. 사용
추상클래스 >> extends
인터페이스 구현해라 >> implements 사용

추상클래스 인터페이스의 특징
1. 다중상속이 가능

2. 추상클래스는 단일원속 원칙( 계층적 상속을 사용하셈)

3. 추상클래스는 (완성 + 미완성)

4. 인터페이스는 ( 상수를 제외한 나머지는 미완성(추상)자원

+++ 개발자 (초급) +++
1. 인터페이스를 [다형성]입장으로 보자. >> 얘는 무조건 부모모
2. 서로 연관성이 없는 클래스를 하나로 묶어주는 기능능
3. JAVA API 여러 분이 사용할만한 수많은 인터페이스가 있다.
4. 인터페이스는 관용적 표현 : (~able) : ~ 할수 있는
5. 객체간 연결 고리( 객체간 소통 ) >> 다형성 >> 부모

인터페이스는 >> 설계표준이고 >> 구현을 강제한다. >> 재정의를 통해서...

인터페이스의 특징
1. 실제 구현부를 가지고있지 않다. : 실행블럭이 없느 함수 : void run(); >> 추상함수
>> JAVA API : Collection(동적배열 : 자료구조) >> Vector, [ArrayList], HashSet, [HashMap]

interface Iable{
[public static final] + int VERSION =1;
[poublic abstract] + void run();

실제사용
interface Iable{
int VERSION =1;
void run();
String move(int x, int y);

class Test implement Iable, Bable, Cable ...
*/

interface Humanable{
    /* public static final*/int AGE=100;
    /* public static final*/String GENDER = "남";

    String print();
    void message(String str);
}
interface Iable{
    int AGE = 10;
    void info();
    String val(String s);
}
class Test extends Object implements Humanable, Iable{

    @Override
    public String print() {
        return null;
    }

    @Override
    public void message(String str) {

    }

    @Override
    public void info() {

    }

    @Override
    public String val(String s) {
        return null;
    }
}

public class Ex03_Interface {
    public static void main(String []args){
        Test t = new Test();
        Humanable h = t; // >> 다형성!! >> 부모는 자식객체의 주소를 가질수 있다.
        System.out.println(h.AGE);

        Iable ia = t;
        System.out.println(ia.AGE);

    }
}
