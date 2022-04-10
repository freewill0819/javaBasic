package Practice5;

public class Practice {
    public static void main(String[] args) {

        int value = 16;

        System.out.println("value: " + value);

        if(value % 2 == 0 ) {
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

        if (value % 3 == 0){
            System.out.println("3배수입니다");
        }

        if(value % 4 == 0){
            System.out.println("4배수입니다.");
        }

        if (value % 5 == 0){
            System.out.println("5배수입니다.");
        }
    }
}
