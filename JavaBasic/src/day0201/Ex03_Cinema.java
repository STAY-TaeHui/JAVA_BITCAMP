package day0201;

public class Ex03_Cinema {
    public static void main(String args[]){
        String[][] seat = new String[3][5];

        for (int i = 0; i<seat.length; i++){
            for(int j=0; j<seat[i].length; j++){
                seat[i][j] = "__";//좌석
                System.out.print(seat[i][j]+" ");
            }
            System.out.println();
        }

        seat[2][1] = "홍길동";
        seat[0][0] = "김유신";

        for (int i = 0; i<seat.length; i++){
            for(int j=0; j<seat[i].length; j++){
                System.out.printf("[%s]", seat[i][j].equals("__")?"좌석":"예매");
            }
            System.out.println();
        }

        int row, col;
        row=2;
        col=1;
        if(seat[row][col].equals("__")){
            System.out.println("예약 가능한 좌석입니다.");
        }
        else{
            System.out.println("이미 예약되어 있습니다.");
        }


    }

}
