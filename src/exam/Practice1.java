package exam;

public class Practice1 {
     public static void main(String[] args) {
// 투수객체 생성
        Pitcher p = new Pitcher("홍길동", 99, 0.09, 2.13); // 투수 소
        p.introduce();
    } }
// 야구선수 클래스
    class BaseballPlayer {
        // 선수명
        protected String name;
        // 등번호
        protected int uniformNumber;
        // 타율
        protected double battingAverage;
    }

// 여기에 Pitcher클래스 만들기

class Pitcher extends BaseballPlayer{
    double era;

    public Pitcher(String name, int uniformNumber, double battingAverage, double era){
        this.name = name;
        this.uniformNumber = uniformNumber;
        this.battingAverage = battingAverage;
        this.era= era;
    }

    public void introduce(){
        System.out.println("선수명: " + name);
        System.out.println("등번호: " + uniformNumber);
        System.out.println("타율: " + battingAverage);
        System.out.println("방어율: " + era);
    }

}
