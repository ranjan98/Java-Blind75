class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int prefix[] = new int[n];
        Arrays.fill(prefix, 1);
        int suffix[] = new int[n];
        Arrays.fill(suffix, 1);
        for(int i=0; i<n-1; i++){
            prefix[i+1] = nums[i]*prefix[i];
        }
        for(int i=n-1; i>=1; i--){
            suffix[i-1] = nums[i]*suffix[i];
        }
        for(int i=0; i<n;i++){
            ans[i] = suffix[i]*prefix[i];
        }
        return ans;
    }
}
