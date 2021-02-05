package day0205;

class Product{
    int price;
    int bonuspoint;

    Product(int price){
        this.price = price;
        this.bonuspoint = (int)(price * 0.1);
    }

}
class KtTv extends Product{
    KtTv(){
        super(500);
    }
    @Override
    public String toString(){//부모클래스의 재정의를 했기떄문에 접근가능
        return "KtTv";
    }
}
class Audio extends Product{
    Audio(){
        super(100);
    }
    @Override
    public String toString(){
        return "Audio";
    }
}
class NoteBook extends Product{
    NoteBook(){
        super(100);
    }
    @Override
    public String toString(){
        return "NoteBook";
    }
}

//구매자
class Buyer{
    int money=1000;
    int bonuspoint;
    void Buy(Product n){
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

public class Ex12_Inherit_KeyPoint {
    public static void main(String [] args){
        KtTv kttv = new KtTv();
        Audio audio = new Audio();
        NoteBook notebook = new NoteBook();

        Buyer buyer = new Buyer();
//        buyer.KttvBuy(kttv);
//        buyer.Audio(audio);
//        buyer.NoteBook(notebook);
//        buyer.KttvBuy(kttv);
        buyer.Buy(kttv);
        buyer.Buy(audio);
        buyer.Buy(notebook);
        buyer.Buy(kttv);





    }
}
