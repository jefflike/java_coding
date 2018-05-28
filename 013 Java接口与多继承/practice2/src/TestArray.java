class TestMyArrays {

    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student(4,"张三");
        students[1] = new Student(1,"李四");
        students[2] = new Student(5,"丁杰");

        MyArrays.sort(students);

        for (Student student : students) {

            System.out.println(student);
        }

    }

}
class Student implements SortAble{
    private int id;
    private String name;
    public Student(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }


    //实现接口，标准的抽象方法
    @Override
    public int compare(Object obj) {
//		this的学生对象和obj的学生对象进行比较大小，按照学号比较
        Student other = (Student) obj;
        if(this.id > other.id){
            return 1;
        }else if(this.id < other.id){
            return -1;
        }
        return 0;
    }

}