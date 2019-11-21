
// 1111111111111111111111111111111111111111111111111111111111111111111
//  写一个函数返回参数二进制中 1 的个数 比如： 15 0000 1111 4 个1

// import java.util.Scanner;
// public class test1121{
//     public static void main (String arge[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("请输入一个数字：");
//         while(sc.hasNextInt()){
//             int num=sc.nextInt();   
//             int ret=getNumBinCount(num);
//             System.out.println("num为"+num+"，其二进制中1的个数为："+getNumBinCount(num))；
//             System.out.println("请输入一个数字：");
//         }
//     }
// }
        
//             //暴力解法  用位运算
//             //相邻的两个整数之间二进制的最后一位一定不同
            

// 222222222222222222222222222222222222222222222222222222222222222222
// 完成猜数字游戏
// import java.util.Random;
// public class test1121{
//     public static void main (String arge[]){
//         Random random=new Random();
//         int guess=random.nextInt(100);
//         System.out.println(guess);
//         Scanner scanner=new Scanner(System.in);
//         System.out.println("piease type a number:");
//         while(scanner.hasNext()){
//             int num=scanner.nextInt();
//             if(num<guess){
//                 System.out.println("small");
//             }else if(num>guess){
//                 System.out.println("big");
//             }else{
//                 System.out.println("right");
//                 break;
//             }
//         }
//     }
// }




// 写出一个函数求出任意一个整数N的阶乘
                
//                递归

// import java.util.Scanner;
// public class test1121{
//     public static void main (String arge[]){
//         int n=5;
//         int ret=factor(n);
//         System.out.println("ret="+ret);
//     }
//     public static int factor(int n){
//         if(n==1){
//             return 1;
//         }
//         return n*factor(n-1);
//     }


// 写出一个函数求出任意一个整数N的阶乘

// public class test1121{
// public static void main(String[] args) {   
//     int n = 5;   
//     int ret = factor(n);    
//     System.out.println("ret = " + ret);
//     }
//     public static int factor(int n) { 
//         if (n == 1) {    
//             return 1;   
//         }   
//         return n * factor(n - 1);
//         } 
//  


// 数组
// 静态初始化
// int[]num={1,2,3,4,5}
// 数据类型[]数组名称=new int[]{1,2,3,4,5}

// public class test1121{
//     public static void main (String arge[]){
//         //静态初始化
//         int[] num=new int[]{1,2,3,4,5};
//         //num.length 
//         //获取一个数组长度值使用数组名称.length int
//         System.out.println(num.length);
//         System.out.println(num[0]);
//         num[2]=10;
//         System.out.println(num[2]);
//     }
//     }

// 访问数组使用数组名称[数值]
// num[n]  n[0,n-1]
// 超出范围会抛出数组越界异常

// 数组动态初始化
// 数据类型[]  数组名称=new数据类型[数组长度]
// int[] num=new int [5]


// public class test1121{
//     public static void main (String arge[]){
//         int []num=new int []{1,2,3,4,5};
//         //遍历num数组
//       1.  for(int i=0;i<=num.length;i++){
//             System.out.println(num[i]);
//         }
//         // 2.for(int i:num)
//         // System.out.println(i);
//     }
// }

        //数组遍历
        //for-each用于数组与集合的输出，不能修改原集合
        //若要在遍历时修改原数组元素，需要使用传统for循环


//                     java内存模型
// 栈（方法栈的局部变量表）
// 局部变量
// 每个方法在JVM中的调用就对应一个方法栈帧的入栈与出栈

// 堆
// 所有类的对象/数组元素

