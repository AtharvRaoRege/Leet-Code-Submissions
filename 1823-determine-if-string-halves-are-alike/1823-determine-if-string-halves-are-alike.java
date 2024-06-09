class Solution {
    public static boolean isVowel(char i){
        if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'||i=='A'||i=='E'||i=='I'||i=='O'||i=='U') return true;
        return false;
    }
    public boolean halvesAreAlike(String s) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i < s.length()/2) s1.append(s.charAt(i));
            else s2.append(s.charAt(i));
        }
        String str1 = String.valueOf(s1);
        String str2 = String.valueOf(s2);
        int s1cnt = 0;
        int s2cnt = 0;
        for(char i: str1.toCharArray()){
            if(isVowel(i)) s1cnt++;
        }
        for(char i: str2.toCharArray()){
            if(isVowel(i)) s2cnt++;
        }
        System.out.print(str1 +" "+s1cnt+" ,"+str2 +" "+ s2cnt);
        if(s1cnt != s2cnt) return false;
        return true;
    }
}