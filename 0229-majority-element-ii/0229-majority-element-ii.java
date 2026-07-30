class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0;
        Integer Candidate1=null,Candidate2=null;
        int n=nums.length;

        for(int num: nums){
            if(Candidate1!=null && Candidate1==num){
                count1++;
            }
            else if(Candidate2!=null && Candidate2==num){
                count2++;
            }
            else if(count1==0){
                Candidate1=num;
                count1++;
            }
            else if(count2==0){
                Candidate2=num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;

        for(int num:nums){
            if(Candidate1!=null && Candidate1==num){
                count1++;
            }
            if(Candidate2!=null && Candidate2==num){
                count2++;
            }
        }

        List<Integer> result=new ArrayList<>();
        if(count1>n/3){
            result.add(Candidate1);
        }
        if(count2>n/3){
            result.add(Candidate2);
        }
        return result;
    }
}