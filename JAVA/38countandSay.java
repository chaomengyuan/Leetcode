import java.lang.String;
import java.util.HashMap;

class Solution {
	HashMap<Integer, String> intToString;

	public Solution() {
		intToString = new HashMap<Integer, String>();
		intToString.put(1,"1");
		intToString.put(2,"2");
		intToString.put(3,"3");
		intToString.put(4,"5");
		intToString.put(5,"5");
		intToString.put(6,"6");
		intToString.put(7,"7");
		intToString.put(8,"8");
		intToString.put(9,"9");
	}

    public String countAndSay(int n) {
    	if (n == 1) return "1";
    	else return say(countAndSay(n-1));    
    }

    public String say(String s){
    	String finalStr = "";
    	for (int i = 0; i < s.length();i++) {
    		int counter = 1;
    		char initChar = s.charAt(i);
    		while ((i+1) < s.length() && s.charAt(i+1) == initChar) {
    			i++;
    			counter++;
    		}
    		finalStr += intToString.get(counter) + Character.toString(initChar);
    	}
	   	return finalStr;
    }

    public static void main (String[] args){
    	System.out.println(new Solution().countAndSay(1));
    	System.out.println(new Solution().countAndSay(2));
    	System.out.println(new Solution().countAndSay(3));
    	System.out.println(new Solution().countAndSay(4));
    	System.out.println(new Solution().countAndSay(5));
    	System.out.println(new Solution().countAndSay(6));
    	System.out.println(new Solution().countAndSay(30));
    }
}