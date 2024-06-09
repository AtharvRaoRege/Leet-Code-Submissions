class Solution {
    public boolean parity(int num){
        return num % 2 == 0 ? true : false;
    }
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            if(parity(nums[i-1]) == parity(nums[i])) return false;
        }
        return true;
    }
}