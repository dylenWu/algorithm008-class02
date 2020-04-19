public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int p=0;
        // int q=0;
        // int[]temp=new int[m];
        //  System.arraycopy(nums1, 0, temp, 0, m);
        // int i=0;
        // while(p<m&&q<n){
        //     if(temp[p]<=nums2[q]){
        //         nums1[i]=temp[p];
        //         p++;
        //     }
        //     else{
        //         nums1[i]=nums2[q];
        //         q++;
        //     }
        //     i++;
        // }
        // if(p>=m){
        //      System.arraycopy(nums2,q,nums1,i,m+n-p-q);
        // }
        // if(q>=n){
        //      System.arraycopy(temp,p,nums1,i,m+n-p-q);
        // }
        int p1=m-1;
        int p2=n-1;
        int p=m+n-1;
        while(p1>=0&&p2>=0){
            nums1[p--]=nums1[p1]>nums2[p2]?nums1[p1--]:nums2[p2--];
        }
        System.arraycopy(nums2,0,nums1,0,p2+1);
    }

}
