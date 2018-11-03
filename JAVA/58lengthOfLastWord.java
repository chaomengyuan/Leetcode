import java.lang.String;

class Solution {
    // public int lengthOfLastWord(String s) {
    //     int lengthOfString = s.length();
    //     int lastWordEndIndex, startWordEndIndex;
    //     int index = lengthOfString-1;
    //     while (index>=0 && s.charAt(index)==' ')
    //     	index--;
    //     lastWordEndIndex = index;

    //     while (index>=0 && s.charAt(index)!=' ')
    //     	index--;
    //     startWordEndIndex = index;
        
    //     return lastWordEndIndex - startWordEndIndex;
    // }

    public int lengthOfLastWord(String s){
    	String[] strs = s.split("\\s+");
    	if (strs.length == 0)
    		return 0;
    	return strs[strs.length-1].length();
    }

    public static void main (String[] args) {
    	String testString = "   ";
    	System.out.println(new Solution().lengthOfLastWord(testString));
    }
}