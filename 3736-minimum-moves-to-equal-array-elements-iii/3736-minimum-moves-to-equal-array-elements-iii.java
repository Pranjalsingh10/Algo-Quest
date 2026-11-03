class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int j=nums.length-1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
                int res=nums[j]-nums[i];
                sum+=res;
        }
        return sum;
    }
}