package chap16_1; // Computer3클래스를 패키지에 포함

public class Computer3 {
//Compuer3클래스를 다른 곳에서 사용할 수 있도록 public 추가함
    private String os;
    private int memory;
    public void show(){
        System.out.println("OS는 " + this.os + "입니다.");
        System.out.println("메모리는 " + this.memory + "GB입니다.");
    }

    public void setOsMemory(String os, int memory){
        //인수값을 필드변수로 설정
        this.os = os;
        this.memory = memory;
    }
}
