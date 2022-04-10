package exam;

import java.util.Random;
import java.util.Scanner;

public class Practice03297 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        String[] dayKr = {"월", "화", "수", "목", "금", "토", "일"};
        String[] dayEg = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
        String answer = new String();

        int day = 0;
        int last = 8;
        int input;

        while(true){
            while(true){
                day = random.nextInt(7);
                if(day == last) {
                    continue;
                }else{
                    last = day;
                    break;
                }
            }

            while(true){
                System.out.println(dayKr[day]+ "요일을 영어 소문자로 쓰시요.");
                answer = sc.next();
                if(answer.equals(dayEg[day])){
                    System.out.println("정답입니다..");
                    break;
                }else{
                    System.out.println("틀렸습니다.");
                }

            }
            System.out.println("다시한번? 1(yes)/0(no)");
            input = sc.nextInt();
            if(input == 0) {
                System.out.println("종료");
                break;
            }else{
                System.out.println("계속");
                continue;
            }
        }

    }
}
