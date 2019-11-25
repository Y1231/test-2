// 1.找出其中最大元素
// public class lx1125{
//     public static void main(String[] args) { 
//        int [] arr={1,2,3,4,5,6};
//        System.out.println(max(arr));
//     }
//     public static int max(int[] arr){
//         int max=arr[0];
//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         return max;
//     }
// }
    
//2.求一组元素中的平均值
public class lx1125{
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6};
        System.out.println(avg(arr));
    }
    public static double avg(int [] arr){
        int  sum=0;
        for(int x:arr){
            sum+=x;
        }
        return (double)sum/(double)arr.length;
    }
}
