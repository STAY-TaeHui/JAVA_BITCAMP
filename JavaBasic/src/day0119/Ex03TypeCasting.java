package day0119;
//형변환
//
//암시적 형변환(implicit type casting) - 더 작은값을 큰 데이터타입으로 변환할때 자동으로 변환

//명시적 형변환(explict type casting) - 더 큰 값을 작은값으로 바꿀때 데이터 손실 감수하고 변환
public class Ex03TypeCasting {
    public static void main(String[] args) {
        byte b= 3;
        int number = b;
        System.out.println(number);
        
        double d = number;
        System.out.println(d);
        
        b=(byte)141;
        System.out.println(b);
        //141 = 128 +13
        //128은 바이트기준 오버플로우 발생해서 -128
        //141 = -128 + 13 ==> -115
        
        b=(byte)-130;
        System.out.println(b);
        //-130 = -129 -1
        //      = 127 -1
    }
}
