package day0201;

import kr.or.bit.Car;
import kr.or.bit.Car2;
import kr.or.bit.Mouse;
import kr.or.bit.NoteBook;

public class Ex03_1_MethodCall {
    public static void main(String args[]){
        NoteBook notebook = new NoteBook();
        notebook.setColor("red");
        notebook.setYear(-2000);

        System.out.println(notebook.getColor());
        System.out.println(notebook.getYear());

        Mouse mouse = new Mouse();
        notebook.handle(mouse);
        System.out.println(mouse.x);
        System.out.println(mouse.y);

        //notebook 3대 생성
        //2000, red
        //2010, blue
        //2020, white
        //명시하고 정보 출력하기

        //TODAY POINT
        //객체 배열은 [방의 생성]과 [객체 생성] 2번 작업
        NoteBook[] notebookArr = new NoteBook[3]; //=> 여기가 배열을 생성해주면서 방을 생성
        notebookArr[0] = new NoteBook();          // => 여기부터 객체 하나씩 생성
        notebookArr[1] = new NoteBook();
        notebookArr[2] = new NoteBook();

        notebookArr[0].setYear(2000);
        notebookArr[0].setColor("red");
        notebookArr[0].noteBookInfo();

        notebookArr[1].setYear(2010);
        notebookArr[1].setColor("blue");
        notebookArr[1].noteBookInfo();

        notebookArr[2].setYear(2020);
        notebookArr[2].setColor("white");
        notebookArr[2].noteBookInfo();

        //2번째 방법
        NoteBook[] notebookArr2 = new NoteBook[] {new NoteBook(),new NoteBook(),new NoteBook()};

        //3번째 방법 - 사용빈도가 제일 높음( int arr[]  = {1,2,3}
        NoteBook[] notebookArr3 = {new NoteBook(),new NoteBook(),new NoteBook()};


        for(int i=0; i<notebookArr.length; i++){
            notebookArr[i].noteBookInfo();
        }

        for(NoteBook i: notebookArr){
            i.noteBookInfo();
        }

        Car2 car = new Car2();
        car.upSpeed();
        car.upSpeed();

        System.out.println(car.getSpeed());

        car.downSpeed();
        car.downSpeed();
        car.downSpeed();
        car.downSpeed();
        System.out.println(car.getSpeed());
    }
}
