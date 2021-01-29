package kr.or.bit;
/*
        클래스 구성요소 (필드 + 함수)

        * 기능(행위) 만드는 방법
        * 함수(function, method)
        * method : 행위 또는 기능을 정위(최소단위) : 하나의 함수는 하나의 기능만 구현
            ex) 먹는다 / 잔다 / 걷는다 >> 각각 하나만 구현
        * 함수는 호출에 의해서만 동작함

        JAVA)
        1. void, parameter(O) >> void print(String str){ "실행코드 " }
        2, void, parameter(X) >> void print(){ "실행코드" }
        3. return type , parameter(O) >> int print(int data){ return data + 10; }
        4. return type , parameter(X) >> int print(){ return data + 10; }

        return type >> 8가지 기본타입 , Array, class, ....Collection, Interface
        parameter type >> 8가지 기본타입 , Array, class, ....Collection, Interface

        함수의 이름은 >> " 의미있는 단어의 조합 "
        앞글자는 소문자, 두번째 단어부터 대문자
        ex) getChannelNumber(), getEmpListByEmpno
 */
public class Fclass {
    public int data;

    //void , parameter(X)
    public void m(){
        System.out.println("일반함수 : void, parameter(X)");

    }
    public  void m2(int i){
        System.out.println("일반함수 : void, parameter(O)");
        System.out.println("parameter value : " + i);
    }
    public int m3(){
        return 100;//return 리턴타입이 존재하면 반드시 return 사용
    }
    public int m4(int i){
        return 10+i;
    }
    public int sum(int i, int j, int k){
        return i+j+k;
    }

    //함수 접근자가 private인 경우가 몇 있음
    //이 함수를 만든 의도 : 내부에서만 사용가능 >> 다른 함수를 도와주는 역할
    //내ㅑ부에서 사용되는 "공통함수"(Helper Function)
    private int subSum(int i){
        return i+100;
    }
    public void callSubSum(){
        int result = subSum(100);//내부에서 호출!!
        System.out.println("call result : " + result);
    }
    private int  operationMethod (int data){
        return data*200;
    }
    public boolean opSum(int data){
        boolean bo;
        int result = operationMethod(data);
        if(result>0){
            bo = true;

        }else{
            bo=false;
        }
        return bo;
    }
//      return을 최소화 하는것이 좋다!!
    public int max(int a, int b) {
//        if (a > b) {
//            return a;
//        }
//
//        else{
//            return b;
//        }

        return (a > b) ? a : b;
    }

    //함수의
    public Tv tCall(){//Tv타입을 갖는 주소값을 리턴

        Tv t = new Tv();
        t.brandName="LG";
        return t;
        //위 코드는 Tv()를 셋팅해서 보낼 수 있음

//        return new Tv(); //Tv라는 객체의 주소값을 바로 리턴
        //어떠한 초기화도 없이 주소만 던지는 경우우
    }
    public void tCall2(Tv t){
        System.out.println("t 주소값 : " + t);
    }
}
