class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> s=new Stack<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=prices.length;
        int[] ans=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()>prices[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                ans[i]=prices[i]-s.peek();
                //s.pop();
            }
            else{
                ans[i]=prices[i];
            }
            s.push(prices[i]);
        }
        return ans;
    }
}