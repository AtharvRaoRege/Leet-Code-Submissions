class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i: arr){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        HashSet<Integer> hs = new HashSet<>();
        for(Integer val : hm.values()){
            hs.add(val);
        }
        return hs.size() == hm.size() ? true : false;
    }
}