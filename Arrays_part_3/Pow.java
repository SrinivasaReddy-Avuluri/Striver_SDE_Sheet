public class Pow {
    public double myPow(double x, int n) {
        long ln=n;
        double ans=1;
        if(n<0) ln*=-1;
        while(ln>0){
            if(ln%2==0){
                x=x*x;
                ln/=2;
            }
            else{
                ans=ans*x;
                ln--;
            }
        }
        if(n<0) return (double)1/ans;
        return ans;
    }
}