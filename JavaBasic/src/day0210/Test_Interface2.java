package day0210;
interface BuggerCook{
    public void makeBuger();
    public void makeSalad();
}
class PT implements BuggerCook{

    @Override
    public void makeBuger() {
        System.out.println("알바급 버거");
    }

    @Override
    public void makeSalad() {
        System.out.println("알바급 샐러드");

    }
}
class Shef implements BuggerCook{

    @Override
    public void makeBuger() {
        System.out.println("쉐프급 버거");

    }

    @Override
    public void makeSalad() {
        System.out.println("쉐프급 샐러드");

    }
}
public class Test_Interface2 {
    public static void main(String[] args){
        BuggerCook pt  = new PT();
        BuggerCook sf = new Shef();

        pt.makeBuger();
        pt.makeSalad();

        sf.makeBuger();
        sf.makeSalad();
    }
}
