class Solution {
    public int fib(int n) {
        if(n<=1) return n;
        int zero=0;
        int one=1;
        int result=0;
        for(int i=2;i<=n;i++){
           result= zero+one;
             zero=one;
            one=result;
        }
        return result;
    }
}