package exam;

public class exam14 {
    public static void main(String[] args) {
        int m = 2500;
        int pay= 6100;

        if(m > 1700){
            m = m - 1700;
           pay =pay +(m/313)*800;
        }
        System.out.println(pay);
    }
}
