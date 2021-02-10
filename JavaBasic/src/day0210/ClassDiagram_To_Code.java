package day0210;

interface TopSize{
    int S = 90;
    int M = 95;
    int L = 100;
    int XL = 105;
    int XXL = 110;
    public void checkSize(int size);
}

interface BottomSize{
    int S = 28;
    int M = 29;
    int L = 30;
    int XL = 31;
    int XXL = 32;
    public void checkSize(int size);
}
abstract class  Clothes{
    abstract void fablic(String name);
}
class Top extends Clothes implements TopSize{
    int size;

    @Override
    void fablic(String name) {
        System.out.println("옷감은 " + name+"입니다.");
    }
    void Up_waist(){
        System.out.println("상의입니다.");
    }

    @Override
    public void checkSize(int size) {
        this.size = size;
        printSize();
    }
    public void printSize(){
        System.out.println("사이즈는 " + this.size+ "입니다.");}
}
class Bottom extends Clothes implements BottomSize {
    int size;
    @Override
    void fablic(String name) {
        System.out.println("옷감은 " + name+"입니다.");
    }
    void Down_waist(){
        System.out.println("하의입니다.");
    }

    @Override
    public void checkSize(int size) {
        this.size = size;
        printSize();
    }
    public void printSize(){
        System.out.println("사이즈는 " + this.size+ "입니다.");

    }
}
class knit extends Top{
    public knit(String name){
        super.fablic(name);
        System.out.println("울로되어있는 니트입니다.");

    }
    public void wool(){
        System.out.println("울로되어있는 니트입니다.");
    }
}
class Shirts extends Top{
    public Shirts(String name){
        super.fablic(name);
        System.out.println("셔츠에는 단추가있습니다.");

    }
    public void button(){
        System.out.println("셔츠에는 단추가있습니다.");
    }
}
class T_Shirts extends Top{
    public T_Shirts(String name){
        super.fablic(name);
        System.out.println("면 티셔츠입니다.");
    }
    public void cotton(){

    }
}
class Pants extends Bottom{
    public Pants(String name){
        super.fablic(name);
        System.out.println("This is PANTS");
    }
    public boolean crotch_T(){////가랑이 유
        return true;
    }
}

class Skirt extends Bottom{
    public Skirt(String name){
        super.fablic(name);
        System.out.println("This is SKIRTS");
    }
    public boolean crotch_F(){////가랑이 무
        return false;
    }
}
public class ClassDiagram_To_Code {
    public static void main(String []args){
        Top nit = new knit("WOOL");
        nit.checkSize(95);

        System.out.println();
        Bottom pants = new Pants("cotton");
        pants.checkSize(100);
    }
}
