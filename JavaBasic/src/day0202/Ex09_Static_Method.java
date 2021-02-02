package day0202;
/*

 */
class StaticClass{
    int iv;

    static int cv;

    void m(){
        //static 자원(cv)은 일반자원(iv)보다 항상 메모리에 먼저 올라감.
        cv = 1000;
    }
    static void sm(){
//        error가 없게하려면 static끼리
        //여기서는 static메서드가 먼저 메모리에 올라가고 인스턴스변수가 생성되기 때문에
        //인스턴스변수는 static메서드에서 사용할 수 없음.
    }
}
public class Ex09_Static_Method {
    public static void main(String args[]){

    }
}
