package kr.or.bit;


 public class Cart {//Product
        int price;
        int bonuspoint;


    Cart(int price){
            this.price = price;
            this.bonuspoint = (int)(price * 0.1);
        }

}
    class KtTv1 extends Cart {
        KtTv1(){
            super(500);
        }
        @Override
        public String toString(){//부모클래스의 재정의를 했기떄문에 접근가능
            return "KtTv";
        }
    }
    class Audio1 extends Cart {
        Audio1(){
            super(100);
        }
        @Override
        public String toString(){
            return "Audio";
        }
    }
    class NoteBook1 extends Cart {
        NoteBook1(){
            super(100);
        }
        @Override
        public String toString(){
            return "NoteBook";
        }
    }

    //구매자
 class Buyer1{
     final int MAX = 10;
        int money=1000;
        int bonuspoint;
        int totalprice;
        int count;
        Cart [] cart;

        Buyer1(){
            cart = new Cart[MAX];
        }

        void summary(){
            for(int i=0; i<=count; i++){
                System.out.printf("구매내역 [%d] : %s)",count+1, cart[i]);

            }
            System.out.println("총 구매 금액은 : " + totalprice);
        }
        void Buy_in_Cart(Cart n){
            cart[count] = n;
            this.totalprice += n.price;
        }


        void Buy(Cart n){
            if(this.money < n.price){
                System.out.println("고객님 잔액이 부족합니다....");
                System.out.println("잔액 : " + this.money);
                return ;
            }
            else{
                this.money -= n.price;
                this.bonuspoint += n.bonuspoint;
                System.out.println("구매한 물건은 " + n.toString());
                Buy_in_Cart(n);
                count++;
            }
        }

        //구매자는 구매행위를 할 수 있다. >> ( 기능 )
        //********* 구매자는 매장에 있는 모든 물건을 구매할 수 있다.
    /*근데 문제가 있는게 1000가지 제품이 생겼다면 3개제푸만 구매할 수 있을것임
    void KttvBuy(KtTv n){
        if(this.money < n.price){
            System.out.println("고객님 잔액이 부족합니다....");
            System.out.println("잔액 : " + this.money);
            return ;
        }
        else{
            this.money -= n.price;
            this.bonuspoint += n.bonuspoint;
            System.out.println("구매한 물건은 " + n.toString());
        }
    }
    void Audio(Audio n){
        if(this.money < n.price){
            System.out.println("고객님 잔액이 부족합니다....");
            System.out.println("잔액 : " + this.money);
            return ;
        }
        else{
            this.money -= n.price;
            this.bonuspoint += n.bonuspoint;
            System.out.println("구매한 물건은 " + n.toString());
        }
    }
    void NoteBook(NoteBook n){
        if(this.money < n.price){
            System.out.println("고객님 잔액이 부족합니다....");
            System.out.println("잔액 : " + this.money);
            return ;
        }
        else{
            this.money -= n.price;
            this.bonuspoint += n.bonuspoint;
            System.out.println("구매한 물건은 " + n.toString());
        }
    }*/


        // 2차 개선 : 하나의 여러가지 기능
        //반복되는 코드....
        //다형성을 사용
        //Product p;
        //KtTv t = new KtTv();
        //p = t;


    }
