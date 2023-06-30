package test.java;

public class Lecture {
    String lecName;
    String professor;
    int credit;
    double grade;
    boolean isSNU;
    enum Grade{

    }
    public Lecture(int credit, double grade, boolean isSNU){
        this(null, null, credit, grade, isSNU);
    }
    public Lecture(String lecName, String professor, int credit, double grade, boolean isSNU){
        this.lecName = lecName;
        this.professor = professor;
        this.credit = credit;
        this.grade = grade;
        this.isSNU = isSNU;
    }
}
