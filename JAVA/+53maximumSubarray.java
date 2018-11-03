import java.util.*;

class Solution {
    public int maxSubArray(int[] nums) {
		int maxSum = nums[0];
		int maxSumOfSeqArrayWithCurAsRightest = nums[0];
		for (int i = 1; i < nums.length; i++){
			maxSumOfSeqArrayWithCurAsRightest = Math.max(maxSumOfSeqArrayWithCurAsRightest+nums[i],nums[i]);
			maxSum = Math.max(maxSum,maxSumOfSeqArrayWithCurAsRightest);
		}
		return maxSum;
    }

    public static void main(String[] args){
    	int [] numsArray = {-2,1,-3,4,-1,2,1,-5,4};
    	int maxSubArray = new Solution().maxSubArray(numsArray);
    	System.out.println(maxSubArray);
    }
}
