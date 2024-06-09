class Solution {
    public boolean isAnagram(String s, String t) {
        // if(s.length() != t.length()) return false;
        // Map<Character,Integer> hm = new HashMap<>();
        // for(char i : s.toCharArray()){
        //     hm.put(i,hm.getOrDefault(i,0)+1);
        // }
        // Map<Character,Integer> hm2 = new HashMap<>();
        // for(char i: t.toCharArray()){
        //     hm2.put(i,hm2.getOrDefault(i,0)+1);
        // }
        // for(char i: s.toCharArray()){
        //     if(hm.get(i) != hm2.get(i)) return false;
        // }
        // return true;
        if(s.length() != t.length()) return false;
        char []ss = s.toCharArray();
        char []tt = t.toCharArray();
        Arrays.sort(ss);
        Arrays.sort(tt);
        for(int i = 0; i < ss.length; i++){
            if(ss[i] != tt[i]) return false;
        }
        return true;
    }
}