class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int p1 = num1.length() - 1;
        int p2 = num2.length() - 1;
        while(p1 > -1 || p2 > -1) {
            int sum = carry;
            if(p1 > -1) sum += num1.charAt(p1--) - '0';
            if(p2 > -1) sum += num2.charAt(p2--) - '0';
            carry = sum / 10;
            sum %= 10;
            sb.append(sum);
        }
        if(carry == 1) sb.append(carry);
        return sb.reverse().toString();
    }
}