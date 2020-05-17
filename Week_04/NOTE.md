学习笔记
# 第四周

## 要点

这周主要学习了深度优先、广度优先搜索，贪心算法，二分查找。

### 深度优先和广度优先搜索

我都是把它放在树里面去理解，深度优先使用递归方法在树的深度的方向进行搜索，而广度优先则利用队列，在同层遍历完后在进行下一层的遍历。有时候遇到的题目比价隐晦，需要多做题才能找到规律，寻找转化的规律。记住几个经典的题目，然后碰到类似就看看能不能进行一个转换。经典的有单词接龙，扫雷游戏，岛屿数量等。

## 贪心算法

贪心算法的规则就是用最少的遍历去满足条件，为了达到这个目的，一般都是优先使用最大的数值或者其它能够尽快满足条件的值。贪心算法我做的少，后面再补充吧。

## 二分查找

二分查找是查找算法里面比较常用的一种了。但是它的使用场景是有条件的，总结就是 1.单调性 2.有界 3.能通过索引查找。

### 模版

```
left, right = 0, len(array) - 1 
while left <= right: 
	  mid = (left + right) / 2 
	  if array[mid] == target: 
		    # find the target!! 
		    break or return result 
	  elif array[mid] < target: 
		    left = mid + 1 
	  else: 
		    right = mid - 1
```

### 示例

在练习[69. x 的平方根](https://leetcode-cn.com/problems/sqrtx/)中，还介绍了牛顿迭代法，这个解法有点想机器学习里面，梯度下降的的求法，通过对函数求导，不断迭代修改x值，最终收敛在目标值附近。

在练习[33. 搜索旋转排序数组](https://leetcode-cn.com/problems/search-in-rotated-sorted-array/)中，会发现在使用二分查找的时候可以很灵活，对其要求的单调性有更多的解读，数组并不需要从0开始是单调的，而是可以从某个点开始单调。只是在划分段的时候，注意它的条件。

```
//二分的本质在于切分
//1.单调 2.有界 3.索引
class Solution {
    public int search(int[] nums, int target) {
        int left =0 ;
        int right=nums.length-1;
        while(left<=right){//不能等于，死循环
            int mid = left+(right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[left]<=nums[mid]){
                if(target<nums[mid]&&target>=nums[left]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else if(nums[left]>nums[mid]){
                if(nums[mid]<target&&nums[right]>=target){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
            
            
        }
        return -1;
    }
}

```