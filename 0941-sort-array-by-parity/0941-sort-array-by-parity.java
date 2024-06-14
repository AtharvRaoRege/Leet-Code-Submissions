class Solution {
    public void swap(int []nums,int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public int[] sortArrayByParity(int[] nums) {
        int []arr = new int[nums.length];
        int s = 0; int e = nums.length - 1;
        while(s<e){
            int lft = nums[s];
            int rgt = nums[e];
            if(lft % 2 == 0 && rgt % 2 != 0) {
                s++; e--;
            }
            else if(lft % 2 != 0 && rgt % 2 == 0)swap(nums,s++,e--); 
            else if(lft % 2 == 0 && rgt % 2 == 0) s++;
            else e--;
        }
        return nums;
    }
}