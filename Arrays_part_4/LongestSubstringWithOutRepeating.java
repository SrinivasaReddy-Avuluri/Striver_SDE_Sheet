
import java.util.*;
public class LongestSubstringWithOutRepeating {
    public static int longestNonRepeatingSubstring(String s) {
        Set<Character> set=new HashSet<>();
        char[] arr=s.toCharArray();
        int max=Integer.MIN_VALUE;
        int start=0;
        for(int i=0;i<arr.length;i++){
          if(set.contains(arr[i])){
            set.clear();
            
            max=Math.max(max,i-start);
            start=i;
          }
          set.add(arr[i]);
        }
        max=Math.max(arr.length-start,max);
        return max;
    }
    public static void main(String[] args) {
        String s = "efghabcdi";
        int result = longestNonRepeatingSubstring(s);
        System.out.println("Length of Longest Substring Without Repeating Characters: " + result);
    }
}