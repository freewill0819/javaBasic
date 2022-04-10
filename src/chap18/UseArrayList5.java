package chap18;

import java.util.ArrayList;

public class UseArrayList5 {
    public static void main(String[] args) {

        //검색결과의 인덱스 저장변수
        int index;

        ArrayList<String> strList = new ArrayList<String>();

        //문자열 추가
        strList.add("Good morning");
        strList.add("Hello");
        strList.add("Bye");

        //반복처리를 이용하여 전건 표시
        System.out.println("* 변경 전 데이터 목록");
        for(int i = 0; i < strList.size(); i++){
            System.out.println((i+1) + "번째 저장 데이터는 " + strList.get(i) + "입니다.");
        }
        //ArrayList배열 저장 데이터에서 검색
        System.out.println("==================================");
        index = strList.indexOf("Hello");

        //검색결과 확인
        if(index != -1){
            System.out.println("Hello 요소 번호 " + index + " 에 저장됩니다.");
        }else{
            System.out.println("Hello를 찾을 수 없습니다.");
        }

        //3번째 데이터 변경
        strList.set(2, "Good Bye");
        //2번째 데이터 삭제
        strList.remove(1);

        System.out.println("\n * 변경 후 데이터 목록");
        for(int i = 0; i < strList.size(); i++){
            System.out.println((i+1) + "번째 저장 데이터는 " + strList.get(i) + "입니다.");
        }
        //ArrayList배열 저장 데이터에서 검색
        System.out.println("==================================");
        index = strList.indexOf("Hello");

        //검색결과 확인
        if(index != -1){
            System.out.println("Hello 요소 번호 " + index + " 에 저장됩니다.");
        }else{
            System.out.println("Hello를 찾을 수 없습니다.");
        }
    }
}
