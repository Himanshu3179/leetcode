class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
        }
        int start=1;
        int end=max;
        int ans = -1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isValid(nums,mid,threshold)){
                ans = mid;
                end=mid-1;
            }   
            else{
                start=mid+1;
            }
        }
        return ans;
    }

    boolean isValid(int []nums,int divisor ,int threshold){
        int ans= 0;
        for(int i=0;i<nums.length;i++){
            ans+=nums[i]/divisor;
            if((nums[i]%divisor)!=0){
                ans++;
            }
            if(ans>threshold){
                return false;
            }
        }
        return true;
    }
}