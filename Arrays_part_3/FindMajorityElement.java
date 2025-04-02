public class FindMajorityElement {
    public static int majorityElement(int []v) {
        int val=v[0],count=1;
        for(int i=1;i<v.length;i++){
            if(count==0){
                val=v[i];count++;continue;
            }
            if(val!=v[i]) count--;
            else count++;
        }
        return val;
    }
}