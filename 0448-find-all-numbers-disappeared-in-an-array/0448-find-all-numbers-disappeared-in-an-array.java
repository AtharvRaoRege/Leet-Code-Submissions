class Solution {
    public static void swap(int [] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int i = 0;
        while(i < nums.length){
            int idx = nums[i] - 1;
            if(nums[i] != nums[idx]) swap(nums,i,idx);
            else i++;
        }
        for(int j = 0; j < nums.length; j++){
            if(j != nums[j] - 1) li.add(j+1);
        }
        return li;
    }
}