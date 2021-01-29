package day0129;
class Human{
    String name;

}
class Test{
    int add(int i, int j){
        return i+j;
    }
    //배열은 객체다.(배열은 주소값을 가지고 있다. : heap에 생성)
    int [] add2(int []param){//int[] 주소값을 리턴값을 리턴
        int[]arr = new int[param.length];
        for(int i=0; i<param.length; i++){
            arr[i] = param[i]+1;
        }
        return arr;
    }
    int[]add3(int[] so, int[] so2){

        int[] max = (so.length>so2.length) ? so : so2;
        int[] min = (so.length<so2.length) ? so : so2;

        for(int i: max) {
            System.out.print(i+ " ");
        }
        System.out.println();
        for(int i: min) {
            System.out.print(i+ " ");
        }System.out.println();
        int result[] = new int[max.length];

        for(int i=0; i< max.length; i++){
            if(i <min.length){
                max[i] = max[i] + min[i];
            }

        }
        return max;
    }
}
public class Ex03_MethodCall_Array {
    public static void main(String args[]){
        Test t = new Test();
        int result = t.add(10,10);
        System.out.println("result : " +result);

        int[] array = {10,20,30};
        int[] resultarray = t.add2(array);

        for(int i: resultarray){
            System.out.println("i : " + i);
        }

        int[] array2 = {1,2,3,4,5};
        int[] array3 = {6,7,8};
        int[] resultarray2 = t.add3(array2,array3);

        for(int i:resultarray2){
            System.out.print(i + " ");
        }
    }
}
