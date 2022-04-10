package chap18;

public class Practice1802 {
    public static void main(String[] args) {
        //배열로 설정
        String[] title = {"Java 입문", "Java 알고리즘", "Java 알고리즘", "Java Spring 프로그래밍", "JAva Spring 프로그래밍"};
        int[] price = {8000, 12000, 18000, 25000, 3000};

        Books[] bookArray = new Books[5];

        for(int i = 0; i < bookArray.length; i++){
            bookArray[i] = new Books(title[i],price[i]);
        }
        //각 개체의 정보표시
        System.out.println("============");
        for (int i= 0; i < bookArray.length; i++){
            bookArray[i].showBookInfo();
        }
     }
}
