class mystar{
    public static void main(String[] args){
        for(int i = 0;i<4;i++){//外层循环
            for(int j = 0;j<5;j++){//内层循环
                System.out.print("*");
            }
            System.out.println();//每层换行
        }
    }
}