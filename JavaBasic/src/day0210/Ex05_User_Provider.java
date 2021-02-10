package day0210;


/*
관계) A는 B를 사용합니다. --->>>> 상속 / 포함(has a) - 부분,전체 /

사용방법
1. 상속 A extends B
2. 포함 - A라는 클래스는 B를 멤버로 가질 수 있다.
    2.1 부분집합
    2.2 전체집합
    --------------------------------------------------------------------

    class B{}
    class A{
    int i;
    B b;  // >> A는 B를 사용합니다(포함)
    A(){
        b = new B();
        }
    }
    >> B라는 클래스는 독자적인 생성(X) >> A라는 객체가 만들어 져야 B도 생성됨
    >> A a = new A()>> 다음에 A객체생성 and B객체 생성
        >> 같은 생명주기 >> A가 생성되면 B도생성 / A가 죽으면 B도 죽음 >> 전체집합(Composition) '차 - 엔진 관계'

>> '학교 - 학생 관계' >> Aggregation(부분집합)
    class B{}
    class A{
    int i;
    B b;  // >> A는 B를 사용합니다(포함)
    A(){

        }
    A(B b){
    this.b =b ;
    }
    }
    >> void main()
    >>  A a = new A();
    >> B b = new B();
    >> A a2 = new A(b);

    ---------------------------------------------------------
    class B{}
    class A{
        int i;
        A(){}
        void m(B b){ // A는 B에 의존(Dependency)합니다.(함수), B타입의 member field가 없다.
        }
    }
 */

class B{

}
class A{
    void method( B b){}
}
/*@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 중요!!! @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@



 */
interface Icallable{
    void m(); // >> 오버라이드 강제 구현!
}
class D implements Icallable{

    @Override
    public void m() {
        System.out.println("D Icallable 인터페이스의 m()을 재정의 했다.");
    }
}
class F implements Icallable{

    @Override
    public void m() {
        System.out.println("D Icallable 인터페이스의 m()을 재정의 했다.");
    }
}
class User{
    /*void method(D d){     >> 이렇게 짜지 말자. 어처피 D와 F는 Icallable이라는 부모를 같이 갖는다.
        d.m();
    }
    void method(F f){
        f.m();
    }*/
    void method(Icallable ic){   //(다형성)  >> 이렇게 같은 부모를  갖는다면 부모를 써서 재사용성을 높이자.
        ic.m();
    }
}

public class Ex05_User_Provider {
    public static void main(String [] args){
        B b = new B();
        A a = new A();
        a.method(b); // B객체를 생성하지 않으면 method를 사용 못함.

        User user = new User();
        D d = new D();
        F f = new F();
        user.method(f);
    }
}
