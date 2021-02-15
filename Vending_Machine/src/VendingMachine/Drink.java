package VendingMachine;

public abstract class Drink {
      private int price;
      private int number;

     Drink(int price){
         this.price = price;
     }

     int getPrice()
    {
        return this.price;
    }
    abstract void setPrice();
    abstract void getNumber();
     abstract void setNumber();
     abstract void taste();
     abstract void smell();
     Drink getSoda(){
         return new Soda(200);
     }
}

class Soda extends Drink {
    int price;

    Soda(int price){
        super(price);
        this.price = getPrice();
    }


    @Override
    void setPrice() {

    }

    @Override
    void getNumber() {

    }

    @Override
    void setNumber() {

    }

    @Override
    void taste() {

    }

    @Override
    void smell() {

    }

}

interface Carbonated{

    void carbonation();
}