package day0205;

/*
super(현재 자식이 부모의 접근 주소값) : 상속관계에서 부모에 접근 :
자식입장에서  super -> '부모객체의 주소'

1. super >> 상속관계에서 자식이 부모의 접근
2. super >> 상속관계에서 부모의 생성자를 호출(명시적으로)
 */
class Base{
    String basename;
    Base(){
        System.out.println("Base 기본 생성자 함수");
    }
    Base(String basename){
        this.basename = basename;
        System.out.println("basename : " + this.basename);
    }
    void method(){
        System.out.println("나 부모 메서드");
    }

}
class Derived extends Base{
    String dname;
    Derived(){
        System.out.println("Derived 기본 생성자 함수수");
    }
    Derived(String dname){
        super(dname);   //부모의 생성자 호출
//        super.method();
        this.dname = dname;
        System.out.println("dname : " + this.dname);
    }

    @Override
    void method() {
//        super.method();
        System.out.println("부모함수 재정의 @Ocerride");
    }
    void parent_method(){
        super.method();
    }
}

public class Ex06_Inherit_super {
    public static void main(String[] args){
//        Derived d = new Derived();

        Derived d = new Derived("홍길동");
        d.method();
        d.parent_method();

    }
}
