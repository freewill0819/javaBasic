package chap15;

public class Practice6 {
    public static void main(String[] args) {
// 1번째 자동차 인스턴스 생성
        Car car1 = new Car("소나타", 1234, 10.0);
        // 2번째 자동차 인스턴스 생성
        Car car2 = new Car("K8", 6789);
// 2대의 차를 주행
        car1.run(7.0);
        car2.run(7.0);
// 2대의 차량정보 출력
        car1.showInfo();
        car2.showInfo();
    }
}
// 여기에 Car클래스 만듬

class Car{
    private String type;// 차종
    private int number;// 차번호
    private double gasoline;// 가솔린

    public Car(String type, int number, double gasoline){
        this.type = type;
        this.number = number;
        this.gasoline = gasoline;
    }

    public Car(String type, int number){
        this(type, number, 5.0);
    }

    public void showInfo(){
        System.out.println("차종: " + type + " 번호: " + number + " 가솔린: " + gasoline + "리터");
    }

    public void run(double need){

        if(gasoline >= need) {
            System.out.println("넘버 " + number + "의 " + type + "은 가솔린 " + need + "리터분 주행했습니다.");
            gasoline -= need; //주행한만큼 빼기
        }else{
            System.out.println("넘버 " + number + "의 " + type + "은 가솔린 " + need + "가솔린 부족때문에 주행할 수 없습니다.");
        }
    }
}
