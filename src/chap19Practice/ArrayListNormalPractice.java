package chap19Practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListNormalPractice {
    public static void main(String[] args) {
// 디지털 카메라 객체 선언 및 생성
        DigitalCamera myCamera = new DigitalCamera();
// 디지털 카메라로 촬영
        myCamera.takePicture( "새끼 고양이" );
        myCamera.takePicture( "런치" );
        myCamera.takePicture( "카푸치노" );
        myCamera.takePicture( "아기" );
        myCamera.takePicture( "투샷" );
        System.out.println();
// 촬영 이미지 수 확인
        System.out.println( "현재 촬영 매수:" + myCamera.getPictureCount());
        System.out.println();
// 이미지 보기
        myCamera.showPictures();
        System.out.println();
// 이미지 파일 지우기

        myCamera.clearMemory();
        System.out.println();
// 촬영 이미지 수 재확인
        System.out.println( "현재 촬영 매수:" + myCamera.getPictureCount());
    }
}

class DigitalCamera{
    private ArrayList<Picture> memory;

    public DigitalCamera(){
        memory = new ArrayList<Picture>();
    }
    public void takePicture(String target){
        System.out.println(target + "을 찍었습니다.");
        memory.add(new Picture(target));

    }
    public void showPictures(){
        System.out.println(" ** 이미지 목록 **");
        for (Picture picture: memory){
            System.out.println(picture);
        }
    }
    public int getPictureCount(){
        return memory.size();
    }
    public void clearMemory(){
        memory.clear();
        System.out.println("모든 이미지를 삭제했습니다.");
    }
}

class  Picture{
    private  String target;

    public Picture(String target){
        this.target = target;
    }
}
