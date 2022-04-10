package exam;

import java.util.Scanner;

public class Practice03292 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

                System.out.println("정수a: "); int a = sc.nextInt();
                System.out.println("정수a: "); int b = sc.nextInt();
                System.out.println("정수a: "); int c = sc.nextInt();

                if(a>b){ //a가 b보다 크면 a와 b를 교환
                    int t=a;
                    a=b;
                    b=t;
                }
                if(b>c){//b가 c보다 크면 b와 c를 교환
                    int t=b;
                    b= c;
                    c=t;
                }
                if(a>c){ //a가 c보다 크면 a와 c를 교환
                    int t = a;
                    c = a;
                    c = t;
                }
        System.out.println("a < b < c가 되도록 정렬");
        System.out.println("변수 a: " +a);
        System.out.println("변수 b: " +b);
        System.out.println("변수 c: " +c);
            }


        }




