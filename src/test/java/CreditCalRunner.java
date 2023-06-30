package test.java;

public class CreditCalRunner {
    public static void main(String[] args){
        Lecture gongYeI = new Lecture("공연예술의 이해", "전예완", 3, GradeNum.Ap, false);
        Lecture comGi = new Lecture("컴퓨팅 기초", null, 3, GradeNum.S, true);
        Lecture comHaek = new Lecture("컴퓨팅 핵심", null, 3, GradeNum.A0, false);

        CreditCalculator cc = new CreditCalculator(comHaek);
        cc.addLec(gongYeI);
        cc.addLec(comGi);

        System.out.println(cc.getAverageCredit());
    }
}
