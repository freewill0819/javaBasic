package exam;

public class exam15 {
    public static void main(String[] args) {
        int p = 50;
        int pay = 6000;

        if (p >= 5){
            pay = pay-500;
        }else if(p>=5 && p >=20){
            pay =pay-1000;
        }
        System.out.println(pay*p);
    }
}
