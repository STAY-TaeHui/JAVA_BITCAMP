package kr.or.bit;
//창문의 수를 가지고있다.
//속도를 가지고 있다.

//2가지 속성은 캡슐화 --> 캡슐화라는게 getter / setter를 만들어 간접
//속도는 마이너스 값이 오면 0으로 초기화

//속도를 10씩 올리거나 감소하는 기능을 만드세요
//기능호출시 10증가 / 10감소(엑셀)
//속도가 마이너스값을 가지면 0으로 초기화화
public class Car2 {
    private int window;
    private int speed;

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        if(speed<0){
            this.speed = 0;
        }
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public void upSpeed(){
        this.speed +=10;
    }
    public void downSpeed(){
        if(this.speed<0)
            this.speed -=10;
        else{
            this.speed=0;
        }
    }
}
