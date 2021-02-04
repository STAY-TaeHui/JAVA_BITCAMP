package day0204.OOP;
/*
Today Point
[ 상속관계 ]에서 override : 상속관계에서 자식이 부모의 함수를 [ 재정의 ]
[ 상속관계 ]에서 [ 자식 클래스 ] 가 [ 부모 클래스 ]의 함수의 내용을 바꾼다. { 재정의 }
재정의 : 틀의 변화는 없고 ( 함수의 이름, 타입, parameter ) 내용만 변화
 */
class Point2{
    int x=4;
    int y=5;
    String getPosition(){
        return this.x + " / " + this.y;
    }
}
class Point3D extends Point2{
    int z = 6;
    //아... 이거 재정의이긴 한데 뭐라 명시해줄수가 없네...
    //Annotation은 Java code만으로 전달할 수 없는 부가적인 정보를 컴파일러나 개발툴로 전달할 수 있다.
    //해당 메서드 위에 쓰자.
    //@@@면접때 정말중요하다.@@@
    //Overloading -> 하나의 이름으로 여러가지 기능을 하는것
    //Override -> 상속관계에서 부모클래스의 함수를 재정의 하는것 이다.
    @Override   // -> Annotation!!!! 지금 이 함수가 정말 재정의 맞게 되었는지 확인해봐라
    String getPosition(){
        return this.x + " / " + this.y + " / " + this.z;
    }
}
public class Ex04_Inherit_Override {
    public static void main(String[] args){
        Point3D p3 = new Point3D();
        String result = p3.getPosition();
        System.out.println(result);

    }
}
