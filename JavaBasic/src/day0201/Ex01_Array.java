package day0201;

public class Ex01_Array {
    public static void main(String[] args){
        int[][] score3 = new int[][]{
                {11,12},
                {13,14},
                {15,16}
        };

            for(int[] i : score3){
                for(int j:i) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }

    }
}
