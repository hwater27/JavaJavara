//package test.java;

import java.util.Scanner;

public class ForGradRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 사용자 학과 input 받기
        System.out.print("학과를 입력해주세요 : ");
        String major = sc.nextLine();

        //2. 학과의 필수과목 나열 output 후 수강한 과목 input받기
        ForGraduation fg = new ForGraduation();
        fg.ShowAllLectures(major); //다른 클래스에 있는 특정학과의 필수과목들 목록(강의명과 권장수강학기 정보 담겨있음) 가져오는 메소드
        fg.TakenClasses(); //가져온 목록들 모두 나열하고 들은 과목 뭔지 입력하게끔 함
        
        //3. 남은 과목 알려주고 권장이수과정 알려주기
        fg.ShowLeftLectures(); //남은 과목 나열하는 메소드
    }
}
