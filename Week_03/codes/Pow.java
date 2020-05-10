public class Pow {
    //分治，先分解，再合并
    public double myPow(double x, int n) {
        if(n<0){
            return generate(1/x,-n);
        }
        else{
            return generate(x,n);
        }
    }


    public double generate(double x ,int n){
        if(n==0){return 1.0;}
        double half = generate(x,n/2);
        if(n%2==0){
            return half * half;
        }
        else{
            return half * half *x;
        }
    }
}
