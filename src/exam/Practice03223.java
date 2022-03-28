package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Practice03223 {

    public static void main(String[] args) {

        int num2 = 2;
        int[] num;
        num = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("숫자 입력: ");
            num[i] = sc.nextInt();
            num[i] = num[i]*num2;

        }
        System.out.println(Arrays.toString(num));
    }
}