public class FindRepeatingMissing {
    public static int[] findMissingRepeatingNumbers(int []a) {
        for(int i=0;i<a.length;i++){
            if(a[i]-1==i) continue;
            if(a[i]==a[a[i]-1]) continue;
            int temp=a[i];a[i]=a[temp-1];a[temp-1]=temp;
            i--;
        }
        for(int i=0;i<a.length;i++){
            if(i!=a[i]-1) return new int[]{a[i],i+1};
        }
        return new int[2];
    }
}
// Time Complexity: O(n)
// Space Complexity: O(1)