class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0;
        int mul = 1;
        while(n > 0){
            int rem = n % 10;
            mul *= rem;
            sum += rem;
            n /= 10;
        }
        return Math.abs( mul - sum );
    }
}
