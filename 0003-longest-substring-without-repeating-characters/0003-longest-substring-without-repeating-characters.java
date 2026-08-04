class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlength=0;
        int left=0;
        HashMap<Character,Integer>lastseen=new HashMap<>();
        for(int right=0;right<s.length();right++){
        char currchar=s.charAt(right);

            if(lastseen.containsKey(currchar) && lastseen.get(currchar)>=left){
                left=lastseen.get(currchar)+1;
            }

            lastseen.put(currchar,right);

            maxlength=Math.max(maxlength,right-left+1);

        }
        return maxlength;
    }
}