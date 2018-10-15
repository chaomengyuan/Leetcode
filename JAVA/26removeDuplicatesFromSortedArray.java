import java.lang.String;

class Solution {
    public int removeDuplicates(int[] nums) {
        int currentPos = 0;
        for (int i = 0; i < nums.length;) {
        	nums[currentPos] = nums[i];
        	while ((++i < nums.length) && (nums[currentPos]==nums[i])){
        		nums[currentPos] = nums[i];
        	}
        	currentPos++;      	
        }
        return currentPos;
    }

    public static void main(String[] args){
    	int[] test1 = {1,1,1,2,2,3,3,4,4,5,6,6};
    	System.out.println(new Solution().removeDuplicates(test1));
    }
}


