class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        int[] result=new int[n1+n2];
        System.arraycopy(nums1,0,result,0,n1);
        System.arraycopy(nums2,0,result,n1,n2);
        Arrays.sort(result);
        int left=0;
        int right=result.length;
        double median=0.00000;
           if(result.length%2!=0){
          int mid=left+(right-left)/2;
          median=result[mid];
          }
        else{ int m1=left+(right-1-left)/2;
        int m2=left+1+(right-1-left)/2;
          median=(result[m1]+result[m2])/2.0;
        }
        return median;
    }
}