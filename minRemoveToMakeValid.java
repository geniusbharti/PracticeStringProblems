class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int open=0, close=0;
        for(char ch: s.toCharArray()){
            if(ch=='('){
               open++; 
            }else if(ch==')'){
                close++;
            } 

            if(close>open) close--;
            else{
                stack.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            char ch = stack.pop();
            if(open!=close && ch=='(') {
                open--;
            }else{
                sb.append(ch);
            }
        } 

        return sb.reverse().toString();
    }
}
