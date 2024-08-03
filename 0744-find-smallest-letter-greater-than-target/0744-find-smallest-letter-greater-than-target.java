class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       char ans = letters[0];
        int l = 0;
        int r = letters.length - 1;
        while (r >= l) {
            int m = l + (r - l) / 2;
            if (letters[m] == target) {
                l = m + 1;
            } else if (letters[m] > target) {
                ans = letters[m];
                r = m - 1;
            } else {
                l = m + 1;
            }
        }
        return ans;
    }
}