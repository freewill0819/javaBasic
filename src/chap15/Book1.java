package chap15;

import java.util.Scanner;

class Book2{

    private static int count = 0;
    private  String title;
    private int price;
    private int number;

    public Book2(String title, int price){
        ++count;
        this.title = title;
        this.price = price;
        this.number = count; //현재 생성횟수 번호에 저장

    }

    public void showBook(){
        System.out.println("이 책의 제목은 "+ this.title + "이고 가격은 " + price + "원 입니다.");
        System.out.println("생성횟수는 " + this.number + "입니다.");
    }

    public static int getCount(){
        return count;
    }
}
public class Book1 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        for(int i = 0; i < 3; i++) {
            System.out.print("책 제목 입력: ");
            String title = sc.next();
            System.out.println("책 가격입력: ");
            int price = sc.nextInt();

            Book2 book = new Book2(title, price);
            book.showBook();

            System.out.println();
        }
        System.out.println("채구 생성 횟수는 " + Book2.getCount() + "회 입니다.");
    }
}
