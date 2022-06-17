/*
linear data structure: mapper, stack, queue...

Search data structure: heap, BST...

String data structure: trie, suffix tree, suffix array... 

Statistics data structures with binary tree: binary indexed tree(fenwick tree树状数组), interval/segment tree(线段树)...

二分堆结构：支持找最小，最大，删除，插入； 不支持删除任意一个元素的操作。

递归方式做tree的问题，但是递归操作不容易调试，不容易编程。

很多静态树的结构可以用数组来实现。

Linear data structures:
Variable sized array: c++ Vector, Deque;
                      Java ArrayList, Deque;
                      
Queue and Stack 在内部实现，都是用的variable sized array( arraylist )

写程序时候用queue，stack。只是为了让程序看起来清楚。 

如果不想用queue和stack，也可以用deque和vector也可以实现同样的功能。

*****
需要把queue的bfs application弄会，
*****

stack就把2 stack algorithm for evaluating expressions
      Non-recursive depth first search
      
linkedlist: Insertion sort and disjoint sets
double linked list

Binary heap:  getMin()      O(1)
              deleteMin()   O(log n)
              insert()      O(log n)
Heap sort
priority_queue(c++), PriorityQueue(Java)

若加extension element mapping，则delete(element) O(log n) 


java: TreeSet, TreeMap 已经包含了二分搜索树

BST可以取代mapped heap，getMin就不是const time了，而是log(n)

Binary Search Tree: c++ set, map
                    
https://www.lintcode.com/problem/901/description                    















                      
