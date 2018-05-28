public class MyArrays {
    //功能：为任意类型的数组进行从小到大排序
    //参数：Object[]
    public static void sort(Object[] arr){
        //冒泡排序：从小到大
        for (int i = 1; i < arr.length; i++) {
            /*
             * 代入法：假设arr的长度为5
             * 当i=1，j=0,1,2,3  j<4
             */
            for (int j = 0; j < arr.length-i; j++) {
                //问题：任意类型的两个对象如何进行比较大小
                //如果arr[j]和arr[j+1]两个对象符合Sortable标准
                //那么，我们就可以把arr[j]转成Sortable类型
                Student s = (Student) arr[j];
//                SortAble s = (SortAble) arr[j];//这样也可以
                //if(arr[j] > arr[j+1]){//if(前面的元素 》 后面的元素){
                if(s.compare(arr[j+1]) > 0){
                    Object temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
