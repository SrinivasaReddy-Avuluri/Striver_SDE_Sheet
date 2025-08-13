import java.util.ArrayList;
import java.util.List;
public class CountInversion {
    public long numberOfInversions(int[] nums) {
        List<Integer> list=new ArrayList<>();
        list.add(nums[0]);
        long count=0;
        for(int i=1;i<nums.length;i++){
            int index=getIndex(list,nums[i]);
            count+=(list.size()-index);
            list.add(index,nums[i]);
        }
        return count;
    }
    public int getIndex(List<Integer> list,int target){
        int l=0,h=list.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            int ele=list.get(mid);
            if(ele>=target) h=mid-1;
            else l=mid+1;
        }
        return l;
    }
    public static void main(String[] args) {
        CountInversion ci = new CountInversion();
        int[] nums = {2, 3, 8, 6, 1};
        System.out.println(ci.numberOfInversions(nums)); // Output: 5
    }
}