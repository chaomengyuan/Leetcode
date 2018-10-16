import java.lang.String;

class Solution {
    public int removeElement(int[] nums, int val) {
    	int oriLen = nums.length;
    	int finalLen = oriLen;
    	int curPos = 0;
		int i = 0;
    	while ( i< oriLen ){
	    	while (i< oriLen && nums[i]!=val){
	    		nums[curPos++] = nums[i++];
	    	}
	    	if (i < oriLen){
	    		while (i < oriLen && nums[i] == val){
	    			i++;
	    			finalLen--;
	    		}
	    	}
		}
        return finalLen;
    }

    public static void main(String[] args){
    	int[] test1 = {0,1,2,2,3,0,4,2};
    	int len = new Solution().removeElement(test1,2);

    	for (int i = 0; i < len; i++) {
		    System.out.print(test1[i]);
		}
    }
}