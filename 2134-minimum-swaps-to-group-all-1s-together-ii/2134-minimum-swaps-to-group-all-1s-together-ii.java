class Solution {
    public int minSwaps(int[] nums) {
        // find no. of 1st (window size)
        int windowSize = 0;
        for(int num:nums){
            windowSize+=num;
        }
        int currentZero = 0;
        
        for(int i=0; i<windowSize;i++){
            if(nums[i]==0){
                currentZero++;
            }
        }

        int minZero = currentZero;
        int start = 0;
        int end = windowSize-1;
        int n=nums.length;
        while(start<n){
            if(nums[start]==0){
                currentZero--;
            }
            start++;
            end++;
            if(nums[end%n]==0){
                currentZero++;
            }
            if(currentZero<minZero){
                minZero = currentZero;
            }
        }
        return minZero;
    }
}