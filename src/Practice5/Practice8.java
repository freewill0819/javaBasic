package Practice5;

public class Practice8 {
    public static void main(String[] args) {
        int a = 18;
        int b = 6;

        System.out.println("덧셈: " + calc(a ,b , 0));
        System.out.println("뺄셈: " + calc(a ,b ,1));
        System.out.println("곱셈: " + calc(a ,b ,2));
        System.out.println("나눗셈: " + calc(a ,b ,3));
    }

    public static int calc(int value1, int value2, int type){
        int result = 0; //리턴값 초기화
        switch (type){
            case 0:
                result = value1 + value2;
                break;

            case 1:
                result = value1 - value2;
                break;

            case 2:
                result = value1 * value2;
                break;

            case 3:
                result = value1 / value2;
                break;

            default:
        }
        return result;
    }
}
