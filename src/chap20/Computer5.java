package chap20;

public class Computer5 {
    private String os;
    private int memory;

    public Computer5(){
        this.os = null;
        this.memory = 0;
        System.out.println("PC가 만들어졌습니다");
    }

    public void setOsMemory(String os, int memory){
        this.os = os;
        this.memory = memory;
        System.out.println("OS는 " + os + "이고, 메모리는 " + memory + "GB로 만들어졌습니다.");
    }
}
