#学习笔记

##总结
这一周主要还是是两课，第一课主要学习来基本的数据结构，数组、链表、跳表。

第二课介绍了基于数组和链表实现的一些比较常用的数据结构 栈、队列、优先队列等。

这三个其实之前已经接触很多了，也没啥可说的。主要还是通过做题去了解了做题的一些套路和思想。
里面很多题目没有做过的话，思路很难想出来，如果纠结当中，就会浪费时间。
所以我现在方法就是先想暴力解法，然后优化，没有思路就看论坛题解，然后自己写一遍。
总结起来就是要多看多练，但是刚开始题目有点多，很多只做了一遍，后续要加强。

##解题套路
现在就节选一一些这周我做过的一些题目的总结，其它的我都写到leetcode的题解上了。
###盛最多水的容器解题思路
面积是由长宽决定，宽是由最短的垂直线决定，长是由两条垂直线的距离决定。我们可以通过移动左右两个坐标去找到最优解。原则就是
先计算当前的面积，然后比较两条垂直线，短的那条往长的那条的的方向移动。然后重复以上步骤，直到两条线相邻。
注：移动短的那条是因为宽是由短的决定的。
这种题目一般是先用暴力手段遍历所有的可能，比如这题就是$c{_n^2}$,但是这种时间复杂度较高，这个时候就可以考虑如何遍历可以消除掉一些不必要的遍历。
```
class Solution {
     public int maxArea(int[] height) {
             int l = 0;
             int r = height.length-1;
             int maxArea = 0;
             while(l<r){
                 maxArea = Math.max(maxArea,Math.min(height[l],height[r])*(r-l));
                 if(height[r]>height[l]){
                     l++;
                 }
                 else{
                     r--;
                 }
             }
             return maxArea;
     }
 }
 
```
### 爬楼梯解法
步骤
1.暴力解法，没有很直观的办法解决这种问题。
2.列举一些基本情况，找出重复子问题（if else for while recursion）。
3.优化。
```
class Solution {
    public int climbStairs(int n) {
            int memo[] = new int[n + 1];
            int times=0;
            if(n<=2)return n;
            memo[1]=1;
            memo[2]=2;
            return climbStairs(n,memo);

    }
    public int climbStairs(int n,int[]memo){
        if(memo[n]>0) return memo[n];
        else{memo[n]=climbStairs(n-1,memo)+climbStairs(n-2,memo);}
        return memo[n];
    }
}


```