package day0204.OOP;
/*
OOP
1. 상속
2. 캡슐화
3. 다형성

1. 상속
java : child extends Base

2. 특징
2.1 다중 상속은 불가 -> 여라가지 부모의 것을 한번에 상속 불가
2.2 단일상속 ( 계층적 상송 : 할아버지 -> 아버지 -> 아들 순서적으로 상속가능)
2.3 다중상속을 지운 ( 단, interface만 가능)

3. 상속
3.1 상속의 진정한 의미 : 재사용성!!
3.2 단점 : 초기 설계 비용
3.3 재사용성 >> 설계 >> 비용 (공통분모(추상화))

4. 상속관계
GrandFather >> Father >> Child -> 상속관계
부모부터 메모리(heap)에 올라가고 default Constructor(생성자)가 호출됨


 */


class GrandFather{
    public GrandFather(){
        System.out.println("GrandFather");
    }
    public int gmoney = 5000;
    private int pmoney = 111111;   //접근자 private는 (객체, 상속관계)에서도 접근 불가.

}
class Father extends GrandFather{
    public Father(){
        System.out.println("Father");
    }
    public int fmoney = 3000;
}
class Child extends Father {
    public Child(){
        System.out.println("Child");
    }
    public int cmoney = 1000;
}
/*
default
사용자가 만드는 모든 클래스는
class Car extends Object가 생략되어 있다.
 -> 사용자가 만드는 모든 클래스는 default Object(최상위 단군급) 클래스를 상속함
 -> 가지는 자원 : 모든 클래스가 공통으로 가지는 것들.

상속관계에서는 가장 최상위(Base)클래스가 Object를 상속한다.
최상위 클래스 GrandFather extends Object를 하지만 컴파일러가 알아서 상속처리한다.
 */


class Car{

}

public class Ex01_inherit {
    public static void main(String [] args){

        Child child = new Child();
        System.out.println(child.cmoney);
        System.out.println(child.fmoney);
        System.out.println(child.gmoney);

//        child.pmoney -> private은 접근 불가.

        Car car = new Car();


    }
}
