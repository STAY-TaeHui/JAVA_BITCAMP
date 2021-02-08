package kr.or.bit;

//디자인패턴( 생성패턴 ) >> new (객체)
//객체 하나를 만들어 공유 ...
// 의도 : 하나의 객체를 공유하겠다.

public class Singleton {
    private static Singleton p; // 중요!!!  >> 멤버필드 Singleton 타입의 p
    private Singleton(){ //private
        //객체 직접생성 불가 ... new()를 못하게 하겠다.
    }

    public static Singleton getInstance(){
        if(p == null) {         // >> 객체가 생성되어 있지 않았을때!!
            p = new Singleton(); // >> 생성자 호출 >> 객체 만든것
        }
        return p;       //만든 객체의 주소를 리턴..
                        //만약 이미 만들어져 있다면 이전에 만들었던 p(객체의 주소)를 리턴...
    }
 // 싱글톤 패턴은 생성자 호출을 막고(new Singleton을 막는다.), 하나의 객체만 heap에 올려서 하나의 객체를 공유하겠다는 것을 보장하는 것.
}
