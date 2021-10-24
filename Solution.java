//Justin Butler 10/23/2021
/*
Runtime: 1 ms, faster than 99.15% of Java online submissions for Valid Parentheses.
Memory Usage: 36.9 MB, less than 90.88% of Java online submissions for Valid Parentheses.
*/
class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> open = new Stack<>(); // Holds open parentheses/brackets
        Stack<Character> close = new Stack<>();// Holds close parentheses/brackets
        for(int i = 0; i < s.length(); i++)
        {
            char curr = s.charAt(i); 
            if(curr == '(' || curr =='['||curr=='{')
            {
               open.push(curr); 
            }
            else //if current is a closed parethesis
            {
                if(open.isEmpty()){return false;}
                close.push(curr);
                char currPair = open.peek();  // holds the pairing open parenthesis
                if((curr == ')' && currPair == '(') || (curr == '}' && currPair == '{') ||(curr == ']' && currPair == '['))
                {
                    open.pop();
                    close.pop();
                }
            }
        }
        return open.isEmpty()&&close.isEmpty(); // if all open have a pairing closed parenthesis
        
    }
}
