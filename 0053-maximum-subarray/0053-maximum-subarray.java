class Solution {
    public int maxSubArray(int[] arr) {
        int maxSum = arr[0];
        int curSum = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            maxSum = Math.max(maxSum, curSum);
            if (curSum < 0) {
                curSum = 0;
            }
        }
        return maxSum;
    }
}