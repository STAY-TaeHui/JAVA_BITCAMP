package day0204.OOP;
//설계도
class Tv{
    boolean power;
    int ch;

    void power(){
        this.power = !this.power; //      토글링
    }
    void chUp(){
        this.ch++;
    }
    void chDown(){
        this.ch--;
    }
}
class Vcr{ // TV가 없으면 볼 수 없음
    boolean power;
    void power(){
        this.power = !this.power;
    }
    void play(){
        System.out.println("재생하기!!!");
    }
    void stop(){
        System.out.println("정지하기....");
    }
    void rew(){}
    void ff(){}
}

/*
<<  요구사항  >>
Tv 설계도
Vcr 설계도
TvVcr(기능이 같이있음)이라는 제품을 만들어보자
 but, class Tv extends Vcr ... TvVcr extends Tv >> power이라는 변수이름이 같아 충돌남.
 변수이름이 같은게 없다면 계층상속으로도 가능하다.

 해결 : class TvVcr extends Tv { Vcr vcr } --> 하나는 '상속' 하나는 '포함'
 >> class Tvvcr { Tv t; Vcr v;}
 >> class Tvvcr extends { Vcr v;}
 >> class Tvvcr extends { Tv t; }

3가지 중 어떤걸 써야될까???
A : 기준은 주기능!, 메인기능! >> 비중이 높은 비중은 '상속'!! 나머지는 '포함'으로 설계하자.

 */
class TvVcr extends Tv{
    Vcr vcr;
    TvVcr(){
        vcr = new Vcr();
    }
}
public class Ex03_Inherit {
    public static void main(String[] args){
        TvVcr t = new TvVcr();
        //Tv 전원 ON
        t.power();
        System.out.println("전원 : " + t.power);
        t.chUp();t.chUp();t.chUp();t.chUp();
        System.out.println("채널 : " + t.ch);

        //Vcr전원 ON
        t.vcr.power();
        System.out.println("비디오 전원 : " + t.vcr.power);
        t.vcr.play();
        t.vcr.stop();

        t.vcr.power();
        t.power();
        System.out.println("전원 : " + t.power);
        System.out.println("비디오 전원 : " + t.vcr.power);


    }
}
