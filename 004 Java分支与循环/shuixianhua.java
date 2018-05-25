/*
输出所有的水仙花数，所谓水仙花数是指一个3
   位数，其各个位上数字立方和等于其本身。
    例如： 153 = 1*1*1 + 3*3*3 + 5*5*5
*/
class shuixianhua{
    public static void main(String[] args){
        for(int i = 100;i<1000;i++){
            int bai = i / 100;
            int shi = (i %100) /10;
            int ge = i %10;
            
            if(i == bai*bai*bai+shi*shi*shi+ge*ge*ge){
                System.out.println(i);
            }
        }
    }
}
