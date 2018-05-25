public class Student extends Person {
    private double score;

    public Student(){}

    public Student(String name, double weight, double score){
        super(name, weight);
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "成绩是："+ score;
    }
}
