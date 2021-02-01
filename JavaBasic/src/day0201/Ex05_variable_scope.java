package day0201;
//1. class variable(클래스 변수), static variable(객체간 공유자원)
//2. 목적 : 정보를 담는것 ( 생성되는 모든 객체가 공유하는 자원)
//heap영역에 생성된 [객체]들의 [공유자원]
//3. 특징 : 접근방법
//3.1 class 이름.static 변수명>> Variable.cv
//3.2 Variable v = new Variable(); >> v.cv
//    Variable v2 = new Variable(); >> v2.cv
//    v.cv == v2.cv
public class Ex05_variable_scope {
    Variable v = new Variable();
}
class Variable{
    int iv; //member field, instance variable

    void method(){
        int lv = 0;//local variable    반드시 초기화
        //for(...) block variable

    }
    static int cv;

}
