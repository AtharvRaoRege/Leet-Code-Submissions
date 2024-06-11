class Solution {
    public int countCharacters(String[] words, String chars) {
        int t_length = 0;
        for (int i = 0; i < words.length; i++) {
            Map<Character, Integer> hm = new HashMap<>();
            for (char c : chars.toCharArray()) {
                hm.put(c, hm.getOrDefault(c, 0) + 1);
            }
            // System.out.println(hm);
            boolean good = true;
            for (char cc : words[i].toCharArray()) {
                if (hm.containsKey(cc) && hm.get(cc) > 0) {
                    good = true;
                    hm.put(cc, hm.get(cc) - 1);
                } else{
                    good = false;
                    break;
                }
            }
            System.out.println(good);
            if (good)
                t_length += words[i].length();
        }
        return t_length;
    }
}