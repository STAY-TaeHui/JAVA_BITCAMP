package kr.or.bit;

public class AirPlane2 {
    private int airnum;
    private String airname;
    private static int airtotalcount;

    public void makeAirPlane(int num, String name){

        this.airnum = num;
        this.airname = name;
        airtotalcount++;
        AirPlaneInfo();

    }

    private void AirPlaneInfo(){
        System.out.println("비행기이름 : " + this.airname + " , 번호 : " + this.airnum);
    }

    public void airPlaneTotalCount(){
        System.out.printf("비행기 누적대수 : [%d]\n", airtotalcount);

    }

}
