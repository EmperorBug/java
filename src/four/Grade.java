package four;

public class Grade {
    private int math;
    private int science;
    private int engilsh;
    private double average;
    public Grade(int math, int science, int engilsh){
        this.math = math;
        this.science = science;
        this.engilsh = engilsh;
    };

    public double average() {
         average = (math+science+engilsh)/3.0;
        return average;
    }

    public String getGrade() {
        String result = "";

        if (average>=90) {
            result = "수";
        }
        else if (average>=80) {
            result = "우";
        }
        else if (average>=70) {
            result = "미";
        }
        else if (average>=60) {
            result = "양";
        }
        else result="ㄱㅏ";

        return result;
    }
}
