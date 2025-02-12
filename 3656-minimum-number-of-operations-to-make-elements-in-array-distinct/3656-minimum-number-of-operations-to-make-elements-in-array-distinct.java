    class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(n)){
                max = Math.max(max,map.get(n)+1);
                map.put(n,i);
            }
            else{
                map.put(n,i);
            }
        }

       
 
        return (int)Math.ceil(max/3.0);
    }
}