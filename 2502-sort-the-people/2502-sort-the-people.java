class Solution {
    public static void swap(int []arr, int idx1, int idx2){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void swap(String[]arr,int idx1,int idx2){
        String temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
    public static void bubbleSort(int []heights,String []names){
        for(int i = 0; i < heights.length; i++){
            for(int j = 0; j < heights.length - i - 1; j++){
                if(heights[j] < heights[j+1]) {
                    swap(heights,j,j+1);
                    swap(names,j,j+1);
                }
            }
        }
    }
    public static String[] sortPeople(String[] names, int[] heights) {
        bubbleSort(heights,names);
        // System.out.println(Arrays.toString(heights));
        return names;
    }
}