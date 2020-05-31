public class PalindromicSubstrings {
    public int countSubstrings(String s) {
        if(s==null||s.length()==0) return 0;
        int n=s.length();
        int count=0;
        for(int i=0;i<2*n-1;i++){
            int left = i/2;
            int right=left+i%2;
            while (left>=0&&right<=n-1&&s.charAt(left)==s.charAt(right)){
                count++;
                left--;
                right++;
            }
        }
        return count;
    }
}
