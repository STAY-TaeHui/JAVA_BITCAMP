package day0209;

//Unit : 공통기능 ( 이동좌표 , 이동, 멈춘다) : 추상화, 일반화
//Unit : 이동방법은 다르다 ( 이동방법은 별도로 구현)

abstract class Unit {
    int x, y; // 좌표

    void stop() {
        System.out.println("STOP");
    }
    abstract void move(int x, int y);
}
//
class Tank extends Unit{

    @Override
    void move(int x, int y) {
        this.x = x;
        this.y = y;

    }
    void siegemode(){
        System.out.println("Siege Mode~~~");
    }

}
class Marine extends Unit{

    @Override
    void move(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.println("Marine 이동 : " );
    }
    void steampack(){ // 특수 기능 /구체화
        System.out.println("STEAM PACK~~~");
    }
}
class DropShip extends Unit{

    @Override
    void move(int x, int y) {
        this.x=x;
        this.y=y;
        System.out.println("Marine 이동 : " );
    }
    void load(){ // 특수 / 구체화
        System.out.println("Unit load...");

    }
    void unload(){
        System.out.println("Unit unload...");
    }
}


public class Ex02_abstract_class {
    public static void main(String []args ){
        Tank t = new Tank();
        t.move(500,200);
        t.stop();
        t.siegemode();

        Marine m = new Marine();
        m.move(500,200);
        m.stop();
        m.steampack();

        //1. 탱크 3대를 만들고 같은 좌표로 이동

        Tank[] tarr = new Tank[3];
        for(int i=0; i< tarr.length; i++){
            tarr[i] = new Tank();
            tarr[i].move(555,444);
        }

        //2. 탱크 1, 마린 1, 드랍쉽 1 을 같은 좌표로 이동
        Unit[] uarr ={ new Tank(),new Marine(), new DropShip()};

        for (Unit unit : uarr) {
            unit.move(666, 444);
        }


    }
}
