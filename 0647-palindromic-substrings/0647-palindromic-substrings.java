class Solution {
    public int countSubstrings(String s) {
        int totalcount=0;
        for(int i=0;i<s.length();i++){
            totalcount+=expandfromcentre(s,i,i);
            totalcount+=expandfromcentre(s,i,i+1);
        }
        return totalcount;
    }
    private int expandfromcentre(String s,int left,int right){
        int count=0;
        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)){
            count++;
            left--;
            right++;
        }
        return count;
    }
}