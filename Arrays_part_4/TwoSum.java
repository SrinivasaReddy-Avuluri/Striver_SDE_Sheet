public class TwoSum {
    public static int[] twoSum(int[] arr,int target){
        int l=0,h=arr.length-1;
        while(l<h){
            int curr=arr[l]+arr[h];
            if(curr==target) return new int[]{l,h};
            else if(curr>target) h--;
            else l++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 18;
        int[] result = twoSum(arr, target);
        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}