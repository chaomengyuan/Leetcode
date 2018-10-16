class Solution {
    public int strStr(String haystack, String needle) {
    	int lenOfHaystack = haystack.length();
    	int lenOfNeedle = needle.length();

        if (lenOfNeedle == 0)
        	return 0;
        else {
        	for (int i = 0; i < (lenOfHaystack - lenOfNeedle + 1); i++){
        		int j = 0;
        		for (; j < lenOfNeedle; j++){
        			if (haystack.charAt(i+j) != needle.charAt(j))
        				break;
        		}
        		if (j == lenOfNeedle)
        			return i;
        	}
        	return -1;
        }
    }
}