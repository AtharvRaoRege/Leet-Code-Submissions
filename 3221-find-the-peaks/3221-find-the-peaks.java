class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List <Integer> list = new ArrayList<Integer>();
        for(int i = 1; i < mountain.length - 1; i++){
            int prev = mountain[i-1];
            int forw = mountain[i+1];
            int curr = mountain[i];
            if(curr > prev && curr > forw) list.add(i);
        }
        return list;
    }
}