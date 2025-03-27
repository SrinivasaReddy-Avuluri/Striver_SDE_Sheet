import java.util.*;
class Solution {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> arr=new ArrayList<>();
        arr.add(1);
        for(int j=1;j<=rowIndex;j++){
            int prev=0;
            for(int i=0;i<arr.size();i++){
                int curr=arr.get(i);
                arr.set(i,curr+prev);
                prev=curr;
            }
            arr.add(arr.size(),1);
        }
        return arr;
    }
    public static void main(String[] args) {
        List<Integer> arr=getRow(99);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
// Time:O(RowIndex^2)
// Space:O(RowIndex)
// The follow up is to optimize the space complexity to O(rowIndex) by using only one list.
// The O(rowIndex) time can be achieved by using the formula C(n,k)=n!/(k!*(n-k)!)
