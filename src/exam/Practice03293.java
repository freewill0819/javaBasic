package exam;

import java.util.Random;

public class Practice03293 {
    public static void main(String[] args) {

        Random rsp = new Random();
        int number = rsp.nextInt(3);

        if (number == 0) {
            System.out.println("컴퓨터가 낸것: 가위" );
        }else if(number == 1){
            System.out.println("컴퓨터가 낸것: 보");
        }else{
            System.out.println("컴퓨터가 낸것: 바위");
        }
    }
}
