class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        int ans =0;
        for(int i =0 ;i<n;i++){
            int ele = nums[i];
            ele = Math.abs(ele);

            if(nums[ele]>0){
                nums[ele]=-nums[ele];
            }else{
                ans = ele;
                break;
            }
        }

        return ans;
       
    }
}