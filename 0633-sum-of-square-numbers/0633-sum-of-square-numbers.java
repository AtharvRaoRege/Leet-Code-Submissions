class Solution {
    public boolean judgeSquareSum(int c) {
        long s = 0;
        long e = (int)Math.sqrt(c);
        while(s <= e){
            // long ans = s*s + e*e;
            if(s*s + e*e ==  c) return true;
            else if(s*s + e*e <  c) s++;
            else e--;
        }
        return false;
    }
}