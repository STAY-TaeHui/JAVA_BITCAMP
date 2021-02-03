package day0203;
/*
생성자 함수 (constructor)
1. 함수 ( 특수한 목적 )
2. 특수한 목적 (member field 초기화)
3. 일반함수 다른점...
3.1 함수의 이름이 고정(이름이 class이름과 동일)
3.2 실행시점 : 객체 생성(new) >> heap 공간이 할당되고 >> 변수들이 올라가고 >> 생서자함수 자동 호출
3.3 실행시점 : return type이 없음 >> 생성자 함수는 무조건 void >> 어처피 void이니 타입을 안씀 >> public "class이름"(){}

4. 목적 : 생성되는 객체마다초기화
5. 생성자함수 (overloading)
6. 당신이 만약 overloading 생성자 함수를 하나라도 구현했다면
--default 생성자 함수는 반드시 구현을 통해서만 사용가능하다.
 */
class Car{

}
class Car2{

}
class Car3{
    String carname ="";
    Car3(String name){
        carname = name;
    }
}
class Car4{
    String carname;
    //default 구현 안함
    //[ 예외적으로  overladgin ] 생성자를 구현했다면 default는 자동으로 생성되지 않음
    //설계자의 의도 : 이름을 꼭 입력받기 위해서


}

public class Ex16_Constructor {
    public static void main(String[] args){

    }
}
