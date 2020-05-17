public class Squrx {
    public  int mySqrt(int x) {
        return (int)binarySearch(1,x,x);
    }
    public  long binarySearch(int left,int right,int x){
        int mid=0;
        while(left<=right){
            mid = left+(right-left)/2;//left+right/2 超出范围
            if(mid*mid==x){
                return mid;
            }
            else if(mid*mid>x){
                right=mid-1;
            }
            else if(mid*mid<x){
                left=mid+1;
            }
        }
        return right;
    }

}
