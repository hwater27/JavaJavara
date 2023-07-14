package test.java;

import java.util.Comparator;

public class LectureComparator implements Comparator<Lecture> {
    @Override
    public int compare(Lecture lec1, Lecture lec2){
        return lec1.compareTo(lec2);
    }
}
