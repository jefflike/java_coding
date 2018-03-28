class mystar4{
    public static void main(String[] args){
        for(int i = 1;i<6;i++){//外层循环
            for(int j = 0;j<5-i;j++){//内层循环
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){//内层循环
                System.out.print("* ");
            }
            System.out.println();//每层换行
        }
        for(int i = 4;i>0;i--){//外层循环
            for(int j = 1;j<6-i;j++){//内层循环
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){//内层循环
                System.out.print("* ");
            }
            System.out.println();//每层换行
        }
    }
}
