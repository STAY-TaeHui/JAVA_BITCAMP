package day0204.OOP;
/*
쇼핑몰 >> 회원관리 / 배송관리 / 주문관리 / 상품관리... >> 각각의 설계도가 서로 관계가 있다.

여러개의 설계도 어떤 기준에서 나누고 합치고....

1. is ~ a -> ~은 ~이다 (부모를 뒤에 ) >> 상속관계
2. has ~ a -> ~은 ~를 가지고 있다 >> 포함관계

예 )
원 --- 도형   -> 원 is a 도형이다.( 상속 )
>> 원 extends 도형

원 --- 점    -> 원 is a 점 (X)
원 --- 점    -> 원 has a 점 (O) ( 포함 )
>> class 원 { 점 }

경찰 --- 권총   --> has a...
class 권총{}
class 경찰{
    void 출동(권총){}

원은 도형이다.
삼각형은 도형이다.
사각형은 도형이다.

도형 : 추상화, 일반화 >> 공통자원을 가져야 >> 그리다 / 색상
원 : 구체화 , 특수화 >> 본인이 가지는 특징 >> 반지름 / 한 점


 */
class Shape{
    String color = "gold";
    void drqw(){
        System.out.println("그리다");
    }
}
class Point{
    int x;
    int y;
    Point(){
//        this.x = 1;
//        this.y = 1;
        this(1,1);

    }
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}

/*
Practice
* 원을 만드세요( 원의 정의는 한 점과 반지름을 가지고 있다)
1. 원은 도형이다.
2. 원은 점을 가지고 있다. (member field >> Point)
3. 원은 반지름을 가지고 있다. -> 특수성 (반지름 - r)

원의 반지름은 초기값 10을 갖고
점의 좌표는 초기값 (10,15)를 갖고
초기값을 설정하지 않으면 반지름과 점의 값을입력받을 수 있다.
 */
class Circle extends Shape{
    Point point; //포함
    int r;      //원의 구체화, 특수성

    Circle(){
//        this.r = 10;
//        this.point = new Point(10,15);
//        this.(10, new Point(10,15));       -> this생성자는 . (마침표) 안씀
        this(10, new Point(10,15));
    }
    Circle(int r, Point point){
        this.r = r;
        this.point = point;
    }
}
/*
위에 만든것을 참조해서
삼각형 클래스를 만드시오.
삼각형은 3개의 점과 그리고 그리다라는 기능을 가지고 있다.
위에서 만든 Shape 와 Point를 제공받아 사용
//default 삼각형을 만들수 있고 / 3개의 점을 받아 그릴 수 있다.
 */
//60점 -> 그냥 했을때
// 80점 -> 반복 제거
//   100점 -> 객체배열 사용

class Triangle extends Shape{            //객체를 하나하나 사용
    Point x;
    Point y;
    Point z;

    Triangle() {                        //default Constructor
    //this.x = new Point(10,20);
    //this.y = new Point(30,40);
    //this.z = new Point(50,60);
    this(new Point(10,20),new Point(30,40),new Point(50,60));
}

    Triangle(Point x, Point y , Point z) {  //Point 객체 3개를 받는 Constructor
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //구체화 , 특수화
    //추가적인 기능 언제나 가능
    void trianglePoint() {
        System.out.printf("x : (%d,%d)\t",x.x,x.y);
        System.out.printf("y : (%d,%d)\t",y.x,y.y);
        System.out.printf("z : (%d,%d)\t",z.x,z.y);
        System.out.println();
    }
}
class Triangle_Array extends Shape{//       ******객체배열을 멤버필드로 사용 ******
    Point[] point;

    Triangle_Array(){                       //default Constructor
/*
		this.pointarray = new Point[3];
		pointarray[0] = new Point(10,20);
		pointarray[1] = new Point(30,40);
		pointarray[2] = new Point(50,60);
		this(this.pointarray);
		*/
        this(new Point[]{new Point(10,20),new Point(30,40),new Point(50,60)});

    }
    Triangle_Array(Point[] point){          //Point객체 배열을 사용한 Constructor
         this.point = point;

    }
    void trianglePoint(){
        for(Point point : this.point){
            System.out.printf("point : [%d, %d]\t\n",point.x,point.y);
        }
    }
}
public class Ex02_inherit_Composition {
    public static void main(String[] args){
        System.out.println("-------- DEFAULT 생성자 Circle --------");
        Circle circle = new Circle();
        System.out.println("반지름 : " + circle.r);
        System.out.println("부모자원" + circle.color);
        System.out.println("좌표 x" + circle.point.x);
        System.out.println("좌표 y "+ circle.point.y);
        circle.drqw();

        System.out.println("-------- Overloading 생성자 Circle --------");

        Circle circle1 = new Circle(20, new Point(50,100));
        System.out.println("반지름 : " + circle1.r);
        System.out.println("부모자원" + circle1.color);
        System.out.println("좌표 x" + circle1.point.x);
        System.out.println("좌표 y "+ circle1.point.y);
        circle.drqw();

        System.out.println("----------- DEFAULT 생성자 Triangle ---------");

        Triangle triangle = new Triangle();
        triangle.trianglePoint();
        triangle.drqw();
        System.out.println("----------- Overloading 생성자 Triangle ---------");

        Triangle triangle2 = new Triangle(new Point(1,2),new Point(3,4),new Point(5,6));
        triangle2.trianglePoint();
        triangle2.drqw();

        System.out.println("----------- DEFAULT 생성자 Triangle_Array ---------");


        Triangle_Array triangle_arr = new Triangle_Array();
        System.out.println("color : " +triangle_arr.color);
        triangle_arr.trianglePoint();

        System.out.println("----------- Overloading 생성자 Triangle_Array ---------");
        Point[] points = new Point[]{new Point(1,2),new Point(3,4),new Point(5,6)};
        Triangle_Array triangle_arr2 = new Triangle_Array(points);
        triangle_arr2.trianglePoint();
    }
}
