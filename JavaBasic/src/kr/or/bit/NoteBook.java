package kr.or.bit;

public class NoteBook {
    private String color;
    private int year;

    //직접할당을 막고 간접할당\
    //간접할당의 구현 (함수) >> 특수한 목적(setter, getter)
    //웬만하면 자동화 코드로 사용하기!

    public void setYear(int y){// ==> "setter함수" 캡슐화된 멤버필드에 값을 쓰는 함수
        if(y<=0){
            year = 1999;
        }
        else{
            year =y;
        }
    }
    public int getYear(){ // ==> "getter함수"
        return year;
    }
    //자동화


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //노트북은 마우스를 가지고 있다.
    public void  handle(Mouse m){
        m.x=100;
        m.y=200;
    }
    public void noteBookInfo(){
        System.out.println("color : " + color + " year : " + year);
    }
}
