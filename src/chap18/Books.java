package chap18;

public class Books {
    private String title;
    private int price;

    //생성자
    public Books(String title, int price){
        this.title= title;
        this.price = price;
    }

    //인수를 각 필드변수로 설정하는 메소드
    public void setBookInfo(String title, int price){
    this.title = title;
    this.price = price;
}

//도서 정보를 화면에 표시하는 방법
public void showBookInfo(){
        System.out.println("이 책의 제목: " + this.title );
        System.out.println("이 책의 가격: " + this.price + "원");
        System.out.println("=================================================");

}
}
