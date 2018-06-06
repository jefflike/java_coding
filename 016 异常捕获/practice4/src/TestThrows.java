class TestThrows {

    public static void main(String[] args) {
        Fu f = new Zi();//多态引用
        try {
            f.test();//编译时按照父类编译，执行时是按照子类重写的方法执行
        } catch (Exception e) {
            //捕获的是父类的异常类型，只有父类的异常类型是>=子类的异常类型，那么不管它是按照父类的方法执行还是子类的方法执行，都能捕获
            e.printStackTrace();
        }
    }

}
class Fu{
    public void test()throws RuntimeException{

    }
}
class Zi extends Fu{
    @Override
//    public void test()throws Exception{//子类的异常不能大于父类
    public void test()throws RuntimeException{//子类的异常不能大于父类

    }
}