class Solution {
    int maxSubarraySum(int[] arr) {
        int ans=arr[0],curr_max=arr[0];
        for(int i=1;i<arr.length;i++){
            curr_max=Math.max(curr_max+arr[i],arr[i]);
            ans=Math.max(curr_max,ans);
        }
        return ans;
    }
}