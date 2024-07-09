class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        int min = Math.min(strs[0].length(),strs[strs.length-1].length());
        String f = strs[0];
        String l = strs[strs.length - 1];
        for(int i = 0; i < min; i++){
            if(f.charAt(i) == (l.charAt(i))) sb.append(f.charAt(i));
            else break;
        }
        return sb.toString();
    }
}