import java.util.*;
class Solution{
    public static boolean isSorted(int[] arr,int size){
        if(size == 0 || size ==1){
            return true;
        }
        if(arr[0]>arr[1]){
            return false;
        }
        else{
            return isSorted(arr ,size-1);

        }
    }

    public static void main(String args[]){
        int [] arr = {2,4,8,7,6,9};

        int size = 6;
        Solution s1=new Solution();
        boolean ans = s1.isSorted( arr , size);

        if(ans!=true){
            System.out.println("array is sorted");
        }
        else{
            System.out.println("array is not sorted");
        }


    }
}

