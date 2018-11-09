class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	int [] nums = new int[m+n];
    	int i=0, j=0, k = 0;
        for (; i<m && j<n;)
        	nums[k++] = (nums1[i] < nums2[j])? nums1[i++] : nums2[j++];
        if (i==m){
        	for (;j<n;)
        		nums[k++]=nums2[j++];
        }
        if (j==n){
        	for (;i<m;)
        		nums[k++]=nums1[i++];
        }
        nums1 = nums;
    }
}