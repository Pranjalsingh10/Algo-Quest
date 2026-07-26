class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int currmax=0;
        int currmin=0;
        int maxsum=0;
        int minsum=0;
        for(int num: nums){
            currmax=Math.max(num,num+currmax);
            maxsum=Math.max(currmax,maxsum);

            currmin=Math.min(num,num+currmin);
            minsum=Math.min(currmin,minsum);

        }
        int absoluteminsum=Math.abs(minsum);
        int absolutemaxsum=Math.abs(maxsum);

        return Math.max(absoluteminsum,absolutemaxsum);
    }
}