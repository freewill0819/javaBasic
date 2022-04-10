package Practice5;

public class Practice6 {
    public static void main(String[] args) {
        outer:
        for (int i=10; i < 100; i++){
            for(int j=2; j<i; j++){
                if(i%j == 0){
                    continue outer;
                }
            }
            System.out.println(i);
        }
    }
}
