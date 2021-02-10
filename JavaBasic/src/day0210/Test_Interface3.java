package day0210;
//스포츠게임 -> 도구에 따른 구현
//도구 -> HAND / FOOT -> 모두 쓰는것 - TOOL
    //도구 이름 함수
//선수 아웃
//구기종목 클래스 - 필요한 선수 수 / 운동 이름과 선수 수 출력 함수/
    // -> 네트 / 공 / 골 /
// 테니스 / 축구 / 야구 / 럭비
//심판
interface Hand{
    void handtool(String toolname);
}
interface Foot{
    void foottool(String toolname);
}
interface Tool extends Hand,Foot{

}
class BallGame{
    final int Max_Player;
    BallGame(int pn){
        Max_Player = pn;
    }
    void getPrint(BallGame b){
        System.out.println(b.toString() + " 의 운동 선수는 " +b.Max_Player + " 명 입니다.");

    }
}
class Net extends BallGame{

    Net(int pn) {//플레이어 수
        super(pn);
    }
}
class Ball extends BallGame{

    Ball(int pn) {
        super(pn);
    }
}
class Goal extends BallGame{

    Goal(int pn) {
        super(pn);
    }
}
class Tennis extends Net implements Hand{

    Tennis(int pn) {
        super(pn);
    }

    @Override
    public void handtool(String toolname) {
        System.out.println("용품 이름 : " + toolname);
    }

    @Override
    public String toString() {
        return "Tennis";
    }
}
public class Test_Interface3 {
    public static void main(String[] args){
            BallGame bg=new Tennis(2);
            bg.getPrint(bg);



    }
}
