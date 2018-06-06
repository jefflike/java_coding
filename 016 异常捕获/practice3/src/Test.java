public class Test{

    public static void main(String[] args) {
//        int result = test(4,2);
//        System.out.println(result);

        int result = test(4,0);
        System.out.println(result);
    }

    public static int test(int a, int b){
        int result = 0;
        try{
            if(a<0 || b<0){
                result = -1;
                return result;
            }

            result = a/b;
            return result;
        }catch(Exception e){
            result = a + b;
            return result;
        }finally{
//			result = a * b;
            result ++;
//			return result;// 3
        }
    }

}
