学习笔记
### 要点

这周主要是学习递归、分治、回溯这三种算法,其实都是递归，本质都是递归。只不过对于不同的应用场景，会做一些改变。

递归的要点：

1.不要人肉进行递归。

2.geek的题目找到最小重复性 forloop recurse。

3.数学归纳思维。

回溯的要点：

回溯法是一种探索所有潜在可能性找到解决方案的算法。如果当前方案不是正确的解决方案，或者不是最后一个正确的解决方案，则回溯法通过修改上一步的值继续寻找解决方案。递归过程中提前把不可能的选择去掉，减少 不必要的遍历

### 模版代码

```
public void recur(int level, int param) { 
  // terminator 
  if (level > MAX_LEVEL) { 
    // process result 
    return; 
  }
  // process current logic 
  process(level, param); 
  // drill down 
  recur( level: level + 1, newParam); 
  // restore current status 
 
}
```
```def divide_conquer(problem, param1, param2, ...): 
   # recursion terminator 
   if problem is None: 
   print_result 
   return 
   
   
   # prepare data 
   data = prepare_data(problem) 
   subproblems = split_problem(problem, data) 
   
   
   # conquer subproblems 
   subresult1 = self.divide_conquer(subproblems[0], p1, ...) 
   subresult2 = self.divide_conquer(subproblems[1], p1, ...) 
   subresult3 = self.divide_conquer(subproblems[2], p1, ...) 
   …
   
   
   # process and generate the final result 
   result = process_result(subresult1, subresult2, subresult3, …)
   # revert the current level states```