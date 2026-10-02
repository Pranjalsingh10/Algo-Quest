class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==1){
            return 1;
        }
        int i=0;
        int j=0;
        int maxWindow=Integer.MIN_VALUE;
        int[]freq=new int[128];
        while(j<s.length()){
            char curr=s.charAt(j);
            freq[curr]++;
            while(freq[curr]>=2){
                char left=s.charAt(i);
                freq[left]--;
                i++;
            }
            maxWindow=Math.max(maxWindow,j-i+1);
            j++;
        }
        return maxWindow==Integer.MIN_VALUE ? 0 : maxWindow;
    }
}
