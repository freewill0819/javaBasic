package chap12;

class Books3{
    private String title;
    private int price;

    public void show(){
        System.out.println("이 책의 제목은 " + this.title + "이고, 가격은 " + this.price + "원입니다.");
    }
    public String getTitle(){
        return this.title;
    }

    public int getPrice(){
        return this.price;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(int price){
        if(price < 0){
            this.price = 0;
            System.out.println("설정한 값이 " + price + "이므로 가격은 0이 설정됩니다.");
        }else{
            this.price = price;
        }
    }
}
public class Practice1201 {
    public static void main(String[] args) {
        Books3 book1= new Books3();
        Books3 book2= new Books3();

        book1.setTitle("JAVA 입문");
        book1.setPrice(25000);
        book1.show();

        book2.setTitle("JAVA 기본");
        book2.setPrice(-38000);
        book2.show();
    }
}
