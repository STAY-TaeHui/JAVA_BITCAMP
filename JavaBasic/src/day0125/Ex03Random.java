package day0125;
//Random 클래스
import java.util.*;
public class Ex03Random {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Random random = new Random();
        
        //random의 원리:
        //0~1사이의 수많은 실수가 랜덤안에 있다.
        
        //만약 nextInt()를 사용하면 각 실수에 int범위의 최소 최대값을 곱해준다.
        
        //정수의 범위를 지정하여 뽑을수도 있다.
        //nextInt(100)이라고 해주면 0부터 99까지의 랜덤한 숫자들이 나오게 된다.
        
        for(int i=0; i<4; i++) {
            System.out.println(random.nextInt());
        }
        
        //0~10사이의 랜덤숫자 5개 뽑기
        for(int i=0; i<5; i++) {
            System.out.println(random.nextInt(10));
        }
    }

}
