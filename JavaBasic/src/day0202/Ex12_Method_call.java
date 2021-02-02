package day0202;

//>> 값전달 (call by value)
//>> 주소값 전달 (call by reference)
class Data{
    int i;
}

public class Ex12_Method_call {
    public static void main(String[] args){
        Data d = new Data();
        d.i=100;
        System.out.println("d.i : " + d.i);

        scall(d);

        System.out.println("after : d.i : " + d.i);

        vcall(d.i);
        System.out.println("d.i " + d.i);
    }
    static void scall(Data sdata){
        System.out.println("함수 : " + sdata.i);
        sdata.i = 111;
    }
    static void vcall(int x){
        System.out.println("before x : " + x);
        x = 8888;
        System.out.println("after x : " + x);
    }
}
