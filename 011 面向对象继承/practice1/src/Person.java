/*
1、声明一个父类Person，有属性：姓名，体重，私有化，get/set，构造器，getInfo
2、声明一个子类Student，有属性：成绩，私有化，get/set，构造器，重写getInfo
3、声明一个子类Teacher，有属性：薪资，私有化，get/set，构造器，重写getInfo
4、在测试类中声明一个方法，可以打印各个人的信息
5、在测试类中用一个数组，可以存储各种人的对象，并且可以按照体重排序，并遍历显示每个人的信息
*/
public class Person {
    private String name;
    private double weight;

    public Person(){}

    public Person(String name, double weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getInfo(){
        return "姓名：" + name + "体重："+weight;
    }
}
