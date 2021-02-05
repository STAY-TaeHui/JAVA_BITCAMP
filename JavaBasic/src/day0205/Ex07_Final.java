package day0205;
/*
* 상수 : 한번 값이 초기화되면 변경불가
* 상수자원 : 고유값(주민번호 , 수학 : Pi값 / 버전번호 /
* 상수는 관용적으로 대문자로 씀
*
* java : final int NUM = 10;
*
* fianl 키워드
* final class Car{} >> 상속금지 (마지막이다 ) 더 이상 확장하지 마라라*
* 함수앞에 final >> public final void print(){} >> 상속관계에서 재정의 금지 ( override 금지)
*
* */

class Vcard{
    final String KIND = "heart";
    final int NUM = 10;
    void method(){
        System.out.println(Math.PI);
    }
}
class Vcard2{
    final String KIND; // 초기화 필요!!
    final int NUM;     // 초기화 필요!!
    Vcard2(){           // 위에서 초기화를 안해줬기 때문에 생성자에서 초기화 가능
        this.KIND="heart";
        this.NUM = 10;
    }
    Vcard2(String kind, int num){ //오버로딩 생성자에서도 초기화 필수
        this.KIND=kind;
        this.NUM=num;
    }

    @Override
    public String toString() {
        return "Vcard2{" +
                "KIND='" + KIND + '\'' +
                ", NUM=" + NUM +
                '}';
    }
}
public class Ex07_Final {
    public static void main(String[] args){
        Vcard vcard  = new Vcard();
        System.out.println(vcard.KIND);
        vcard.method();

        Vcard2 vcard2 = new Vcard2();
        System.out.println(vcard2.KIND);

        Vcard2 vcard3 = new Vcard2("clover",0);

        System.out.println(vcard3);
    }
}
