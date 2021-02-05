package day0205;

import kr.or.bit.PCclass;

/*
* private, default, public, protected
* 상속이 없는 클래스 안에서는 default와 같다.
* 결국 상속관계에서만 의미를 가진다.
* */
class Dclass{
    public int i;
    private int p;
    int s;//default
    protected int k; //결국 protected는 상속관계에서만 효과 발휘
                    //protected를 쓰는이유 :
                    //>>
}
class Child2 extends PCclass{
    void method(){
        this.k = 100; // protected k; >> 상속관계에서는 public 처럼 사용
        System.out.println(this.k);
    }
}

public class Ex08_inherit_Protected {
    public static void main(String [] args){
        Child2 ch = new Child2();
        ch.method();
    }
}
