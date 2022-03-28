package chap10;

class Person02{
    String name;
    int age;

    public void showPerson(){
        System.out.println("이 사람의 이름은 " +this.name+ "이고, 나이는" +this.age+ "살 입니다.");
    }
}
public class Practice1101 {

    public static void main(String[] args) {
        Person02 person1 = new Person02();
        Person02 person2 = new Person02();

        person1.name = "Seonho";
        person1.age = 26;
        person2.name = "Coding";
        person2.age = 1;

        person1.showPerson();
        person2.showPerson();



    }
}
