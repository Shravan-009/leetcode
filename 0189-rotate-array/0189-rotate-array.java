class Solution {
    public void reverse(int nums[],int l,int h){
        while(l<h){
            int temp=nums[h];
            nums[h]=nums[l];
            nums[l]=temp;
            l++;
            h--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         k = k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
}