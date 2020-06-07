//并查集
//本质上就是找共同好友，数组的每个元素的值表示该元素对应的好友，通过遍历找到所有关系连


class FriendCircles {
    public int findCircleNum(int[][] M) {

        int length = M.length;
        int count = M.length;
        int[]parens = new int[length];
        for(int i=0;i<length;i++) parens[i]=i;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(M[i][j]==1){

                    int rootA = find(parens,i);
                    int rootB = find(parens,j);
                    if(rootA!=rootB){
                        parens[rootB]=rootA;
                        count--;
                    }
                }

            }
        }
        return count;
    }

    public int find(int[]parens,int i){
        while(parens[i]!=i){
            i=parens[parens[i]];
        }
        return i;
    }
}
