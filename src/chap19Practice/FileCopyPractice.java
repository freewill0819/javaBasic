package chap19Practice;

import java.io.*;

public class FileCopyPractice {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        if(args.length !=2){
            System.out.println("두 개의 파일명을 올바르게 입력하십시오");
            return;
        }

        try{
            //복사원본파일명 열기
            br = new BufferedReader(new FileReader(args[0]));
            //대상 파일명 열기
            pw = new PrintWriter(new BufferedWriter((new FileWriter(args[1]))));

            String str;

            //복사원본 파일에서 한줄의 문자열씩 갖옴
            while((str = br.readLine()) !=null){
                pw.println(str); //검색된 문자열을 대상 파일에 쓰기
            }
        }catch (FileNotFoundException e){
            System.out.println("파일명이 잘못되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(br != null){
                    br.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
            if(pw != null){
                pw.close();
            }
        }

    }
}
