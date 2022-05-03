class Solution {
    public int mySqrt(int x) {
        if(x <= 1) return x; 
        int left = 0,right = x;
        int mid = x / 2;
        
        while(left <= right){
            mid = left + (right - left) / 2;
            if(x / mid >= mid && x / (mid + 1) < (mid + 1)){
                break;
            }
            else if(mid < x / mid)
                left = mid + 1;
            else right = mid - 1;
        }
        return mid;
    }
}