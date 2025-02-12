class Solution {
    public int maximumSum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = -1;
        for(int i :nums){
            int sum = sumOfDigits(i);
            if(map.containsKey(sum)){
                max = Math.max(map.get(sum)+i,max);
                if(map.get(sum)<i){
                    map.put(sum,i);
                }
            }
            else{
                map.put(sum,i);
            }
        }
        return max;
    }
    public int sumOfDigits(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}