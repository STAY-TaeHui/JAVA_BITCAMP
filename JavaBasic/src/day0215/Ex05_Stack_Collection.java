package day0215;

import kr.or.bit.MyStack;

import java.util.Stack;

/*
JAVA API
Stack / Queue 제공

 */
public class Ex05_Stack_Collection {
    public static void main(String[] args){
        Stack s = new Stack<>(  );
        System.out.println(s.push("A"));
        s.push("B");

        System.out.println(s.pop());
        System.out.println(s.pop());

        MyStack ms = new MyStack(10 );
        System.out.println(ms.isEmpty());
        System.out.println(ms.push(1));
        System.out.println(ms.push(2));
        System.out.println(ms.push(3));
        System.out.println(ms.push(4));
        System.out.println(ms.push(5));
        System.out.println(ms.push(6));
        System.out.println(ms.push(7));
        System.out.println(ms.push(8));
        System.out.println(ms.push(9));
        System.out.println(ms.push(10));
        System.out.println(ms.isFull());


        System.out.println(ms);
        System.out.println(ms.pop());
        System.out.println(ms);
        System.out.println(ms.pop());
        System.out.println(ms);
        System.out.println(ms.isEmpty());
    }
}
