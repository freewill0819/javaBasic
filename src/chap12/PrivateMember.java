package chap12;

class Computer2{
    private String os;
    private int memory;

    public void show(){
        System.out.println("PC의 OS는 " + os + "입니다");
        System.out.println("메모리는 " + memory + "GB입니다.");
    }
    public void setOsMemory(String os, int memory){
        if(memory > 0){
            this.os = os;
            this.memory = memory;
            System.out.println("OS를 " + os + "로 메모리를 " + memory + "GB로 변경했습니다.");
        }else{
            System.out.println("");
        }
    }
}
public class PrivateMember {
    public static void main(String[] args) {

        Computer2 com = new Computer2();

       // com.os = "Windows 11";
        //com.memory = =5445;

        com.show();

    }
}
