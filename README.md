# algorithms
Princeton University Coursera Algorithms course


###Algorithms, Part I
####Princeton University

###About this Course
This course covers the essential information that every serious programmer needs to know about algorithms and data structures, with emphasis on applications and scientific performance analysis of Java implementations. Part I covers elementary data structures, sorting, and searching algorithms. Part II focuses on graph- and string-processing algorithms.

Taught by:    Kevin Wayne, Senior Lecturer
Computer Science

Taught by:    Robert Sedgewick, Professor
Computer Science


|||
--- | ---
**Level** |	Intermediate
**Commitment** | 6 weeks of study, 6–10 hours per week.
**Language** | English


###WEEK 1
####Course Introduction
Welcome to Algorithms, Part I. 
* 1 video, 2 readings

####Union−Find
We illustrate our basic approach to developing and analyzing algorithms by considering the dynamic connectivity problem. We introduce the union−find data type and consider several implementations (quick find, quick union, weighted quick union, and weighted quick union with path compression). Finally, we apply the union−find data type to the percolation problem from physical chemistry. 
* 5 videos, 2 readings, 1 reading

* **Graded:** Percolation

####Learning Objectives

**Apply** the union-find data type to solve problems in science, engineering, and industry.

**Define** the union-find (or disjoint sets) data type.

**Compare** the performance of different algorithms for the union-find data type.

**Design** different algorithms (quick find, quick union, weighted quick union, path compression) for the union-find data type.

**Develop** Java implementations of different algorithms for the union-find data type.

**Use** the parent-link representation to represent tree data structures.


####Analysis of Algorithms
The basis of our approach for analyzing the performance of algorithms is the scientific method. We begin by performing computational experiments to measure the running times of our programs. We use these measurements to develop hypotheses about performance. Next, we create mathematical models to explain their behavior. Finally, we consider analyzing the memory usage of our Java programs. 
* 6 videos, 1 reading, 1 reading

####Learning Objectives

**Define** tilde and order-of-growth notations.

**Determine** the order of growth of the running time of a program as a function of the input size.

**Formulate** a hypothesis for the running time of a program as a function of the input size by performing computational experiments.

**Calculate** the amount of memory that a Java program uses a function of the input size.

**Describe** the binary search algorithm.

**Analyze** the running time of binary search.

###Docs URLs

  1. [Percolation](http://murat-aka.github.io/algorithms/week1/doc/index.html)
  
###WEEK 2
####Stacks and Queues
We consider two fundamental data types for storing collections of objects: the stack and the queue. We implement each using either a singly-linked list or a resizing array. We introduce two advanced Java features—generics and iterators—that simplify client code. Finally, we consider various applications of stacks and queues ranging from parsing arithmetic expressions to simulating queueing systems.
* 6 videos, 2 readings, 1 reading

* **Graded:** Deques and Randomized Queues

####Elementary Sorts
We introduce the sorting problem and Java's Comparable interface. We study two elementary sorting methods (selection sort and insertion sort) and a variation of one of them (shellsort). We also consider two algorithms for uniformly shuffling an array. We conclude with an application of sorting to computing the convex hull via the Graham scan algorithm.
* 6 videos, 1 reading, 1 reading

###WEEK 3
####Mergesort
We study the mergesort algorithm and show that it guarantees to sort any array of n items with at most n lg n compares. We also consider a nonrecursive, bottom-up version. We prove that any compare-based sorting algorithm must make at least n lg n compares in the worst case. We discuss using different orderings for the objects that we are sorting and the related concept of stability.
* 5 videos, 2 readings, 1 reading

* **Graded:** Collinear Points
####Quicksort
We introduce and implement the randomized quicksort algorithm and analyze its performance. We also consider randomized quickselect, a quicksort variant which finds the kth smallest item in linear time. Finally, we consider 3-way quicksort, a variant of quicksort that works especially well in the presence of duplicate keys.
* 4 videos, 1 reading, 1 reading

###WEEK 4
####Priority Queues
We introduce the priority queue data type and an efficient implementation using the binary heap data structure. This implementation also leads to an efficient sorting algorithm known as heapsort. We conclude with an applications of priority queues where we simulate the motion of n particles subject to the laws of elastic collision.
* 4 videos, 2 readings, 1 reading
* **Graded:** 8 Puzzle

####Elementary Symbol Tables
We define an API for symbol tables (also known as associative arrays) and describe two elementary implementations using a sorted array (binary search) and an unordered list (sequential search). When the keys are Comparable, we define an extended API that includes the additional methods min, max floor, ceiling, rank, and select. To develop an efficient implementation of this API, we study the binary search tree data structure and analyze its performance.
* 6 videos, 1 reading, 1 reading

###WEEK 5
####Balanced Search Trees
In this lecture, our goal is to develop a symbol table with guaranteed logarithmic performance for search and insert (and many other operations). We begin with 2−3 trees, which are easy to analyze but hard to implement. Next, we consider red−black binary search trees, which we view as a novel way to implement 2−3 trees as binary search trees. Finally, we introduce B-trees, a generalization of 2−3 trees that are widely used to implement file systems.
* 3 videos, 2 readings, 1 reading

####Geometric Applications of BSTs
We start with 1d and 2d range searching, where the goal is to find all points in a given 1d or 2d interval. To accomplish this, we consider kd-trees, a natural generalization of BSTs when the keys are points in the plane (or higher dimensions). We also consider intersection problems, where the goal is to find all intersections among a set of line segments or rectangles.
* 5 videos, 1 reading
* **Graded:** Kd-Trees

###WEEK 6
####Hash Tables
We begin by describing the desirable properties of hash function and how to implement them in Java, including a fundamental tenet known as the uniform hashing assumption that underlies the potential success of a hashing application. Then, we consider two strategies for implementing hash tables—separate chaining and linear probing. Both strategies yield constant-time performance for search and insert under the uniform hashing assumption.
* 4 videos, 2 readings, 1 reading


####Symbol Table Applications
We consider various applications of symbol tables including sets, dictionary clients, indexing clients, and sparse vectors. 
* 4 videos, 1 reading



