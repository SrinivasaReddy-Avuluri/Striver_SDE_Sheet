import java.util.ArrayList;
public class SearchIn2DMatrix {
    public static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int l=0,h=mat.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(mat.get(mid).get(0)==target) return true;
            else if(mat.get(mid).get(0)<target) l=mid+1;
            else h=mid-1;
        }
        if(l==0) return false;
        ArrayList<Integer> arr=mat.get(l-1);
        l=0;h=arr.size()-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(arr.get(mid)==target) return true;
            else if(arr.get(mid)>target) h=mid-1;
            else l=mid+1;
        }
        return false;
    }
}