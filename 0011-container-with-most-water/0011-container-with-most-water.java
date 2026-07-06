class Solution {
    public int maxArea(int[] height) {
        int h=height.length;
        int left=0;
        int right=h-1;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int currheight=Math.min(height[left],height[right]);
           int area=width*currheight;
           maxarea=Math.max(area,maxarea);
           if(height[left]<height[right]){
            left++;
           } else right--;

        }
        return maxarea;
    }
}