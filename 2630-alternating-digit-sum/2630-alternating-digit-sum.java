class Solution {
    public int alternateDigitSum(int n) {
        int sum = 0;
        boolean sign = false;
        int []nums = new int[String.valueOf(n).length()];
        int i = 0;
        while(n > 0){
            int rem = n%10;
            nums[i++] = rem;
            n /= 10;
        } // [ 0 , 1 ];
        for(int j = nums.length - 1; j > -1; j--){
            if(!sign){
                sum += nums[j];
                sign = !sign;
            }
            else{
                sum -= nums[j];
                sign = !sign;
            }
        }
        return sum;
    }
}