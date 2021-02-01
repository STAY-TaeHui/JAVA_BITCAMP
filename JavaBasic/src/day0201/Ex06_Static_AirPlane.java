package day0201;

import kr.or.bit.AirPlane2;

public class Ex06_Static_AirPlane {
    public static void main(String args[]){
        AirPlane2 air = new AirPlane2();
        air.makeAirPlane(707, "대한");

        AirPlane2 air2 = new AirPlane2();
        air2.makeAirPlane(708, "대한");

        air2.airPlaneTotalCount();

        AirPlane2 air3 = new AirPlane2();
        air3.makeAirPlane(709, "대한");
        air2.airPlaneTotalCount();


    }
}
