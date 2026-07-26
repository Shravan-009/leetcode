class Solution {
    public int pivotIndex(int[] nums) {
        int rmax =0;
       for( int ele : nums){
            rmax += ele;
       }
       int lmax =0;
       for(int i =0;i<nums.length;i++){
        rmax-=nums[i];
        if(rmax==lmax){
            return i;
        }
        lmax+=nums[i];
       }
       return -1;
    }
}