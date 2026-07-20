class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currentsum=nums[0],maxsum=nums[0];
        for(int i=1;i<n;i++){
            currentsum=Math.max(nums[i],nums[i]+currentsum);
            maxsum=Math.max(currentsum,maxsum);
        } return maxsum;
    }
}