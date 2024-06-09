class Solution {
    public static boolean isNotPresent(int []arr,int num,int idx){
        for(int i = 0; i < arr.length; i++){
            if(i != idx && num == arr[i])  return false;
        }
        return true;
    }
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(isNotPresent(nums,nums[i],i)){
                sum += nums[i];
            }
        }
        return sum;
    }
}