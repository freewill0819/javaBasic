package chap20Practice;

public class Practice3 {
    public static void main(String[] args) {
// 선수 배열 객체 생성
        Athlete[] athlete = {

                new Swimmer( "홍길동" ),
                new MarathonRunner( "이순신" ),
                new Swimmer( "이빛나" ),
                new MarathonRunner( "김선두" )
    };
// 자기 소개
        for ( int i = 0 ; i < athlete.length; i++) {
        System.out.println(athlete[i]);
}
        System.out.println();
// 여기에서 일하십시오.
// 운동 선수의 종목에 따라 메소드 실행

        for(int i = 0 ; i < athlete.length; i++){
            if (athlete[i] instanceof Swimmer){
                ((Swimmer)athlete[i]).swim();
            } else if (athlete[i] instanceof MarathonRunner){
                ((MarathonRunner)athlete[i]).run();
            }else{
                System.out.println("알수없음");
            }
        }
    }
}
    // Athlete 추상 클래스
abstract class Athlete {
// 선수명
    protected String name;
    // 종목명 취득 메소드(추상 메소드)
    public abstract String getType();

    @Override
    public String toString() {
        return "내 이름은 " + name + ", " + getType() + " 선수입니다." ;
    }
}

class Swimmer extends Athlete{
    public static final String TYPE = "수영";

    public Swimmer(String name){
        this.name= name;
    }

    public String getType(){
        return TYPE;
    }

    public void swim(){
        System.out.println(name + " 수영합니다");
    }
}

class MarathonRunner extends Athlete{
    public static final String TYPE = "마라톤";

    public MarathonRunner(String name){
        this.name = name;
    }

    public String getType(){
        return TYPE;
    }

    public void run(){
        System.out.println(name + " 달립니다.");
    }
}
