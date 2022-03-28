package chap15;

public class Practice1 {
    public static void main(String[] args) {
        //Employee 클래스 객체 만들기
        Employee employee = new Employee();

        //Employee 객체에 직원번호와 직원명을 설정함
        employee.setData( 1234 ,"홍길동");

        //Employee객체의 직원번호 출력
        System.out.println("직원번호 : " + employee.getId());

        //Employee객체의 직원명 출력
        System.out.println("직원명 :" + employee.getName() );
    }
}

class Employee{

    private int id;
    private String name;



    public int getId() {
        return id;
    }

    public String getName(){

        return name;
    }


    public void setData(int i ,String n){
        id = i;
        name = n;
        System.out.println("직원번호는 " + n + "이고 , 사원번호는 " + i + "입니다.");
    }
}