package chap15;

import chap10.Person03;

public class Practice3 {
    public static void main(String[] args) {
        Person[] persons = {new Person(), new Person(), new Person()};

        persons[0].setData("홍길동", 30);
        persons[1].setData("이순신", 31);
        persons[2].setData("이산", 33);

        for (int i = 0; i < persons.length; i++) {
            persons[i].introduce();
        }

        System.out.println();

        persons[0].compare(persons[1]);
        persons[1].compare(persons[2]);
        persons[2].compare(persons[1]);

    }
}
class Person{
    private String name;
    private int age;

    public void setData(String name, int age){
        this.age = age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void introduce(){
        System.out.println("내 이름은 " + name + ", 나이는 " + age + "세 입니다.");
    }

    public void compare(Person person){
        if(age > person.getAge() ){
            System.out.println("나는 " + name + "이고 , " + person.getName() + "님보다 " + (age - person.getAge()) +  "살 연상입니다.");
        }else if(age < person.getAge()){
            System.out.println("나는 " + name + "이고 , " + person.getName() + "님보다 " + (person.getAge() - age ) +  "살 연하입니다.");
        }else{
            System.out.println("나는 " +name+ "이고, " + person.getName()+" 님과 같은 나이입니다.");
        }
    }
}