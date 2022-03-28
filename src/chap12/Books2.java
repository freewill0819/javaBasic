package chap12;

public class Books2 {
    private String title;
    private  int price;

    public void show(){
        System.out.println("이 책의 제목은 " +this.title+ "이고 가격은 " + this.price + "원입니다.");
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
            System.out.println("설정하는 값이" + price + "이기 떄문에 ,가격은 0을 설정했습니다.");
        }else{
            this.price = price;
        }
    }
}
