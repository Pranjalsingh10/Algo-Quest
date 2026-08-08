class Solution {//19
    public int climbStairs(int n) {
        if(n<=3) return n;
        int two=2;
        int three=3;
        int result=0;
        for(int i=4;i<=n;i++){
            result=two+three;
            two=three;
            three=result;
        }
        return result;        
    }
}