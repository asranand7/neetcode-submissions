class Solution {
    public int maxSubArray(int[] nums) {
        int n= nums.length;
        int maxSoFar = nums[0];
        int currSum = nums[0];
        for(int i = 1;i<n;i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, currSum);
        }
        return maxSoFar;
        
    }
}
