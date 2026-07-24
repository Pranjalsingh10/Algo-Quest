class Solution {
    public int maxProduct(int[] nums) {
        int currmaxproduct=nums[0];
        int maxproduct=nums[0];
        int currminproduct=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=currmaxproduct;
                currmaxproduct=currminproduct;
                currminproduct=temp;
            }
            currmaxproduct=Math.max(nums[i],nums[i]*currmaxproduct);
           currminproduct=Math.min(nums[i],nums[i]*currminproduct);

            maxproduct=Math.max(maxproduct,currmaxproduct);
        } 
        return maxproduct;
       }
}