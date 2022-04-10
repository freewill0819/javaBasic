package chap20Practice;

public class Practice4 {

    public static void main(String[] args) {
// 뮤지션 배열 만들기
        Musician[] band = {
                new Vocalist( "홍길동" ),
                new Guitarist( "이순신" , "리드 기타" ),
                new Guitarist( "이빛나" , "베이스" ),
                new ChorusDrummer( "이빛나" )
    };
// 뮤직 스타트!
        for(int i = 0; i < band.length; i++){
            if(band[i] instanceof Singable){
                ((Singable)band[i]).sing();
            }
            if(band[i] instanceof Playable){
                ((Playable)band[i]).play();
            }
        }
    }
}
    // 뮤지션 추상 클래스
    abstract class Musician {
    // 이름 필드
        private String name;

        // 생성자
        public Musician(String name) {
        this .name=name;
    }
// 이름 취득 방법
        public String getName() {
        return name;
    }
        }
// 가창 가능 인터페이스
    interface Singable {
        void sing();
}

// 연주 가능 인터페이스
interface Playable {
        void play();
    }
// 여기에 보컬리스트 클래스를 만듭니다.
class Vocalist extends Musician implements Singable{
    public Vocalist(String name){
        super(name);
    }

    public void sing(){
        System.out.println(getName() + "이 노래했습니다");
    }
}
// 여기에 기타리스트 클래스를 만드십시오.

class Guitarist extends Musician  implements Playable{
    private String guitarType;

    public Guitarist(String name, String guitarType){
        super(name);
        this.guitarType =guitarType;
    }

    public void play(){
        System.out.println(getName() + "은 " + guitarType + "을 연주합니다.");
    }
}
// 여기에 코러스 & 드러머 클래스를 만듭니다.

class  ChorusDrummer extends Musician implements Singable, Playable{

    public ChorusDrummer(String name){
        super(name);
    }

    public void sing(){
        System.out.println(getName() + "은 코러스로 노래합니다.");
    }

    public void play(){
        System.out.println(getName() + "은 드럼으로 연주합니다.");
    }
}

