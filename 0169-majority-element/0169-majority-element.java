class Solution {
    public int majorityElement(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int max = 0;
        for(var e: hm.entrySet()){
            if(e.getValue() > nums.length/2 ) max = e.getKey();
        }
        return max;
    }
}