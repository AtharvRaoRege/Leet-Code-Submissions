class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int []newarr = new int[nums1.length + nums2.length];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]) newarr[k++] = nums1[i++];
            else newarr[k++] = nums2[j++];
        }
        while(i < nums1.length) {
            newarr[k++] = nums1[i++];
        }
        while(j < nums2.length) {
            newarr[k++] = nums2[j++];
        }
        if(newarr.length % 2 == 1){
            return newarr[newarr.length/2];
        }
        return (newarr[newarr.length/2] + newarr[(newarr.length - 1)/2])/2.00;
    }
}