package day0129;

import kr.or.bit.Car;

/*
클래스 == 설계도 == 데이터 타입(사용자 정의)

클래스 구성 요소 : [필드(속성) + 함수(기능) ] + 생성자 함수
 * feild >> 고유데이터, 상태데이터, 부품데이터(참조 정보) >> 변수
 * function >> 기능 행위 >> 최소단위(1개의 기능)
 * 추가적으로 생성자 함수 >> member field 초기화 목적

 클래스 , 필드 , 생성자 , 함수 : 어느 곳에 위치하느냐가 중요!(scope)

 >> public , private, default, protected

 1. public class Car{}
 2. class AirPlane{} >> default가 생략되어있음
    >> default ==> 같은 폴더(패키지)에서만 접근 가능
    >> default는 연습목적
    >> program 같은 폴더(패키지)안에 있는 클래스는 사용가능.

 3. 하나의 물리적인 자바파일은 여러개의 클래스를 가질 수 있다.
 Ex-1_main.java >> 여러개의 클래스 가능 >> 단, Ex01_main 클래스만 public을 가져야 한다. >> 나머지 class는 모두 default
 */
//class Test{     //default class
//    int data;   //접근 제한자 : default;
//
//}
public class Ex01_main {
    Car car = new Car();

    //AirPlane airplane = new AirPlane  => 접근자 public이 아니고 default이기 떄문에 접근 불가능

}
