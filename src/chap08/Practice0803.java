package chap08;

import java.util.Scanner;

public class Practice0803 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        double ave = 0.0;
        int[] score = new int[5];

        for(int i = 0; i<score.length; i++){
            System.out.println((i+1) + " 입력:");
            score[i] = sc.nextInt();
        }
        for(int i = 0; i<score.length; i++){
            sum += score[i];
        }

        ave = (double) sum / score.length;

        System.out.print("합계: " + sum);
        System.out.print("평군: " + ave);
    }
}
