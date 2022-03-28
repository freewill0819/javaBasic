package chap05;

public class DecrementOperator {
    public static void main(String[] args){
        //감소에 대한 값을 관리하는 변수 초기화
        int num = 9;

        System.out.println("====전치 감소====");
        System.out.println(num); //초기 값 출력
        System.out.println(--num); //감소 후 출력
        System.out.println(--num); //감소 후 출력
        System.out.println(num);  //전치감소 후 값 표시

        //증가에 대한 값을 관리하는 변수 다시 초기화
        num = 3;

        System.out.println("==== 후치 감소 ====");
        System.out.println(num);    //초기값 출력
        System.out.println(num--); //감소 후 더함
        System.out.println(num--); //감소 후 더함
        System.out.println(num);    //후치 증가후 값 출력
    }
}
