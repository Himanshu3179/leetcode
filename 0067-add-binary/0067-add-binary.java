class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int p = a.length() - 1;
        int q = b.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (p >= 0 || q >= 0) {
            int sum = carry;
            if (p >= 0) {
                sum += a.charAt(p) - '0';
                p--;
            }
            if (q >= 0) {
                sum += b.charAt(q) - '0';
                q--;
            }
            carry = sum / 2;
            ans.append(sum % 2);
        }
        if (carry != 0) {
            ans.append(carry);

        }
        return ans.reverse().toString();
    }
}