class Solution {
    // public static boolean isPallindrome(String str) {
    //     for (int i = 0; i < str.length() / 2; i++) {
    //         if (str.charAt(i) != str.charAt(str.length() - i - 1))
    //             return false;
    //         continue;
    //     }
    //     return true;
    // }

    public static String firstPalindrome(String[] words) {
        // for (int i = 0; i < words.length; i++) {
        //     if (isPallindrome(words[i]))
        //         return words[i];
        // }
        // return "";

                for(int i = 0; i < words.length; i++){
            int k = 0;
            for(int j = 0; j < words[i].length(); j++){
                if(words[i].charAt(j) != words[i].charAt(words[i].length() - j - 1)) {
                    k = 1;
                    break;
                }
            }
            if(k == 0) return words[i];
        }
        return "";
    }
}