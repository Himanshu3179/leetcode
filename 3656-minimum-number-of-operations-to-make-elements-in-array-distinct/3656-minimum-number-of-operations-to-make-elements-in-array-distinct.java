    class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int max = -1;
        for(int i=0;i<nums.length;i++){
            int n = nums[i];
            if(map.containsKey(n)){
                set.add(map.get(n)/3);
                map.put(n,i);
            }
            else{
                map.put(n,i);
            }
        }

        for(int i:set){
            max = Math.max(i,max);
        }
 
        return (max==-1)?0:max+1;
    }
}