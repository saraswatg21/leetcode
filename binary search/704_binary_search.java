class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length-1;
        int mid =(s+e)/2;
        while(s<=e){
        if(nums[mid]==target){
            return mid;
        }
        else if(target>nums[mid]){
            s=mid+1; 
        }
        else {
            e=mid-1;
        }
         mid=(s+e)/2;   
            }
        return -1;
    }
}