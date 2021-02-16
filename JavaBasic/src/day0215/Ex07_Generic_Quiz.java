package day0215;

import day0205.Ex13_Ingerit_Cart;
import kr.or.bit.Coin;

import java.util.ArrayList;
import java.util.Stack;

public class Ex07_Generic_Quiz {
    public static void main(String[] args){
        //1. Array를 사용해서 cart만들고 담기
//        Cart[] cart = new Cart[3];
//        //2. ArrayList를 사용해서  cart 만들고 담기
//
//        ArrayList<Cart> carts= new ArrayList<Cart>();
//        carts.add(new KtTv());

        //동전케이스
        //stack
        Stack<Coin> coinbox = new Stack<Coin>();
        coinbox.add(new Coin(100));
        coinbox.add(new Coin(50));
        coinbox.add(new Coin(500));
        coinbox.add(new Coin(10));

        while(!coinbox.isEmpty()){
            Coin coin = coinbox.pop();
            System.out.println("동전 : " + coin.getValue());
        }
    }
}
