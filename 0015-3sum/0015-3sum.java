class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length < 3) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++){
            int lft = i + 1;
            int rgt = nums.length - 1;
            while(lft < rgt){
                int sum = nums[i] + nums[lft] + nums[rgt];
                if(sum == 0) {
                    res.add(Arrays.asList(nums[i],nums[lft],nums[rgt]));
                    lft++;
                    rgt--;
                }
                else if(sum < 0) lft++;
                else rgt--;
            }
        }
        return new ArrayList<>(res);
    }
}