package day0203;
class Zcar2{
    String color;
    String geartype;
    int door;
    Zcar2(){
        this("red",1);
        System.out.println("default constructor");
    }
    Zcar2(String color, int door){
        this(color, door, "auto");
        System.out.println("overloading constructor param TWO");
    }
    Zcar2(String color, int door , String geartype){
        this.color=color;
        this.door = door;
        this.geartype = geartype;
        System.out.println("overloading constructor param THREE");


    }
    void print(){
        System.out.println(this.color +" " +this.geartype+" " +this.door);

    }

}
public class Ex20_this {
    public static void main(String[] args){
        Zcar2 zcar = new Zcar2();
    }

}
