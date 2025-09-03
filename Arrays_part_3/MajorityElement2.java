
import java.util.*;
class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        int candidate_1=Integer.MIN_VALUE,candidate_2=Integer.MIN_VALUE,count_1=0,count_2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate_1) count_1++;
            else if(nums[i]==candidate_2) count_2++;
            else if(count_1==0){
                candidate_1=nums[i];count_1++;
            }
            else if(count_2==0){
                candidate_2=nums[i];count_2++;
            }
            else{count_1--;count_2--;}
        }
        count_1=0;count_2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate_1) count_1++;
            if(nums[i]==candidate_2) count_2++;
        }
        List<Integer> arr=new ArrayList<>();
        if(count_1>nums.length/3)arr.add(candidate_1);
        if(count_2>nums.length/3) arr.add(candidate_2);
        return arr;
    }
    public static void main(String[] args) {
        MajorityElement2 obj = new MajorityElement2();
        int[] nums = {3, 2, 3, 2, 3, 5,2};
        System.out.println(obj.majorityElement(nums));
    }
}