class chengfabiao{
    public static void main(String[] args){
        for(int i = 1;i<10;i++){//外层循环
            for(int j = 1;j<=i;j++){//内层循环
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();//每层换行
        }
    }
}
