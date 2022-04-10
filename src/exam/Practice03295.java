package exam;

import java.util.Scanner;

public class Practice03295 {
    public static void main(String[] args) {

        double sum = 0;
        int i = 0;
        int n;
        Scanner sc = new Scanner(System.in);


        System.out.println("숫자를 입력하세요: ");
        n = sc.nextInt();

        for( i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다");
    }
}
