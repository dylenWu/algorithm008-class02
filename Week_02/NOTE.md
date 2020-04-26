#第二周学习总结

第二周学习的都是在数组或者链表之上进一步封装的数据结构，这是一个升维的过程，添加额外的信息和按照一定的规则去组织它们，这样方便了编程人员更方便的使用，合理使用它们能够降低时间复杂度，但是想用好依然不简单。
## Map Set 
HashMap底层是一个Entry<K,V>数组，通过key的hash找到对应的数组的index，时间复杂度一般为O（1），但是如果hash碰撞的话会使用链表将hash值相同的连接起来（新版本都适用了红黑树），频繁的话，链表会退化到O(n)，红黑树则可以维持在一个稳定的值。
需要注意的是它不是线程安全的，因为读取的是旧值导致数组的错乱。多个线程对某个key的值进行修改可能会被覆盖或者resize的时候出现死循环。

## 树、二叉树、二叉搜索树、堆、二叉堆
树的实现目的主要是通过一维的数据结构升级成二维把数据组织成更有序的结构，更重要的是，它是动态的，每个新进来的数据，只需要和每层的一个数据比较之后就能找到合适的位置。它的插入、删除 查询的复杂度能够在logN以内。
二叉堆的话其实就是一个完全二叉树，它既可以用链表存储也可以用数组。它的根节点可以是全局最小或者全局最大，它非常适合用来做topk计算或者磁盘排序，因为它的时间复杂度能够降到nlogk,相对于快排的nlogn要更快。

## 实战
本周的作业更多是树的遍历和求topk。
遍历的套路都类似，你可以用递归也可以用循环（循环其实就是利用两个栈来实现，其实本质上就是递归的实现）
还有就是topk，这个就要充分利用优先队列（二叉堆）来做。
还有一些比较geek的题目，这里就不总结了，多练就是了。

贴上一个经典代码
 ```
def preorder(self,root):
  if root:
     self.traverse_path.append(root.val)
     self.preorder(root,root.left)
     self.preorder(root,root.right)
     

def inorder(self,root):
  if root:
     self.inorder(root,root.left)
     self.traverse_path.append(root.val)
     self.inorder(root,root.right)
     
def postorder(self,root):
  if root:
     self.postorder(root,root.left)
     self.postorder(root,root.right)
     self.traverse_path.append(root.val)

```