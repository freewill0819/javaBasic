package Practice3;

public class Practice {
    public static void main(String[] args) {

        // 일반 시계 객체 생성
        Clock c1 = new Clock(10, 15, 30); // 일반 시계정보 표시
        c1.showData();
        System.out.println();
        // 알람시계 객체 생성
        AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);
        // 알람 시계 정보 표시
        c2.showData();
    }
}
