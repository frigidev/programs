/*
  Resolution of the problem 1929 of Leetcode Concatenation of Array, where given an Array with size n,
  the method must return an Array doubling its size (2n), with the same elements of its initial indexes duplicates in its new indexes.
*/

class Solution {
    public int[] getConcatenation(int[] nums) {
      int ans[] = new int[nums.length*2];
	for(int i=0; i<nums.length; i++) {
		ans[i] = nums[i];
		ans[i+nums.length] = nums[i];
	}
      return ans;
    }
}
