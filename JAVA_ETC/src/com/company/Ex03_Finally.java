package com.company;

import java.io.IOException;

/*
*
* */
public class Ex03_Finally {
    static void startInsatall(){
        System.out.println("INSTALL");
    }
    static void copyFiles(){System.out.println("COPY FILES");}
    static void fileDelete(){System.out.println("FILE DELETE");}
    public static void main(String[] args){
        //예외를 사용자가 필요에 따라서 강제로 만들 수 있다.

        //throw new IOException()

        try{
            copyFiles();
            startInsatall();

            throw new IOException("install 도중 문제 발생");

//            throw new ArithmeticException("ARITHMETIC EXCEPTION");
        }
        catch (IOException e){
            System.out.println("예외 메시지 출력 : " + e.getMessage());
            return;
        }
//        catch(Exception e){
//            System.out.println("예외 메시지 출력 : " + e.getMessage());
//        }
        finally {
            //함수 강제종료 (return)
            //예외적으로 return에 의해 종료되기 전에 호출이 됨.
            fileDelete();
            System.out.println("FINALLY");
        }


    }
}
