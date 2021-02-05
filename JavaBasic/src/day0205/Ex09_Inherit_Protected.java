package day0205;

import kr.or.bit.Bird;

class Bi extends Bird{
    @Override
    protected void moveFast(){
        super.moveFast();
    }

}
class Ostrich extends Bird{
    void run(){
        System.out.println("run");
    }
    @Override
    protected void moveFast(){
        System.out.println("RUN");
    }
}
public class Ex09_Inherit_Protected {
    public static void main(String[] args){
        Bi bi = new Bi();
        bi.fly();
//        bi.moveFast(); default

        Ostrich o = new Ostrich();
        o.run();
        o.moveFast();

    }
}
