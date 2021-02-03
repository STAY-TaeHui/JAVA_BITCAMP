package kr.or.bit;

class AirPlane {// ==> default 접근지정자
    private int airnum;
    private String airname;
    private static int airtotalCount;

    public AirPlane(int airnum, String airname){
    this.airname = airname;
            this.airnum = airnum;
            airtotalCount++;
    }
}
