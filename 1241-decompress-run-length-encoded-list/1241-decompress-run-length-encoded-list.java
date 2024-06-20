class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> li = new ArrayList<>();
        for(int i = 0; i < nums.length - 1; i += 2){
            for(int j = 0; j < nums[i]; j++){
                li.add(nums[i+1]);
            }
        }
        int []arr = new int[li.size()];
        for(int i = 0; i < li.size(); i++){
            arr[i] = li.get(i);
        }
        return arr;
    }
}