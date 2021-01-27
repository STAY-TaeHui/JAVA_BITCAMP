package day0125;

public class Ex05Sort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
       int[] intArray = {3,1,9,4,8,2};
       
       for(int i=0; i< intArray.length; i++) {
           System.out.println(intArray[i]);
       }
       
       // 이번에 구현할 정렬은 버블정렬!!
       
       for(int i=0; i<intArray.length-1;i++) {
           if(intArray[i] > intArray[i+1]) {
               System.out.println(i+"번쨰가 "+(i+1)+"번째 보다 크므로 바꾼다.");
               int tmp = intArray[i];
               intArray[i] = intArray[i+1];
               intArray[i+1] = tmp;
               i=-1;
           }
       }
    }

}
