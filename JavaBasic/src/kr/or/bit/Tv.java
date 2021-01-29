package kr.or.bit;
/*|Tv설계도 요구사항 정의
Tv
*/
public class Tv {
    public int ch; //default 0;
    public String brandName;

    public void ch_Up(){
        ch++;
    }
    public void ch_Down(){
        ch--;
    }
    public void tv_Info(){
        System.out.printf("[%s] , [%d] ",brandName, ch);
    }
}
