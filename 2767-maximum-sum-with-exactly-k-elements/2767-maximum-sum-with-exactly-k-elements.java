class Solution {
    public static int maxElem(int []nums){
        int max = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max) max = nums[i];
        }
        return max;
    }
    public int maximizeSum(int[] nums, int k) {
        int sum = 0;
        sum += maxElem(nums);
        for(int i = 0; i < k - 1; i++){
            sum += (maxElem(nums) + i+1);
        }
        return sum;
    }
}