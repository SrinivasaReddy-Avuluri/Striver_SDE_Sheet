import java.util.ArrayList;
import java.util.List;
public class ReversePairs {
    public int searchBinary(List<Integer> arr,int target){
        int low=0,high=arr.size()-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr.get(mid)<=target) low=mid+1;
            else high=mid-1;
        }
        return low;
    }
    public int reversePairs(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            int index=searchBinary(arr,2*nums[i]);
            count+=(arr.size()-index);
            arr.add(searchBinary(arr,nums[i]),nums[i]);
        }
        return count;
    }
    public static void main(String[] args) {
        ReversePairs rp = new ReversePairs();
        int[] nums = {1, 3, 2, 3, 1};
        System.out.println(rp.reversePairs(nums));  // Output: 2
    }
}