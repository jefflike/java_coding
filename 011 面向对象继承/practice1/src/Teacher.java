public class Teacher extends Person{
    private double salary;

    public Teacher(){}

    public Teacher(String name, double weight, double salary){
        super(name, weight);
        this.salary =salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "薪资是："+salary;
    }
}
