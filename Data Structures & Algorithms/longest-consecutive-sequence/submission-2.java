class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> consecutives = new HashMap<>();
        for(int i = 0;i<n;i++){
            set.add(nums[i]);
        }
        int maxVal = 0;
        for(int i = 0;i<n;i++){
            
            if(!set.contains(nums[i]-1)){
                int count = 1;
                int current = nums[i]+1;
                while(set.contains(current)){
                    count++;
                    current++;
                }
                maxVal = Math.max(maxVal, count);
            }
        }
        return maxVal;
    }
}
