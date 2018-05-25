class mystar3{
    public static void main(String[] args){
        for(int i = 1;i<6;i++){//外层循环
            for(int j = 0;j<i;j++){//内层循环
                System.out.print("*");
            }
            System.out.println();//每层换行
            
        }
        for(int m = 4;m>0;m--){//外层循环
            for(int n = 0;n<m;n++){//内层循环
                System.out.print("*");
            }
            System.out.println();//每层换行
        }
    }
}
