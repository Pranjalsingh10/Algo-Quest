class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && // rec1 left is to the left of rec2 right
               rec1[2] > rec2[0] && // rec1 right is to the right of rec2 left
               rec1[1] < rec2[3] && // rec1 bottom is below rec2 top
               rec1[3] > rec2[1];   // rec1 top is above rec2 bottom
    }
}