package model;

public class MiniCalculator {
    private double firstvalue;
    private double secondvalue;
    private double answer;

    public MiniCalculator() {

    }

    public double getFirstvalue() {
        return firstvalue;
    }

    public double getSecondvalue() {
        return secondvalue;
    }

    public double getAnswer() {
        return answer;
    }

    public void setFirstvalue(double firstvalue) {
        this.firstvalue = firstvalue;
    }

    public void setSecondvalue(double secondvalue) {
        this.secondvalue = secondvalue;
    }

    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void plus() {
        answer = firstvalue + secondvalue;
    }

    public void minus() {
        answer = firstvalue - secondvalue;
    }

    public void multiply() {
        answer = firstvalue * secondvalue;
    }

    public void devide() {
        answer = firstvalue / secondvalue;
    }

    public void pow() {
        answer = Math.pow(firstvalue, secondvalue);
    }

    public void mod() {
        answer = firstvalue % secondvalue;
    }

}
