package test.java;

public class Semester implements Comparable<Semester>{
    int year;
    SNum sNum;
    enum SNum{
        I, S, II, W, Undetermined;
        @Override
        public String toString(){
            switch(this){
                case I: return "I";
                case II: return "II";
                case S: return "Summer";
                case W: return "Winter";
                case Undetermined:
                default: return "(unknown)";
            }
        }
    
    }
    public Semester(int year, SNum sNum){
        this.year = year;
        this.sNum = sNum;
    }
    public Semester(int year, int sNum){
        this(year, null);

        SNum sNum2;
        if(sNum == 1) sNum2 = SNum.I;
        else if(sNum == 2) sNum2 = SNum.II;
        else sNum2 = SNum.Undetermined;
        // exception 추가
        this.sNum = sNum2;
    }



    @Override
    public int compareTo(Semester sem){
        if(this.year == sem.year) return 0;//(int)this.sNum - sem.sNum; // eNum을 int로 바꾸는 방법 찾아야 함!
        else return this.year - sem.year;
    }

    @Override
    public String toString(){
        return Integer.toString(year) + "-" + sNum.toString();
    }
}
