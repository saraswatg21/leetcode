class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
        int sum=n*(n+1)/2;
        int arrsum=0;
        for(int i : nums){
            arrsum=arrsum + i;
        }
        int missingNo= sum-arrsum;
        return missingNo;
    }
}