import java.util.Scanner;
public class homework{
    public static void main (String arge[]){
    
    1111111111111111111111111111111111111111111111111111111111111111111   
     while(true){
            Scanner in = new Scanner(System.in);
            System.out.println("请输入年龄：");
            int num = in.nextInt();

            if(num<0){
                System.out.println("请输入正确的年龄：");
                break;
            }
            else if(num>0 && num<=18){
                System.out.println("少年");
                break;
            }
            else if(num>19 && num<=28){
                System.out.println("青年");
            }
            else if(num>=29 && num<=55){
                System.out.println("中年");
            }
            else{
            System.out.println("老年");
            }
            
    }           
            
}
} 


    2222222222222222222222222222222222222222222222222222222222222222222222
    
    System.out.println("请输入一个数字，判断是否为素数：");
    Scanner sc = new Scanner(System.in);
    while(sc.hasNextInt()){
        int num = sc.hasNextInt();
        boolean isSuShu = ture;
        //控制输出是否为素数
        if(num<=1){
            isSuShu = false;
        }
        for(int i = 2;i<num;i++){
            if(num%i == 0){
                System.out.println("不是素数");
                isPar = false;
                break;
            }
        }
        if(isSuShu){
            System.out.println("是素数");
        }else{
            System.out.println("不是素数");
        }
    }


    3333333333333333333333333333333333333333333333333333333333333333333333333
    打印1-100之间所有素数
    public class homework{
    public static void main (String arge[]){
        for(int i = 2;i<=100;i++){
            boolean isPar = true;
            //判断从i-i-1中有没有i的因子
            for(int j = 2 ; j < i ; j++){
                if(i % j == 0){
                    isPar = false;
                    break;
                }
            }
            if(isPar){
                System.out.println(i+"");
            }else{
                continue;
            }
        }

    4444444444444444444444444444444444444444444444444444444444444444444444444
    求两个正整数的最大公约数
    public class homework{
    public static void main (String arge[]){
        int num1 = 50;
        int num2 = 15;
        int min = Math.min(num1,num2);
        for(int i = min;i >= 1;i--){
            if(num1%i == 0 && num2%1 == 0){
                System.out.println("最大公约数为"+i);
                break;
            }
        }

    5555555555555555555555555555555555555555555555555555555555555555555555555
    编写程序数一下 1到 100 的所有整数中出现多少个数字9
    public class homework{
    public static void main (String arge[]){
        int total=0;
        for(int i = 1;i<100;i++){
            int geWei = i%10;
            int shiWei = i/10;
            if(geWei==9){
                total += 1;
            }
            if(shiWei==9){
                total += 1;
            }
        }
         System.out.println("共出现"+total+"次的9");


    6666666666666666666666666666666666666666666666666666666666666666666666666
    求出0～999之间的所有“水仙花数”并输出。(“水仙花数”是指一个三位数，其各位数字的立方
    和确好等于该数本 身，如；153＝1＋5＋3?，则153是一个“水仙花数”。) 
    public class homework{
    public static void main (String arge[]){
        int geWei = i/10;
        int shiWei = i/10%10;
        int baiWei = i/100;
        int total = geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei;
        if(result == i){
            System.out.println(i+"");
        }
        }
       

    77777777777777777777777777777777777777777777777777777777777777777777777777
    编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码
    错误， 可以重新输 入，最多输入三次。三次均错，则提示退出程序 
    public class homework{
    public static void main (String arge[]){
        int code=30;
        Scanner sc=new Scanner(System.in);
        int typeNumber=0;
        while(sc.hasNextInt()){
            typeNumber ++;
            int num=sc.nextInt();
            if (num==c
            ode){
                System.out.println("登陆成功！");
                break;
            }
            if(typeNumber==3){
                System.out.println("输入错误！");
                break;
            }

        }
    }
    }



    