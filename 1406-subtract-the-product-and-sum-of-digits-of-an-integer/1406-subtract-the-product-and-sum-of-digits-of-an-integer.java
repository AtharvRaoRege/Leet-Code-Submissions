class Solution {
    public int subtractProductAndSum(int n) {
        int temp = n;
        int sum = 0;
        while(n > 0){
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }
        int mul = 1;
        while(temp > 0){
            int rem = temp % 10;
            mul *= rem;
            temp /= 10;
        }
        return mul - sum;
    }
}