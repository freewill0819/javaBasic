package exam;

public class PC3 {
    public static void main(String[] args) {
        int age = 25;

        System.out.println("연령: " + age);

        if(age >= 20){
            System.out.println("성인입니다.");
        }else if(age < 20 && age >= 0){
            System.out.println("미성년자입니다.");

            if(age < 6 || age > 14){
                System.out.println("지금은 의무교육을 받지 않습니다.");
            }else {
                System.out.println("지금은 의무교육을 받고 있습니다.");
            }
        }else{
            System.out.println("오류");
        }
    }
}
