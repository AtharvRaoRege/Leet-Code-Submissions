class Solution {
    public static boolean isVowel(char a){
        a = Character.toLowerCase(a);
        if(!Character.isLetter(a)) return false;
        String vowels = "aeiou";
        if(vowels.indexOf(a) != -1) return true;
        return false;
    }
    public static boolean isDigit(char ch){
        if(ch>='0' && ch<='9') return true;
        return false;
    }
    public static boolean isConsonent(char ch){
        ch = Character.toLowerCase(ch);
        if(!Character.isLetter(ch)) return false;
        String vowels = "aeiou";
        if(vowels.indexOf(ch) != -1) return false;// vowel check
        return true;
    }
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean digits = false,vowels = false, consonent = false;
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(isDigit(ch)) digits = true;
            else if(isVowel(ch)) vowels = true;
            else if(isConsonent(ch)) consonent = true;
            else return false;
        }
        if(vowels && consonent) return true;
        return false;
    }
}