package chap20Practice;

public class Practice2 {
    public static void main(String[] args) {
// 센터 포워드 객체 생성
        SoccerPlayer fwd = new CenterForward( "홍길동" , 11 );
// 자기 소개
        System.out.println(fwd);
        // 공을 처리
        fwd.kickBall();
        fwd.catchBall();
        System.out.println();
// 골키퍼 객체 생성
        SoccerPlayer keeper = new GoalKeeper( "이순신" , 12 );
// 자기 소개
        System.out.println(keeper);
// 공을 처리
        keeper.kickBall();
        keeper.catchBall();
    }
}
// 여기 축구 선수 추상 클래스을 만드세요.
abstract class SoccerPlayer {

    private String name;

    private int uniformNumber;

    public SoccerPlayer(String name, int uniformNumber){

        this.name = name;
        this.uniformNumber = uniformNumber;

}

public String getName(){
        return name;
}

public void kickBall(){
    System.out.println(name + "이 공을 찬다");
}

public void  catchBall(){
    System.out.println(name + "이 공을 잡다");
}

public abstract String getPositionName();

    @Override
    public String toString(){
        return getPositionName() + " " + name + ", 등번호: " + uniformNumber;
    }
}

class CenterForward extends SoccerPlayer{
    public static final String POSITION_NAME= "센터포워드";

    public CenterForward(String name, int uniformNumber){
        super(name, uniformNumber);
    }

    public String getPositionName(){
        return POSITION_NAME;
    }
}

class GoalKeeper extends SoccerPlayer{
    public static final String POSITION_NAME = "골키퍼";

    public GoalKeeper(String name, int uniformNumber){
        super(name, uniformNumber);
    }

    public String getPositionName(){
        return POSITION_NAME;
    }

    @Override
    public void catchBall(){
        System.out.println(getName() + "은 공을 손으로 받았다.");
    }
}