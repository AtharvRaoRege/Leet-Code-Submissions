class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> l1 = new ArrayList<>();
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0; i < nums1.length; i++){
            hm.put(nums1[i],hm.getOrDefault(nums1[i],0)+1);
        }
        for(int i: nums2){
            if(hm.containsKey(i) && hm.get(i) > 0){
                l1.add(i);
                hm.put(i,hm.get(i)-1);
            }
        }
        int []arr = new int[l1.size()];
        for(int i = 0; i < l1.size(); i++){
            arr[i] = l1.get(i);
        }
        return arr;
    }
}