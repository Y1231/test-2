//1.查找数组中的指定元素
// public class lx1126{
//     public static void main (String arge[]){
//         int [] arr={1,2,3,10,5,6};
//         System.out.println(find (arr,10));
//     }
//     public static int find (int [] arr,int toFind){
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]==toFind){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


//2.查找数组中指定元素(二分查找)
// public class lx1126{
//     public static void main (String arge[]){
//         int [] arr={1,2,3,4,5,6};
//         System.out.println(binarySearch(arr,6));
//     }
//     public static int binarySearch(int [] arr,int toFind){
//         int left=0;
//         int right=arr.length-1;
//         while(left<=right){
//             int mid=(left+right)/2;
//             if(toFind<arr[mid]){
//                 right=mid-1;
//             }else if(toFind>arr[mid]){
//                 left=mid+1;
//             }else{
//                 return mid;
//             }
//         }
//         return -1;
//         }
//     }


public class lx1126{
    static int count=0;
    public static void main (String arge[]){
        int [] arr=makeBigArray();
        int ret=binarySearch(arr,9999);
        System.out.println("ret="+ret+"count="+count);
        }
    public static int [] makeBigArray(){
        int [] arr=new int [10000];
        for(int i=0;i<10000;i++){
            arr [i]=i;
        }
        return arr; 
    }
    public static int binarySearch(int [] arr,int toFind){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            count++;
            int mid=(left+right)/2;
            if(toFind<arr[mid]){
                right=mid-1;
            }else if(toFind>arr[mid]){
                left=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

