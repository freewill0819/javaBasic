package cahp06;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");


        int a = sc.nextInt();
        if (a >= 0 && a <= 9) {
            System.out.println("변수" + a + "는 0이상 9이하");
        } else if (a > 0 || a < 9) {
            System.out.println("변수" + a + "는 0보다 작거나 9보다 크다");
        }

        System.out.print("숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("숫자 입력 : ");
        int num2 = sc.nextInt();
        if (num1 == 5 && num2 != 999) {
            System.out.println("변수" + num1 + "는 5와 같고 변수" + num2 + "는 999와 같지 않다.");
        }

        String abc = new String("test");
        String q = abc;

        System.out.println(q == "test");

        char char1 = 'y';
        String str1 = "yes";
        if (char1 == 'y' || str1.equals("yes")) ;
        {
            System.out.println("");
        }
    }
    }

