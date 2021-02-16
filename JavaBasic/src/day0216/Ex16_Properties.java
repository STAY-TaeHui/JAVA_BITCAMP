package day0216;

import java.util.Properties;

/*
Map 인터페이스를 구현한 클래스.
특수한 목적을 가짐. 제너릭 타입이 강제되어 있음 <String,String>

사용목적
1. 고정된 경로
2. 공통 변수
3. 환경변수
4. 프로그램 버전
5. Database 연결정보
 */
public class Ex16_Properties {
    public static void main(String [] args){
        Properties prop = new Properties();
        prop.setProperty("admin","bit@bit.co.kr");
        prop.setProperty("Version","v.1.1.3");
        prop.setProperty("path","C://Desktop");

        System.out.println(prop.getProperty("admin"));
    }
}
