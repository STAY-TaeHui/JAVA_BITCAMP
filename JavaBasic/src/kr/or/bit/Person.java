package kr.or.bit;
/*
사원은 사번을 가지고 있고 사번은 숫자 데이터로 관리하려고한다.
사원은 이름을 가지고 있고 이름은 문자열 데이토롤 관리하려고 한다.
사원은 직종을 가지고 있다. 직조은 (IT, SALES)부서 드으이 데이터로 관리된다.
사원은 급여를 받는다. 급여는 숫자 데이터로 관리된다.
사원은 신체정보를 가지고 있다. 신체정보는 키와 몸무게 데이터로 관리된다.
 */
public class Person {
    public int p_Num; //default 0
    public String p_Name;//default null
    public String job;//default null
    public int p_Salary;//default null

    public BodyInfo bodyInfo;   //default null
                                //BodyInfo class의 키와 몸무게


}
