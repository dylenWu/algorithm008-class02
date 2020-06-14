public class NQueensII {
    int count = 0;
    public int totalNQueens(int n) {
        boolean[] cols = new boolean[n];
        boolean[] dic1=new boolean[2*n];// dic \
        boolean[] dic2=new boolean[2*n];//  dic /
        backTrack(n,0,cols,dic1,dic2);
        return count;
    }
    public void backTrack(int c,int r,boolean[]cols,boolean[]dic1,boolean[]dic2){
        if(r==c){
            count++;
            return;
        }
        for(int i=0;i<c;i++){
            if(!cols[i]&&!dic1[c+i-r]&&!dic2[i+r]){
                cols[i]=true;
                dic1[c+i-r]=true;
                dic2[i+r]=true;
                backTrack(c,r+1,cols,dic1,dic2);
                cols[i]=false;
                dic1[c+i-r]=false;
                dic2[i+r]=false;
            }
        }
    }
}
