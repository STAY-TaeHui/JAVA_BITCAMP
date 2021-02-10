package day0210;

interface StandardMp3{
    public void playMp3();
    public void listenFm();
}
class AMap3 implements StandardMp3{

    @Override
    public void playMp3() {
        System.out.println("AcomMp3 듣기");
    }

    @Override
    public void listenFm() {
        System.out.println("AcomFM 듣기");

    }
}
class BMap3 implements StandardMp3{

    @Override
    public void playMp3() {
        System.out.println("BcomMp3 듣기");

    }

    @Override
    public void listenFm() {
        System.out.println("BcomMp3 듣기");

    }
}
public class Test_Interface {
    public static void main(String args[]   ){
        StandardMp3 am = new AMap3();
        StandardMp3 bm = new BMap3();

        am.playMp3();
        am.listenFm();

        bm.playMp3();
        bm.listenFm();
    }
}
