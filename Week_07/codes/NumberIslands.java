
//并查集
//1.初始化有几个组
//2.find函数 找到parent
//2.union 相同的parent count--
class NumberIslands {
    public int numIslands(char[][] grid) {
        if(grid.length==0){return 0;}
        int rc = grid.length;
        int cc = grid[0].length;
        UnionFind uf = new UnionFind(grid,rc,cc);
        for(int i=0;i<rc;i++){
            for(int j=0;j<cc;j++){
                if(grid[i][j]=='1'){
                    if(j+1<cc&&grid[i][j+1]=='1'){
                        uf.union(i*cc+j,i*cc+j+1);
                    }
                    if(i+1<rc&&grid[i+1][j]=='1'){
                        uf.union(i*cc+j,(i+1)*cc+j);
                    }
                }
                // if(i-1>=0&&grid[i-1][j]=='1'){
                //     uf.union(i*cc+j,(i-1)*cc+j);
                // }
                //  if(j-1>=0&&grid[i][j-1]=='1'){
                //     uf.union(i*cc+j,i*cc+j-1);
                // }
            }
        }
        return uf.count;

    }
}
class UnionFind{
    int count = 0;
    int[] parent = null;
    public UnionFind(char[][] grid,int c,int r){
        parent = new int[c*r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                if(grid[i][j]=='1')
                {
                    count++;
                }
            }
        }
        for(int i=0;i<c*r;i++){
            parent[i]=i;
        }

    }


    public int find(int i){
        while(parent[i]!=i){
            parent[i]=parent[parent[i]];
            i=parent[i];

        }
        return i;
    }
    public void union(int p,int q){
        int rootp = find(p);
        int rootq = find(q);
        if(rootp!=rootq){
            parent[rootq]=rootp;
            count--;
        }
    }

}
