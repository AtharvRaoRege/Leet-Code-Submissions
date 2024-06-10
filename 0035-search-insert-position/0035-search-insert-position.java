class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
		int end = nums.length - 1;
		int mid = (start + end)/2;
		while(start <= end) {
			if(target == nums[mid]) return mid;
			else if(nums[mid] < target) start = mid + 1;
			else end = mid - 1;
			mid = (start + end)/2;
		}
		int []newArr = new int [nums.length + 1];	
		for(int i = 0; i < nums.length; i++) {
			newArr[i] = nums[i];
		}
		newArr[nums.length] = target;
		Arrays.sort(newArr);
		int start1 = 0;
		int end1 = newArr.length - 1;
		int mid1 = (start1 + end1)/2;
		while(start1 <= end1) { 
			if(newArr[mid1] == target) return mid1;
			else if(newArr[mid1] < target) start1 = mid1 + 1;
			else end1 = mid1 - 1;
			mid1 = (start1 + end1)/2;
		}
		return -1;	
    }
}