class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer,Integer> hm1 = new HashMap<>();
        Map<Integer,Integer> hm2 = new HashMap<>();
        for(int i : nums1) {
            hm1.put(i,hm1.getOrDefault(i,0)+1);
        }
        for(int i : nums2) {
            hm2.put(i,hm2.getOrDefault(i,0)+1);
        }
        int ans1 = 0;
        int ans2 = 0;
        for(int i = 0; i < nums2.length; i++){
            if(hm1.containsKey(nums2[i])) ans2++;
        }
        for(int i = 0; i < nums1.length; i++){
            if(hm2.containsKey(nums1[i])) ans1++;
        }
        return new int[]{ans1,ans2};
    }
}