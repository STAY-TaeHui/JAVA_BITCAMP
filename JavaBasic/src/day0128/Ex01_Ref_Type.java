package day0128;

import kr.or.bit.BodyInfo;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {
    public static void main(String args[]){
        Tv tv = new Tv();
        tv.brandName = "비트";
        tv.ch_Up();tv.ch_Up();tv.ch_Up();tv.ch_Up();tv.ch_Up();

        tv.tv_Info();

//------------------------------------------------------------------//

        //사원 1명 생성
        //사번: 7788, 이름 : 김유신, 부서 : IT, 급여 : 1000
        //신체정보는 키 : 190, 몸무게 40

        Person person = new Person();

        person.p_Num = 7788;
        person.p_Name = "김유신";
        person.job = "IT";
        person.p_Salary = 1000;

//        방법 1 ==> 스택에는 생성되지 않음
        person.bodyInfo = new BodyInfo();
        person.bodyInfo.height = 190;
        person.bodyInfo.weight = 40;
        //방법2 ==> 스택에 info가 생겨 총 2개가 생김
//        BodyInfo info = new BodyInfo();
//        info.weight = 40;
//        info.height = 190;
//        person.bodyInfo = info;

    }
}
