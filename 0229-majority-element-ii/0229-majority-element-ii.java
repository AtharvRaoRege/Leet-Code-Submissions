class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        // AtomicInteger atom = new AtomicInteger();
        hm.forEach((key,val)->{
            if(val > nums.length / 3) {
                // atom.set(key);
                list.add(key);
            }
        });
        return list;
    }
}