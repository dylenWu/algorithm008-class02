import java.util.ArrayList;
import java.util.List;

class GenerateParentheses {
    ArrayList<String> result = new ArrayList();


    public List<String> generateParenthesis(int n) {
        dfs(n,0,0,"",result);
        return result;
    }
    public void dfs(int n,int left,int right,String s,ArrayList<String> result){
        if(right==n){
            result.add(s);
        }
        if(left<n){
            dfs(n,left+1,right,s+"(",result);
        }
        if(left>right&&right<n){
            dfs(n,left,right+1,s+")",result);
        }
    }



}


