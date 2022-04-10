package exam;

import java.util.GregorianCalendar;
import java.util.Random;

public class Practice03299 {
    public static void main(String[] args) {
        GregorianCalendar today = new GregorianCalendar();
        int y = today.get(GregorianCalendar.YEAR);
        int m = today.get(GregorianCalendar.MONTH)+1;
        int d = today.get(GregorianCalendar.DATE);
        System.out.printf("오늘은 %04d년 %02d월 %02d일입니다.\n", y, m, d);

        Random random = new Random();
        int a = random.nextInt(4);
        System.out.print("오늘의 운세는 ");
        switch (a){
            case 0:
                System.out.print("대길");
                break;
            case 1:  case 2: case 3:
                System.out.print("길");
                break;
            case 4: case 5: case 6:
                System.out.print("중길");
                break;
                case 7: case 8:
                System.out.print("소길");
                break;
            case 9:
                System.out.print("흉");
                break;
        }
        System.out.println("입니다");

    }
}
