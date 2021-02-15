package kr.or.bit;

import java.util.Arrays;

//Stack 자료구조 설계
/*
저장공간 : Array : Object[] sarray
MyStack my = new MyStac(10); 기본적 배열생성  >> Object배열 10개 생성
위치정보!! pop과 push를 위해
기능 : push(Object), Object Pop, isEmpty, isFull?
 */
public class MyStack {
    int size; //maxsize
    static int count=0; //top
    private Object[] obj;


    public MyStack(){
        this(1);
    }
    public MyStack(int size){
        this.size = size;
        obj  = new Object[size];

        for(Object o : obj){
            o=new Object();
        }
    }

    public Object push(Object o){
        obj[count] = o;
        count++;
        return o;
    }
    public Object pop(){
        count--;
        return obj[count];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    public boolean isFull(){
        return (count == size);
    }

    @Override
    public String toString() {
        String tmp="[";
        for(int i=0; i<count; i++){
            tmp+=obj[i];
            if(i!=count-1){
                tmp+=", ";
            }
        }
            tmp+="]";
        return tmp;
    }


    /////////////////////////////////////////////
    //강사님 코드
/*
    private Object[] stackarr;
    private int maxsize;
    private int top;

    public Mystack(int maxsize){
    this.maxsize = maxsize;
    stackarr = new Object[maxsize];
    top=-1;
    }
    public boolean isEmpty(){
    return (top==-1);
    }
    public voolean isFull(){
    return (top==maxsize -1);
    }
    public void push(Object i){
    if(isFull()){
    System.out.println("stack full....");
    }else{
    stackarr[++top]=i;

 */





}
