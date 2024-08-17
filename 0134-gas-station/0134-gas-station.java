class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        //check sum 
        int sumGas=0;
        int sumCost = 0;
        if(gas.length!=cost.length) return -1;
        int n = gas.length;        

        for(int i=0;i<gas.length;i++){
            sumGas+=gas[i];
            sumCost+=cost[i];
        }
        if(sumGas<sumCost){
            return -1;
        }

        int diff[] = new int[n];
        for(int i=0;i<n;i++){
            diff[i]=gas[i]-cost[i];
        }
        int total=0;
        int idx=0;
        for(int i=0;i<n;i++){
            total+=diff[i];
            if(total<0){
                total=0;
                idx=i+1;
            }
        }
        return idx;
    }
}