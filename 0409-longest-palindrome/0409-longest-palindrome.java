class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char i : s.toCharArray()){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int sum = 0;
        boolean x = false;
        for(var e:hm.entrySet()){
            int val = e.getValue();
            char key = e.getKey();
            if(val%2 == 0){
                sum += val;   
            }else if(val%2 != 0 && val != 1){
                sum += val-1;
                x = true;
            }else{
                x = true;
            }
        }
        return x  ? sum + 1 : sum;
    }
}