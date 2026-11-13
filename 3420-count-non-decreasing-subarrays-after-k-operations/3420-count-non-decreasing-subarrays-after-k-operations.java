import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        int n = nums.length;
        long totalSubarrays = 0;
        long currentCost = 0;
        
        // Monotonic deque storing indices in decreasing order of nums[i]
        // Front of deque holds the maximum element in the current window [left, right]
        Deque<Integer> deque = new ArrayDeque<>();
        
        int right = n - 1;
        // Iterate left pointer from right to left (n - 1 down to 0)
        for (int left = n - 1; left >= 0; left--) {
            // When adding nums[left] to the front of the window, it dominates any smaller
            // elements to its right, forcing them to be raised up to nums[left].
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[left]) {
                int poppedIdx = deque.pollLast();
                int nextIdx = deque.isEmpty() ? right + 1 : deque.peekLast();
                
                // Add the extra operations needed to raise the segment [poppedIdx, nextIdx - 1]
                // from nums[poppedIdx] up to nums[left]
                currentCost += (long) (nextIdx - poppedIdx) * (nums[left] - nums[poppedIdx]);
            }
            
            deque.addLast(left);
            
            // If total operations exceed k, shrink the window from the right side
            while (currentCost > k) {
                // The maximum element covering index 'right' is always at the front of the deque
                int maxIdx = deque.peekFirst();
                currentCost -= (nums[maxIdx] - nums[right]);
                
                // If the front max element was at 'right' itself, remove it from the deque
                if (maxIdx == right) {
                    deque.pollFirst();
                }
                right--;
            }
            
            // All subarrays starting at 'left' and ending anywhere from 'left' to 'right' are valid
            totalSubarrays += (right - left + 1);
        }
        
        return totalSubarrays;
    }
}