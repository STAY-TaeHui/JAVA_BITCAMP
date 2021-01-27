package day0125;

//배열
//배열은 다음과 같이 선언을 하게 된다.
// 데이터타입[] 배열이름 = new 데이터타입[크기]

//기본형 데이터타입의 배열은 모든 위치를 0으로 초기화한다.
//참조형 데이터타입의 배열은 모든 위치를 NULL로 초기화한다.
//NULL이란 특수한 "상태"로써, 참조형 데이터타입이 메모리 주소값을 부여가 되었지만
//해당 메ㅗㅁ리 주소값을 참조해서 들어가면 아무것도 없는 상태를 null이라고 하고 
//null인 상태에서는 새로운 값을 할당하는 것 외에는 아무것도 할 수 없다.


public class Ex01Array {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] intAraay = new int[5];
        
        String[] stringArray = new String[3];
        
        for(int i=0; i<stringArray.length; i++) {
            System.out.printf("string Array[%d] : %s\n", i,stringArray[i]);
        }
        
//        System.out.println(stringArray[0].equals("abc"));
        
        System.out.println(stringArray[0] == null);
        
        int size = 4;
        int[] intArray2 = new int[size];
        System.out.println("intArray2의 크기 : "+intArray2.length);
        
        

    }

}
