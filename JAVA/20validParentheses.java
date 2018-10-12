import java.util.HashMap;
import java.util.Stack;
import java.lang.String;

class Solution {
    
	private HashMap<Character, Character> paretheses;

    public Solution(){
    	paretheses = new HashMap<Character,Character>(); // record all the matched pairs
    	paretheses.put(')','(');
    	paretheses.put(']','[');
    	paretheses.put('}','{');
    }

    public boolean isValid(String s) {
        Stack<Character> charStack = new Stack<Character>();	// stack for storing the string

        for (int index=0; index<s.length();index++){
        	char newChar = s.charAt(index);

        	if(paretheses.containsKey(newChar)){
        		char topChar = charStack.empty() ? '#' : charStack.pop();   // directly starting with ')',']','}' is also incorrect

        		if (topChar!=paretheses.get(newChar))
        			return false;
        	} else {
        		charStack.push(newChar);
        	}
        }
        return charStack.isEmpty();		// return false if there is still parethese in the stack
    }

    public static void main(String[] args){
    	Solution solution = new Solution();
    	System.out.println(solution.isValid(args[0]));
    }
}