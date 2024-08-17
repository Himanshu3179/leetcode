class Solution {
    public int maxSubarraySumCircular(int[] arr) {
        //negative kadane 
        int curMin = 0;
        int globalMin= arr[0];
        int n = arr.length;
        int total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
            curMin =curMin+ arr[i];
            globalMin = Math.min(curMin, globalMin);
            if(curMin>0){
                curMin=0;
            }
        }
        // positive kadane
        int curMax = 0;
        int globalMax= arr[0];

        for(int i=0;i<n;i++){
            curMax =curMax+ arr[i];
            globalMax = Math.max(curMax, globalMax);
            if(curMax<0){
                curMax=0;
            }
        }
        
        System.out.println(globalMin);
        System.out.println(globalMax);
        System.out.println(total);

        if(globalMax<0){
            return globalMax;
        }
        return Math.max(total-globalMin,globalMax);
    }
}