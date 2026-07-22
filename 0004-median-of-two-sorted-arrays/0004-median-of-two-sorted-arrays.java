
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] ans=merge(nums1,nums2);
        if(ans.length%2==0){
            double res=(double)(ans[ans.length/2]+ans[ans.length/2-1])/2;
            return res;
        }else{
            double res =(double) ans[ans.length/2];
            return res;
        }
        
    }
    public int[] merge(int[] arr1 , int[] arr2){
        int[] ans = new int[arr1.length+arr2.length];
        for(int i =0;i<arr1.length;i++){
            ans[i]=arr1[i];
        }
        for(int i =0;i<arr2.length;i++){
            ans[arr1.length+i]=arr2[i];
        }
        Arrays.sort(ans);
        return ans;
        }
        
    }


