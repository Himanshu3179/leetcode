class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int p = a.length() - 1;
        int q = b.length() - 1;
        String ans = "";
        while (p >= 0 && q >= 0) {
            int total = (a.charAt(p) - '0') + (b.charAt(q) - '0') + carry;
            if (total == 3) {
                carry = 1;
                ans = "1" + ans;
            }
            if (total == 2) {
                carry = 1;
                ans = "0" + ans;
            }
            if (total == 1) {
                carry = 0;
                ans = "1" + ans;
            }
            if (total == 0) {
                carry = 0;
                ans = "0" + ans;
            }
            p--;
            q--;
        }
        while (p >= 0) {
            int total = (a.charAt(p) - '0') + carry;
            if (total == 2) {
                carry = 1;
                ans = "0" + ans;
            }
            if (total == 1) {
                carry = 0;
                ans = "1" + ans;
            }
            if (total == 0) {
                carry = 0;
                ans = "0" + ans;
            }
            p--;

        }
        while (q >= 0) {
            int total = (b.charAt(q) - '0') + carry;
            if (total == 2) {
                carry = 1;
                ans = "0" + ans;
            }
            if (total == 1) {
                carry = 0;
                ans = "1" + ans;
            }
            if (total == 0) {
                carry = 0;
                ans = "0" + ans;
            }
            q--;

        }
        if (carry == 1) {
            return "1" + ans;
        }
        return ans;
    }
}