package exam;

import java.util.Scanner;

public class Practice03291 {
    public static void main(String[] args) {
    /*    int a = 12;
        int b = 3;
        System.out.println("두 값의 차이는 " +(a-b)+ "입니다.");
     */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a: "); int a = sc.nextInt();
        System.out.print("정수 a: "); int b = sc.nextInt();

        int diff = a>=b ? a-b : b-a;

        System.out.println("두 값의 차이는 " +diff+ "입니다.");
    }
}
