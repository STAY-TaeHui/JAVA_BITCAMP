package com.company;

/*
* 오류
* 1. 에러(error) : spxmdnjzm wkddo, apshal, gkemdnpdj
* 2. 예외(Exception) : 개발자의 코드실수에 의해 발생 >> 방어적인 코드 (에외처리)
* 개발시 예외가 발생하면 >> 프로그램이 강제 종료됨. >> 이걸 '비 정상적인 종료' 라고 함.
* 예외처리란? -> 예외가 발생하여도 프로그램이 종료되지 않게 처리하는 것.
*
* try{
*       >>문제가 발생할 수 있는 코드
*       >>문제가 발생하면 ...catch...
* }
* catch(Exception e{
*       >> 문제가 생기면 catch >> 문제를 파악
*
*       >> 처리 유도 하세요.
*       >> 1. 관리자에게 디메일을 보냄
*       >> 2. 로그파일에 예외 기록
*       >> 3. 강제 종료는 막는다.
*
*       >> 결국 개발자의 코드 수정이 필요하다...
* }
* finally{
*       >> 문제가 발생하던, 발생하지 않던 강제로 수행되어야 할 코드
*       >> ex) 데이터베이스 연결 해제제
* }
* */
public class Ex01_Exception {

    public static void main(String[] args) {
	// write your code here
        System.out.println("main start");

        try{
            System.out.println("문제발생 앞");
            System.out.println(0/0); // new ArithmeticException
            System.out.println("문제발생 뒤");
        }
        catch(Exception e){ // Exception 클래스는 ArithmeticException 의 부모 클래스이기 때문에 가능!!!(다형성)
            System.out.println("발생원인 : " +e.getMessage());
        }

        System.out.println("main end");
    }
}
