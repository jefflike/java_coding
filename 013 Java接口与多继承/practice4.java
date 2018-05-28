abstract interface inter{
    public static void print(){
        System.out.println("这是一个接口的静态方法");
    }
}
class Son implements inter{

}

class TestInterface {
    public static void main(String[] args) {
    inter.print();
    Son.print();
    }
}