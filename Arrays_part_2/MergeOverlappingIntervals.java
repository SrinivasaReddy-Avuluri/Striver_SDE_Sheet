import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class  MergeOverlappingIntervals{
    public static List< List< Integer > > mergeOverlappingIntervals(int [][]arr){
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int initial=arr[0][0],last=arr[0][1];
        List<List<Integer>> out=new ArrayList<>();
        List<Integer> temp;
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]>last){
                temp=new ArrayList<>();temp.add(initial);temp.add(last);
                out.add(temp);
                initial=arr[i][0];
                last=arr[i][1];
            }
            else{
                last=Math.max(last,arr[i][1]);
            }
        }
        temp=new ArrayList<>();temp.add(initial);temp.add(last);out.add(temp);
        return out;
    }
}