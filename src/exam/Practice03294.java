package exam;

import java.util.Random;
import java.util.Scanner;

public class Practice03294 {
    public static void main(String[] args) {
        int i = 0;
        int num;
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int a = random.nextInt(90) + 10;

        do {
            System.out.println("어떤 숫자일까? ");
            num = sc.nextInt();

            if (a > num) {
                System.out.println("더 큰 숫자 입니다");
            } else if (a < num) {
                System.out.println("더 작은 숫자 입니다");
            }
            i++;}
        while( a != num);{
            System.out.println("정답입니다.");
        }
    }
}
