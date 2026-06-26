class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1; // Direct array length
        int maxproduct = 0;
        
        while (left < right) {
            // The indices themselves ARE the keys!
            int leftkey = left;
            int rightkey = right;
            
            int difference = rightkey - leftkey;
            
            // The array values ARE the map values!
            int leftval = height[left];
            int rightval = height[right];
            
            int minValue = Math.min(leftval, rightval);
            int currentProduct = difference * minValue;
            
            maxproduct = Math.max(maxproduct, currentProduct);
            
            // Your excellent pointer movement logic
            if (leftval < rightval) {
                left++;
            } else {
                right--;
            }
        }
        
        return maxproduct;
    }
}