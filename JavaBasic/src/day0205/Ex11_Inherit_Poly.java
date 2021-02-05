package day0205;

class Pbase{
    int p = 100;
}
class Cbase extends Pbase{
    int c= 200;
}
class Dbase extends Pbase{
    int d = 300;

}

public class Ex11_Inherit_Poly {
    public static void main(String[] args){
        Cbase cbase = new Cbase();
        System.out.println(cbase.toString());
        //다형성 -> 부모타입의 변수가 자식타입의 변수를 가질 수 있다.
        Pbase p = cbase;

        Dbase dbase = new Dbase();

        p=dbase;
        System.out.println(p);

        Cbase c = (Cbase)p;//부모가 객체의 주소를 다시 자식에게 줄때는 자식타입으로 캐스팅 해야함.


    }
}
