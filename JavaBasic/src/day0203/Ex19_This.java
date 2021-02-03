package day0203;
/*

 */
class Test5{
    int i;
    int j;

    Test5(){

    }
    Test5(int i, int j){
        i=i;
        j=j;
    }
}
public class Ex19_This {
    public static void main(String[] args){
        Test5 t5 = new Test5(10,5);
        System.out.println(t5.i);

    }
}
