package day0209;

import java.util.Scanner;

interface Irepairable{}

class Unit2{
    int hitpoint;
    final int MAX_HP;
    Unit2(int hp){
        this.MAX_HP = hp;
    }
}

//지상유닛
class GroundUnit extends Unit2{

    GroundUnit(int hp) {
        super(hp);
    }
}

//공중유닛
class AirUnit extends Unit2{

    AirUnit(int hp) {
        super(hp);
    }
}

//건물
class CommandCenter implements Irepairable{

}
class Tank2 extends GroundUnit implements Irepairable{

    Tank2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Tank2]";
    }
}
class Marine2 extends GroundUnit{
    Marine2() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Marine2]";
    }
}
class Scv extends GroundUnit implements Irepairable{
    Scv() {
        super(50);
        this.hitpoint = this.MAX_HP;
    }

    @Override
    public String toString() {
        return "[Scv]";
    }
    //Scv 구체화 특수기능 >> repair
    /*void repair(Tank2 tank){
        if(tank.hitpoint != tank.MAX_HP){
            System.out.println("언덜어택...");
            tank.hitpoint +=5;
        }
    }
    void repair(Scv scv){
        if(scv.hitpoint != scv.MAX_HP){
            System.out.println("언덜어택...");
            scv.hitpoint +=5;
        }
    }*/

//    Irepairable은 Scv의 부모타입입니다.
//    Irepairable은 Tank2의 부모타입입니다.
//    Irepairable은 CommandCenter 의 부모타입입니다.
    void repair(Irepairable repairunit){
        //repairunit 파라미터는 Irepairable 인터페이스를 구현하는 객체의 주소값이 올 수 있따.
        //정리
        //1. CommandCenter와  Tank2, Scv수리방법이 틀리다.
        //2. irepairable reapirunit은 수리할 자원을 가지고 있지 않다.
        //그럼 >> repairunit틀 통해 위 3가지 Unit2가 온다고 가정하고 분류해 보자.

        //CommandCenter와  Tank2, Scv >> 구분점 >> unit이냐? 건물이냐?
        if (repairunit instanceof Unit2) {
            Unit2 unit = (Unit2)repairunit; //>> 인터페이스(repairunit)는 최상위 부모이기 때문에 그 하위 인 Unit2로 다운캐스팅 해줌.
            //Tank2에서 부모타입인 unit2자원만 접근 가능
            if(unit.hitpoint != unit.MAX_HP){
                unit.hitpoint = unit.MAX_HP;
            }
        }
        else{
            //부모타입이 unit2가 아니다.
            System.out.println("다른 방식을 통해 치료해야됨.. Unit2타입이 아니다.");
        }
    }
}
public class Ex04_Interface {
    public static void main(String[] args) {
        Tank2 tank = new Tank2();
        Marine2 marine = new Marine2();
        Scv scv = new Scv();

        System.out.println(scv);

        //전투
        tank.hitpoint -= 20;
        System.out.println("탱크 : " + tank.hitpoint);
        System.out.println("수리요청");
        scv.repair(tank);
        System.out.println("탱크 수리완료 : " + tank.hitpoint);

        scv.hitpoint -= 10;
        System.out.println("scv : " + scv.hitpoint);
        System.out.println("수리요청");
        scv.repair(scv);
        System.out.println("scv 수리완료 : " + scv.hitpoint);

        CommandCenter center = new CommandCenter();
        scv.repair(center);

//        scv.repair(marine); >> 컴파일도 안됨. Irepairable 타입이 아니기 때문문
    }
}

