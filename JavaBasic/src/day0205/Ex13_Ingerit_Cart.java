package day0205;

 class Cart {//Product
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
    int money;
    int bonuspoint;
    int totalprice;
    int count;
   Cart[] cart;

    Buyer1(){
        this(10000);

    }
    Buyer1(int money){
        this.money = money;
        cart = new Cart[10];
    }

    void summary(){
        for(int i=0; i<count; i++){
            System.out.printf("구매내역 (%d) >> %s   금액 : [%d]\n",i+1, cart[i],cart[i].price);

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
        else if(count>=10){
            System.out.println("장바구니의 빈자리가 없습니다... 그만사세요...");
            return ;
        }
        else{
            this.money -= n.price;
            this.bonuspoint += n.bonuspoint;
//            System.out.println("구매한 물건은 " + n.toString());
//            Buy_in_Cart(n);
            cart[count++] = n;
            this.totalprice += n.price;
//            count++;
        }
    }
}

public class Ex13_Ingerit_Cart {
    public static void main(String [] args){

        KtTv1 kttv = new KtTv1();
        Audio1 audio = new Audio1();
        NoteBook1 notebook = new NoteBook1();

        Buyer1 buyer1 = new Buyer1(50000);
//        buyer1.Buy(kttv);
        buyer1.Buy(audio);
        buyer1.Buy(notebook);
        buyer1.Buy(notebook);
        buyer1.Buy(notebook);
        buyer1.Buy(audio);
        buyer1.Buy(audio);
        buyer1.Buy(audio);
        buyer1.Buy(audio);
        buyer1.Buy(audio);
        buyer1.Buy(audio);

        buyer1.Buy(kttv);

        buyer1.summary();

    }
}
