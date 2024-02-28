package system_oop_practice;

public abstract class Student extends Person implements Average {

    private double exam, test;
	
    protected void setExam(double exam) {
        this.exam = exam;
    }

    protected double getExam() {
        return this.exam;
    }
	
    protected void setTest(double test) {
        this.test = test;
    }

    protected double getTest() {
        return this.test;
    }
    
}
