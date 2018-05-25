public class TestPerson {
    public static void main(String[] args){
        Student stu1 = new Student("学生1",200,50);
        Student stu2 = new Student("学生2",20,80);
        Student stu3 = new Student("学生3",100,100);

        Teacher tea1 = new Teacher("老师1", 80,20000);
        Teacher tea2 = new Teacher("老师2", 160,50000);
        Teacher tea3 = new Teacher("老师3", 100,80000);

        printMes(stu1);
        printMes(tea1);

        Person[] p1 = new Person[]{stu1, stu2,stu3,tea1,tea2,tea3};

        for (Person p : p1){
            printMes(p);
        }


    }

    public static void printMes(Person p){
        System.out.println(p.getInfo());
    }
}
