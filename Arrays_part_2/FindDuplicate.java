public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(i==nums[i]-1){i++;continue;}
            if(nums[i]==nums[nums[i]-1]) return nums[i];
            int temp=nums[i];nums[i]=nums[temp-1];nums[temp-1]=temp;
        }
        return 0;
    }
}
// Time Complexity: O(n)
// Space Complexity:O(1)