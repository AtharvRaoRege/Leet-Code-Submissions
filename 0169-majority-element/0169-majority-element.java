class Solution {
    public int majorityElement(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        AtomicInteger atom = new AtomicInteger();
        hm.forEach((k,v)->{
            if(v > nums.length / 2) atom.set(k);
        });
        return atom.get();
    }
}