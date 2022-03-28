package chap07;

public class Practice0703 {
    public static void main(String[] args){

        for(int i = 1; i <= 40; i++){
            if(i%2 == 1){
                continue;
            }
            if(i>20){
                break;
            }
            System.out.println(i);
        }
    }
}
