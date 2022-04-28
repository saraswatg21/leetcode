import java.util.*;
class Solution{
        public static boolean binarySearch(int [] arr,int s, int e ,int k){
            int mid = (s+e)/2;
           if(s>e){
               return false;
           }
           if(arr[mid]==k){
               return true;
           }
           if(arr[mid]<k){
               return binarySearch(arr,mid+1,e,k);
           }
           else{
               return binarySearch(arr,s,mid-1,k);
           }
        }

    public static void main(String args[]){
            int [] arr ={3,4,51,2,5};
            int size=5;
            int key =51;

            boolean ans = binarySearch(arr,0,5,key);

            if(ans){
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
    }
}

