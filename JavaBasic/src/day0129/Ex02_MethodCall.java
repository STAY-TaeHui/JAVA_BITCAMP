package day0129;

import kr.or.bit.Fclass;
import kr.or.bit.Tv;

public class Ex02_MethodCall {
    public static void main(String args[]) {


        Fclass fclass = new Fclass();
        fclass.m();
        fclass.m2(100);

        int result = fclass.m3();

        result = fclass.m4(200);

        fclass.callSubSum();

        result = fclass.max(50,100);
        System.out.println(result);

        Tv tv = fclass.tCall(); //Tv타입을 가지는 주소값을 받는다.
        System.out.println("tv : " + tv);

        Tv tv2 = new Tv();
        fclass.tCall2(tv2);
    }
}
