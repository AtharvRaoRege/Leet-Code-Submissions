class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        // will remove remove spaces from the beginning and the ending of the string.
        String[] str = s.split(" ");
        // split will store the string in a splitted manner on the basis of " ";
        // s = "the sky is blue" str[0] = "the" str[1] = "sky" .....
        StringBuilder st = new StringBuilder();
        for (int i = str.length - 1; i > -1; i--) {
            st.append(str[i]);
            if (i != 0)
                st.append(" ");
        }
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < st.toString().length(); i++){
            if(st.toString().charAt(i) != ' ' || st.toString().charAt(i-1) != ' ') newStr.append(st.toString().charAt(i));
        }
        return String.valueOf(newStr);
    }
}