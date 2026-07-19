class Solution {
    public boolean isValid(String s) {
        Stack<Character> val = new Stack<>(); 

        int len = s.length(); 
        int i= 0;
        while(i<len){
            char current = s.charAt(i);
            if(s.charAt(i)== '(' || s.charAt(i)== '[' || s.charAt(i)== '{'){
                    val.push(s.charAt(i)) ; 
            }
             else {
                if (val.isEmpty()) {
                    return false;
                }
                if ((current == ')' && val.peek() == '(') ||
                    (current == ']' && val.peek() == '[') || 
                    (current == '}' && val.peek() == '{')) {
                    val.pop(); 
                } else {
                    return false;
                }
            }
            i++ ; 
        }
        return val.isEmpty() ; 
    }
}
