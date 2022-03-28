package exam;

import java.util.Scanner;

public class Practice03222 {
    public static void main(String[] args) {

        int sum = 0;
        int[] num;
        num = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < num.length; i++){
            System.out.println("숫자 입력: ");
          num[i] = sc.nextInt();
          sum = sum+num[i];
        }
        System.out.println("평균은: "+(sum/ num.length));
    }
}
