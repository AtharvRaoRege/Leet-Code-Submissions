class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> hm = new HashMap<>();
        for(char i: s.toCharArray()){
            hm.put(i ,hm.getOrDefault(i ,0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < order.length(); i++){
            if(hm.containsKey(order.charAt(i))){
                int cnt = hm.get(order.charAt(i));
                while(cnt-- > 0) {
                    sb.append(order.charAt(i));
                }
            }
        }
        for(int i = 0; i < s.length(); i++){
            char x = s.charAt(i);
            if(order.indexOf(x) == -1) {
                sb.append(x);
            }
        }
        return sb.toString();  
    }
}