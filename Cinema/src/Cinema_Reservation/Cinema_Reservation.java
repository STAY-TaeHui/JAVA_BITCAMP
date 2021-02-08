package Cinema_Reservation;

import java.util.Scanner;

public class Cinema_Reservation {
    private  final int ROW=4;
    private  final int COL=5;

    public  Scanner sc = new Scanner(System.in);
    private  int [][] seat=new int [ROW][COL];

    public Cinema_Reservation(){              //생성자를 통해 좌석 초기화
        for(int i=0; i< ROW; i++){
            for(int j=0; j<COL; j++){
                seat[i][j] =0;
            }
        }
    }


    public int menuChoice(){
        System.out.println("*********************************");
        System.out.println("**********영화예매 시스템**********");
        System.out.println("*********************************");

        System.out.println(" 1. 예매하기");
        System.out.println(" 2. 예매조회");
        System.out.println(" 3. 예매취소");
        System.out.println();
        printSeat();

        int menu=0;

        do{
            try {
                menu =  sc.nextInt();
                sc.nextLine();
                if (menu < 1 || menu > 3) {
                    throw new Exception("메뉴의 선택 번호가 잘못되었습니다.");
                }
                else{
                    break;
                }
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("메뉴 1~3번까지 입력해주세요.");
            }
        }
        while (true);
        return menu;

    }
    public void menuCase(){
        while(true) {
            switch (menuChoice()) {
                case 1: {
                    System.out.println("case 1");
                    reserveSeatCheck();
                    break;
                }
                case 2: {
                    System.out.println("case 2");
                    printSeat();
                    break;

                }
                case 3: {
                    System.out.println("case 3");
                    System.out.println("예매취소");
                    System.exit(0);
                }
            }
        }
    }

    public void reserveSeatCheck(){//좌석 예매되어있는지 체크
        int input_Row=0;
        int input_Col=0;

      loop:  while(true){
        System.out.println("좌석을 선택해주세요. 예) 1-1");
        System.out.println("이미 예약된 좌석은 \"예매\"라고 표시됩니다.");
            String seatNum = sc.nextLine();       //밑에서 2번눌렀을때 sc.nextLine()에 ""가 들어가는 에러
            try{
                String [] row_col = seatNum.split("-");//-> ["1"] "-" ["1"]
                if(row_col.length<2){ //
                    throw new Exception();
                }
                input_Row = Integer.parseInt(row_col[0]); // ==> 0~3 정수 1
                input_Col = Integer.parseInt(row_col[1]); // ==> 0~4 정수 1
            }
            catch(Exception e){
                System.out.println("좌석번호를 확인하고 입력해주세요...");
//                continue;
            }
            System.out.println(input_Row + " " + input_Col);
        }
    }
    public   int reserveMenuChoice(int input_Row, int input_Col){

            int reserve_Option=0;
            System.out.println("예약 가능합니다. 예매하시겠습니까?");
            System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");
            reserve_Option = sc.nextInt();
            try{
                if(reserve_Option>=0 && reserve_Option<=2){
                    switch (reserve_Option){
                        case 1 :{
                            reserveSeat(input_Row,input_Col);//좌석 예매하기
                            break;
                        }
                        case 2: {
                            System.out.println("좌석선택 화면으로 돌아갑니다.");
                            return 2;
                        }
                        case 3 : {
                            System.out.println("초기화면으로 돌아갑니다.");
                            return 3;
                        }
                    }
                }
                else{
                    throw new Exception("올바른 번호를 입력해주세요.");
                }
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
        return 0;
    }
    public  void reserveSeat(int input_Row,int input_Col){
        System.out.println("RESERVESEAT잉ㅂ니다");
    }
    public void cancleSeat(int input_Row,int input_Col){

    }

    public  void printSeat(){//좌석 조회
        for(int i=0; i< ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print((seat[i][j]==0)?"["+(i+1)+"-"+(j+1)+"]":"예매");
            }
            System.out.println();
        }
    }
}
