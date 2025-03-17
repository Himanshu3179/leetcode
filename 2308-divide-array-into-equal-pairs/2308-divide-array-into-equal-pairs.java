class Solution {
    public boolean divideArray(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int n:nums){
            if(set.contains(n)){
                set.remove(n);
            }
            else{
                set.add(n);
            }
        }
        return (set.size()==0)?true:false;
    }
}