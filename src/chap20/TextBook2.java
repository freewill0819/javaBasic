package chap20;

public class TextBook2 extends TextBooks1{
    public void showBook(){
        super.showBook();
        System.out.println("이 책의 교과: " + super.getSubject());
    }
}
