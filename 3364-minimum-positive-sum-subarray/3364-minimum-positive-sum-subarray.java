class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int n = nums.size();
        
        // Iterate over all possible starting indices of the subarray
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            // Iterate over all possible ending indices such that length is between l and r
            for (int j = i; j < n; j++) {
                currentSum += nums.get(j);
                int length = j - i + 1;
                
                // If the length is within the range [l, r] and the sum is positive
                if (length >= l && length <= r) {
                    if (currentSum > 0) {
                        minSum = Math.min(minSum, currentSum);
                    }
                }
                
                // If length exceeds r, we can stop extending this subarray
                if (length > r) {
                    break;
                }
            }
        }
        
        // If minSum wasn't updated, no valid subarray exists
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}