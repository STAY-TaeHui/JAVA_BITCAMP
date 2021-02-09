package day0209;
/*
>> 완서된 코드( 실행블럭이 있는 함수 : void run(){}  >> 미완성코드( 삼수 실행블럭이 없는 함수 : void run();)

1. 추상클래스(미완성) : 스스로 객체 생성 불가( new 사용 불가)
2. 추상클래스는 결국 완성된 클래스로 만드는 것이 목적 [ 상속을 통해서 ]
3. 상속관계에서 미완성 자원(추상함수 ) 완성해라 ( 구현 ) >> 재정의 해라( 추상자원을 )
 */
class Car{
    void run(){}
}
class Hcar extends Car{
    //run()을 재정의 해도 되고 안해도 됨
}
////////////////////////////////////////////
//클래스 앞에 abstract!!!
//>> 이 크래스 안에 최소 1개의 추상자원을 만들겠다
abstract class AbClass{
    //완성된 코드
    int pos;
    void run(){
        ++pos;
    }
    //미완성된 코드
    abstract void stop(); // >> 이게 추상함수. >> 이걸 반드시 재정의 해서 사용해라.
}
class Child extends AbClass{

    @Override
    void stop() { // 함수 재정의 >> 강제구현
        this.pos = 1;
        System.out.println("Stop : "  + this.pos);

    }
}
class Child2 extends AbClass{

    @Override
    void stop() {
        this.pos = -1; // 안에 있는 내용은 마음대로 가능
        System.out.println("Stop : "  + this.pos);
    }
}
public class Ex01_abstract_class {
    public static void main(String [] args){
        Child ch = new Child();
        ch.run();
        ch.run();
        ch.stop();

        Child2 ch2 = new Child2();
        /////////////////////////
        // 다형성
        AbClass ab = ch2;
        System.out.println("ab stop()함수 호출");
        ab.stop(); //재정의
        //부모 타입 접근해도 추상함수이기 때문에 실행이 안됨.
        //재정의된 자식 함수를 호출한다. (예외적으로!!)(

    }
}
