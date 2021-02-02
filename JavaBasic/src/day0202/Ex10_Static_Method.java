package day0202;


public class Ex10_Static_Method {
    int number;
    public void print(){
        System.out.println("instance_method number : " + number);
    }
    public static void method(){
        System.out.println("static Method");
    }
    public static void main(String[] args){
        method();

    }
}
