package test.java;

import java.util.ArrayList;

public class CreditCalculator {
    ArrayList<Lecture> myLectures;
    public CreditCalculator(Lecture lec){
        myLectures = new ArrayList<>();
        myLectures.add(lec);
    }
    public void addLec(Lecture lec){
        myLectures.add(lec);
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
