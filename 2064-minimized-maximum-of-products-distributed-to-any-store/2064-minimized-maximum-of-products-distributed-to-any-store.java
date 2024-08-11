class Solution {
     public static int minimizedMaximum(int n, int[] quantities) {
        int max = quantities[0];
        for (int i = 1; i < quantities.length; i++) {
            max = Math.max(quantities[i], max);
        }
        int start = 1;
        int end = max;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (satisfy(quantities, mid, n)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean satisfy(int[] quantities, int x, int n) {
        int ans = 0;
        for (int i = 0; i < quantities.length; i++) {
            ans += quantities[i] / x;
            if (quantities[i] % x != 0) {
                ans++;
            }
            if (ans > n) {
                return false;
            }
        }
        return true;

    }
}