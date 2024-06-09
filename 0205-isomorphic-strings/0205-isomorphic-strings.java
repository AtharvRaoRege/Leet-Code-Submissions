class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character,Character> hm = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char keys = s.charAt(i);
            char replace = t.charAt(i);
            if (!hm.containsKey(keys)) {
                if(!hm.containsValue(replace)){
                    // this will work only if the
                    // keys,replace is not placed in the hm.
                    hm.put(keys,replace);
                }else{
                    // this will run when a keys is present
                    // but the char is not the value of the keys
                    return false;
                }
            }else{
                if(hm.get(keys) != replace) return false;
            }
        }
        return true;
    }
}