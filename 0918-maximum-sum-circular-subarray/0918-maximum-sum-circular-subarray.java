class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalsum=0;
        int currmax=0,currmin=0;
        int maxsum=nums[0],minsum=nums[0];
        for(int num: nums){
            currmax=Math.max(currmax+num,num);
            maxsum=Math.max(maxsum,currmax);

            currmin=Math.min(currmin+num,num);
            minsum=Math.min(minsum,currmin);

            totalsum+=num;
        }
        if(maxsum<0){
            return maxsum;
        }
        return Math.max(maxsum,totalsum-minsum);
    }
}