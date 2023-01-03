class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int maxval = Integer.MIN_VALUE;
        int tsum = 0, firstsum = 0;
        for(int i=0;i<n;i++){
            tsum += nums[i];
            firstsum += (nums[i]*i);
        }

        maxval = firstsum;
        for(int i=0;i<n;i++){
            firstsum = firstsum - tsum + nums[i]*n;
            maxval = Math.max(maxval,firstsum); 
        }
        return maxval;
    }
}
