package day0202;

class  InitTest{
    static int cv = 10;
    static int cv2;
    int iv = 11;

    static { // static block (static 초기자 설정 블럭)
            //static 멤버필드의 초기값을 주기위함!!
            // 변형된 값을 제공. 연산된 값 같은...
        cv = 10;
        cv2 = cv+222;
    }
    {//아무것도 없는 블럭 -> instance variable 초기화 블럭

    }
}
public class Ex08_Static_Init {
    public static void main(String args[]){


    }
}
