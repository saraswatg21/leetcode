class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i=0,j=0,c=0;
        int [] a=new int[2];
       for( i=0;i<nums.length;i++){
           for( j=(i+1);j<nums.length;j++){
               if(nums[i]+nums[j]==target)
               {
                   c=1;
                   break;
               }
           }
           if(c==1)
           {
               break;
           }
       }
        if(c==1)
        {
            a[0]=i;
            a[1]=j;
            return a;
        }
        else{
            a[0]=-1;
            a[1]=-1;
            return a;
        }
    }
}