package test.java;

import java.util.ArrayList;

public class CreditCalculator {
    ArrayList<Lecture> myLectures;
    public CreditCalculator(){
        myLectures = new ArrayList<>();
    }
    public CreditCalculator(Lecture lec){
        this();
        myLectures.add(lec);
    }

    public void addLec(Lecture lec){
        myLectures.add(lec);
    }

    public void showAllLectures(){
        myLectures.sort(new LectureComparator());
        for(Lecture lec : myLectures)
            System.out.println(lec);
    }

    public double getAverageCredit(){
        int lecNum = myLectures.size();
        double totCrd = 0, totGrade = 0;
        for(int i = 0; i < lecNum; i++){
            Lecture lec = myLectures.get(i);
            if(!lec.isSNU){
                totCrd += lec.credit;
                totGrade += lec.grade * lec.credit;
            }
        }
            
        return totGrade / (double)totCrd;
    }
}
