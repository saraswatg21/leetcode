import java.util.*;
class Solution{
        public static boolean linearSearch(int [] arr,int size,int k){
            if(size == 0){
                return  false;
            }
            if(arr[size-1] == k){
                return true;
            }

            return linearSearch(arr,size-1,k);

        }

    public static void main(String args[]){
            int [] arr ={3,4,51,2,5};
            int size=5;
            int key =10;

            boolean ans = linearSearch(arr,size,key);

            if(ans){
                System.out.println("found");
            }
            else{
                System.out.println("not found");
            }
    }
}

