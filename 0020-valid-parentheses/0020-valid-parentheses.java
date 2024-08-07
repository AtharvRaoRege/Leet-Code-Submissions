class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            }
            else {
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(top == '(' && ch != ')') return false;
                else if(top == '[' && ch != ']') return false;
                else if(top == '{' && ch != '}') return false;
                else st.pop();
            }
        }
        return st.size() == 0;
    }
}