public class TestWrapper {

    public static void main(String[] args) {
        //自动装箱，自动拆箱
        int b = 10;
        Integer bNum = b;//自动装箱//等价于 Integer bNum = new Integer(b);

        Integer cNum = new Integer(23);
        int c = cNum;//自动拆箱//等价于  int c = cNum.intValue();

        //5、演示错误
        double d = 12;//整型的值是可以赋值给double型的变量，自动类型转换
//		Double dNUm = 12;//错误的  int类型的值和变量只能自动装箱为Integer
//		Double dNUm = 12.0F;//错误的，12.0F只能自动装箱为Float
        Double dNum = 12.0;//可以
    }
}
