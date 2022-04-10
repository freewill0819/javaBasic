package chap20;

public class NoteBook6 extends Computer2{
    private String useType; //용도유형

    //생성자(인수없음)
    public NoteBook6(){
        this.useType = null;
        System.out.println("노트북을 만들었습니다.");
    }
    //생성자(인수있음)
    public NoteBook6(String os ,int memory, String useType){
        //슈퍼클래스의 생성자 호출
        super(os, memory);
        this.useType = useType;
        System.out.println("유형은 " + this.useType + "에 대한 노트북을 만들었습니다.");
    }

    public void setUseType(String useType){
        this.useType = useType;
        System.out.println("유형은 " + this.useType + "을 사용했습니다.");
    }
    // 슈퍼클래스와 같은 메소드 정의
    public void show(){
        super.show();
        System.out.println("유형은 " + this.useType + "입니다.");
    }
    }

