package test.java;

import java.util.Optional;

public class Lecture implements Comparable<Lecture>{
    String lecName;
    String professor;
    int credit;
    double grade;
    boolean isSNU;

    Semester semester;

    enum Grade{

    }
    public Lecture(int credit, double grade, boolean isSNU){
        this(null, null, credit, grade, isSNU);
    }
    public Lecture(String lecName, String professor, int credit, double grade, boolean isSNU){
        this(lecName, professor, credit, grade, isSNU, null);
    }

    public Lecture(String lecName, String professor, int credit, double grade, boolean isSNU, Semester semester){
        this.lecName = lecName;
        this.professor = professor;
        this.credit = credit;
        this.grade = grade;
        this.isSNU = isSNU;
        this.semester = semester;
    }

    @Override
    public int compareTo(Lecture otherLec){
        if(this.semester.compareTo(otherLec.semester) == 0)
            return this.lecName.compareTo(otherLec.lecName);
        else return this.semester.compareTo(otherLec.semester);
    }

    @Override
    public String toString(){
        String optProfessor = Optional.ofNullable(professor).orElse("(unknown)");   // Optional 개념으로 만들어 봤습니다.
        return "<" + lecName + "> " + " | " + semester.toString() + "학기 | 교수: " + optProfessor;
    }
}
