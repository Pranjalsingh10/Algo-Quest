class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;         
        if (k == 0) return;
        Stack<Integer> s = new Stack<>();       
        for (int num : nums) {
            s.push(num);
        }       
        for (int i=k-1;i>=0;i--){
            nums[i]=s.pop();
        }
        for (int i=n-1;i>=k;i--){
            nums[i]=s.pop();
        }
    }
}