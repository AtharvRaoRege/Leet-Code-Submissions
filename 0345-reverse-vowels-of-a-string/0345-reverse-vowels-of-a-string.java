class Solution {
    public boolean isVowel(char ch){
        if("aeiouAEIOU".indexOf(ch) != -1) return true;
        return false;
    }
    public static void swap(char[] charArray, int index1, int index2) {
        char temp = charArray[index1];
        charArray[index1] = charArray[index2];
        charArray[index2] = temp;
    }
    public String reverseVowels(String s) {
        int start = 0, end = s.length() - 1;
        char []ss = s.toCharArray();
        while(start < end){
            char f = s.charAt(start);
            char l = s.charAt(end);
            if(!isVowel(f)){
                start++;
                f = s.charAt(start);
            }
            if(!isVowel(l)){
                end--;
                l = s.charAt(end);
            }
            if(start < end && isVowel(f) && isVowel(l)){
                swap(ss,start,end);
                start++;
                end--;
            }
        }
        return String.valueOf(ss);
    }
}