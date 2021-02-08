package com.company;

public class Ex02_Exception {
    public static void main(String[]args){
        int num = 100;
        int result = 0;

        System.out.println("main Start");

        try{
            for(int i=0; i<10; i++){
            result = num / (int)(Math.random()*10);
            System.out.println("resutl : " + result + " i : " + i);
        }

        }catch (ArithmeticException e){//하위 예외(구체화된 예외)를 쓰는것이 좋다. Exception보단 Arithmetic
            System.out.println("문제가 발생시 로그기록하고 관리자에게 메일 발송");
            System.out.println("원인 : " + e.getMessage());
        }
        catch (NullPointerException e){

        }catch(Exception e ){ //상위예외(부모예외)를 나중에 써주는 것이 좋은코드 >> 가독성을 위해!!
            // ArithmeticException아니고 NullPointerException도 아니면 여기서 처리

        }

    }
}
