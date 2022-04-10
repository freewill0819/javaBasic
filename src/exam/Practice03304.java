package exam;

import java.util.Random;
import java.util.Scanner;

public class Practice03304 {

    static int random(int a, int b){
        if(b <= a){
            return a;
        }else{
            Random random = new Random();
            return a + random.nextInt(b-a+1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("난수 생성");
        System.out.print("하한값: "); int min = sc.nextInt();
        System.out.print("상한값: "); int max = sc.nextInt();

        System.out.print("생성한 난수: "+ random(min,max));
    }
}
