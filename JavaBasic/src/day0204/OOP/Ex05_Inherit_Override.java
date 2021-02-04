package day0204.OOP;

import kr.or.bit_Override.Emp;

class Test2{
    int x= 100;
    void print(){
        System.out.println("부모함수 Test2");
    }
}
class Test3 extends Test2{
    int x=300;              //이렇게 부모함수와 같은 이름의 변수는 쓰지말자

    @Override
    void print(){               //이거는 Override
        System.out.println("자식이 부모 함수를 재정의");
    }
    void print(String str){     //이거는 Overloading
        System.out.println("저는 Overloading입니다만...");
    }
}
public class Ex05_Inherit_Override {
    public static void main(String[] args){
        Test3 t3 = new Test3();
        System.out.println(t3.x);

        t3.print();
        ////////////////////////////////////////////

        Emp emp = new Emp(1000,"홍길동");
        System.out.println(emp);
        System.out.println(emp.toString());

    }
}
