class Solution {
 public static int sumOfDigit(int num){
        int sum = 0;
        while(num > 0){
            int rem = num%10;
            sum += rem;
            num /= 10;
        }
        return sum;
    }

    public static int differenceOfSum(int[] nums) {
        int diff = 0;
        int sumDigits = 0;
        int sum = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            sumDigits += sumOfDigit(nums[i]);
            sum += nums[i];
        }
        diff = Math.abs(sumDigits - sum);
        return diff;
    }
}