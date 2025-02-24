class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i=0,j=0;
        int max = 0;
        int n=s.length();
        while(i<n){
            while(i<n && !set.contains(s.charAt(i))){
                set.add(s.charAt(i));
                max=Math.max(max,i-j+1);
                i++;
            }
            while(i<n && set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                j++;
            }
        }
        return max;
    }
}