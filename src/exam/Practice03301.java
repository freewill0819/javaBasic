package exam;

import java.util.Scanner;

public class Practice03301 {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        System.out.println("학급 수:");
        int Class = sc.nextInt();
        int[] sum = new int[Class];
        int[][] array = new int[Class][];
        int st = 0;

        for (int i = 1; i <= Class; i++){
            System.out.print(i +"반의 학생 수: ");
            st = sc.nextInt();
            array[i-1] = new int[st];
            for(int j = 1; j <= st; j++){
                System.out.print(i+"반 " + j + "번의 점수: ");
                array[i-1][j-1] = sc.nextInt();

                sum[i-1] += array[i-1][j-1];
            }
            System.out.println();
        }
        int totalsum1 = 0;
        double totalsum2 = 0;
        for(int i = 0; i < Class; i++){
            totalsum1 += sum[i];
            totalsum2 +=(double)sum[i]/array[i].length;
        }
        System.out.println(" 반 | 합계 평균");
        System.out.println("------------------");
        for (int i = 0; i < Class; i++){
            System.out.printf("%2d%6d%6.1f\n" ,(i+1), sum[i], (double)sum[i]/array[i].length);
        }
        System.out.println("-------------------");
        System.out.printf("합: %4d%6.1f ",totalsum1,totalsum2/Class);
    }
}
