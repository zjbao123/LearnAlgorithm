## 构造数组的MaxTree

定义二叉树节点如下：

```java

public class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int data){
        this.value = data;
    }
}

```

一个数组的MaxTree定义如下：
* 数组必须没有重复元素；
* MaxTree是一棵二叉树，数组的每一个值对应一个二叉树节点；
* 包括MaxTree树在内且在其中的每一棵子树上，值最大的节点都是树的头
* 每个树的父节点是它左边第一个比它大的树和它右边第一个比他大的数中，较小的一个。
给定一个没有重复元素的数组arr，写出生产这个数组的MaxTree的函数，要求如果数组长度为N，则时间复杂度为O（N），额外的空间复杂度为O（N）。