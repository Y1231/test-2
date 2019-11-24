// public class lx1124{
//      public static void main (String arge[]){
//          int num=0;
//          func(num);
//          System.out.println("num="+num);
//      }
//      public static void func(int x){
//          x=10;
//          System.out.println("x="+x);
//      }
// }


public class lx1124{
    public static void main (String arge[]){
        int [] arr={1,2,3};
        func(arr);
        System.out.println("arr[0]="+arr[0]);
    }
    public static void func(int []a){
        a[0]=10;
        System.out.println("a[0]="+a[0]);
    }
}

