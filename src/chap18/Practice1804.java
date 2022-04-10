package chap18;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice1804 {
    /*
     * 점수가 저장된 배열을 인수로 받아 그 점수를 모두 표시하고 합계를 계산하여 표시함
     */
    ArrayList<String> strList = new ArrayList<String>();

    public static void showSumScore(ArrayList<Integer> score){
        int sum=0; //총점 저장용 변수
        for(int i=0;i<score.size();i++){
            System.out.println((i+1)+"의 점수는 " + score.get(i) + "입니다");

            sum += score.get(i);
        }
        System.out.println("총합계는 「" + sum + "입니다.");
    }

    public static void main(String[] args) {
        int count = 0; //카운트 저장변수
        ArrayList<Integer> score = new ArrayList<Integer>();

        //Scanner클래스 객체 생성
        Scanner sin = new Scanner(System.in);

        //반복처리로 5명분의 점수 입력 실시
        while(true){
            try{
                // 키보드 점수 입력
                System.out.print("점수 입력 = ");
                score.add(sin.nextInt());

                if(count==4){
                    //5회 입력 반복
                    break;
                }
                //카운트 증가
                count++;

            }catch(InputMismatchException e){
                System.out.println("양수값 입력하세요");
                // 입력버퍼 지우기
                sin.nextLine();
            }
        }

        System.out.println("=========================");
        //모든 입력점과 총점을 표시하는 메소드 호출
        showSumScore(score);
    }
}
