abstract interface inter{
    public static void print(){
        System.out.println("����һ���ӿڵľ�̬����");
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