class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        int  count =1;
        int ans =1;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])continue;
            if(nums[i]==nums[i+1]-1){
                count++;
            }else{
                ans = Math.max(count,ans);
                count = 1;

            }
        }
        return Math.max(count,ans);

    }
}