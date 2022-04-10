package exam;

import java.util.Random;
import java.util.Scanner;

public class Practice03298 {
    static Scanner sc = new Scanner(System.in);
    //계속 할지 안할지
    static boolean confirmRetry(){
        int cont;
        do{
            System.out.println("다시 한번? Yes -0/No -1");
            cont = sc.nextInt();
        }while(cont != 0 && cont !=1);
        return cont ==1;
    }
    public static void main(String[] args) {

        Random random = new Random();

        System.out.println("암산 훈련");
        do{
            int x = random.nextInt(900)+100;
            int y = random.nextInt(900)+100;
            int z = random.nextInt(900)+100;
            int pattern = random.nextInt(4);

            int answer;//정답
            switch (pattern){
                case 0: answer = x + y + z; break;
                case 1: answer = x + y - z; break;
                case 2: answer = x - y + z; break;
                default: answer = x - y - z; break;
            }
            while(true){
                System.out.println(x + ((pattern < 2)? " + " : " - ") +
                        y + ((pattern % 2 == 0) ?   " + " : " - ") +
                        z + " = ");
                int k = sc.nextInt();
                if( k == answer)
                    break;
                System.out.println("틀렸습니다.");
            }
        }while(confirmRetry());





    }
}
