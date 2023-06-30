package test.java;

public class CreditCalRunner {
    public static void main(String[] args){
        Semester sem2021S = new Semester(2021, Semester.SNum.S);
        Semester sem2022II = new Semester(2022, Semester.SNum.II);
        Semester sem2021II = new Semester(2021, 2);

        Lecture gongYeI = new Lecture("공연예술의 이해", "전예완", 3, GradeNum.Ap, false, sem2021II);
        Lecture comGi = new Lecture("컴퓨팅 기초", null, 3, GradeNum.S, true, sem2021S);
        Lecture comHaek = new Lecture("컴퓨팅 핵심", null, 3, GradeNum.A0, false, sem2022II);

        CreditCalculator cc = new CreditCalculator(comHaek);
        cc.addLec(gongYeI);
        cc.addLec(comGi);

        System.out.println();
        cc.showAllLectures();
        System.out.println();
        System.out.println("총 평균 평점: " + cc.getAverageCredit());
    }
}
