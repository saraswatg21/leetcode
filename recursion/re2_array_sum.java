import java.util.*;
class Solution{
        public static  int getSum(int [] arr, int size){
            if (size==0){
                return 0;
            }
            if(size==1){
                return arr[0];
            }
            return (getSum(arr,size-1)+arr[size-1]);

        }

    public static void main(String args[]){
            int [] arr ={2,3,4,5,6};
            int size = 5;
            int sum = getSum(arr, size);

        System.out.println(sum);
    }
}

