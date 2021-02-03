package kr.or.bit;
/*
   //privaste 변수
   //1. 가격
   //2. 브랜드
   //3. 시리얼넘버
   //4. 색깔

   //상태(인스턴스 변수)???
   //1. 절전모드 (boolean / 0,1)

   //부품
   //1. 본체
   2. 키보드
   3. 모니터

   //기능
   여러개....
*/

public class Computer {
   private int price;
   private String brand;
   private String serialNumber;
   private  String color;
    private String input;

   private boolean sleepingMode;

   public MainBody mb = new MainBody();
    public Computer(int price, String brand, String color) {
        this(price,brand,color,"A-119384");
    }
    public Computer(int price, String brand, String serialNumber, String color) {
        this.price = price;
        this.brand = brand;
        this.serialNumber = serialNumber;
        this.color = color;
    }

    public void inPut(String input) {
        System.out.println("입력하신 값은 : " + input);
        this.input = input;
    }
    public void outPut() {
        System.out.println("입력하신 값: " + input);
    }
   public void com_On(){
       System.out.println("컴퓨터를 시작합니다.(메인보드 전원 ON)");
        mb.setM_power(true);
   }
   public void com_Off(){
       System.out.println("컴퓨터를 종료합니다.(메인보드 전원 OFF)");
       mb.setM_power(false);
   }
    public void sleepingMode_on() {
        this.sleepingMode = true;
        System.out.println("절전모드가 켜졌습니다.");
    }
    public void sleepingMode_off() {
        this.sleepingMode = false;
        System.out.println("절전모드가 꺼졌습니다.");
    }
    public int caculrater(int num1, int num2) {
        int num = 0;
        System.out.printf("두 수의 합 : %d\n",  num=num1+num2);
        System.out.printf("두 수의 뺄셈 : %d\n",  num=num1-num2);
        System.out.printf("두 수의 곱셈 : %d\n",  num=num1*num2);
        System.out.printf("두 수의 나눗셈 : %d\n",  num=num1/num2);
        return num;
    }


}
class MainBody{
    private int m_price;
    private String m_brand;
    private String m_serial;
    private int cpu;//cpu 갯수
    private int mem;//기준 MB

    private  boolean m_power;

    public MainBody(){
        this.m_price = 200000;
        this.m_brand = "LG";
        this.cpu = 4;
        this.m_serial = "123ABC456EDF";
        this.mem = 16348;
    }

    public boolean isM_power() {
        return m_power;
    }

    public void setM_power(boolean m_power) {
        this.m_power = m_power;
    }
}
class Keyboard{
    private String led;
    private String button;
    private boolean button_on;
    private String brand;

    Keyboard(){
        this("blue","apple");
    }
    Keyboard(String led, String brand){
        this.led=led;
        this.brand=brand;
    }


    public void button(){
        button=(button_on==true) ? "전원이 켜졌습니다.":"전원이 꺼졌습니다.";
        System.out.println(button);
    }

    void print() {
        System.out.println(this.led+","+this.brand);
    }
}
class Monitor {

    private String LCD; // 액정
    private String holder; // 거치대
    private String brandname; // 브랜드
    private String button; // 버튼

    public String getLCD() {
        return LCD;
    }
    public void setLCD(String lCD) {
        this.LCD = lCD;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public String getBrandname() {
        return brandname;
    }
    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }
    public String getButton() {
        return button;
    }
    public void setButton(String button) {
        this.button = button;
    }
}