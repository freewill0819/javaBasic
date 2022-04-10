package exam;

import java.util.Scanner;

public class Practice03296 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n; //정수 갯수
        int sum = 0; //합계
        int num;

        System.out.println("몇 개를 더할까요?");
        n = sc.nextInt();

        for(i = 1; i <= n; i++){
            System.out.println("정수: " );
            num = sc.nextInt();
            if ( sum + num > 1000){
                System.out.println("합계가 1000을 넘었습니다.");
                System.out.println("마지막 값은 무시합니다.");
                break;
            }
            sum += num;
        }
        System.out.println("합계는 " + sum + "입니다" );
        if(i !=0 )
        System.out.println("평균은 " + sum/n + "입니다.");
    }
}
