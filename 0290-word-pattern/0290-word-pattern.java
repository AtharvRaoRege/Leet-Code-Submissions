class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> hm = new HashMap<>();
        String pattern1 = pattern.trim();
        String []ss = s.split(" ");
        if(pattern.length() != ss.length) return false;
        int j = 0;
        for(char i:pattern1.toCharArray()){
            if(!hm.containsKey(i)){
                if(!hm.containsValue(ss[j])){
                     hm.put(i,ss[j++]);
                }else{
                    System.out.println("1");
                    return false;
                }
            }else{
                if(!hm.get(i).equals( ss[j++])) {
                    System.out.println("2");
                    return false;
                }
            }
        }
        return true;
    }
}