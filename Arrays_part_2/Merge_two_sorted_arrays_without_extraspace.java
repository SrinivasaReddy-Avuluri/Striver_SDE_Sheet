import java.util.Arrays;
public class MergeTwoSortedArraysWithoutExtraSpace {
    public static void mergeTwoSortedArraysWithoutExtraSpace(long []a, long []b){
        int left=a.length-1,right=0;
        while(left>=0 && right<b.length && a[left]>b[right]){
            long temp=a[left];a[left]=b[right];b[right]=temp;
            left--;right++;
        }
        Arrays.sort(a);
        Arrays.sort(b);
    }
}