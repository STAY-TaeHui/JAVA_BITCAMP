package day0205;
class Tv2{
    boolean power;
    int ch;
    void power(){
        this.power = !this.power;
    }
    void chUp(){
        ch++;
    }
    void chDown(){
        ch--;
    }

}
class CapTv extends Tv2{


}
public class Ex10_inherit_Poly {
    public static void main(String[] args){
        CapTv captv  = new CapTv();
        captv.power();
        System.out.println("전원  : " + captv.power);

        captv.chUp();
        System.out.println("채널 : " + captv.ch);

        Tv2 tv2 = captv;
        //상속관계에서 부모타입은 자식타입의 주소를 가질 수 있다.
        //@@@ 단 부모는 자신의 자원만 접근 가능 @@@
        //단 재정의는 제외!!
        //자바에서 다형성이라는것은 부모타입은 자식타입의 주소를 가질 수 있다.

    }
}
