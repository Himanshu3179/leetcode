class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int j = 0;
        int max = 0;
        //HashSet<Character> set = new HashSet<>();
        HashMap <Character,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch) && map.get(ch)>=j){
                j=map.get(ch)+1;
            }
            map.put(ch,i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}