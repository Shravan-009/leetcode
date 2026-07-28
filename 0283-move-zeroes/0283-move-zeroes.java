class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        if(n==0||n==1){
            return;
        }
        int a =0;
        int b =0;
        while(a<n){
            if(nums[a]!=0){
                int temp = nums[a];
                nums[a]=nums[b];
                nums[b]=temp;
                a++;
                b++;
            }
            else{
                a++;
            }

        }
    }
}