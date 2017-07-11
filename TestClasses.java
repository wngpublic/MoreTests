import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamConstants;
import java.io.OptionalDataException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.net.StandardSocketOptions;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.ByteChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileChannel;
import java.nio.channels.NetworkChannel;
import java.nio.channels.Pipe;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.nio.charset.Charset;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import java.util.zip.CRC32;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jvnet.mimepull.MIMEMessage;
import org.jvnet.mimepull.MIMEMessageSubClass1;
import org.jvnet.mimepull.MIMEPart;



class TestClasses {
    public static Utils utils_ = new Utils();
    public static int graphID_ = 0;
    public static int staticObvID_ = 0;
    public static AtomicInteger GID_ = new AtomicInteger(0);
    public int var_abc_ = 0;
    public final int var_abd_ = 0;
    private static int var_abcd_ = 3;

    public int getGID() {
        return GID_.get();
    }
    public int getGID(boolean inc) {
        if (inc) {
            return GID_.getAndAdd(1);
        }
        return getGID();
    }
    public void setGID(int v) {
        GID_.set(v);
    }
    public TestClasses() {
    }
    enum EDGE_DIR {
        IBOUND, OBOUND, BIDIR
    }
    enum SET_FLAGS {
        IS_DAG_SET(1), IS_USED_MARK(2), IS_SET_NODE_ORIGINS(3);
        private final int val;

        SET_FLAGS(final int v) {
            val = v;
        }

        public int intVal() {
            return val;
        }
    }
    interface SyntaxExampleInterface1 {
        public void execute(Object d);
    }
    public enum DayNum {
        SUN(2), MON(3), TUE(4), WED(5), THU(6);
        private final int val;

        DayNum(final int v) {
            val = v;
        }

        public int intVal() {
            return val;
        }
    }
    class DayType2 {
        public static final int SUN = 0;
        public static final int MON = 1;
        public static final int TUE = 2;
        public static final int WED = 3;
        public static final int THU = 4;
        public static final int FRI = 5;
        public static final int SAT = 6;
    }
    public enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT
    }
    public enum Coin { // can be extended or implement
        // implicitly impliments Serializable and Comparable
        PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
        private int v_;

        private Coin(int v) {
            v_ = v;
        } // must be private, else compile error

        public Coin val() {
            switch (v_) {
            case 1:
                return PENNY;
            case 5:
                return NICKEL;
            case 10:
                return DIME;
            case 25:
                return QUARTER;
            }
            return PENNY;
        }

        public int intVal() {
            return v_;
        }
    }
    class TestCongestedCtr {
        int maxCnt_;
        int maxMS_;
        int id_;
        Utils utils_;
        public void setVals(int id, int maxCnt, int maxDelayMS) {
            id_ = id;
            maxCnt_ = maxCnt;
            maxMS_ = maxDelayMS;
            utils_ = new Utils();            
        }
        public void runTest() throws Exception {
            for(int i = 0; i < maxCnt_; i++) {
                int sleepTime = utils_.randInt(0, maxMS_);
                Thread.sleep(sleepTime);
                System.out.printf("ID:%d cnt:%d sleep %d\n", 
                    id_, i, sleepTime);
            }
            System.out.printf("ID:%d DONE\n", id_);
        }
        class Test {
            public void t01() throws Exception {
                TestCongestedCtr t = new TestCongestedCtr();
                t.setVals(1, 10, 2000);
                t.runTest();
            }
            public void test() {
                try {
                    t01();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        public void test() {
            Test t = new Test();
            t.test();
        }
    }
    class Comments {
        public Comments() {
        }

        public void comments() {
            // ---------------------------------------------------------------------
            // jdb commands
            // > jdb -sourcepath . Test
            // > java address=test Test
            // jdb -attach test
            // run
            // cont
            // print
            // dump
            // threads // lists threads currently running
            // thread // select a thread to be current thread
            // where // dumps stack
            // stop at classid:22
            // stop in MyClass.method()
            // clear MyClass:22
            // clear
            // step
            // next
            // quit
            // list line_number|method
            // watch classid.fieldname
            // unwatch classid.fieldname
            // stop in Tests$BTreeTest$BTree.splitNodes
            // ---------------------------------------------------------------------
            // search for amzn, cloud, visual, ad tech
            // product search group, search infrastructure
            // relevance team is separate
            // query understanding
            // board indexing and query team, soft boundaries
            //
            //
            //
            //
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // heap insert
            // pop
            // sink
            // swim
            // random shuffle
            // sort quicksort
            // mergesort
            // partition
            // bst insert
            // find
            // find largest node
            // delete
            // pre order
            // in order
            // post order
            // level order
            // build tree pre/in
            // max height
            // diameter
            // second largest
            // second smallest
            // get range x, y
            // get < x
            // get > x
            // get sum of range x, y
            // compare trees with root
            // compare trees with in order
            // is binary tree?
            // traverse for size
            // number of full nodes
            // number of half nodes
            // largest 2 nodes
            // sum of all nodes
            // is tree A subset of tree B?
            // least common ancestor
            // avl rotate LR/RL
            // rotate LL/RR
            // rotate
            // delete
            // insert
            // list single linked list insert front
            // single linked list insert back
            // single linked list insert mid
            // single linked list delete head
            // single linked list delete tail
            // single linked list delete mid
            // reverse list
            // single linked list find
            // single linked list is circular test
            // double linked list is converge
            // patterns builder pattern
            // factory
            // singleton
            // proxy
            // edge src, dst, weight, isDirected, implement comparable
            // vertex add edge
            // graph unweighted
            // directed acyclic
            // find cycle
            // hashmap<string, vertex>
            // add edge
            // get vertex
            // dfs
            // bfs
            // findNoIncomingVertices
            // topo sort
            // print reverse path
            // pre order
            // post order
            // reverse post order
            // has cycle
            // dijkstra
            // relax distance
            // mst
            // prim
            // shortest path
            // longest path
            // multi src shortest path
            // multi src longest path
            // bellman ford / negative weights
            // tries trienode
            // tstnode
            // print all words
            // print all words with prefix
            // suffix tree build
            // palindrome
            // longest common sequence
            // print tree
            // contains pattern
            // longest repeated substring
            // longest palindrome recursive
            // longest palindrome iterative
            // longest palindromic substring
            // prefix build prefix table
            // find prefix pattern
            // misc tower of hanoi
            // greatest common divisor
            // is number prime
            // all primes up to n
            // factorial
            // huffman encode
            // huffman decode
            // lzw encode
            // lzw decode
            // greatest prime factor
            // find greatest valley
            // find 2d peak
            // find all factors of number
            // longest common subsequence
            // longest increasing subsequence
            // knapsack
            // find 2 numbers equaling third
            // queen's problem
            // combination
            // permutation
            // log
            // wildcard permutation
            // get rand int
            // median of medians
            // quick select get kth element
            // quick select get all numbers up to k inclusive
            // quick select partition
            // lowest cost distance from x,y with matrix
            // deadlock
            // thread
            // mutex
            // atomic non blocking example
            // producer/consumer
            // smart pointers
            // moving average
            // callback
            // hashmap
            // b tree
            // c++ vector
            // c++ stack
            // c++ queue
            // c++ priority queue
            // c++ map
            // java vector
            // java stack
            // java queue
            // java priority queue
            // java map
            // find coin combo equaling value
            // polymorphism in java
            // polymorphism in c++
            //
            //
            // ---------------------------------------------------------------------
            // * to do http://www3.cs.stonybrook.edu/~algorith/major_section/
            // 1.1.shtml
            // greatest common divisor
            // factorial
            // knapsack
            // queens
            // matrix coloring with 4 and no overlap
            // check whether linked list is palindrome
            // how to traverse BST in O(1) space, tree can be modified
            // - data structures
            // dictionaries
            // priority queues
            // suffix trees
            // graph data structures
            // set data structures
            // kd trees
            // - numerical problems
            // solving linear equations
            // bandwidth reduction
            // matrix multiplication
            // determinants and permanents
            // random number generation
            // factoring
            // primality test
            // discrete fourier transform
            // - combinatorial problems
            // sorting
            // searching
            // median and selection
            // generating permutations
            // generating subsets
            // generating partitions
            // generating graphs
            // calendrical calculations
            // job scheduling
            // satisfiability
            // - graphs polynomial time
            // connected components
            // topological sorting
            // minimum spanning tree
            // shortest path
            // transitive closure and reduction
            // matching
            // eulerian cycle
            // chinese postman
            // edge and vertex connectivity
            // network flow
            // drawing graphs nicely
            // drawing trees
            // planarity detection and embedding
            // - graphs hard problems
            // clique
            // independent set
            // vertex cover
            // traveling salesman problem
            // hamiltonian cycle
            // graph partition
            // vertex coloring
            // edge coloring
            // graph isomorphism
            // steiner tree
            // feedback edge/vertex set
            // - computational geometry
            // robust geometric primitives
            // convex hull
            // triangulation
            // voroni diagrams
            // nearest neighbor search
            // range search
            // point location
            // intersection detection
            // bin packing
            // polygon partitioning
            // simplifying polygons
            // shape similarity
            // motion planning
            // maintaining line arrangements
            // minkowski sum
            // - set and string problems
            // set cover
            // set packing
            // string matching
            // approximate string matching
            // text compression
            // cryptography
            // finite state machine minimization
            // longest common substring
            // shortest common superstring
            //
            // ---------------------------------------------------------------------
            // - kd trees are a special case of binary space partitioning trees.
            // ---------------------------------------------------------------------
            // * useful java classes and methods
            // - String
            // char charAt(int)
            // String concat(String)
            // boolean equals(String)
            // int length()
            // String [] split(String regex)
            // String substring(int begin, int end)
            // String valueOf(char,char[],int,double)
            // - Integer
            // boolean equals(Integer)
            // int intValue()
            // int parseInt(String)
            // String toString()
            // Integer valueOf(int,String)
            // - Stack
            // E push(E)
            // E peek()
            // E pop()
            // boolean empty()
            // - PriorityQueue
            // void add(E)
            // E peek()
            // E poll()
            // - LinkedList
            // - Queue
            // - ArrayList
            // boolean add(E) // to end of list
            // void add(int, E)
            // void clear()
            // boolean contains(E)
            // int indexOf(E)
            // E get(int)
            // E remove(int/E)
            // int size()
            // E[] toArray()
            // - HashMap
            // void clear()
            // V get(K)
            // V put(K, V)
            // V remove(K)
            // int size()
            // Set<Map.Entry<K,V>> entrySet()
            // for(Map.Entry<K,V> e : HashMap.entrySet())
            // e.getKey(), e.getValue()
            //
            //
            // ---------------------------------------------------------------------
        }

        public void nothing() {
        }
    }

    class CLLNode<T> {
        T v_;
        CLLNode<T> n_;

        public CLLNode(T v) {
            v_ = v;
            n_ = null;
        }

        public T get() {
            return v_;
        }

        public CLLNode<T> next() {
            return n_;
        }

        public void next(CLLNode<T> n) {
            n_ = n;
        }

        public void set(T v) {
            v_ = v;
        }
    }
    class CLinkedList<T> implements Iterable<T> {
        private CLLNode<T> h_;
        private CLLNode<T> t_;
        int cnt_;

        public CLinkedList() {
            h_ = null;
            t_ = null;
            cnt_ = 0;
        }

        public int cnt(boolean refresh) {
            int cnt = 0;
            CLLNode<T> t = h_;
            while (t != null) {
                t = t.next();
                cnt++;
            }
            if (refresh == true) {
                cnt_ = cnt;
            }
            return cnt;
        }

        public void append(T v) {
            CLLNode<T> n = new CLLNode<T>(v);
            if (h_ == null) {
                h_ = n;
                t_ = n;
            } else {
                t_.next(n);
                t_ = n;
            }
            cnt_++;
        }

        public void prepend(T v) {
            CLLNode<T> n = new CLLNode<T>(v);
            if (h_ == null) {
                h_ = n;
                t_ = n;
            } else {
                n.next(h_);
                h_ = n;
            }
            cnt_++;
        }

        public CLLNode<T> find(T v) {
            CLLNode<T> c = h_;
            while (c != null) {
                if (c.get().equals(v)) {
                    return c;
                }
                c = c.next();
            }
            return null;
        }

        public HashSet<CLLNode<T>> findSet(T v) {
            HashSet<CLLNode<T>> set = new HashSet<CLLNode<T>>();
            CLLNode<T> c = h_;
            while (c != null) {
                if (c.get().equals(v)) {
                    set.add(c);
                }
                c = c.next();
            }
            if (set.size() == 0) {
                return null;
            }
            return set;
        }

        public CLLNode<T> append(T v, CLLNode<T> n) {
            CLLNode<T> c = new CLLNode<T>(v);
            if (n == null) {
                c.next(h_);
                h_ = c;
            } else {
                c.next(n.next());
                n.next(c);
            }
            if (n == t_) {
                t_ = c;
            }
            cnt_++;
            return c;
        }

        public void reverse() {
            if (h_ == null) {
                System.out.printf("reverse: h is null\n");
                return;
            }
            CLLNode<T> p = null;
            CLLNode<T> n = null;
            CLLNode<T> c = h_;
            h_ = t_;
            t_ = c;
            if (h_ == t_) {
                return;
            }
            while (c != null) {
                n = c.next();
                c.next(p);
                p = c;
                c = n;
            }
        }

        public void swap(CLLNode<T> a, CLLNode<T> b) {
            CLLNode<T> t = h_;
            CLLNode<T> p = null;
            CLLNode<T> p0 = null;
            CLLNode<T> p1 = null;
            int numFound = 0;
            if (a == b) {
                return;
            }
            while (numFound != 2 && t != null) {
                if (t == a) {
                    p0 = p;
                    numFound++;
                }
                if (t == b) {
                    p1 = p;
                    numFound++;
                }
                p = t;
                t = t.next();
            }
            if (numFound != 2) {
                return;
            }
            CLLNode<T> t0;
            CLLNode<T> t1;
            CLLNode<T> t2;
            if (p0 == null) {
                t0 = h_;
                t2 = h_.next();
                t1 = p1.next().next();

                h_ = p1.next();
                h_.next(t2);
                p1.next(t0);
                p1.next().next(t1);
            } else if (p1 == null) {
                t0 = h_;
                t1 = p0.next().next();
                t2 = h_.next();

                h_ = p0.next();
                h_.next(t2);
                p0.next(t0);
                p0.next().next(t1);
            } else {
                t0 = p0.next();
                t1 = p1.next();
                p0.next(t1);
                t2 = t1.next();
                t1.next(t0.next());
                p1.next(t0);
                t0.next(t2);
            }
        }

        public void reverse(int start, int end) {
            // reverse from start to end
            // a b c d e f g: reverse 2:5 -> a b f e d c g
            if (start >= end || start < 0 || end >= cnt_) {
                return;
            }
            CLLNode<T> a = null;
            CLLNode<T> b = null;
            CLLNode<T> p = null;
            CLLNode<T> t = h_;
            for (int i = 0; i < start; i++) {
                p = t;
                t = t.next();
            }
            a = t;
            for (int i = start; i <= end; i++) {
                t = t.next();
            }
            b = t;
            CLLNode<T> n = b.next();

            if (n != null) {

            }
            // a->b->c->d->e->f->g
            // a->b->d
            // c->d->e->f->g
            // a->b->d->c
            // a->b->d->c->e->f->g
            // a->b->e->d->c->f->g
            // a->b->f->e->d->c->g

            t = a;
            CLLNode<T> c = a;
            CLLNode<T> cnext = null;
            CLLNode<T> cprev = c;
            CLLNode<T> cnextnext = null;
            // p->a->....->b->n
            for (int i = start; i <= end; i++) {
                cnext = c.next();
                p.next(cnext);
                if (cnext == null) {
                    cnextnext = null;
                } else {
                    cnextnext = cnext.next();
                }
                p.next().next(cprev);
                cprev = p.next();
                c.next(cnextnext);
            }
        }

        public void printChain() {
            CLLNode<T> c = h_;
            boolean hasPrintMethod = false;
            boolean isString = false;
            boolean isNumber = false;
            int cnt = 0;
            if (c == null) {
                return;
            } else if (c.get() instanceof String) {
                isString = true;
            } else if ((c.get() instanceof Integer)
                || (c.get() instanceof Double)) {
                isNumber = true;
            } else {
                try {
                    // reflection
                    //
                    // c.get().hasPrintInfo();
                    // hasPrintMethod = true;
                } catch (Exception e) {
                }
            }
            if (!hasPrintMethod && !isString && !isNumber) {
                System.out.printf("printChain general print unavailable\n");
                return;
            }
            while (c != null) {
                if (isString) {
                    System.out.printf("%3d: %s\n", cnt, c.get());
                } else if (isNumber) {
                    System.out.printf("%3d: %d\n", cnt, c.get());
                } else if (hasPrintMethod) {
                    // System.out.printf("%3d: ", cnt);
                    // c.get().printInfo();
                }
                c = c.next();
                cnt++;
            }
        }

        public boolean delete(CLLNode<T> n) {
            if (n == null || h_ == null) {
                return false;
            }
            CLLNode<T> c = h_;
            CLLNode<T> p = null;
            while (c != null) {
                if (c == n) {
                    if (c == h_ && c == t_) {
                        h_ = null;
                        t_ = null;
                    } else if (c == h_) {
                        h_ = c.next();
                    } else if (c == t_) {
                        t_ = p;
                        if (t_ != null) {
                            t_.next(null);
                        }
                    } else {
                        p.next(c.next());
                    }
                    cnt_--;
                    return true;
                }
                p = c;
                c = c.next();
            }
            return false;
        }

        public boolean delete(T v, int maxToDelete) {
            // if maxToDelete -1, then delete all matching
            int cnt = 0;
            if (maxToDelete == 0 || maxToDelete < -1) {
                return false;
            }
            if (h_ == null) {
                return false;
            }
            CLLNode<T> c = h_;
            CLLNode<T> p = null;
            while (c != null) {
                if (c.get().equals(v)) {
                    if (c == h_ && c == t_) {
                        h_ = null;
                        t_ = null;
                    } else if (c == h_) {
                        h_ = c.next();
                    } else if (c == t_) {
                        t_ = p;
                        if (t_ != null) {
                            t_.next(null);
                        }
                    } else {
                        p.next(c.next());
                    }
                    cnt_--;
                    cnt++;
                } else {
                    p = c;
                }
                c = c.next();
                if (maxToDelete > 0 && cnt >= maxToDelete) {
                    break;
                }
            }
            if (cnt > 0) {
                return true;
            }
            return false;
        }

        public CLLNode<T> getHead() {
            return h_;
        }

        public CLLNode<T> getTail() {
            return t_;
        }

        public int sizeList() {
            return cnt_;
        }

        public Iterator<T> iterator() {
            return new CLinkedListIter<T>(h_, t_);
        }

        // private static final class CLinkedListIter<T> implements Iterator<T>
        // {
        class CLinkedListIter<A> implements Iterator<T> {
            CLLNode<T> cur_;
            CLLNode<T> head_;
            CLLNode<T> tail_;

            public CLinkedListIter(CLLNode<T> head, CLLNode<T> tail) {
                head_ = head;
                tail_ = tail;
                cur_ = head;
            }

            public boolean hasNext() {
                if (cur_ == null) {
                    return false;
                }
                return true;
            }

            public T next() {
                if (cur_ == null) {
                    return null;
                }
                T ret = cur_.get();
                cur_ = cur_.next();
                return ret;
            }

            public void remove() {
            }
        }

        class TestCLinkedList {
            public TestCLinkedList() {
            }

            public void t01() {
                // test CLinkedList append, reverse, delete, find, insert,
                // iterator
                CLinkedList<Integer> ll = new CLinkedList<Integer>();

                // create a list of numbers
                int sz = 10;
                int a[] = new int[sz];
                for (int i = 0, j = 1; i < sz; i++) {
                    a[i] = j;
                    if (i % 2 == 0) {
                        j++;
                    }
                }

                for (int i = 0; i < a.length; i++) {
                    ll.append(new Integer(a[i]));
                }
                System.out.printf("call printChain\n");
                ll.printChain();
                System.out.printf("call reverse\n");
                ll.reverse();
                System.out.printf("call printChain\n");
                ll.printChain();
                System.out.printf("call findSet 2 and print\n");
                Set<CLLNode<Integer>> set = ll.findSet(new Integer(2));
                if (set != null) {
                    Iterator<CLLNode<Integer>> it = set.iterator();
                    while (it.hasNext()) {
                        System.out.printf("it val:%d\n", it.next().get());
                    }
                }
                System.out.printf("call iterator\n");
                Iterator<Integer> it = ll.iterator();
                while (it.hasNext()) {
                    System.out.printf("it val:%d\n", it.next());
                }
                System.out.printf("------- call delete 2\n");
                ll.delete(new Integer(2), -1);
                ll.printChain();
                System.out.printf("------- call delete 1\n");
                ll.delete(new Integer(1), -1);
                ll.printChain();
                System.out.printf("------- call delete 6\n");
                ll.delete(new Integer(6), -1);
                ll.printChain();
                System.out.printf("------- call reverse\n");
                ll.reverse();
                ll.printChain();
            }

            public void t02() {
                Queue<Integer> q = new LinkedList<Integer>();
                int ary[] = { 10, 19, 11, 18, 12, 17, 13, 16, 14, 15 };
                for (int i = 0; i < ary.length; i++) {
                    q.add(new Integer(ary[i]));
                }
                Iterator<Integer> it = q.iterator();
                System.out.printf("t13 iterate: ");
                while (it.hasNext()) {
                    Integer iVal = it.next();
                    System.out.printf("%d ", iVal.intValue());
                }
                System.out.printf("\n");
                System.out.printf("t13 remove: ");
                while (q.size() != 0) {
                    Integer iVal = q.remove();
                    System.out.printf("%d ", iVal.intValue());
                }
                System.out.printf("\n");
            }

            public void test() {
            }
        }

        public void test() {
        }
    }
    class AlgorithmChallenges {
        final Utils utils = new Utils();
        public void print(String format, Object... args) {
            System.out.printf(format, args);
        }
        public int solveMeFirst(int a, int b) {
            return a+b;
        }
        class ObjChaos {
            public int numMoves = 0;
            public int id = 0;
            public ObjChaos() {
                
            }
            public ObjChaos(final int id) {
                this.id = id;
            }
        }
        public int generateChaos(
                final int numMoves, 
                final LinkedHashMap<Integer, ObjChaos> lhmap, 
                final int maxMovesPerElement) throws Exception {
            /*
             * generate numMoves. Choose backwards src goes forward up to 2 times. 
             */
            final int szMin = 1;
            final int szMax = lhmap.size();
            int numMovesCur = 0;
            boolean stop = false;
            for(int i = szMax; i > 0 && !stop; i--) {
                final boolean isSelected = utils.randBool();
                if(!isSelected) {
                    continue;
                }
                final int maxMovesCur = utils.randInt(0, maxMovesPerElement, true);         
                int positionSrc = i;
                for(int j = 0; j < maxMovesCur && !stop; j++) {
                    if(positionSrc <= 1) {
                        continue;
                    }
                    final int positionDst = utils.randInt(szMin, positionSrc);
                    if(positionDst != positionSrc) {
                        ObjChaos oSrc = lhmap.get(positionSrc);
                        ObjChaos oDst = lhmap.get(positionDst);
                        oSrc.numMoves++;
                        lhmap.put(positionSrc, oDst);
                        lhmap.put(positionDst, oSrc);
                        positionSrc = positionDst;
                        numMovesCur++;
                        printLHMap(lhmap);
                        if(numMovesCur >= numMoves) {
                            stop = true;
                        }
                    }
                }
            }
            return numMovesCur;
        }
        public int reverseChaos(
                final LinkedHashMap<Integer, ObjChaos> lhmap,
                final int maxMovesPerElement) {
            /* 
             * count number of moves to change lhmap into order.
             */
            LinkedHashMap<Integer, ObjChaos> lhmapSmall = new LinkedHashMap<>();
            int numMoves = 0;
            for(Map.Entry<Integer, ObjChaos> kv: lhmap.entrySet()) {
                int iSrc = kv.getKey();
                ObjChaos oSrc = kv.getValue();
                oSrc.numMoves = 0;
                if(iSrc == oSrc.id) {
                    continue;
                }
                lhmapSmall.put(iSrc, oSrc);
            }
            for(int i = 0; i < maxMovesPerElement; i++) {
                for(Map.Entry<Integer, ObjChaos> kv: lhmapSmall.entrySet()) {
                    int iSrc = kv.getKey();
                    ObjChaos oSrc = kv.getValue();
                    if(iSrc == oSrc.id) {
                        continue;
                    }
                    int iDst = oSrc.id;
                    ObjChaos oDst = lhmapSmall.get(iDst);
                    if(oSrc.numMoves >= 2) {
                        return -1;
                    }
                    lhmap.put(iSrc, oDst);
                    lhmap.put(iDst, oSrc);
                    lhmapSmall.put(iSrc, oDst);
                    lhmapSmall.put(iDst, oSrc);
                    oSrc.numMoves++;
                    numMoves++;
                    printLHMap(lhmapSmall);
                }                
            }
            // do final check
            for(Map.Entry<Integer, ObjChaos> kv: lhmapSmall.entrySet()) {
                int iSrc = kv.getKey();
                ObjChaos oSrc = kv.getValue();
                if(iSrc != oSrc.id) {
                    return -1;
                }
            }
            return numMoves;
        }
        public void printLHMap(final LinkedHashMap<Integer, ObjChaos> lhmap) {
            printLHMap(lhmap, -1);
        }
        public void printLHMap(final LinkedHashMap<Integer, ObjChaos> lhmap, final int limit) {
            int ctr = 0;
            for(Map.Entry<Integer, ObjChaos> kv: lhmap.entrySet()) {
                final int id = kv.getKey();
                final ObjChaos obj = kv.getValue();
                print("printLHMap: id=%5d obj.id=%5d numMoves:%3d\n", id, obj.id, obj.numMoves);
                ctr++;
                if(limit != -1 && ctr >= limit) {
                    break;
                }
            }
            print("-----------------------\n");            
        }
        public void generateAndReverseChaos(final int numMoves, final int numElements) throws Exception {
            LinkedHashMap<Integer, ObjChaos> lhmap = new LinkedHashMap<>();        
            for(int i = 1; i <= numElements; i++) {
                ObjChaos o = new ObjChaos(i);
                lhmap.put(i, o);
            }
            final int maxMovesPerElement = 2;
            print("now generate\n\n");
            int numMovesGenerated = generateChaos(numMoves, lhmap, maxMovesPerElement);
            print("now reverse\n\n");
            int numMovesReverse = reverseChaos(lhmap, maxMovesPerElement);
            print("numMovesGenerated:%d\n", numMovesGenerated);
            if(numMovesReverse == -1) {
                print("cannot reverse with %d maxMovesPerElement\n", maxMovesPerElement);
            } else {
                print("ok num moves is:%d\n", numMovesReverse);
            }
        }
        
        class Tests {

            public void comments() {
                /*
                 * https://www.hackerrank.com/challenges/new-year-chaos
                 * https://www.hackerrank.com/challenges/two-pluses
                 * https://www.hackerrank.com/challenges/almost-sorted
                 * https://www.hackerrank.com/challenges/larrys-array
                 * https://www.hackerrank.com/challenges/board-cutting
                 * https://www.hackerrank.com/challenges/sherlock-and-minimax
                 * https://www.hackerrank.com/challenges/crush
                 * https://www.hackerrank.com/challenges/team-formation
                 * https://www.hackerrank.com/challenges/chief-hopper
                 * https://www.hackerrank.com/challenges/reverse-shuffle-merge
                 * https://www.hackerrank.com/challenges/array-splitting
                 * https://www.hackerrank.com/challenges/mandragora
                 * https://www.hackerrank.com/challenges/candies
                 * https://www.hackerrank.com/challenges/coin-change
                 * https://www.hackerrank.com/challenges/stockmax
                 * https://www.hackerrank.com/challenges/grid-walking
                 * https://www.hackerrank.com/challenges/hr-city
                 * https://www.hackerrank.com/challenges/mr-k-marsh
                 */
            }
            public void t00() {
                Scanner in = new Scanner(System.in);
                int a;
                a = in.nextInt();
                int b;
                b = in.nextInt();
                int sum;
                sum = solveMeFirst(a,b);
                print("sum:%d\n", sum);
                in.close();
            }
            public void t01() {
                /*
                 * first line is integer. next N lines denote matrix rows, 
                 * with each line containing N space separated integers 
                 * describing columns. 
                 * 
                 * output is absolute difference between the two sums of
                 * matrix diagonals as single integer. 
                 * 
                 * ie 
                 * 3
                 * 11   2   4
                 *  4   5   6
                 * 10   8 -12
                 * 
                 * sample output: 15
                 */
                Scanner in = new Scanner(System.in);
                final int n = in.nextInt();
                int [][]a = new int[n][n];
                for(int i = 0; i < n; i++) {
                    for(int j = 0; j < n; j++) {
                        a[i][j] = in.nextInt();
                    }
                }
                in.close();
                
                int d0 = 0;
                int d1 = 0;
                for(int i = 0; i < n; i++) {
                    d0 += a[i][i];
                    d1 += a[i][n-i-1];
                }
                int diff = d0 - d1;
                if(diff < 0) {
                    diff *= -1;
                }
                print("absolute diff:%d\n", diff);
            }
            public void t02() {
                /*
                 * given AM/PM format, convert to military time.
                 * 
                 * input: hh:mm:ssAM|PM
                 * 07:05:45PM
                 * 
                 * out: hh:mm:ss
                 * 07:05:45
                 */
                Scanner in = new Scanner(System.in);
                String s = in.nextLine();
                int hh = Integer.parseInt(s.substring(0,2));
                int mm = Integer.parseInt(s.substring(3,5));
                int ss = Integer.parseInt(s.substring(6,8));
                String ampm = s.substring(8,10);
                if(ampm.equals("PM")) {
                    if(hh != 12) {
                        hh += 12;
                    }
                } else {
                    if(hh == 12) {
                        hh = 0;
                    }
                }
                System.out.printf("%02d:%02d:%02d\n", hh, mm, ss);                    
                in.close();
            }
            public void t03() {
                /*
                 * There are n people queued: 1,2,...,n-1,n.
                 * 
                 * Any person in the queue can bribe the person 
                 * directly in front of them to swap positions. 
                 * If two people swap positions, they still wear 
                 * the same sticker denoting their original place 
                 * in line. One person can bribe at most two other 
                 * persons.
                 * That is to say, if n=8 and bribes person 5, 
                 * the queue will look like this: 1,2,3,5,4,6,7,8.
                 * Fascinated by this chaotic queue, you decide 
                 * you must know the minimum number of bribes that 
                 * took place to get the queue into its current state!
                 * 
                 * 
                 * The first line is int T, denoting number of test cases.
                 * each test case has 2 lines. The first is n, number of
                 * ppl in queue. Second line is n space separated ints
                 * describing final state of queue. 
                 */
                boolean isCmdLine = true;
                if(isCmdLine) {
                    t03_cmdline();
                } else {
                    int numCases = 3;
                    int [] aryNumPpl = {5,5,5};
                    int [][] aryVals = {{2,1,5,3,4},{3,1,2,5,4},{2,5,1,3,4}};
                    for(int i = 0; i < numCases; i++) {
                        int numPpl = aryNumPpl[i];
                        int idx;
                        LinkedHashMap<Integer, ObjChaos> lhmap = new LinkedHashMap<>();
                        for(int j = 0; j < numPpl; j++) {
                            idx = aryVals[i][j];
                            ObjChaos obj = new ObjChaos();
                            obj.id = idx;
                            lhmap.put(j + 1, obj);
                        }
                        printLHMap(lhmap);
                        print("===================================\n");

                        t03_01(lhmap);
                        print("===================================\n");
                    }                    
                }
            }
            public void t03_cmdline() {
                Scanner in = new Scanner(System.in);
                int numCases = in.nextInt();
                for(int i = 0; i < numCases; i++) {
                    int numPpl = in.nextInt();
                    int idx;
                    LinkedHashMap<Integer, ObjChaos> lhmap = new LinkedHashMap<>();
                    for(int j = 1; j <= numPpl; j++) {
                        idx = in.nextInt();
                        if(j == idx) {
                            continue;
                        }
                        ObjChaos obj = new ObjChaos();
                        obj.id = idx;
                        lhmap.put(j, obj);
                    }
                    printLHMap(lhmap);

                    t03_01(lhmap);
                    //print("===================================\n");
                }
                in.close();                
            }
            public void t03_01(LinkedHashMap<Integer, ObjChaos> lhmap) {
                int numMoves = 0;
                boolean isOrdered = false;
                Set<Integer> set = lhmap.keySet();
                ArrayList<Integer> list = new ArrayList<>();
                for(Integer i: set) {
                    list.add(i);
                }
                while(!isOrdered) {
                    isOrdered = true;
                    for(int i = 0; i < list.size(); i++) {
                        int positionSrc = list.get(i);
                        ObjChaos objSrc = lhmap.get(positionSrc);
                        if(positionSrc != objSrc.id) {
                            isOrdered = false;
                            int positionDst = positionSrc + 1;
                            ObjChaos objDst = null;
                            if((positionSrc + 1) == objSrc.id) {
                                positionDst = positionSrc + 1;
                                objDst      = lhmap.get(positionDst);
                            } else if((positionSrc + 2) == objSrc.id) {
                                positionDst = positionSrc + 2;
                                objDst      = lhmap.get(positionDst);
                            } else {
                                printLHMap(lhmap, 20);
                                print("numSteps > 2 @ %3d@%3d\n", positionSrc, objSrc.id);
                                System.out.printf("Too chaotic\n");
                                return;                                
                            }
                            if(objDst == null) {
                                printLHMap(lhmap, 20);
                                print("null @ %3d@%3d\n", objSrc.id, positionSrc);
                                System.out.printf("Too chaotic\n");
                                return;
                            }
                            if(objSrc.numMoves >= 2) {
                                printLHMap(lhmap, 20);
                                print("numMoves > 2 @ %3d@%3d\n", objSrc.id, positionSrc);
                                System.out.printf("Too chaotic\n");
                                return;
                            }
                            if((positionSrc + 1) == objSrc.id) {
                                objSrc.numMoves++;
                                print("switch %3d@%3d with %3d@%3d\n", objSrc.id, positionSrc, objDst.id, positionDst);
                                lhmap.put(positionSrc, objDst);
                                lhmap.put(positionDst, objSrc);
                                numMoves++;
                                printLHMap(lhmap, 15);                                                                
                            } else if((positionSrc + 2) == objSrc.id) {
                                objSrc.numMoves += 2;
                                print("switch %3d@%3d with %3d@%3d\n", objSrc.id, positionSrc, objDst.id, positionDst);
                                lhmap.put(positionSrc, objDst);
                                lhmap.put(positionDst, objSrc);
                                numMoves += 2;
                                printLHMap(lhmap, 15);                                                                                                
                            }
                            //printLHMap(lhmap);
                        }
                    }
                }
                System.out.printf("%d\n", numMoves);

            }
            public void t04() throws Exception {
                final int numMoves = 5;
                final int numElements = 10;
                generateAndReverseChaos(numMoves, numElements);
            }
            public void test() {
                try {
                    t03();                    
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        public void test() {
            Tests t = new Tests();
            t.test();
        }
    }
    class AlgorithmsRanges {
        private boolean isDebug = false;
        Utils utils = new Utils();
        public void setDebug(boolean isDebug) {
            this.isDebug = isDebug;
        }
        public boolean getDebug() {
            return this.isDebug;
        }
        /**
         * Returns random list of pairs of Integers min,max
         * 
         * @param numPairs
         * @param minRange The absolute min of entire range
         * @param maxRange The absolute max of entire range
         * @param minPairDistance The min distance between min and max of pair
         * @param maxPairDistance The max distance between min and max of pair
         * @return list of pairs of Integers min, max
         */
        public java.util.List<Pair<Integer, Integer>> listPairs(
            int numPairs, 
            int minRange, 
            int maxRange, 
            int minPairDistance, 
            int maxPairDistance) {
            java.util.List<Pair<Integer, Integer>> l = new ArrayList<>();
            for(int i = 0; i < numPairs; i++) {
                int v = utils.randInt(minRange, maxRange, true);
                int span = utils.randInt(minPairDistance, maxPairDistance, true);
                int lo = v;
                int hi = span + v;
                if(hi > maxRange) {
                    hi = v;
                    lo = v - span;
                }
                Pair<Integer, Integer> pair = new Pair<>(lo, hi);
                l.add(pair);
            }
            if(isDebug) {
                validateListPairs(
                    l, numPairs, minRange, maxRange, minPairDistance, maxPairDistance);
            }
            return l;
        }
        private void validateListPairs(
            final java.util.List<Pair<Integer, Integer>> l,
            final int numPairs, 
            final int minRange, 
            final int maxRange, 
            final int minPairDistance, 
            final int maxPairDistance) {
            boolean b = false;
            b = l.size() == numPairs;
            assert b == true;
            for(int i = 0; i < numPairs; i++) {
                Pair<Integer, Integer> p = l.get(i);
                int f = p.f();
                int s = p.s();
                b = f >= minRange && f <= maxRange;
                assert b == true;
                b = s >= minRange && s <= maxRange;
                assert b == true;
                b = f <= s;
                assert b == true;
                b = (f + minPairDistance) >= s;
                assert b == true;
                b = (f + maxPairDistance) <= s;
                assert b == true;
             }

        }
        public void print(String format, Object... args) {
            System.out.printf(String.format(format, args));
        }
        public class AlgorithmsRangesTest {
            /*
             * List number of active ranges at any existing interval.
             */
            public TreeMap<Integer, java.util.List<HashMap<String, Integer>>> t01() {
                final int numPairs = 100;
                final int minRange = 10;
                final int maxRange = 30;
                final int minSpan = 1;
                final int maxSpan = 9;
                return t01(numPairs, minRange, maxRange, minSpan, maxSpan);
            }

            public TreeMap<Integer, java.util.List<HashMap<String, Integer>>> t01(
                final int numPairs,
                final int minRange,
                final int maxRange,
                final int minSpan,
                final int maxSpan) {
                /*
                 * Have a multimap sorted by key. Value is if open or close
                 * an interval. Add names to each pair to track. 
                 */
                java.util.List<Pair<Integer,Integer>> list = 
                    listPairs(numPairs, minRange, maxRange, minSpan, maxSpan);
                /*
                 * Now sort using TreeMap
                 */
                TreeMap<Integer, java.util.List<HashMap<String, Integer>>> treeMap = 
                    new TreeMap<>();
                
                for(int i = 0; i < list.size(); i++) {
                    Pair<Integer, Integer> pair = list.get(i);
                    Integer idx = i;
                    Integer beg = pair.f();
                    Integer end = pair.s();
                    java.util.List<HashMap<String,Integer>> mapList = null;
                    HashMap<String, Integer> map = null;
                    mapList = treeMap.get(beg);
                    if(mapList == null) {
                        mapList = new ArrayList<HashMap<String,Integer>>();
                        treeMap.put(beg, mapList);
                    }
                    map = new HashMap<>();
                    map.put("TYPE", 0); // 0 = beg
                    map.put("NAME", idx);
                    mapList.add(map);

                    mapList = treeMap.get(end);
                    if(mapList == null) {
                        mapList = new ArrayList<HashMap<String,Integer>>();
                        treeMap.put(end, mapList);
                    }
                    map = new HashMap<>();
                    map.put("TYPE", 1); // 1 = end
                    map.put("NAME", idx);
                    mapList.add(map);
                }
                
                /*
                 * now iterate treemap, which is key sorted, to list chronology.
                 */
                int numActive = 0;
                int prev = -1;
                for(Map.Entry<Integer, java.util.List<HashMap<String, Integer>>> e: 
                    treeMap.entrySet()) {
                    Integer k = e.getKey();
                    java.util.List<HashMap<String, Integer>> v = e.getValue();
                    StringBuilder sb = new StringBuilder();
                    for(HashMap<String, Integer> map: v) {
                        Integer typeVal = map.get("TYPE");
                        Integer name = map.get("NAME");
                        if(typeVal == 0) {
                            numActive++;
                        } else if(typeVal == 1) {
                            numActive--;
                        }
                        sb.append(String.format("%3d:%d ", name, typeVal));
                    }
                    print("mark:%3d numActive:%3d names:%s\n", 
                        k, numActive, sb.toString());
                    boolean res = prev < k.intValue();
                    assert res;
                    prev = k;
                }
                return treeMap;                
            }
            /*
             * Test out Pairs generation. 
             */
            public void t25() {
                AlgorithmsRanges t = new AlgorithmsRanges();
                t.setDebug(true);
                Map<Integer, Integer> mapD = new TreeMap<>();
                Map<Integer, Integer> mapR = new TreeMap<>();
                int numPairs = 10000;
                java.util.List<Pair<Integer, Integer>> list = 
                    listPairs(numPairs, 10, 50, 1, 10);
                /*
                 * Make 2 histogram maps, one for range, one for span per pair. 
                 */
                for(Pair<Integer, Integer> pair: list) {
                    int f = pair.f();
                    int s = pair.s();
                    int d = s - f;
                    Integer mapV = mapD.get(d);
                    if(mapV == null) {
                        mapD.put(d, 0);
                    } else {
                        mapD.put(d, mapV.intValue()+1);
                    }
                    mapV = mapR.get(f);
                    if(mapV == null) {
                        mapR.put(f, 0);
                    } else {
                        mapR.put(f, mapV.intValue()+1);
                    }
                    mapV = mapR.get(s);
                    if(mapV == null) {
                        mapR.put(s, 0);
                    } else {
                        mapR.put(s, mapV.intValue()+1);
                    }
                }
                //for(Pair<Integer, Integer> pair: list) {
                //    int f = pair.f();
                //    int s = pair.s();
                //    int d = s - f;
                //    print("f:%02d s:%02d d:%02d\n", f, s, d);
                //}
                print("\nprint mapDistance\n");
                for(Map.Entry<Integer, Integer> e: mapD.entrySet()) {
                    print("k:%02d v:%02d\n", e.getKey(), e.getValue());
                }
                print("\nprint mapRange\n");
                for(Map.Entry<Integer, Integer> e: mapR.entrySet()) {
                    print("k:%02d v:%02d\n", e.getKey(), e.getValue());
                }
            }
            public void test() {
                t01();
            }
        }
        public void test() {
            AlgorithmsRangesTest t = new AlgorithmsRangesTest();
            t.test();
        }
    }
    class AnonymousClassesTest {
        class RegularHello implements HelloInterface {
            String name;
            public RegularHello(String name) {
                this.name = name;
            }
            @Override
            public void sayHi() {
                System.out.printf("%s says hello\n", name);
            }
            @Override
            public String getName() {
                return name;
            }
        }
        class Test {
            public void t0() {
                RegularHello o0 = new RegularHello("name0");

                HelloInterface o1 = new HelloInterface() {
                    String name = "default";
                    @Override
                    public void sayHi() {
                        System.out.printf("%s says hello\n", name);
                    }
                    @Override
                    public String getName() {
                        return name;
                    }
                };
                /*
                 * anonymous classes cannot have constructors, but superclass can have
                 * constructor and you can pass parameters there. 
                 */
                
                HelloInterfaceSuper o2 = new HelloInterfaceSuper("name2") {
                    @Override
                    public void sayHi() {
                        System.out.printf("override %s says hello\n", name);
                    }
                    @Override
                    public String getName() {
                        return "override " + name;
                    }
                };
                HelloInterfaceSuper o3 = new HelloInterfaceSuper("name3") {
                    @Override
                    public void sayHi() {
                        System.out.printf("override %s says hello\n", name);
                    }
                    @Override
                    public String getName() {
                        return name;
                    }
                    /*
                     * to set a variable, make a method that returns this
                     */
                    public HelloInterfaceSuper setName(String name) {
                        this.name = name;
                        return this;
                    }
                }.setName("override_name");
                o0.sayHi();
                o1.sayHi();
                o2.sayHi();
                o3.sayHi();
                boolean res;
                res = o0.getName().equals("name0");
                assert res;
                res = o1.getName().equals("default");
                assert res;
                res = o2.getName().equals("override name2");
                assert res;
                res = o3.getName().equals("override_name");
                assert res;
                System.out.printf("test pass\n");
            }
            public void test() {
                t0();
            }
        }
        public void test() {
            Test t = new Test();
            t.test();
        }
    }
    class LambdaTest {   
        /*
         * If you have an interface with a single method, do not
         * need constructor, 
         * do not need named type,
         * do not need fields, or additional methods, use lamba.
         * 
         * If an interface has only 1 method, the method does not need a name.
         * It is implied. This allows for lambda expression. 
         * 
         */
        class Test {
            public void methodThatUsesSingleInterface(int i, int j, SingleInterface ifc) {
                int s = ifc.add(i, j);
                System.out.printf("%d+%d=%d\n", i, j, s);                    
            }
            public void t0() {

                SingleInterface ifc0 = (i, j)->i+j;
                
                ArrayList<Integer> l0 = new ArrayList<>(Arrays.asList(10,20,30));
                ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10,20,30));
                
                for(int i = 0; i < l0.size(); i++) {
                    int s0 = ifc0.add(l0.get(i), l1.get(i));
                    System.out.printf("%d+%d=%d\n", l0.get(i), l1.get(i), s0);                    
                }
            }
            public void t1() {
                ArrayList<Integer> l0 = new ArrayList<>(Arrays.asList(10,20,30));
                ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(10,20,30));
                
                for(int i = 0; i < l0.size(); i++) {
                    methodThatUsesSingleInterface(
                        l0.get(i), l1.get(i), 
                        (int x, int y)->x+y);
                }         
            }
            public void test() {
                t1();
            }
        }
        public void test() {
            Test t = new Test();
            t.test();
        }
    }
    class CompletableFuturesTest {            
        class Test {
            public void test() {
                
            }
        }
        public void test() {
            Test t = new Test();
            t.test();
        }
    }
    class Generics {
        class GenericsFactory<T,Y> {
            /*
             * example of generic class
             */
            Class<T> clazz = null; // class is keyword, so use clazz
            public GenericsFactory(Class<T> clazz) {
                this.clazz = clazz;
            }
            public T createInstance() throws Exception {
                return (T)clazz.newInstance();
            }
            public Y createInstance(Class<Y> inClass) throws Exception {
                return inClass.newInstance();
            }
            /*
             * example of generic method
             */
            public T addToCollection(T e, Collection<T> c) {
                c.add(e);
                return e;
            }
        }
        class GenericIterable <T> implements Iterable<T> {
            ArrayList<T> list;
            public GenericIterable() {
                list = new ArrayList<T>();
            }
            public void add(T e) {
                list.add(e);
            }
            @Override
            public Iterator<T> iterator() {
                Iterator<T> it = new Iterator<T>() {
                    private int i = 0;
                    @Override
                    public boolean hasNext() {
                        if(i < list.size()) {
                            return true;
                        }
                        return false;
                    }
                    @Override
                    public T next() {
                        return list.get(i++);
                    }
                    @Override
                    public void remove() {
                        
                    }
                };
                return it;
            }
        }
        class GenericIterator <T> implements Iterator<T> {
            ArrayList<T> list;
            private int i = 0;
            public GenericIterator() {
                list = new ArrayList<T>();
            }
            public void add(T e) {
                list.add(e);
            }
            @Override
            public boolean hasNext() {
                if(i < list.size()) {
                    return true;
                }
                return false;
            }
            @Override
            public T next() {
                return list.get(i++);
            }
            @Override
            public void remove() {
                
            }
        }
        class GenericsTest {
            public void t00() throws Exception {
                GenericsFactory<Integer,String> factory = 
                    new GenericsFactory<>(Integer.class);
                Integer i = factory.createInstance();
                String s = factory.createInstance(String.class);
                
                ArrayList<Integer> listInt = new ArrayList<>();
                Integer j = factory.addToCollection(i, listInt);

                assert (i == j);
                assert (s != null);
            }
            public void t01() throws Exception {
                GenericIterable<Integer> genIter = new GenericIterable<>();
                int sz = 10;
                for(int i = 0; i < sz; i++) {
                    genIter.add(i);
                }
                for(Integer i: genIter) {
                    System.out.println(i);
                }
            }
            public void t02() throws Exception {
                GenericIterator<Integer> genIter = new GenericIterator<>();
                int sz = 10;
                for(int i = 0; i < sz; i++) {
                    genIter.add(i);
                }
                while(genIter.hasNext()) {
                    System.out.println(genIter.next());
                }
                // how do i iterate twice over this without reset?
                // you cannot
                // iterator doesnt have a rewind method because it is
                // not meant to rewind. to rewind, use iterable
            }

            public void test() throws Exception {
                t02();
            }
        }
        public void test() {
            GenericsTest t = new GenericsTest();
            try {
                t.test();  
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    class MySet {
        int a_;
        int b_;
        int c_;
        int d_;

        public MySet() {
            a_ = b_ = c_ = d_ = 0;
        }

        public MySet(MySet dup) {
            a_ = dup.a();
            b_ = dup.b();
            c_ = dup.c();
            d_ = dup.d();
        }

        public void copy(MySet set) {
            a_ = set.a();
            b_ = set.b();
            c_ = set.c();
            d_ = set.d();
        }

        public MySet a(int a) {
            a_ = a;
            return this;
        }

        public MySet b(int b) {
            b_ = b;
            return this;
        }

        public MySet c(int c) {
            c_ = c;
            return this;
        }

        public MySet d(int d) {
            d_ = d;
            return this;
        }

        public int a() {
            return a_;
        }

        public int b() {
            return b_;
        }

        public int c() {
            return c_;
        }

        public int d() {
            return d_;
        }
    }
    class InnerClassTesting {
        public InnerClassTesting() {
        }

        class A {
            protected int a_;

            public A(int a) {
                a_ = a;
            }

            public void printObj() {
                System.out.printf("A: a:%d\n", a_);
            }
        }

        class B {
            protected int b_;

            public B(int b) {
                b_ = b;
            }

            public void printObj() {
                System.out.printf("B: b:%d\n", b_);
            }
        }

        class C extends A {
            protected int c_;

            public C(int c, int a) {
                super(a);
                c_ = c;
            }

            public void printObj() {
                System.out.printf("C: c:%d a:%d\n", c_, a_);
                super.printObj();
            }
        }

        public void test() {
            A a = new A(10);
            B b = new B(20);
            C c = new C(30, 40);
            a.printObj();
            b.printObj();
            c.printObj();
        }
    }

    class HashMapSortTest2 {
        Random rand;
        ArrayList<Integer> alist;
        TreeMap<Integer, ArrayList<Integer>> treemap;

        public HashMapSortTest2(long seed) {
            init(seed);
        }

        public void init(long seed) {
            rand = new Random(seed);
            treemap = new TreeMap<Integer, ArrayList<Integer>>();
        }

        public void randomize_hash() {
            int i, j;
            for (i = 0; i < 50; i++) {
                alist = new ArrayList<Integer>();
                for (j = 0; j < 10; j++) {
                    alist.add(new Integer(rand.nextInt(1000)));
                }
                treemap.put(new Integer(rand.nextInt(1000)), alist);
            }
        }

        public void print_hash() {
            Set<Integer> set = treemap.keySet();
            Iterator<Integer> iter = set.iterator();
            int i, j, k;
            i = 0;
            while (iter.hasNext()) {
                k = iter.next().intValue();
                alist = treemap.get(k);
                System.out.printf("i %04d k %04d list ", i, k);
                for (j = 0; j < alist.size(); j++) {
                    System.out.printf("%04d ", alist.get(j).intValue());
                }
                System.out.printf("\n");
                i++;
            }
        }

        public void test() {
            randomize_hash();
            print_hash();
        }
    }
    class MapTest {
        Random rand;
        TreeMap<Integer, Integer> treemap;

        public MapTest(long seed) {
            init(seed);
        }

        public void init(long seed) {
            rand = new Random(seed);
            treemap = new TreeMap<Integer, Integer>();
        }

        public void randomize_hash() {
            for (int i = 0; i < 50; i++) {
                treemap.put(new Integer(rand.nextInt(1000)),
                    new Integer(rand.nextInt(1000)));
            }
        }
        public void print_hash() {
            Set<Integer> set = treemap.keySet();
            Iterator<Integer> iter = set.iterator();
            int k, v, i;
            i = 0;
            while (iter.hasNext()) {
                k = iter.next().intValue();
                v = treemap.get(k);
                System.out.printf("i %04d k %04d v %04d\n", i, k, v);
                i++;
            }
        }
        class Test {
            public void t00() {
                randomize_hash();
                print_hash();                
            }
            public void t01() {
                /*
                 * HashMap starts with 12, and if number of items approaches the
                 * bucket count, then HashMap increases size to 24 then 36...
                 */
                int sz = 1000000;
                t01(sz);
            }
            public void t01(int sz) {
                Map<String, String> map = new HashMap<>();
                for(int i = 0; i < sz; i++) {
                    String k = Integer.toString(i);
                    String v = String.format("String_%02d", i);
                    map.put(k, v);
                }
                boolean res;
                for(Map.Entry<String, String> e: map.entrySet()) {
                    String k = e.getKey();
                    String v = e.getValue();
                    res = k != null && v != null;
                    assert res;
                }
            }
            public void t02() {
                int sz = 1000000;
                t02(sz);
            }
            public void t02(int sz) {
                Map<String, String> map = new LinkedHashMap<>();
                for(int i = 0; i < sz; i++) {
                    String k = Integer.toString(i);
                    String v = String.format("String_%02d", i);
                    map.put(k, v);
                }
                boolean res = true;
                for(Map.Entry<String, String> e: map.entrySet()) {
                    String k = e.getKey();
                    String v = e.getValue();
                    res = k != null && v != null;
                    assert res;
                }
                assert res;
            }
            public void t03() {
                t03(10);
            }
            public void t03(int sz) {
                Map<Integer, Integer> map = new LinkedHashMap<>();
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = 0; i < sz; i++) {
                    list.add(i);
                }
                Object a[] = list.toArray();
                utils_.shuffle(a);
                list.clear();
                for(int i = 0; i < sz; i++) {
                    list.add((Integer)a[i]);
                }
                for(int i = 0; i < sz; i++) {
                    Integer k = list.get(i);
                    map.put(k, k);
                }
                int i = 0;
                boolean res;
                /*
                 * iteration of LinkedHashMap is in same order as insert,
                 * which is different from HashMap ordering
                 */
                for(Map.Entry<Integer, Integer> e: map.entrySet()) {
                    Integer kFromMap = e.getKey();
                    Integer kFromList = list.get(i);
                    System.out.printf("k:%d, %d\n", kFromMap, kFromList);
                    res = kFromMap == kFromList;
                    assert res;
                    i++;
                }
            }
            public void t04() {
                int sz = 10;
                ArrayList<Integer> list1 = new ArrayList<>();
                for(int i = 0; i < sz; i++) {
                    list1.add(i);
                }
                Object array[] = list1.toArray();
                ArrayList<Integer> list2 = new ArrayList<>();
                sz = array.length;
                for(int i = sz-1; i >= 0; i--) {
                    list2.add((Integer)array[i]);
                }
                for(Integer i: list2) {
                    System.out.printf("%d\n", i);
                }
            }
            public void test() {
                t03();
            }
        }
        public void test() {
            Test t = new Test();
            t.test();
        }
    }
    class MathClass {
        class MathTests {
            public void t0() {
                int n = 12;
                double degree = 360.0 / n;
                int degSum = 0;
                int length = 100;
                for (int i = 0; i < n; i++) {
                    double radian = (degSum % 360) * Math.PI / 180;
                    int x = (int) (Math.cos(radian) * length);
                    int y = (int) (Math.sin(radian) * length);
                    System.out.printf(
                        "i:%2d rad:%7.2f x:%4d y:%4d deg:%d%n",
                        i, radian, x, y, degSum);
                    degSum += degree;
                }
            }

            public void test() {
                t0();
            }
        }
        public void test() {
            MathTests t = new MathTests();
            t.test();
        }
    }

    class BSTNode {
        public int v_;
        public BSTNode l_;
        public BSTNode r_;

        public BSTNode(int v) {
            v_ = v;
            l_ = null;
            r_ = null;
        }

        public void setLC(BSTNode l) {
            l_ = l;
        }

        public void setRC(BSTNode r) {
            r_ = r;
        }

        public void l(BSTNode l) {
            l_ = l;
        }

        public void r(BSTNode r) {
            r_ = r;
        }

        public BSTNode l() {
            return l_;
        }

        public BSTNode r() {
            return r_;
        }

        public BSTNode getLC() {
            return l_;
        }

        public BSTNode getRC() {
            return r_;
        }

        public void setV(int v) {
            v_ = v;
        }

        public int getV() {
            return v_;
        }

        public int v() {
            return v_;
        }

        public void v(int v) {
            v_ = v;
        }
    }
    class BST {
        protected BSTNode root_;
        boolean dbg_;

        public BST() {
            root_ = null;
            dbg_ = false;
        }

        public BSTNode getRoot() {
            return root_;
        }

        public void setTree(BSTNode root) {
            root_ = root;
        }

        public void insert(int v) {
            root_ = insert_(v, root_);
        }

        protected BSTNode insert_(int v, BSTNode n) {
            if (n == null) {
                return new BSTNode(v);
            }
            if (v < n.getV()) {
                n.setLC(insert_(v, n.getLC()));
            } else if (v > n.getV()) {
                n.setRC(insert_(v, n.getRC()));
            }
            return n;
        }

        public int getHeight(BSTNode n) {
            if (n == null) {
                return 0;
            }
            int hl = getHeight(n.getLC()) + 1;
            int hr = getHeight(n.getRC()) + 1;
            if (hl > hr) {
                return hl;
            }
            return hr;
        }

        public BSTNode find(int v) {
            return find_(v, root_);
        }

        protected BSTNode find_(int v, BSTNode n) {
            if (n == null) {
                return null;
            }
            if (v == n.getV()) {
                return n;
            } else if (v < n.getV()) {
                return find_(v, n.getLC());
            } else if (v > n.getV()) {
                return find_(v, n.getRC());
            }
            return n;
        }

        protected BSTNode findLargestNode(BSTNode n) {
            if (n == null) {
                return n;
            }
            if (n.getRC() == null) {
                return n;
            }
            return findLargestNode(n.getRC());
        }

        public void findKthLargestNode(int k) {
            MutableInteger i = new MutableInteger(0);
            findKthLargestNode(k, root_, i);
        }

        protected void findKthLargestNode(int k, BSTNode n, MutableInteger i) {
            // reverse in order traversal so largest element visited first
            if (n == null) {
                return;
            }
            findKthLargestNode(k, n.getRC(), i);
            i.inc();
            if (i.v() == k) {
                System.out.printf("%d th value = %d\n", k, n.getV());
                return;
            }
            findKthLargestNode(k, n.getLC(), i);
        }

        public boolean delete(int v) throws Exception {
            MutableInteger status = new MutableInteger(1);
            root_ = delete_(v, root_, status);
            if (status.intValue() == 1) {
                return true;
            }
            return false;
        }

        protected BSTNode delete_(int v, BSTNode n, MutableInteger status) {
            if (n == null) {
                status.setValue(0);
                return n;
            }
            if (v < n.getV()) {
                n.setLC(delete_(v, n.getLC(), status));
            } else if (v > n.getV()) {
                n.setRC(delete_(v, n.getRC(), status));
            } else {
                if (n.getLC() == null && n.getRC() == null) {
                    return null;
                } else if (n.getLC() != null && n.getRC() == null) {
                    return n.getLC();
                } else if (n.getLC() == null && n.getRC() != null) {
                    return n.getRC();
                } else {
                    BSTNode tmp = findLargestNode(n.getLC());
                    n.setLC(delete_(tmp.getV(), n.getLC(), status));
                    BSTNode newNode = new BSTNode(tmp.getV());
                    newNode.setLC(n.getLC());
                    newNode.setRC(n.getRC());
                    return newNode;
                }
            }
            return n;
        }

        public String traverseOrder(int type) {
            StringBuilder sBuilder = new StringBuilder();
            if (type == 0) { // level order
                traverseLevel(sBuilder);
            } else {
                traversePreInPost(type, root_, sBuilder);
            }
            return sBuilder.toString();
        }

        protected void traverseLevel(StringBuilder sBuilder) {
            ArrayList<BSTNode> ary = new ArrayList<BSTNode>();
            ary.add(root_);
            while (ary.size() != 0) {
                BSTNode n = ary.remove(0);
                sBuilder.append(String.format("%2d ", n.getV()));
                if (n.getLC() != null) {
                    ary.add(n.getLC());
                }
                if (n.getRC() != null) {
                    ary.add(n.getRC());
                }
            }
        }

        protected void traversePreInPost(int type, BSTNode n,
            StringBuilder sBuilder) {
            if (n == null) {
                return;
            }
            if (type == 1) {
                sBuilder.append(String.format("%2d ", n.getV()));
            }
            traversePreInPost(type, n.getLC(), sBuilder);
            if (type == 2) {
                sBuilder.append(String.format("%2d ", n.getV()));
            }
            traversePreInPost(type, n.getRC(), sBuilder);
            if (type == 3) {
                sBuilder.append(String.format("%2d ", n.getV()));
            }
        }

        public String preOrder() {
            StringBuilder s = new StringBuilder();
            preOrder(root_, s);
            return s.toString();
        }

        public String inOrder() {
            StringBuilder s = new StringBuilder();
            inOrder(root_, s);
            return s.toString();
        }

        public String postOrder() {
            StringBuilder s = new StringBuilder();
            postOrder(root_, s);
            return s.toString();
        }

        public void buildTreePostIn(
            java.util.List<Integer> lio,
            java.util.List<Integer> lpo) {
            /**
             * build tree from in order and post order
             * 
             * @param lio:
             *            list in order
             * @param lpo:
             *            list post order
             */

            int aio[] = new int[lio.size()];
            int apo[] = new int[lpo.size()];
            for (int i = 0; i < aio.length; i++) {
                aio[i] = lio.get(i).intValue();
                apo[i] = lpo.get(i).intValue();
            }
            buildTreePostIn(aio, apo);
        }

        public void buildTreePostIn(
            int aio[],
            int apo[]) {
            /**
             * build tree from in order and post order. pick serially in reverse
             * order. so i = 0 is the last element of array post order. pick
             * serially from post order list, find element in in order list, and
             * split in order list into left and right array recursively.
             * because picking reverse order, the left and right are swapped
             * 
             * @param aio:
             *            array in order
             * @param apo:
             *            array post order
             */
            root_ = null;
            if (aio.length == 0 || aio.length != apo.length) {
                return;
            }
            MutableInteger i = new MutableInteger(0);
            root_ = buildTreePostIn(aio, apo, i, 0, aio.length - 1);
        }

        public void buildTreePreIn(
            java.util.List<Integer> orderIn,
            java.util.List<Integer> orderPre) {

            int ary_in[] = new int[orderIn.size()];
            int ary_pre[] = new int[orderPre.size()];
            for (int i = 0; i < ary_in.length; i++) {
                ary_in[i] = orderIn.get(i).intValue();
            }
            for (int i = 0; i < ary_pre.length; i++) {
                ary_pre[i] = orderPre.get(i).intValue();
            }
            buildTreePreIn(ary_in, ary_pre);
        }

        public void buildTreePreIn(int orderIn[], int orderPre[]) {
            /**
             * build tree from pre order and in order list. pick serially from
             * preorder list, find the element in in order list, and split the
             * in order list into left and right array recursively.
             */
            root_ = null;
            if (orderIn.length == 0 || orderPre.length == 0 ||
                orderIn.length != orderPre.length) {
                return;
            }
            MutableInteger i = new MutableInteger(0);
            root_ = buildTreePreIn(orderIn, orderPre, i, 0, orderIn.length - 1);
        }

        protected int findValInAry(int v, int ary[]) {
            for (int i = 0; i < ary.length; i++) {
                if (ary[i] == v) {
                    return i;
                }
            }
            return -1;
        }

        protected BSTNode buildTreePostIn(
            int aio[],
            int apo[],
            MutableInteger i,
            int l,
            int r) {
            /**
             * @param aio:
             *            array in order
             * @param apo:
             *            array post order
             * @param i:
             *            cur idx of post order, starting from end
             * @param l:
             *            left idx of post order, inclusive
             * @param r:
             *            right idx of post order, inclusive
             */
            if (i.v() >= apo.length || l > r) {
                return null;
            }
            int idxRev = apo.length - 1 - i.v();
            int nodeVal = apo[idxRev];
            BSTNode n = new BSTNode(nodeVal);

            int idxIO = findValInAry(nodeVal, aio);
            int idxL = idxIO - 1;
            int idxR = idxIO + 1;

            if (l == r) {
                return n;
            }

            if (idxL >= l) {
                i.inc();
                BSTNode nl = buildTreePostIn(aio, apo, i, l, idxL);
                n.l(nl);
            }

            if (idxR <= r) {
                i.inc();
                BSTNode nr = buildTreePostIn(aio, apo, i, idxR, r);
                n.r(nr);
            }
            return n;
        }

        protected BSTNode buildTreePreIn(
            int orderIn[],
            int orderPre[],
            MutableInteger i,
            int l,
            int r) {
            /**
             * @param orderIn:
             *            in order list
             * @param orderPre:
             *            pre order list
             * @param i:
             *            cur idx of pre order
             * @param l:
             *            left idx of in order, inclusive
             * @param r:
             *            right idx of in order, inclusive
             * 
             */
            int idxCur = i.v();
            if (idxCur >= orderIn.length || l > r) {
                return null;
            }

            int nodeVal = orderPre[idxCur];
            BSTNode n = new BSTNode(nodeVal);

            int idxIO = findValInAry(nodeVal, orderIn);
            int idxL = idxIO - 1;
            int idxR = idxIO + 1;

            if (dbg_ == true) {
                System.out.printf("i:%d nodeVal:%d l:%d idxL:%d idxR:%d r:%d%n",
                    i.v(), nodeVal, l, idxL, idxR, r);
            }

            if (l == r) {
                return n;
            }

            if (idxL >= l) {
                i.inc();
                BSTNode nl = buildTreePreIn(orderIn, orderPre, i, l, idxL);
                n.l(nl);
            }

            if (idxR <= r) {
                i.inc();
                BSTNode nr = buildTreePreIn(orderIn, orderPre, i, idxR, r);
                n.r(nr);
            }

            return n;
        }

        public void preOrder(BSTNode n, StringBuilder sBuilder) {
            if (n == null) {
                return;
            }
            sBuilder.append(String.format("%d ", n.getV()));
            preOrder(n.getLC(), sBuilder);
            preOrder(n.getRC(), sBuilder);
        }

        public void inOrder(BSTNode n, StringBuilder sBuilder) {
            if (n == null) {
                return;
            }
            inOrder(n.getLC(), sBuilder);
            sBuilder.append(String.format("%d ", n.getV()));
            inOrder(n.getRC(), sBuilder);
        }

        public void postOrder(BSTNode n, StringBuilder sBuilder) {
            if (n == null) {
                return;
            }
            postOrder(n.getLC(), sBuilder);
            postOrder(n.getRC(), sBuilder);
            sBuilder.append(String.format("%d ", n.getV()));
        }

        public String inOrderReverse() {
            StringBuilder sb = new StringBuilder();
            inOrderReverse(root_, sb);
            return sb.toString();
        }

        public String preOrderReverse() {
            StringBuilder sb = new StringBuilder();
            preOrderReverse(root_, sb);
            return sb.toString();
        }

        public String postOrderReverse() {
            StringBuilder sb = new StringBuilder();
            postOrderReverse(root_, sb);
            return sb.toString();
        }

        public void inOrderReverse(BSTNode n, StringBuilder sb) {
            if (n == null) {
                return;
            }
            inOrderReverse(n.getRC(), sb);
            sb.append(String.format("%2d ", n.getV()));
            inOrderReverse(n.getLC(), sb);
        }

        public void preOrderReverse(BSTNode n, StringBuilder sb) {
            if (n == null) {
                return;
            }
            sb.append(String.format("%2d ", n.getV()));
            preOrderReverse(n.getRC(), sb);
            preOrderReverse(n.getLC(), sb);
        }

        public void postOrderReverse(BSTNode n, StringBuilder sb) {
            if (n == null) {
                return;
            }
            preOrderReverse(n.getRC(), sb);
            preOrderReverse(n.getLC(), sb);
            sb.append(String.format("%2d ", n.getV()));
        }

        public void printOrders() {
            System.out.printf("levelorder:      %s\n", traverseOrder(0));
            System.out.printf("preorder:        %s\n", traverseOrder(1));
            System.out.printf("inorder:         %s\n", traverseOrder(2));
            System.out.printf("postorder:       %s\n", traverseOrder(3));
            System.out.printf("rev preorder:    %s\n", preOrderReverse());
            System.out.printf("rev inorder:     %s\n", inOrderReverse());
            System.out.printf("rev postorder:   %s\n", postOrderReverse());
        }

        public int getMaxHeight() {
            if (root_ == null) {
                return 0;
            }
            return getMaxHeight_(root_);
        }

        protected int getMaxHeight_(BSTNode n) {
            if (n == null) {
                return 0;
            }
            int l = getMaxHeight_(n.getLC());
            int r = getMaxHeight_(n.getRC());
            if (l > r) {
                return (l + 1);
            }
            return (r + 1);
        }

        public void printTree() {
            if (root_ == null) {
                return;
            }
            int h = getMaxHeight_(root_);
            int nBase = (int) Math.pow(2, h) - 1;
            int nY = nBase;
            int nX = 4;
            HashMap<Integer, String> map = new HashMap<Integer, String>();
            int l = 0;
            int r = nY;
            int m = (int) ((l + r) / 2);
            int level = 0;
            printTree_(root_, map, level, l, m, r, nX);
            for (int i = 0, emptyLineCnt = 0; i < nY; i++) {
                // java has autoboxing of primitive types to autoconvert
                // if(map.containsKey(new Integer(i))) {
                if (map.containsKey(i)) {
                    System.out.printf("%4d: %s\n", i, map.get(i));
                    emptyLineCnt = 0;
                } else {
                    if (emptyLineCnt < 2) {
                        System.out.printf("%4d: \n", i);
                    }
                    emptyLineCnt++;
                }
            }
        }

        public void saveFile(String sfile) throws Exception {
            /**
             * Write to file sfile. The first line is inorder. The second line
             * is preorder. ie:
             * 
             * in: 1,2,3,4 <-- inorder pre: 1,2,3,4 <-- preorder
             */

            Path path = Paths.get(sfile);
            if (Files.exists(path) == true) {
                int i = 0;
                String sDst = String.format("%s.%d", sfile, i);
                Path pDst = Paths.get(sDst);
                while (Files.exists(pDst) == true) {
                    i++;
                    sDst = String.format("%s.%d", sfile, i);
                    pDst = Paths.get(sDst);
                }
                Files.move(path, pDst);
            }
            String stmp = inOrder();
            String sary[] = stmp.split("\\s+");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sary.length; i++) {
                if (i != 0) {
                    sb.append("," + sary[i]);
                } else {
                    sb.append(sary[i]);
                }
            }
            String sInOrder = sb.toString();

            stmp = preOrder();
            sary = stmp.split("\\s+");
            sb = new StringBuilder();
            for (int i = 0; i < sary.length; i++) {
                if (i != 0) {
                    sb.append("," + sary[i]);
                } else {
                    sb.append(sary[i]);
                }
            }
            String sPreOrder = sb.toString();

            BufferedWriter w = null;
            try {
                w = Files.newBufferedWriter(path);
                w.write("inorder:  " + sInOrder + "\n");
                w.write("preorder: " + sPreOrder + "\n");
                w.flush();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                w.close();
            }
        }

        public void loadFile(String sfile) throws Exception {
            /**
             * Read from file sfile. The first line is inorder. The second line
             * is preorder. ie:
             * 
             * in: 1,2,3,4 <-- inorder pre: 1,2,3,4 <-- preorder
             */
            Path path = Paths.get(sfile);
            if (Files.exists(path) == false) {
                return;
            }
            ArrayList<Integer> lInOrder = new ArrayList<>();
            ArrayList<Integer> lPreOrder = new ArrayList<>();

            BufferedReader r = null;
            try {
                r = Files.newBufferedReader(path);
                String s;
                int lineNum = 0;
                while ((s = r.readLine()) != null) {
                    String ary[] = s.trim().replace(" ", "").split(":");
                    if (ary.length != 2) {
                        break;
                    }
                    ary = ary[1].split(",");
                    for (int i = 0; i < ary.length; i++) {
                        // System.out.printf("i:%2d s:%s%n", i, ary[i]);
                        Integer ival = Integer.parseInt(ary[i]);
                        if (lineNum == 0) {
                            lInOrder.add(ival);
                        } else if (lineNum == 1) {
                            lPreOrder.add(ival);
                        }
                    }
                    lineNum++;
                }
                buildTreePreIn(lInOrder, lPreOrder);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                r.close();
            }
        }

        protected void printTree_(BSTNode n, HashMap<Integer, String> map,
            int level, int l, int m, int r, int hSpace) {
            if (n == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int space = level * hSpace;
            for (int i = 0; i < space; i++) {
                sb.append(" ");
            }
            sb.append(String.format("%5d", n.getV()));
            map.put(new Integer(m), sb.toString());
            int mid = (int) ((m + 1 + r) / 2);
            printTree_(n.getLC(), map, level + 1, m + 1, mid, r, hSpace);
            mid = (int) ((l + m - 1) / 2);
            printTree_(n.getRC(), map, level + 1, l, mid, m - 1, hSpace);
        }

        public int getDiameter() {
            if (root_ == null) {
                return 0;
            }
            ArrayList<BSTNode> ary = new ArrayList<BSTNode>();
            ary.add(root_);
            MutableInteger miDiam = new MutableInteger(0);
            MutableInteger miNode = new MutableInteger(0);
            int d = -1;
            try {
                d = getDiameter_(root_, miDiam, miNode);
                System.out.printf("getDiameter: %d @ node %d\n", d,
                    miNode.intValue());
            } catch (Exception e) {
            }
            return d;
        }

        protected int getDiameter_(BSTNode n, MutableInteger miDiam,
            MutableInteger miNode) throws Exception {
            if (n == null) {
                return 0;
            }
            int l = getMaxHeight_(n.getLC());
            int r = getMaxHeight_(n.getRC());
            int d = l + r + 1;
            int dl = getDiameter_(n.getLC(), miDiam, miNode);
            int dr = getDiameter_(n.getRC(), miDiam, miNode);
            int dmx = d; // top level diameter
            if (dl > dmx) { // left's diameter greater than top
                dmx = dl;
            } else if (dr > dmx) { // right's diameter greater than top
                dmx = dr;
            }
            if (dmx > miDiam.intValue()) { // max diameter anywhere
                miDiam.setValue(dmx);
                miNode.setValue(n.getV());
            }
            // System.out.printf("diam@n(%d): l/r=%d/%d, d/dl/dr=%d/%d/%d
            // dmx:%d\n",
            // n.getV(), l, r, d, dl, dr, dmx);
            return dmx;
        }

        public BSTNode LCALowestCommonAncestor(int v0, int v1) {
            return BST_LCA(root_, v0, v1);
        }

        public BSTNode BST_LCA(BSTNode n, int v0, int v1) {
            if (n == null) {
                return null;
            }
            if (v0 < n.v() && v1 < n.v()) {
                return BST_LCA(n.l(), v0, v1);
            }
            if (v0 > n.v() && v1 > n.v()) {
                return BST_LCA(n.r(), v0, v1);
            }
            return n;
        }

        class BSTContainer {
            BSTNode h_;
            BSTNode n_;

            public BSTContainer() {
                h_ = null;
                n_ = null;
            }
        }

        public void printBST2LL(BSTNode n, boolean isReverse) {
            while (n != null) {
                System.out.printf("%2d: ", n.v());
                if (n.l() == null) {
                    System.out.printf("l:-- ");
                } else {
                    System.out.printf("l:%2d ", n.l().v());
                }
                if (n.r() == null) {
                    System.out.printf("r:-- ");
                } else {
                    System.out.printf("r:%2d ", n.r().v());
                }
                System.out.printf("\n");
                if (isReverse) {
                    n = n.l();
                } else {
                    n = n.r();
                }
            }
        }

        public void tree2LL() {
            // bst2LL1();
            bst2LL2();
        }

        public void bst2LL2() {
            BSTNode t = bst2LL(root_, null);
            BSTNode h = null;
            while (t != null) {
                if (t.l() == null) {
                    h = t;
                    break;
                }
                t = t.l();
            }
            printBST2LL(h, false);
        }

        public void bst2LLComments() {
        }

        public BSTNode bst2LL(BSTNode n, BSTNode np) {
            if (n == null) {
                return np;
            }
            BSTNode l = bst2LL(n.l(), np);
            if (l != null) {
                l.r(n);
            }
            n.l(l);
            BSTNode r = bst2LL(n.r(), n);
            if (r == null) {
                return n;
            }
            return r;
        }

        public void bst2LL1() {
            BSTContainer c = new BSTContainer();
            // bst2LL(root_, c);
            printBST2LL(c.h_, true);
        }

        public void bst2LL1(BSTNode n, BSTContainer c) {
            if (n == null) {
                return;
            }
            bst2LL1(n.l(), c);
            if (c.h_ == null) {
                c.h_ = n;
                c.n_ = n;
            } else {
                c.n_.r(n);
                n.l(c.n_);
                c.n_ = n;
            }
            bst2LL1(n.r(), c);
        }

        public int numNodes() {
            return numNodes(root_);
        }

        public int numNodes(BSTNode n) {
            if (n == null) {
                return 0;
            }
            int l = numNodes(n.l());
            int r = numNodes(n.r());
            return (1 + l + r);
        }

        class BSTTests {
            public BSTTests() {
            }

            public void t00() {
                // 50
                // 25 75
                // 15 35 65 85
                // 10 20 30 70 80 90
                BSTNode n = new BSTNode(50);
                n.l(new BSTNode(25));
                n.l().l(new BSTNode(15));
                n.l().r(new BSTNode(35));
                n.l().l().l(new BSTNode(10));
                n.l().l().r(new BSTNode(20));
                n.l().r().l(new BSTNode(30));
                n.r(new BSTNode(75));
                n.r().l(new BSTNode(65));
                n.r().l().r(new BSTNode(70));
                n.r().r(new BSTNode(85));
                n.r().r().l(new BSTNode(80));
                n.r().r().r(new BSTNode(90));
                BST bst = new BST();
                bst.setTree(n);
                bst.printOrders();
                System.out.printf("------------------------------------\n");
                bst.printTree();
            }

            public void t01() {
                int ary[] = { 10, 5, 3, 2, 4, 7, 6, 8, 15, 13, 17, 16, 18 };
                for (int i = 0; i < ary.length; i++) {
                    insert(ary[i]);
                }
                String s = preOrder();
                System.out.printf("bst pre: %s\n", s);
                s = inOrder();
                System.out.printf("bst in:  %s\n", s);
                s = postOrder();
                System.out.printf("bst post:%s\n", s);
            }

            public void t02() {
                //
                // 8
                // 10 7
                // 12 9 4 6
                // 11 13 14 3 2 15 1 5
                //
                BSTNode n = new BSTNode(8);
                n.l(new BSTNode(10));
                n.l().l(new BSTNode(12));
                n.l().l().l(new BSTNode(11));
                n.l().l().r(new BSTNode(13));
                n.l().r(new BSTNode(9));
                n.l().r().l(new BSTNode(14));
                n.l().r().r(new BSTNode(3));
                n.r(new BSTNode(7));
                n.r().l(new BSTNode(4));
                n.r().l().l(new BSTNode(2));
                n.r().l().r(new BSTNode(15));
                n.r().r(new BSTNode(6));
                n.r().r().l(new BSTNode(1));
                n.r().r().r(new BSTNode(5));
                setTree(n);
                printOrders();
                String sPre = traverseOrder(1);
                String sIn = traverseOrder(2);
                String saryPre[] = sPre.trim().split("\\s+");
                String saryIn[] = sIn.trim().split("\\s+");
                int iaryPre[] = new int[saryPre.length];
                int iaryIn[] = new int[saryPre.length];

                for (int i = 0; i < iaryPre.length; i++) {
                    // System.out.printf("i:%d s:%s\n", i, saryPre[i]);
                    iaryPre[i] = Integer.valueOf(saryPre[i]).intValue();
                    iaryIn[i] = Integer.valueOf(saryIn[i]).intValue();
                }
                BST bstNew = new BST();
                bstNew.buildTreePreIn(iaryIn, iaryPre);
                System.out.printf("\n");
                bstNew.printOrders();
            }

            public void t03() {
                BST bst = new BST();
                int ary[] = { 40, 20, 60, 10, 30, 50, 70 };
                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                }
                String s = bst.traverseOrder(1);
                System.out.printf("bst pre: %s\n", s);
                s = bst.traverseOrder(0);
                System.out.printf("bst lvl: %s\n", s);
                System.out.printf("height:%d\n", bst.getMaxHeight());
            }

            public void t04() {
                BST bst = new BST();
                int ary[] = { 40, 20, 60, 10, 30, 50, 70 };
                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                }
                bst.printTree();
                System.out.printf("-------------\n");
                bst.tree2LL();
            }

            public void t05() {
                BST bst = new BST();
                int sz = 20;
                int ary[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    ary[i] = i;
                }
                Utils utils = new Utils();
                utils.shuffle(ary);
                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                }
                bst.printTree();
                System.out.printf("-------------\n");
                bst.tree2LL();
            }

            public void t06() {
                BST bst = new BST();
                int sz = 10;
                int ary[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    ary[i] = i;
                }
                utils_.shuffle(ary);
                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < ary.length; i++) {
                    sb.append(Integer.toString(ary[i]) + " ");
                }
                String s = sb.toString();
                System.out.printf("tst order: %s%n", s);
                s = bst.inOrder();
                System.out.printf("in order:  %s%n", s);
                s = bst.preOrder();
                System.out.printf("pre order: %s%n", s);
                String sfile = "out/bst.txt";
                try {
                    bst.saveFile(sfile);
                    bst.loadFile(sfile);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.printf("---------------%n");
                s = bst.inOrder();
                System.out.printf("in order:  %s%n", s);
                s = bst.preOrder();
                System.out.printf("pre order: %s%n", s);
            }

            public void t07() throws Exception {
                boolean isPrint = false;
                int sz = 100;
                boolean res = true;
                for (int i = 0; i < 100 && res == true; i++) {
                    res = t07(sz, isPrint);
                    if (res == false) {
                        System.out.println("test failed");
                    }
                }
                if (res == true) {
                    System.out.println("all tests passed");
                }
            }

            public boolean t07(int sz, boolean isPrint) throws Exception {
                BST bst = new BST();
                int ary[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    ary[i] = i;
                }
                utils_.shuffle(ary);
                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                }
                String sPre = bst.preOrder();
                String sIn = bst.inOrder();
                String sPst = bst.postOrder();
                if (isPrint == true) {
                    System.out.printf("ref in order:  %s%n", sIn);
                    System.out.printf("ref pre order: %s%n", sPre);
                    System.out.printf("ref pst order: %s%n", sPst);
                }

                String atmp[] = sPre.split("\\s+");
                ArrayList<Integer> lpo = new ArrayList<>();
                for (String s : atmp) {
                    lpo.add(Integer.parseInt(s));
                }
                atmp = sIn.split("\\s+");
                ArrayList<Integer> lio = new ArrayList<>();
                for (String s : atmp) {
                    lio.add(Integer.parseInt(s));
                }
                bst.buildTreePreIn(lio, lpo);

                if (isPrint == true) {
                    System.out.printf("tst in order:  %s%n", bst.inOrder());
                    System.out.printf("tst pre order: %s%n", bst.preOrder());
                    System.out.printf("tst pst order: %s%n", bst.postOrder());
                }

                boolean res;

                res = sPre.equals(bst.preOrder());
                assert res : String.format("preOrder mismatch: ref:%s tst:%s%n",
                    sPre, bst.preOrder());

                res = sIn.equals(bst.inOrder());
                assert res : String.format("inOrder  mismatch: ref:%s tst:%s%n",
                    sIn, bst.inOrder());

                res = sPst.equals(bst.postOrder());
                assert res : String.format("pstOrder mismatch: ref:%s tst:%s%n",
                    sPst, bst.postOrder());
                return true;
            }

            public void t08() throws Exception {
                int sz = 100;
                boolean doPrint = false;
                t08(sz, doPrint);
            }

            public boolean t08(int sz, boolean isPrint) throws Exception {
                BST bst = new BST();
                int ary[] = new int[sz];

                for (int i = 0; i < sz; i++) {
                    ary[i] = i;
                }

                utils_.shuffle(ary);

                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                }

                String sPre = bst.preOrder();
                String sIn = bst.inOrder();
                String sPst = bst.postOrder();

                if (isPrint == true) {
                    System.out.printf("ref in order:  %s%n", sIn);
                    System.out.printf("ref pre order: %s%n", sPre);
                    System.out.printf("ref pst order: %s%n", sPst);
                }

                String atmp[];

                atmp = sPst.split("\\s+");
                ArrayList<Integer> lpo = new ArrayList<>();
                for (String s : atmp) {
                    lpo.add(Integer.parseInt(s));
                }

                atmp = sIn.split("\\s+");
                ArrayList<Integer> lio = new ArrayList<>();
                for (String s : atmp) {
                    lio.add(Integer.parseInt(s));
                }

                bst.buildTreePostIn(lio, lpo);

                if (isPrint == true) {
                    System.out.printf("tst in order:  %s%n", bst.inOrder());
                    System.out.printf("tst pre order: %s%n", bst.preOrder());
                    System.out.printf("tst pst order: %s%n", bst.postOrder());
                }

                boolean res;

                res = sPre.equals(bst.preOrder());
                assert res : String.format("preOrder mismatch: ref:%s tst:%s%n",
                    sPre, bst.preOrder());

                res = sIn.equals(bst.inOrder());
                assert res : String.format("inOrder  mismatch: ref:%s tst:%s%n",
                    sIn, bst.inOrder());

                res = sPst.equals(bst.postOrder());
                assert res : String.format("pstOrder mismatch: ref:%s tst:%s%n",
                    sPst, bst.postOrder());
                return true;
            }

            public void test() {
                try {
                    t08();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void test() {
            BSTTests t = new BSTTests();
            t.test();
        }
    }
    class RedBlackTree extends BST {
        static final boolean RED = true;
        static final boolean BLACK = false;

        class Node {
            int id_;
            int key_;
            int value_;
            Node left_, right_;
            int N_;
            boolean color_;

            public Node(int key, int val, int N, boolean color) {
                key_ = key;
                value_ = val;
                left_ = null;
                right_ = null;
                N_ = N;
                color_ = color;
                id_ = getGID(true);
            }

            public void printInfo() {
                System.out.printf("%2d:2d:2d:%s:%2d:%2d", id_, key_, value_,
                    (color_ == RED) ? "red" : "blk",
                    (left_ == null) ? -1 : left_.id_,
                    (right_ == null) ? -1 : right_.id_);
            }
        }

        public Node root_;

        public RedBlackTree() {
            root_ = null;
            setGID(0);
        }

        public void comments() {
            // RedBlackTree encodes 2-3 tree
            // red links bind 2 2-nodes to represent 3-nodes, or siblings
            // blank links bind 2-3 tree parent to child
            //
            // red links lean left
            // no node has 2 red links connected to it
            // tree has perfect black balance, such that every link from
            // root to null link has same number of black links.
            //
            //
            //
            //
            //
            //
            //
        }

        public void printTree() {
            printTree(root_);
        }

        public void printTree(Node n) {
            if (n == null) {
                return;
            }
            System.out.printf("ID:K:V:COLOR:LID:RID\n");
            ArrayList<Node> l0 = new ArrayList<Node>();
            ArrayList<Node> l1 = new ArrayList<Node>();
            l0.add(n);
            while (l0.size() != 0 || l1.size() != 0) {
                while (l0.size() != 0) {
                    Node t = l0.remove(0);
                    if (t.left_ != null) {
                        l1.add(t.left_);
                    }
                    if (t.right_ != null) {
                        l1.add(t.right_);
                    }
                    t.printInfo();
                    System.out.printf("\t");
                }
                System.out.printf("\n");
                while (l1.size() != 0) {
                    Node t = l1.remove(0);
                    if (t.left_ != null) {
                        l0.add(t.left_);
                    }
                    if (t.right_ != null) {
                        l0.add(t.right_);
                    }
                    t.printInfo();
                    System.out.printf("\t");
                }
                System.out.printf("\n");
            }
        }

        private boolean isRed(Node x) {
            if (x == null) {
                return false;
            }
            return x.color_ == RED;
        }

        public int size(Node h) {
            if (h == null) {
                return 0;
            }
            return 1 + size(h.left_) + size(h.right_);
        }

        public Node rotateLeft(Node h) {
            //
            // h x
            // 3 x => h 2
            // 1 2 3 1
            //
            Node x = h.right_;
            h.right_ = x.left_;
            x.left_ = h;
            x.color_ = h.color_;
            h.color_ = RED;
            x.N_ = h.N_;
            h.N_ = size(h);
            return x;
        }

        public Node rotateRight(Node h) {
            //
            // h x
            // x 3 => 1 h
            // 1 2 2 3
            //
            Node x = h.left_;
            h.left_ = x.right_;
            x.right_ = h;
            x.color_ = h.color_;
            h.color_ = RED;
            x.N_ = h.N_;
            h.N_ = size(h);
            return x;
        }

        public void flipColors(Node h) {
            h.color_ = RED;
            h.left_.color_ = BLACK;
            h.right_.color_ = BLACK;
        }

        public void put(int k, int v) {
            root_ = put(root_, k, v);
            root_.color_ = BLACK;
        }

        public Node put(Node h, int k, int v) {
            if (h == null) {
                return new Node(k, v, 1, RED);
            }
            if (k < h.key_) {
                h.left_ = put(h.left_, k, v);
            } else if (k > h.key_) {
                h.right_ = put(h.right_, k, v);
            } else {
                h.value_ = v;
            }
            if (isRed(h.right_) && !isRed(h.left_)) {
                h = rotateLeft(h);
            }
            if (isRed(h.left_) && isRed(h.left_.left_)) {
                h = rotateRight(h);
            }
            if (isRed(h.left_) && isRed(h.right_)) {
                flipColors(h);
            }
            h.N_ = size(h.left_) + size(h.right_) + 1;
            return h;
        }

        class BSTTests {
            public BSTTests() {
            }

            public void t00() {
                BST bst = new BST();
                BSTNode n = new BSTNode(40);
                n.l_ = new BSTNode(20);
                n.r_ = new BSTNode(60);
                n.l_.l_ = new BSTNode(10);
                n.l_.r_ = new BSTNode(30);
                n.r_.l_ = new BSTNode(50);
                n.r_.r_ = new BSTNode(70);
                n.l_.l_.l_ = new BSTNode(5);
                n.l_.l_.r_ = new BSTNode(15);
                n.l_.r_.l_ = new BSTNode(25);
                n.l_.r_.r_ = new BSTNode(35);
                n.r_.l_.l_ = new BSTNode(45);
                n.r_.l_.r_ = new BSTNode(55);
                n.r_.r_.l_ = new BSTNode(65);
                n.r_.r_.r_ = new BSTNode(75);
                try {
                    bst.setTree(n);
                    bst.printTree();
                    System.out.printf("-------- delete 60\n");
                    bst.delete(60);
                    bst.printTree();
                    System.out.printf("-------- delete 40\n");
                    bst.delete(40);
                    bst.printTree();
                    System.out.printf("-------- delete 20\n");
                    bst.delete(20);
                    bst.printTree();
                    System.out.printf("-------- delete everything except 75\n");
                    bst.delete(10);
                    bst.delete(30);
                    bst.delete(50);
                    bst.delete(70);
                    bst.delete(5);
                    bst.delete(15);
                    bst.delete(25);
                    bst.delete(35);
                    bst.delete(45);
                    bst.delete(55);
                    bst.delete(65);
                    bst.printTree();
                    System.out.printf("-------- delete 75\n");
                    bst.delete(75);
                    bst.printTree();
                } catch (Exception e) {
                }
            }

            public void t01() {
                BST bst = new BST();
                BSTNode n = new BSTNode(40);
                n.l_ = new BSTNode(10);
                n.r_ = new BSTNode(50);
                n.r_.r_ = new BSTNode(51);
                n.r_.l_ = new BSTNode(52);
                n.r_.l_.l_ = new BSTNode(53);
                n.r_.l_.l_.l_ = new BSTNode(54);
                n.r_.l_.l_.l_.l_ = new BSTNode(55);
                n.r_.l_.l_.l_.l_.l_ = new BSTNode(56);
                n.r_.l_.l_.l_.l_.l_.l_ = new BSTNode(61);
                n.r_.l_.r_ = new BSTNode(57);
                n.r_.l_.r_.r_ = new BSTNode(58);
                n.r_.l_.r_.r_.r_ = new BSTNode(59);
                n.r_.l_.r_.r_.r_.r_ = new BSTNode(60);
                n.r_.l_.r_.r_.r_.r_.r_ = new BSTNode(61);
                //
                // 40
                // 10 50
                // 52 51
                // 53 57
                // 54 58
                // 55 59
                // 56 60
                // 61 61
                //
                bst.setTree(n);
                bst.getDiameter();
            }

            public void test() {
            }
        }

        public void test() {
            BSTTests t = new BSTTests();
            t.test();
        }
    }
    class AVL extends BST {
        public AVL() {
            root_ = null;
        }

        public void comment() {
        }

        public BSTNode rotateLR(BSTNode n) {
            if (n == null)
                return n;
            BSTNode nl = n.getLC();
            BSTNode t = null;
            try {
                t = n.getLC().getRC();
            } catch (Exception e) {
                t = null;
            }
            n.setLC(t);
            try {
                t = n.getLC().getLC();
            } catch (Exception e) {
                t = null;
            }
            nl.setRC(t);
            try {
                n.getLC().setLC(nl);
            } catch (Exception e) {
            }
            return n;
        }

        public BSTNode rotateLL(BSTNode n) {
            if (n == null) {
                return n;
            }
            BSTNode nl = n.getLC();
            BSTNode t = null;
            if(nl != null) {
                t = nl.getRC();
            }
            n.setLC(t);
            if(nl != null) {
                nl.setRC(n);
            }
            n = nl;
            return n;
        }

        public BSTNode rotateRL(BSTNode n) {
            if (n == null) {
                return n;
            }
            BSTNode nr = n.getRC();
            BSTNode t = null;
            if(nr != null) {
                t = nr.getLC();
            }
            n.setRC(t);
            t = null;
            if(nr != null) {
                t = n.getRC().getRC();
            }
            nr.setLC(t);
            if(nr != null) {
                n.getRC().setRC(nr);
            }
            return n;
        }

        public BSTNode rotateRR(BSTNode n) {
            if (n == null)
                return n;
            BSTNode nr = n.getRC();
            BSTNode t = null;
            try {
                t = n.getRC().getLC();
            } catch (Exception e) {
                t = null;
            }
            n.setRC(t);
            try {
                nr.setLC(n);
            } catch (Exception e) {
            }
            n = nr;
            return n;
        }

        protected int balanceFactor(BSTNode n) {
            // if ret > 0, right is higher,
            // else if ret < 0, left is higher
            if (n == null) {
                return 0;
            }
            int hl = getHeight(n.getLC());
            int hr = getHeight(n.getRC());
            return (hr - hl);
        }

        protected BSTNode rotate(BSTNode n) {
            if (n == null) {
                return n;
            }
            int heightDiff = balanceFactor(n);
            if (heightDiff < -1) {
                int hdiff = balanceFactor(n.getLC());
                if (hdiff > 0) {
                    n = rotateLR(n);
                }
                n = rotateLL(n);
            } else if (heightDiff > 1) {
                int hdiff = balanceFactor(n.getRC());
                if (hdiff < 0) {
                    n = rotateRL(n);
                }
                n = rotateRR(n);
            }
            return n;
        }

        public void insert(int v) {
            if (root_ == null) {
                root_ = new BSTNode(v);
            } else {
                root_ = insert(root_, v);
            }
        }

        protected BSTNode insert(BSTNode n, int v) {
            if (n == null) {
                return new BSTNode(v);
            }
            if (n.v() > v) {
                n.setLC(insert(n.getLC(), v));
            } else if (n.v() < v) {
                n.setRC(insert(n.getRC(), v));
            }
            n = rotate(n);
            return n;
        }

        public boolean isBalancedCheck(BSTNode n) {
            int result = balanceFactor(n);
            if (result < -1 || result > 1) {
                return false;
            }
            return true;
        }

        public boolean delete(int v) {
            return deleteBool(null, root_, v);
        }

        protected BSTNode delete(BSTNode n, int v) {
            if (n == null) {
                return null;
            }
            return null;
        }

        protected boolean deleteBool(BSTNode p, BSTNode c, int v) {
            if (c == null) {
                return false;
            }
            boolean res = false;
            if (c.v() == v) {
                res = true;
                MutableInteger status = new MutableInteger(1);
                if (p == null) {
                    // System.out.printf("deleteBool root delete\n");
                    root_ = delete_(v, c, status);
                    root_ = rotate(root_);
                } else {
                    if (p.l() == c) {
                        // System.out.printf("deleteBool p.l delete\n");
                        p.l(delete_(v, c, status));
                        p.l(rotate(p.l()));
                    } else {
                        // System.out.printf("deleteBool p.r delete\n");
                        p.r(delete_(v, c, status));
                        p.r(rotate(p.r()));
                    }
                }
            } else if (c.v() < v) {
                // System.out.printf("deleteBool recurse c.v(%d) < v(%d)\n",
                // c.v(), v);
                res = deleteBool(c, c.r(), v);
                if (p == null) {
                    root_ = rotate(c);
                } else if (p.l() == c) {
                    // System.out.printf("deleteBool c.v(%d) < v(%d) p.l\n",
                    // c.v(), v);
                    p.l(rotate(c));
                } else {
                    // System.out.printf("deleteBool c.v(%d) < v(%d) p.r\n",
                    // c.v(), v);
                    p.r(rotate(c));
                }
            } else {
                // System.out.printf("deleteBool recurse c.v(%d) > v(%d)\n",
                // c.v(), v);
                res = deleteBool(c, c.l(), v);
                if (p == null) {
                    root_ = rotate(c);
                } else if (p.l() == c) {
                    // System.out.printf("deleteBool c.v(%d) > v(%d) p.l\n",
                    // c.v(), v);
                    p.l(rotate(c));
                } else {
                    // System.out.printf("deleteBool c.v(%d) > v(%d) p.r\n",
                    // c.v(), v);
                    p.r(rotate(c));
                }
            }
            return res;
        }

        class TestAVL {
            public TestAVL() {
            }

            public void t01() {
                AVL avl = new AVL();
                int sz = 500;
                int ary[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    ary[i] = i + 1;
                }
                utils_.shuffle(ary);

                if (!t43_1(ary, avl, false)) {
                    return;
                }

                utils_.shuffle(ary);

                if (!t43_2(ary, avl, false)) {
                    return;
                }
                System.out.printf("t43 pass\n");
            }

            public void t02() {
                AVL avl = new AVL();
                int ary[] = { 63, 82, 78, 12, 21, 80, 29, 26, 25, 70 };

                if (!t43_1(ary, avl, true)) {
                    return;
                }

                avl.printTree();

                utils_.shuffle(ary);

                if (!t43_2(ary, avl, true)) {
                    return;
                }
                System.out.printf("t44 pass\n");
            }

            public void t03() {
                BST bst = new BST();
                int sz = 50;
                int ary[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    ary[i] = i + 1;
                }
                utils_.shuffle(ary);

                if (!t45_insert(ary, bst)) {
                    return;
                }
                if (!t45_delete(ary, bst)) {
                    return;
                }
                System.out.printf("t45 pass\n");

            }

            private boolean t43_1(int ary[], AVL avl, boolean doCheck) {
                System.out.printf("now inserting %d entries\n", ary.length);
                for (int i = 0; i < ary.length; i++) {
                    // System.out.printf("adding i:%d v:%d\n", i, ary[i]);
                    avl.insert(ary[i]);
                    if (doCheck) {
                        BSTNode n = avl.getRoot();
                        if (!avl.isBalancedCheck(n)) {
                            System.out.printf("START ERROR PRINTING-----\n");
                            avl.printTree();
                            System.out
                                .printf("err encountered with #%d insert\n", i);
                            return false;
                        }
                    }
                }
                int numNodes = avl.numNodes();
                if (numNodes != ary.length) {
                    System.out.printf("err: numNodes after insert %d != %d\n",
                        numNodes, ary.length);
                    return false;
                }
                return true;
            }

            private boolean t43_2(int ary[], AVL avl, boolean doCheck) {
                System.out.printf("now deleting %d entries\n", ary.length);
                int numRemaining = ary.length;
                for (int i = 0; i < ary.length; i++) {
                    // System.out.printf("delete i:%d v:%d\n", i, ary[i]);
                    avl.delete(ary[i]);
                    // avl.printTree();
                    BSTNode n = avl.getRoot();
                    if (doCheck) {
                        if (!avl.isBalancedCheck(n)) {
                            System.out.printf("START ERROR PRINTING-----\n");
                            avl.printTree();
                            System.out.printf(
                                "err encountered with #%d delete val:%d\n", i,
                                ary[i]);
                            return false;
                        }
                        numRemaining--;
                        int numNodes = avl.numNodes();
                        if (numNodes != numRemaining) {
                            System.out.printf("START ERROR PRINTING-----\n");
                            avl.printTree();
                            System.out.printf(
                                "err: i:%d after delete numNodes %d != %d\n", i,
                                numNodes, numRemaining);
                            return false;
                        }
                    }
                }
                return true;
            }

            private boolean t45_insert(int ary[], BST bst) {
                System.out.printf("insert %d entries\n", ary.length);
                int numNodes;
                int numInserted = 0;
                for (int i = 0; i < ary.length; i++) {
                    bst.insert(ary[i]);
                    numNodes = bst.numNodes();
                    numInserted++;
                    if (numNodes != numInserted) {
                        System.out.printf(
                            "err: numNodes after insert %d != exp %d for v=%d\n",
                            numNodes, numInserted,
                            ary[i]);
                        bst.printTree();
                        return false;
                    }
                }
                return true;
            }

            private boolean t45_delete(int ary[], BST bst) {
                System.out.printf("delete %d entries\n", ary.length);
                int numNodes;
                int numRemain = ary.length;
                for (int i = 0; i < ary.length; i++) {
                    try {
                        bst.delete(ary[i]);
                    } catch (Exception e) {
                    }
                    numNodes = bst.numNodes();
                    numRemain--;
                    if (numNodes != numRemain) {
                        System.out.printf(
                            "err: numNodes after delete %d != exp %d for v=%d\n",
                            numNodes, numRemain,
                            ary[i]);
                        bst.printTree();
                        return false;
                    }
                }
                return true;
            }

            public void test() {
            }
        }

        public void test() {
        }
    }
    class BuilderPatternTest {
        private int a_;
        private int b_;
        private int c_;
        private StringBuilder d_;

        public BuilderPatternTest() {
            a_ = -1;
            b_ = -1;
            c_ = -1;
            d_ = new StringBuilder();
        }

        public BuilderPatternTest a(int a) {
            a_ = a;
            return this;
        }

        public BuilderPatternTest b(int b) {
            b_ = b;
            return this;
        }

        public BuilderPatternTest c(int c) {
            c_ = c;
            return this;
        }

        public BuilderPatternTest d(String d) {
            d_.append(d);
            return this;
        }

        public void print() {
            System.out.printf("BPT: a:b:c:d=%d:%d:%d:%s\n", a_, b_, c_,
                d_.toString());
        }
        // public static class MyBuilder {
        // }
    }
    class GraphClass {

        public GraphClass() {
            GID_.set(0);
        }

        public int getGID() {
            return GID_.get();
        }

        public int getGID(boolean inc) {
            if (inc) {
                return GID_.getAndAdd(1);
            }
            return getGID();
        }

        public void setGID(int v) {
            GID_.set(v);
        }

        public GraphObjectType2 loadGraphFile() {
            GraphObjectType2 g = null;
            try {
                String spath = "out/graph.txt";
                g = loadGraphFile(spath);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return g;
        }

        public GraphObjectType2 loadGraphFile(String spath) throws Exception {
            /**
             * Create new GraphObjectType2 obj by loading from file, which has
             * following format:
             * 
             * nodeSrcId,nodeDstId,edgeWeight\n nodeSrcId,nodeDstId,edgeWeight\n
             * nodeSrcId,nodeDstId,edgeWeight\n
             * 
             */
            Path path = Paths.get(spath);
            if (Files.exists(path) == false) {
                return null;
            }
            GraphObjectType2 g = new GraphObjectType2();
            BufferedReader r = null;
            try {
                r = Files.newBufferedReader(path);
                String s;
                HashSet<Integer> set = new HashSet<>();
                HashMap<Integer, HashMap<Integer, Integer>> m = new HashMap<>();
                boolean res = false;

                // read each src,dst,weight tuple and put into set and map
                while ((s = r.readLine()) != null) {
                    String ary[] = s.trim().split(",");
                    res = ary.length == 3;
                    assert res : ary.length;
                    Integer srcId = Integer.parseInt(ary[0]);
                    Integer dstId = Integer.parseInt(ary[1]);
                    Integer weight = Integer.parseInt(ary[2]);
                    set.add(srcId);
                    set.add(dstId);
                    if (m.get(srcId) == null) {
                        m.put(srcId, new HashMap<Integer, Integer>());
                    }
                    m.get(srcId).put(dstId, weight);
                }

                // for each node in set, create a node
                for (Integer i : set) {
                    GraphNodeType2 n = new GraphNodeType2(i);
                    g.addNode(n);
                }

                // create the edges
                boolean isDirected = true;
                for (Map.Entry<Integer, HashMap<Integer, Integer>> e : m
                    .entrySet()) {
                    GraphNodeType2 nSrc = g.getNode(e.getKey());
                    res = nSrc != null;
                    assert res;
                    for (Map.Entry<Integer, Integer> ew : e.getValue()
                        .entrySet()) {
                        GraphNodeType2 nDst = g.getNode(ew.getKey());
                        Integer weight = ew.getValue();
                        res = nDst != null;
                        assert res;
                        g.addEdge(nSrc, nDst, isDirected, weight.intValue());
                    }
                }
            } catch (Exception e) {
                throw e;
            } finally {
                r.close();
            }
            return g;
        }

        public void writeGraphFile(java.util.List<String> lGraphFormatted) {
            String spath = "out/graph.txt";
            try {
                writeGraphFile(lGraphFormatted, spath);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void writeGraphFile(java.util.List<String> lGraph, String spath)
            throws Exception {
            /**
             * Write list of string to file. The list is:
             * 
             * nodeSrcId,nodeDstId,edgeWeight\n nodeSrcId,nodeDstId,edgeWeight\n
             * nodeSrcId,nodeDstId,edgeWeight\n
             *
             */
            Path path = Paths.get(spath);

            // move existing file to number appended file
            if (Files.exists(path) == true) {
                int i = 0;
                String sDst = String.format("%s.%d", spath, i);
                Path pathDst = Paths.get(sDst);
                while (Files.exists(pathDst) == true) {
                    i++;
                    sDst = String.format("%s.%d", spath, i);
                    pathDst = Paths.get(sDst);
                }
                Files.move(path, pathDst);
            }

            // write the file
            BufferedWriter w = null;
            try {
                w = Files.newBufferedWriter(path);
                for (String s : lGraph) {
                    w.write(s);
                }
                w.flush();
            } finally {
                w.close();
            }
        }

        Utils utils_ = new Utils();

        abstract class GraphNode {
            public final Integer id_;

            public GraphNode() {
                int id = getGID(true);
                id_ = new Integer(id);
            }

            public GraphNode(Integer id) {
                id_ = id;
            }

            public Integer getId() {
                return id_;
            }

            public void printInfo() {
                printInfo(null);
            }

            public abstract void printInfo(String msg);
        }

        class GraphNodeType1 extends GraphNode {
            boolean isDirected_;
            HashMap<Integer, GraphNodeType1> mapIB_;
            HashMap<Integer, GraphNodeType1> mapOB_;

            public GraphNodeType1() {
                isDirected_ = false;
                mapIB_ = new HashMap<>();
                mapOB_ = new HashMap<>();
            }

            public boolean getIsDirected() {
                return isDirected_;
            }

            public void setIsDirected(boolean isDirected) {
                isDirected_ = isDirected;
            }

            public void addNode(GraphNodeType1 n) {
                if (n == null) {
                    return;
                }
                Integer id = n.getId();
                if (mapOB_.containsKey(id)) {
                    return;
                }
                mapOB_.put(id, n);
                if (isDirected_ == false) {
                    n.addNode(this);
                }
                n.addNodeInbound(this);
            }

            public void addNodeInbound(GraphNodeType1 n) {
                if (n == null) {
                    return;
                }
                Integer id = n.getId();
                if (mapIB_.containsKey(id)) {
                    return;
                }
                mapIB_.put(id, n);
                if (isDirected_ == false) {
                    n.addNodeInbound(this);
                }
            }

            public Iterator<Map.Entry<Integer, GraphNodeType1>> iterator() {
                return mapOB_.entrySet().iterator();
            }

            public void printInfo(String msg) {
                StringBuilder sb = new StringBuilder();
                if (msg != null) {
                    sb.append(msg + " ");
                }
                sb.append("GraphNode: ");
                sb.append(
                    String.format("%3d : isDirected: %d%n", id_, isDirected_));
                sb.append("    OUTBOUND: ");
                for (Map.Entry<Integer, GraphNodeType1> e : mapOB_.entrySet()) {
                    sb.append(String.format("%3d ", e.getKey()));
                }
                sb.append("%n");
                sb.append("    INBOUND:  ");
                for (Integer k : mapIB_.keySet()) {
                    sb.append(String.format("%3d ", k));
                }
                sb.append("%n");
                System.out.printf("%s", sb.toString());
            }
        }

        class GraphObjectType1 {
        }

        class GraphNodeType2 extends GraphNode {
            public GraphNodeType2() {
                super();
            }

            public GraphNodeType2(Integer id) {
                super(id);
            }

            public void printInfo(String msg) {
                if (msg != null) {
                    System.out.printf(
                        String.format("%s GraphNodeType2:%3d%n", msg, id_));
                    return;
                }
                System.out.printf(String.format("GraphNodeType2:%3d%n", id_));
            }
        }

        abstract class Edge {
            protected int weight_;

            public Edge setWeight(int w) {
                weight_ = w;
                return this;
            }

            public int getWeight() {
                return weight_;
            }

            public void printInfo() {
                printInfo(null);
            }

            public abstract void printInfo(String msg);
        }

        class EdgeType2 extends Edge {
            protected GraphNodeType2 nSrc_;
            protected GraphNodeType2 nDst_;

            public EdgeType2(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                int weight) {
                nSrc_ = nSrc;
                nDst_ = nDst;
                weight_ = weight;
            }

            public EdgeType2(GraphNodeType2 nSrc, GraphNodeType2 nDst) {
                this(nSrc, nDst, 1);
            }

            public EdgeType2 setNodeSrc(GraphNodeType2 n) {
                nSrc_ = n;
                return this;
            }

            public EdgeType2 setNodeDst(GraphNodeType2 n) {
                nDst_ = n;
                return this;
            }

            public GraphNodeType2 getNodeSrc() {
                return nSrc_;
            }

            public GraphNodeType2 getNodeDst() {
                return nDst_;
            }

            public void printInfo(String msg) {
                StringBuilder sb = new StringBuilder();
                if (msg != null) {
                    sb.append(msg + " ");
                }
                sb.append(String.format("EdgeType2 src:%3d dst:%3d w:%d",
                    nSrc_.getId(), nDst_.getId(), weight_));
                System.out.println(sb.toString());
            }
        }

        class GraphObjectType2 {
            HashMap<Integer, GraphNodeType2> mNodes_ = new HashMap<>();
            ArrayList<GraphNodeType2> lNodes_ = new ArrayList<>();
            HashMap<Integer, HashMap<Integer, EdgeType2>> mEdgeIn_ = new HashMap<>();
            HashMap<Integer, HashMap<Integer, EdgeType2>> mEdgeOut_ = new HashMap<>();
            HashMap<GraphNodeType2, HashSet<EdgeType2>> mEdgeInNodes_ = new HashMap<>();
            HashMap<GraphNodeType2, HashSet<EdgeType2>> mEdgeOutNodes_ = new HashMap<>();

            public void addNode(GraphNodeType2 n) {
                if (n == null) {
                    return;
                }
                if (mNodes_.containsKey(n.getId())) {
                    return;
                }
                mNodes_.put(n.getId(), n);
                lNodes_.add(n);
            }

            public ArrayList<GraphNodeType2> getNodesAll() {
                return lNodes_;
            }

            public ArrayList<GraphNodeType2> getNodeHeads() {
                /**
                 * returns list of all nodes with no incoming edge
                 */
                ArrayList<GraphNodeType2> l = new ArrayList<>();
                for (GraphNodeType2 n : mNodes_.values()) {
                    if (mEdgeInNodes_.get(n) == null) {
                        l.add(n);
                    } else if (mEdgeInNodes_.get(n).size() == 0) {
                        l.add(n);
                    }
                }
                return l;
            }

            public ArrayList<GraphNodeType2> getNodeTails() {
                /**
                 * returns list of all nodes with no outgoing edge
                 */
                ArrayList<GraphNodeType2> l = new ArrayList<>();
                for (GraphNodeType2 n : mNodes_.values()) {
                    if (mEdgeOutNodes_.get(n) == null) {
                        l.add(n);
                    } else if (mEdgeOutNodes_.get(n).size() == 0) {
                        l.add(n);
                    }
                }
                return l;
            }

            public GraphNodeType2 getNode(Integer id) {
                return mNodes_.get(id);
            }

            public GraphNodeType2 getNode(int id) {
                Integer i = new Integer(id);
                return getNode(i);
            }

            public HashMap<Integer, HashMap<Integer, EdgeType2>> getEdgesAllMapofMap(
                EDGE_DIR dir) {
                if (dir == EDGE_DIR.IBOUND) {
                    return mEdgeIn_;
                }
                return mEdgeOut_;
            }

            public HashMap<GraphNodeType2, HashSet<EdgeType2>> getEdgesAll(
                EDGE_DIR dir) {
                if (dir == EDGE_DIR.IBOUND) {
                    return mEdgeInNodes_;
                }
                return mEdgeOutNodes_;
            }

            public ArrayList<EdgeType2> getEdges(GraphNodeType2 n,
                EDGE_DIR dir) {
                ArrayList<EdgeType2> list = new ArrayList<>();
                if (n == null) {
                    return list;
                }

                Integer id = n.getId();
                if (dir == EDGE_DIR.IBOUND || dir == EDGE_DIR.BIDIR) {
                    if (mEdgeIn_.containsKey(id) == false) {
                        return list;
                    }
                    HashMap<Integer, EdgeType2> m = mEdgeIn_.get(id);
                    for (EdgeType2 e : m.values()) {
                        list.add(e);
                    }
                } else if (dir == EDGE_DIR.OBOUND) {
                    if (mEdgeOut_.containsKey(id) == false) {
                        return list;
                    }
                    HashMap<Integer, EdgeType2> m = mEdgeOut_.get(id);
                    for (EdgeType2 e : m.values()) {
                        list.add(e);
                    }
                }
                return list;
            }

            public ArrayList<EdgeType2> getEdges(Integer id, EDGE_DIR dir) {
                GraphNodeType2 n = getNode(id);
                return getEdges(n, dir);
            }

            public void addNodeAndEdge(GraphNodeType2 n, GraphNodeType2 nDst,
                boolean isDirected) {
                addNode(n);
                addEdge(n, nDst, isDirected);
            }

            public Iterator<GraphNodeType2> iteratorNodes() {
                return mNodes_.values().iterator();
            }

            private EdgeType2 addEdgeToMap(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                int weight) {
                Integer idSrc = nSrc.getId();
                Integer idDst = nDst.getId();
                EdgeType2 edge = null;

                if (mEdgeOut_.containsKey(idSrc) == false) {
                    mEdgeOut_.put(idSrc, new HashMap<Integer, EdgeType2>());
                    mEdgeOutNodes_.put(nSrc, new HashSet<EdgeType2>());
                }

                if (mEdgeOut_.get(idSrc).containsKey(idDst) == false) {
                    edge = new EdgeType2(nSrc, nDst, weight);
                    mEdgeOut_.get(idSrc).put(idDst, edge);
                    mEdgeOutNodes_.get(nSrc).add(edge);
                } else {
                    edge = mEdgeOut_.get(idSrc).get(idDst);
                }

                if (mEdgeIn_.containsKey(idDst) == false) {
                    mEdgeIn_.put(idDst, new HashMap<Integer, EdgeType2>());
                    mEdgeInNodes_.put(nDst, new HashSet<EdgeType2>());
                }

                if (mEdgeIn_.get(idDst).containsKey(idSrc) == false) {
                    mEdgeIn_.get(idDst).put(idSrc, edge);
                    mEdgeInNodes_.get(nDst).add(edge);
                }

                return edge;
            }

            public boolean addEdge(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                boolean isDirected,
                int weight) {
                if (nSrc == null || nDst == null) {
                    return false;
                }
                Integer idSrc = nSrc.getId();
                Integer idDst = nDst.getId();
                if (mNodes_.containsKey(idSrc) == false
                    || mNodes_.containsKey(idDst) == false) {
                    System.out.printf("%d or %d not in map%n", idSrc, idDst);
                    return false;
                }
                addEdgeToMap(nSrc, nDst, weight);
                if (isDirected == false) {
                    addEdgeToMap(nDst, nSrc, weight);
                }

                return true;
            }

            public boolean addEdge(GraphNodeType2 nSrc, GraphNodeType2 nDst,
                boolean isDirected) {
                return addEdge(nSrc, nDst, isDirected, 1);
            }

            public boolean addEdgeDirected(GraphNodeType2 nSrc,
                GraphNodeType2 nDst) {
                return addEdge(nSrc, nDst, true, 1);
            }

            public boolean addEdgeDirected(GraphNodeType2 nSrc,
                GraphNodeType2 nDst, int weight) {
                return addEdge(nSrc, nDst, true, weight);
            }

            public void printInfoNodes(String msg) {
                if (msg != null) {
                    System.out.println(msg);
                }
                for (GraphNodeType2 n : mNodes_.values()) {
                    System.out.printf("%3d%n", n.getId());
                }
            }

            public void printInfoMapIBound(String msg) {
                if (msg != null) {
                    System.out.println(msg);
                }
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeIn_
                    .entrySet()) {
                    System.out.printf("    INCOMING to %d%n", m.getKey());
                    for (EdgeType2 e : m.getValue().values()) {
                        e.printInfo(null);
                    }
                }
            }

            public void printInfoMapOBound(String msg) {
                if (msg != null) {
                    System.out.println(msg);
                }
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeOut_
                    .entrySet()) {
                    System.out.printf("    OUTGOING from %d%n", m.getKey());
                    for (EdgeType2 e : m.getValue().values()) {
                        e.printInfo(null);
                    }
                }
            }

            public java.util.List<String> getFormattedStringOutput() {
                /**
                 * output format:
                 * 
                 * nodeSrcId,nodeDstId,edgeWeight\n
                 * nodeSrcId,nodeDstId,edgeWeight\n
                 * nodeSrcId,nodeDstId,edgeWeight\n
                 * 
                 * ie: 1,2,1 1,3,1 2,4,2 3,4,2
                 * 
                 */
                java.util.List<String> l = new ArrayList<String>();
                for (GraphNodeType2 nSrc : lNodes_) {
                    HashSet<EdgeType2> m = mEdgeOutNodes_.get(nSrc);
                    if (m == null) {
                        continue;
                    }
                    for (EdgeType2 e : m) {
                        String s = String.format("%d,%d,%d%n",
                            nSrc.getId(),
                            e.getNodeDst().getId(),
                            e.getWeight());
                        l.add(s);
                    }
                }
                return l;
            }

            public void printInfo() {
                printInfo(null);
            }

            public void printInfo(String msg) {
                System.out.printf("----------------------%n");
                if (msg != null) {
                    System.out.printf("%s: ", msg);
                }
                System.out.printf("GraphType2 printInfo%n");
                System.out.printf("    Nodes:%n");
                printInfoNodes("    ");
                System.out.printf("    Edges Inbound:%n");
                printInfoMapIBound("    ");
                System.out.printf("    Edges Outbound:%n");
                printInfoMapOBound("    ");
                System.out.printf("----------------------%n");
            }

            public void printInfoCondensed() {
                System.out.printf("----------------------%n");
                System.out.printf("GraphType2 printInfo");
                System.out.printf("%nNodes: ");
                for (GraphNodeType2 n : mNodes_.values()) {
                    System.out.printf("%2d ", n.getId());
                }
                System.out.printf("%nEdges Out:");
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeOut_
                    .entrySet()) {
                    System.out.printf("%n    OUT FROM  %3d: ", m.getKey());
                    for (Integer dst : m.getValue().keySet()) {
                        System.out.printf("%3d ", dst);
                    }
                }
                System.out.printf("%nEdges In:");
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeIn_
                    .entrySet()) {
                    System.out.printf("%n    IN TO     %3d: ", m.getKey());
                    for (Integer dst : m.getValue().keySet()) {
                        System.out.printf("%3d ", dst);
                    }
                }
                System.out.printf("%n----------------------%n");
            }
        }

        class GraphBuilder {
            GraphNodeType2 nHead_ = null;

            public GraphObjectType2 graphSimple(
                int numNodes,
                int minEdges,
                int maxEdges,
                boolean isRandWeight,
                boolean isDAG,
                boolean isDirected) {

                if (numNodes <= 1) {
                    return null;
                }

                if (minEdges < 1 || maxEdges > numNodes) {
                    return null;
                }

                GraphObjectType2 g = new GraphObjectType2();

                java.util.List<GraphNodeType2> l = new ArrayList<>();

                for (int i = 0; i < numNodes; i++) {
                    GraphNodeType2 n = new GraphNodeType2();
                    l.add(n);
                    g.addNode(n);
                }

                if (isDAG == true) {
                    isDirected = true;
                }

                for (int i = 0; i < numNodes; i++) {
                    int numEdges = utils_.randInt(minEdges, maxEdges, true);
                    int idxMin = 0;
                    int idxMax = numNodes;

                    if (isDAG == true) {
                        idxMin = i + 1;
                    }

                    if ((numNodes == (i + 1)) &&
                        (isDAG == true || isDirected == true)) {
                        continue;
                    }

                    GraphNodeType2 nSrc = g.getNode(i);
                    for (int j = 0; j < numEdges; j++) {
                        int idxDst = utils_.randInt(idxMin, idxMax, false);
                        int weight = 1;
                        if (isRandWeight == true) {
                            weight = utils_.randInt(1, 5, true);
                        }
                        GraphNodeType2 nDst = g.getNode(idxDst);
                        g.addEdge(nSrc, nDst, isDirected, weight);
                    }
                }

                return g;
            }

            public GraphObjectType2 graphSocialModel1(
                int numNodes,
                int numClusters,
                int numEdgesToOtherClusters,
                boolean isUniformDist,
                boolean isRandWeight) {

                /**
                 * Creates new GraphObjectType2 that models a simple social
                 * graph.
                 * 
                 * Distributes numNodes into numClusters, creates highly
                 * connected graph in each cluster, and have some nodes in each
                 * cluster connect to other clusters.
                 * 
                 * Edges are bidirectional.
                 * 
                 * @param numNodes
                 * @param numClusters
                 * @param numEdgesToOtherClusters:
                 *            if == -1, then random
                 * @param isUniformDist
                 * @param isRandWeight
                 */

                if (numNodes < numClusters) {
                    return null;
                }

                GraphObjectType2 g = new GraphObjectType2();

                java.util.List<java.util.List<GraphNodeType2>> l = new ArrayList<>();

                graphSetup1SM1(numNodes, numClusters, isUniformDist, g, l);

                graphSetup2SM1(isRandWeight, numEdgesToOtherClusters, g, l);

                return g;
            }

            private void graphSetup1SM1(
                final int numNodes,
                final int numClusters,
                final boolean isUniformDist,
                GraphObjectType2 g,
                java.util.List<java.util.List<GraphNodeType2>> l) {

                /**
                 * Allocates numNodes into numClusters. The nodes are added to
                 * List of List, where each sublist is a cluster. The nodes are
                 * also added to GraphObjectType2.
                 * 
                 * @param g:
                 *            is modified
                 * @param l:
                 *            is modified
                 */
                int numRemaining = numNodes - numClusters; // min 1 per cluster
                int numAvg = numRemaining / numClusters;
                int noise = numAvg / 4; // 25% noise
                int minNode = numAvg - noise;
                int maxNode = numAvg + noise;

                if (minNode <= 0) {
                    minNode = 1;
                }
                if (maxNode >= numNodes) {
                    maxNode = numAvg;
                }

                for (int i = 0; i < numClusters; i++) {
                    l.add(new ArrayList<>());
                    int numNodesInCluster = numAvg;
                    if (isUniformDist == false) {
                        utils_.randIntGaussian(minNode, maxNode, true);
                    }
                    if (numNodesInCluster > numRemaining) {
                        numNodesInCluster = numRemaining;
                    }

                    // add at least one for each cluster, hence <=
                    for (int j = 0; j <= numNodesInCluster; j++) {
                        GraphNodeType2 n = new GraphNodeType2();
                        l.get(i).add(n);
                        g.addNode(n);
                    }
                    numRemaining -= numNodesInCluster;
                }
            }

            private void graphSetup2SM1(
                boolean isRandWeight,
                int numEdgesToOtherClusters,
                GraphObjectType2 g,
                java.util.List<java.util.List<GraphNodeType2>> l) {
                /**
                 * Add edges to each cluster, and have at least one member of
                 * each cluster connect to at least one other cluster.
                 * 
                 * This is a cyclic graph and is bidirectional.
                 * 
                 * For each node in a sublist, make a random number of edges
                 * that is less than remaining in sublist. For each edge,
                 * connect to node not visited yet in sublist.
                 * 
                 * Make a random number of edges less than half of number in
                 * sublist. This is used to connect to other sublists. Do a
                 * second loop of same sublist to connect to other sublists.
                 * 
                 * @param g:
                 *            is modified
                 * @param l:
                 *            is input only
                 * @param numEdgesToOtherClusters:
                 *            if == -1, then random
                 */

                final int numClusters = l.size();
                final boolean isDirected = false;
                boolean isUnique = false;

                for (int k = 0; k < numClusters; k++) {
                    java.util.List<GraphNodeType2> sublist = l.get(k);
                    java.util.List<Integer> sublistInt = new ArrayList<>();

                    // first loop to connect cluster nodes
                    graphSetup2SMClusterOnly(
                        isRandWeight, isDirected,
                        sublist, sublistInt, g);

                    // second loop to connect some nodes in current cluster
                    // to nodes in other clusters
                    graphSetup2SMExtCluster(
                        numClusters, k, numEdgesToOtherClusters, isUnique,
                        isRandWeight, isDirected, l, sublistInt, g);
                }
            }

            private void graphSetup2SMClusterOnly(
                boolean isRandWeight,
                boolean isDirected,
                java.util.List<GraphNodeType2> sublist,
                java.util.List<Integer> sublistInt,
                GraphObjectType2 g) {
                /**
                 * private helper function to connect nodes in current sublist.
                 * The connections are updated in GraphObjectType2 g. A second
                 * job is the sublistInt is updated. This is just a list of all
                 * index values to the current sublist.
                 * 
                 */
                int numNodesInSublist = sublist.size();
                int numNodesRemainingInSublist = numNodesInSublist;
                // for each node
                for (int i = 0; i < numNodesInSublist; i++) {
                    GraphNodeType2 nSrc = sublist.get(i);
                    sublistInt.add(new Integer(i));
                    numNodesRemainingInSublist--;

                    // randomly make number of edges
                    int maxNumEdges = numNodesRemainingInSublist / 2;
                    if (numNodesRemainingInSublist == 1) {
                        maxNumEdges = numNodesRemainingInSublist;
                    }
                    int numEdges = utils_.randInt(1, maxNumEdges, true);

                    // for each edge for current node
                    for (int j = 0; j < numEdges; j++) {
                        int idxDst;
                        if (isDirected == false) {
                            idxDst = utils_.randInt(0, numNodesInSublist, false,
                                i);
                        } else {
                            idxDst = utils_.randInt(i + 1, numNodesInSublist,
                                false);
                        }
                        int weight = 1;
                        if (isRandWeight == true) {
                            weight = utils_.randInt(1, 5, true);
                        }
                        GraphNodeType2 nDst = sublist.get(idxDst);
                        g.addEdge(nSrc, nDst, isDirected, weight);
                    }
                }
            }

            private void graphSetup2SMExtCluster(
                int numClusters,
                int idxCurCluster,
                int numEdgesToOtherClusters,
                boolean isUnique,
                boolean isRandWeight,
                boolean isDirected,
                java.util.List<java.util.List<GraphNodeType2>> l,
                java.util.List<Integer> sublistInt,
                GraphObjectType2 g) {
                /**
                 * helper function that connects nodes in current cluster to
                 * nodes in external clusters
                 */
                if (numEdgesToOtherClusters == -1) {
                    numEdgesToOtherClusters = sublistInt.size() / 2;
                }

                if (numEdgesToOtherClusters > numClusters) {
                    numEdgesToOtherClusters = numClusters;
                }

                // sublistInt: entire list of node IDs in current cluster
                // lRandAry: x num of node IDs from sublistInt
                java.util.List<Integer> lRandAry = utils_.randIntAryList(
                    sublistInt, numEdgesToOtherClusters, isUnique);
                for (Integer i : lRandAry) {
                    int clusterDst = utils_.randInt(0, numClusters, false,
                        idxCurCluster);
                    int idxNodeInDst = utils_.randInt(0,
                        l.get(clusterDst).size(), false);
                    int weight = 1;
                    if (isRandWeight == true) {
                        weight = utils_.randInt(1, 5, true);
                    }
                    GraphNodeType2 nSrc = l.get(idxCurCluster)
                        .get(i.intValue());
                    GraphNodeType2 nDst = l.get(clusterDst).get(idxNodeInDst);
                    g.addEdge(nSrc, nDst, isDirected, weight);
                }

            }

            private void graphSetup1Type2(
                int numNodes,
                int numLevels,
                GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> aAryNode,
                boolean isDirected,
                boolean isSingleRoot) {
                // helper function called by randGraph
                // add numLevels of ArrayList to aAryNode
                // distribute numNodes into numLevels of lists
                // uses semi random distribution of nodes to each ArrayList

                int numRemaining = numNodes;
                int numAvg = numNodes / numLevels;
                if (isSingleRoot == true) {
                    numAvg = numNodes / (numLevels - 1);
                }
                int noiseNeg = numAvg / 2;
                int minNodes = numAvg - noiseNeg;
                int maxNodes = numAvg;

                if (minNodes <= 0) {
                    minNodes = 1;
                }
                if (maxNodes > numNodes) {
                    maxNodes = numAvg;
                }

                for (int i = 0; i < numLevels; i++) {
                    aAryNode.add(new ArrayList<GraphNodeType2>());
                }
                // distribute the nodes to each level

                // subtract numLevels to guarantee each level has min of 1
                numRemaining -= numLevels;

                for (int i = 0; i < numLevels; i++) {
                    int numNodesInLevel = utils_.randInt(minNodes, maxNodes,
                        true);
                    if ((numNodesInLevel > numRemaining)
                        || ((i + 1) == numLevels)) {
                        numNodesInLevel = numRemaining;
                    }
                    if (numRemaining < (2 * (numLevels - i))) {
                        if (numRemaining < 2) {
                            numNodesInLevel = numRemaining;
                        } else { // numLevels-i;
                            numNodesInLevel = 2;
                        }
                    }
                    if (i == 0 && isSingleRoot == true) {
                        numNodesInLevel = 1;
                    }
                    // guarantee each level has at least 1 node
                    // so do j <= numNodes instead of j < numNodes
                    for (int j = 0; j <= numNodesInLevel; j++) {
                        GraphNodeType2 n = new GraphNodeType2();
                        graph.addNode(n);
                        aAryNode.get(i).add(n);
                        if (i == 0 && j == 0) {
                            nHead_ = n;
                        }
                    }
                    numRemaining -= numNodesInLevel;
                }
            }

            private Integer graphSetup2Type2GetMaxId(int numLevels, int inLevel,
                int depth, // inclusive
                ArrayList<ArrayList<GraphNodeType2>> a) {
                // return the max ID of the max Node that is
                // inLevel + depth
                if (inLevel >= numLevels) {
                    return null;
                }
                int maxId = 0;
                for (int j = 0; j <= depth; j++) {
                    int curLevel = inLevel + j;
                    if (curLevel >= numLevels) {
                        break;
                    }
                    int sz = a.get(curLevel).size() - 1;
                    maxId = a.get(curLevel).get(sz).getId();
                }
                return new Integer(maxId);
            }

            private void graphSetupUniformDistType2(int numNodes, int numLevels,
                GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> aAryNode,
                boolean isDirected, boolean isSingleRoot) {
                // helper function called by randGraph
                // add numLevels of ArrayList to aAryNode
                // distribute numNodes into numLevels of lists
                // uses semi random distribution of nodes to each ArrayList

                for (int i = 0; i < numLevels; i++) {
                    aAryNode.add(new ArrayList<GraphNodeType2>());
                }

                int numAvg = numNodes / numLevels;
                if (isSingleRoot == true) {
                    numAvg = numNodes / (numLevels - 1);
                }
                int numRemaining = numNodes;
                int numMod = numNodes % numLevels;
                if (isSingleRoot == true) {
                    numMod = numNodes % (numLevels - 1);
                }
                int numAvgUpper = numAvg + 1;

                // distribute the nodes to each level
                for (int i = 0; i < numLevels; i++) {
                    int numNodesInLevel = numAvg;
                    if (i < numMod) {
                        numNodesInLevel = numAvgUpper;
                    }
                    if ((i + 1) == numLevels) {
                        numNodesInLevel = numRemaining;
                    }
                    if (i == 0 && isSingleRoot == true) {
                        numNodesInLevel = 1;
                    }
                    for (int j = 0; j < numNodesInLevel; j++) {
                        GraphNodeType2 n = new GraphNodeType2();
                        graph.addNode(n);
                        aAryNode.get(i).add(n);
                        if (i == 0 && j == 0) {
                            nHead_ = n;
                        }
                    }
                    numRemaining -= numNodesInLevel;
                }
            }

            private void graphSetup2Type2(
                int numNodes,
                int numLevels,
                int maxNumEdgesPerNode,
                GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> a,
                boolean isDirected,
                boolean isRandomWeight) {

                // helper function called by randGraph
                //
                // input:
                // ArrayList<ArrayList<Node>> a.size == numLevels, with
                // numNodes randomly distributed among those levels.
                // output:
                // for the top through next to last levels, make non directed
                // connections with nodes up to two levels down.
                // for the last level, if a node is unconnected, then
                // connect to a random, subsequent sibling.

                // hash each node and remove for each one visited
                HashMap<Integer, AtomicInteger> mI = new HashMap<>();
                HashMap<Integer, AtomicInteger> mO = new HashMap<>();

                Iterator<GraphNodeType2> itNodes = graph.iteratorNodes();
                while (itNodes.hasNext()) {
                    GraphNodeType2 curNode = itNodes.next();
                    mI.put(curNode.getId(), new AtomicInteger(0));
                    mO.put(curNode.getId(), new AtomicInteger(0));
                }

                int nextToLastLevel = numLevels - 1;
                GraphNodeType2 nSrc;
                GraphNodeType2 nBeg;
                GraphNodeType2 nLevelHead = null;

                // for the top to next to last level
                for (int i = 0; i < nextToLastLevel; i++) {
                    int sz = a.get(i).size() - 1;
                    int maxId = a.get(i).get(sz).getId();
                    nLevelHead = a.get(i).get(sz);

                    // have the connections from current to maxId
                    // if there is a next level, get max id of next level
                    nBeg = a.get(i + 1).get(0);
                    Integer iMaxId = graphSetup2Type2GetMaxId(numLevels, i, 2,
                        a);
                    if (iMaxId != null) {
                        maxId = iMaxId.intValue();
                    }

                    // for each node in current level, add edges
                    for (int j = 0; j <= sz; j++) {
                        nSrc = a.get(i).get(j);
                        int numEdges = utils_.randIntGaussian(1,
                            maxNumEdgesPerNode, true);

                        // for each edge
                        for (int k = 0; k < numEdges; k++) {
                            int idMin = nBeg.getId().intValue();
                            int idDst = randDstNode(idMin, maxId,
                                maxNumEdgesPerNode, graph);
                            GraphNodeType2 nDst = graph.getNode(idDst);
                            graphSetup4Type2(nSrc, nDst, graph, mI, mO,
                                isDirected, isRandomWeight);
                        }

                        // if is directed, make sure every
                        // middle level node has an incoming edge
                        if ((isDirected == true) && (i != 0)
                            && (mI.get(nSrc.getId()).get() == 0)) {
                            int idMin = 0;
                            if (nHead_ != null) {
                                idMin = nHead_.getId().intValue();
                            }
                            int idMax = nSrc.getId().intValue() - 1;
                            int idDst = randDstNode(idMin, idMax,
                                maxNumEdgesPerNode, graph);
                            GraphNodeType2 nDst = graph.getNode(idDst);
                            graphSetup4Type2(nDst, nSrc, graph, mI, mO,
                                isDirected, isRandomWeight);
                        }
                    }
                }

                if (nextToLastLevel <= 0) {
                    return;
                }

                // for each node in last level, connect once
                int sz = a.get(numLevels - 1).size();
                for (int j = 0; j < sz; j++) {
                    nSrc = a.get(numLevels - 1).get(j);
                    int idMin = nLevelHead.getId().intValue();
                    int idMax = nSrc.getId().intValue() - 1;
                    int idDst = utils_.randInt(idMin, idMax, true);
                    GraphNodeType2 nDst = graph.getNode(idDst);
                    graphSetup4Type2(
                        nDst, nSrc, graph, mI, mO, isDirected, isRandomWeight);
                }
            }

            private int randDstNode(int idMin, int idMax, int maxEdges,
                GraphObjectType2 graph) {
                // pick a node between idMin:idMax inclusive where
                int maxTries = 10;
                int idDst = idMin;
                for (int i = 0; i < maxTries; i++) {
                    idDst = utils_.randInt(idMin, idMax, true);
                    ArrayList<EdgeType2> l = graph.getEdges(idDst,
                        EDGE_DIR.IBOUND);
                    if (l.size() < maxEdges) {
                        return idDst;
                    }
                }
                return idDst;
            }

            public void graphSetup3Type2(
                GraphNodeType2 nSrc, int maxId,
                GraphObjectType2 graph,
                HashMap<Integer, AtomicInteger> mI,
                HashMap<Integer, AtomicInteger> mO,
                boolean isDirected,
                boolean isRandomWeight) {
                // helper function called by graphSetup2
                // pick a random, subsequent node, and create edge

                int idSrc = nSrc.getId().intValue() + 1;
                int idDst = utils_.randInt(idSrc, maxId, true);
                GraphNodeType2 nDst = graph.getNode(idDst);
                graphSetup4Type2(
                    nSrc, nDst, graph, mI, mO, isDirected, isRandomWeight);
            }

            public void graphSetup4Type2(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                GraphObjectType2 graph,
                HashMap<Integer, AtomicInteger> mI,
                HashMap<Integer, AtomicInteger> mO,
                boolean isDirected,
                boolean isRandomWeight) {
                // helper function called by graphSetup2
                // create edge

                int idSrc = nSrc.getId().intValue();
                int idDst = nDst.getId().intValue();
                int weight = 1;

                if (isRandomWeight == true) {
                    weight = utils_.randInt(1, 5, true);
                }
                graph.addEdge(nSrc, nDst, isDirected, weight);

                mO.get(idSrc).incrementAndGet();
                mI.get(idDst).incrementAndGet();

                if (isDirected == false) {
                    mO.get(idDst).incrementAndGet();
                    mI.get(idSrc).incrementAndGet();
                }
            }

            public GraphObjectType2 randGraph(
                int numNodes,
                int numLevels,
                int maxNumEdgesPerNode,
                boolean isUniformDist,
                boolean isDirected,
                boolean isSingleRoot,
                boolean isRandomWeight) {

                if (numLevels > (2 * numNodes)) {
                    return null;
                }

                GraphObjectType2 graph = new GraphObjectType2();

                ArrayList<ArrayList<GraphNodeType2>> aAryNode = new ArrayList<>();

                if (isUniformDist == true) {
                    graphSetupUniformDistType2(numNodes, numLevels, graph,
                        aAryNode, isDirected, isSingleRoot);
                } else {
                    graphSetup1Type2(numNodes, numLevels, graph, aAryNode,
                        isDirected, isSingleRoot);
                }
                printGraphList(aAryNode);
                graphSetup2Type2(numNodes, numLevels, maxNumEdgesPerNode, graph,
                    aAryNode, isDirected, isRandomWeight);

                return graph;
            }

            public void printGraphList(ArrayList<ArrayList<GraphNodeType2>> a) {
                for (int i = 0; i < a.size(); i++) {
                    for (int j = 0; j < a.get(i).size(); j++) {
                        System.out.printf("%3d ", a.get(i).get(j).getId());
                    }
                    System.out.printf("%n");
                }
            }

            public GraphObjectType2 randDirectedGraph(int numNodes,
                int numLevels) {
                return null;
            }
        }

        class GraphAlgosBasic {
            GraphObjectType2 g_;
            Stack<GraphNodeType2> stack_ = new Stack<GraphNodeType2>();
            HashMap<GraphNodeType2, Boolean> marked_ = new HashMap<>();
            boolean isDAG_ = false;
            int setFlags_ = 0;
            ArrayList<GraphNodeType2> lNodeOrigins_ = new ArrayList<>();

            public GraphAlgosBasic() {
            }

            public GraphAlgosBasic(GraphObjectType2 g) {
                setGraphAndProcess(g);
            }

            public GraphAlgosBasic setGraph(GraphObjectType2 g) {
                g_ = g;
                return this;
            }

            public GraphObjectType2 getGraph() {
                return g_;
            }

            public void resetOperations() {
                stack_.clear();
                marked_.clear();
                lNodeOrigins_.clear();
                isDAG_ = false;
                resetFlags();
            }

            public void resetFlags() {
                setFlags_ = 0;
            }

            public int getFlag() {
                return setFlags_;
            }

            public void setFlag(SET_FLAGS flag) {
                int orVal = 1 << flag.intVal();
                setFlags_ = setFlags_ | orVal;
            }

            public void unsetFlag(SET_FLAGS flag) {
                int bitVal = 1 << flag.intVal();
                int mask = 0xffffffff;
                int andVal = bitVal ^ mask;
                setFlags_ = setFlags_ & andVal;
            }

            public boolean isFlagSet(SET_FLAGS flag) {
                int flagVal = setFlags_ >> flag.intVal();
                flagVal = flagVal & 1;
                boolean res = false;
                if (flagVal == 1) {
                    res = true;
                }
                return res;
            }

            public boolean setGraphAndProcess(GraphObjectType2 g) {
                if (g == null) {
                    return false;
                }
                setGraph(g);
                resetOperations();

                ArrayList<GraphNodeType2> lNodes = g.getNodesAll();
                HashMap<GraphNodeType2, HashSet<EdgeType2>> mEdgeIn = g
                    .getEdgesAll(EDGE_DIR.IBOUND);
                for (GraphNodeType2 n : lNodes) {
                    if (mEdgeIn.get(n) == null) {
                        lNodeOrigins_.add(n);
                    } else if (mEdgeIn.get(n).size() == 0) {
                        lNodeOrigins_.add(n);
                    }
                }
                setFlag(SET_FLAGS.IS_SET_NODE_ORIGINS);
                initMarked();
                return true;
            }

            public void initMarked() {
                marked_.clear();
                if (g_ == null) {
                    return;
                }
                if (isFlagSet(SET_FLAGS.IS_USED_MARK) == false
                    && marked_.size() != 0) {
                    return;
                }
                ArrayList<GraphNodeType2> l = g_.getNodesAll();
                for (GraphNodeType2 n : l) {
                    marked_.put(n, false);
                }
                unsetFlag(SET_FLAGS.IS_USED_MARK);
            }

            public boolean setMarked(GraphNodeType2 n) {
                if (n == null) {
                    return false;
                }
                marked_.put(n, true);
                setFlag(SET_FLAGS.IS_USED_MARK);
                return true;
            }

            public boolean unsetMarked(GraphNodeType2 n) {
                if (n == null) {
                    return false;
                }
                marked_.put(n, false);
                setFlag(SET_FLAGS.IS_USED_MARK);
                return true;
            }

            public ArrayList<ArrayList<GraphNodeType2>> findPath(
                GraphNodeType2 nDst) {
                ArrayList<ArrayList<GraphNodeType2>> l = new ArrayList<>();

                for (GraphNodeType2 nSrc : lNodeOrigins_) {
                    ArrayList<GraphNodeType2> lRes = findPath(nSrc, nDst);
                    if (lRes.size() != 0) {
                        l.add(lRes);
                    }
                }

                return l;
            }

            public ArrayList<GraphNodeType2> findPath(GraphNodeType2 nSrc,
                GraphNodeType2 nDst) {
                ArrayList<GraphNodeType2> l = new ArrayList<>();
                Stack<GraphNodeType2> s = new Stack<>();

                if (nSrc == null || nDst == null) {
                    return l;
                }
                initMarked();

                boolean res = dfs(nSrc, nDst, s);

                if (res == true) {
                    while (s.isEmpty() == false) {
                        l.add(s.pop());
                    }
                }

                return l;
            }

            public boolean bfs(GraphNodeType2 nSrc, GraphNodeType2 nDst,
                Stack<GraphNodeType2> stack) {
                if (nSrc == null || nDst == null) {
                    return false;
                }
                if (marked_.get(nSrc) == true) {
                    return false;
                }
                HashMap<GraphNodeType2, GraphNodeType2> m = new HashMap<>();
                LinkedList<GraphNodeType2> ll = new LinkedList<>();

                ll.add(nDst);
                while (ll.size() != 0) {
                    GraphNodeType2 n = ll.poll();
                    if (n == nDst) {
                        stack.push(n);
                        while (n != nSrc) {
                            n = m.get(n);
                            if (n == null) {
                                return true;
                            }
                            stack.push(n);
                        }
                        return true;
                    }
                    if (marked_.get(n) == true) {
                        return false;
                    }
                    setMarked(n);
                    ArrayList<EdgeType2> lEdges = g_.getEdges(n,
                        EDGE_DIR.OBOUND);
                    for (EdgeType2 e : lEdges) {
                        GraphNodeType2 nOutbound = e.getNodeDst();
                        m.put(nOutbound, n); // child, parent
                    }
                }
                return false;
            }

            public boolean dfs(GraphNodeType2 nSrc, GraphNodeType2 nDst,
                Stack<GraphNodeType2> stack) {
                if (nSrc == null || nDst == null) {
                    return false;
                }
                if (marked_.get(nSrc) == true) {
                    return false;
                }
                if (nSrc == nDst) {
                    stack.push(nSrc);
                    return true;
                }
                ArrayList<EdgeType2> lEdges = g_.getEdges(nSrc,
                    EDGE_DIR.OBOUND);
                setMarked(nSrc);
                for (EdgeType2 e : lEdges) {
                    GraphNodeType2 nNewSrc = e.getNodeDst();
                    boolean res = dfs(nNewSrc, nDst, stack);
                    if (res == true) {
                        unsetMarked(nSrc);
                        stack.push(nSrc);
                        return true;
                    }
                }
                unsetMarked(nSrc);
                return false;
            }

            private boolean dfsCheckIsDAG(GraphNodeType2 n) {
                if (n == null) {
                    return false;
                }
                if (marked_.get(n) == true) {
                    return true;
                }
                ArrayList<EdgeType2> lEdges = g_.getEdges(n, EDGE_DIR.OBOUND);
                setMarked(n);
                for (EdgeType2 e : lEdges) {
                    GraphNodeType2 nNew = e.getNodeDst();
                    boolean res = dfsCheckIsDAG(nNew);
                    if (res == true) {
                        return true;
                    }
                }
                return false;
            }

            public boolean checkIfIsDAG() {
                for (GraphNodeType2 nSrc : lNodeOrigins_) {
                    initMarked();
                    if (dfsCheckIsDAG(nSrc) == true) {
                        return true;
                    }
                }
                return false;
            }

            public boolean isDAG() {
                if (isFlagSet(SET_FLAGS.IS_DAG_SET) == false) {
                    boolean res = checkIfIsDAG();
                    isDAG_ = res;
                    setFlag(SET_FLAGS.IS_DAG_SET);
                }
                return isDAG_;
            }
        }

        class GraphClassTests {
            public void t0() {
                int numLevels = 4;
                int numNodes = 16;
                boolean isDirected = false;
                boolean isRandomWeight = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels, 2,
                    false, isDirected, false, isRandomWeight);
                gt2.printInfoCondensed();
            }

            public void t1() throws Exception {
                int numLevels = 5;
                int numNodes = 20;
                boolean isDirected = false;
                boolean isRandomWeight = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels, 2,
                    false, isDirected, false, isRandomWeight);
                gt2.printInfoCondensed();
            }

            public void t2() {
                try {
                    for (int i = 0; i < 20; i++) {
                        t1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void t3() {
                boolean isDirected = true;
                int numLevels = 5;
                int numNodes = 20;
                int numEdges = 3;
                boolean isRandomWeight = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    numEdges, true, isDirected, false, isRandomWeight);
                gt2.printInfoCondensed();
            }

            public void t4() {
                for (int i = 0; i < 20; i++) {
                    t3();
                }
            }

            public void t5() {
                boolean isDirected = true;
                boolean isSingleRoot = true;
                int numLevels = 5;
                int numNodes = 20;
                int numEdges = 2;
                boolean isRandomWeight = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    numEdges, true, isDirected, isSingleRoot, isRandomWeight);
                gt2.printInfoCondensed();
            }

            public void t6() {
                boolean isDirected = true;
                boolean isSingleRoot = false;
                int numLevels = 8;
                int numNodes = 40;
                int numEdges = 3;
                boolean isRandomWeight = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    numEdges, true, isDirected, isSingleRoot, isRandomWeight);
                gt2.printInfoCondensed();
            }

            public void t7() {
                // set flags test
                GraphAlgosBasic t = new GraphAlgosBasic();
                t.resetFlags();
                int sz = 7;
                int a[] = new int[sz];
                int i = 0;

                t.setFlag(SET_FLAGS.IS_DAG_SET);
                a[i++] = t.getFlag();

                t.setFlag(SET_FLAGS.IS_SET_NODE_ORIGINS);
                a[i++] = t.getFlag();

                t.setFlag(SET_FLAGS.IS_USED_MARK);
                a[i++] = t.getFlag();

                t.unsetFlag(SET_FLAGS.IS_USED_MARK);
                a[i++] = t.getFlag();

                t.unsetFlag(SET_FLAGS.IS_SET_NODE_ORIGINS);
                a[i++] = t.getFlag();

                t.unsetFlag(SET_FLAGS.IS_DAG_SET);
                a[i++] = t.getFlag();

                for (int j = 0; j < sz; j++) {
                    System.out.printf("a[%d]=%x%n", j, a[j]);
                }
            }

            public GraphObjectType2 t8() {
                // basic hand written graph
                GraphObjectType2 g = new GraphObjectType2();
                setGID(0);

                int sz = 5;
                GraphNodeType2 n[] = new GraphNodeType2[sz];

                for (int i = 0; i < sz; i++) {
                    n[i] = new GraphNodeType2();
                    g.addNode(n[i]);
                }

                boolean isDir = true;
                g.addEdge(n[0], n[1], isDir, 1);
                g.addEdge(n[1], n[2], isDir, 1);
                g.addEdge(n[2], n[3], isDir, 1);
                g.addEdge(n[3], n[4], isDir, 1);
                g.addEdge(n[0], n[2], isDir, 1);
                g.addEdge(n[1], n[3], isDir, 1);
                g.addEdge(n[2], n[4], isDir, 1);

                g.printInfoCondensed();

                return g;
            }

            public GraphObjectType2 t9() {
                // basic hand written graph
                GraphObjectType2 g = new GraphObjectType2();
                setGID(0);

                int sz = 5;
                GraphNodeType2 n[] = new GraphNodeType2[sz];

                for (int i = 0; i < sz; i++) {
                    n[i] = new GraphNodeType2();
                    g.addNode(n[i]);
                }

                boolean isDir = true;
                g.addEdge(n[0], n[1], isDir, 1);
                g.addEdge(n[1], n[2], isDir, 1);
                g.addEdge(n[2], n[3], isDir, 1);
                g.addEdge(n[3], n[4], isDir, 1);
                g.addEdge(n[0], n[2], isDir, 1);
                g.addEdge(n[1], n[3], isDir, 1);
                g.addEdge(n[2], n[4], isDir, 1);
                g.addEdge(n[4], n[0], isDir, 1);
                g.addEdge(n[4], n[1], isDir, 1);

                g.printInfoCondensed();

                return g;
            }

            public void t10() {
                // basic hand written graph to test out algos
                // this is acyclic graph
                GraphObjectType2 g = t8();
                GraphAlgosBasic ga = new GraphAlgosBasic(g);
                boolean isDAG = ga.isDAG();
                GraphNodeType2 nSrc = g.getNode(0);
                GraphNodeType2 nDst = g.getNode(4);
                ArrayList<GraphNodeType2> l = ga.findPath(nSrc, nDst);
                System.out.printf("isDAG:%s%n", isDAG);
                if (l == null) {
                    return;
                }
                System.out.printf("find path: 0->4%n");
                for (GraphNodeType2 n : l) {
                    System.out.printf("%2d ", n.getId());
                }
                System.out.printf("%n");
            }

            public void t11() {
                // basic hand written graph to test out algos
                // this is cyclic graph
                GraphObjectType2 g = t9();
                GraphAlgosBasic ga = new GraphAlgosBasic(g);
                boolean isDAG = ga.isDAG();
                GraphNodeType2 nSrc = g.getNode(0);
                GraphNodeType2 nDst = g.getNode(4);
                ArrayList<GraphNodeType2> l = ga.findPath(nSrc, nDst);
                System.out.printf("isDAG:%s%n", isDAG);
                if (l == null) {
                    return;
                }
                System.out.printf("find path: 0->4%n");
                for (GraphNodeType2 n : l) {
                    System.out.printf("%2d ", n.getId());
                }
                System.out.printf("%n");
            }

            public GraphObjectType2 t12() {
                // basic hand written graph
                GraphObjectType2 g = new GraphObjectType2();
                setGID(0);

                int sz = 6;
                GraphNodeType2 n[] = new GraphNodeType2[sz];

                for (int i = 0; i < sz; i++) {
                    n[i] = new GraphNodeType2();
                    g.addNode(n[i]);
                }

                boolean isDir = true;

                g.addEdge(n[0], n[2], isDir, 1);
                g.addEdge(n[1], n[2], isDir, 1);
                g.addEdge(n[1], n[3], isDir, 1);
                g.addEdge(n[2], n[3], isDir, 1);
                g.addEdge(n[2], n[5], isDir, 1);
                g.addEdge(n[3], n[4], isDir, 1);
                g.addEdge(n[4], n[5], isDir, 1);

                g.printInfoCondensed();

                return g;
            }

            public void t13() {
                // basic hand written graph to test out algos
                // this is cyclic graph
                GraphObjectType2 g = t12();
                GraphAlgosBasic ga = new GraphAlgosBasic(g);
                boolean isDAG = ga.isDAG();
                GraphNodeType2 nDst = g.getNode(5);
                ArrayList<ArrayList<GraphNodeType2>> la = ga.findPath(nDst);
                System.out.printf("isDAG:%s%n", isDAG);
                if (la == null) {
                    return;
                }
                System.out.printf("find path: 0->5%n");
                for (ArrayList<GraphNodeType2> l : la) {
                    for (GraphNodeType2 n : l) {
                        System.out.printf("%2d ", n.getId());
                    }
                    System.out.printf("%n-----------%n");
                }
            }

            public void t14() {
                boolean isDirected = true;
                boolean isSingleRoot = false;
                int numLevels = 10;
                int numNodes = 100;
                int numEdges = 2;
                boolean isRandomWeight = true;
                t14(numLevels, numNodes, numEdges,
                    isDirected, isSingleRoot, isRandomWeight);
            }

            public void t14(
                int numLevels,
                int numNodes,
                int numEdges,
                boolean isDirected,
                boolean isSingleRoot,
                boolean isRandomWeight) {

                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    numEdges, true, isDirected, isSingleRoot, isRandomWeight);
                boolean res = gt2 != null;
                assert res;
                java.util.List<String> l = gt2.getFormattedStringOutput();
                res = l != null;
                assert res;
                writeGraphFile(l);
                GraphObjectType2 gLoad = loadGraphFile();

                l = gLoad.getFormattedStringOutput();
                res = l != null;
                assert res;
                writeGraphFile(l);

                // manually diff 2 files
            }

            public void t15() {
                /*
                 * how to cluster highly connected subgroups and identify the
                 * bridge nodes, nodes which connect a highly clustered group to
                 * another highly clustered group.
                 * 
                 * start with any node and compare with all other nodes. compare
                 * the node A's edges with node B's edges to see if there is
                 * majority overlap. if there is, then cluster together. if node
                 * B's edges overlap majority of node A, but node B isn't
                 * majority overlap, then place into maybe category. if node B's
                 * edges do not overlap majority, place into none category. at
                 * the end of this iteration, there are maybe and none
                 * categories. maybe A doesn't belong to any group then restart
                 * process with another node.
                 */
                int numNodes = 16;
                int numClusters = 4;
                int numEdgesToOtherClusters = 1;
                boolean isUniformDist = true;
                boolean isRandWeight = false;

                GraphBuilder gb = new GraphBuilder();
                GraphObjectType2 g = gb.graphSocialModel1(
                    numNodes, numClusters, numEdgesToOtherClusters,
                    isUniformDist, isRandWeight);
                g.printInfoCondensed();
                // java.util.List<String> l = g.getFormattedStringOutput();
            }

            public void t16() {
                int numNodes = 50;
                int numClusters = 10;
                int numEdgesToOtherClusters = 3;
                boolean isUniformDist = true;
                boolean isRandWeight = false;
                t16(numNodes, numClusters, numEdgesToOtherClusters,
                    isUniformDist, isRandWeight);
            }

            public void t16(
                int numNodes,
                int numClusters,
                int numEdgesToOtherClusters,
                boolean isUniformDist,
                boolean isRandWeight) {

                GraphBuilder gb = new GraphBuilder();
                GraphObjectType2 g = gb.graphSocialModel1(
                    numNodes, numClusters, numEdgesToOtherClusters,
                    isUniformDist, isRandWeight);
                java.util.List<String> l = g.getFormattedStringOutput();
                writeGraphFile(l);
            }

            public void t17() {
                int numNodes = 9;
                int numClusters = 2;
                int numEdgesToOtherClusters = 2;
                boolean isUniformDist = true;
                boolean isRandWeight = false;
                t16(numNodes, numClusters, numEdgesToOtherClusters,
                    isUniformDist, isRandWeight);
            }

            public void t18() {
                boolean isDirected = true;
                boolean isSingleRoot = false;
                int numNodes = 12;
                int numLevels = 1;
                int numEdges = 3;
                boolean isRandomWeight = true;
                t19(numLevels, numNodes, numEdges,
                    isDirected, isSingleRoot, isRandomWeight);
            }

            public void t19(
                int numLevels,
                int numNodes,
                int numEdges,
                boolean isDirected,
                boolean isSingleRoot,
                boolean isRandomWeight) {

                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    numEdges, true, isDirected, isSingleRoot, isRandomWeight);
                boolean res = gt2 != null;
                assert res;
                java.util.List<String> l = gt2.getFormattedStringOutput();
                res = l != null;
                assert res;
                writeGraphFile(l);
            }

            public void t20() {
                int numNodes = 8;
                int minEdges = 2;
                int maxEdges = 4;
                boolean isRandWeight = false;
                boolean isDAG = true;
                boolean isDirected = true;

                t20(numNodes, minEdges, maxEdges, isRandWeight, isDAG,
                    isDirected);

            }

            public void t20(
                int numNodes,
                int minEdges,
                int maxEdges,
                boolean isRandWeight,
                boolean isDAG,
                boolean isDirected) {

                GraphBuilder gb = new GraphBuilder();
                GraphObjectType2 gt2 = gb.graphSimple(
                    numNodes, minEdges, maxEdges, isRandWeight, isDAG,
                    isDirected);
                boolean res = gt2 != null;
                assert res;
                java.util.List<String> l = gt2.getFormattedStringOutput();
                res = l != null;
                assert res;
                writeGraphFile(l);
            }

            public void test() {
                System.out.printf("GraphClass test%n");
                t20();
            }
        }

        public void test() {
            GraphClassTests t = new GraphClassTests();
            t.test();
        }
    }
    class GraphClassOld {
        class GraphNodeType1 {
            boolean isDirected_;
            final Integer id_;
            HashMap<Integer, GraphNodeType1> mapIB_;
            HashMap<Integer, GraphNodeType1> mapOB_;

            public GraphNodeType1() {
                isDirected_ = false;
                int id = getGID(true);
                id_ = new Integer(id);
                mapIB_ = new HashMap<>();
                mapOB_ = new HashMap<>();
            }

            public boolean getIsDirected() {
                return isDirected_;
            }

            public void setIsDirected(boolean isDirected) {
                isDirected_ = isDirected;
            }

            public Integer getId() {
                return id_;
            }

            public void addNode(GraphNodeType1 n) {
                if (n == null) {
                    return;
                }
                Integer id = n.getId();
                if (mapOB_.containsKey(id)) {
                    return;
                }
                mapOB_.put(id, n);
                if (isDirected_ == false) {
                    n.addNode(this);
                }
                n.addNodeInbound(this);
            }

            public void addNodeInbound(GraphNodeType1 n) {
                if (n == null) {
                    return;
                }
                Integer id = n.getId();
                if (mapIB_.containsKey(id)) {
                    return;
                }
                mapIB_.put(id, n);
                if (isDirected_ == false) {
                    n.addNodeInbound(this);
                }
            }

            public Iterator<HashMap.Entry<Integer, GraphNodeType1>> iterator() {
                return mapOB_.entrySet().iterator();
            }

            public void printInfo() {
                printInfo(null);
            }

            public void printInfo(String msg) {
                StringBuilder sb = new StringBuilder();
                if (msg != null) {
                    sb.append(msg + " ");
                }
                sb.append("GraphNode: ");
                sb.append(
                    String.format("%3d : isDirected: %d%n", id_, isDirected_));
                sb.append("    OUTBOUND: ");
                for (HashMap.Entry<Integer, GraphNodeType1> e : mapOB_
                    .entrySet()) {
                    sb.append(String.format("%3d ", e.getKey()));
                }
                sb.append("%n");
                sb.append("    INBOUND:  ");
                for (Integer k : mapIB_.keySet()) {
                    sb.append(String.format("%3d ", k));
                }
                sb.append("%n");
                System.out.printf("%s", sb.toString());
            }
        }

        class GraphObjectType1 {
        }

        class GraphNodeType2 {
            final Integer id_;

            public GraphNodeType2() {
                int id = getGID(true);
                id_ = new Integer(id);
            }

            public Integer getId() {
                return id_;
            }

            public void printInfo() {
                printInfo(null);
            }

            public void printInfo(String msg) {
                if (msg != null) {
                    System.out.printf(
                        String.format("%s GraphNodeType2:%3d%n", msg, id_));
                    return;
                }
                System.out.printf(String.format("GraphNodeType2:%3d%n", id_));
            }
        }

        class EdgeType2 {
            GraphNodeType2 nSrc_;
            GraphNodeType2 nDst_;
            int weight_;

            public EdgeType2(GraphNodeType2 nSrc, GraphNodeType2 nDst,
                int weight) {
                nSrc_ = nSrc;
                nDst_ = nDst;
                weight_ = weight;
            }

            public EdgeType2(GraphNodeType2 nSrc, GraphNodeType2 nDst) {
                this(nSrc, nDst, 1);
            }

            public EdgeType2 setNodeSrc(GraphNodeType2 n) {
                nSrc_ = n;
                return this;
            }

            public EdgeType2 setNodeDst(GraphNodeType2 n) {
                nDst_ = n;
                return this;
            }

            public EdgeType2 setWeight(int w) {
                weight_ = w;
                return this;
            }

            public int getWeight() {
                return weight_;
            }

            public GraphNodeType2 getNodeSrc() {
                return nSrc_;
            }

            public GraphNodeType2 getNodeDst() {
                return nDst_;
            }

            public void printInfo() {
                printInfo(null);
            }

            public void printInfo(String msg) {
                StringBuilder sb = new StringBuilder();
                if (msg != null) {
                    sb.append(msg + " ");
                }
                sb.append(String.format("EdgeType2 src:%3d dst:%3d w:%d",
                    nSrc_.getId(), nDst_.getId(), weight_));
                System.out.println(sb.toString());
            }
        }

        class GraphObjectType2 {
            HashMap<Integer, GraphNodeType2> mNodes_ = new HashMap<>();
            HashMap<Integer, HashMap<Integer, EdgeType2>> mEdgeIn_ = new HashMap<>();
            HashMap<Integer, HashMap<Integer, EdgeType2>> mEdgeOut_ = new HashMap<>();

            public void addNode(GraphNodeType2 n) {
                if (n == null) {
                    return;
                }
                if (mNodes_.containsKey(n.getId())) {
                    return;
                }
                mNodes_.put(n.getId(), n);
            }

            public GraphNodeType2 getNode(Integer id) {
                if (mNodes_.containsKey(id)) {
                    return mNodes_.get(id);
                }
                return mNodes_.get(id); // returns null
            }

            public void addNodeAndEdge(GraphNodeType2 n, GraphNodeType2 nDst,
                boolean isDirected) {
                addNode(n);
                addEdge(n, nDst, isDirected);
            }

            public Iterator<GraphNodeType2> iteratorNodes() {
                return mNodes_.values().iterator();
            }

            public EdgeType2 addEdgeToMap(GraphNodeType2 nSrc,
                GraphNodeType2 nDst, int weight) {
                Integer idSrc = nSrc.getId();
                Integer idDst = nDst.getId();
                EdgeType2 edge = null;

                if (mEdgeOut_.containsKey(idSrc) == false) {
                    mEdgeOut_.put(idSrc, new HashMap<Integer, EdgeType2>());
                }

                if (mEdgeOut_.get(idSrc).containsKey(idDst) == false) {
                    edge = new EdgeType2(nSrc, nDst, weight);
                    mEdgeOut_.get(idSrc).put(idDst, edge);
                } else {
                    edge = mEdgeOut_.get(idSrc).get(idDst);
                }

                if (mEdgeIn_.containsKey(idDst) == false) {
                    mEdgeIn_.put(idDst, new HashMap<Integer, EdgeType2>());
                }

                if (mEdgeIn_.get(idDst).containsKey(idSrc) == false) {
                    mEdgeIn_.get(idDst).put(idSrc, edge);
                }

                return edge;
            }

            public boolean addEdge(GraphNodeType2 nSrc, GraphNodeType2 nDst,
                boolean isDirected, int weight) {
                if (nSrc == null || nDst == null) {
                    return false;
                }
                Integer idSrc = nSrc.getId();
                Integer idDst = nDst.getId();
                if (mNodes_.containsKey(idSrc) == false
                    || mNodes_.containsKey(idDst) == false) {
                    System.out.printf("%d or %d not in map%n", idSrc, idDst);
                    return false;
                }
                addEdgeToMap(nSrc, nDst, weight);
                if (isDirected == false) {
                    addEdgeToMap(nDst, nSrc, weight);
                }

                return true;
            }

            public boolean addEdge(GraphNodeType2 nSrc, GraphNodeType2 nDst,
                boolean isDirected) {
                return addEdge(nSrc, nDst, isDirected, 1);
            }

            public boolean addEdgeDirected(GraphNodeType2 nSrc,
                GraphNodeType2 nDst) {
                return addEdge(nSrc, nDst, true, 1);
            }

            public boolean addEdgeDirected(GraphNodeType2 nSrc,
                GraphNodeType2 nDst, int weight) {
                return addEdge(nSrc, nDst, true, weight);
            }

            public void printInfoNodes(String msg) {
                if (msg != null) {
                    System.out.println(msg);
                }
                for (GraphNodeType2 n : mNodes_.values()) {
                    System.out.printf("%3d%n", n.getId());
                }
            }

            public void printInfoMapIBound(String msg) {
                if (msg != null) {
                    System.out.println(msg);
                }
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeIn_
                    .entrySet()) {
                    System.out.printf("    INCOMING to %d%n", m.getKey());
                    for (EdgeType2 e : m.getValue().values()) {
                        e.printInfo(null);
                    }
                }
            }

            public void printInfoMapOBound(String msg) {
                if (msg != null) {
                    System.out.println(msg);
                }
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeOut_
                    .entrySet()) {
                    System.out.printf("    OUTGOING from %d%n", m.getKey());
                    for (EdgeType2 e : m.getValue().values()) {
                        e.printInfo(null);
                    }
                }
            }

            public void printInfo() {
                printInfo(null);
            }

            public void printInfo(String msg) {
                System.out.printf("----------------------%n");
                if (msg != null) {
                    System.out.printf("%s: ", msg);
                }
                System.out.printf("GraphType2 printInfo%n");
                System.out.printf("    Nodes:%n");
                printInfoNodes("    ");
                System.out.printf("    Edges Inbound:%n");
                printInfoMapIBound("    ");
                System.out.printf("    Edges Outbound:%n");
                printInfoMapOBound("    ");
                System.out.printf("----------------------%n");
            }

            public void printInfoCondensed() {
                System.out.printf("----------------------%n");
                System.out.printf("GraphType2 printInfo");
                System.out.printf("%nNodes: ");
                for (GraphNodeType2 n : mNodes_.values()) {
                    System.out.printf("%2d ", n.getId());
                }
                System.out.printf("%nEdges In:");
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeIn_
                    .entrySet()) {
                    System.out.printf("%n    IN TO     %3d: ", m.getKey());
                    for (Integer dst : m.getValue().keySet()) {
                        System.out.printf("%3d ", dst);
                    }
                }
                System.out.printf("%nEdges Out:");
                for (Map.Entry<Integer, HashMap<Integer, EdgeType2>> m : mEdgeOut_
                    .entrySet()) {
                    System.out.printf("%n    OUT FROM  %3d: ", m.getKey());
                    for (Integer dst : m.getValue().keySet()) {
                        System.out.printf("%3d ", dst);
                    }
                }
                System.out.printf("%n----------------------%n");
            }
        }

        class GraphBuilder {
            GraphNodeType2 nHead_ = null;

            private void graphSetup1Type2(int numNodes, int numLevels,
                GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> aAryNode,
                boolean isDirected) {
                // helper function called by randGraph
                // add numLevels of ArrayList to aAryNode
                // distribute numNodes into numLevels of lists
                // uses semi random distribution of nodes to each ArrayList

                int numRemaining = numNodes;
                int numAvg = numNodes / numLevels;
                int noiseNeg = numAvg / 2;
                int minNodes = numAvg - noiseNeg;
                int maxNodes = numAvg;

                if (minNodes <= 0) {
                    minNodes = 1;
                }
                if (maxNodes > numNodes) {
                    maxNodes = numAvg;
                }

                for (int i = 0; i < numLevels; i++) {
                    aAryNode.add(new ArrayList<GraphNodeType2>());
                }
                // distribute the nodes to each level

                // subtract numLevels to guarantee each level has min of 1
                numRemaining -= numLevels;

                for (int i = 0; i < numLevels; i++) {
                    int numNodesInLevel = utils_.randInt(minNodes, maxNodes,
                        true);
                    if ((numNodesInLevel > numRemaining)
                        || ((i + 1) == numLevels)) {
                        numNodesInLevel = numRemaining;
                    }
                    if (numRemaining < (2 * (numLevels - i))) {
                        if (numRemaining < 2) {
                            numNodesInLevel = numRemaining;
                        } else { // numLevels-i;
                            numNodesInLevel = 2;
                        }
                    }
                    // guarantee each level has at least 1 node
                    // so do j <= numNodes instead of j < numNodes
                    System.out.printf("graphSetup1 row:%d: ", i);
                    for (int j = 0; j <= numNodesInLevel; j++) {
                        GraphNodeType2 n = new GraphNodeType2();
                        graph.addNode(n);
                        aAryNode.get(i).add(n);
                        System.out.printf("%2d ", n.getId());
                        if (i == 0 && j == 0) {
                            nHead_ = n;
                        }
                    }
                    System.out.printf("%n");
                    numRemaining -= numNodesInLevel;
                }
            }

            private Integer graphSetup2Type2GetMaxId(int numLevels, int inLevel,
                int depth, // inclusive
                ArrayList<ArrayList<GraphNodeType2>> a) {
                // return the max ID of the max Node that is
                // inLevel + depth
                if (inLevel >= numLevels) {
                    return null;
                }
                int maxId = 0;
                for (int j = 0; j <= depth; j++) {
                    int curLevel = inLevel + j;
                    if (curLevel >= numLevels) {
                        break;
                    }
                    int sz = a.get(curLevel).size() - 1;
                    maxId = a.get(curLevel).get(sz).getId();
                }
                return new Integer(maxId);
            }

            private void graphSetup2Type2(int numNodes, int numLevels,
                int maxNumEdgesPerNode, GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> a, boolean isDirected) {
                // helper function called by randGraph
                //
                // input:
                // ArrayList<ArrayList<Node>> a.size == numLevels, with
                // numNodes randomly distributed among those levels.
                // output:
                // for the top through next to last levels, make non directed
                // connections with nodes up to two levels down.
                // for the last level, if a node is unconnected, then
                // connect to a random, subsequent sibling.

                // hash each node and remove for each one visited
                HashMap<Integer, AtomicInteger> mI = new HashMap<>();
                HashMap<Integer, AtomicInteger> mO = new HashMap<>();

                Iterator<GraphNodeType2> itNodes = graph.iteratorNodes();
                while (itNodes.hasNext()) {
                    GraphNodeType2 curNode = itNodes.next();
                    mI.put(curNode.getId(), new AtomicInteger(0));
                    mO.put(curNode.getId(), new AtomicInteger(0));
                }

                int nextToLastLevel = numLevels - 1;
                GraphNodeType2 nSrc;
                GraphNodeType2 nLevelHead = null;

                // for the top to next to last level
                for (int i = 0; i < nextToLastLevel; i++) {
                    int sz = a.get(i).size() - 1;
                    int maxId = a.get(i).get(sz).getId();
                    nLevelHead = a.get(i).get(sz);

                    // have the connections from current to maxId
                    // if there is a next level, get max id of next level
                    Integer iMaxId = graphSetup2Type2GetMaxId(numLevels, i, 2,
                        a);
                    if (iMaxId != null) {
                        maxId = iMaxId.intValue();
                    }
                    for (int j = 0; j <= sz; j++) {
                        nSrc = a.get(i).get(j);
                        int numEdges = utils_.randInt(1, maxNumEdgesPerNode,
                            true);
                        for (int k = 0; k < numEdges; k++) {
                            graphSetup3Type2(nSrc, maxId, graph, mI, mO,
                                isDirected);
                        }

                        // if is directed, make sure every
                        // middle level node has an incoming edge
                        if ((isDirected == true) && (i != 0)
                            && (mI.get(nSrc.getId()).get() == 0)) {
                            int idMin = 0;
                            if (nHead_ != null) {
                                idMin = nHead_.getId().intValue();
                            }
                            int idMax = nSrc.getId().intValue() - 1;
                            int idDst = utils_.randInt(idMin, idMax, true);
                            GraphNodeType2 nDst = graph.getNode(idDst);
                            graphSetup4Type2(nDst, nSrc, graph, mI, mO,
                                isDirected);
                        }
                    }
                }

                if (nextToLastLevel <= 0) {
                    return;
                }

                // for each node in last level, connect once
                int sz = a.get(numLevels - 1).size();
                for (int j = 0; j < sz; j++) {
                    nSrc = a.get(numLevels - 1).get(j);
                    int idMin = nLevelHead.getId().intValue();
                    int idMax = nSrc.getId().intValue() - 1;
                    int idDst = utils_.randInt(idMin, idMax, true);
                    GraphNodeType2 nDst = graph.getNode(idDst);
                    graphSetup4Type2(nDst, nSrc, graph, mI, mO, isDirected);
                }
            }

            public void graphSetup3Type2(GraphNodeType2 nSrc, int maxId,
                GraphObjectType2 graph,
                HashMap<Integer, AtomicInteger> mI,
                HashMap<Integer, AtomicInteger> mO, boolean isDirected) {
                // helpder function called by graphSetup2
                // pick a random, subsequent node, and create edge

                int idSrc = nSrc.getId().intValue() + 1;
                int idDst = utils_.randInt(idSrc, maxId, true);
                GraphNodeType2 nDst = graph.getNode(idDst);
                graph.addEdge(nSrc, nDst, isDirected);

                mO.get(idSrc).incrementAndGet();
                mI.get(idDst).incrementAndGet();

                if (isDirected == false) {
                    mO.get(idDst).incrementAndGet();
                    mI.get(idSrc).incrementAndGet();
                }
            }

            public void graphSetup4Type2(GraphNodeType2 nSrc,
                GraphNodeType2 nDst, GraphObjectType2 graph,
                HashMap<Integer, AtomicInteger> mI,
                HashMap<Integer, AtomicInteger> mO, boolean isDirected) {
                // helpder function called by graphSetup2
                // create edge

                int idSrc = nSrc.getId().intValue();
                int idDst = nDst.getId().intValue();
                graph.addEdge(nSrc, nDst, isDirected);

                mO.get(idSrc).incrementAndGet();
                mI.get(idDst).incrementAndGet();

                if (isDirected == false) {
                    mO.get(idDst).incrementAndGet();
                    mI.get(idSrc).incrementAndGet();
                }
            }

            public GraphObjectType2 randGraph(int numNodes, int numLevels,
                boolean isDirected) {
                if (numLevels > (2 * numNodes)) {
                    return null;
                }

                int maxNumEdgesPerNode = 2;

                GraphObjectType2 graph = new GraphObjectType2();

                ArrayList<ArrayList<GraphNodeType2>> aAryNode = new ArrayList<>();

                graphSetup1Type2(numNodes, numLevels, graph, aAryNode,
                    isDirected);

                graphSetup2Type2(numNodes, numLevels, maxNumEdgesPerNode, graph,
                    aAryNode, isDirected);

                return graph;
            }

            public GraphObjectType2 randDirectedGraph(int numNodes,
                int numLevels) {
                return null;
            }
        }

        class GraphClassTests {
            public void t0() {
                int numLevels = 4;
                int numNodes = 16;
                boolean isDirected = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    isDirected);
                gt2.printInfoCondensed();
            }

            public void t1() throws Exception {
                int numLevels = 5;
                int numNodes = 20;
                boolean isDirected = false;
                GraphBuilder g = new GraphBuilder();
                g.randGraph(numNodes, numLevels, isDirected);
            }

            public void t2() {
                try {
                    for (int i = 0; i < 20; i++) {
                        t1();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void t3() {
                boolean isDirected = true;
                int numLevels = 4;
                int numNodes = 12;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = g.randGraph(numNodes, numLevels,
                    isDirected);
                gt2.printInfoCondensed();
            }

            public void test() {
                t3();
            }
        }

        public void test() {
            GraphClassTests t = new GraphClassTests();
            t.test();
        }
    }
    class GraphAlgorithms {
        public void comments() {
            // edge
            // weight, src, dst
            // vertex
            // symbol, list of edges
            // graph
            // map<symbol, vertex>, num vertices, num edges
            // hasCycle, preorder, postorder, stack reverse postorder
            // bfs
            // dfs
            // topo sort
            // find cycle, not a dag
            // dfs
            // return path from src:dst
            // dijkstra
            // priority q of vertices
            // path[]
            // marked[]
            // distance[]
            // while(!pq.empty())
            // get top of pq and relax distance by look at each
            // edge of vertex, calculate distance from itself
            // to dst, and if less, then replace entry in pq
            // prim mst
            //
            // vertexDistance implements Comparable<vertexDistance>
            // for priority queue in dijkstra
            //
            //
            // public static int graphID_ = 0;
            //
            // a
            //
            // b c d = 3
            //
            // e f g = 3 * 3
            //
            // h i j = 3 * 3 * 3
            //
            // k = 3 * 3 * 3 + 3
            //
        }

        class Edge implements Comparable<Edge> {
            public double weight_;
            public String src_;
            public String dst_;
            public boolean isDirected_;

            public Edge() {
                weight_ = 0.0;
                src_ = null;
                dst_ = null;
                isDirected_ = false;
            }

            public Edge weight(double w) {
                weight_ = w;
                return this;
            }

            public Edge src(String src) {
                src_ = new String(src);
                return this;
            }

            public Edge dst(String dst) {
                dst_ = new String(dst);
                return this;
            }

            public Edge isDirected(boolean isDirected) {
                isDirected_ = isDirected;
                return this;
            }

            public double weight() {
                return weight_;
            }

            public String dst() {
                return dst_;
            }

            public String src() {
                return src_;
            }

            public boolean isDirected() {
                return isDirected_;
            }

            public int compareTo(Edge e) {
                if (weight() < e.weight()) {
                    return -1;
                } else if (weight() > e.weight()) {
                    return 1;
                }
                return 0;
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                System.out.printf(
                    "Edge: src:%s dst:%s isDirected:%b weight:%.2f\n", src_,
                    dst_, isDirected_, weight_);
            }
        }

        class Vertex {
            private String symbol_;
            private int id_;
            private ArrayList<Edge> edgeList_;

            public Vertex(String symbol) {
                symbol_ = symbol;
                edgeList_ = new ArrayList<Edge>();
                id_ = graphID_++;
            }

            public String symbol() {
                return symbol_;
            }

            public int id() {
                return id_;
            }

            public ArrayList<Edge> edges() {
                return edgeList_;
            }

            public void addEdge(Edge e) {
                edgeList_.add(e);
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                System.out.printf("Vertex symbol:%s ID:%d\n", symbol_, id_);
                for (int i = 0; i < edgeList_.size(); i++) {
                    edgeList_.get(i).printInfo();
                }
            }
        }

        class Graph {
            private HashMap<String, Vertex> m_;
            private HashMap<Integer, String> mID2Sym_;
            private HashMap<String, Integer> mSym2ID_;
            private int numV_;
            private int numE_;

            public Graph() {
                m_ = new HashMap<String, Vertex>();
                mID2Sym_ = new HashMap<Integer, String>();
                mSym2ID_ = new HashMap<String, Integer>();
                numV_ = 0;
                numE_ = 0;
            }

            public void addEdge(String src, String dst, double weight,
                boolean isDirected) {
                addVertex(src);
                addVertex(dst);
                Edge e = (new Edge()).src(src).dst(dst).weight(weight)
                    .isDirected(isDirected);
                m_.get(src).addEdge(e);
                numE_++;
            }

            public void addVertex(String symbol) {
                if (!m_.containsKey(symbol)) {
                    Vertex v = new Vertex(symbol);
                    m_.put(symbol, v);
                    mSym2ID_.put(symbol, v.id());
                    mID2Sym_.put(v.id(), symbol);
                    numV_++;
                }
            }

            public Integer getVertexID(String symbol) {
                if (!mSym2ID_.containsKey(symbol)) {
                    return null;
                }
                return mSym2ID_.get(symbol);
            }

            public String getVertexSymbol(int id) {
                if (!mID2Sym_.containsKey(id)) {
                    return null;
                }
                return mID2Sym_.get(id);
            }

            public Vertex getVertex(String symbol) {
                if (m_.containsKey(symbol)) {
                    return m_.get(symbol);
                }
                return null;
            }

            public Vertex getVertex(int id) {
                return getVertex(new Integer(id));
            }

            public Vertex getVertex(Integer id) {
                String sym = getVertexSymbol(id.intValue());
                if (sym == null) {
                    return null;
                }
                return getVertex(sym);
            }

            public int numV() {
                return numV_;
            }

            public int numE() {
                return numE_;
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                Iterator<Map.Entry<String, Vertex>> it = m_.entrySet()
                    .iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Vertex> pair = it.next();
                    System.out.printf("-----------------------\n");
                    pair.getValue().printInfo();
                }
            }

            public Iterator<Map.Entry<String, Vertex>> vertices() {
                return m_.entrySet().iterator();
            }
        }

        class GraphAlgos {
            class VertexDist implements Comparable<VertexDist> {
                String s_;
                double d_;

                public VertexDist(String s, double d) {
                    s_ = s;
                    d_ = d;
                }

                public String s() {
                    return s_;
                }

                public double d() {
                    return d_;
                }

                public VertexDist s(String s) {
                    s_ = s;
                    return this;
                }

                public VertexDist d(double d) {
                    d_ = d;
                    return this;
                }

                public int compareTo(VertexDist vd) {
                    if (d() < vd.d()) {
                        return -1;
                    } else if (d() > vd.d()) {
                        return 1;
                    }
                    return 0;
                }

                public boolean equals(Object o) {
                    if (o == this) {
                        return true;
                    }
                    if (!(o instanceof VertexDist)) {
                        return false;
                    }
                    VertexDist vd = (VertexDist) o;
                    return (s_.equals(vd.s()));
                }

                public int hashCode() {
                    final int prime = 31;
                    int result = 1;
                    result = prime * result + s_.hashCode();
                    return result;
                }

                public boolean hasPrintInfo() {
                    return true;
                }

                public void printInfo() {
                    System.out.printf("VertexDist: s/d: %s/%.2f\n", s_, d_);
                }
            }

            Graph g_;
            private boolean hasCycle_;
            private Queue<String> qPre_;
            private ArrayList<String> aPre_;
            private Queue<String> qPost_;
            private Stack<String> sRevPost_;

            public GraphAlgos() {
                g_ = null;
                hasCycle_ = false;
            }

            public GraphAlgos graph(Graph g) {
                g_ = g;
                return this;
            }

            public Queue<String> qPre() {
                return qPre_;
            }

            public ArrayList<String> aPre() {
                return aPre_;
            }

            public Queue<String> qPost() {
                return qPost_;
            }

            public Stack<String> sRevPost() {
                return sRevPost_;
            }

            public void bfs(String src, String dst) {
                // O(E+V)
                int numV = g_.numV();
                boolean marked[] = new boolean[numV];
                int path[] = new int[numV];
                Queue<String> q = new LinkedList<String>();

                for (int i = 0; i < numV; i++) {
                    marked[i] = false;
                    path[i] = -1;
                }

                q.add(src);
                System.out.printf("bfs: ");
                int cnt = 0;
                while (q.size() != 0) {
                    String s = q.remove();
                    Vertex v = g_.getVertex(s);
                    System.out.printf("%s ", s);
                    if (dst.equals(s) == true) {
                        System.out.printf("\nFound %s\n", s);
                        printReversePath(v.id(), path);
                        return;
                    }
                    marked[g_.getVertexID(s)] = true;
                    ArrayList<Edge> aryEdges = v.edges();
                    for (Edge e : aryEdges) {
                        Integer idS = g_.getVertexID(s);
                        Integer idD = g_.getVertexID(e.dst());
                        if (marked[idD.intValue()] == false) {
                            q.add(e.dst());
                            marked[g_.getVertexID(e.dst())] = true;
                            path[idD.intValue()] = idS.intValue();
                        }
                    }
                    cnt++;
                    if (cnt >= 20) {
                        break;
                    }
                }
                System.out.printf("\n");
            }

            public void dfs(String src, String dst) {
                int numV = g_.numV();
                boolean marked[] = new boolean[numV];
                int path[] = new int[numV];

                for (int i = 0; i < numV; i++) {
                    marked[i] = false;
                    path[i] = -1;
                }
                Integer srcID = g_.getVertexID(src);
                Integer dstID = g_.getVertexID(dst);
                if (srcID == null || dstID == null) {
                    return;
                }
                boolean res = dfs_(srcID, dstID, marked, path);
                if (res == false) {
                    System.out.printf("dfs no path: %s to %s\n", src, dst);
                } else {
                    printReversePath(dstID.intValue(), path);
                }
            }

            private boolean dfs_(Integer src, Integer dst, boolean marked[],
                int path[]) {
                Vertex vSrc = g_.getVertex(src);
                if (marked[src.intValue()] == true) {
                    return false;
                }
                marked[src.intValue()] = true;
                if (src.intValue() == dst.intValue()) {
                    return true;
                }
                ArrayList<Edge> aryEdges = vSrc.edges();
                for (Edge e : aryEdges) {
                    Integer dstID = g_.getVertexID(e.dst());
                    if (dstID == null) {
                        return false;
                    }
                    path[dstID.intValue()] = src.intValue();
                    boolean res = dfs_(dstID, dst, marked, path);
                    if (res == true) {
                        return true;
                    }
                }
                return false;
            }

            public ArrayList<String> findNoIncomingVertices() {
                HashMap<String, Integer> m = new HashMap<String, Integer>();
                Iterator<Map.Entry<String, Vertex>> it = g_.vertices();

                // find all the vertices with no incoming edges
                // by adding ones with edges as 1 and none as 0.
                // then loop through map and return only ones that are 0.
                while (it.hasNext()) {
                    Map.Entry<String, Vertex> pair = it.next();
                    String src = pair.getKey();
                    Vertex ver = pair.getValue();
                    if (!m.containsKey(src)) {
                        m.put(src, 0);
                    }
                    ArrayList<Edge> edgeList = ver.edges();
                    ListIterator<Edge> edgeIt = edgeList.listIterator();
                    while (edgeIt.hasNext()) {
                        String dst = edgeIt.next().dst();
                        if (!m.containsKey(dst)) {
                            m.put(dst, 1);
                        } else {
                            Integer cnt = m.get(dst);
                            m.put(dst, cnt.intValue() + 1);
                        }
                    }
                }
                ArrayList<String> startVertices = new ArrayList<String>();
                Iterator<Map.Entry<String, Integer>> mapIt = m.entrySet()
                    .iterator();
                while (mapIt.hasNext()) {
                    Map.Entry<String, Integer> pair = mapIt.next();
                    if (pair.getValue().intValue() == 0) {
                        startVertices.add(pair.getKey());
                    }
                }
                return startVertices;
            }

            public int[] topoSort() {
                // find all the nodes with 0 incoming. put them in a
                // q. then do dfs for each one.
                ArrayList<String> startVertices = findNoIncomingVertices();
                int numV = g_.numV();
                boolean marked[] = new boolean[numV];
                int path[] = new int[numV];
                for (int i = 0; i < numV; i++) {
                    marked[i] = false;
                    path[i] = -1;
                }
                for (String s : startVertices) {
                    Integer srcID = g_.getVertexID(s);
                    if (findCycle_(srcID, marked, path)) {
                        System.out.printf("not a DAG\n");
                        return null;
                    }
                }
                for (String s : startVertices) {
                    System.out.printf("topo start %s\n", s);
                    Integer srcID = g_.getVertexID(s);
                    topoSort_(srcID, marked, path);
                }
                return path;
            }

            private boolean topoSort_(Integer src, boolean marked[],
                int path[]) {
                marked[src.intValue()] = true;
                Vertex vSrc = g_.getVertex(src);
                ArrayList<Edge> aryEdges = vSrc.edges();
                if (aryEdges.size() == 0) {
                    printReversePath(src.intValue(), path);
                } else {
                    for (Edge e : aryEdges) {
                        Integer dst = g_.getVertexID(e.dst());
                        path[dst.intValue()] = src.intValue();
                        if (!topoSort_(dst, marked, path)) {
                            return false;
                        }
                    }
                }
                marked[src.intValue()] = false;
                return true;
            }

            public boolean findCycle() {
                ArrayList<String> startVertices = findNoIncomingVertices();
                int numV = g_.numV();
                boolean marked[] = new boolean[numV];
                int path[] = new int[numV];
                // init each as false, and go through each vertex with
                // no incoming edge to do dfs.
                for (int i = 0; i < numV; i++) {
                    marked[i] = false;
                    path[i] = -1;
                }
                // i think path and marked should be reset for each start
                // because they may converge with old paths, which may be
                // false cycles
                for (String s : startVertices) {
                    Integer srcID = g_.getVertexID(s);
                    if (findCycle_(srcID, marked, path)) {
                        return true;
                    }
                }
                System.out.printf("No cycle found\n");
                return false;
            }

            private boolean findCycle_(Integer src, boolean marked[],
                int path[]) {
                // recursively call each vertex for edges. any edges that
                // have dst as marked means it's a cycle.
                // do the reverse of path[dst] = src as the traceback.
                Vertex vSrc = g_.getVertex(src);
                marked[src.intValue()] = true;
                ArrayList<Edge> aryEdges = vSrc.edges();
                if (aryEdges.size() != 0) {
                    for (Edge e : aryEdges) {
                        Integer dst = g_.getVertexID(e.dst());
                        path[dst.intValue()] = src.intValue();
                        if (marked[dst.intValue()] == true) {
                            System.out.printf("Cycle found\n");
                            printReversePath(src.intValue(), path);
                            return true;
                        }
                        if (findCycle_(dst, marked, path)) {
                            return true;
                        }
                    }
                }
                marked[src.intValue()] = false;
                return false;
            }

            private void printReversePath(int src, int path[]) {
                Stack<String> tracePath = new Stack<String>();
                int i = src;
                int lastVal = -1;
                tracePath.push(g_.getVertexSymbol(i));
                while (path[i] != -1 && path[i] != src && i != lastVal) {
                    lastVal = i;
                    i = path[i];
                    tracePath.push(g_.getVertexSymbol(i));
                }
                System.out.printf("path: ");
                while (tracePath.size() != 0) {
                    System.out.printf("%s ", tracePath.pop());
                }
                System.out.printf("\n");
            }

            public boolean hasCycle() {
                return hasCycle_;
            }

            public void order() {
                int numV = g_.numV();
                boolean m[] = new boolean[numV];
                qPre_ = new LinkedList<String>();
                aPre_ = new ArrayList<String>();
                qPost_ = new LinkedList<String>();
                sRevPost_ = new Stack<String>();
                for (int i = 0; i < numV; i++) {
                    m[i] = false;
                }
                for (int i = 0; i < numV; i++) {
                    if (m[i] == false) {
                        dfs(i, m);
                    }
                }
            }

            public void dfs(int i, boolean m[]) {
                Vertex v = g_.getVertex(i);
                m[i] = true;
                qPre_.add(v.symbol());
                aPre_.add(v.symbol());
                ArrayList<Edge> ae = v.edges();
                for (Edge e : ae) {
                    int iDst = g_.getVertexID(e.dst());
                    if (m[iDst] == false) {
                        dfs(iDst, m);
                    }
                }
                qPost_.add(v.symbol());
                sRevPost_.add(v.symbol());
                // stack reverse post order is topological sort
            }

            public void dijkstra(String src, String dst) {
                PriorityQueue<VertexDist> pq = new PriorityQueue<VertexDist>();
                int numV = g_.numV();
                int path[] = new int[numV];
                boolean marked[] = new boolean[numV];
                double distance[] = new double[numV];
                int ipDst = g_.getVertexID(dst).intValue();

                for (int i = 0; i < numV; i++) {
                    path[i] = -1;
                    marked[i] = false;
                    distance[i] = Double.MAX_VALUE;
                }
                Integer id = g_.getVertexID(src);
                distance[id.intValue()] = 0;

                // add the vertex with the distance value as priority
                // keep adding dst, dist into priority for each smaller val.
                // if pq already has dst in this case, then replace the
                // larger val with smaller priority by remove then add.
                // complexity is O((E+V)logV) => O(ElogV)
                pq.add(new VertexDist(src, 0.0));
                while (pq.size() != 0) {
                    VertexDist vd = pq.poll();
                    relaxDistance(vd, distance, path, pq);
                }
                if (path[ipDst] != -1) {
                    System.out.printf("path found: %s->%s: \n", src, dst);
                    printReversePath(ipDst, path);
                } else {
                    System.out.printf("no path found: %s->%s\n", src, dst);
                }
            }

            private void relaxDistance(VertexDist vd, double distance[],
                int path[], PriorityQueue<VertexDist> pq) {
                Vertex vSrc = g_.getVertex(vd.s());
                int iSrc = g_.getVertexID(vd.s()).intValue();
                ArrayList<Edge> ae = vSrc.edges();

                for (Edge e : ae) {
                    int iDst = g_.getVertexID(e.dst()).intValue();
                    if (distance[iDst] > distance[iSrc] + e.weight()) {
                        distance[iDst] = distance[iSrc] + e.weight();
                        path[iDst] = iSrc;
                        VertexDist vdReplace = new VertexDist(e.dst(),
                            distance[iDst]);
                        if (pq.contains(vdReplace)) {
                            pq.remove(vdReplace);
                        }
                        pq.add(vdReplace);
                    }
                }
            }

            public void printDistanceTable(double d[], int p[]) {
                System.out.printf("distance table:\n");
                for (int i = 0; i < d.length; i++) {
                    double dVal = d[i];
                    if (dVal == Double.MAX_VALUE) {
                        dVal = 99999.0;
                    }
                    System.out.printf("d[%s] = %4s = %.2f\n",
                        g_.getVertexSymbol(i), g_.getVertexSymbol(p[i]), dVal);
                }
            }

            public void prim() {
                PriorityQueue<Edge> pq = new PriorityQueue<Edge>();
                int numV = g_.numV();
                boolean marked[] = new boolean[numV];
                ArrayList<Edge> mst = new ArrayList<Edge>();
                int i;
                for (i = 0; i < numV; i++) {
                    marked[i] = false;
                }
                // start with arbitrary 0, which must exist
                i = 0;
                addNewEdge(i, pq, marked);
                while (pq.size() != 0) {
                    Edge e = pq.poll();
                    int iSrc = g_.getVertexID(e.src());
                    int iDst = g_.getVertexID(e.dst());
                    if (marked[iSrc] == true && marked[iDst] == true) {
                        continue;
                    }
                    mst.add(e); // at least one vertex must be not marked
                    if (marked[iSrc] == false) {
                        addNewEdge(iSrc, pq, marked);
                    }
                    if (marked[iDst] == false) {
                        addNewEdge(iDst, pq, marked);
                    }
                }
                for (i = 0; i < mst.size(); i++) {
                    Edge e = mst.get(i);
                    System.out.printf("MST edge s/d/w: %s/%s/%.2f\n", e.src(),
                        e.dst(), e.weight());
                }
            }

            private void addNewEdge(int i, PriorityQueue<Edge> pq,
                boolean marked[]) {
                Vertex v = g_.getVertex(i);
                ArrayList<Edge> ae = v.edges();

                marked[i] = true;
                for (Edge e : ae) {
                    int iDst = g_.getVertexID(e.dst());
                    if (marked[iDst] == false) {
                        pq.add(e);
                    }
                }
            }

            public void longestPath(String src, String dst) {
                int numV = g_.numV();
                int path[] = new int[numV];
                boolean marked[] = new boolean[numV];
                double distance[] = new double[numV];
                // get topologically sorted stack
                order();
                Stack<String> sRevPost = sRevPost();

                @SuppressWarnings("unchecked")
                Stack<String> sRevPostCopy = (Stack<String>) sRevPost.clone();
                System.out.printf("\nrevPost:   ");
                while (sRevPostCopy.size() != 0) {
                    System.out.printf("%s ", sRevPostCopy.pop());
                }
                System.out.printf("\n");
                for (int i = 0; i < numV; i++) {
                    path[i] = -1;
                    marked[i] = false;
                    distance[i] = Double.MIN_VALUE;
                }
                String s = sRevPost.peek();
                Integer iTmp = g_.getVertexID(s);
                distance[iTmp] = 0;
                // go through every node in topo path, and choose largest
                // weight.
                while (sRevPost.size() != 0) {
                    s = sRevPost.pop();
                    Vertex v = g_.getVertex(s);
                    ArrayList<Edge> ae = v.edges();
                    for (Edge e : ae) {
                        int iDst = g_.getVertexID(e.dst()).intValue();
                        if (distance[iDst] < distance[v.id()] + e.weight()) {
                            distance[iDst] = distance[v.id()] + e.weight();
                            path[iDst] = v.id();
                        }
                    }
                }
                Integer iDst = g_.getVertexID(dst);
                if (path[iDst.intValue()] != -1) {
                    System.out.printf("longest path: %s->%s\n", src, dst);
                    printReversePath(iDst.intValue(), path);
                } else {
                    System.out.printf("no longest path: %s->%s\n", src, dst);
                }
            }

            public void shortestPath(String src, String dst) {
                int numV = g_.numV();
                int path[] = new int[numV];
                boolean marked[] = new boolean[numV];
                double distance[] = new double[numV];
                order();
                Stack<String> sRevPost = sRevPost();
                for (int i = 0; i < numV; i++) {
                    path[i] = -1;
                    marked[i] = false;
                    distance[i] = Double.MAX_VALUE;
                }
                String s = sRevPost.peek();
                Integer iTmp = g_.getVertexID(s);
                distance[iTmp] = 0;
                while (sRevPost.size() != 0) {
                    s = sRevPost.pop();
                    Vertex v = g_.getVertex(s);
                    ArrayList<Edge> ae = v.edges();
                    for (Edge e : ae) {
                        int iDst = g_.getVertexID(e.dst()).intValue();
                        if (distance[iDst] > distance[v.id()] + e.weight()) {
                            distance[iDst] = distance[v.id()] + e.weight();
                            path[iDst] = v.id();
                        }
                    }
                }
                Integer iDst = g_.getVertexID(dst);
                if (path[iDst.intValue()] != -1) {
                    System.out.printf("shortest path: %s->%s\n", src, dst);
                    printReversePath(iDst.intValue(), path);
                } else {
                    System.out.printf("no shortest path: %s->%s\n", src, dst);
                }
            }

            public void bellmanFord(String src, String dst) {
                // O(E*V)
                int numV = g_.numV();
                int path[] = new int[numV];
                boolean marked[] = new boolean[numV];
                double distance[] = new double[numV];
                for (int i = 0; i < numV; i++) {
                    path[i] = -1;
                    marked[i] = false;
                    distance[i] = Double.MAX_VALUE;
                }
                Queue<String> q = new LinkedList<String>();
                int iSrc = g_.getVertexID(src).intValue();
                distance[iSrc] = 0;
                q.add(src);
                marked[iSrc] = true;
                while (q.size() != 0) {
                    String s = q.remove();
                    Vertex v = g_.getVertex(s);
                    marked[v.id()] = false;
                    ArrayList<Edge> ae = v.edges();
                    for (Edge e : ae) {
                        int iDst = g_.getVertexID(e.dst()).intValue();
                        if (distance[iDst] > distance[iSrc] + e.weight()) {
                            // check if this will form a cycle. if so,
                            // disqualify this edge permanently
                            distance[iDst] = distance[iSrc] + e.weight();
                            path[iDst] = iSrc;
                            if (marked[iDst] == false) {
                                q.add(e.dst());
                                marked[iDst] = true;
                            }
                        }
                    }
                }
                // now if loop (dist[dst] > dist[src] + e.weight)
                // then this means there's a negative weight cycle.
                // for each edge(u,v) if d[dst] > d[src] + e.w, raise err
            }
        }

        public GraphAlgorithms() {
        }

        class GraphTests {
            public GraphTests() {
            }

            public Graph tBuildGraph1() {
                // DAG for shortest and longest paths unweighted
                //
                // a-----*b----*c--+
                // | | ___* |
                // * * / |
                // d-----*e----*f*-+
                // | |
                // | *
                // +-----------*g
                //
                Graph g = new Graph();
                g.addVertex("a");
                g.addVertex("b");
                g.addVertex("c");
                g.addVertex("d");
                g.addVertex("e");
                g.addVertex("f");
                g.addVertex("g");
                g.addEdge("a", "b", 1.0, true);
                g.addEdge("a", "d", 1.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "e", 1.0, true);
                g.addEdge("c", "f", 1.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("d", "g", 1.0, true);
                g.addEdge("e", "c", 1.0, true);
                g.addEdge("e", "f", 1.0, true);
                g.addEdge("f", "g", 1.0, true);
                return g;
            }

            public Graph tBuildGraph2() {
                // cyclic path
                //
                // a-----*b----*c--+
                // | | ___* |
                // * * / |
                // d-----*e*---*f*-+
                // | |
                // | *
                // +-----------*g
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 1.0, true);
                g.addEdge("a", "d", 1.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "e", 1.0, true);
                g.addEdge("c", "f", 1.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("d", "g", 1.0, true);
                g.addEdge("e", "c", 1.0, true);
                g.addEdge("e", "f", 1.0, true);
                g.addEdge("f", "g", 1.0, true);
                g.addEdge("f", "e", 1.0, true);
                return g;
            }

            public Graph tBuildGraph3() {
                // DAG with positive weights
                //
                // a-----*b----*c--+
                // | | ___* |
                // * * / |
                // d-----*e----*f*-+
                // | |
                // | *
                // +-----------*g
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 1.0, true);
                g.addEdge("a", "d", 3.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "e", 3.0, true);
                g.addEdge("c", "f", 3.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("d", "g", 3.0, true);
                g.addEdge("e", "c", 2.0, true);
                g.addEdge("e", "f", 1.0, true);
                g.addEdge("f", "g", 1.0, true);
                return g;
            }

            public Graph tBuildGraph4() {
                // DAG with negative weights
                //
                // a-----*b----*c--+
                // | | ___* |
                // * * / |
                // d-----*e----*f*-+
                // | |__ |
                // | \* *
                // +-----------*g
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 5.0, true);
                g.addEdge("a", "d", 3.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "e", -1.0, true);
                g.addEdge("c", "f", 3.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("d", "g", 2.0, true);
                g.addEdge("e", "c", 2.0, true);
                g.addEdge("e", "g", 2.0, true);
                g.addEdge("e", "f", 1.0, true);
                g.addEdge("f", "g", -4.0, true);
                return g;
            }

            public Graph tBuildGraph5() {
                // DAG multi src multi dst
                //
                // j-----------*i-----+
                // | |
                // * |
                // a-----*b--+-*c----*+
                // | | * | |
                // * * | * |
                // h-----*d-----*e--+-*f----*+
                // | | | |
                // | +-*l * |
                // +-----------*g k
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 1.0, true);
                g.addEdge("a", "d", 1.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "e", 1.0, true);
                g.addEdge("c", "f", 1.0, true);
                g.addEdge("c", "k", 1.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("d", "g", 1.0, true);
                g.addEdge("e", "c", 1.0, true);
                g.addEdge("e", "f", 1.0, true);
                g.addEdge("e", "l", 1.0, true);
                g.addEdge("f", "g", 1.0, true);
                g.addEdge("f", "k", 1.0, true);
                g.addEdge("h", "d", 1.0, true);
                g.addEdge("i", "c", 1.0, true);
                g.addEdge("i", "k", 1.0, true);
                g.addEdge("j", "i", 1.0, true);
                return g;
            }

            public Graph tBuildGraph6() {
                // DAG multi src multi dst
                //
                // +--a b------*c--+
                // | | | +---+ |
                // | * * | * |
                // | d---+--*e*--+ f |
                // | | | | | |
                // | * | * * |
                // +-*g---+--*h------*i*-+
                // | | | | |
                // * | * * |
                // l---+ j k*-+
                //
                Graph g = new Graph();
                g.addEdge("a", "d", 1.0, true);
                g.addEdge("a", "g", 1.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "e", 1.0, true);
                g.addEdge("c", "e", 1.0, true);
                g.addEdge("c", "f", 1.0, true);
                g.addEdge("c", "i", 1.0, true);
                g.addEdge("c", "k", 1.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("d", "g", 1.0, true);
                g.addEdge("d", "h", 1.0, true);
                g.addEdge("e", "h", 1.0, true);
                g.addEdge("f", "i", 1.0, true);
                g.addEdge("g", "h", 1.0, true);
                g.addEdge("g", "l", 1.0, true);
                g.addEdge("h", "i", 1.0, true);
                g.addEdge("h", "j", 1.0, true);
                g.addEdge("i", "k", 1.0, true);
                g.addEdge("l", "e", 1.0, true);
                g.addEdge("l", "h", 1.0, true);
                return g;
            }

            public Graph tBuildGraph7() {
                // DAG
                // a--*b--*e
                // | * *
                // * | |
                // c--*d---+
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 1.0, true);
                g.addEdge("a", "c", 1.0, true);
                g.addEdge("b", "e", 1.0, true);
                g.addEdge("c", "d", 1.0, true);
                g.addEdge("d", "b", 1.0, true);
                g.addEdge("d", "e", 1.0, true);
                return g;
            }

            public Graph tBuildGraph8() {
                // DAG with positive weights
                // a--*b--*e
                // | * *
                // * | |
                // c--*d---+
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 7.0, true);
                g.addEdge("a", "c", 1.0, true);
                g.addEdge("b", "e", 1.0, true);
                g.addEdge("c", "d", 1.0, true);
                g.addEdge("d", "b", 1.0, true);
                g.addEdge("d", "e", 5.0, true);
                return g;
            }

            public Graph tBuildGraph9() {
                // DAG with negative weights
                // a--*b--*e
                // | * *
                // * | |
                // c--*d---+
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 7.0, true);
                g.addEdge("a", "c", 2.0, true);
                g.addEdge("b", "e", -1.0, true);
                g.addEdge("c", "d", 2.0, true);
                g.addEdge("d", "b", 2.0, true);
                g.addEdge("d", "e", -3.0, true);
                return g;
            }

            public Graph tBuildGraph10() {
                // DAG with positive weights
                // a-+--*b-+--*c+*h
                // | |* * |* *| |
                // * *| | *| |* *
                // d--+-*e--+-*f-*g
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 5.0, true);
                g.addEdge("a", "d", 1.0, true);
                g.addEdge("a", "e", 4.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "f", 4.0, true);
                g.addEdge("c", "g", 4.0, true);
                g.addEdge("c", "h", 1.0, true);
                g.addEdge("d", "b", 4.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("e", "b", 1.0, true);
                g.addEdge("e", "c", 4.0, true);
                g.addEdge("e", "f", 4.0, true);
                g.addEdge("f", "c", 1.0, true);
                g.addEdge("f", "g", 4.0, true);
                g.addEdge("h", "g", 1.0, true);
                return g;
            }

            public Graph tBuildGraph11() {
                // DAG with positive weights
                // used for MST where diagonals are high cost
                //
                // a-+--*b-+--*c+*h
                // | |* * |* *| |
                // * *| | *| |* *
                // d--+-*e--+-*f-*g
                //
                // expecting this
                //
                // a----*b----*c-*h
                // |
                // *
                // d----*e----*f-*g
                //
                // shortest: a d e f g
                // 1 1 1 1
                //
                // longest: a e b f c g
                // 3 2 3 3 3
                //
                Graph g = new Graph();
                g.addEdge("a", "b", 1.0, true);
                g.addEdge("a", "d", 1.0, true);
                g.addEdge("a", "e", 3.0, true);
                g.addEdge("b", "c", 1.0, true);
                g.addEdge("b", "f", 3.0, true);
                g.addEdge("c", "g", 3.0, true);
                g.addEdge("c", "h", 1.0, true);
                g.addEdge("d", "b", 3.0, true);
                g.addEdge("d", "e", 1.0, true);
                g.addEdge("e", "b", 2.0, true);
                g.addEdge("e", "c", 3.0, true);
                g.addEdge("e", "f", 1.0, true);
                g.addEdge("f", "g", 1.0, true);
                g.addEdge("f", "c", 3.0, true);
                g.addEdge("h", "g", 2.0, true);
                return g;
            }

            public void t01() {
                Graph g = tBuildGraph1();
                g.printInfo();
            }

            public void t02() {
                Graph g = tBuildGraph5();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.dfs("a", "g");
                ga.dfs("a", "j");
                ga.dfs("j", "k");
            }

            public void t03() {
                Graph g = tBuildGraph6();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.topoSort();
            }

            public void t04() {
                Graph g = tBuildGraph6();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.findCycle();
            }

            public void t05() {
                Graph g = tBuildGraph2();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.findCycle();
            }

            public void t06() {
                Graph g = tBuildGraph6();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.topoSort();
                ga.bfs("a", "k");
            }

            public void t07() {
                Graph g = tBuildGraph8();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.dijkstra("a", "e");
            }

            public void t08() {
                Graph g = tBuildGraph10();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.dijkstra("a", "g");
                ga.dijkstra("g", "a");
            }

            public void t09() {
                Graph g = tBuildGraph11();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.prim();
            }

            public void t10() {
                Graph g = tBuildGraph11();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.order();
                Queue<String> qPre = ga.qPre();
                Queue<String> qPost = ga.qPost();
                Stack<String> sRevPost = ga.sRevPost();
                System.out.printf("\npre:       ");
                while (qPre.size() != 0) {
                    System.out.printf("%s ", qPre.poll());
                }
                System.out.printf("\npost:      ");
                while (qPost.size() != 0) {
                    System.out.printf("%s ", qPost.poll());
                }
                System.out.printf("\nrevPost:   ");
                while (sRevPost.size() != 0) {
                    System.out.printf("%s ", sRevPost.pop());
                }
                System.out.printf("\n");
            }

            public void t11() {
                // Graph g = tBuildGraph11();
                Graph g = tBuildGraph1();
                GraphAlgos ga = new GraphAlgos().graph(g);
                ga.dijkstra("a", "g");
                ga.shortestPath("a", "g");
                ga.longestPath("a", "g");
            }

            public void test() {
                // t10();
                t11();
            }
        }

        public void test() {
            GraphTests t = new GraphTests();
            t.test();
        }
    }
    public enum TypeStackData {
        UNDEFINED,
        DOUBLE,
        INT,
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        BRACKET_OPEN,
        BRACKET_CLOSE,
        EQUAL,
        STRING
    }
    class EWrapper <T> {
        private T e;
        private EWrapper<T> n;
        private EWrapper<T> p;
        public EWrapper() {
            e = null;
            n = null;
            p = null;
        }
        public EWrapper(T e) {
            this();
            this.e = e;
        }
        public EWrapper<T> next() {
            return n;
        }
        public EWrapper<T> prev() {
            return p;
        }
        public EWrapper<T> next(EWrapper<T> n) {
            this.n = n;
            return this;
        }
        public EWrapper<T> prev(EWrapper<T> p) {
            this.p = p;
            return this;
        }
        public T get() {
            return e;
        }
        public EWrapper<T> set(T e) {
            this.e = e;
            return this;
        }
    }
    class StackLocal <E> {
        /*
         * RPN Reverse Polish Notation == postfix
         * 
         * every operator follows all of its operands.
         * 
         * 3 + 4 => 3 4 +
         * 3 - 4 + 5 => 3 4 - 5 +
         * 5 + ((1 + 2) * 4) - 3 => 
         *     5 1 2 + 4 * + 3 -
         *      
         * 
         * RPN removes parenthesis use. 
         * 
         */
        private EWrapper<E> h;
        private EWrapper<E> t;
        private AtomicInteger cnt;
        public StackLocal() {
            h = null;
            t = null;
            cnt = new AtomicInteger(0);
        }
        public E pop() { 
            synchronized(this) {
                E e = null;
                if(h == null && t == null) {
                    e = null;
                } else if(h == t) {
                    e = h.get();
                    h = null;
                    t = null;
                    cnt.decrementAndGet();
                } else {
                    e = h.get();
                    EWrapper<E> ewNext = h.next();
                    h.next(null);
                    ewNext.prev(null);
                    if(ewNext == t) {
                        h = t;
                    } else {
                        h = ewNext;
                    }
                    cnt.decrementAndGet();
                }
                return e;
            }
        }
        public E popHead() {
            return null;
        }
        public E popTail() {
            return null;
        }
        public void push(final E e) {
            final EWrapper<E> ew = new EWrapper<>(e);
            synchronized(this) {
                if(h == null && t == null) {
                    h = ew;
                    t = h;
                } else if(h == t) {
                    t.prev(ew);
                    ew.next(t);
                    h = ew;
                } else {
                    ew.next(h);
                    h.prev(ew);
                    h = ew;
                }
                cnt.incrementAndGet();  
            }
        }
        public void put(final E e, final int idx) {
            
        }
        public int size() {
            return cnt.get();
        }
        public void clear() {
            synchronized(this) {
                h = null;
                t = null;
                cnt.set(0);                    
            }
        }
        public E peekHead() {
            synchronized(this) {
                if(h == null && t == null) {
                    return null;
                }
                return h.get();
            }
        }
        public E peekTail() {
            synchronized(this) {
                if(h == null && t == null) {
                    return null;
                }
                return t.get();
            }
        }
        public E get(final int idx) {
            synchronized(this) {
                if(cnt.get() <= idx) {
                    return null;
                }
                EWrapper<E> ew = null;
                for(int i = 0; i <= idx; i++) {
                    if(ew == null) {
                        ew = h;
                    } else {
                        ew = ew.next();                            
                    }
                }
                if(ew != null) {
                    return ew.get();
                }
                return null;
            }
        }
        public TypeStackData getDataType(String s) {
            if(s.equals("=")) {
                return TypeStackData.EQUAL;
            }
            if(s.equals("+")) {
                return TypeStackData.PLUS;
            }
            if(s.equals("-")) {
                return TypeStackData.MINUS;
            }
            if(s.equals("*")) {
                return TypeStackData.MULTIPLY;
            }
            if(s.equals("/")) {
                return TypeStackData.DIVIDE;
            }
            if(s.equals("(")) {
                return TypeStackData.BRACKET_OPEN;
            }
            if(s.equals(")")) {
                return TypeStackData.BRACKET_CLOSE;
            }
            boolean isString = true;
            boolean isInt = true;
            boolean stop = false;
            boolean firstCharIsInt = false;
            int numDots = 0;
            
            for(int i = 0; i < s.length() && !stop; i++) {
                char c = s.charAt(i);
                int ic = Character.getNumericValue(c);
                if(Character.isLetter(ic)) {
                    isInt = false;
                    if(firstCharIsInt) {
                        return TypeStackData.UNDEFINED;
                    }
                } else if(Character.isDigit(ic)) {
                    if(i == 0) {
                        firstCharIsInt = true;
                    }
                } else if(c == '.') {
                    numDots++;
                    if(numDots > 1) {
                        return TypeStackData.UNDEFINED;
                    }
                } else if(c == '_') {
                    isInt = false;
                } else {
                    return TypeStackData.UNDEFINED;
                }
            }
            if(isInt) {
                if(numDots == 1) {
                    return TypeStackData.DOUBLE;
                }
                return TypeStackData.INT;
            }
            if(isString) {
                return TypeStackData.STRING;
            }
            return TypeStackData.UNDEFINED;
        }
        public void print(String format, Object ... args) {
            System.out.printf(format, args);
        }
        class StackTest {
            public void t01() {
                String s = "abcde";
                char []a = s.toCharArray();
                StackLocal<String> stack = new StackLocal<>();
                for(int i = 0; i < a.length; i++) {
                    stack.push(Character.toString(a[i]));
                }
                boolean res = false;
                res = stack.size() == a.length;
                assert res;
                for(int i = 0; i < stack.size(); i++) {
                    String v = stack.get(stack.size() - 1 - i);
                    res = v.equals(Character.toString(a[i]));
                    assert res;
                }
                for(int i = 0; i < a.length; i++) {
                    String v = stack.pop();
                    res = v.equals(Character.toString(a[a.length - 1 - i]));
                    assert res;
                    res = stack.size() == (a.length - 1 - i);
                    assert res;
                }
                for(int i = a.length - 1; i >= 0; i--) {
                    stack.push(Character.toString(a[i]));
                }                    
                res = stack.size() == a.length;
                assert res;
                for(int i = 0; i < stack.size(); i++) {
                    String v = stack.get(i);
                    res = v.equals(Character.toString(a[i]));
                    assert res;
                }
                for(int i = 0; i < a.length; i++) {
                    String v = stack.pop();
                    res = v.equals(Character.toString(a[i]));
                    assert res;
                    res = stack.size() == (i);
                    assert res;
                }
                res = stack.size() == 0;
                assert res;
                print("pass");
            }
            public void t02() {
                StackLocal<String> t = new StackLocal<>();
                HashMap<String, TypeStackData> map = new LinkedHashMap<>();
                map.put("aaa", TypeStackData.STRING);
                map.put("+", TypeStackData.PLUS);
                map.put("++", TypeStackData.UNDEFINED);
                map.put("-", TypeStackData.MINUS);
                map.put("*", TypeStackData.MULTIPLY);
                map.put("*+", TypeStackData.UNDEFINED);
                map.put("/", TypeStackData.DIVIDE);
                map.put("=", TypeStackData.EQUAL);
                map.put("(", TypeStackData.BRACKET_OPEN);
                map.put(")", TypeStackData.BRACKET_CLOSE);
                map.put(".", TypeStackData.UNDEFINED);
                map.put("..", TypeStackData.UNDEFINED);
                map.put("a9a", TypeStackData.STRING);
                map.put("999", TypeStackData.INT);
                map.put("9.00", TypeStackData.DOUBLE);
                map.put("9.0.1", TypeStackData.UNDEFINED);
                map.put("9ab", TypeStackData.UNDEFINED);
                map.put("(P", TypeStackData.UNDEFINED);
                map.put("P)", TypeStackData.UNDEFINED);
                map.put("mmm0", TypeStackData.STRING);
                map.put("10,", TypeStackData.INT);
                map.put("ab*", TypeStackData.STRING);
                map.put("ab(", TypeStackData.UNDEFINED);
                map.put("ab^", TypeStackData.UNDEFINED);
                map.put("=", TypeStackData.EQUAL);
                map.put("=+", TypeStackData.UNDEFINED);
                for(Map.Entry<String, TypeStackData> kv: map.entrySet()) {
                    TypeStackData sdt = t.getDataType(kv.getKey());
                    if(sdt != kv.getValue()) {
                        print("ERROR: %s expects %s, is %s\n", kv.getKey(), kv.getValue(), sdt);
                    } 
                }
            }
            public void test() {
                t02();
            }
        }
        public void test() {
            StackTest t = new StackTest();
            t.test();
        }
    }
    class ReversePolishNotation {
        StackLocal<String> stack;
        
    }
    class StringAlgorithms {
        public void comments() {
        }
        
        class SubstringTests {
            public SubstringTests() {
            }
        }
        class StringAlgorithmsProblems {
            public String denseDistinctChars(String s) {
                // detect smallest window length with highest number of
                // distinct characters. ie aabcbcdbca is dbca
                return null;
            }

            public short reverseByte(short v) {
                return 0;
            }

            public byte[] pivot(byte[] ary, int bytesPerRow) {
                // for each row, pivot each bit at center point
                return null;
            }
            
        }
        class BoyerMoore {
            /*
             * BoyerMoore
             * 
             * Supply the pattern to search for as init.
             * 
             * The input is a text string. Look for pat in 
             * text string.
             */
            int r_;
            int right_[];
            String pat_;
            public BoyerMoore(String pat) {
                init(pat);
            }
            private void init(String pat) {
                /*
                 * init right_[i] = largest index of where char occurs
                 * 
                 * pat is the input pattern to search for an 
                 * incoming input string. It should be less than 256 sz.
                 * set each char at pat to right_. 
                 */
                r_ = 256;
                right_ = new int[r_];
                pat_ = pat;
                for(int i = 0; i < r_; i++) {
                    right_[i] = -1;
                }
                for(int i = 0; i < pat_.length(); i++) {
                    right_[i] = pat_.charAt(i);
                }
            }
            public int search(String txt) {
            	/*
            	 * returns -1 if txt not found in pattern, 
            	 * else returns index to string. 
            	 * 
            	 * The pattern matching is done backwards. ie:
            	 * pat = abcd
            	 * txt = aabcde
            	 * 
            	 * Then matching is done with d,c,b,a, not a,b,c,d.
            	 * So if d is mismatch with txt, then go to next txt
            	 * idx. 
            	 */
                int szTxt = txt.length();
                int szPat = pat_.length();
                int skip  = 0;
                for(int i = 0; i < (szTxt-szPat); i += skip) {
                    skip = 0;
                    for(int j = szPat-1; j >= 0; j--) {
                        if(txt.charAt(i+j) != pat_.charAt(j)) {
                            // i+j is the char of the offset starting
                            // from i. j is just the parallel index.
                            int newSkip = j - right_[txt.charAt(i+j)];
                            skip = (newSkip > 1) ? newSkip : 1;
                        }
                    }
                    if(skip == 0) {
                        return i;   // return index of complete match
                    }
                }
                return -1;
            }
        }

        class RegExpAlgo {
            public int match(char[] regexp, char[] text) {
                if (regexp[0] == '^') {
                    return matchhere(regexp, 1, text, 0);
                }
                for(int i = 0; i < text.length; i++){
                    if (matchhere(regexp, 0, text, i) != 0) {
                        return 1;
                    }                    
                }
                return 0;
            }

            public int matchhere(char[] regexp, int i, char[] text, int j) {
                if(i >= regexp.length) {
                    return 0;
                }
                if (regexp[i] == '*') {
                    if(regexp.length == (i+1)) {
                        return 1;
                    }
                    return matchstar(regexp[i+1], regexp, i + 1, text, j);
                }
                if (regexp[i] == '$' && text.length == (j+1)) {
                    return 1;
                }
                if (regexp[i] == '.' || regexp[i] == text[j]) {
                    if(regexp.length == (i+1)) {
                        return 1;
                    }
                    return matchhere(regexp, i + 1, text, j + 1);
                }
                return 0;
            }

            public int matchstar(
                char c, char[] regexp, int i, char[] text, int j) {
                for(int k = j; k < text.length; k++) {
                    if (matchhere(regexp, i, text, k) != 0) {
                        return 1;
                    }
                }
                return 0;
            }

        }
        public void print(String format, Object ... args) {
            System.out.printf(format, args);
        }
        class ParseObject {
            public void put(int v) {
                
            }
        }
        class StringParser {
            private char[] aryDelimiters;
            private String delimiters;
            public StringParser() {
                delimiters = "*+-/{}() ;=&^";
                aryDelimiters = delimiters.toCharArray();
            }
            public StringParser(final String delimiters) {
                this.delimiters = delimiters;
                aryDelimiters = delimiters.toCharArray();
            }
            public ArrayList<String> parse(final String s) {
                ArrayList<String> list = new ArrayList<>();
                char []ary = new char[s.length()];
                int sz = 0;
                for(int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);
                    boolean isMatch = false;
                    int j;
                    for(j = 0; j < aryDelimiters.length && !isMatch; j++) {
                        if(c == aryDelimiters[j]) {
                            isMatch = true;
                        }
                    }
                    if(isMatch) {
                        if(sz != 0) {
                            String newString = new String(ary, 0, sz);
                            list.add(newString);                            
                        }
                        if(c != ' ') {
                            list.add(Character.toString(c));                            
                        }
                        sz = 0;
                    } else {
                        ary[sz++] = c;
                    }
                }
                return list;
            }
            public void t00() {
                String s0 = "{abc+123*def/ ghi};{}";
                StringParser sp = new StringParser();
                ArrayList<String> ary = sp.parse(s0);
                for(String s: ary) {
                    print("%s\n", s);
                }
            }
            public void test() {
                t00();
            }
        }
        class ReversePolishNotation {
            private InfixToPostfix postfix;
            private StringParser parser;
            public ReversePolishNotation() {
                postfix = new InfixToPostfix();
                parser = new StringParser();
            }
            public ArrayList<String> infixToPostFix(String s) throws Exception {
                ArrayList<String> listInfix = parser.parse(s);
                ArrayList<String> listPostfix = postfix.infixToPostfix(listInfix);
                return listPostfix;
            }
            public double evaluate(final String s) throws Exception {
                ArrayList<String> listPostfix = infixToPostFix(s);
                return evaluate(listPostfix);
            }
            public double evaluate(ArrayList<String> listPostfix) throws Exception {
                if(listPostfix == null) {
                    throw new Exception("RPN list is null");
                }
                Stack<Double> stack = new Stack<>();
                for(final String s: listPostfix) {
                    if(postfix.isNumeric(s)) {
                        Double d = Double.parseDouble(s);
                        stack.push(d);
                    }
                    else {
                        Integer opVal = postfix.getOpVal(s);
                        if(opVal == 0) {
                            throw new Exception(String.format("RPN op not valid: %s", s));
                        }
                        else if(opVal == 1 || opVal == 2 || opVal == 3) {
                            if(stack.size() < 2) {
                                throw new Exception(String.format(
                                        "RPN expect more than 2 in stack: %d", stack.size()));
                            }
                            Double d1 = stack.pop();
                            Double d2 = stack.pop();
                            Double d3 = 0.0;
                            if(s.equals("+")) {
                                d3 = d2 + d1;
                            }
                            else if(s.equals("-")) {
                                d3 = d2 - d1;
                            }
                            else if(s.equals("*")) {
                                d3 = d2 * d1;
                            }
                            else if(s.equals("/")) {
                                d3 = d2 / d1;
                            }
                            else if(s.equals("^")) {
                                d3 = (double)(d2.intValue() ^ d1.intValue());
                            }
                            stack.push(d3);
                        }
                    }
                }
                if(stack.size() != 1) {
                    throw new Exception(String.format(
                        "RPN stack has %d elements at end, expected 1", stack.size()));
                }
                return stack.pop().doubleValue();
            }
        }
        class InfixToPostfix {
            /*
             * Infix to Postfix Shunting Yard.
             * To be used with Reverse Polish Notation.
             */
            private HashMap<String, Integer> mapOperators;
            private final String[] listOperators = {
                    "+", "-", "/", "*", "^", "(", ")"
            };
            public InfixToPostfix() {
                initMapOp();
            }
            public void initMapOp() {
                mapOperators = new HashMap<>();
                for(String op: listOperators) {
                    Integer opVal = getOpVal(op);
                    mapOperators.put(op, opVal);
                }
            }
            public boolean isNumeric(final String str) {
                try {
                    Double.parseDouble(str);
                } catch(Exception e) {
                    return false;
                }
                return true;
            }
            public Integer getOpVal(final String op) {
                if(op == null) {
                    return 0;
                }
                switch(op) {
                    case "+":
                    case "-": return 1;
                    case "*":
                    case "/": return 2;
                    case "^": return 3;
                    case "(": return 4;
                    case ")": return 5;
                }
                return 0;
            }
            public ArrayList<String> infixToPostfix(ArrayList<String> listInfix) throws Exception {
                ArrayList<String> listPostfix = new ArrayList<>();
                Stack<String> stack = new Stack<>();
                for(final String s: listInfix) {
                    if(isNumeric(s)) {
                        listPostfix.add(s);
                    } else {
                        Integer opVal = getOpVal(s);
                        if(opVal == 0) {
                            throw new Exception(String.format("%s is not op", s));
                        }
                        if(opVal == 1 || opVal == 2 || opVal == 3) {
                            boolean stop = false;
                            while(!stop){
                                if(stack.empty()) {
                                    stop = true;
                                } else {
                                    Integer opInStack = getOpVal(stack.peek());
                                    if(opVal <= opInStack) {
                                        listPostfix.add(stack.pop());
                                    }
                                    else if(opVal == 3) {
                                        listPostfix.add(stack.pop());
                                    }
                                    else {
                                        stack.push(s);
                                        stop = true;
                                    }
                                }
                            }
                        }
                        else if(opVal == 4) {
                            stack.push(s);
                        }
                        else if(opVal == 5) {
                            boolean stop = false;
                            while(!stop) {
                                if(stack.empty()) {
                                    throw new Exception(") not found in stack");
                                }
                                Integer opInStack = getOpVal(stack.peek());
                                if(opInStack == 4) {
                                    stack.pop();
                                    stop = true;
                                }
                                else {
                                    listPostfix.add(stack.pop());
                                }
                            }
                        }
                    }
                }
                // drain the stack
                while(!stack.empty()) {
                    String sOp = stack.pop();
                    Integer opInStack = getOpVal(sOp);
                    if(opInStack == 4 || opInStack == 5) {
                        throw new Exception("( or ) found in stack while draining");
                    }
                    listPostfix.add(sOp);
                }
                return listPostfix;
            }
        }
        class StackOperator {
            private StringParser sp;
            private StackLocal<String> stack;
            private HashMap<Character, Boolean> map;
            public StackOperator() {
                sp = new StringParser();
                stack = new StackLocal<String>();
                map = new HashMap<>();
                initMap();
            }
            private void initMap() {
                String s = "abcdefghijklmnopqrstuvwxyz" +
                        "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "0123456789" +
                        "_.";
                char [] ary = s.toCharArray();
                for(int i = 0; i < ary.length; i++) {
                    map.put(new Character(ary[i]), true);
                }
            }
            private boolean isAlphaNum(final String s) {
                for(int i = 0; i < s.length(); i++) {
                    Character c = new Character(s.charAt(i));
                    if(!Boolean.TRUE.equals(map.get(c))) {
                        return false;
                    }
                }
                return true;
            }
            /*
            private boolean isNum(final String s) {
                for(int i = 0; i < s.length(); i++) {
                    try {
                        
                    } catch(Exception e) {
                        return false;
                    }
                }
                return true;
            }
            */
            private int operateEquation(ArrayList<String> l) {
                stack.clear();
                for(int i = 0; i < l.size(); i++) {
                    String s = l.get(i);
                    if(isAlphaNum(s)) {
                        stack.push(s);
                    } else if(s.equals("(")) {                        
                        stack.push(s);
                    } else if(s.equals(")")) {
                        boolean stop = false;
                        while(!stop) {
                            String s0 = stack.pop();
                            if(s0 == null || s0.equals("(")) {
                                stop = true;
                            } else {
                                
                            }
                        }
                        stack.push(s);
                    } else if(s.equals("*")) {
                        stack.push(s);
                    } else if(s.equals("/")) {
                        stack.push(s);
                    } else if(s.equals("+")) {
                        stack.push(s);
                    } else if(s.equals("-")) {
                        stack.push(s);
                    }
                }
                return 0;
            }
            public int solveEquation(String s) {
                ArrayList<String> l = sp.parse(s);
                return operateEquation(l);
            }
            public String parseJSON(String s) {
                return null;
            }
        }
        class StringTests {
            public void t00() {
                String s = "87289472112987492074921749823749821740923784";
                String pat = "2174";
                BoyerMoore t = new BoyerMoore(pat);
                int res = t.search(s);
                assert (res != -1);
                System.out.println(s);
                System.out.println(s);
                System.out.printf("boyermoore match at %d\n", res);
            }
            public void t01() {
                String pattern = "agcug";
                int sz = 50;
                String stringSet = "agcu";
                utils_.loadStringSet(stringSet);
                String stringInput = utils_.randString(sz);
                boolean res;
                res = pattern != null;
                res = stringInput != null;
                assert res;
            }
            public void t02() {
                StringBuilder sb = new StringBuilder();
                int sz = 30;
                for(int i = 0; i < sz; i++){
                    sb.append(Integer.toString(i));
                }
                char[] charAryInput = sb.toString().toCharArray();
                ArrayList<String> list = new ArrayList<>();
                list.add("12*29");
                list.add("^01*29");
                list.add("1213");
                list.add("*23*");
                //list.add("");
                String stringRegex = "12*29";
                char[] charAryRegex = stringRegex.toCharArray();
                RegExpAlgo regExpAlgo = new RegExpAlgo();
                int resInt = regExpAlgo.match(charAryRegex, charAryInput);
                boolean res = resInt != 0;
                System.out.printf("res:%s\n", res);
                //assert res : "regex is 0";
            }
            public void t03() {
                /*
                 * Basic comparison of char
                 */
                String s = "abDE";
                char[] ca = s.toCharArray();
                boolean res = false;
                for(char c: ca) {
                    res = false;
                    if(c == 'a' || c == 'b' || c == 'D' || c == 'E') {
                        res = true;
                    }
                    assert res : "c != known val";
                }
                System.out.printf("char test passed\n");
            }
            public void t04() {
                StringAlgorithmsProblems t = new StringAlgorithmsProblems();
                String s0 = "abcde";
                boolean res;
                res = s0 != null;
                res = t != null;
                assert res;
            }
            public void t05() {
                // simple calcultor
                String arye[] = {
                    "1+2+3",
                    "2+3*4"
                };
                for(String se: arye) {
                    print("%s\n", se);
                }
            }
            public void t06() {
                StringParser t = new StringParser();
                t.test();
            }
            public void test() {
                t06();
            }
        }

        public void test() {
            StringTests t = new StringTests();
            t.test();
        }
    }
    class Tries {
        class TSTNode {
            public char v_;
            public boolean bEnd_;
            public TSTNode l_;
            public TSTNode m_;
            public TSTNode r_;

            public TSTNode() {
                v_ = '\0';
                bEnd_ = false;
                l_ = null;
                m_ = null;
                r_ = null;
            }

            public TSTNode v(char v) {
                v_ = v;
                return this;
            }

            public TSTNode isEnd(boolean isEnd) {
                bEnd_ = isEnd;
                return this;
            }

            public TSTNode l(TSTNode l) {
                l_ = l;
                return this;
            }

            public TSTNode m(TSTNode m) {
                m_ = m;
                return this;
            }

            public TSTNode r(TSTNode r) {
                r_ = r;
                return this;
            }

            public char v() {
                return v_;
            }

            public boolean isEnd() {
                return bEnd_;
            }

            public TSTNode l() {
                return l_;
            }

            public TSTNode m() {
                return m_;
            }

            public TSTNode r() {
                return r_;
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                System.out.printf(
                    "TSTNode: v:%s isEnd:%b l/m/r null: %s/%s/%s\n", v_, bEnd_,
                    (l_ == null) ? "null" : "valid",
                    (m_ == null) ? "null" : "valid",
                    (r_ == null) ? "null" : "valid");
            }
        }

        class TrieNode {
            public ArrayList<TrieNode> n_;
            public char v_;
            public String s_;
            public int positionBeg_;
            public int positionEnd_;
            public int szSet_;

            public TrieNode() {
                v_ = '\0';
                szSet_ = 37;
                s_ = null;
                positionBeg_ = -1;
                positionEnd_ = -1;
                n_ = new ArrayList<TrieNode>();
                for (int i = 0; i < szSet_; i++) {
                    n_.add(null);
                }
            }

            public int sz() {
                return szSet_;
            }

            public TrieNode v(char v) {
                v_ = v;
                return this;
            }

            public TrieNode s(String s) {
                s_ = s;
                return this;
            }

            public TrieNode positions(int start, int end) {
                positionBeg_ = start;
                positionEnd_ = end;
                return this;
            }

            public String s() {
                return s_;
            }

            public int positionBegin() {
                return positionBeg_;
            }

            public int positionEnd() {
                return positionEnd_;
            }

            public boolean isEnd() {
                return (getNode(char2TrieIdx('$')) != null);
            }

            public void add(char v) {
                int i = char2TrieIdx(v);
                if (getNode(i) == null) {
                    setNode(i, new TrieNode().v(v));
                }
            }

            public void setNode(int idx, TrieNode n) {
                if (idx >= szSet_ || idx < 0) {
                    return;
                }
                n_.set(idx, n);
            }

            public TrieNode getNode(int i) {
                if (i < 0 || i >= szSet_) {
                    return null;
                }
                return n_.get(i);
            }

            public ArrayList<TrieNode> getList() {
                return n_;
            }

            public char v() {
                return v_;
            }

            public int getIndex(char v) {
                return char2TrieIdx(v);
            }

            public int char2TrieIdx(char v) {
                // 0-9 = 0-9
                // A-Z,a-z = 10-35
                // $ = 36
                // all else = -1
                int i = char2Int(v);
                // System.out.printf("char2Trie v:%s i:%d\n", v, i);
                if (i == 36) {
                    return i;
                } else if (i >= 48 && i <= 57) {
                    return (48 - i);
                } else if (i >= 65 && i <= 90) {
                    return (i - (65 - 10));
                } else if (i >= 97 && i <= 122) {
                    return (i - (97 - 10));
                }
                return -1;
            }

            public int char2Int(char v) {
                return (int) v;
                // return Character.getNumericValue(v);
            }
        }

        private TSTNode rootTST_;
        private TrieNode rootSuffix_;

        public void addStringTST(String s) {
            char ary[] = s.toCharArray();
            rootTST_ = addTST(ary, 0, rootTST_);
        }

        public TSTNode getRootTST() {
            return rootTST_;
        }

        public TrieNode getRootSuffix() {
            return rootSuffix_;
        }

        private TSTNode addTST(char ary[], int i, TSTNode n) {
            if (n == null) {
                n = new TSTNode().v(ary[i]);
                if ((i + 1) == ary.length) {
                    n.isEnd(true);
                    return n;
                }
                n.m(addTST(ary, i + 1, n.m()));
            } else if (n.v() == ary[i]) {
                n.m(addTST(ary, i + 1, n.m()));
            } else if (n.v() < ary[i]) {
                n.l(addTST(ary, i, n.l()));
            } else {
                n.r(addTST(ary, i, n.r()));
            }
            return n;
        }

        public void printTSTTree() {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            printTSTTree(rootTST_, sb, i);
        }

        private void printTSTTree(TSTNode n, StringBuilder sb, int i) {
            if (n == null) {
                return;
            }
            printTSTTree(n.l(), sb, i);
            sb.append(n.v());
            i++;
            if (n.isEnd()) {
                System.out.printf("word: %s\n", sb.toString());
            }
            printTSTTree(n.m(), sb, i);
            sb.deleteCharAt(i - 1);
            i--;
            printTSTTree(n.r(), sb, i);
        }

        private TSTNode findEndNodeTST(TSTNode n, String s, int i) {
            if (n == null) {
                return null;
            }
            if (n.v() == s.charAt(i)) {
                if ((i + 1) == s.length()) {
                    return n;
                }
                return findEndNodeTST(n.m(), s, i + 1);
            } else if (n.v() < s.charAt(i)) {
                return findEndNodeTST(n.l(), s, i);
            }
            return findEndNodeTST(n.r(), s, i);
        }

        public void printPrefixTST(String s) {
            StringBuilder sb = new StringBuilder();
            TSTNode n = findEndNodeTST(rootTST_, s, 0);
            sb.append(s);
            printTSTTree(n.m(), sb, s.length());
        }

        public void ukkonenSuffix(String s, boolean appendEnd) {
            // uses suffix links
            // uses string indices instead of characters
            // build suffix tree incrementally from left to right
            // edge labels are not single characters
            // each edge is labelled using a pair of integers [from, to]
            // these are pointers into the text. in this sense,
            // each edge has a string label of arbitrary length but
            // takes only O(1) space.
        }

        public void suffixSetString(String s, boolean appendEnd) {
            // suffix tree applications
            //
            // approximate string matching O(kn)
            // generate all strings in the k neighborhood of the pattern,
            // ie all strings within edit distance k from the pattern
            //
            // exact string matching
            // primary use of suffix tree is indexed string matching,
            // where we can afford to spend a lot of time in preprocessing
            // the text, but must answer queries very quickly
            //
            // the longest repeating factor of text is the longest string
            // that occurs at least twice in the text. it is the deepest
            // internal node in the suffix tree, or the deepest fork.
            // In case of mississippi (below), issi- fork is the deepest,
            // so longest repeating is issi, which forks to ississi
            //
            // longest common substring of S and T
            // generalized suffix tree of two strings S and T is the
            // suffix tree of the string S%T$ where % and $ are symbols
            // that don't occur elsewhere. each leaf is marked as S leaf
            // or T leaf. using depth first traversal, we determine
            // for each internal node if its subtree contains only S leafs
            // or only T leafs or both. The deepest node that contains both
            // is the longest common factor of S and T. This can be computed
            // in linear time. This can also be defined for more than 2
            // strings.
            //
            // lowest common ancestor (LCA) of two nodes u and v is the
            // deepest node that is both an ancestor of u and v. The LCA
            // of any two nodes can be computed in constant time.
            //
            // longest palindrome
            // We can use the LCA preprocessed generalized suffix tree of
            // a string T and its reverse T_r to find the longest palindrome
            // in T in linear time. Let k_i be the length of the longest
            // common extension of T[i+1] and T_r[n-i], which can be
            // computed in constant time. Then T[i-k_i i+k_i] is the
            // longest odd length palindrome with the middle at i.
            // The longest even length palindrome can be found similarly
            // in O(n) time.
            //
            // The suffix tree for string S of length n is defined as a tree
            // such that:
            // - the tree has exactly n leaves numbered from 1 to n
            // - except for the root, every internal node has at least
            // two children
            // - each edge is labeled with a non empty substring of S
            // - a suffix tree for a string S of length n can be built
            // in O(n)
            //
            // 2 ways to construct suffix tree:
            // - start from the back and add suffix each symbol added
            //
            // aabab
            //
            // r+-b--.
            // | |
            // | +--a--b--.
            // |
            // +-a--b--.
            // | |
            // | +--a--b--.
            // |
            // +--a--b--a--b--.
            //
            //
            // - start from the front and append a symbol to each leaf
            // each time, which requires a suffix link to know which
            // is a leaf
            //
            // aabab
            //
            // r+-a--a--b--a--b--.
            // | |
            // | +--b--a--b--.
            // | |
            // | +--.
            // |
            // +-b--a--b--.
            // |
            // +--.
            //
            //
            // suffix tree of mississippi
            //
            // generalized suffix tree:
            // root+--i--.
            // | +--p--p--i--.
            // | +--s--s--i--.
            // | +--s--s--i--p--p--i--.
            // |
            // +--m--i--s--s--i--s--s--i--p--p--i--.
            // |
            // +--p--i--.
            // | +--p--i--.
            // |
            // +--s--i--p--p--i--.
            // | +--s--s--i--p--p--i--.
            // +--s--i--p--p--i--.
            // +--s--s--i--p--p--i--.
            //
            // root--0+---m---1
            // |
            // 1+---i---2
            // | |
            // 6| i---.
            // | |
            // 3| i---s---s---4
            // | |
            // 4| i---p---5
            // |
            // 5+---p---6
            // |
            // 2+---s---s---3
            //
            // mississippi
            //
            // root--0+--m--1
            // 1+--i--2
            // 4+--i--5
            // 7+--i--8
            // 10+--i--$
            // 8+--p--9
            // 9+--p--10
            // 2+--s--3
            // 3+--s--4
            // 5+--s--6
            // 6+--s--7
            //
            // root-10+--m--9
            // 9+--i--8
            // 6+--i--5
            // 3+--i--2
            // 0+--i--$
            // 2+--p--1
            // 1+--p--0
            // 8+--s--7
            // 7+--s--6
            // 5+--s--4
            // 4+--s--3
            //
            //
            // root-+--i
            // | i--p--p--i
            // | i--s--s--i--p--p--i
            // | i--s--s--i--s--s--i--p--p--i
            // +--m--i--s--s--i--s--s--i--p--p--i
            // +--p--i
            // | p--p--i
            // +--s--i--p--p--i
            // s--s--i--p--p--i
            // s--i--s--s--i--p--p--i
            // s--s--i--s--s--i--p--p--i
            //
            //
            //
            if (appendEnd == true) {
                s = s + '$';
            }
            rootSuffix_ = new TrieNode();
            char ary[] = s.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ary.length; i++) {
                sb.setLength(0);
                for (int j = i; j < ary.length; j++) {
                    sb.append(ary[j]);
                }
                System.out.printf("suffixSetString %s\n", sb.toString());
                int idx = rootSuffix_.getIndex(sb.toString().charAt(0));
                rootSuffix_.setNode(idx, addStringSuffix(
                    rootSuffix_.getNode(idx), sb.toString(), 0));
            }
        }

        private TrieNode addStringSuffix(TrieNode n, String s, int i) {
            if (n == null) {
                // System.out.printf("new TrieNode: i:%d s:%s\n", i,
                // s.charAt(i));
                n = new TrieNode().v(s.charAt(i));
            }
            i++;
            if (i == s.length()) {
                return n;
            }
            int idx = n.getIndex(s.charAt(i));
            n.setNode(idx, addStringSuffix(n.getNode(idx), s, i));
            return n;
        }

        public void printSuffixTree() {
            // System.out.printf("calling printSuffixTree\n");
            StringBuilder sb = new StringBuilder();
            printSuffixTree(rootSuffix_, sb, 0);
        }

        private void printSuffixTree(TrieNode n, StringBuilder s, int iIn) {
            if (n == null) {
                return;
            }
            // System.out.printf("printSuffixTree: v:%s i:%d s:%s\n",
            // n.v(), iIn, s.toString());
            if (n != rootSuffix_) {
                s.append(n.v());
                iIn++;
            }
            if (n.v() == '$') {
                System.out.printf("suffix: %s\n", s.toString());
            }
            int sz = n.sz();
            for (int i = 0; i < sz; i++) {
                printSuffixTree(n.getNode(i), s, iIn);
            }
            if (n != rootSuffix_) {
                s.deleteCharAt(iIn - 1);
            }
        }

        public void longestCommonSubstringSmall(String s0, String s1) {
            // O(m*n) using Hirschberg algorithm
            int a[][] = new int[s0.length()][s1.length()];
            for (int i = 0; i < s0.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    if (i == 0 || j == 0) {
                        a[i][j] = 0;
                    } else if (s0.charAt(i - 1) == s1.charAt(j - 1)) {
                        a[i][j] = a[i - 1][j - 1] + 1;
                    } else {
                        a[i][j] = 0;
                    }
                }
            }
            for (int i = 0; i < s0.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    System.out.printf("%2d ", a[i][j]);
                }
                System.out.printf("\n");
            }
        }

        public void longestCommonSubstring(String s0, String s1) {
            // O(m*n) using Hirschberg algorithm
            int a[][] = new int[s0.length()][s1.length()];
            int max = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s0.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    if (i == 0 || j == 0) {
                        a[i][j] = 0;
                    } else if (s0.charAt(i - 1) == s1.charAt(j - 1)) {
                        a[i][j] = a[i - 1][j - 1] + 1;
                        if (a[i][j] >= max) {
                            max = a[i][j];
                            sb = new StringBuilder();
                            for (int k = (i - a[i][j] + 1); k < i; k++) {
                                sb.append(s0.charAt(k));
                            }
                        }
                    } else {
                        a[i][j] = 0;
                    }
                }
            }
            System.out.printf("LCS: s0:%s s1:%s = LCS:%s\n", s0, s1,
                sb.toString());
        }

        public void longestCommonSubstring0(String s0, String s1) {
            // 2 ways to do this
            // - double for loop, which is below implementation
            // look for the longest diagonal in the matrix
            // - suffix tree, build suffix tree for s0 and s1, and mark
            // overlaps. the deepest node with both marked is LCS
            // this is the wikipedia version
            int m = s0.length();
            int n = s1.length();
            int z = 0;
            StringBuilder sb = new StringBuilder();
            int a[][] = new int[m][n];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (s0.charAt(i) == s1.charAt(j)) {
                        if (i == 0 || j == 0) {
                            // if at border of i or j
                            a[i][j] = 0;
                        } else {
                            // if previously matches, increment previous val
                            a[i][j] = a[i - 1][j - 1] + 1;
                        }
                        // this is only for noting where LCS trace starts
                        if (a[i][j] > z) {
                            z = a[i][j];
                            // either store i,j or calculate beginning of lcs
                            sb = new StringBuilder();
                            for (int k = (i - z + 1); k <= i; k++) {
                                sb.append(s0.charAt(k));
                            }
                        }
                    } else {
                        a[i][j] = 0;
                    }
                }
            }
            System.out.printf("LCS: s0:%s s1:%s = LCS:%s\n", s0, s1,
                sb.toString());
        }

        public void longestRepeatedSubstring(String s) {
            // in a suffix tree, this is the deepest fork node in the
            // suffix tree, where the depth is measured by num of chars
            // traversed from root, is O(n) for string size n.
        }

        public int longestPalindromeRecursive(String s, int i, int j) {
            // if you return the max, you can also return the position
            // where max was set, and spell out the palindrome afterward
            if (i == j) {
                return 1;
            } else if (s.charAt(i) == s.charAt(j)) {
                if (i + 1 == j) {
                    return 2;
                } else {
                    return longestPalindromeRecursive(s, i + 1, j - 1) + 1;
                }
            }
            // else no palindrome, so get last biggest palindrome
            int max1 = longestPalindromeRecursive(s, i + 1, j);
            int max2 = longestPalindromeRecursive(s, i, j - 1);
            if (max1 > max2) {
                return max1;
            }
            return max2;
        }

        public void longestPalindrome(String s, int i, int j, MySet set) {
            // this doesn't work
            if (i < 0 || j >= s.length()) {
                return;
            } else if (i == j) {
                set.a(1);
            } else if (s.charAt(i) == s.charAt(j)) {
                set.b(i);
                // is this an even or odd mirror?
                if (i + 1 == j) {
                    set.a(2);
                } else {
                    set.a(set.a() + 1);
                    longestPalindrome(s, i + 1, j - 1, set);
                }
            } else {
                MySet setA = new MySet(set);
                MySet setB = new MySet(set);
                longestPalindrome(s, i + 1, j, setA);
                longestPalindrome(s, i, j - 1, setB);
                if (setA.a() > setB.a()) {
                    set.copy(setA);
                } else {
                    set.copy(setB);
                }
            }
        }

        public void longestPalindrome1(String s) {
            int len = 0, max = 0, start = 0, j = 0, k = 0;
            if (s.length() == 1) {
                return;
            }
            // basically start from beginning i if there's an even mirror,
            // see how far the mirror goes from i, and if there's an odd
            // mirror, see how far it goes from i.
            // this is O(n^2)
            for (int i = 0; i < s.length() - 1; i++) {
                // even mirror case, the +1
                for (j = i, k = i + 1, len = 0; j >= 0
                    && k < s.length(); j--, k++) {
                    if (s.charAt(j) != s.charAt(k)) {
                        break;
                    }
                    len += 2;
                    if (len > max) {
                        max = len;
                        start = j;
                    }
                }
                // odd mirror case, the +2
                for (j = i, k = i + 2, len = 1; j >= 0
                    && k < s.length(); j--, k++) {
                    if (s.charAt(j) != s.charAt(k)) {
                        break;
                    }
                    len += 2;
                    if (len > max) {
                        max = len;
                        start = j;
                    }
                }
            }
            if (max > 0) {
                System.out.printf("longest palindrome of %s: len:%d val: ", s,
                    max);
                for (int i = start; i < (start + max); i++) {
                    System.out.printf("%s", s.charAt(i));
                }
                System.out.printf("\n");
            }
        }

        public void longestPalindromeDynamic(String s) {
            System.out.printf("longestPalindomeDynamic: %s\n", s);
            int n = s.length();
            int L[][] = new int[n][n];
            int iMax = 0, jMax = 0;
            for (int i = 0; i < n; i++) {
                L[i][i] = 1;
            }
            for (int lenSubstr = 2; lenSubstr <= n; lenSubstr++) {
                for (int i = 0; i < n - lenSubstr + 1; i++) {
                    int j = i + lenSubstr - 1; // the mirror index of i
                    if (s.charAt(i) == s.charAt(j)) {
                        if (lenSubstr == 2) { // border case for initial
                            L[i][j] = 2;
                        } else { // if match, length is prev +2
                            L[i][j] = L[i + 1][j - 1] + 2;
                            iMax = i;
                            jMax = j;
                        }
                    } else if (L[i][j - 1] > L[i + 1][j]) {
                        L[i][j] = L[i][j - 1];
                    } else {
                        L[i][j] = L[i + 1][j];
                    }
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%3d", L[i][j]);
                }
                System.out.printf("\n");
            }
            StringBuilder sb = new StringBuilder();
            for (int i = iMax; i <= jMax; i++) {
                sb.append(s.charAt(i));
            }
            System.out.printf("longest Palindrome: len:%d val:%s ref:%s\n",
                L[0][n - 1], sb.toString(), s);
        }

        public int numPalindromes(String s) {
            // pivots around each letter to determine how many palindromes
            // exist. define palindrome as 3 or more symbols that can be
            // mirrored
            return -1;
        }

        public void longestPalindromicSubstring2(String s) {
            int n = s.length() - 1;
            for (int i = 0; i < n; i++) {

            }
        }

        public int kmp(String s, String pattern) {
            // find substring pattern in s
            ArrayList<Integer> prefixTable = kmpBuildPrefixTable(pattern);
            int i = 0;
            int j = 0;
            while (i < s.length()) {
                // if string matches pattern so far, inc or return result
                // else if partial match, reset j at last prefix table val
                // else if no match, inc string position
                if (s.charAt(i) == pattern.charAt(j)) {
                    if ((j + 1) == pattern.length()) {
                        return (i - j);
                    } else {
                        i++;
                        j++;
                    }
                } else if (j > 0) {
                    j = prefixTable.get(j - 1).intValue();
                } else {
                    i++;
                }
            }
            return -1;
        }

        private ArrayList<Integer> kmpBuildPrefixTable(String pattern) {
            ArrayList<Integer> freq = new ArrayList<Integer>();
            for (int i = 0; i < pattern.length(); i++) {
                freq.add(new Integer(0));
            }
            int j = 0;
            int i = 1;
            while (i < pattern.length()) {
                if (pattern.charAt(i) == pattern.charAt(j)) {
                    freq.add(new Integer(j + 1));
                    i++;
                    j++;
                } else if (j > 0) {
                    j = freq.get(j - 1).intValue();
                } else {
                    freq.add(new Integer(0));
                    i++;
                }
            }
            return freq;
        }

        class TestTries {
            public TestTries() {
            }

            public void t00() {
            }

            public void t01() {
                System.out.printf("longestCommonSubstring test\n");
                String s0 = "ccbcdeabcbcdefgfb";
                String s1 = "bcdeabcdaefcdefgcade";
                longestCommonSubstringSmall(s0, s1);
            }

            public void t02() {
                String s0 = "abcabcabcaabbbccab";
                String s1 = "asbnbcaabbbccabajh";
                s0 = "abcdefghijkl";
                s1 = "qwecdefghrty";
                // String s = "abcabcaabb";
                suffixSetString(s0, true);
                printSuffixTree();
                longestCommonSubstring(s0, s1);
                s1 = "aaaabcdedcbag";
                int len = longestPalindromeRecursive(s1, 0, s1.length() - 1);
                System.out.printf("longest of %s is %d\n", s1, len);
                longestPalindrome1(s1);
                // MySet set = new MySet();
                // longestPalindrome(s1, 0, s1.length(), set);
                // System.out.printf("longest of %s is %d starting at %d\n",
                // s1, set.a(), set.b());
            }

            public void t03() {
                String ary[] = { "so", "soon", "soap", "soup", "speed", "the",
                    "them", "this", "tree", "hi", "high",
                    "hip" };
                for (int i = 0; i < ary.length; i++) {
                    addStringTST(ary[i]);
                }
                printTSTTree();
                System.out.printf("finding all matching prefix so\n");
                printPrefixTST("so");
            }

            public void t04() {
                String s1 = "asbnbcaabbbccabajh";
                longestPalindromeDynamic(s1);
            }

            public void test() {
                t01();
                // t04();
            }
        }

        public Tries() {
            rootTST_ = null;
            rootSuffix_ = null;
        }

        public void test() {
            TestTries test = new TestTries();
            test.test();
        }
    }
    class BTreeTest {
        class BNode {
            int uid_;
            Integer i_;
            BNode nl_;
            BNode nr_;
            BNode lc_;
            BNode rc_;
            BNode np_;
            boolean dbg_;

            public BNode() {
                uid_ = -1;
                i_ = null;
                initNodes();
                dbg_ = false;
            }

            public BNode(int v) {
                uid_ = -1;
                i_ = new Integer(v);
                initNodes();
            }

            public void initNodes() {
                nl_ = null;
                nr_ = null;
                lc_ = null;
                rc_ = null;
                np_ = null;
            }

            public BNode v(int v) {
                i_ = new Integer(v);
                return this;
            }

            public Integer v() {
                return i_;
            }

            public BNode l(BNode n) {
                nl_ = n;
                return this;
            }

            public BNode l(int v) {
                return l(new BNode(v));
            }

            public BNode l() {
                return nl_;
            }

            public BNode r(BNode n) {
                nr_ = n;
                return this;
            }

            public BNode r(int v) {
                return r(new BNode(v));
            }

            public BNode r() {
                return nr_;
            }

            public BNode lc(BNode n) {
                lc_ = n;
                return this;
            }

            public BNode lc(int v) {
                return lc(new BNode(v));
            }

            public BNode lc() {
                return lc_;
            }

            public BNode rc(BNode n) {
                rc_ = n;
                return this;
            }

            public BNode rc(int v) {
                return rc(new BNode(v));
            }

            public BNode rc() {
                return rc_;
            }

            public BNode p(BNode n) {
                np_ = n;
                return this;
            }

            public BNode p(int v) {
                return p(new BNode(v));
            }

            public BNode p() {
                return np_;
            }

            public int i() {
                if (i_ == null) {
                    return -1;
                }
                return i_.intValue();
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                System.out.printf("BNode printInfo: %d:", i());
                if (nl_ != null) {
                    System.out.printf("l=%d:", nl_.i());
                }
                if (nr_ != null) {
                    System.out.printf("r=%d:", nr_.i());
                }
                if (lc_ != null) {
                    System.out.printf("lc=%d:", lc_.i());
                }
                if (rc_ != null) {
                    System.out.printf("rc=%d:", rc_.i());
                }
                if (np_ != null) {
                    System.out.printf("p=%d:", np_.i());
                }
                System.out.printf("---\n");
            }

            public int numSiblings() {
                // System.out.printf("numSiblings begin\n");
                // printInfo();
                int v = 0;
                BNode t = l();
                // System.out.printf("numSiblings %d left \n", v());
                while (t != null) {
                    // t.printInfo();
                    v++;
                    t = t.l();
                }
                // System.out.printf("numSiblings %d right\n", v());
                t = r();
                while (t != null) {
                    // t.printInfo();
                    v++;
                    t = t.r();
                }
                // System.out.printf("numSiblings end\n");
                return v;
            }
        }

        class BTree {
            class CheckerBT {
                HashMap<Integer, MutableInt> map_;

                public CheckerBT() {
                    map_ = new HashMap<Integer, MutableInt>();
                }

                public void addVal(int i) {
                    Integer k = new Integer(i);
                    if (map_.containsKey(k)) {
                        return;
                    }
                    MutableInt v = new MutableInt(0);
                    map_.put(k, v);
                }

                public void reset() {
                    for (Map.Entry<Integer, MutableInt> e : map_.entrySet()) {
                        e.getValue().set(0);
                    }
                }

                public boolean check(int k, int expectedV) {
                    if (!map_.containsKey(k)) {
                        return false;
                    }
                    map_.get(k).inc();
                    if (map_.get(k).get() != expectedV) {
                        return false;
                    }
                    return true;
                }

                public boolean checkAll(int expectedV) {
                    boolean ret = true;
                    for (Map.Entry<Integer, MutableInt> e : map_.entrySet()) {
                        if (e.getValue().get() != expectedV) {
                            System.out.printf("check not ok: k:%d v:%d\n",
                                e.getKey(), e.getValue().get());
                            ret = false;
                        }
                    }
                    return ret;
                }
            }

            int w_;
            BNode root_;
            BNode rootPrev_;
            int numNodes_;
            int maxCtr_;
            int maxVal_;
            CheckerBT chk_;
            boolean dbg_;

            // ------------------------------------------------------------------
            public BTree() {
                this(5);
            }

            public BTree(int width) {
                w_ = width;
                root_ = null;
                rootPrev_ = null;
                numNodes_ = 0;
                maxVal_ = 200;
                maxCtr_ = 0;
                dbg_ = false;
                chk_ = new CheckerBT();
            }

            public int numNodes() {
                return numNodes(root_);
            }

            private int numNodes(BNode n) {
                if (n == null) {
                    return 0;
                }
                BNode c = n;
                int cnt = 0;
                while (c != null) {
                    cnt++;
                    cnt += numNodes(c.lc());
                    cnt += numNodes(c.rc());
                    c = c.r();
                }
                return cnt;
            }

            public boolean compareTree(BNode c) {
                return compareTree(c, false);
            }

            private boolean compareTree(BNode c, boolean dbg) {
                return compareTree(root_, c, dbg);
            }

            public boolean compareTree(BNode n, BNode c) {
                return compareTree(n, c, false);
            }

            private boolean compareTree(BNode n, BNode c, boolean dbg) {
                if (n == null && c == null) {
                    return true;
                }
                if ((n == null && c != null) || (n != null && c == null)) {
                    return false;
                }
                if (n.v() != c.v()) {
                    return false;
                }
                while (n != null && c != null) {
                    if (!compareTree(n.lc(), c.lc(), dbg)) {
                        return false;
                    }
                    if (!compareTree(n.rc(), c.rc(), dbg)) {
                        return false;
                    }
                    n = n.r();
                    c = c.r();
                }
                return true;
            }

            public BNode copyTree() {
                return copyTree(false);
            }

            private BNode copyTree(boolean dbg) {
                if (root_ == null) {
                    return root_;
                }
                BNode n = new BNode(root_.v());
                copyTree(root_, n, dbg);
                return n;
            }

            public void setRoot(BNode n) {
                root_ = n;
            }

            public void setWidth(int w) {
                w_ = w;
            }

            public BNode getNode(int v) {
                return getNode(v, root_);
            }

            public BNode getRoot() {
                return root_;
            }

            public boolean addNode(int v) throws Exception {
                boolean retVal = true;
                try {
                    retVal = addNode(v, false);
                    if (retVal) {
                        numNodes_++;
                        if (dbg_) {
                            int numNodes = numNodes();
                            if (numNodes_ != numNodes) {
                                throw new Exception(String.format(
                                    "addNode %d, numNodes mismatch: exp:%d act:%d\n",
                                    v,
                                    numNodes_, numNodes));
                            }
                        }
                    } else {
                        System.out.printf("addNode %d retval = false\n", v);
                    }
                } catch (Exception e) {
                    throw e;
                }
                return retVal;
            }

            public boolean addNode(int v, boolean dbg) throws Exception {
                maxCtr_ = 0;
                chk_.addVal(v);
                boolean ret = true;
                if (root_ != null) {
                    ret = addNode(v, root_, dbg);
                } else {
                    root_ = new BNode(v);
                }
                try {
                    if (dbg_) {
                        checkOrdering(root_, null, null);
                    }
                } catch (Exception e) {
                    if (!dbg) {
                        if (root_ != null) {
                            BNode n = new BNode(root_.v());
                            System.out.printf("addNode exception v:%d\n", v);
                            try {
                                printTree("badTree", root_);
                            } catch (Exception e0) {
                            }
                            System.out.printf("retrace failure start:\n");
                            System.out.printf("print previous good tree:\n");
                            try {
                                printTree("prevTree", rootPrev_);
                            } catch (Exception e0) {
                            }
                            copyTree(rootPrev_, n, false);
                            root_ = n;
                            System.out.printf("restart add with debug on:\n");
                            try {
                                boolean retVal = addNode(v, true);
                                System.out.printf("done with restart %d\n", v);
                                printTree("postTree", root_);
                                return retVal;
                            } catch (Exception e2) {
                                throw e2;
                            }
                        }
                    } else {
                        System.out.printf("addNode %d caught exception:%s\n", v,
                            e.getMessage());
                        try {
                            printTree("prevTree", rootPrev_);
                        } catch (Exception e0) {
                        }
                        try {
                            printTree("badTree exception");
                        } catch (Exception e0) {
                        }
                        throw e;
                    }
                }
                if (dbg_) {
                    updatePrevTree(dbg);
                }
                return ret;
            }

            public boolean checkOrdering(BNode c, BNode p, BNode n)
                throws Exception {
                return checkOrdering(c, p, n, false);
            }

            private boolean checkOrdering(BNode c, BNode p, BNode n,
                boolean dbg) throws Exception {
                if (c == null) {
                    return true;
                }
                BNode t = c;
                while (t != null) {
                    if (p != null && n != null) {
                        if (!(p.v() < t.v() && t.v() < n.v())) {
                            throw new Exception(
                                String.format(
                                    "checkfail: !(p(%d) < c(%d) < n(%d))\n",
                                    p.v(), t.v(), n.v()));
                        }
                    } else if (p != null) {
                        if (!(p.v() < t.v())) {
                            throw new Exception(String.format(
                                "checkfail: !(p(%d) < c(%d))\n", p.v(), t.v()));
                        }
                    } else if (n != null) {
                        if (!(t.v() < n.v())) {
                            throw new Exception(String.format(
                                "checkfail: !(c(%d) < n(%d))\n", t.v(), n.v()));
                        }
                    }
                    checkOrdering(t.lc(), t.l(), t);
                    checkOrdering(t.rc(), t, t.r());
                    t = t.r();
                }
                return true;
            }

            public BNode getLMNode(BNode n) throws Exception {
                return getLMNode(n, false);
            }

            private BNode getLMNode(BNode n, boolean dbg) throws Exception {
                if (n == null) {
                    throw new Exception(
                        String.format("BTree.getLMNode n is null"));
                }
                BNode t = n;
                while (t.l() != null) {
                    t = t.l();
                }
                if (dbg) {
                    System.out.printf("getLMNode start:%d return t:%d\n", n.v(),
                        t.v());
                }
                return t;
            }

            public BNode getRMNode(BNode n) throws Exception {
                return getRMNode(n, false);
            }

            private BNode getRMNode(BNode n, boolean dbg) throws Exception {
                if (n == null) {
                    throw new Exception(
                        String.format("BTree.getLMNode n is null"));
                }
                if (dbg) {
                    System.out.printf("getRMNode start n:%d\n", n.v());
                }
                while (n.r() != null) {
                    n = n.r();
                }
                if (dbg) {
                    System.out.printf("getRMNode return n:%d\n", n.v());
                }
                return n;
            }

            public BNode getNode(BNode n, int idx) {
                return getNode(n, idx, false);
            }

            private BNode getNode(BNode n, int idx, boolean dbg) {
                if (n == null) {
                    return null;
                }
                try {
                    n = getLMNode(n);
                } catch (Exception e) {
                    System.out.printf(e.getMessage());
                }
                int i = 0;
                while (n != null) {
                    if (i == idx) {
                        return n;
                    }
                    n = n.r();
                    i++;
                }
                return null;
            }

            public void printTree() throws Exception {
                printTree(null);
            }

            public void printTree(String msg) throws Exception {
                printTree(msg, root_);
            }

            public void printTree(String msg, BNode root) throws Exception {
                printTree(msg, root, false);
            }

            private void printTree(String msg, BNode root, boolean dbg)
                throws Exception {
                // q0 is used to print and to add all LC/RC to q1
                // q1 is used to process siblings to add to q0
                //
                // 00-------------01
                // | | |
                // +-----+ +-----+ +----+
                // | | |
                // 02-----03 04-----05 06-----07
                // | | | | | |
                // +---+ +-+ +--+ +--+ +--+ +--+
                // | | | | | |
                // 10-11 12-13 14-15 16-17 18-19 20-21
                //
                // q0: 00
                // q1: --
                // loop q0 siblings and print, add children to q1
                //
                // q0: --
                // q1: 02,04,06
                // loop q1 siblings and print, add children to q0
                //
                // q0: 10,12,14,16,18,20
                // q1: --
                // loop q0 siblings and print, add children to q1
                //
                // q0: --
                // q1: --
                //
                chk_.reset();
                if (msg != null) {
                    System.out.printf("----- printTree begin:%s\n", msg);
                } else {
                    System.out.printf("----- printTree begin:\n");
                }
                if (root_ == null) {
                    System.out.printf("----- printTree end:\n");
                    return;
                }
                Queue<BNode> q0 = new LinkedList<BNode>();
                Queue<BNode> q1 = new LinkedList<BNode>();
                boolean isNoError = true;
                BNode t = root;
                q0.add(t);
                while (isNoError && (q0.size() != 0 || q1.size() != 0)) {
                    if (q0.size() != 0) {
                        while (q0.size() != 0 && isNoError) {
                            t = q0.poll();
                            isNoError = printSiblingsAddQ(t, q1);
                        }
                        System.out.printf("\n");
                    }
                    if (q1.size() != 0) {
                        while (q1.size() != 0 && isNoError) {
                            t = q1.poll();
                            isNoError = printSiblingsAddQ(t, q0);
                        }
                        System.out.printf("\n");
                    }
                }
                System.out.printf("----- printTree end:\n");
                if (!isNoError) {
                    throw new Exception(
                        String.format("Exception printTree not ok\n"));
                }
                if (!chk_.checkAll(1)) {
                    System.out.printf("printTree not ok\n");
                }
            }

            // ------------------------------------------------------------------
            private boolean printSiblingsAddQ(BNode t, Queue<BNode> q) {
                return printSiblingsAddQ(t, q, false);
            }

            private boolean printSiblingsAddQ(BNode t, Queue<BNode> q,
                boolean dbg) {
                // System.out.printf("begin printsib t == %d\n", t.v());
                try {
                    t = getLMNode(t);
                } catch (Exception e) {
                    System.out.printf(e.getMessage());
                }
                if (t == null) {
                    return true;
                }
                // print parent index for easier matching
                if (t.p() == null) {
                    System.out.printf("--:");
                } else {
                    System.out.printf("%2d:", t.p().v());
                }
                // print the siblings and add children to q0
                boolean isFirst = true;

                while (t != null) {
                    if (!chk_.check(t.v(), 1)) {
                        return false;
                    }
                    if (isFirst) {
                        System.out.printf("%2d", t.v());
                        isFirst = false;
                    } else {
                        System.out.printf(",%2d", t.v());
                    }
                    if (t.lc() != null) {
                        q.add(t.lc());
                    }
                    if (t.rc() != null) {
                        q.add(t.rc());
                    }
                    t = t.r();
                }
                System.out.printf("  "); // gap for each group
                return true;
            }

            private void updatePrevTree() {
                updatePrevTree(false);
            }

            private void updatePrevTree(boolean dbg) {
                if (root_ == null) {
                    return;
                }
                if (rootPrev_ == null) {
                    rootPrev_ = new BNode(root_.v());
                } else if (rootPrev_.v() != root_.v()) {
                    rootPrev_ = new BNode(root_.v());
                }
                copyTree(root_, rootPrev_, dbg);
            }

            private void copyTree(BNode s, BNode d) {
                copyTree(s, d, false);
            }

            private void copyTree(BNode s, BNode d, boolean dbg) {
                if ((s == null) || (d == null)) {
                    return;
                }
                BNode t = s;
                BNode n = d;
                boolean bCond = false;
                while (t != null) {
                    if (t.lc() != null) {
                        bCond = true;
                        if (n.lc() != null) {
                            if (n.lc().v() == t.lc().v()) {
                                bCond = false;
                            }
                        }
                        if (bCond == true) {
                            n.lc(new BNode(t.lc().v()));
                            n.lc().p(n);
                        }
                        copyTree(t.lc(), n.lc(), dbg);
                    }
                    if (t.rc() != null) {
                        bCond = true;
                        if (n.rc() != null) {
                            if (n.rc().v() == t.rc().v()) {
                                bCond = false;
                            }
                        }
                        if (bCond == true) {
                            n.rc(new BNode(t.rc().v()));
                            n.rc().p(n);
                        }
                        copyTree(t.rc(), n.rc(), dbg);
                    }
                    if (t.r() != null) {
                        bCond = true;
                        if (n.r() != null) {
                            if (n.r().v() == t.r().v()) {
                                bCond = false;
                            }
                        }
                        if (bCond == true) {
                            n.r(new BNode(t.r().v()));
                            n.r().l(n);
                        }
                    }
                    t = t.r();
                    n = n.r();
                }
            }

            private BNode getNode(int v, BNode n) {
                return getNode(v, n, false);
            }

            private BNode getNode(int v, BNode n, boolean dbg) {
                if (n == null) {
                    return null;
                }
                if (dbg) {
                    System.out.printf("getNode v:%d n:%d\n", v, n.v());
                }
                if (v == n.v()) {
                    return n;
                } else if (v < n.v()) {
                    if (n.r() != null) {
                        return getNode(v, n.r(), dbg);
                    }
                } else if (v > n.v()) {
                    return getNode(v, n.lc(), dbg);
                }
                return null;
            }

            private boolean addNode(int v, BNode n, boolean dbg)
                throws Exception {
                if (maxCtr_ > maxVal_) {
                    return false;
                }
                maxCtr_++;
                if (n == null) {
                    return false;
                }
                if (dbg) {
                    System.out.printf("addNode v:%d n:%d\n", v, n.v());
                }
                BNode t = null;
                if (v == n.v()) {
                    return false;
                } else if (v < n.v()) {
                    if (n.lc() != null) {
                        return addNode(v, n.lc(), dbg);
                    }
                    // add to the left side
                    if (dbg) {
                        System.out.printf("addNode v:%d left of %d\n", v,
                            n.v());
                    }
                    t = new BNode(v);
                    t.r(n);
                    t.l(n.l());
                    if (n.l() != null) {
                        n.l().r(t);
                    } else {
                        // set parent pointer if n was previously leftmost
                        try {
                            if (n.p() == null) {
                                root_ = t;
                            } else if (n.p().lc() == n) {
                                n.p().lc(t);
                                t.p(n.p());
                                n.p(null);
                            } else if (n.p().rc() == n) {
                                n.p().rc(t);
                                t.p(n.p());
                                n.p(null);
                            } else {
                            }
                        } catch (Exception e) {
                            System.out.printf("EXCEPTION: %s", e.getMessage());
                            throw e;
                        }
                    }
                    n.l(t);
                } else if (v > n.v()) {
                    if (n.rc() != null) {
                        return addNode(v, n.rc(), dbg);
                    }
                    if (n.r() != null) {
                        return addNode(v, n.r(), dbg);
                    }
                    // add to the right side
                    if (dbg) {
                        System.out.printf("addNode v:%d right of %d\n", v,
                            n.v());
                    }
                    t = new BNode(v);
                    t.r(n.r());
                    if (n.r() != null) {
                        n.r().l(t);
                    }
                    t.l(n);
                    n.r(t);
                }
                try {
                    splitNodes(t, dbg);
                } catch (Exception e) {
                    System.out.printf("EXCEPTION:" + e.getMessage());
                    throw e;
                }
                return true;
            }

            public BNode siblingWithParent(BNode n, boolean dbg)
                throws Exception {
                BNode p = null;
                BNode t = getLMNode(n, dbg);
                while (t != null) {
                    if (t.p() != null) {
                        if (p != null) {
                            throw new Exception(String.format(
                                "BTree siblingWithParent %d multi parents!",
                                n.v()));
                        }
                        p = t.p();
                    }
                    t = t.r();
                }
                if (p == null) {
                    throw new Exception(String.format(
                        "BTree siblingWithParent %d and sibs have no parent",
                        n.v()));
                }
                if (dbg) {
                    System.out.printf("siblingWithParent n:%d p:%d\n", n.v(),
                        p.v());
                }
                return p;
            }

            public void splitNodes(BNode n) throws Exception {
                splitNodes(n, false);
            }

            private void splitNodes(BNode n, boolean dbg) throws Exception {
                //
                // middle case
                // 14 moves to middle of parent
                // 50 50 14----------50
                // / / / /
                // 10--20 10--14------20 10 20
                // / / / \ /
                // 12--14--16 12 16 12 16
                // / / / \ / \ / \ / \ / \
                // 11 13 15 17 11 13 15 17 11 13 15 17
                //
                // left child case
                // 4 moves to left of parent
                // 50 50 10-----50
                // / / / /
                // 10----20 4-----10--20 4 20
                // / / / / \__
                // 2--4--6 2 6 2 6
                // / / / \ / \ / \ / \ / \
                // 1 3 5 7 1 3 5 7 1 3 5 7
                //
                // right child case
                // 24 moves right of parent and left child reconfigured
                // 50 50 20------50
                // / / / /
                // 10--20 10--20--24 10 24
                // / \ / / \__ \ / \___
                // 15 22--24--26 15 22 26 15 22 26
                // / / / / \ / / \ /
                // 21 23 25 21 23 25 21 23 25
                //
                // no parent case
                // 2--4--6 4
                // / / / \ / \__
                // 1 3 5 7 2 6
                // / \ / \
                // 1 3 5 7
                //
                // single parent, right child case
                // 10 10-----24
                // / \ / / \__
                // 8 22--24--26 8 22 26
                // / / / \ / \ / \
                // 21 23 25 27 21 23 25 27
                //
                // single parent, left child case
                // 50 24------50
                // / / /
                // 22--24--26 22 26
                // / / / \ / \ / \
                // 21 23 25 27 21 23 25 27
                //
                // 4 node case
                // 20--40--60--80 20--26----------40--60--80
                // / / / / \ / / / / / \
                // 10 / 50 70 90 10 / / 50 70 90
                // / 22--24 28--30
                // 22--24--26--28--30 / / \ /
                // / / / / 21 23 25 27
                // 21 23 25 27
                //
                // 40
                // / \_______________
                // 20--26 60--80
                // / / \________ / / \
                // 10 / 28--30 50 70 90
                // 22--24 /
                // / / \ 27
                // 21 23 25
                //
                //

                if (maxCtr_ > maxVal_) {
                    return;
                }
                maxCtr_++;
                if (n == null) {
                    return;
                }
                int v = n.numSiblings() + 1;
                if (v <= w_) {
                    if (dbg) {
                        System.out.printf("splitNodes n:%d v:%d <= width:%d\n",
                            n.v(), v, w_);
                    }
                    return;
                }
                if (dbg) {
                    try {
                        printTree("before splitnodes processes");
                    } catch (Exception e) {
                    }
                }
                int med = (int) (w_ / 2);
                BNode nlm = getLMNode(n, dbg);
                if (nlm == null) {
                    throw new Exception(String
                        .format("BTree splitNodes t == null with nlm:%d", med));
                }
                BNode t = getNode(nlm, med, dbg);
                if (t == null) {
                    throw new Exception(String
                        .format("BTree splitNodes t == null with med:%d", med));
                }
                if (dbg) {
                    System.out.printf(
                        "splitNodes n:%d lmn:%d medidx:%d medNode:%d\n", n.v(),
                        nlm.v(), med, t.v());
                }

                // 3 cases: when current level is parent's left child
                // when current level is parent's middle child
                // when current level is parent's right child

                BNode p = nlm.p(); // parent of t's leftmost sibling
                BNode l = t.l(); // t's left
                BNode r = t.r(); // t's right

                if ((l == null) || (r == null)) {
                    throw new Exception(String.format(
                        "BTree splitNodes t:%d has no left or right", t.v()));
                }

                // set the left sibling
                l.r(null);
                l.rc(t.lc());
                if (l.rc() != null) {
                    l.rc().p(l);
                }

                // set the new left child
                t.lc(nlm);
                nlm.p(t);

                // set the right sibling, but set its parent later
                r.l(null);

                // set t's new siblings for no parents
                if (p == null) {
                    if (dbg) {
                        System.out.printf("splitNodes n:%d p==null\n", n.v());
                    }
                    if (r != null) {
                        r.p(t);
                    }
                    t.rc(r);
                    t.l(null);
                    t.r(null);
                    t.p(null);
                    if (dbg) {
                        t.printInfo();
                    }
                    root_ = t;
                    if (dbg) {
                        try {
                            printTree("after splitnodes processes");
                        } catch (Exception e) {
                        }
                    }
                    return;
                }

                // set t's new siblings for parents
                BNode plm = getLMNode(p, dbg);
                BNode pp = plm.p();
                if (p.lc() == nlm) {
                    if (dbg) {
                        System.out.printf(
                            "splitNodes n:%d p.lc():%d == nlm:%d\n", n.v(),
                            p.lc().v(), nlm.v());
                    }
                    if (p.l() != null) { // middle case
                        if (dbg) {
                            System.out.printf(
                                "splitNodes n:%d p.l():%d != null\n", n.v(),
                                p.l().v());
                        }
                        p.l().r(t);
                    } else { // leftmost case
                        if (dbg) {
                            System.out.printf(
                                "splitNodes n:%d p(%d) p.l() == null\n", n.v(),
                                p.v());
                        }
                        t.p(pp);
                        if (pp != null) {
                            if (pp.lc() == plm) {
                                pp.lc(t);
                            } else {
                                pp.rc(t);
                            }
                        } else {
                            root_ = t;
                        }
                    }
                    t.l(p.l());
                    t.r(p);
                    p.l(t);

                    // set p's left child
                    p.lc(r);
                    r.p(p);
                } else if (p.rc() == nlm) {
                    if (p.r() != null) {
                        throw new Exception(String.format(
                            "BTree splitNode p %d has right", p.r().v()));
                    }
                    if (dbg) {
                        System.out.printf(
                            "splitNodes n:%d p.rc():%d == nlm:%d\n", n.v(),
                            p.rc().v(), nlm.v());
                    }
                    t.r(p.r());
                    t.l(p);
                    p.r(t);
                    p.rc(null);

                    t.rc(r);
                    r.p(t);
                } else {
                    throw new Exception(String
                        .format("BTree splitNode p != null and else case"));
                }

                if (dbg) {
                    try {
                        printTree("after splitnodes processes");
                    } catch (Exception e) {
                    }
                }
                // recurse upward
                t = getLMNode(t, dbg);
                if (dbg) {
                    System.out.printf(
                        "splitNodes n:%d recurse splitNodes(t:%d)\n", n.v(),
                        t.v());
                }
                splitNodes(t, dbg);
            }

            private void setParentNode(BNode dst, BNode src) throws Exception {
                setParentNode(dst, src, false);
            }

            private void setParentNode(BNode dst, BNode src, boolean dbg)
                throws Exception {
                if (dst == null || src == null) {
                    return;
                }
                if (src.p() == null) {
                    root_ = dst;
                }
                if (dst.p() != null) {
                    throw new Exception(String.format(
                        "exception setParentNode dst.p != null: dst=%d",
                        dst.v()));
                }
                src.p().lc(dst);
                dst.p(src.p());
                src.p(null);
            }

            private void setChildrenNode(BNode dst, BNode src)
                throws Exception {
                if (dst == null || src == null) {
                    return;
                }
            }

            public void t0() {
                updatePrevTree();
                BNode s = new BNode();
                BNode d = new BNode();
                copyTree(s, d);
                try {
                    setParentNode(d, s);
                    setChildrenNode(d, s);
                } catch (Exception e) {

                }
            }
        }

        class BTreeTests {
            public BTreeTests() {
            }

            public void t00() {
                System.out.printf("BTreeTest test printTree\n");
                // 35 75
                // 10| 25 | 40| 45 | 60|65| 80 |85
                // 8 9 |23 24 26 27|38 39|44 46|58 59| | 78 81 82| 86 87
                BNode n = new BNode(35);
                n.r(75);
                n.r().l(n);

                n.lc(10);
                n.lc().p(n);

                n.lc().r(25);
                n.lc().r().l(n.lc());

                n.rc(40);
                n.rc().p(n);

                n.rc().r(45);
                n.rc().r().l(n.rc().r());

                n.r().lc(60);
                n.r().lc().p(n.r());

                n.r().lc().r(65);
                n.r().lc().r().l(n.r().lc());

                n.r().rc(80);
                n.r().rc().p(n.r());

                n.r().rc().r(85);
                n.r().rc().r().l(n.r().rc());

                n.lc().lc(8);
                n.lc().lc().p(n.lc());

                n.lc().lc().r(9);
                n.lc().lc().r().l(n.lc().lc());

                n.lc().r().lc(23);
                n.lc().r().lc().p(n.lc().r());

                n.lc().r().lc().r(24);
                n.lc().r().lc().r().l(n.lc().r().lc());

                n.lc().r().rc(26);
                n.lc().r().rc().p(n.lc().r());

                n.lc().r().rc().r(27);
                n.lc().r().rc().r().l(n.lc().r().rc());

                n.rc().lc(38);
                n.rc().lc().p(n.rc());

                n.rc().lc().r(39);
                n.rc().lc().r().l(n.rc().lc());

                n.rc().r().lc(44);
                n.rc().r().lc().p(n.rc().r());

                n.rc().r().rc(46);
                n.rc().r().rc().p(n.rc().r());

                n.r().lc().lc(58);
                n.r().lc().lc().p(n.r().lc());

                n.r().lc().lc().r(59);
                n.r().lc().lc().r().l(n.r().lc().lc());

                n.r().rc().lc(78);
                n.r().rc().lc().p(n.r().rc());

                n.r().rc().rc(81);
                n.r().rc().rc().p(n.r().rc());

                n.r().rc().rc().r(82);
                n.r().rc().rc().r().p(n.r().rc().rc());

                n.r().rc().r().rc(86);
                n.r().rc().r().rc().p(n.r().rc().r());

                n.r().rc().r().rc().r(87);
                n.r().rc().r().rc().r().l(n.r().rc().r().rc());

                BTree bt = new BTree();
                bt.setRoot(n);
                try {
                    bt.printTree();
                } catch (Exception e) {
                }
            }

            public void t01() throws Exception {
                System.out.printf("BTree test adding nodes\n");
                BTree bt = new BTree(2);
                int a[] = { 35, 75, 10, 8, 9, 25, 23, 24, 26, 27, 40, 45, 38,
                    39, 44, 46, 60, 58, 59, 65, 80, 78, 81,
                    82, 85, 86, 87 };
                for (int i = 0; i < a.length; i++) {
                    // for(int i = 0; i < 12; i++) {
                    if (true) {
                        System.out.printf("add %d nodes:", (i + 1));
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("%d,", a[j]);
                        }
                        System.out.printf("\n");
                    }
                    bt.addNode(a[i]);
                    try {
                        bt.printTree("after addNode done");
                    } catch (Exception e) {
                    }
                }
            }

            public void t02() throws Exception {
                System.out.printf("BTree test adding nodes\n");
                BTree bt = new BTree(3);
                int sz = 100;
                int a[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    a[i] = i;
                }
                utils_.shuffle(a);
                for (int i = 0; i < a.length; i++) {
                    if (true) {
                        System.out.printf("add %d nodes:", (i + 1));
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("%d,", a[j]);
                        }
                        System.out.printf("\n");
                    }
                    bt.addNode(a[i]);
                    try {
                        bt.printTree("after addNode done");
                    } catch (Exception e) {
                    }
                }
            }

            public void t03() throws Exception {
                // System.out.printf("BTree test adding nodes\n");
                BTree bt = new BTree(5);
                int sz = 100000;
                int a[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    a[i] = i + 1;
                }
                BNode t = null;
                utils_.shuffle(a);
                boolean dbg = false;
                for (int i = 0; i < a.length; i++) {
                    if (dbg) {
                        System.out.printf("add %d nodes:", (i + 1));
                        for (int j = 0; j <= i; j++) {
                            System.out.printf("%d,", a[j]);
                        }
                        System.out.printf("\n");
                    } else {
                        // System.out.printf("add %d node=%d\n", (i+1), a[i]);
                    }
                    try {
                        bt.addNode(a[i]);
                    } catch (Exception e) {
                        System.out.printf("Exception @%d adds, v=%d", (i + 1),
                            t.v());
                        throw e;
                    }
                    if (dbg) {
                        t = bt.getRoot();
                        try {
                            bt.printTree(String
                                .format("after addNode done root:%d ", t.v()));
                        } catch (Exception e) {
                        }
                    }
                }
                if (dbg) {
                    t = bt.getRoot();
                    try {
                        bt.printTree(
                            String.format("final done root:%d ", t.v()));
                    } catch (Exception e) {
                    }
                } else {
                    t = bt.getRoot();
                    System.out.printf("final done root:%d. %d adds\n", t.v(),
                        a.length);
                }
            }

            public void test() {
                try {
                    for (int i = 0; i < 20; i++) {
                        t03();
                    }
                } catch (Exception e) {
                    System.err.printf(e.getMessage());
                }
            }
        }

        public BTreeTest() {
        }

        public void test() {
            BTreeTests t = new BTreeTests();
            t.test();
        }
    }
    class CObserverPattern {
        public void comments() {
            // implement my own observer interface
            // implement interface Observer and class Observable
            // basic setup is:
            // - group 1 has 3 talkers who listen to each other with action
            // - group 2 has 3 talkers who listen to each other with action
            // - group 1 has 1 talker who listens to anyone from group 2
            // - group 2 has 1 talker who listens to anyone from group 1
            // - commands are in an object with action type and message and src
        }

        class ObserverMsg {
            String msg_;
            int id_;
            int action_;
            int src_;
            int val_;
            int val0_;
            int res_;
            int idRsp_;

            public ObserverMsg(int src, String msg) {
                msg_ = new String(msg);
                id_ = staticObvID_++;
                src_ = src;
                action_ = -1;
                val_ = -1;
                val0_ = -1;
                res_ = -1;
                idRsp_ = -1;
            }

            public ObserverMsg action(int action) {
                action_ = action;
                return this;
            }

            public ObserverMsg val(int val) {
                val_ = val;
                return this;
            }

            public ObserverMsg res(int val) {
                res_ = val;
                return this;
            }

            public ObserverMsg idRsp(int val) {
                idRsp_ = val;
                return this;
            }

            public ObserverMsg val0(int val) {
                val0_ = val;
                return this;
            }

            public String msg() {
                return msg_;
            }

            public int id() {
                return id_;
            }

            public int src() {
                return src_;
            }

            public int val() {
                return val_;
            }

            public int val0() {
                return val0_;
            }

            public int res() {
                return res_;
            }

            public int idRsp() {
                return idRsp_;
            }

            public void printInfo() {
                printInfo(null);
            }

            public void printInfo(String sPre) {
                if (sPre == null) {
                    sPre = "";
                }
                System.out.printf("%s ObserverMsg src:%d id:%d val:%d act:%d ",
                    sPre, src_, id_, val_, action_);
                System.out.printf("res:%d idRsp:%d msg:%s\n", res_, idRsp_,
                    msg_);
            }

            public ObserverMsg newCopy() {
                ObserverMsg o = new ObserverMsg(src_, msg_);
                o.action(action_);
                o.val(val_);
                o.res(res_);
                o.idRsp(idRsp_);
                return o;
            }
        }

        class ObserverMsgValues {
            String aMsg_[] = { "instruct single", "instruct group",
                "instruct everyone", "listen single",
                "listen group", "listen everyone", "action group",
                "action everyone", "action single" };
            int aAction_[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
            Utils util_;

            public ObserverMsgValues() {
                util_ = new Utils();
                initValues();
            }

            public void initValues() {
            }

            public String randMsg() {
                return aMsg_[util_.randInt(0, aMsg_.length)];
            }

            public int randActon() {
                return aAction_[util_.randInt(0, aAction_.length)];
            }
        }

        class ObserverTalkerType1 {
            HashSet<ObserverTalkerType1> l_;
            String name_;
            int id_;
            int idGroup_;
            ObserverMsg msg_;
            ObserverMsgValues msgVals_;
            Utils utils_;

            public ObserverTalkerType1(int id, int idGroup, String name) {
                l_ = new HashSet<ObserverTalkerType1>();
                id_ = id;
                idGroup_ = idGroup;
                name_ = name;
                msg_ = null;
                msgVals_ = new ObserverMsgValues();
                utils_ = new Utils();
            }

            public int idGroup() {
                return idGroup_;
            }

            public ObserverTalkerType1 idGroup(int v) {
                idGroup_ = v;
                return this;
            }

            public void registerListener(ObserverTalkerType1 talker) {
                if (!l_.contains(talker)) {
                    l_.add(talker);
                }
            }

            public void unregisterListener(ObserverTalkerType1 talker) {
                if (l_.contains(talker)) {
                    l_.remove(talker);
                }
            }

            public void notifyObservers() {
                if (l_ == null) {
                    return;
                }
                Iterator<ObserverTalkerType1> it = l_.iterator();
                while (it.hasNext()) {
                    notifyObserver(it.next(), getMsg());
                }
            }

            public void notifyObservers(int idGroup) {
                if (l_ == null) {
                    return;
                }
                Iterator<ObserverTalkerType1> it = l_.iterator();
                while (it.hasNext()) {
                    ObserverTalkerType1 obs = it.next();
                    if (obs.idGroup() == idGroup) {
                        notifyObserver(obs, getMsg());
                    }
                }
            }

            public void notifyObserver(ObserverTalkerType1 obj,
                ObserverMsg msg) {
                obj.update(obj, msg);
            }

            public ObserverMsg getMsg() {
                return msg_;
            }

            public void setMsg(ObserverMsg msg) {
                msg_ = msg;
            }

            public void createMsg() {
                String msg = name_ + ":" + msgVals_.randMsg();
                ObserverMsg obs = new ObserverMsg(id_, msg)
                    .action(utils_.randInt(10, 20)).val(utils_.randInt(10, 20));

                if (utils_.randBool()) {
                    obs.val0(idGroup_);
                }
                setMsg(obs);
            }

            public void update(Object obj, ObserverMsg msg) {
                // obj should be == this
                msg.printInfo(String.format("rcv by %d,%s: ", id_, name_));
            }

            public void respondMsg(ObserverMsg msg) {
            }
        }

        class ObserverTalkerType2 extends Observable implements Observer {
            String name_;
            int id_;
            int idGroup_;
            ObserverMsg msg_;
            ObserverMsgValues msgVals_;
            Utils utils_;

            public void comments() {
                // Observer methods
                // update(Observable obs, Object obj)
                // Observable methods
                // void addObserver(Observer obs)
                // void deleteObserver(Observer obs)
                // protected void setChanged()
                // protected void clearChanged()
                // boolean hasChanged()
                // void notifyObservers()
                // void notifyObservers(Object obj)
                //
            }

            public ObserverTalkerType2(int id, int idGroup, String name) {
                id_ = id;
                idGroup_ = idGroup;
                name_ = name;
                msg_ = null;
                msgVals_ = new ObserverMsgValues();
                utils_ = new Utils();
            }

            public int idGroup() {
                return idGroup_;
            }

            public ObserverMsg getMsg() {
                return msg_;
            }

            public void setMsg(ObserverMsg msg) {
                msg_ = msg;
            }

            public void createMsg() {
                String msg = name_ + ":" + msgVals_.randMsg();
                ObserverMsg obs = new ObserverMsg(id_, msg)
                    .action(utils_.randInt(10, 20)).val(utils_.randInt(10, 20));

                if (utils_.randBool()) {
                    obs.val0(idGroup_);
                }
                setMsg(obs);
            }

            public void setAndNotify() {
                setChanged();
                notifyObservers(getMsg());
            }

            public void update(Observable obs, Object obj) {
                // obs should be instanceof ObserverTalkerType2, where
                // its id_ == this.id_
                if (obj instanceof ObserverMsg) {
                    ObserverMsg msg = (ObserverMsg) obj;
                    msg.printInfo(String.format("%s: dst:%d:", name_, id_));
                }
            }
        }

        class ObserverTests {
            public ObserverTests() {
            }

            public void t00() {
                int sz = 6;
                String aStr[] = { "talker1_g0", "talker2_g0", "talker3_g0",
                    "talker4_g1", "talker5_g1", "talker6_g1" };
                ArrayList<ObserverTalkerType1> l = new ArrayList<ObserverTalkerType1>();
                for (int i = 0; i < sz; i++) {
                    if (i < sz / 2) {
                        l.add(new ObserverTalkerType1(i + 1, 1, aStr[i]));
                    } else {
                        l.add(new ObserverTalkerType1(i + 1, 2, aStr[i]));
                    }
                }
                // group 1 should have 3 who talk to each other and 1 talk to
                // all
                l.get(0).registerListener(l.get(1));
                l.get(0).registerListener(l.get(2));
                l.get(1).registerListener(l.get(0));
                l.get(1).registerListener(l.get(2));
                l.get(2).registerListener(l.get(0));
                l.get(2).registerListener(l.get(1));
                l.get(2).registerListener(l.get(3));
                l.get(2).registerListener(l.get(4));
                l.get(2).registerListener(l.get(5));

                // group 2 should have 3 who talk to each other and 1 talk to
                // all
                l.get(3).registerListener(l.get(4));
                l.get(3).registerListener(l.get(5));
                l.get(4).registerListener(l.get(3));
                l.get(4).registerListener(l.get(5));
                l.get(5).registerListener(l.get(3));
                l.get(5).registerListener(l.get(4));
                l.get(5).registerListener(l.get(0));
                l.get(5).registerListener(l.get(1));
                l.get(5).registerListener(l.get(2));

                l.get(0).createMsg();
                l.get(0).notifyObservers();
                l.get(2).createMsg();
                l.get(2).notifyObservers();
                l.get(1).createMsg();
                l.get(1).notifyObservers();
                l.get(5).createMsg();
                l.get(5).notifyObservers(1);
                l.get(2).createMsg();
                l.get(2).notifyObservers(1);
            }

            public void t01() {
                int sz = 6;
                String aStr[] = { "talker1_g0", "talker2_g0", "talker3_g0",
                    "talker4_g1", "talker5_g1", "talker6_g1" };
                ArrayList<ObserverTalkerType2> l = new ArrayList<ObserverTalkerType2>();
                for (int i = 0; i < sz; i++) {
                    if (i < sz / 2) {
                        l.add(new ObserverTalkerType2(i + 1, 1, aStr[i]));
                    } else {
                        l.add(new ObserverTalkerType2(i + 1, 2, aStr[i]));
                    }
                }
                // group 1 should have 3 who talk to each other and 1 talk to
                // all
                l.get(0).addObserver(l.get(1));
                l.get(0).addObserver(l.get(2));
                l.get(1).addObserver(l.get(0));
                l.get(1).addObserver(l.get(2));
                l.get(2).addObserver(l.get(0));
                l.get(2).addObserver(l.get(1));
                l.get(2).addObserver(l.get(3));
                l.get(2).addObserver(l.get(4));
                l.get(2).addObserver(l.get(5));

                // group 2 should have 3 who talk to each other and 1 talk to
                // all
                l.get(3).addObserver(l.get(4));
                l.get(3).addObserver(l.get(5));
                l.get(4).addObserver(l.get(3));
                l.get(4).addObserver(l.get(5));
                l.get(5).addObserver(l.get(3));
                l.get(5).addObserver(l.get(4));
                l.get(5).addObserver(l.get(0));
                l.get(5).addObserver(l.get(1));
                l.get(5).addObserver(l.get(2));

                l.get(0).createMsg();
                l.get(0).setAndNotify();
                l.get(2).createMsg();
                l.get(2).setAndNotify();
                l.get(1).createMsg();
                l.get(1).setAndNotify();
                l.get(5).createMsg();
                l.get(5).setAndNotify();
                l.get(2).createMsg();
                l.get(2).setAndNotify();

            }

            public void test() {
                t01();
            }
        }

        public CObserverPattern() {
        }

        public void test() {
            ObserverTests t = new ObserverTests();
            t.test();
        }
    }
    class RegexClass {
        class RegexClassTests {
            public void test() {

            }
        }

        public void test() {

        }
    }
    class ListTests {
        class LLNode {
            public int v_;
            public LLNode n_;
            public LLNode r_;
            public LLNode n0_;
            public LLNode na_[];
            public int uid_;
            public int szNA_;

            public LLNode(int v, int uid) {
                v_ = v;
                n_ = null;
                r_ = null;
                n0_ = null;
                uid_ = uid;
                szNA_ = 0;
            }

            public LLNode(int v) {
                this(v, -1);
            }

            public void setNodeAry(int sz) {
                szNA_ = sz;
                if (szNA_ > 0) {
                    na_ = new LLNode[szNA_];
                    for (int i = 0; i < szNA_; i++) {
                        na_[i] = null;
                    }
                }
            }

            public int get() {
                return v_;
            }

            public LLNode getNext() {
                return n_;
            }

            public LLNode setNext(LLNode n) {
                n_ = n;
                return this;
            }
        }

        class LList {
            private LLNode head_;
            boolean enSorted_;
            boolean enDuplicate_;

            public LList() {
                head_ = null;
                enSorted_ = false;
                enDuplicate_ = true;
            }

            public LList(boolean enDuplicate, boolean enSorted) {
                head_ = null;
                enSorted_ = enSorted;
                enDuplicate_ = enDuplicate;
            }

            public LList setSorted(boolean enSorted) {
                if (head_ == null) {
                    enSorted_ = enSorted;
                }
                return this;
            }

            public LList setDuplicate(boolean enDuplicate) {
                if (head_ == null) {
                    enDuplicate_ = enDuplicate;
                }
                return this;
            }

            public LLNode find(int v) {
                LLNode n = head_;
                while (n != null) {
                    if (n.get() == v) {
                        return n;
                    }
                    n = n.getNext();
                }
                return null;
            }

            public boolean add(int v) {
                if (head_ == null) {
                    head_ = new LLNode(v);
                    return true;
                }
                if (enSorted_) {
                    return addSorted(v);
                }
                return addUnsorted(v);
            }

            private boolean addUnsorted(int v) {
                LLNode n = find(v);
                if (n != null && !enDuplicate_) {
                    return false;
                }
                LLNode t = new LLNode(v);
                t.setNext(head_);
                head_ = t;
                return true;
            }

            private boolean addSorted(int v) {
                LLNode n = head_;
                LLNode p = null;
                while (n != null) {
                    if (n.get() >= v) {
                        break;
                    }
                    p = n;
                    n = n.getNext();
                }
                if (n != null) {
                    if (n.get() == v && !enDuplicate_) {
                        return false;
                    }
                }
                LLNode t = new LLNode(v);
                if (n == head_) {
                    head_ = t;
                    t.setNext(n);
                } else {
                    p.setNext(t);
                    t.setNext(n);
                }
                return true;
            }

            public boolean remove(int v) {
                LLNode n = head_;
                LLNode p = null;
                boolean isDeleted = false;
                while (n != null) {
                    if (n.get() == v) {
                        if (n == head_) {
                            head_ = n.getNext();
                        } else {
                            p.setNext(n.getNext());
                        }
                        isDeleted = true;
                    } else {
                        p = n;
                    }
                    n = n.getNext();
                }
                return isDeleted;
            }

            public void printList() {
                LLNode n = head_;
                System.out.printf("printList: ");
                while (n != null) {
                    System.out.printf("%d ", n.get());
                    n = n.getNext();
                }
                System.out.printf("\n");
            }
        }

        class MergeLineIntersects {
            public void comments() {
                // given pairs [x,y), if they intersect with existing ones,
                // then merge.
                // ie: [1,5), [3,7), [8,15), [9,11), [14,20) becomes
                // [1,7), [8,20)
                // conditions to check:
                // ref -----
                // ----- x < x0 && y < x0
                // ----- x < x0 && x0 < y < y0
                // ----- x == x0 && y == y0
                // ------- x < x0 && y > y0
                // ----- x0 < x < y0 && y > y0
                // --- x0 < x < y0 && x0 < y < y0
                // ----- x > y0 && y > y0
                //
            }

            private CLinkedList<Pair<Integer, Integer>> ll_;

            public MergeLineIntersects() {
                ll_ = new CLinkedList<Pair<Integer, Integer>>();
            }

            public void insert(int x, int y) throws Exception {
                // must be [x,y) where x include, y exclude
                if (y <= x) {
                    return;
                }
                System.out.printf("call insert [%d,%d)\n", x, y);
                y--;
                Integer ix = new Integer(x);
                Integer iy = new Integer(y);
                Integer itx, ity;
                int tx, ty;
                CLLNode<Pair<Integer, Integer>> c = ll_.getHead();
                CLLNode<Pair<Integer, Integer>> p = null;
                Pair<Integer, Integer> pair;
                if (c == null) {
                    pair = new Pair<Integer, Integer>(ix, iy);
                    ll_.prepend(pair);
                    return;
                }
                boolean isPairInserted = false;
                while (c != null) {
                    itx = c.get().getOne();
                    ity = c.get().getTwo();
                    tx = itx.intValue();
                    ty = ity.intValue();

                    // System.out.printf("c: x:%d y:%d\n", tx, ty);

                    if (x < tx && y < tx) {
                        // no overlap, less than current
                        if (isPairInserted) {
                            break;
                        }
                        pair = new Pair<Integer, Integer>(ix, iy);
                        c = ll_.append(pair, p);
                        // System.out.printf(
                        // "break 000: new x,y:%d,%d, c x,y:%d,%d\n",
                        // x,y,tx,ty);
                        break;
                    } else if (x < tx && y > ty) {
                        // new consumes current
                        ll_.delete(c);
                        if (isPairInserted) {
                            break;
                        }
                        pair = new Pair<Integer, Integer>(ix, iy);
                        c = ll_.append(pair, p);
                        // System.out.printf(
                        // "cont 001: new x,y:%d,%d, c x,y:%d,%d\n", x,y,tx,ty);
                        isPairInserted = true;
                    } else if (x <= tx && y > tx && y <= ty) {
                        // x less than current, y between current
                        ll_.delete(c);
                        pair = new Pair<Integer, Integer>(ix, ity);
                        c = ll_.append(pair, p);
                        // System.out.printf(
                        // "break 002: new x,y:%d,%d, c x,y:%d,%d\n",
                        // x,y,tx,ty);
                        break;
                    } else if (x >= tx && x <= ty && y > ty) {
                        // x between current, y greater than current
                        ll_.delete(c);
                        pair = new Pair<Integer, Integer>(itx, iy);
                        c = ll_.append(pair, p);
                        // System.out.printf(
                        // "cont 003: new x,y:%d,%d, c x,y:%d,%d\n", x,y,tx,ty);
                        isPairInserted = true;
                    } else if (x >= tx && x <= ty && y >= tx && y <= ty) {
                        // new inside current
                        // System.out.printf(
                        // "break 004: new x,y:%d,%d, c x,y:%d,%d\n",
                        // x,y,tx,ty);
                        break;
                    } else if (x > ty && y > ty && c.next() == null) {
                        // new greater than current and no more beyond
                        pair = new Pair<Integer, Integer>(ix, iy);
                        c = ll_.append(pair, c);
                        // System.out.printf(
                        // "break 005: new x,y:%d,%d, c x,y:%d,%d\n",
                        // x,y,tx,ty);
                        break;
                    } else {
                        // System.out.printf(
                        // "cont 006: --- x,y:%d,%d, c x,y:%d,%d\n", x,y,tx,ty);
                    }
                    p = c;
                    c = c.next();
                }
                // System.out.printf("insert return\n");
            }

            public void printInfo() {
                CLLNode<Pair<Integer, Integer>> c = ll_.getHead();
                Integer x, y;
                Pair<Integer, Integer> p;
                int i = 0;
                while (c != null) {
                    p = c.get();
                    x = p.getOne();
                    y = p.getTwo();
                    System.out.printf("%3d: x:%6d y:%6d\n", i, x, y);
                    i++;
                    c = c.next();
                }
            }
        }

        class ListTestCases {
            Utils utils_;

            public ListTestCases() {
                utils_ = new Utils();
            }

            public void t0() {
                System.out.printf("new list !sorted && duplicate\n");
                LList list_ = new LList().setSorted(false).setDuplicate(true);
                int a[] = { 9, 1, 8, 2, 3, 7, 4, 5, 6 };
                int b[] = { 11, 15, 12, 13, 14, 1, 2, 3, 9, 1, 8, 2, 3, 7, 4, 5,
                    6 };
                for (int i = 0; i < a.length; i++) {
                    list_.add(a[i]);
                }
                for (int i = 0; i < b.length; i++) {
                    list_.add(b[i]);
                }
                list_.printList();
                for (int i = 0; i < b.length; i++) {
                    list_.remove(b[i]);
                }
                list_.printList();

                System.out.printf("new list sorted && duplicate\n");
                list_ = new LList().setSorted(true).setDuplicate(true);
                for (int i = 0; i < a.length; i++) {
                    list_.add(a[i]);
                }
                for (int i = 0; i < b.length; i++) {
                    list_.add(b[i]);
                }
                list_.printList();
                for (int i = 0; i < b.length; i++) {
                    list_.remove(b[i]);
                    System.out.printf("del %2d: ", b[i]);
                    list_.printList();
                }

                System.out.printf("new list sorted && !duplicate\n");
                list_ = new LList().setSorted(true).setDuplicate(false);
                for (int i = 0; i < a.length; i++) {
                    list_.add(a[i]);
                }
                for (int i = 0; i < b.length; i++) {
                    list_.add(b[i]);
                }
                list_.printList();
                for (int i = 0; i < b.length; i++) {
                    list_.remove(b[i]);
                    System.out.printf("del %2d: ", b[i]);
                    list_.printList();
                }
            }

            public void t1() {
                int x[] = { 100, 200, 300, 150, 190, 185, 80, 95, 320, 290, 300,
                    330 };
                int y[] = { 110, 210, 310, 160, 205, 215, 90, 110, 330, 340,
                    320, 350 };
                if (x.length != y.length) {
                    System.out.printf(
                        "mergelineintesect test err x.sz != y.sz: %d != %d\n",
                        x.length, y.length);
                    return;
                }
                System.out.printf("original set: ");
                for (int i = 0; i < x.length; i++) {
                    System.out.printf("[%3d,%3d) ", x[i], y[i]);
                    if (((i % 4) == 0) && i != 0) {
                        System.out.printf("\n");
                    }
                }
                System.out.printf("\n");
                System.out.printf("MergeLineIntersects test\n");
                MergeLineIntersects merger = new MergeLineIntersects();
                for (int i = 0; i < x.length; i++) {
                    try {
                        merger.insert(x[i], y[i]);
                        System.out.printf("-------------------------\n");
                        merger.printInfo();
                        System.out.printf("-------------------------\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                // System.out.printf("-------------------------\n");
                // merger.printInfo();
            }

            public void t02() {
                // each LLNode has a next pointer and a random pointer. each
                // random
                // ptr is unique and eventually ends in null
                System.out.printf("copy doubly linked list\n");
                int sz = 10;
                int a[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    a[i] = i;
                }
                utils_.shuffle(a);

                int uid = 1;

                // init original LL
                LLNode na[] = new LLNode[sz];
                for (int i = 0; i < sz; i++) {
                    na[i] = new LLNode(i, uid);
                    uid++;
                }
                LLNode nHeadO = na[0];
                LLNode p = null;
                for (int i = 0; i < sz; i++) {
                    if (p != null) {
                        p.n_ = na[i];
                    }
                    na[i].r_ = na[a[i]];
                    p = na[i];
                }

                System.out.printf("-original-------------------------\n");
                LLNode c = nHeadO;
                while (c != null) {
                    int vn = -1;
                    int vr = -1;
                    if (c.n_ != null) {
                        vn = c.n_.uid_;
                    }
                    if (c.r_ != null) {
                        vr = c.r_.uid_;
                    }
                    System.out.printf("uid:%2d v:%2d n:%2d r:%2d\n", c.uid_,
                        c.v_, vn, vr);
                    c = c.n_;
                }

                // C o0 o1 o2 o3 o4 n0 n1 n2 n3 n4
                // N o1 o2 o3 o4 oN n1 n2 n3 n4 nN
                // P oN o0 o1 o2 o3
                // R o4 o2 o0 o1 o3 oR n0 n1 n2 n3 n4
                // nR o4 o2 o0 o1 o3
                //
                // oR o4 o2 o0 o1 o3
                // nR n4 n2 n0 n1 n3
                // copy LL as efficiently as i can do

                LLNode nHeadN = null;
                c = nHeadO;
                p = null;
                while (c != null) {
                    LLNode n = new LLNode(c.v_, uid);
                    uid++;

                    n.r_ = c.r_;
                    c.r_ = n;

                    if (nHeadN == null) {
                        nHeadN = n;
                    } else {
                        p.n_ = n;
                    }
                    p = n;
                    c = c.n_;
                }

                System.out.printf("-original modified----------------\n");
                c = nHeadO;
                while (c != null) {
                    int vn = -1;
                    int vr = -1;
                    if (c.n_ != null) {
                        vn = c.n_.uid_;
                    }
                    if (c.r_ != null) {
                        vr = c.r_.uid_;
                    }
                    System.out.printf("uid:%2d v:%2d n:%2d r:%2d\n", c.uid_,
                        c.v_, vn, vr);
                    c = c.n_;
                }

                System.out.printf("-new modified---------------------\n");
                c = nHeadN;
                while (c != null) {
                    int vn = -1;
                    int vr = -1;
                    if (c.n_ != null) {
                        vn = c.n_.uid_;
                    }
                    if (c.r_ != null) {
                        vr = c.r_.uid_;
                    }
                    System.out.printf("uid:%2d v:%2d n:%2d r:%2d\n", c.uid_,
                        c.v_, vn, vr);
                    c = c.n_;
                }

                LLNode oc = nHeadO;
                LLNode nc = nHeadN;
                LLNode t = null;
                while (nc != null) {
                    t = nc.r_;
                    if (t != null) {
                        nc.r_ = t.r_;
                        oc.r_ = t.r_.r_;
                    }
                    nc = nc.n_;
                    oc = oc.n_;
                }

                System.out.printf("-original final-------------------\n");
                c = nHeadO;
                while (c != null) {
                    int vn = -1;
                    int vr = -1;
                    if (c.n_ != null) {
                        vn = c.n_.uid_;
                    }
                    if (c.r_ != null) {
                        vr = c.r_.uid_;
                    }
                    System.out.printf("uid:%2d v:%2d n:%2d r:%2d\n", c.uid_,
                        c.v_, vn, vr);
                    c = c.n_;
                }

                System.out.printf("-new final------------------------\n");
                c = nHeadN;
                while (c != null) {
                    int vn = -1;
                    int vr = -1;
                    if (c.n_ != null) {
                        vn = c.n_.uid_;
                    }
                    if (c.r_ != null) {
                        vr = c.r_.uid_;
                    }
                    System.out.printf("uid:%2d v:%2d n:%2d r:%2d\n", c.uid_,
                        c.v_, vn, vr);
                    c = c.n_;
                }

            }

            public void test() {
                t02();
            }
        }

        public ListTests() {
        }

        public void test() {
            ListTestCases t = new ListTestCases();
            t.test();
        }
    }

    class CDeserializer implements ObjectStreamConstants {
        byte ba_[];
        boolean isDbg_ = true;
        ByteArrayInputStream bais_;
        //ByteBuffer bb_;
        DataInputStream bb_;
        public CDeserializer(byte ba[]) {
            ba_ = ba;
            bais_ = new ByteArrayInputStream(ba_);
            //bb_ = ByteBuffer.wrap(ba_);
            bb_ = new DataInputStream(bais_);
        }
        public CDeserializer isDbg(boolean isDbg) {
            isDbg_ = isDbg;
            return this;
        }
        public boolean isDbg() {
            return isDbg_;
        }
        private void startParseInt() throws Exception {
            short vs = bb_.readShort();
            if(vs != STREAM_MAGIC) {
                return;
            }
            printMsg(String.format("%04x STREAM_MAGIC", vs));
            vs = bb_.readShort();
            if(vs != STREAM_VERSION) {
                return;
            }
            printMsg(String.format("%04x STREAM_VERSION ", vs));
            byte vb = bb_.readByte();
            parseTC(vb);
        }
        public void readString() throws Exception {
            int availableBegin = bb_.available();
            String s = bb_.readUTF();
            int availableEnd = bb_.available();
            int bytesRead = availableBegin - availableEnd;
            printMsg(String.format("%s STRING %d bytes", s, bytesRead));
        }
        public void parseDescFlags(byte vb) throws Exception {
            /*
             * from ObjectStreamClass.java readNonProxy
             */
            if      (vb == SC_WRITE_METHOD) {
                printMsg(String.format("%02x SC_WRITE_METHOD", vb));
            }
            else if (vb == SC_BLOCK_DATA) {
                printMsg(String.format("%02x SC_BLOCK_DATA", vb));
            }
            else if (vb == SC_SERIALIZABLE) {
                printMsg(String.format("%02x SC_SERIALIZABLE", vb));
                short numFields = bb_.readShort();
                printMsg(String.format("%04x NUM_FIELDS", numFields));
                for(int i = 0; i <= numFields; i++) {
                    byte tcode = bb_.readByte();
                    printMsg(String.format("%02x TCODE", tcode));
                    readString();
                }
                byte vbNew = bb_.readByte();
                parseTC(vbNew);
            }
            else if (vb == SC_EXTERNALIZABLE) {
                printMsg(String.format("%02x SC_EXTERNALIZABLE", vb));
            }
            else if (vb == SC_ENUM) {
                printMsg(String.format("%02x SC_ENUM", vb));
            }
            else {
                printMsg(String.format("%02x UKNOWN", vb));
            }
        }
        public void parseTC(byte vb) throws Exception {
            if      (vb == TC_NULL) {
                printMsg(String.format("%02x TC_NULL", vb));
                byte vbNew = bb_.readByte();
                parseTC(vbNew);                
            }
            else if (vb == TC_REFERENCE) {
                printMsg(String.format("%02x TC_REFERENCE", vb));                
            }
            else if (vb == TC_CLASSDESC) {
                printMsg(String.format("%02x TC_CLASSDESC", vb));  
                short len = bb_.readShort();
                printMsg(String.format("%04x LENGTH", len));
                for(int i = 0; i < len; i++) {
                    byte vbtmp = bb_.readByte();
                    System.out.printf("%02x ", vbtmp);
                }
                System.out.printf("\n");
                long serialUID = bb_.readLong();
                printMsg(String.format("%016x UID", serialUID));
                
                byte vbNew = bb_.readByte();
                parseDescFlags(vbNew);
            }
            else if (vb == TC_OBJECT) {
                printMsg(String.format("%02x TC_OBJECT", vb));
                byte vbNew = bb_.readByte();
                parseTC(vbNew);
            }
            else if (vb == TC_STRING) {
                printMsg(String.format("%02x TC_STRING", vb));
                readString();
                byte vbNew = bb_.readByte();
                parseTC(vbNew);                
            }
            else if (vb == TC_ARRAY) {
                printMsg(String.format("%02x TC_ARRAY", vb));
            }
            else if (vb == TC_CLASS) {
                printMsg(String.format("%02x TC_CLASS", vb));
            }
            else if (vb == TC_BLOCKDATA) {
                printMsg(String.format("%02x TC_BLOCKDATA", vb));
            }
            else if (vb == TC_ENDBLOCKDATA) {
                printMsg(String.format("%02x TC_ENDBLOCKDATA", vb));
                byte vbNew = bb_.readByte();
                parseTC(vbNew);                
            }
            else if (vb == TC_RESET) {
                printMsg(String.format("%02x TC_RESET", vb));
            }
            else if (vb == TC_BLOCKDATALONG) {
                printMsg(String.format("%02x TC_BLOCKDATALONG", vb));
            }
            else if (vb == TC_PROXYCLASSDESC) {
                printMsg(String.format("%02x TC_PROXYCLASSDESC", vb));
            }
            else if (vb == TC_ENUM) {
                printMsg(String.format("%02x TC_ENUM", vb));
            }
            else if (vb == TC_MAX) {
                printMsg(String.format("%02x TC_MAX", vb));
            }
            else {
                printMsg(String.format("%02x UNKNOWN", vb));
            }

        }
        public void printMsg(String msg) {
            System.out.printf("%s%n", msg);
        }
        public void startParse() {
            try {
                startParseInt();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
    class SQLiteTest {
        // sqlite-jdbc-3.8.10.1.jar
        // java -classpath ".:sqlite-jdbc-3.8.10.1.jar" Tests // this works
        String dbName_;
        Connection c_;
        Utils u_;

        public SQLiteTest() {
            // if using in memory, then jdbc:sqlite:memory
            dbName_ = "jdbc:sqlite:test_sqlite_java_0.db"; // :path_to_db
            u_ = new Utils();
            try {
                c_ = null;
                c_ = DriverManager.getConnection(dbName_);
            } catch (Exception e) {
            }
        }

        public void t00() {
            if (c_ == null) {
                return;
            }
            Statement stmt = null;
            ResultSet rs = null;
            try {
                stmt = c_.createStatement();
                String sql = "create table if not exists company ("
                    + "id int primary key not null, " + "name text, "
                    + "age int, " + "ts timestamp default current_timestamp"
                    + ")";
                stmt.executeUpdate(sql);
                sql = "select * from company;";
                rs = stmt.executeQuery(sql);
                int id = 0;
                int age = 10;
                String name = null;
                String ts = null;
                while (rs.next()) {
                    id = rs.getInt("id");
                    age = rs.getInt("age");
                    name = rs.getString("name");
                    ts = rs.getString("ts");
                    System.out.printf("RS: id:%3d age:%3d name:%8s ts:%s\n", id,
                        age, name, ts);
                }
                for (int i = 0; i < 10; i++) {
                    id++;
                    age = u_.randInt(10, 20);
                    name = u_.randString(5);
                    sql = "insert into company (id, name, age, ts) values ("
                        + id + ",'" + name + "'," + age
                        + "CURRENT_TIMESTAMP)";
                    stmt.executeUpdate(sql);
                }
                rs.close();
                stmt.close();
                c_.close();
            } catch (Exception e) {
            }
        }

        public void test() {
        }
    }
    class IOTests {
        public void comments() {
            // A Stream is an input source or output destination
            // A Stream is a sequence of data
            // * types of streams:
            // - byte stream
            // used only for the most primitive IO, don't use for char,
            // although possible if desired.
            // use FileInputStream, FileOutputStream
            // - character stream
            // allows unicode, utf-8, utf-16, ascii conversions
            // use FileReader, FileWriter, which use FileInputStream and
            // FileOutputStream.
            //
            // - buffered stream
            // BufferedReader(new FileReader(file)) for readLine
            // PrintWriter(new FileWriter(file)) for println
            // - scanning stream
            // - data stream
            // - object stream
            //
            // - Source/Destination
            // Console
            // File
            // Socket
            // - InputStream/OutputStream
            // AudioInputStream, AudioOutputStream
            // ByteArrayInputStream, ByteArrayOutputStream
            // FileInputStream, FileOutputStream
            // FilterInputStream, FilterOutputStream
            // ObjectInputStream, ObjectOutputStream
            // StringBufferInputStream, StringBufferOutputStream
            // - Reader/Writer
            // BufferedReader, BufferedWriter
            // CharArrayReader, CharArrayWriter
            // InputStreamReader, OutputStreamWriter
            // PipedReader, PipedWriter
            // StringReader, StringWriter
            // FileReader, FileWriter
            // PrintWriter
            //
            // Streams are often wrapped by Reader/Writer.
            //
            // all byte stream classes are from InputStream and OutputStream
            //
            // Always close streams by using finally block
            //
            // Unbuffered IO means each read or write makes underlying
            // OS call, which is less efficient that buffered IO. OS call
            // can trigger disk access, network activity, etc.
            //
            // Buffered IO stream reads data from memory area known as
            // buffer, and writes data to memory area.
            //
            // Buffered IO can be used by wrapping around non buffered
            // reader or writer:
            // - BufferedReader(new FileReader(file))
            // - BufferedWriter(new FileWriter(file))
            // BufferedInputStream/BufferedOutputStream create buffered
            // byte streams.
            // BufferedReader and BufferedWriter create buffered character
            // stream.
            //
            // Buffered Streams should be flushed periodically. Some
            // buffered output classes have autoflush, such PrintWriter
            // and every call to println or format.
            //
            // BufferedReader is for characters and BufferedInputStream
            // is for bytes, which can include characters.
            //
            // Data Streams support binary IO of primitive types such as
            // boolean, int, float, byte, String. Use DataInputStream,
            // DataOutputStream, which are derived from FilterInputStream.
            // Data Strems support writeDouble, writeInt, writeUTF, etc.
            //
            // Object Streams read and write serializable objects.
            // They use ObjectInputStream and ObjectOutputStream, which
            // are from ObjectInput and ObjectOutput. Use writeObject
            // and readObject.
            //
            //
            //
            //
            //
            //
            //
        }
        
        public void listFilesInDirIO(String sPath, boolean isRecursive,
            ArrayList<String> list) {
            File dir = new File(sPath);
            if (dir.exists() == false) {
                return;
            }
            ArrayList<String> listTmp = new ArrayList<>();
            File[] files = dir.listFiles();
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    String fname = files[i].toString();
                    if ((fname.contains(".swp") == false)
                        && (fname.contains("/deprecated") == false)
                        && (fname.contains("/target/") == false)
                        && (fname.contains("package-info.java") == false)
                        && (fname.contains(".java") == true)) {
                        listTmp.add(files[i].toString());
                    }
                } else if (files[i].isDirectory()) {
                    if (isRecursive) {
                        listFilesInDirIO(files[i].toString(), isRecursive,
                            list);
                    }
                }
            }
            if (listTmp.size() != 0) {
                list.addAll(listTmp);
            }
        }

        public ArrayList<String> listFilesInDirIO(String sPath,
            boolean isRecursive) {
            ArrayList<String> list = new ArrayList<>();
            listFilesInDirIO(sPath, isRecursive, list);
            return list;
        }

        public ArrayList<String> listFilesInDirNIO(String sPath,
            boolean isRecursive) {
            ArrayList<String> list = new ArrayList<>();
            Path path = Paths.get(sPath);
            try {
                listFilesInDirNIO(path, isRecursive, list);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return list;
        }

        public void listFilesInDirNIO(Path path, boolean isRecursive,
            ArrayList<String> list) throws IOException {
            DirectoryStream<Path> dir = Files.newDirectoryStream(path);
            ArrayList<String> listTmp = new ArrayList<>();
            for (Path f : dir) {
                if (Files.isDirectory(f)) {
                    if (isRecursive) {
                        listFilesInDirNIO(f, isRecursive, list);
                    }
                } else if (Files.isRegularFile(f, LinkOption.NOFOLLOW_LINKS)) {
                    if (f.toString().contains(".swp") == false) {
                        listTmp.add(f.toString());
                    }
                }
            }
            if (listTmp.size() != 0) {
                list.addAll(listTmp);
            }
        }

        public Integer saveRandomFile(
            String spath,
            boolean overwriteFile,
            int numCharsPerWord,
            int numWordsPerLine,
            int numLines) 
            throws Exception 
        {
            Path path = Paths.get(spath);
            Integer res = new Integer(0);
            if(Files.exists(path) == true) {
                if(overwriteFile == false) {
                    return null;
                }
                int idx = 0;
                String sPathDst = String.format("%s.%d", spath, idx);
                Path pathDst = Paths.get(sPathDst);
                while (Files.exists(pathDst) == true) {
                    idx++;
                    sPathDst = String.format("%s.%d", spath, idx);
                    pathDst = Paths.get(sPathDst);
                }
                Files.move(path, pathDst);
            }
            BufferedWriter w = null;
            try {
                w = Files.newBufferedWriter(path);
                for(int i = 0; i < numLines; i++) {
                    String s = utils_.randStringLine(
                        numCharsPerWord, numWordsPerLine, null);
                    w.write(s + "\n");
                }
                w.flush();
            } catch(Exception e) {
                e.printStackTrace();
                res = null;
            } finally {
                w.close();
            }
            return res;
        }
        
        class IOStreamTest {
            public String strHelper(int sz) {
                StringBuilder sb = new StringBuilder();
                String sref = "abcdefghijklmnopqrstuvwxyz";
                char ca[] = sref.toCharArray();
                int szca = ca.length;
                int idx = 0;
                for(int i = 0; i < sz; i++) {
                    sb.append(ca[idx]);
                    idx = (idx + 1) % szca;
                }
                return sb.toString();
            }
            public void t00() throws Exception {
                /*
                 * try InputStream reset with 1K of data
                 * 
                 */
                int sz = 1024;
                int szRd = sz/2;
                int ctr = 0;
                String s = strHelper(sz);
                System.out.printf("ORIGINAL string:%s\n", s);
               
                InputStream is = new ByteArrayInputStream(s.getBytes());
                if(is.markSupported()) {
                    System.out.printf("markSupported true\n");
                } else {
                    System.out.printf("markSupported false\n");
                }
                System.out.printf("%d bytes are in stream\n", s.length());
                int v;
                StringBuilder sb = new StringBuilder();
                while((v = is.read()) != -1 && ctr < szRd) {
                    ctr++;
                    sb.append((char)v);
                }
                System.out.printf("string:%s\n", sb.toString());
                System.out.printf("read %d ctr bytes before reset\n", ctr);
                System.out.printf("available bytes:%d\n", is.available());
                is.reset();
                ctr = 0;
                while((v = is.read()) != -1) {
                    ctr++;
                }
                System.out.printf("read %d ctr bytes after reset\n", ctr);
                is.close();
            }
            public void t01() throws Exception  {
                /*
                 * try InputStream reset with 8K boundary of byte buffer
                 */
                int sz = 8092 + 256;
                int szRd = sz/2;
                int ctr = 0;
                String s = strHelper(sz);
                InputStream is = new ByteArrayInputStream(s.getBytes());
                if(is.markSupported()) {
                    System.out.printf("markSupported true\n");
                } else {
                    System.out.printf("markSupported false\n");
                }
                System.out.printf("%d bytes are in stream\n", s.length());
                int v = 0;
                while((v = is.read()) != -1 && ctr < szRd) {
                    ctr++;
                }
                System.out.printf("read %d ctr bytes before reset\n", ctr);
                System.out.printf("available bytes:%d\n", is.available());
                is.reset();
                ctr = 0;
                while((v = is.read()) != -1) {
                    ctr++;
                }
                System.out.printf("read %d ctr bytes after reset\n", ctr);
                is.close();
                boolean res = v == -1;
                assert res;
            }
            public void test() {
                try {
                    t00();
                    //t01();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }

        class IOFileTest {
            Utils u_ = new Utils();

            public IOFileTest() {
                u_ = new Utils();
            }

            public void t00() {
                System.out.printf("write random text to file\n");
                FileOutputStream fo = null;
                try {
                    String sfile = new String("file_iotest_0.txt");
                    File f = new File(sfile);
                    if (f.exists() && !f.isDirectory()) {
                        return;
                    }
                    fo = new FileOutputStream(sfile);
                    for (int i = 0; i < 25; i++) {
                        String s = u_.randString(80);
                        char ac[] = s.toCharArray();
                        for (int j = 0; j < ac.length; j++) {
                            fo.write(ac[j]);
                        }
                        fo.write('\n');
                    }
                } catch (Exception e) {
                } finally {
                }
                try {
                    if (fo != null) {
                        fo.close();
                    }
                } catch (Exception e) {
                }
            }

            public void t01() {
                System.out
                    .printf("streams read from file and write to other file\n");
                t00();
                FileInputStream fis = null;
                FileOutputStream fos = null;
                String sfilei = new String("file_iotest_0.txt");
                String sfileo = new String("file_iotest_o1.txt");
                try {
                    fis = new FileInputStream(sfilei);
                    fos = new FileOutputStream(sfileo);
                    StringBuilder sb = new StringBuilder();
                    int v;
                    char c;
                    while ((v = fis.read()) != -1) {
                        c = (char) v;
                        sb.append(c);
                    }
                    char ac[] = sb.toString().toCharArray();
                    for (int i = 0; i < ac.length; i++) {
                        fos.write(ac[i]);
                    }
                } catch (Exception e) {
                } finally {
                }
                try {
                    if (fis != null) {
                        fis.close();
                    }
                    if (fos != null) {
                        fos.close();
                    }
                } catch (Exception e) {
                }
            }

            public void t02() {
                System.out.printf("buffered read from and to other file\n");
                t00();
                try {
                    String sfilei = new String("file_iotest_0.txt");
                    String sfileo = new String("file_iotest_t02_o.txt");
                    FileReader fr = new FileReader(sfilei);
                    FileWriter fw = new FileWriter(sfileo);
                    BufferedReader br = new BufferedReader(fr);
                    BufferedWriter bw = new BufferedWriter(fw);
                    PrintWriter pw = new PrintWriter(bw);

                    String s;
                    while ((s = br.readLine()) != null) {
                        pw.println(s);
                    }

                    fr.close();
                    fw.close();
                    br.close();
                    bw.close();
                    pw.close();
                } catch (Exception e) {
                }
            }

            public void t03() throws Exception {
                System.out.printf("write a few objects to file and read\n");
                String fo = "file_ioserialize_0.out";
                ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(fo)));

                int max = 5;
                for (int i = 0; i < max; i++) {
                    IOOSimpleOuterPtr o = IOOSimpleOuterPtr.createChain(i + 1);
                    o.printChainCompact(String.format("%d", i));
                    oos.writeObject(o);
                }
                oos.flush();
                oos.close();

                System.out.printf("written, now read\n");

                ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(fo)));

                try {
                    IOOSimpleOuterPtr i1 = (IOOSimpleOuterPtr) ois.readObject();
                    while (i1 != null) {
                        System.out.printf("---------\n");
                        i1.printChainCompact();
                        i1 = (IOOSimpleOuterPtr) ois.readObject();
                    }
                } catch (EOFException e) {
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    ois.close();
                }
            }

            public void t04() throws Exception {
                // new FileOutputStream(fo, true))); you cannot append
                // to ObjectOutputStream? or use reset in writeStreamHeader,
                // else you get StreamCorruptedException

                // if file doesn't exist, then write output from
                // ByteArrayOutputStream to file.
                // if file does exist, then read from file to
                // ByteArrayOutputStream, then write from ByteArrayOutputStream
                // to same file.

                System.out.printf("append objects to object file\n");
                String fo = "file_ioserialize_1.out";
                ObjectInputStream ois = null;
                ObjectOutputStream oos = null;

                // this can be in memory data
                BufferedOutputStream bof = null;
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                try {
                    // alternative version is to write to tmp file, read
                    // from tmp file and overwrite orig file, and delete tmp
                    // if(file.delete())
                    //
                    // to transfer object, simply do
                    // oos.writeObject(new File("file_abc"))
                    //
                    File f = new File(fo);
                    IOOSimpleOuterPtr o1 = IOOSimpleOuterPtr.createChain(3);
                    IOOSimpleOuterPtr o2 = IOOSimpleOuterPtr.createChain(3);
                    if (f.exists() && !f.isDirectory()) {
                        System.out.printf("open existing file\n");
                        ois = new ObjectInputStream(
                            new BufferedInputStream(new FileInputStream(fo)));
                        oos = new ObjectOutputStream(
                            new BufferedOutputStream(baos));
                        IOOSimpleOuterPtr i1 = (IOOSimpleOuterPtr) ois
                            .readObject();
                        while (i1 != null) {
                            oos.writeObject(i1);
                            try {
                                i1 = (IOOSimpleOuterPtr) ois.readObject();
                            } catch (EOFException e) {
                                i1 = null;
                            }
                        }
                        oos.writeObject(o1);
                        oos.writeObject(o2);
                        oos.flush();
                        ois.close();
                        oos.close();

                        bof = new BufferedOutputStream(
                            new FileOutputStream(fo));
                        bof.write(baos.toByteArray());
                        bof.close();

                        ois = new ObjectInputStream(
                            new BufferedInputStream(new FileInputStream(fo)));
                        i1 = (IOOSimpleOuterPtr) ois.readObject();
                        int i = 0;
                        while (i1 != null) {
                            i1.printChainCompact(String.format("%d", i));
                            i1 = (IOOSimpleOuterPtr) ois.readObject();
                            i++;
                        }
                        ois.close();
                    } else {
                        System.out.printf("create new file\n");
                        oos = new ObjectOutputStream(
                            new BufferedOutputStream(baos));
                        oos.writeObject(o1);
                        oos.writeObject(o2);
                        oos.flush();
                        bof = new BufferedOutputStream(
                            new FileOutputStream(fo));
                        bof.write(baos.toByteArray());
                        bof.close();
                        oos.close();
                        ois = new ObjectInputStream(
                            new BufferedInputStream(new FileInputStream(fo)));
                        IOOSimpleOuterPtr i1 = (IOOSimpleOuterPtr) ois
                            .readObject();
                        int i = 0;
                        while (i1 != null) {
                            i1.printChainCompact(String.format("%d", i));
                            i1 = (IOOSimpleOuterPtr) ois.readObject();
                            i++;
                        }
                        ois.close();
                    }
                    System.out.printf("done\n");
                } catch (EOFException e) {
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (ois != null) {
                        ois.close();
                    }
                    if (oos != null) {
                        oos.close();
                    }
                    if (bof != null) {
                        bof.close();
                    }
                    if (baos != null) {
                        baos.close();
                    }
                }
            }

            public void t05() {
                // append only file with format
                // file 1 is int sequential_id, int uid, double randval,
                // int timestamp
                // file 2 is int uid, int account, int pid,
                // string passwd, string nameFirst, string nameLast
                // close it, then reopen and rewrite, flush

                ObjectInputStream ois = null;
                ObjectOutputStream oos = null;
                IOFormIIISSS fiiisss = null;
                File f0 = null;
                int szCustomers = 10;
                int szStr = 5;
                int uid = 0;
                int idAccount = 1;
                int idPersonal = 0;
                String charSet0 = "abcdefghijklmnopqrstuvwxyz";
                Utils utils = new Utils();
                String sfo0 = "file_iostream_binary_1.out";
                boolean appendMode = true;
                try {
                    f0 = new File(sfo0);

                    if (f0.exists() && !f0.isDirectory()) {
                        // ObjectOutputStreamReset doesn't write header
                        // for each open and ObjectOutputStream does
                        // write header, which is needed for a new file
                        oos = new ObjectOutputStreamReset(
                            new BufferedOutputStream(
                                new FileOutputStream(f0, appendMode)));
                    } else {
                        oos = new ObjectOutputStream(new BufferedOutputStream(
                            new FileOutputStream(f0, appendMode)));
                    }

                    for (int i = 0; i < szCustomers; i++) {
                        utils.loadCharSet(charSet0);
                        String namel = utils.randString(szStr);
                        String namef = utils.randString(szStr);
                        utils.loadCharSet(null);
                        String passwd = utils.randString(szStr);

                        fiiisss = new IOFormIIISSS(uid++, idAccount++,
                            idPersonal++, namel, namef, passwd);
                        oos.writeObject(fiiisss);
                        oos.flush();
                    }
                    oos.close();

                    ois = new ObjectInputStream(
                        new BufferedInputStream(new FileInputStream(sfo0)));
                    while (true) {
                        fiiisss = (IOFormIIISSS) ois.readObject();
                        if (fiiisss == null) {
                            break;
                        }
                        fiiisss.printInfo();
                    }
                    ois.close();
                } catch (Exception e) {
                }
            }

            public void t06() {
                // random access file
                int szCustomers = 10;
                int szStr = 10;
                int uid = 0;
                int idAccount = 1;
                int idPersonal = 0;
                String charSet0 = "abcdefghijklmnopqrstuvwxyz";
                Utils utils = new Utils();
                String sfo0 = "file_iostream_randomaccess_1.out";
                File f0 = null;
                RandomAccessFile raf = null;
                try {
                    f0 = new File(sfo0);
                    raf = new RandomAccessFile(f0, "rw");

                    raf.seek(raf.length());

                    for (int i = 0; i < szCustomers; i++) {
                        utils.loadCharSet(charSet0);
                        String namel = utils.randString(szStr);
                        String namef = utils.randString(szStr);
                        utils.loadCharSet(null);
                        String passwd = utils.randString(szStr);
                        raf.writeInt(uid++);
                        raf.writeInt(idAccount++);
                        raf.writeInt(idPersonal++);
                        raf.writeUTF(namel);
                        raf.writeUTF(namef);
                        raf.writeUTF(passwd);
                        raf.getFD().sync();
                    }

                    IOFormIIISSS fiiisss = new IOFormIIISSS();
                    try {
                        String namel = null;
                        String namef = null;
                        String passwd = null;
                        raf.seek(0);
                        int ctr = 0;
                        while (raf.getFilePointer() < raf.length()) {
                            uid = raf.readInt();
                            if (ctr > 10 && ctr < 20) {
                                raf.seek(raf.getFilePointer() - 4);
                                raf.writeInt(uid + 100);
                            }
                            idAccount = raf.readInt();
                            idPersonal = raf.readInt();
                            namel = raf.readUTF();
                            namef = raf.readUTF();
                            passwd = raf.readUTF();
                            fiiisss.set(uid, idAccount, idPersonal, namel,
                                namef, passwd);
                            fiiisss.printInfo();
                            ctr++;
                        }
                    } catch (Exception e) {
                    }
                    raf.close();
                } catch (Exception e) {
                }

            }

            public void t07() {
                // DataInputStream/DataOutputStream
                DataInputStream dis = null;
                DataOutputStream dos = null;
                File f0 = null;
                int szCustomers = 10;
                int szStr = 5;
                int uid = 0;
                int idAccount = 1;
                int idPersonal = 0;
                String charSet0 = "abcdefghijklmnopqrstuvwxyz";
                Utils utils = new Utils();
                String sfo0 = "file_iostream_dataoutputstream_1.out";
                boolean appendMode = true;
                try {
                    f0 = new File(sfo0);

                    dos = new DataOutputStream(new BufferedOutputStream(
                        new FileOutputStream(f0, appendMode)));

                    for (int i = 0; i < szCustomers; i++) {
                        utils.loadCharSet(charSet0);
                        String namel = utils.randString(szStr);
                        String namef = utils.randString(szStr);
                        utils.loadCharSet(null);
                        String passwd = utils.randString(szStr);
                        dos.writeInt(uid++);
                        dos.writeInt(idAccount++);
                        dos.writeInt(idPersonal++);
                        dos.writeUTF(namel);
                        dos.writeUTF(namef);
                        dos.writeUTF(passwd);
                        dos.flush();
                    }
                    dos.close();

                    dis = new DataInputStream(
                        new BufferedInputStream(new FileInputStream(sfo0)));
                    IOFormIIISSS fiiisss = new IOFormIIISSS();
                    try {
                        String namel = null;
                        String namef = null;
                        String passwd = null;
                        while (dis.available() > 0) {
                            uid = dis.readInt();
                            idAccount = dis.readInt();
                            idPersonal = dis.readInt();
                            namel = dis.readUTF();
                            namef = dis.readUTF();
                            passwd = dis.readUTF();
                            fiiisss.set(uid, idAccount, idPersonal, namel,
                                namef, passwd);
                            fiiisss.printInfo();
                        }
                    } catch (Exception e) {
                    }
                    dis.close();
                } catch (Exception e) {
                }
            }

            public void t08() {
                // write ahead log and rollback simulation with incomplete
                // writes
                // simulate rollback data with vectors, expected, actual, log
                int szData = 50000;

                for (int i = 0; i < szData; i++) {
                }
            }
            
            public void t09() throws Exception {
                System.out.printf("write a few objects to file and read\n");
                String fo = "file_ioserialize_0.out";
                ObjectOutputStream oos = new ObjectOutputStream(
                    new BufferedOutputStream(new FileOutputStream(fo)));

                int max = 5;
                for (int i = 0; i < max; i++) {
                    IOOSimpleOuterPtr o = IOOSimpleOuterPtr.createChain(i + 1);
                    o.printChainCompact(String.format("%d", i));
                    oos.writeObject(o);
                }
                oos.flush();
                oos.close();

                System.out.printf("written, now read\n");

                ObjectInputStream ois = new ObjectInputStream(
                    new BufferedInputStream(new FileInputStream(fo)));

                try {
                    IOOSimpleOuterPtr i1 = (IOOSimpleOuterPtr) ois.readObject();
                    while (i1 != null) {
                        System.out.printf("---------\n");
                        i1.printChainCompact();
                        i1 = (IOOSimpleOuterPtr) ois.readObject();
                    }
                } catch (EOFException e) {
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    ois.close();
                }

            }
            
            public void t10() throws Exception {
                /*
                 * PipedInputStream and PipedOutputStream test
                 */
                PipedInputStream pis = new PipedInputStream();
                PipedOutputStream pos = new PipedOutputStream();
                pos.connect(pis);
                
                // create object and make array byte out of it
                IOOSimpleOuter ioosIn0 = new IOOSimpleOuter();
                ioosIn0.randomize(10,10);
                System.out.println("==========original0");
                ioosIn0.printInfo();

                IOOSimpleOuter ioosIn1 = new IOOSimpleOuter();
                ioosIn1.randomize(10,10);
                System.out.println("==========original1");
                ioosIn1.printInfo();
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(ioosIn0);
                byte aryByteSend[] = baos.toByteArray();
                System.out.printf("aryByteSend sz: %d\n", aryByteSend.length);
                baos.close();
                oos.close();
                                
                // pipe the array byte 
                pos.write(aryByteSend);
                pos.flush();
                pos.close();    // must close else PipedInputStream.read() will wait/block forever
                
                // read from pis
                baos = new ByteArrayOutputStream();
                int v;
                while((v = pis.read()) != -1) { // pis.read can hang if pos not closed.
                    baos.write(v);
                }
                baos.flush();
                byte aryByteRcv[] = baos.toByteArray();
                baos.close();
                System.out.printf("aryByteRcv:%d\n", aryByteRcv.length);
                
                // create object0 from byte array
                ByteArrayInputStream bais = new ByteArrayInputStream(aryByteRcv);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                try {
                    Object o = ois.readObject();
                    IOOSimpleOuter ioosOut = (IOOSimpleOuter)o;
                    System.out.println("==========from stream");
                    ioosOut.printInfo();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                
                pis.close();
                bais.close();
                ois.close();
                
                /* 
                 * what happens when you try to add more junk bytes?
                 * 
                 * write original object 0
                 * write object 1
                 * write junk bytes
                 */
                baos = new ByteArrayOutputStream();
                byte tmpary[] = baos.toByteArray();
                System.out.printf("tmp ary: %d\n", tmpary.length);
                oos = new ObjectOutputStream(baos);
                // write original object
                //baos.write(aryByteRcv);   
                // this writes extra serialization bytes after header serialization already
                //oos.write(aryByteRcv);    
                // aryByteRcv has serialization bytes, so this causes exception
                oos.writeObject(ioosIn0);
                // write object 1
                oos.writeObject(ioosIn1);
                // write junk bytes
                // this will add serialization header: 0x77 num_bytes=10 for this loop
                for(int i = 0; i < 10; i++) {
                    oos.write(i*10);
                }
                //tmpary = baos.toByteArray();
                //System.out.printf("tmp ary: %d\n", tmpary.length);
                //oos.write(aryByteRcv);
                //for(int i = 0; i < aryByteRcv.length; i++) {
                //    oos.write(aryByteRcv[i]);
                //}
                oos.flush();
                byte aryByteJunk[] = baos.toByteArray();
                baos.close();
                oos.close();
                
                System.out.printf("aryByteRcv:%d\n", aryByteRcv.length);
                for(int i = 0; i < aryByteRcv.length; i++) {
                    System.out.printf("%02x ", aryByteRcv[i]);
                }
                System.out.printf("\n");
                System.out.printf("aryByteJnk:%d\n", aryByteJunk.length);
                for(int i = 0; i < aryByteJunk.length; i++) {
                    System.out.printf("%02x ", aryByteJunk[i]);                    
                }
                System.out.printf("\n");
                bais = new ByteArrayInputStream(aryByteJunk);
                ois = new ObjectInputStream(bais);
                try {
                    v = bais.available();
                    System.out.printf("available before read: %d\n", v);
                    Object o = ois.readObject();
                    Serializable serializableObj = (Serializable)o;
                    IOOSimpleOuter ioosOut = (IOOSimpleOuter)serializableObj;
                    System.out.println("==========junk result0");
                    ioosOut.printInfo();

                    //v = ois.available() fails exception but not bais. why????

                    v = bais.available();
                    System.out.printf("available after read first object: %d\n", v);
                    
                    o = ois.readObject();
                    ioosOut = (IOOSimpleOuter)o;
                    System.out.println("==========junk result1");
                    ioosOut.printInfo();

                    v = bais.available();
                    System.out.printf("available after read 2nd   object: %d\n", v);
                    int i = 0;
                    while((v = bais.read()) != -1) {
                        System.out.printf("i:%3d remainder: %02x : %d\n", i, v, v);
                        i++;
                    }
                } catch(OptionalDataException e) {
                    e.printStackTrace();                    
                } catch(StreamCorruptedException e) {
                    e.printStackTrace();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                bais.close();
                ois.close();
            }
            
            public void t11() throws Exception {
            }
            
            public void t12() throws Exception {
                /*
                 * PipedInputStream and PipedOutputStream
                 * input goes to output
                 * 
                 * pos0->pis0->pos1->pis1->print cmdline
                 * 
                 */
                PipedInputStream  pis0 = new PipedInputStream();
                PipedOutputStream pos0 = new PipedOutputStream();
                PipedInputStream  pis1 = new PipedInputStream();
                PipedOutputStream pos1 = new PipedOutputStream();


                /*
                 * connect is always 
                 *      outputStream == src && inputStream == dst
                 * so pos.connect(pis) == pis.connect(pos)
                 * 
                 * can't do pis0.connect(pos1) because pis.connect(pos)
                 * means connect pis dst to pos src. 
                 * 
                 * the pos0.connect(pis0) already does that--it connects
                 * pos src from pis dst. 
                 */
                pos0.connect(pis0);
                //pis0.connect(pos1);                 
                pis1.connect(pos1);
                
                IOOSimpleOuter ioo = new IOOSimpleOuter();
                ioo.randomize(10,10);
                System.out.println("==========original");
                ioo.printInfo();

                byte bary[] = t14GetBytes(ioo);
                pos0.write(bary);
                pos0.flush();
                pos0.close();
                int v;
                
                int szBuf = 32;
                byte btmp[] = new byte[szBuf];

                while((v = pis0.read(btmp)) != -1) {
                    pos1.write(btmp, 0, v);
                }
                
                pos1.flush();
                pos1.close();
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                while((v = pis1.read(btmp)) != -1) {
                    baos.write(btmp, 0, v);
                }
                                
                pis1.close();
                baos.flush();

                byte arcv[] = baos.toByteArray();
                baos.close();
                
                ByteArrayInputStream bais = new ByteArrayInputStream(arcv);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                try {
                    Object o = ois.readObject();
                    IOOSimpleOuter ioosOut = (IOOSimpleOuter)o;
                    System.out.println("==========from stream");
                    ioosOut.printInfo();
                } catch(Exception e) {
                    e.printStackTrace();
                }
                
                bais.close();
                ois.close();

            }
            
            public void t13() throws Exception {
                /*
                 * Testing String UTF-8
                 */
                String s     = "This is test\n";
                for(int i = 0; i < s.length(); i++) {
                    String stmp = s.substring(0, i+1);
                    t13(stmp);
                }
                System.out.printf("\n");
                
                s = new String("This is test\n".getBytes(), 
                    Charset.forName("UTF-8"));
                for(int i = 0; i < s.length(); i++) {
                    String stmp = s.substring(0, i+1);
                    t13(stmp);
                }
            }
            
            public void t13(String s) throws Exception {
                byte ba[] = s.getBytes();
                System.out.printf("String: %s\n", s);
                t13_PrintBytes(ba);
            }
            
            public void t13_PrintBytes(byte ba[]) {
                System.out.printf("bytes:  ");
                for(byte b: ba) {
                    System.out.printf("%02x ", b);                    
                }
                System.out.printf("\n");                                
            }

            public byte[] t14GetBytes(Object o) throws Exception {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(o);
                oos.flush();
                byte bary[] = baos.toByteArray();
                baos.close();
                oos.close();
                return bary;
            }
            
            public void t14() throws Exception {
                /*
                 * Testing serialization header values
                 */
                //System.out.printf("",);
                String s0 = new String("This is test".getBytes(),
                    Charset.forName("UTF-8"));
                SerializableString0 ss0 = new SerializableString0(s0);
                SerializableString1 ss0v1 = new SerializableString1(s0);
                SerializableString2 ss0v2 = new SerializableString2(s0);
                String s1 = new String("Hello again.".getBytes(),
                    Charset.forName("UTF-8"));
                SerializableString0 ss1 = new SerializableString0(s1);
                boolean res = ss1 != null;
                assert res;
                t13(s0);
                t13(s1);
                System.out.printf("-----------\n");
                
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos;
                byte bAry[];
                
                bAry = t14GetBytes(s0);
                System.out.println("byte array of s0");
                t13_PrintBytes(bAry);
                baos.write(bAry);
                
                /*
                 * now write just ss0 and get printout, which has new ACED header
                 */
                bAry = t14GetBytes(ss0);
                System.out.println("byte array of ss0");
                t13_PrintBytes(bAry);
                baos.write(bAry);
                
                /*
                 * do for SerializableString1 and 2 to see similarity to SerializableString
                 */
                bAry = t14GetBytes(ss0v1);
                System.out.println("byte array of ss0V1");
                t13_PrintBytes(bAry);
                baos.write(bAry);
                
                bAry = t14GetBytes(ss0v2);
                System.out.println("byte array of ss0V2");
                t13_PrintBytes(bAry);
                baos.write(bAry);
                
                /*
                 * now put the byte array directly into objectinputstream 
                 * and see if it works. it won't because of the aced header implying
                 * separate writeObject to separate streams
                 */
                ByteArrayInputStream bais;
                ObjectInputStream ois;
                try {
                    bais = new ByteArrayInputStream(baos.toByteArray());
                    baos.flush();
                    baos.close();
                    ois = new ObjectInputStream(bais);
                    String              rcvS0  = (String)ois.readObject();
                    
                    /*
                     * even though there was baos.write of ss0, ss0v1, ss0v2, you can't
                     * read those out with a single readObject because each one of those
                     * byte arrays have a ACED header, which means they were part of 
                     * separate writeObject streams. to do contiguous readObject of the same
                     * stream, those objects would have had to be written with multiple
                     * writeObject with the same stream. 
                     */
                    //SerializableString0 rcvSS0 = (SerializableString0)ois.readObject();
                    System.out.printf("got here %s\n", rcvS0);
                    bais.close();
                    ois.close();
                } catch(Exception e) {
                    e.printStackTrace();
                }

                /*
                 * now write those same objects to the same stream and read them. 
                 * it should work because only 1 0xACED
                 */
                baos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(baos);
                oos.writeObject(s0);
                oos.writeObject(ss0);
                oos.writeObject(ss0v1);
                oos.writeObject(ss0v2);
                oos.flush();
                bAry = baos.toByteArray();
                baos.close();
                oos.close();
                
                try {
                    bais = new ByteArrayInputStream(bAry);
                    ois = new ObjectInputStream(bais);
                    String rcvS0 = (String)ois.readObject();
                    SerializableString0 rcvSS0 = (SerializableString0)ois.readObject();
                    SerializableString1 rcvSS1 = (SerializableString1)ois.readObject();
                    SerializableString2 rcvSS2 = (SerializableString2)ois.readObject();
                    bais.close();
                    ois.close();
                    System.out.printf("rcv    s0: %s\n", rcvS0);
                    System.out.printf("rcv   ss0: %s\n", rcvSS0.get());
                    System.out.printf("rcv   ss1: %s\n", rcvSS1.get());
                    System.out.printf("rcv   ss2: %s\n", rcvSS2.get());
                } catch(Exception e) {
                    e.printStackTrace();
                }
                
                /*
                 * now s0 and ss0 and get printout
                 */
                baos = new ByteArrayOutputStream();
                oos = new ObjectOutputStream(baos);

                oos.writeObject(s0);
                oos.writeObject(ss0);
                
                bAry = baos.toByteArray();
                
                System.out.println("byte array of s0 and ss0");
                t13_PrintBytes(bAry);
                
                baos.close();
                oos.close();
            
            }
            
            public void t14PrintBytes(String msg, byte ba[]) {
                System.out.println(msg);
                t13_PrintBytes(ba);
            }
            
            public void t15() throws Exception {
                /*
                 * testing serialization of nested components, breaking
                 * the byte array, and seeing how much can be recovered.
                 * 
                 * there are 2 types: SContainerChain and SContainerList
                 * do the exact test and see if either one is recoverable
                 * 
                 * ie have a container A which has multiple objects B.
                 * serialize that. then break the container. see if
                 * container A can be recovered. If A cannot be recovered,
                 * then can any subcomponent B be recovered?
                 */
                SCList scl = t15Chain(3);
                boolean res = scl != null;
                assert res;

                //SCChain scc = t15List(3);
            }
            
            public SCList t15Chain(int sz) throws Exception {
                String  s = utils_.randString(10);                
                SCList scl = new SCList(s);
                for(int i = 0; i < sz; i++) {
                    Integer iv = new Integer(i);
                    s = utils_.randString(20);
                    SChain sc = new SChain(s, iv);
                    scl.addSChain(sc);
                }
                scl.printInfo();
                byte ba[] = t14GetBytes(scl);
                
                /*
                 * try breaking the byte array at 70% and see how much
                 * can be recovered.
                 */
                
                double pct = 0.70;
                int szMax = ba.length;
                int szCut = (int)(pct * (double)szMax);
                byte bacut[] = new byte[szCut];
                for(int i = 0; i < szCut; i++) {
                    bacut[i] = ba[i];
                }
                ByteArrayInputStream bais = new ByteArrayInputStream(bacut);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                /* 
                 * probably can't recover the entire object. let's try
                 */
              
                
                t14PrintBytes("ORIGINAL", ba);
                t14PrintBytes("TRUNCATE", bacut);
                CDeserializer cd0 = new CDeserializer(ba);
                //CDeserializer cd1 = new CDeserializer(bacut);
                cd0.startParse();
                
                System.out.printf("recovery phase. orig byte:%d new byte:%d\n",
                    szMax, szCut);
                boolean canRecover = false;
                if(canRecover == false) {
                    try {
                        SCList rcvSCL = (SCList)ois.readObject();
                        rcvSCL.printInfo();
                        canRecover = true;
                    } catch(Exception e) {
                        canRecover = false;
                    }                    
                }

                if(canRecover == false) {
                    try {
                        canRecover = true;                        
                    } catch(Exception e) {
                        canRecover = false;                        
                    }
                }
                
                bais.close();
                ois.close();
                return scl;
            }
            
            public SCChain t15List(int sz) throws Exception {
                String  s = utils_.randString(10);                
                SCChain scc = new SCChain(s);
                for(int i = 0; i < sz; i++) {
                    Integer iv = new Integer(i);
                    s = utils_.randString(10);
                    SChain sc = new SChain(s, iv);
                    scc.addSChain(sc);
                }
                scc.printInfo();
                byte ba[] = t14GetBytes(scc);

                /*
                 * try breaking the byte array at 70% and see how much
                 * can be recovered.
                 */
                
                double pct = 0.70;
                int szMax = ba.length;
                int szCut = (int)(pct * (double)szMax);
                byte bacut[] = new byte[szCut];
                for(int i = 0; i < szCut; i++) {
                    bacut[i] = ba[i];
                }
                ByteArrayInputStream bais = new ByteArrayInputStream(bacut);
                ObjectInputStream ois = new ObjectInputStream(bais);
                
                /* 
                 * probably can't recover the entire object. let's try
                 */
                System.out.printf("recovery phase. orig byte:%d new byte:%d\n",
                    szMax, szCut);
                boolean canRecover = false;
                if(canRecover == false) {
                    try {
                        SCChain rcvSCC = (SCChain)ois.readObject();
                        rcvSCC.printInfo();
                        canRecover = true;
                    } catch(Exception e) {
                        canRecover = false;
                    }                    
                }

                if(canRecover == false) {
                    try {
                        canRecover = true;                        
                    } catch(Exception e) {
                        canRecover = false;                        
                    }
                }
                
                bais.close();
                ois.close();

                
                return scc;
            }
            
            public void test() {
                try {
                    t15();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        class RandomAccessIOTest {
        }

        class IOOSimple implements Serializable {
            // INNER CLASS is NOT serializable, have to use outer class
            // unless outer class is also serializable
            // INNER CLASS is not serializable
            // use IOOSimpleOuter.java

            private static final long serialVersionUID = 83020151526L;
            public int i_;
            public String s_;
            ArrayList<String> ali_;

            public IOOSimple() {
                randomize();
            }

            public void randomize() {
                Utils u = new Utils();
                i_ = u.randInt(10, 99);
                s_ = u.randString(10);
                ali_ = new ArrayList<String>();
                for (int i = 0; i < 5; i++) {
                    ali_.add(u.randString(10));
                }
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                System.out.printf("printInfo begin\n");
                System.out.printf("    i:%d s:%s\n", i_, s_);
                for (int i = 0; i < ali_.size(); i++) {
                    System.out.printf("    s:%s\n", ali_.get(i));
                }
            }
        }

        class IOOSimplePtr extends IOOSimpleOuter {
            // this is not serializable either, you have to use
            // IOSimpleOuterPtr
            IOOSimplePtr n_;
            static final long serialVersionUID = 0;

            public IOOSimplePtr() {
                super();
                n_ = null;
            }

            public void setNext(IOOSimplePtr n) {
                n_ = n;
            }

            public IOOSimplePtr getNext() {
                return n_;
            }
        }

        class SerializationTest {
            public SerializationTest() {
            }

            public IOOSimpleOuterPtr createIOOSimpleChain(int sz) {
                IOOSimpleOuterPtr h = null;
                IOOSimpleOuterPtr t = null;
                for (int i = 0; i < sz; i++) {
                    IOOSimpleOuterPtr o = new IOOSimpleOuterPtr();
                    if (h == null) {
                        h = o;
                        t = o;
                    } else {
                        t.setNext(o);
                        t = o;
                    }
                }
                return h;
            }

            public void t00() {
                // write and read serializable IOOSimple
                try {
                    String sfile = new String("file_iotest_serialize_bin_0");
                    FileOutputStream fos = new FileOutputStream(sfile);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    IOOSimpleOuter oo0 = new IOOSimpleOuter();
                    IOOSimpleOuter oo1 = new IOOSimpleOuter();

                    oo0.printInfo();
                    oo1.printInfo();

                    oos.writeObject(oo0);
                    oos.writeObject(oo1);
                    oos.flush();
                    oos.close();
                    fos.close();

                    FileInputStream fis = new FileInputStream(sfile);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    IOOSimpleOuter oi0 = (IOOSimpleOuter) ois.readObject();
                    IOOSimpleOuter oi1 = (IOOSimpleOuter) ois.readObject();
                    ois.close();
                    fis.close();

                    oi0.printInfo();
                    oi1.printInfo();
                } catch (Exception e) {
                    System.out.printf("Exception %s\n", e.getMessage());
                    e.printStackTrace();
                } finally {
                }
            }

            public void t01() {
                // write and read serializable IOOSimplePtr chain
                // ArrayList<?> t = (ArrayList<?>)o.readObject()
                // IOO o = (IOO)t.get(i);
                try {
                    String sfile = new String("file_iotest_serialize_ser_1");
                    FileOutputStream fos = new FileOutputStream(sfile);
                    ObjectOutputStream oos = new ObjectOutputStream(fos);
                    IOOSimpleOuterPtr h = createIOOSimpleChain(3);

                    IOOSimpleOuterPtr c = h;
                    System.out.printf("-------- print originals\n");
                    while (c != null) {
                        c.printInfo();
                        c = c.getNext();
                    }

                    oos.writeObject(h);
                    oos.flush();
                    oos.close();
                    fos.close();

                    FileInputStream fis = new FileInputStream(sfile);
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    h = (IOOSimpleOuterPtr) ois.readObject();
                    ois.close();
                    fis.close();

                    c = h;
                    System.out.printf("-------- print read serialized\n");
                    while (c != null) {
                        c.printInfo();
                        c = c.getNext();
                    }
                } catch (Exception e) {
                    System.out.printf("Exception %s\n", e.getMessage());
                    e.printStackTrace();
                } finally {
                }
            }

            public void test() {
                t01();
            }
        }

        class CommandLineTest {
            public CommandLineTest() {
            }

            public void testSystemIn(String[] args) {
                // System.in is a bytestream with no char stream functions,
                // so InputStreamReader is needed to get char stream function

            }

            public void testScanner(String[] args) {
                // how to strip the newline
                // version 1: s.setLength(s.length()-1) to strip newline
                // version 2: s.replace("\n","").replace("\r","")
                // version 3: s.trim();
                Scanner scanner = new Scanner(System.in);
                String s = "";
                try {
                    System.out.printf("prompt> ");
                    while (scanner.hasNextLine()) {
                        s = scanner.nextLine().trim();
                        if (s.equals("quit") || s.equals("q")) {
                            break;
                        }
                        System.out.printf("output: %s\n", s);
                        System.out.printf("prompt> ");
                    }
                } catch (Exception e) {
                    System.out.printf("scanner exception:\n");
                    e.printStackTrace();
                } finally {
                    scanner.close();
                }
            }

            public void testScannerParse(String[] args) {
                Scanner scanner = new Scanner(System.in);
                try {
                    System.out.printf("prompt> ");
                    while (scanner.hasNextLine()) {
                        String s = scanner.nextLine().trim();
                        if (s.equals("quit") || s.equals("q")) {
                            break;
                        }
                        java.util.List<String> l = Arrays
                            .asList(s.split("\\s+"));
                        for (int i = 0; i < l.size(); i++) {
                            System.out.printf("    output: %s\n", l.get(i));
                        }
                        System.out.printf("prompt> ");
                    }
                } catch (Exception e) {
                    System.out.printf("scanner exception:\n");
                    e.printStackTrace();
                } finally {
                    scanner.close();
                }
            }

            public void testScannerHackerRank() {
                try {
                    // format:
                    // a // number of items in next line
                    // 0-n // array 0-n of int
                    Scanner scan = new Scanner(System.in);
                    int a = scan.nextInt();
                    int b;
                    for (int i = 0; i < a; i++) {
                        b = scan.nextInt();
                        if (b != -1) {

                        }
                    }
                    scan.close();
                } catch (Exception e) {
                }
            }

            public void testScannerTwoScans(String[] args) {
                Scanner scan = new Scanner(System.in);
                try {
                    // expected input:
                    // num1 num2 // num1 is number of subsequent lines
                    // i1 i2
                    // i3 i4 ...
                    String s = scan.nextLine().trim();
                    java.util.List<String> l = Arrays.asList(s.split("\\s+"));
                    int n0 = -1;
                    int n1 = -1;
                    if (l.size() != 2) {
                        System.out.printf("l.size() != 2\n");
                        return;
                    }
                    try {
                        n0 = Integer.parseInt(l.get(0));
                        n1 = Integer.parseInt(l.get(1));
                        if (n1 != -1) {

                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        return;
                    }
                    for (int i = 0; i < n0; i++) {
                        s = scan.nextLine().trim();
                        l = Arrays.asList(s.split("\\s+"));
                        if (l.size() != 2) {
                            System.out.printf("i:%d l.size() != 2\n", i);
                            return;
                        }
                        try {
                            int x = Integer.parseInt(l.get(0));
                            int y = Integer.parseInt(l.get(1));
                            System.out.printf("i:%2d: %d,%d\n", i, x, y);
                        } catch (Exception e) {
                            e.printStackTrace();
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    scan.close();
                }
            }

            public void testConsole(String[] args) {
                // Console object also provides IO streams that are true
                // character streams via reader and writer

                Console console = System.console();
                if (console == null) {
                    System.out.printf("console is null\n");
                    return;
                }
                String s = "";
                System.out.printf("enter console. quit to quit, invisible\n");
                while (!s.equals("quit") && !s.equals("q")) {
                    s = console.readLine("prompt> ");
                    System.out.printf("output: %s\n", s);
                    if (s.equals("invisible")) {
                        char ca[] = console.readPassword("enter invisible> ");
                        s = String.valueOf(ca);
                        System.out.printf("output: %s\n", s);
                    }
                }
            }

            public void testPrintCmdLineArgs(String[] args) {
                System.out.printf("----------------\n");
                for (int i = 0; i < args.length; i++) {
                    System.out.printf("args:%2d:%s\n", i, args[i]);
                }
                System.out.printf("----------------\n");
                // for(String s: args) {
                // System.out.printf("args:%s\n", s);
                // }
                // System.out.printf("----------------\n");
            }

            public void test(String[] args) {
                // testPrintCmdLineArgs(args);
                // testSystemIn(args);
                // testConsole(args);
                // testScannerParse(args);
                testScannerTwoScans(args);
            }
        }

        class OutputStreamThrottle extends OutputStream {
            private OutputStream os_;
            //private boolean isEarlyTerminate_;
            //private int terminateAtPercent_;
            //private long szFile_;
            //private long minThrottleMS_;
            //private long maxThrottleMS_;
            //private boolean isThrottle_;
            private Random rand_;
            private Path path_;
            //private long curOffset_;
            //private boolean isDbg_;
            //private int szBuf_ = 32;
            //private byte b_[] = new byte[szBuf_];
            
            public OutputStreamThrottle(String fileName) throws IOException {
                path_ = Paths.get(fileName);
                os_ = new ByteArrayOutputStream();
                rand_ = new Random();
            }
            public void check() {
                boolean res;
                res = rand_ != null;
                res = path_ != null;
                assert res;
            }
            @Override
            public void close() throws IOException {
                os_.close();
            }
            @Override
            public void flush() throws IOException {
                os_.flush();
            }
            @Override
            public void write(byte[] b, int off, int len) throws IOException {
                os_.write(b, off,  len);
            }
            @Override
            public void write(byte[] b) throws IOException {
                os_.write(b);
            }
            @Override
            public void write(int b) throws IOException {
                os_.write(b);
            }
        }
        
        class InputStreamThrottle extends InputStream {
            private InputStream is_;
            private boolean isEarlyTerminate_;
            private int terminateAtPercent_;
            private long terminateAtFileOffset_;
            private long szFile_;
            private long minThrottleMS_;
            private long maxThrottleMS_;
            private boolean isThrottle_;
            private Random rand_;
            private Path path_;
            private long curOffset_;
            private boolean isDbg_;
            private int szBuf_ = 32;
            private byte b_[] = new byte[szBuf_];

            public InputStreamThrottle(String fileName) throws IOException {
                path_ = Paths.get(fileName);
                is_ = new FileInputStream(fileName);
                rand_ = new Random();
                initThrottle();
            }

            private boolean initThrottle() {
                return initThrottle(false, 0, 0, 0);
            }

            public boolean initThrottle(
                final boolean isEarlyTerminate, 
                final int terminateAtPercent,
                final long minThrottleMS,
                final long maxThrottleMS) {
                isEarlyTerminate_ = isEarlyTerminate;
                terminateAtPercent_ = terminateAtPercent;
                minThrottleMS_ = minThrottleMS;
                maxThrottleMS_ = maxThrottleMS;
                curOffset_ = 0;
                isDbg_ = false;
                isThrottle_ = true;
                
                if(maxThrottleMS_ == 0) {
                    isThrottle_ = false;
                }
                
                if( (minThrottleMS_ > maxThrottleMS_) || 
                    (terminateAtPercent_ > 100)) {
                    return false;
                }

                try {
                    szFile_ = Files.size(path_);
                    terminateAtFileOffset_ = szFile_;                    
                }
                catch(Exception e) {
                    return false;
                }

                if(isEarlyTerminate_ == false) {
                    return true;
                }

                if(terminateAtPercent_ >= 0 && terminateAtPercent_ < 100) {
                    double pct = (double)terminateAtPercent_ / 100;
                    terminateAtFileOffset_ = (long)((double)szFile_ * pct);
                }
                return true;
            }

            private long randLong() {
                long n = maxThrottleMS_ - minThrottleMS_ + 1;
                long retV = rand_.nextLong() % n;
                if(retV < 0) {
                    retV *= -1;
                }
                retV = retV + minThrottleMS_;
                return retV;
            }
            
            private void randSleep() {
                if(isThrottle_ == false) {
                    return;
                }
                try {
                    long sleepTime = randLong();
                    if(isDbg_ == true) {
                        System.out.printf("sleep: %d%n", sleepTime);
                    }
                    Thread.sleep(sleepTime);                        
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
            
            private void updateOffset(final int bytesRead) {
                if(bytesRead == -1) {
                    return;
                }
                curOffset_ += bytesRead;
            }
            
            private boolean closeIfMaxReached(final int bytesRead) 
                throws IOException {
                if(isClosed() == true) {
                    return true;
                }
                if(bytesRead == -1) {
                    close();
                    return true;
                }
                if(curOffset_ >= szFile_) {
                    close();
                    return true;
                }
                else if(isEarlyTerminate_ == true && 
                    curOffset_ >= terminateAtFileOffset_) {
                    close();
                    return true;
                }
                return false;
            }

            private boolean isClosed() {
                if(is_ == null) {
                    return true;
                }
                return false;
            }
            
            public long getBytesRead() {
                return curOffset_;
            }
            
            @Override
            public int available() throws IOException {
                return is_.available();
            }

            @Override
            public void close() throws IOException {
                if(is_ == null) {
                    return;
                }
                is_.close();                    
                is_ = null;
            }

            @Override
            public void mark(int readlimit) {
                if(is_ == null) {
                    return;
                }
                is_.mark(readlimit);
            }

            @Override 
            public int read() throws IOException {
                if(is_ == null) {
                    return -1;
                }
                randSleep();
                int bytesRead = is_.read();
                updateOffset(bytesRead);
                closeIfMaxReached(bytesRead);
                return bytesRead;
            }

            @Override
            public int read(byte[] b) throws IOException {
                /** 
                 * read szBuf_ at a time and fill into b. Terminate
                 * if curOffset_ >= terminateAtFileOffset_.
                 */
                if(is_ == null) {
                    return -1;
                }
                
                int szInput = b.length;
                int bytesRead = 0;
                if(szBuf_ > szInput) {
                    randSleep();
                    bytesRead = is_.read(b);
                    updateOffset(bytesRead);
                    closeIfMaxReached(bytesRead);
                    return bytesRead;
                }
                
                // read til end of file or til szInput is reached
                int offset = 0;
                boolean doRead = true;
                while(doRead == true) {
                    randSleep();
                    int szOffsetPlusBuf = offset + szBuf_;
                    if(szOffsetPlusBuf > szInput) {
                        doRead = false;
                    }
                    else {
                        bytesRead = is_.read(b_);
                        for(int i = 0; i < bytesRead; i++) {
                            b[offset] = b_[i];
                            offset++;
                        }
                        updateOffset(bytesRead);
                        if(closeIfMaxReached(bytesRead) == true) {
                            doRead = false;
                        }
                        else if(offset >= szInput) {
                            doRead = false;
                        }
                    }
                }
                return offset;
            }

            @Override
            public int read(byte[] b, int off, int len) 
                throws IOException {
                if(is_ == null) {
                    return -1;
                }
                randSleep();
                int bytesRead = is_.read(b, off, len);
                updateOffset(bytesRead);
                closeIfMaxReached(bytesRead);
                return bytesRead;
            }

            @Override
            public void reset() throws IOException {
                if(is_ == null) {
                    return;
                }
                is_.reset();
            }

            @Override
            public boolean markSupported() {
                if(is_ == null) {
                    return false;
                }
                return is_.markSupported();
            }
            
            @Override
            public long skip(long n) throws IOException {
                long res = is_.skip(n);
                curOffset_ += res;
                closeIfMaxReached(0);
                return res;
            }
        }

        public String getFileString(String fileName) throws Exception {
            InputStream is = new FileInputStream(fileName);
            int szRead = 0;
            byte[] b = new byte[256];
            StringBuilder sb = new StringBuilder();
            while((szRead = is.read(b)) != -1) {
                for(int i = 0; i < szRead; i++) {
                    sb.append((char)b[i]);
                }
            }
            is.close();
            return sb.toString();
        }
        
        class IOTestsCases {
            public IOTestsCases() {
            }

            public void t00() {
                SerializationTest t = new SerializationTest();
                t.test();
            }

            public void t01(String[] args) {
                CommandLineTest t = new CommandLineTest();
                t.test(args);
            }

            public void t02() {
                IOFileTest t = new IOFileTest();
                t.test();
            }

            public void t03() {
                String spath;
                ArrayList<String> list;
                spath = "/Users/wayneng/Documents"
                    + "/docs/docs_public_read_only/src_code/java_1.8/";
                list = listFilesInDirIO(spath, true);
                for (String s : list) {
                    System.out.printf("badd +1 %s%n", s);
                }
            }

            public void t04() {
                String sPath;
                sPath = "/Users/wayneng/Documents" +
                    "/docs/docs_public_read_only/src_code/java_1.8/";
                Path path1 = Paths.get(sPath);
                Path path2 = FileSystems.getDefault().getPath(sPath);
                System.out.printf("path1: %s%n",
                    path1.getFileName().toString());
                System.out.printf("path2: %s%n",
                    path2.getFileName().toString());
            }

            public void t05() {
                String sPath = "/Users/wayneng/Documents/docs_readonly/src_code"
                    + "/java/jdk_src_1.8/src/java/lang";
                ArrayList<String> list = listFilesInDirIO(sPath, true);
                for (String s : list) {
                    System.out.println(s);
                }
            }

            public void t06() {
                String sPath = "/Users/wayneng/Documents/docs_readonly/src_code"
                    + "/java/jdk_src_1.8/src/java/lang";
                ArrayList<String> list = listFilesInDirNIO(sPath, true);
                for (String s : list) {
                    System.out.println(s);
                }
            }

            public void t07() throws Exception {
                System.out.println("test write and move");
                String spath = "out/out.string.txt";
                Path path = Paths.get(spath);

                // if this file exists, move it to incremental file
                if (Files.exists(path) == true) {
                    int idx = 0;
                    String sPathDst = String.format("%s.%d", spath, idx);
                    Path pathDst = Paths.get(sPathDst);
                    while (Files.exists(pathDst) == true) {
                        idx++;
                        sPathDst = String.format("%s.%d", spath, idx);
                        pathDst = Paths.get(sPathDst);
                    }
                    System.out.printf("Moving %s to %s%n",
                        spath, sPathDst);
                    Files.move(path, pathDst);
                }

                // create some random text
                int numCharsPerWord = 10;
                int numWordsPerLine = 7;
                int numLines = 20;
                String delimiter = ",";
                ArrayList<String> sary = utils_.randStringArray(
                    numCharsPerWord, numWordsPerLine, numLines, delimiter);

                // now write, then read
                BufferedWriter w = null;
                BufferedReader r = null;
                try {
                    w = Files.newBufferedWriter(path);
                    for (String s : sary) {
                        w.write(s + "\n");
                    }
                    w.flush();
                    r = Files.newBufferedReader(path);
                    String s;
                    while ((s = r.readLine()) != null) {
                        System.out.println(s);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    w.close();
                    r.close();
                }
            }
            
            public void t08() throws Exception {
                String base = "/Users/wayneng/Downloads/tmp_test_files/";
                String spath = base + "tmp.randFile.1KB.txt";
                boolean overwriteFile = true;
                int numCharsPerWord = 8;
                int numWordsPerLine = 10;
                int szFile = 1000;
                t08(spath, overwriteFile, numCharsPerWord, 
                    numWordsPerLine, szFile);
            }
            
            public void t08(
                String spath, 
                boolean overwriteFile,
                int numCharsPerWord,
                int numWordsPerLine,
                int szFile) throws Exception {
                int numBytesPerLine = 
                    (numCharsPerWord * 1 * numWordsPerLine) + numWordsPerLine;
                int numLines = szFile / numBytesPerLine + 1;
                Integer iRes = saveRandomFile(
                    spath, 
                    overwriteFile, 
                    numCharsPerWord, 
                    numWordsPerLine, 
                    numLines);
                boolean res = iRes != null;
                assert res : "t08 write file error%n";
            }

            public void t09() throws Exception {
                String base = "/Users/wayneng/Downloads/tmp_test_files/";
                base = "out/";
                boolean overwriteFile = false;
                int numCharsPerWord = 8;
                int numWordsPerLine = 10;
                for(int i = 0; i < 50; i++) {
                    int sz = 1;
                    if(i < 10) {
                        sz = 1;
                    } else if (i < 20) {
                        sz = 10;
                    } else if (i < 30) {
                        sz = 100;
                    } else if (i < 40) {
                        sz = 1000;
                    } else {
                        sz = 10000;
                    }
                    int szFile = 1000 * sz;
                    String spath = base + 
                        String.format("%s%d%s%02d.txt", 
                            "tmp.randFile.", sz, "KB.", i);
                    t08(spath, overwriteFile, numCharsPerWord, 
                        numWordsPerLine, szFile);                    
                }
            }

            public void t10() throws Exception {
                String fileName = "out/tmp.randFile.1KB.00.txt";
                InputStream is = new FileInputStream(fileName);
                byte[] b = new byte[128];
                int szRead = 0;
                StringBuilder sb = new StringBuilder();
                while((szRead = is.read(b)) != -1) {
                    for(int i = 0; i < szRead; i++) {
                        sb.append((char)b[i]);
                    }
                }
                String s = sb.toString();
                System.out.printf("String out: %n%s%n", s);
                is.close();
            }
 
            public void t11() throws Exception {
                String fileName = "out/tmp.randFile.1KB.00.txt";
                InputStreamThrottle ist = new InputStreamThrottle(fileName);
                boolean isEarlyTerminate = false;
                int terminateAtPercent = 0;
                long minThrottleMS = 100;
                long maxThrottleMS = 500;
                int numBytesBetweenThrottle = 32;
                ist.initThrottle(isEarlyTerminate, terminateAtPercent,
                    minThrottleMS, maxThrottleMS);
                InputStream is = ist;
                byte[] b = new byte[numBytesBetweenThrottle];
                int szRead = 0;
                StringBuilder sb = new StringBuilder();
                while((szRead = is.read(b)) != -1) {
                    for(int i = 0; i < szRead; i++) {
                        sb.append((char)b[i]);
                    }
                    System.out.printf("got %d bytes\n", szRead);
                }
                String s = sb.toString();
                System.out.printf("InputStreamThrottle out: %n%s%n", s);
                is.close();
            }
            
            public void t12() throws Exception {
                String fileName = "out/tmp.randFile.1KB.00.txt";
                InputStreamThrottle ist = new InputStreamThrottle(fileName);
                boolean isEarlyTerminate = true;
                int terminateAtPercent = 50;
                long minThrottleMS = 100;
                long maxThrottleMS = 200;
                int numBytesBetweenThrottle = 128;
                ist.initThrottle(isEarlyTerminate, terminateAtPercent,
                    minThrottleMS, maxThrottleMS);
                InputStream is = ist;
                byte[] b = new byte[numBytesBetweenThrottle];
                int szRead = 0;
                StringBuilder sb = new StringBuilder();
                while((szRead = is.read(b)) != -1) {
                    for(int i = 0; i < szRead; i++) {
                        sb.append((char)b[i]);
                    }
                }
                String s = sb.toString();
                System.out.printf("InputStreamThrottle out: %n%s%n", s);
                is.close();
            }

            public void t13() throws Exception {
                String fileName = "out/tmp.randFile.1KB.00.txt";
                String refStr = getFileString(fileName);
                InputStreamThrottle ist = new InputStreamThrottle(fileName);
                boolean isEarlyTerminate = false;
                int terminateAtPercent = 50;
                long minThrottleMS = 10;
                long maxThrottleMS = 20;
                int numBytesBetweenThrottle = 128;
                ist.initThrottle(isEarlyTerminate, terminateAtPercent,
                    minThrottleMS, maxThrottleMS);
                InputStream is = ist;
                byte[] b = new byte[numBytesBetweenThrottle];
                int szRead = 0;
                StringBuilder sb = new StringBuilder();
                while((szRead = is.read(b)) != -1) {
                    for(int i = 0; i < szRead; i++) {
                        sb.append((char)b[i]);
                    }
                }
                String s = sb.toString();
                System.out.printf("InputStreamThrottle out: %n%s%n", s);
                is.close();
                boolean res = refStr.equals(s);
                assert res : "string cmp mismatch";
                System.out.println("test pass");
            }

            public void t14() throws Exception {
                String base = "/Users/wayneng/Downloads/tmp_test_files/";
                base = "out/";
                boolean overwriteFile = false;
                int numCharsPerWord = 8;
                int numWordsPerLine = 10;
                for(int i = 0; i < 1; i++) {
                    int sz = 300000;
                    int szFile = 300000000;
                    String spath = base + 
                        String.format("%s%d%s%02d.txt", 
                            "tmp.randFile.", sz, "KB.", i);
                    t08(spath, overwriteFile, numCharsPerWord, 
                        numWordsPerLine, szFile);                    
                }
            }

            public void t15() throws Exception {
                IOStreamTest t = new IOStreamTest();
                t.test();
            }
            
            public void test() {
                try {
                    t15();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public IOTests() {
        }

        public void test(String[] args) {
            IOTestsCases test = new IOTestsCases();
            test.test();
        }
        
        public void test() {
            IOTestsCases test = new IOTestsCases();
            test.test();            
        }
        
        public InputStream getTestInputStream(
            final String fileName,
            final boolean isEarlyTerminate,
            final int terminateAtPercent,
            long minThrottleMS,
            long maxThrottleMS) {
            InputStreamThrottle ist = null;
            try {
                ist = new InputStreamThrottle(fileName);
                ist.initThrottle(isEarlyTerminate, terminateAtPercent,
                    minThrottleMS, maxThrottleMS);
                InputStream is = ist;
                return is;
            }
            catch(Exception e) {
                
            }
            return null;
        }
    }
    class NIOTests {
        Utils utils = new Utils();
        public void print(String format, Object... args) {
            System.out.printf(format, args);
        }
        /*
         * ByteBuffer is used with NIO Channel. Data read from Channel 
         * to ByteBuffer. Data written from ByteBuffer to Channel.
         */
        
        public String getRandMultiString() throws Exception {
            int charsPerWord = 8;
            int wordsPerLine = 7;
            int numLines = 100;
            utils.loadCharSet("ABCD");
            ArrayList<String> sary = utils.randStringArray(
                charsPerWord, wordsPerLine, numLines, null);
            ByteArrayOutputStream baos = 
                utils.arrayStringToByteArrayOutputStream(sary);
            byte[] ba = baos.toByteArray();
            String sRef = new String(ba);
            return sRef;
        }

        /*
         * RandByteGenerator generates random bytes and throttles. 
         * 
         * This is used as producer for ByteBuffer and Channel usage.
         * 
         * Have a Channel connect to the read/readBytesThrottled method,
         * which returns bytes after periodic sleep. Multiple Channels
         * are connected to single selector, with each channel connected
         * to a RandByteGenerator producer source. Channel uses a single
         * ByteBuffer, which Channel writes to. A seperate Channel reader
         * then reads from same ByteBuffer whenever there are bytes to read. 
         */
        public class RandByteGenerator {
            private final int numBytes;
            private final int minThrottleMS;
            private final int maxThrottleMS;
            private final byte [] bytesReference;
            private final byte [] bytesWrite;
            private int offsetRead = 0;
            private int offsetWrite = 0;

            public RandByteGenerator(
                final int numBytes,
                final int minThrottle,
                final int maxThrottle) 
            {
                this.numBytes = numBytes;
                this.minThrottleMS = minThrottle;
                this.maxThrottleMS = maxThrottle;
                bytesWrite = new byte[numBytes];
                bytesReference = utils.randByteAry(numBytes);
            }
            public byte [] getByteReference() {
                return bytesReference;
            }
            public byte [] getBytesWrite() {
                if(offsetWrite == 0) {
                    return null;
                }
                return Arrays.copyOfRange(bytesWrite, 0, offsetWrite);
            }
            public boolean putBytesThrottled(final byte [] bytes) 
                throws InterruptedException {
                final long millis = utils.randInt(minThrottleMS, maxThrottleMS, true);
                Thread.sleep(millis);
                return putBytes(bytes);
            }
            public boolean putBytes(final byte [] bytes) {
                if(!canWrite()) {
                    return false;
                }
                int offsetEnd = offsetWrite + bytes.length;
                if(offsetEnd >= numBytes) {
                    return false;
                }
                for(int i = 0; i < bytes.length; i++) {
                    bytesWrite[i+offsetWrite] = bytes[i];
                }
                offsetWrite = offsetEnd;
                return true;
            }
            public boolean putByteThrottled(final byte b) 
                throws InterruptedException {
                final long millis = utils.randInt(minThrottleMS, maxThrottleMS, true);
                Thread.sleep(millis);
                return putByte(b);
            }
            public boolean putByte(final byte b) {
                if(!canWrite()) {
                    return false;
                }
                bytesWrite[offsetWrite++] = b;
                return true;
            }
            public byte getByteThrottled() throws InterruptedException {
                final long millis = utils.randInt(minThrottleMS, maxThrottleMS, true);
                Thread.sleep(millis);
                return getByte();
            }
            public byte getByte() {
                if(!hasBytes()) {
                    return 0;
                }
                byte b = bytesReference[offsetRead++];
                return b;
            }
            public byte [] getBytesThrottled() throws InterruptedException {
                final long millis = utils.randInt(minThrottleMS, maxThrottleMS, true);
                Thread.sleep(millis);
                return getBytes();
            }
            public byte [] getBytes() {
                if(!hasBytes()) {
                    return null;
                }
                int bytesRemaining = numBytes - offsetRead;
                int numBytesToReturn = utils.randInt(1, bytesRemaining, true);
                int offsetEnd = offsetRead + numBytesToReturn;
                byte [] bytesReturn = 
                    Arrays.copyOfRange(bytesReference, offsetRead, offsetEnd);
                offsetRead = offsetEnd;
                return bytesReturn;
            }
            public void getBytesThrottled(byte [] bytes) 
                throws InterruptedException {
                final long millis = utils.randInt(minThrottleMS, maxThrottleMS, true);
                Thread.sleep(millis);
                getBytes(bytes);
            }
            public void getBytes(byte [] bytes) {
                if(!hasBytes()) {
                    return;
                }
                int bytesRemaining = numBytes - offsetRead;
                for(int i = 0; i < bytes.length; i++) {
                    bytes[i] = 0;
                }
                if(bytes.length < bytesRemaining) {
                    int offsetEnd = offsetRead + bytes.length;
                    for(int i = 0; i < bytes.length; i++) {
                        bytes[i] = bytesReference[i+offsetRead];
                    }
                    offsetRead = offsetEnd;
                } else {
                    int offsetEnd = offsetRead + bytesRemaining;
                    for(int i = 0; i < bytesRemaining; i++) {
                        bytes[i] = bytesReference[i+offsetRead];
                    }
                    offsetRead = offsetEnd;                    
                }
            }
            public void resetRead() {
                offsetRead = 0;
            }
            public void resetWrite() {
                offsetWrite = 0;
            }
            public int offsetRead() {
                return offsetRead;
            }
            public int offsetWrite() {
                return offsetWrite;
            }
            public int bytesRemainingRead() {
                return (numBytes - offsetRead);
            }
            public int bytesRemainingWrite() {
                return (numBytes - offsetWrite);
            }
            public void reset() {
                resetRead();
                resetWrite();
            }
            public boolean hasBytes() {
                return offsetRead < numBytes;
            }
            public boolean canWrite() {
                return offsetWrite < numBytes;
            }
        }
        /*
         * There is no ByteChannel implementation other than 
         * FileChannel, SocketChannel, DatagramChannel. I just want a 
         * channel that reads from custom byte stream.
         * 
         * So read from underlying RandByteGenerator.
         */
        public class ThrottledByteChannel implements ByteChannel {
            private RandByteGenerator rbg = null;
            
            /*
             * Read internal buffer into channel.
             */
            public int writeToPipeChannel(final Pipe.SinkChannel channel) 
                throws IOException 
            {
                if(!isOpen()) {
                    return -1;
                }
                final int bytesToRead = rbg.bytesRemainingRead();
                final int szBB = 5;
                ByteBuffer bb = ByteBuffer.allocate(szBB);
                int bytesRead = 0;
                for(int i = 0; i < bytesToRead; i++) {
                    try {
                        byte b = rbg.getByteThrottled();
                        bb.put(b);
                        if(bb.position() == bb.capacity()) {
                            bb.flip();
                            channel.write(bb);
                            bb.flip();
                        }
                        bytesRead++;
                    } catch(InterruptedException e) {
                    }
                }
                if(bb.position() != 0) {
                    bb.flip();
                    channel.write(bb);
                    bb.flip();
                }
                return bytesRead;                
            }
                        
            /*
             * Read from internal buffer into ByteBuffer dst.
             */
            @Override
            public int read(ByteBuffer dst) throws IOException {
                if(!isOpen()) {
                    return -1;
                }
                final int bytesAvailableSrc = rbg.bytesRemainingRead();
                final int bytesAvailableDst = dst.remaining();
                final int bytesToRead = (bytesAvailableSrc < bytesAvailableDst) ? 
                    bytesAvailableSrc : bytesAvailableDst;
                int bytesRead = 0;
                for(int i = 0; i < bytesToRead; i++) {
                    try {
                        byte b = rbg.getByteThrottled();
                        dst.put(b);  
                        bytesRead++;
                    } catch(InterruptedException e) {
                    }
                }
                return bytesRead;
            }
            
            /*
             * Write from ByteBuffer src to internal buffer.
             */
            @Override
            public int write(ByteBuffer src) throws IOException {
                if(!isOpen()) {
                    return -1;
                }
                final int bytesAvailableSrc = src.remaining();
                final int bytesAvailableDst = rbg.bytesRemainingWrite();
                final int bytesToWrite = (bytesAvailableSrc < bytesAvailableDst) ?
                    bytesAvailableSrc : bytesAvailableDst;
                int bytesWrite = 0;
                for(int i = 0; i < bytesToWrite; i++) {
                    try {
                        byte b = src.get();
                        rbg.putByteThrottled(b);
                        bytesWrite++;
                    } catch(InterruptedException e) {
                    }
                }
                return bytesWrite;
            }
            
            @Override
            public void close() {
                rbg = null;
            }
            
            @Override
            public boolean isOpen() {
                if(rbg == null || !rbg.hasBytes()) {
                    return false;
                }
                return true;
            }
            
            public void setGenerator(
                final int numBytes, final int minThrottle, final int maxThrottle
            ) {
                if(rbg != null) {
                    return;
                }
                rbg = new RandByteGenerator(numBytes, minThrottle, maxThrottle);
            }
            public final static int READ = 0;
            public final static int WRITE = 1;
            public byte [] getRawBytes(final int type) {
                if(rbg == null) {
                    return null;
                }
                if(type == READ) {
                    return rbg.getByteReference();
                }
                else {
                    return rbg.getBytesWrite();
                }
            }
        }
        
        class HandlerAttach {
            public File file_;
            public AsynchronousFileChannel afc_;
            public ByteBuffer bb_;
            public ByteBuffer bbr_;
            public Object obj_;

            public HandlerAttach() {
                file_ = null;
                afc_ = null;
                bb_ = null;
                bbr_ = null;
                obj_ = null;
            }

            public void handlerT0(Integer res, Object obj) {
                System.out.printf("HandlerAttach handlerT0 called\n");
            }

            public void handlerT1(Integer res, Object obj) {
                System.out.printf("HandlerAttach handlerT1 called\n");
            }
        }

        class AsyncHandlerT0 implements CompletionHandler<Integer, Object> {
            Object obj_;

            public AsyncHandlerT0(Object obj) {
                obj_ = obj;
            }

            public void completed(Integer res, Object attach) {
                System.out.printf("NIO AsyncHandlerT0 completed called\n");
                HandlerAttach obj0 = (HandlerAttach) obj_;
                AsyncHandlerT1 obj1 = (AsyncHandlerT1) attach;
                try {
                    ByteArrayInputStream bais = new ByteArrayInputStream(
                        obj0.bb_.array());
                    ObjectInputStream ois = new ObjectInputStream(bais);
                    IOOSimpleOuterPtr ioo = (IOOSimpleOuterPtr) ois
                        .readObject();
                    if (ioo != null) {
                        ioo.printChainCompact();
                    }
                } catch (Exception e) {
                    System.out.printf("exception 000\n");
                    e.printStackTrace();
                }
                ByteBuffer bb = ByteBuffer.allocate(2048);
                obj0.bbr_ = bb;
                obj0.bbr_.flip();
                obj0.afc_.read(obj0.bbr_, 0, obj0.bb_, obj1);
            }

            public void failed(Throwable e, Object attach) {
                System.out.printf("NIO AsyncHandlerT0 failed called\n");
                e.printStackTrace();
            }
        }

        class AsyncHandlerT1 implements CompletionHandler<Integer, Object> {
            Object obj_;

            public AsyncHandlerT1(Object obj) {
                obj_ = obj;
            }

            public void completed(Integer res, Object attach) {
                System.out.printf("NIO AsyncHandlerT1 completed called\n");
                HandlerAttach obj = (HandlerAttach) obj_;
                obj.handlerT1(res, attach);
            }

            public void failed(Throwable e, Object attach) {
                System.out.printf("NIO AsyncHandlerT1 failed called:%s\n",
                    e.getMessage());
                e.printStackTrace();
            }
        }


        class Tests {
            public void t0()  throws Exception {
            }
            public void t1() throws Exception {
            }
            public void t02() throws InterruptedException {
                byte [] bytes = t02(50, 500, 2000, true);
                assert (bytes != null);
            }
            public byte [] t02(
                final int numBytes,
                final int minThrottleMS,
                final int maxThrottleMS,
                final boolean isDbg
                ) throws InterruptedException {
                /*
                 * Just test basic RandByteGenerator.
                 */
                RandByteGenerator randByteGenerator = 
                    new RandByteGenerator(numBytes, minThrottleMS, maxThrottleMS);
                byte [] bytesRef = randByteGenerator.getByteReference();
                ByteBuffer byteBuffer = ByteBuffer.allocate(numBytes);
                while(randByteGenerator.hasBytes()) {
                    byte [] bytes = randByteGenerator.getBytesThrottled();
                    if(bytes != null) {
                        byteBuffer.put(bytes);
                    }
                }
                byteBuffer.flip();
                byte [] bytesCmp = new byte[numBytes];
                byteBuffer.get(bytesCmp);
                if(isDbg) {
                    StringBuilder sbRef = new StringBuilder();
                    StringBuilder sbCmp = new StringBuilder();
                    for(int i = 0; i < numBytes; i++) {
                        sbRef.append(String.format("%02x ", bytesRef[i]));
                        sbCmp.append(String.format("%02x ", bytesCmp[i]));
                    }
                    
                    System.out.printf("REF: %s\n", sbRef.toString());
                    System.out.printf("CMP: %s\n", sbCmp.toString());
                }
                for(int i = 0; i < numBytes; i++) {
                    boolean res = bytesCmp[i] == bytesRef[i];
                    if(!res) {
                        String s = String.format(
                            "ERROR byte mismatch at byte %03d, exp:%d act:%d\n", 
                            i, bytesRef[i], bytesCmp[i]);
                        assert res : s;
                    }
                }
                if(isDbg) {
                    System.out.printf("RandByteGen test pass\n");
                }
                return bytesCmp;
            }
            public void t03() throws InterruptedException {
                /*
                 * test 10 streams of byte producers and the time needed serially.
                 */
                int numStreams = 10;
                final int numBytes = 50;
                byte [][] bytesFinal = new byte[numStreams][];
                for(int i = 0; i < numStreams; i++) {
                    byte [] bytes = t02(numBytes, 500, 2000, true);
                    assert (bytes != null);
                    bytesFinal[i] = bytes;
                }
                for(int i = 0; i < numStreams; i++) {
                    assert(bytesFinal[i].length == numBytes);
                }
                System.out.printf("t03 test pass\n");
            }
            public void t04() throws InterruptedException, IOException {
                /* 
                 * test 10 streams of byte producers with Channels and selector.
                 */
                int numStreams = 1;
                final int numBytes = 50;
                final int minThrottle = 10;
                final int maxThrottle = 90;
                byte [][] bytesFinal = new byte[numStreams][];
                Selector selector = Selector.open();
                
                ArrayList<ThrottledByteChannel> listTBC = new ArrayList<>();
                for(int i = 0; i < numStreams; i++) {
                    ThrottledByteChannel tbc = new ThrottledByteChannel();
                    tbc.setGenerator(numBytes, minThrottle, maxThrottle);
                    listTBC.add(tbc);
                }
                
                ArrayList<Pipe.SinkChannel> listPipeSink = new ArrayList<>();
                ArrayList<Pipe.SourceChannel> listPipeSource = new ArrayList<>();
                ArrayList<Pipe> listPipe = new ArrayList<>();
                ArrayList<SelectionKey> listSelectionKeySink = new ArrayList<>();
                ArrayList<SelectionKey> listSelectionKeySource = new ArrayList<>();
                ArrayList<ByteBuffer> listBB = new ArrayList<>();
                
                for(int i = 0; i < numStreams; i++) {
                    Pipe pipe = Pipe.open();
                    Pipe.SinkChannel pipeSink = pipe.sink();
                    Pipe.SourceChannel pipeSource = pipe.source();
                    ByteBuffer bb = ByteBuffer.allocate(numBytes);
                    pipeSink.configureBlocking(false);
                    pipeSource.configureBlocking(false);
                    
                    SelectionKey keySource = 
                        pipeSource.register(selector, SelectionKey.OP_READ);
                    SelectionKey keySink = 
                        pipeSource.register(selector, SelectionKey.OP_WRITE);
                    
                    keySource.attach(bb);
                    
                    listSelectionKeySink.add(keySink);
                    listSelectionKeySource.add(keySource);
                    listBB.add(bb);
                    
                    listPipeSource.add(pipeSource);
                    listPipeSink.add(pipeSink);
                    listPipe.add(pipe);
                }
                
                ArrayList<Runnable> listRun = new ArrayList<>();
                
                for(int i = 0; i < numStreams; i++) {
                    final int idx = i;
                    listRun.add(new Runnable() {
                       public void run() {
                           try {
                               listTBC.get(idx).writeToPipeChannel(listPipeSink.get(idx));                                                   
                           } catch(Exception e) { }
                       }
                    });
                }                                

                /*
                 * Run the Pipe.SinkChannel readers from ThrottledByteChannel
                 */
                int numCores = Runtime.getRuntime().availableProcessors();
                int numThreads = numCores * 2;
                ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

                for(int i = 0; i < numStreams; i++) {
                    executorService.execute(listRun.get(i));
                }
                
                /*
                 * Now wait for each sink channel to finish collecting into 
                 * ByteBuffer.
                 */
                
                boolean finished = false;
                while(!finished) {
                    int readyChannels = selector.select(); // blocking call
                    if(readyChannels == 0) {
                        continue;
                    }
                    Set<SelectionKey> selectedKeys = selector.selectedKeys();
                    for(SelectionKey selectionKey: selectedKeys) {
                        if(selectionKey.isReadable()) {
                            
                        }
                        else if(selectionKey.isWritable()) {
                            
                        }
                        
                        selectedKeys.remove(selectionKey);
                    }
                }
                
                /*
                 * Now do comparison of each ByteBuffer with reference values. 
                 */
                
                selector.close();
                executorService.shutdown();
                for(int i = 0; i < numStreams; i++) {
                    assert(bytesFinal[i].length == numBytes);
                }
                System.out.printf("t03 test pass\n");
            }
            public void t05() throws InterruptedException, IOException {
                /*
                 * Test basic ThrottledByteChannel reader.
                 */
                final int numBytes = 80;
                final int minThrottle = 10;
                final int maxThrottle = 90;
                ThrottledByteChannel t = new ThrottledByteChannel();
                ByteBuffer bb = ByteBuffer.allocate(numBytes);
                t.setGenerator(numBytes, minThrottle, maxThrottle);
                int szRead = t.read(bb);
                assert (szRead == numBytes);
                bb.flip();
                byte [] bytesRead = new byte[numBytes];
                bb.get(bytesRead);
                byte [] bytesRef = t.getRawBytes(ThrottledByteChannel.READ);
                t.close();
                assert (bytesRead.length == bytesRef.length);
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < bytesRef.length; i++) {
                    assert (bytesRead[i] == bytesRef[i]);
                    sb.append(String.format("%02x ", bytesRef[i]));
                }
                print("%s\n", sb.toString());
                print("test read passed\n");
            }
            public void t06() throws InterruptedException, IOException {
                /*
                 * Test basic ThrottledByteChannel writer. 
                 */
                final int numBytes = 80;
                final int minThrottle = 10;
                final int maxThrottle = 90;
                ThrottledByteChannel t = new ThrottledByteChannel();
                ByteBuffer bb = ByteBuffer.allocate(numBytes);
                t.setGenerator(numBytes, minThrottle, maxThrottle);
                byte [] bytesRef = t.getRawBytes(0);
                bb.put(bytesRef);
                bb.flip();
                int szWrite = t.write(bb);
                assert (szWrite == numBytes);
                byte [] bytesRead = t.getRawBytes(ThrottledByteChannel.WRITE);
                t.close();
                assert (bytesRead.length == bytesRef.length);
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < bytesRef.length; i++) {
                    assert (bytesRead[i] == bytesRef[i]);
                    sb.append(String.format("%02x ", bytesRef[i]));
                }
                print("%s\n", sb.toString());
                print("test write passed\n");
            }
            
            public void t07() throws Exception {
                /*
                 * simple ByteBuffer example.
                 * 
                 * write into BB from byte array. and read from BB into BAOS. 
                 */
                
                String sRef = getRandMultiString();
                byte[] ba = sRef.getBytes();
                
                int szBuffer = 100;
                int szByteArrayBB = szBuffer / 2;
                ByteBuffer bb = ByteBuffer.allocate(szBuffer);
                byte[] baBB = new byte[szByteArrayBB];
                
                // now write to ByteBuffer from byte array and read from
                // ByteBuffer into baos and compare with reference. 
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int posBA = 0;
                int bbPosition = 0;
                while(posBA < ba.length) {
                    // write and fill up buffer
                    int length = (szBuffer < (ba.length - posBA)) ? 
                      szBuffer : ba.length - posBA;
                    
                    bb.put(ba, posBA, length); // write into bb
                    posBA += length;
                    bb.flip();
                    
                    // read from buffer into baos
                    while(bb.hasRemaining()) {
                        bbPosition = bb.position();
                        int bbLimit = bb.limit(); 
                        // limit can vary based on how much read
                        length = (baBB.length < (bbLimit - bbPosition)) ?
                            baBB.length : bb.limit() - bbPosition;
                        bb.get(baBB, 0, length); // read from bb
                        baos.write(baBB, 0, length);
                    }
                    bb.clear();
                }
                
                String sTest = new String(baos.toByteArray());
                
                boolean res = sRef.equals(sTest);
                assert res : "string mismatch";
                System.out.println("String match. PASS");
            }

            public void t08() throws Exception {
                System.out.printf("ByteBuffer with object\n");
                IOOSimpleOuterPtr iooSrc = IOOSimpleOuterPtr.createChain(3);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(iooSrc);
                ByteBuffer bb = ByteBuffer.wrap(baos.toByteArray());

                byte ba[] = new byte[bb.remaining()];
                bb.get(ba);

                ByteArrayInputStream bais = new ByteArrayInputStream(ba);
                ObjectInputStream ois = new ObjectInputStream(bais);
                IOOSimpleOuterPtr iooDst = (IOOSimpleOuterPtr) ois.readObject();

                iooSrc.printChainCompact("src");
                iooDst.printChainCompact("dst");
            }


            public void t10() throws Exception {
                System.out.printf("ByteBuffer with FileChannel and Object\n");
                IOOSimpleOuterPtr iooSrc = IOOSimpleOuterPtr.createChain(3);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(iooSrc);
                ByteBuffer bb = ByteBuffer.wrap(baos.toByteArray());

                String sFile = "file_test_nio_fs_10.out";
                Path path = Paths.get(sFile);
                FileChannel fc = FileChannel.open(path,
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE);

                while (bb.hasRemaining()) {
                    fc.write(bb);
                }
                fc.close();
                baos.close();
                oos.close();

                baos = new ByteArrayOutputStream();
                fc = FileChannel.open(path, StandardOpenOption.READ);
                bb = ByteBuffer.allocate(32);
                int bytesRead = fc.read(bb);

                while (bytesRead != -1) {
                    bb.flip();
                    baos.write(bb.array());
                    bb.clear();
                    bytesRead = fc.read(bb);
                }

                ByteArrayInputStream bais = new ByteArrayInputStream(
                    baos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bais);
                IOOSimpleOuterPtr iooDst = (IOOSimpleOuterPtr) ois.readObject();

                bais.close();
                ois.close();
                fc.close();

                System.out.printf("file: %s\n", sFile);
                iooSrc.printChainCompact("src");
                iooDst.printChainCompact("dst");

            }

            public void t11() throws Exception {
                System.out.printf("ByteBuffer with FileChannel and HashMap\n");
                Utils util = new Utils();
                HashMap<Integer, String> srcMap = util.randHashMap(10, 25);

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(srcMap);
                ByteBuffer bb = ByteBuffer.wrap(baos.toByteArray());

                String sFile = "file_test_nio_fs_11.out";
                Path path = Paths.get(sFile);
                FileChannel fc = FileChannel.open(path,
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE);

                while (bb.hasRemaining()) {
                    fc.write(bb);
                }
                fc.close();
                baos.close();
                oos.close();

                baos = new ByteArrayOutputStream();
                fc = FileChannel.open(path, StandardOpenOption.READ);
                bb = ByteBuffer.allocate(32);
                int bytesRead = fc.read(bb);

                while (bytesRead != -1) {
                    bb.flip();
                    baos.write(bb.array());
                    bb.clear();
                    bytesRead = fc.read(bb);
                }

                ByteArrayInputStream bais = new ByteArrayInputStream(
                    baos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bais);
                @SuppressWarnings("unchecked")
                HashMap<Integer, String> dstMap = (HashMap<Integer, String>) ois
                    .readObject();

                bais.close();
                ois.close();
                fc.close();

                System.out.printf("file: %s\n", sFile);
                System.out.printf("srcMap\n");
                util.printHashMapIS(srcMap);
                System.out.printf("dstMap\n");
                util.printHashMapIS(dstMap);
            }

            public void testStringByteArray() throws Exception {
                System.out.printf("String byte array test\n");
                Utils util = new Utils();
                int max = 128;
                String randStr = util.randString(max);
                byte[] randStrB = randStr.getBytes();
                byte[] randStrUTF = randStr.getBytes("UTF-8");
                String dstStr0 = String.valueOf(randStrB); // wrong
                String dstStr1 = new String(randStrB, "UTF-8"); // correct
                String dstStr2 = new String(randStrUTF, "UTF-8"); // correct
                System.out.printf("randStr:    %s\n", randStr);
                System.out.printf("randStrB:   %s\n", randStrB);
                System.out.printf("randStrUTF: %s\n", randStrUTF);
                System.out.printf("dstStr0:    %s\n", dstStr0);
                System.out.printf("dstStr1:    %s\n", dstStr1);
                System.out.printf("dstStr2:    %s\n", dstStr2);
            }

            public void t12() throws Exception {
                String spath = "out/file_100mb.txt";
                int szTarget = 100000000;
                int numCharsPerWord = 4;

                spath = "out/file_4x1mb.txt";
                szTarget = 1000000;
                t12_write(spath, szTarget, numCharsPerWord);
            }

            private void t12_write(String spath, int szTarget,
                int numCharsPerWord)
                    throws Exception {
                /**
                 * Use BufferedWriter to write comma delimited text file.
                 * 
                 * @param spath:
                 *            file path
                 * @param szTarget:
                 *            target size of file output
                 * @param numCharsPerWord:
                 *            num chars per word
                 */

                Path path = Paths.get(spath);

                if (Files.exists(path) == true) {
                    System.out.printf("%s exists. no writing%n", spath);
                    return;
                }

                // calculate the number of lines to make 100MB
                int bytesPerChar = 1;
                int charsPerLine = 80;
                int szPerLine = bytesPerChar * charsPerLine;
                int numLinesTarget = szTarget / szPerLine;
                int numWordsPerLine = charsPerLine / numCharsPerWord;
                int numLinesBuffer = 10;
                String delimiter = ",";

                int numLinesTotal = 0;

                utils_.loadCharSet("ACGT");
                BufferedWriter w = null;
                try {
                    w = Files.newBufferedWriter(path);
                    while (numLinesTotal < numLinesTarget) {
                        ArrayList<String> sary = utils_.randStringArray(
                            numCharsPerWord, numWordsPerLine,
                            numLinesBuffer, delimiter);

                        numLinesTotal += numLinesBuffer;
                        for (String s : sary) {
                            w.write(s + "\n");
                        }
                    }
                    w.flush();
                    System.out.printf("NIO wrote %d lines%n", numLinesTotal);
                } catch (Exception e) {

                } finally {
                    w.close();
                }
                utils_.resetCharSet();
            }

            private void t13_newline_if_mod(int cntVal, int modVal) {
                // print newline if cntVal % mod == 0
                if (cntVal % modVal == 0) {
                    System.out.printf("%n");
                }
            }

            public void t13() throws Exception {
                String spath = "out/file_1kb.txt";
                spath = "out/file_4x1mb.txt";
                int szBuf = 1024; // size of in memory buffer
                int szAry = 100; // size of ByteBuffer array
                int szPerWord = 4;
                boolean isDebug = false;

                t13_read(spath, szBuf, szAry, szPerWord, isDebug);
            }

            private void t13_read(
                String spath, int szBuf, int szAry, int szPerWord,
                boolean isDebug)
                    throws Exception {
                /**
                 * read existing file that has format: agct,acgt,...
                 * 
                 * Illustrates use of FileChannel with ByteBuffer mem map. Read
                 * from mem map the string, parse string by comma, and count the
                 * frequency of each string type.
                 * 
                 * @param spath:
                 *            filename
                 * @param szBuf:
                 *            size of ByteBuffer mem
                 * @param szAry:
                 *            size of bytes array to read from mem
                 * @param isDebug:
                 *            is debug
                 */
                t12();

                Path path = Paths.get(spath);

                ByteBuffer bb = ByteBuffer.allocate(szBuf);
                int bytesRead = 0;

                HashMap<String, MutableInt> m = new HashMap<>();

                FileChannel fcr = FileChannel.open(path,
                    StandardOpenOption.READ);

                byte[] bDst = new byte[szAry];
                int numStrings = 0;
                String sPrev = null;
                int numWordsPerLine = 10;

                while (bytesRead != -1) {
                    bytesRead = fcr.read(bb);
                    bb.flip();
                    while (bb.hasRemaining() == true) {
                        String s;
                        int remaining = bb.remaining();
                        if (remaining < szAry) {
                            bb.get(bDst, 0, remaining);
                            s = new String(bDst, 0, remaining);
                        } else {
                            bb.get(bDst);
                            s = new String(bDst);
                        }
                        s = s.replace("\n", "").replace(" ", "");
                        if (sPrev != null) {
                            s = sPrev + s;
                            sPrev = null;
                        }
                        String sary[] = s.split(",");
                        for (int i = 0; i < sary.length; i++) {
                            if ((i + 1) == sary.length) {
                                if (sary[i].length() != szPerWord) {
                                    sPrev = sary[i];
                                    continue;
                                }
                            }
                            String sCur = sary[i];
                            if (sCur.length() == 0) {
                                continue;
                            }
                            numStrings++;
                            if (m.containsKey(sCur) == false) {
                                m.put(sCur, new MutableInt(1));
                            } else {
                                m.get(sCur).inc();
                            }
                            if (isDebug) {
                                System.out.printf("%s ", sCur);
                                t13_newline_if_mod(numStrings, numWordsPerLine);
                            }
                        }

                    }
                    bb.clear();
                }
                fcr.close();

                // print the hashmap for occurrence frequency
                int i = 1;
                for (Map.Entry<String, MutableInt> e : m.entrySet()) {
                    String s = e.getKey();
                    MutableInt cnt = e.getValue();
                    System.out.printf("%3d: entry: %s cnt:%3d%n", i, s,
                        cnt.get());
                    i++;
                }

                System.out.printf("number of strings:%d%n", numStrings);

            }

            public void t14() throws Exception {
                /*
                 * asynchronousFileChannel example
                 */
                Path path = Paths.get("out/tmp.randFile.300000KB.00.txt");
                AsynchronousFileChannel asynchronousFileChannel = 
                    AsynchronousFileChannel.open(path);
                int szBuffer = 100000;
                ByteBuffer byteBuffer = ByteBuffer.allocate(szBuffer);
                asynchronousFileChannel.read(byteBuffer, 0, byteBuffer, 
                    new CompletionHandler<Integer, ByteBuffer>() {
                        public void completed(Integer i, ByteBuffer bb) {
                            
                        }
                        public void failed(Throwable e, ByteBuffer bb) {
                            
                        }
                });
            }
            
            public void t15() throws Exception {
                /*
                 * asynchronousFileChannel example
                 */
                Path path = Paths.get("out/tmp.randFile.300000KB.00.txt");
                AsynchronousFileChannel asynchronousFileChannel = 
                    AsynchronousFileChannel.open(path);
                int szBuffer = 100000;
                ByteBuffer byteBuffer = ByteBuffer.allocate(szBuffer);
                Future<Integer> future = 
                    asynchronousFileChannel.read(byteBuffer, 0);
                int ctr = 0;
                while(!future.isDone()) {
                    ctr++;
                }
                Integer bytesRead = future.get();
                System.out.printf("ctr:%d bytesRead:%d\n", ctr, bytesRead);
            }
            
            public void t16() throws Exception {
                /*
                 * network channel
                 */
                SelectorProvider provider = SelectorProvider.provider();
                NetworkChannel socketChannel = provider.openSocketChannel();
                SocketAddress address = new InetSocketAddress(3080);
                socketChannel = socketChannel.bind(address);
                Set<SocketOption<?>> socketOptions = 
                    socketChannel.supportedOptions();
                Boolean keepAlive = 
                    socketChannel.getOption(StandardSocketOptions.SO_KEEPALIVE);
                boolean res;
                res = socketOptions != null;
                res = keepAlive != null;
                assert res;
            }

            public void t17() throws Exception {
                System.out
                    .printf("AsynchronousFileChannel with CompletionHandler\n");
                FileSystem fs = FileSystems.getDefault();
                Path path = fs.getPath("file_test_nio_fs_0.out");
                File file = path.toFile(); // a bridge method for NIO->IO
                AsynchronousFileChannel afc = AsynchronousFileChannel.open(path,
                    StandardOpenOption.READ,
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE);
                // afc.configureBlocking(false);
                ByteBuffer bb = ByteBuffer.allocate(4096);

                IOOSimpleOuterPtr ioo = IOOSimpleOuterPtr.createChain(5);
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(baos);
                oos.writeObject(ioo);

                ByteBuffer.wrap(baos.toByteArray());
                bb.flip();

                HandlerAttach ha = new HandlerAttach();

                ha.file_ = file;
                ha.afc_ = afc;
                ha.bb_ = bb;
                ha.obj_ = this;

                AsyncHandlerT0 aHandlerT0 = new AsyncHandlerT0(ha);
                AsyncHandlerT1 aHandlerT1 = new AsyncHandlerT1(ha);

                afc.write(bb, 0, aHandlerT1, aHandlerT0);
                afc.close();
            }

            public void t18() throws Exception {
                System.out.printf("FileChannel with string test\n");
                Utils util = new Utils();
                String randStr = util.randString(1024);
                System.out.printf("randStr:%s\n", randStr);

                String sFile = "file_test_nio_fs_04.out";
                Path path = Paths.get(sFile);
                FileChannel fc = FileChannel.open(path,
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE);

                ByteBuffer bb = ByteBuffer.allocate(64);
                bb.clear();
                bb.put(randStr.getBytes());
                bb.flip();

                while (bb.hasRemaining()) {
                    System.out.printf("bb.hasRemaining\n");
                    fc.write(bb);
                }
                fc.close();
                System.out.printf("Wrote %s\n", sFile);
            }

            public void t19() throws Exception {
                System.out.printf("FileChannel with string test\n");
                Utils util = new Utils();
                String randStr = util.randString(128);
                ByteBuffer bb = ByteBuffer.wrap(randStr.getBytes());
                String sFile = "file_test_nio_fs_05.out";
                Path path = Paths.get(sFile);
                FileChannel fc = FileChannel.open(path,
                    StandardOpenOption.WRITE, StandardOpenOption.CREATE);
                while (bb.hasRemaining()) {
                    fc.write(bb);
                }
                fc.close();

                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                fc = FileChannel.open(path, StandardOpenOption.READ);
                bb = ByteBuffer.allocate(32);
                int bytesRead = fc.read(bb);

                while (bytesRead != -1) {
                    bb.flip();
                    baos.write(bb.array());
                    bb.clear();
                    bytesRead = fc.read(bb);
                }

                ByteArrayInputStream bais = new ByteArrayInputStream(
                    baos.toByteArray());
                String dstStr = new String(baos.toByteArray(), "UTF-8");

                bais.close();
                System.out.printf("file: %s\n", sFile);
                System.out.printf("srcStr: %s\n", randStr);
                System.out.printf("dstStr: %s\n", dstStr);
            }

            public void t20() throws Exception {
                System.out.printf("ByteBuffer test allocate\n");
                // basic usage:
                // write data to buffer, buffer.flip, read data from buffer,
                // call buffer.clear or buffer.compact, write data to buffer
                Utils util = new Utils();
                int max = 128;
                int szBuf = 8;
                String randStr = util.randString(max);
                byte[] randStrB = randStr.getBytes();
                byte[] dstB = new byte[max];
                ByteBuffer bb = ByteBuffer.allocate(szBuf);

                for (int i = 0; i < max; i += szBuf) {
                    bb.put(randStrB, i, szBuf);
                    bb.flip();
                    bb.get(dstB, i, szBuf);
                    bb.clear();
                }
                String dstStr = new String(dstB, "UTF-8");
                System.out.printf("randStr:%s\n", randStr);
                System.out.printf("dstStr: %s\n", dstStr);

            }

            public void t21() throws Exception {
                System.out.printf("ByteBuffer test wrap\n");
                Utils util = new Utils();
                int max = 128;
                int szBuf = 8;
                String randStr = util.randString(max);
                byte[] randStrB = randStr.getBytes();
                byte[] tmpB = new byte[szBuf];
                byte[] dstB = new byte[max];
                ByteBuffer bb = ByteBuffer.wrap(randStrB);

                int i = 0;
                while (bb.hasRemaining()) {
                    bb.get(tmpB);
                    System.arraycopy(tmpB, 0, dstB, i, tmpB.length);
                    i += tmpB.length;
                }
                String dstStr = new String(dstB, "UTF-8");
                System.out.printf("randStr:%s\n", randStr);
                System.out.printf("dstStr: %s\n", dstStr);

            }

            public void t22() throws Exception {
                /*
                 * Pipe.SinkChannel example. Actually, no example, do not use Pipe
                 * for inter-thread communication. Use queue instead for message
                 * passing, ie ArrayBlockingQueue
                 */
            }
            public void t23() throws Exception {
            }
            public void test() throws Exception {
                t06();
            }
        }

        public void test() {
            System.out.println("NIOCases");
            try {
                Tests t = new Tests();
                t.test();                
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        public void comments() {
            // ------------------------------------------------------------------
            // NIO is event based asynchronous IO
            // A selector or callback is defined for IO channel. When
            // event occurs on selector, such as input line arrives,
            // the selector executes. This is done on a single thread.
            // Use select for high speed networking.
            //
            // NIO has channels and buffers
            // NIO has nonblocking IO
            // NIO has selectors
            // NIO has Pipe and FileLock, which are utils used in
            // conjunction with channels, buffers, and selectors
            //
            // Typically, all IO in NIO starts with Channel. A Channel
            // is like a stream, where data can be read from Channel into
            // Buffer, and data can be written to Buffer to Channel
            //
            // ------------------------------------------------------------------
            // There are several Channel and Buffer types:
            // FileChannel
            // DatagramChannel
            // SocketChannel
            // ServerSocketChannel allows listen incoming TCP, for
            // each incoming connection, a SocketChannel is created
            //
            // ------------------------------------------------------------------
            // These are the Buffer types:
            // ByteBuffer
            // CharBuffer
            // DoubleBuffer
            // FloatBuffer
            // IntBuffer
            // LongBuffer
            // ShortBuffer
            // MappedByteBuffer, used with memory mapped files
            //
            // NIO Buffers are used with NIO Channels. A Buffer is a
            // block of memory into which data can be written or read from.
            // The memory block is wrapped in a Buffer.
            //
            // Buffer uses 4 step process:
            // - allocate the size of the Buffer
            // - write data into Buffer
            // Channel.read(Buffer) to write from Channel to Buffer
            // Buffer.put(data) to write directly
            // - call Buffer.flip() to switch from write mode to read mode
            // flip() resets position to 0 and limit to where position
            // just was, to make ready for read
            // - read data from Buffer
            // Channel.write(Buffer) to read data from buffer to channel
            // Buffer.get() to read from buffer directly
            // - call Buffer.clea() or Buffer.compact(), no need for flip()
            // - restart write data step
            //
            // A Buffer has 3 properties:
            // capacity
            // position
            // limit
            //
            // In write mode, Buffer.limit is the limit of how much data
            // more data can be written, and limit changes according to
            // how much data is already in Buffer. In read mode, it also
            // indicates how much data can be read from Buffer.
            //
            // ------------------------------------------------------------------
            // A Selector allows a single thread to handle multiple Channel.
            // This is for when an app has many connections but low traffic
            // in each connection.
            //
            // A Selector is used to determine when a Channel is ready
            // for reading or writing
            //
            // To use a selector, you register a Channel with it. You can
            // register several channels with the same selector. Then you
            // call Selector.select(), which blocks until there is event
            // ready for one of the registered channels. When the method
            // returns, the thread can process these events.
            //
            // You can use one Thread for multiple Channels with a Selector
            //
            // Steps for a Selector
            // - create Selector via Selector.open()
            // Selector selector = Selector.open()
            // - register Channels
            // Channel must be non blocking to be used with Selector
            // FileChannel cannot be used with Selector because it is blocking
            // channel1.configureBlocking(false)
            // channel2.configureBlocking(false)
            // int interestSet = SelectKey.OP_READ | SelectKey.OP_WRITE
            // SelectionKey key1 = channel1.register(selector, interestSet)
            // SelectionKey key2 = channel2.register(selector, interestSet)
            // possible select types:
            // - OP_CONNECT, OP_ACCEPT, OP_READ, OP_WRITE, which can be ORd
            // - The SelectionKey has the following properties:
            // interest set
            // ready set
            // Channel
            // Selector
            // optional attached object
            // It is used like this:
            // boolean isInAccept = interestSet & SelectionKey.OP_ACCEPT
            // boolean isInConnect = interestSet & SelectionKey.OP_CONNECT
            // int readySet = key.readyOps()
            // Channel channel = key.channel()
            // Selector selector = key.selector()
            //
            // * Select Channels via Selector
            // Once you register one or more Channels with Selector, you
            // can call one of the select() methods which return the
            // channels that are "ready" for the events you are interested,
            // which are accept, connect, read, write. select() blocks
            // until at least one channel is ready for the events.
            //
            // Once you call select(), you can access the selected key set
            // by calling selectedKeys()
            // - Set<SelectionKey> selectedKeys = selector.selectKeys();
            // - Iterate through the set
            //
            // Selector selector = Selector.open();
            // channel.configureBlocking(false);
            // SelectionKey key = channel.register(selector,
            // SelectionKey.OP_READ);
            // while(true) {
            // int readyChannels = selector.select();
            // if(readyChannels == 0) continue;
            // Set<SelectionKey> selectedKeys = selector.selectKeys()
            // Iterator<SelectionKey> keyIter = selectedKeys.iterator()
            // while(keyIterator.hasNext()) {
            // SelectionKey key = keyIterator.next();
            // if(key.isAcceptable()) {
            // }
            // else if(key.isConnectable()) {
            // }
            // else if(key.isReadable()) {
            // }
            // else if(key.isWriteable()) {
            // }
            // keyIterator.remove();
            // }
            // }
            //
            // ------------------------------------------------------------------
            // IO is stream oriented and blocking IO
            // NIO is buffer oriented and non blocking IO and selectors
            //
            // Stream oriented means you read one or more bytes at a time
            // from a stream. You cannot move back and forth in data stream.
            // To move back and forth, you need to cache it in buffer first.
            //
            // Buffer oriented means data is put into a buffer first and
            // you can move back and forth in the buffer. But you also need
            // to check the buffer to see if the data is all there before
            // using the buffer. And you need to make sure you don't overwrite
            // data in the buffer before it was used/read.
            //
            // Block/buffer oriented consumes/produces a block of data in
            // one step, instead of stream oriented, which is one byte at
            // a time.
            //
            // Blocking IO means the following:
            // BufferedReader br = new BufferedReader(
            // new InputStreamReader(socket.getInputStream()));
            // String name = br.readLine(); // this blocks til line read
            // String age = br.readLine(); // this blocks til line read
            //
            // The equivalent in NIO is:
            // ByteBuffer bb = ByteBuffer.allocate(48);
            // int bytesRead = inChannel.read(buffer);
            // while(!bufferFull(bytesRead)) {
            // bytesRead = inChannel.read(buffer);
            // }
            //
            // If you have multi connections with high bandwidth, then
            // a connection should be connected to a separate thread,
            // so IO model is better than NIO.
            // If you have multi connection with lo bandwidth, then
            // multi connect can be connected to 1 thread, so NIO is better
            //
            // ------------------------------------------------------------------
            // * AsynchronousFileChannel
            // - create AsynchronousFileChannel
            // - read data via Future
            // - read data via CompletionHandler
            // - write data via Future
            // - write data via CompletionHandler
            //
            // A NIO Channel is similar to an IO Stream. A Buffer writes
            // to a Channel, and a Channel reads to a Buffer. You don't
            // read directly from the Channel.
            //
            // ------------------------------------------------------------------
            // NIO has scatter/gather used to gather from multi channel and
            // scatter to multi channel.
            // A scatter read from one Channel is a read to multi Buffer
            // A gather write is a write from multi Buffer to one Channel.
            // Multiple Buffer is constructed as Buffer []ary, and
            // Channel.read(ary), and Channel.write(ary)
            //
            // If one channel is a FileChannel, you can transfer data
            // directly from one Channel to another, via
            // FileChannel.transferTo() and FileChannel.transferFrom()
            //
            // ------------------------------------------------------------------
            // NIO2 adds to java.nio.channels 4 asynchronous channels
            // AsynchronousSocketChannel
            // AsynchronousServerSocketChannel
            // AsynchronousFileChannel
            // AsynchronousDatagramChannel
            // They have 2 mechanisms for monitoring and controlling
            // initiated asynchronous operations
            // - return java.util.concurrent.Future object, which models
            // pending operation and can be used to query state and obtain
            // result
            // - pass an object to java.nio.channels.CompletionHandler,
            // which defines handler methods that are executed after
            // operation has completed
            //
            // ------------------------------------------------------------------
        }

    }
    class NetworkingNIO {
        public void comments() {
            // - these are asynchronous channels
            // AsynchronousSocketChannel
            // AsynchronousServerSocketChannel
            // AsynchronousFileChannel
            // AsynchronousDatagramChannel
            // - these asynchronous channels allow 2 mechanisms for monitoring
            // and controlling asynchronous operations
            // - use Future object for asynchronous operation
            // use by querying Future's state and get result
            // - use CompletionHandler interface for asynchronous
            // with callback and is called after completion.
            // java.nio.channels.CompletionHandler
            //
            // CompletionHandler<Integer, Object> handler = new
            // CompletionHandler<Integer, Object>()
            // {
            // public void completed(Integer result, Object obj) {
            // System.out.println(obj + result);
            // }
            // public void failed(Throwable e, Object obj) {
            // System.out.println(obj);
            // e.printStackTrace();
            // }
            // }
            // socketChannel.write(ByteBuffer.wrap(bytes),
            // 0, // absolute position in the file
            // "attach obj", // obj (String) passed to CompletionHandler
            // handler) // handler itself
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
            //
        }

        public NetworkingNIO() {
        }

        public void test() {
        }
    }
    class Networking {
        public void comments() {
        }

        class MiscNetworking {
            public MiscNetworking() {
            }

            public void listNetworkInterfaces() {
                System.out.printf("list network interfaces\n");
                try {
                    Enumeration<NetworkInterface> nets = NetworkInterface
                        .getNetworkInterfaces();
                    for (NetworkInterface ni : Collections.list(nets)) {
                        System.out.printf("-------------------\n");
                        System.out.printf("display name:%s\n",
                            ni.getDisplayName());
                        System.out.printf("name:%s\n", ni.getName());
                        Enumeration<InetAddress> ia = ni.getInetAddresses();
                        for (InetAddress ina : Collections.list(ia)) {
                            System.out.printf("inet addr:%s\n", ina);
                        }
                    }
                    System.out.printf("-------------------\n");
                } catch (Exception e) {
                }
            }

            public void comment() {
                try {
                    // NetworkInterface nif = NetworkInterface.getByName("en0");
                    // Enumeration nifAddr = nif.getInetAddresses();
                    // Socket sock = new java.net.Socket();
                    // sock.bind(nifAddr.nextElement());
                    // sock.connect(new InetSocketAddress(address, port));
                } catch (Exception e) {
                }
            }

            public void inetAddressTest() {
                System.out.printf("inetAddressTest\n");
                try {
                    InetAddress iAddr = InetAddress.getLocalHost();
                    InetAddress iLB = InetAddress.getLoopbackAddress();
                    String localHost = iAddr.getHostName();
                    String localAddr = iAddr.getHostAddress();
                    String lbHost = iLB.getHostName();
                    String lbAddr = iLB.getHostAddress();
                    System.out.printf("local host:%s addr:%s\n", localHost,
                        localAddr);
                    System.out.printf("loopback host:%s addr:%s\n", lbHost,
                        lbAddr);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        class Client {
            public Client() {
            }

            public void t00() {
                try {
                    String host = "localhost";
                    int port = 2500;
                    Socket socket = new Socket(host, port);
                    PrintWriter pw = new PrintWriter(socket.getOutputStream(),
                        true);
                    BufferedReader brSock = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                    BufferedReader brCmdLine = new BufferedReader(
                        new BufferedReader(new InputStreamReader(System.in)));
                    String sinput;

                    // this doesn't work with asynchronous reads from sock
                    while ((sinput = brCmdLine.readLine()) != null) {
                        pw.println(sinput);
                        System.out.println("echo: " + brSock.readLine());
                        if (sinput.equals("quit")) {
                            break;
                        }
                    }
                    // close the streams before the sockets
                    brSock.close();
                    brCmdLine.close();
                    socket.close();
                    pw.close();
                } catch (Exception e) {
                    System.out.printf("Exception with Client\n");
                    e.printStackTrace();
                }
            }

            public void t01() {
                // send and receive object echo
                int port = 2500;
                try {
                    Socket socket = new Socket("localhost", port);
                    ObjectOutputStream oos = new ObjectOutputStream(
                        socket.getOutputStream());
                    ObjectInputStream ois = new ObjectInputStream(
                        socket.getInputStream());
                    for (int i = 0; i < 3; i++) {
                        IOOSimpleOuterPtr h = IOOSimpleOuterPtr.createChain(3);
                        System.out.printf("print local chain\n");
                        h.printChainCompact();
                        oos.writeObject(h);
                        IOOSimpleOuterPtr o = (IOOSimpleOuterPtr) ois
                            .readObject();
                        if (o != null) {
                            System.out.printf("print received chain\n");
                            o.printChainCompact();
                        } else {
                            System.out.printf("client null, expected chain\n");
                            break;
                        }
                    }
                    ois.close();
                    oos.close();
                    socket.close();
                    System.out.printf("test done\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void test() {
                t01();
            }
        }

        class Server {
            public Server() {
            }

            public void t00() {
                int port = 2500;
                try {
                    ServerSocket server = new ServerSocket(port);
                    Socket client = server.accept();
                    PrintWriter pw = new PrintWriter(client.getOutputStream(),
                        true);
                    BufferedReader br = new BufferedReader(
                        new InputStreamReader(client.getInputStream()));
                    String s;
                    while ((s = br.readLine()) != null) {
                        System.out.printf("Server rcv: %s\n", s);
                        pw.println(s);
                        if (s.equals("quit")) {
                            break;
                        }
                    }
                    // close the streams before the sockets
                    br.close();
                    pw.close();
                    server.close();
                    client.close();
                } catch (Exception e) {
                    System.out.printf("Exception with Server\n");
                    e.printStackTrace();
                }
            }

            public void t01() {
                // receive object and send it back out echo
                int port = 2500;
                try {
                    ServerSocket server = new ServerSocket(port);
                    Socket client = server.accept();
                    ObjectInputStream ois = new ObjectInputStream(
                        client.getInputStream());
                    ObjectOutputStream oos = new ObjectOutputStream(
                        client.getOutputStream());
                    for (int i = 0; i < 3; i++) {
                        IOOSimpleOuterPtr o = (IOOSimpleOuterPtr) ois
                            .readObject();
                        if (o != null) {
                            System.out.printf("server rcv obj, now write\n");
                            oos.writeObject(o);
                        } else {
                            System.out
                                .printf("server rcv null, expected chain\n");
                            break;
                        }
                    }
                    ois.close();
                    oos.close();
                    client.close();
                    server.close();
                    System.out.printf("test done\n");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void test() {
                t01();
            }
        }

        class MultiServer {
            class MultiServerSocket implements Runnable {
                ArrayList<MultiServerSocket> al_;
                Socket socket_;
                PrintWriter pw_;
                int id_;

                public MultiServerSocket(int id, Socket socket,
                    ArrayList<MultiServerSocket> al) {
                    socket_ = socket;
                    al_ = al;
                    id_ = id;
                    System.out.printf("new MultiServerSocket id:%d\n", id_);
                    try {
                        pw_ = new PrintWriter(socket_.getOutputStream(), true);
                    } catch (Exception e) {
                    }
                }

                public void write(String s) {
                    try {
                        pw_.println(s);
                    } catch (Exception e) {
                        System.out.printf("MSS write exception\n");
                        e.printStackTrace();
                    }
                }

                public void run() {
                    System.out.printf("MultiServerSocket id:%d run\n", id_);
                    try {
                        BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket_.getInputStream()));
                        String s;
                        MultiServerSocket mss = null;
                        while ((s = br.readLine()) != null) {
                            System.out.printf("Server rcv: %s\n", s);
                            System.out.printf("id:%2d has %d clients\n", id_,
                                al_.size());
                            for (int i = 0; i < al_.size(); i++) {
                                mss = al_.get(i);
                                mss.write(s);
                            }
                            if (s.equals("quit")) {
                                break;
                            }
                        }
                        // close the streams before the sockets
                        br.close();
                        pw_.close();
                        socket_.close();
                    } catch (Exception e) {
                        System.out.printf("Exception with Server\n");
                        e.printStackTrace();
                    }
                }
            }

            public MultiServer() {
            }

            public void t00() throws Exception {
                int port = 2500;
                int id = 0;
                ServerSocket server = null;
                try {
                    server = new ServerSocket(port);
                    ArrayList<MultiServerSocket> al = new ArrayList<MultiServerSocket>();
                    while (true) {

                        // MultiServerSocket doesn't work with blocking
                        // Client, because Client is waiting for its local
                        // cmdline prompt, and doesn't asynchronously
                        // receive msgs because prompt is blocking
                        // Should use NIO for client to async read/write

                        MultiServerSocket sock = new MultiServerSocket(id,
                            server.accept(), al);
                        al.add(sock);
                        Thread t = new Thread(sock);
                        t.start();
                        id++;
                    }
                } catch (Exception e) {
                    System.out.printf("Exception with Server 00\n");
                    e.printStackTrace();
                } finally {
                    server.close();
                }
            }

            public void test() {
                try {
                    t00();
                } catch (Exception e) {

                }
            }
        }

        class URLReaderCSV {
            public URLReaderCSV() {
            }

            public void t00() {
                String sUrl = "http://real-chart.finance.yahoo.com/table.csv";
                String sTup = "?s=GOOG&d=7&e=31&f=2015&g=d&a=2&b=27&c=2010&ignore=.csv";
                String sfile = "file_network_test_csv_goog.txt";
                try {
                    // method 1
                    // URL url = new URL(sUrl+sTup);
                    // BufferedReader br = new BufferedReader(
                    // new InputStreamReader(url.openStream()));

                    // method 2
                    URL url = new URL(sUrl + sTup);
                    URLConnection uconn = url.openConnection();
                    BufferedReader br = new BufferedReader(
                        new InputStreamReader(uconn.getInputStream()));

                    BufferedWriter bw = new BufferedWriter(
                        new OutputStreamWriter(new FileOutputStream(sfile)));

                    String s;
                    while ((s = br.readLine()) != null) {
                        bw.write(s + "\n");
                    }
                    br.close();
                    bw.flush();
                    bw.close();
                } catch (Exception e) {
                    System.out.printf("EXCEPTION %s\n", e.getMessage());
                    e.printStackTrace();
                }
            }

            public void test() {
                t00();
            }
        }

        public Networking() {
        }

        class NetworkingTest {
            Utils utils_;

            public NetworkingTest() {
                utils_ = new Utils();
            }

            public void t00() {
                URLReaderCSV t = new URLReaderCSV();
                t.test();
            }

            public void t01() {
                MiscNetworking t = new MiscNetworking();
                t.listNetworkInterfaces();
            }

            public void t02() {
                MiscNetworking t = new MiscNetworking();
                t.inetAddressTest();
            }

            public void t03() {
                try {
                    InetAddress addr = InetAddress.getLocalHost();
                    System.out.println(addr);
                } catch (Exception e) {
                }
            }

            public void t04() {
            }

            public void t05() {
            }

            public void t06() {
            }

            public void t07() {
            }

            public void test() {
            }

            public void test(int isClient, int port, int testcase) {
                if (testcase == 0) {
                    t00();
                } else if (testcase == 1) {
                    t01();
                } else if (testcase == 2) {
                    t02();
                } else if (testcase == 3) {
                    t03();
                } else if (testcase == 4) {
                    t04();
                } else if (testcase == 5) {
                    t05();
                } else if (testcase == 6) {
                    t06();
                } else if (testcase == 7) {
                    t07();
                }
            }
        }

        public void testServer() {
            Server t = new Server();
            t.test();
        }

        public void testClient() {
            Client t = new Client();
            t.test();
        }

        public void testMultiServer() {
            MultiServer t = new MultiServer();
            t.test();
        }

        public void test() {
            NetworkingTest t = new NetworkingTest();
            t.t01();
            t.t02();
        }

        public void test(String args[]) {
            // expecting a[0] = client|server
            // a[1] = port
            // a[2] = testcasenum
            if (args.length != 1 && args.length != 3) {
                return;
            } else if (args.length == 1) {
                try {
                    int testCase = Integer.parseInt(args[0]);
                    NetworkingTest test = new NetworkingTest();
                    test.test(0, -1, testCase);
                } catch (Exception e) {
                }
                return;
            }
            try {
                int isClient = -1;
                if (args[0].equals("server") == true) {
                    isClient = 0;
                } else if (args[0].equals("client") == true) {
                    isClient = 1;
                } else {
                    return;
                }
                int port = Integer.parseInt(args[1]);
                int testCase = Integer.parseInt(args[2]);
                NetworkingTest test = new NetworkingTest();
                System.out.printf("test isClient:%d port:%d testcase:%d\n",
                    isClient, port, testCase);
                test.test(isClient, port, testCase);
            } catch (Exception e) {
            }
        }
    }
    class Asynchronous7Cases {
        Utils utils = new Utils();
        ExecutorService executorService = null;
        public void initExecutorService() {
            int numCores = Runtime.getRuntime().availableProcessors();
            int numThreads = numCores * 2;
            executorService = Executors.newFixedThreadPool(numThreads);
        }
        public void closeExecutorService() {
            if(executorService != null) {
                executorService.shutdown();
                executorService = null;
            }
        }
        class ThrottledCallable implements Callable<String> {
            final String name;
            final int count;
            final int maxTimeMS;
            public ThrottledCallable(String name, int count, int maxTimeMS) {
                this.name = name;
                this.count = count;
                this.maxTimeMS = maxTimeMS;
            }
            public String call() throws Exception {
                return throttledCount();
            }
            public String throttledCount() {
                try {
                    for(int i = 0; i < count; i++) {
                        int timeMS = utils.randInt(10, maxTimeMS);
                        Thread.sleep(timeMS);
                        i++;
                    }                
                    //System.out.printf("%s  DONE\n", name);
                } catch(InterruptedException e) {
                    e.printStackTrace();
                    return null;
                }
                return name;
            }            
        }
        class ThrottledTask implements Runnable {
            @Override
            public void run() {
                
            }
        }
        class AsynchronousTest {
            public void t00(final int num) {
                // do num throttled calls serially and parallel with future                
                int maxTimeMS = 100;
                int count = 20;
                
                System.out.printf("now do serials\n");
                t00_serial(num, count, maxTimeMS);
                
                System.out.printf("now do futures\n");
                t00_future_1(num, count, maxTimeMS);
                
                System.out.printf("now do futures another way\n");
                t00_future_2(num, count, maxTimeMS);
            }
            public void t00_serial(int num, int count, int maxTimeMS) {
                utils.updateTime();
                ArrayList<ThrottledCallable> list = new ArrayList<>();
                for(int i = 0; i < num; i++) {
                    String name = String.format("name_%d", i);
                    ThrottledCallable tc = 
                        new ThrottledCallable(name, count, maxTimeMS);
                    list.add(tc);
                }
                for(ThrottledCallable tc: list) {
                    String name = tc.throttledCount();
                    System.out.printf("serial done:%s\n", name);
                }
                utils.printTimeDiff("SERIAL");                
            }
            public void t00_future_1(int num, int count, int maxTimeMS) {
                ArrayList<Future<String>> list = new ArrayList<>();
                ArrayList<ThrottledCallable> listCallable = 
                    new ArrayList<>();
                utils.updateTime();
                for(int i = 0; i < num; i++) {
                    String name = String.format("name_%d", i);
                    ThrottledCallable tc = 
                        new ThrottledCallable(name, count, maxTimeMS);
                    listCallable.add(tc);
                }
                for(ThrottledCallable tc: listCallable) {
                    Future<String> future = executorService.submit(tc);
                    list.add(future);
                }
                try {
                    boolean allDone = false;
                    while(!allDone) {
                        int doneCount = 0;
                        for(Future<String> future: list) {
                            if(future.isDone()) {
                                doneCount++;
                            }
                            if(doneCount == list.size()) {
                                allDone = true;
                            }
                        }
                    }
                    for(Future<String> future: list) {
                        String name = future.get();
                        System.out.printf("future done:%s\n", name);
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
                utils.printTimeDiff("FUTURE 1");
            }
            public void t00_future_2(int num, int count, int maxTimeMS) {
                utils.updateTime();
                Set<Callable<String>> set = new HashSet<>();
                for(int i = 0; i < num; i++) {
                    String name = String.format("name_%d", i);
                    ThrottledCallable tc = 
                        new ThrottledCallable(name, count, maxTimeMS);
                    set.add(tc);
                }
                try {
                    java.util.List<Future<String>> list = 
                        executorService.invokeAll(set);
                    for(Future<String> future: list) {
                        String name = future.get();
                        System.out.printf("future done:%s\n", name);
                    }
                } catch(Exception e) {
                    e.printStackTrace();
                }
                utils.printTimeDiff("FUTURE 2");
            }

            public void test() {
                initExecutorService();
                t00(20);
                closeExecutorService();
            }
        }
        public void test() {
            AsynchronousTest t = new AsynchronousTest();
            t.test();
        }
    }
    class Asynchronous8Cases {
        class AsynchronousTest {
            public void test() {
                
            }
        }
        public void test() {
            AsynchronousTest t = new AsynchronousTest();
            t.test();
        }
    }
    class ReflectionCases {
        class ReflectionTest {
            public void t01() {
                
            }
            public void test() {
                
            }
        }
        public void test() {
            ReflectionTest t = new ReflectionTest();
            t.test();
        }
    }
    class Syntaxes {
        public AtomicInteger ID_ = new AtomicInteger(0);
        public void print(String format, Object... args) {
            System.out.printf(format, args);
        }
        class SyntaxA {
            private final int v_;
            private static final int vs_ = 1;

            public SyntaxA() {
                v_ = vs_;
            }

            public SyntaxA(int v) {
                v_ = v;
            }

            public final int v() {
                return v_;
            }

            public final void printInfo() {
                System.out.println(v());
            }
        }

        class SyntaxB {
            // private static int vs_ = 2; // compile err: illegal decl inner
            Day day_;

            public SyntaxB() {
                day_ = Day.SUN;
            }

            public void day(Day d) {
                day_ = d;
            }

            public Day day() {
                return day_;
            }
        }
        class LocalA0 {
            private String namePrivate;
            String namePackage;
            public String namePublic;
            final private String prefix = "LocalA0";
            //public enum LOCALTYPE {
            //    PRIVATE, PACKAGE, PUBLIC
            //}
            public static final String typePrivate = "private";
            public static final String typePackage = "package";
            public static final String typePublic = "public";
            public LocalA0() {
                namePrivate = prefix + "Private";
                namePackage = prefix + "Package";
                namePublic  = prefix + "Public";
            }
            public LocalA0 setName(String stringType, String name) {
                switch(stringType) {
                case typePrivate:
                    namePrivate = name;
                    break;
                case typePackage:
                    namePackage = name;
                    break;
                case typePublic:
                    namePublic = name;
                    break;
                default:
                    break;
                }
                return this;
            }
            public String getName(String stringType) {
                switch(stringType) {
                case typePrivate:
                    return namePrivate;
                case typePackage:
                    return namePackage;
                case typePublic:
                    return namePublic;
                default:
                    break;
                }
                return null;                
            }
            public void printInfo() {
                print("%s: private:%s package:%s public:%s\n", 
                        prefix, namePrivate, namePackage, namePublic);
            }
        }
        class LocalA1 extends LocalA0 {
            // printInfo will choose these Strings
            // super printInfo will choose super Strings
            private String namePrivate;
            String namePackage;            
            public String namePublic; 
            final private String prefix = "LocalA1";
            public LocalA1() {
                super();
                namePrivate = prefix + "Private";
                namePackage = prefix + "Package";
                namePublic  = prefix + "Public";
            }
            @Override
            public LocalA0 setName(String stringType, String name) {
                switch(stringType) {
                case typePrivate:
                    namePrivate = name;
                    break;
                case typePackage:
                    namePackage = name;
                    break;
                case typePublic:
                    namePublic = name;
                    break;
                default:
                    break;
                }
                return this;
            }
            @Override
            public String getName(String stringType) {
                switch(stringType) {
                case typePrivate:
                    return namePrivate;
                case typePackage:
                    return namePackage;
                case typePublic:
                    return namePublic;
                default:
                    break;
                }
                return null;                
            }
            @Override
            public void printInfo() {
                print("%s: private:%s package:%s public:%s\n", 
                        prefix, namePrivate, namePackage, namePublic);
                super.printInfo();
            }
        }
        class SyntaxEnum {
            public SyntaxEnum() {
            }

            public void test() {
                for (Coin c : Coin.values()) {
                    System.out.printf("%s%n", c);
                }
                System.out.println();
                for (Coin c : Coin.values()) {
                    System.out.printf("%s = %d%n", c, c.intVal());
                }
                System.out.println();
                for (Coin c : Coin.values()) {
                    System.out.printf("%s%n", c.toString());
                }
            }
        }

        abstract class A {
            protected int id_ = ID_.getAndAdd(1);
            protected int v_;
            protected A obj_;

            public void setV(int v) {
                v_ = v;
            }

            public int getV() {
                return v_;
            }

            public int id() {
                return id_;
            }

            public A getObj() {
                return obj_;
            }

            public void setObj(A obj) {
                obj_ = obj;
            }

            public abstract void printInfo();
        }

        class AA extends A {
            protected AA objAA_;
            protected int vAA_;

            public AA getAA() {
                return objAA_;
            }

            public void setAA(AA a) {
                objAA_ = a;
            }

            public int getVAA() {
                return vAA_;
            }

            public void setVAA(int vaa) {
                vAA_ = vaa;
            }

            public void printInfo() {
                if (obj_ == null) {
                    System.out.printf("AA ID:%2d v:%2d vaa:%2d obj.ID:NULL%n",
                        id_, v_, vAA_);
                } else {
                    System.out.printf("AA ID:%2d v:%2d vaa:%2d obj.ID:%2d%n",
                        id_, v_, vAA_, obj_.id());
                }
            }
        }
        
        class AAA extends AA {
            @Override
            public void printInfo() {
                super.printInfo();
                System.out.printf("is override AAA\n");
            }
            
            public void methodAAA() {
                printInfo();
            }
        }

        class AAAA extends AAA {
            @Override
            public void printInfo() {
                super.printInfo();
                System.out.printf("is override AAAA\n");
            }
        }

        class AB extends A {
            public void printInfo() {

            }
        }

        class SyntaxClassWithList {
            java.util.List<Integer> l_ = null;

            public void setList(java.util.List<Integer> l) {
                l_ = l;
            }

            public java.util.List<Integer> getList() {
                return l_;
            }

            public void printInfo() {
                for (Integer i : l_) {
                    System.out.printf("SyntaxClassWithList:%d%n", i);
                }
            }

            public int size() {
                if (l_ == null) {
                    return 0;
                }
                return l_.size();
            }
        }

        class ObjInterface1 implements SyntaxExampleInterface1 {
            public void execute(Object d) {
                System.out.println(d.toString());
            }
        }

        public void callObjInterface1(SyntaxExampleInterface1 if1, Object d) {
            if1.execute(d);
        }

        class InnerOuterClass {
            public class InnerOne {
                int i_;

                public int get() {
                    return i_;
                }

                public void set(int i) {
                    i_ = i;
                }
            }

            int iOut_;

            public int get() {
                return iOut_;
            }

            public void set(int i) {
                iOut_ = i;
            }
            /*
             * Cannot declare inner static
             * 
             * public static class InnerStatic { int i_; public int get() {
             * return i_; } public void set(int i) { i_ = i; } }
             */
        }

        class SyntaxTest {
            int var_abc_; // this is legal
            int var_aaa_ = 5; // this is legal

            public SyntaxTest() {
                var_abc_ = 10;
            }

            public void t0() {
                final SyntaxA sa0 = new SyntaxA(10);
                SyntaxA sa1 = new SyntaxA(11);
                sa0.printInfo();
                sa1.printInfo();
                sa1 = sa0;
                sa1.printInfo();
            }

            public void t1() {
                SyntaxEnum t = new SyntaxEnum();
                t.test();
            }

            public void t2() {
                System.out.printf("access inner and outer class variables%n");
                System.out.printf("var_abc %d%n", var_abc_);
                System.out.printf("Test.var_abc %d%n",
                    TestClasses.this.var_abc_);
                System.out.printf("Test.var_abcd %d%n", TestClasses.var_abcd_);
                System.out.printf("Test.var_abd %d%n", var_abd_);
                System.out.printf("Test.var_abd %d%n",
                    TestClasses.this.var_abd_);
            }

            public void t3() {
            }

            public void t4() {
                AA aa0 = new AA();
                AA aa1 = new AA();
                AA aa2 = new AA();

                int i = 10;

                aa0.setV(i++);
                aa1.setV(i++);
                aa2.setV(i++);
                aa0.setVAA(i++);
                aa1.setVAA(i++);
                aa2.setVAA(i++);

                aa0.setObj(aa1);
                aa1.setObj(aa2);

                aa0.printInfo();
                aa1.printInfo();
                aa2.printInfo();

                // AA aa = aa0.getObj(); // mismatch assigning getObj to AA

            }

            public void t5() {
                System.out.println("assert test");
                // test assert syntax
                try {
                    int i = 10;
                    boolean res = i == 10;
                    assert res;
                    int j = 5;
                    boolean res2 = j == 1;

                    if (i == 1) {

                    } else if (i == 2) {

                    } else {
                        assert res2 : i;
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void t6() {
                /**
                 * if you add a list to an object, get the list, append it, is
                 * the list appended?
                 */
                java.util.List<Integer> l = new ArrayList<>();
                int sz = 3;
                for (int i = 0; i < sz; i++) {
                    l.add(new Integer(i));
                }
                SyntaxClassWithList cList = new SyntaxClassWithList();
                cList.setList(l);
                cList.printInfo();
                java.util.List<Integer> lGet = cList.getList();
                System.out.println("adding a few more");
                for (int i = sz; i < 2 * sz; i++) {
                    lGet.add(new Integer(i));
                }
                cList.printInfo();
                System.out.println("printing original list");
                for (Integer i : l) {
                    System.out.printf("original: %d%n", i);
                }
                int newSize = 2 * sz;
                if (cList.size() == newSize) {
                    System.out.println("appending to reference works");
                } else {
                    System.out.println(
                        "appending to reference does not work");
                }
                if (l.size() == newSize) {
                    System.out.println(
                        "appending to reference appends original");
                } else {
                    System.out.println(
                        "appending to reference does not append original");
                }
            }

            public void t7() {
                String a[] = new String[0];
                System.out.printf("a size:%d%n", a.length);
            }

            public void t8() {
                // stringbuilder
                // StringBuilder test
                StringBuilder s = new StringBuilder();
                s.append("abcde");
                s.deleteCharAt(2);
                s.insert(2, "z");
                System.out.printf("s:%s\n", s.toString());
                s.delete(0, s.length()); // not s.length()-1
                System.out.printf("s:%s\n", s.toString());
                char c[] = { '1', '2', '3', '4', '5' };
                s.append(c);
                System.out.printf("s:%s\n", s.toString());
                System.out.printf("s:%s\n", String.valueOf(c));
            }

            public void t9() {
                System.out.println("calling new interface instead of class");
                System.out.println("command pattern");
                callObjInterface1(new ObjInterface1(), "hello world");
            }

            public void t10() {
                InnerOuterClass outerOne = new InnerOuterClass();

                // outerOne.new InnerOne is only way to instance inner
                InnerOuterClass.InnerOne innerOne = outerOne.new InnerOne();
                int vRef0 = 10;
                int vRef1 = 20;

                outerOne.set(vRef0);
                innerOne.set(vRef1);
                int v = innerOne.get();
                boolean res = v == vRef1;
                assert res;
                v = outerOne.get();
                res = v == vRef0;
                assert res;

                // you can get inner without instance of outer if inner
                // is static. otherwise, not
                SingletonClasses outerTwo = new SingletonClasses();
                SingletonClasses.DummyClass innerTwoNonStatic = outerTwo.new DummyClass();
                SingletonClasses.DummyClassStatic innerTwoStatic = new SingletonClasses.DummyClassStatic();
                SingletonClasses.DummyClass innerTwoThree = new SingletonClasses().new DummyClass();

                innerTwoNonStatic.set(vRef0);
                innerTwoStatic.set(vRef1);
                innerTwoThree.set(vRef0);

                v = innerTwoNonStatic.get();
                res = v == vRef0;
                assert res;
                v = innerTwoStatic.get();
                res = v == vRef1;
                assert res;
                v = innerTwoThree.get();
                res = v == vRef0;
                assert res;

                System.out.println("pass Inner outer class");

            }

            public void t11() throws Exception {
                /**
                 * testing out using a private inner class from another
                 * class, downcasting it to InputStream, and seeing if the
                 * subclassed InputStreamThrottle behaves like an InputStream
                 * or InputStreamThrottle class.
                 * 
                 * It behaves like InputStreamThrottle class.
                 */
                IOTests t = new IOTests();
                String fileName = "out/tmp.randFile.1KB.00.txt";
                boolean isEarlyTerminate = true;
                int terminateAtPercent = 50;
                long minThrottleMS = 100;
                long maxThrottleMS = 200;
                InputStream is = t.getTestInputStream(
                    fileName, 
                    isEarlyTerminate, 
                    terminateAtPercent, 
                    minThrottleMS, 
                    maxThrottleMS);
                int numBytesBetweenThrottle = 32;
                byte[] b = new byte[numBytesBetweenThrottle];
                int szRead = 0;
                StringBuilder sb = new StringBuilder();
                try {
                    while((szRead = is.read(b)) != -1) {
                        for(int i = 0; i < szRead; i++) {
                            sb.append((char)b[i]);
                        }
                    }
                    String s = sb.toString();
                    System.out.printf("InputStreamThrottle out: %n%s%n", s);                    
                }
                catch(Exception e) {
                    
                }
                finally {
                    is.close();                    
                }
            }
            
            public void t12() throws Exception {
                /**
                 * test out InputStreamThrottle incomplete transfer. Then
                 * reopen it at last offset and complete transfer.
                 * It's basically t11() + reopening the same file and finish
                 * transfer. 
                 */
                
                IOTests t = new IOTests();
                String fileName = "out/tmp.randFile.1KB.00.txt";
                StringBuilder sb = new StringBuilder();
                int numBytesBetweenThrottle = 32;
                byte[] b = new byte[numBytesBetweenThrottle];
                long szRead = 0;
                
                // do a reference read and compare it later
                InputStream isRef = new FileInputStream(fileName);
                String strRef = null;
                try {
                    while((szRead = isRef.read(b)) != -1) {
                        for(int i = 0; i < szRead; i++) {
                            sb.append((char)b[i]);
                        }
                    }
                    strRef = sb.toString();
                    sb = new StringBuilder();
                } catch(Exception e) {
                    e.printStackTrace();
                } finally {
                    isRef.close();
                }
                boolean res = strRef != null;
                assert res : "reference string not supposed to be null";
               
                boolean isEarlyTerminate = true;
                int terminateAtPercent = 50;
                long minThrottleMS = 100;
                long maxThrottleMS = 200;
                InputStream is = t.getTestInputStream(
                    fileName, 
                    isEarlyTerminate, 
                    terminateAtPercent, 
                    minThrottleMS, 
                    maxThrottleMS);
                long bytesRead = 0;
                try {
                    while((szRead = is.read(b)) != -1) {
                        bytesRead += szRead;
                        for(int i = 0; i < szRead; i++) {
                            sb.append((char)b[i]);
                        }
                    }
                    String s = sb.toString();
                    System.out.printf("InputStreamThrottle out: %n%s%n", s);                    
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                finally {
                    is.close();                    
                }
                
                // reopen the same file because it should have terminated early
                System.out.println("continue reading terminated file");
                isEarlyTerminate = false;
                is = t.getTestInputStream(
                    fileName, 
                    isEarlyTerminate, 
                    terminateAtPercent, 
                    minThrottleMS, 
                    maxThrottleMS);
                is.skip(bytesRead);
                String sTest = null;
                try {
                    while((szRead = is.read(b)) != -1) {
                        bytesRead += szRead;
                        for(int i = 0; i < szRead; i++) {
                            sb.append((char)b[i]);
                        }
                    }
                    sTest = sb.toString();
                    System.out.printf("InputStreamThrottle out: %n%s%n", sTest);                    
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
                finally {
                    is.close();                    
                }
                
                if(strRef.equals(sTest) == true) {
                    System.out.println("compare reference pass");
                } 
                else {
                    System.out.println("compare reference fail");
                }
            }
            
            public void t13() {
                /**
                 * transfer chunks of bytes to a bigger array
                 */
                
                int szMin = 8;
                int szMax = 64;
                byte bMin[] = new byte[szMin];
                byte bMax[] = new byte[szMax];
                int idx = 0;
                
                int offset = 0;
                int realOffset = 0;
                for(int i = 0; i < 10; i++) {
                    for(int j = 0; j < szMin; j++) {
                        bMin[j] = (byte)idx;
                        idx++;
                    }
                    for(int j = 0; j < szMin; j++) {
                        bMax[offset] = bMin[j];
                        offset++;
                    }
                    if(offset >= (szMax-1)) {
                        for(int j = 0; j < offset; j++) {
                            System.out.printf("%02d: %02x%n", 
                                (realOffset+j), bMax[j]);
                        }
                        realOffset += offset;
                        offset = 0;
                    }
                }
                if(offset != 0) {
                    for(int j = 0; j < offset; j++) {
                        System.out.printf("%02d: %02x%n", 
                            (realOffset+j), bMax[j]);
                    }
                    realOffset += offset;
                    offset = 0;
                }
            }
            public void t14() {
                /*
                 * create class B which extends class A. pass to method as 
                 * class A. in method, use instanceof to check if arg
                 * is A and B. 
                 * 
                 */
                AAA aaa = new AAA();
                AA aa = new AA();
                aaa.setAA(aa);
                t14(aaa);
            }

            private void t14(AA aa) {
                if(aa instanceof AAA) {
                    System.out.printf("aa is type AAA\n");
                } else {
                    System.out.printf("aa is not type AAA\n");                    
                }
                if(aa instanceof AA) {
                    System.out.printf("aa is type AA\n");
                } else {
                    System.out.printf("aa is not type AA\n");                    
                }
                if(aa instanceof AAAA) {
                    System.out.printf("aa is type AAAA\n");
                } else {
                    System.out.printf("aa is not type AAAA\n");                    
                }
                if(aa instanceof AAA) {
                    try {
                        Object o = aa;
                        Method method = o.getClass().getMethod("methodAAA");
                        System.out.println("invoking methodAAA");
                        method.invoke(o);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            public void t15() {
                // List init
                java.util.List<String> list1 = Arrays.asList("hello", "hi", "hope");
                // mutable list
                java.util.List<String> list2 = new ArrayList<>(
                    Arrays.asList("hello", "hi", "hope"));
                java.util.List<String> list3 = Arrays.asList("hello");
                java.util.List<Integer> list4 = Arrays.asList(10,20,30);
                
                String [] a1 = {"hello","hi","hope"};
                Integer [] a2 = {10,20,30};
                assert list1 != null;
                assert list2 != null;
                assert list3 != null;
                assert list4 != null;
                assert a1 != null;
                assert a2 != null;
            }
            public void t16() {
                /*
                 * test difference between null and non null conditions
                 */
                boolean isOK = true;
                Boolean b = null;
                try {
                    if(b == null || !b) {
                        System.out.printf("b == null || !b did not have exception\n");                    
                    }                    
                } catch(Exception e) {
                    e.printStackTrace();
                    isOK = false;
                }
                assert isOK == true;
                try {
                    if(b != null || !b.booleanValue()) { // this should exception
                        System.out.printf("b != null || !b did not have exception\n");
                    }
                    isOK = false;
                } catch(Exception e) {
                    e.printStackTrace();
                    isOK = true;
                    System.out.printf("exception was expected\n");
                }
                assert isOK == true;
                System.out.printf("conditional check on boolean b passed\n");                
            }
            public void t17() {
                LocalA0 a   = new LocalA0();
                LocalA1 a1  = new LocalA1();
                LocalA0 a2  = a1;
                String t     = (String)(null);
                print("-----a0.printInfo\n");
                a.printInfo();
                print("-----a1.printInfo\n");
                a1.printInfo();
                print("-----a2.printInfo\n");
                a2.printInfo();                
                assert(t == null);
                print("t is null\n");
            }
            public void t18() {
                // null string compare test
                String a = "abc";
                boolean isPass = false;
                if(!a.equals(null)) {
                    isPass = true;
                } else {
                    isPass = false;
                }
                assert isPass : "fail null test";
                print("pass null\n");
            }
            public void t19() {
                // declaring lists
                String [] ary = {"abc", "def", "ghi"};
                java.util.List<String> list0 = Arrays.asList(ary[0], ary[1], ary[2]);
                java.util.List<String> list1 = Collections.singletonList(ary[0]);
                java.util.List<String> list2 = new ArrayList<>(Arrays.asList(ary[0], ary[1], ary[2]));
                
                for(String s: list0) {
                    print("%s\n", s);
                }
                print("------------\n");
                for(String s: list1) {
                    print("%s\n", s);
                }
                print("------------\n");
                for(String s: list2) {
                    print("%s\n", s);
                }
                print("------------\n");
            }
            public void t20() {
                // hashmap test
                int sz = 100;
                HashMap<Integer, Integer> map = new HashMap<>();
                for(int i = 0; i < sz; i+=2) {
                    map.put(i, i);
                    print("size of map2:%2d i:%2d\n", map.size(), i);
                }
                HashMap<Integer, HashMap<Integer, Integer>> map2 = new HashMap<>();
                int sz2 = 50;
                for(int i = 0; i < sz; i+=2) {
                    HashMap<Integer, Integer> map3 = new HashMap<>();
                    for(int j = 0; j < sz2; j+=2) {
                        map3.put(j, j);
                    }
                    print("size of map2:%2d i:%2d\n", map2.size(), i);
                    map2.put(i, map3);
                }
                print("end");
            }
            public void t21() {
                // linkedhashmap test
                int sz = 100;
                LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
                for(int i = 0; i < sz; i++) {
                    map.put(i, i);
                    print("size of map:%2d i:%2d\n", i, map.size());
                }
                LinkedHashMap<Integer, LinkedHashMap<Integer, Integer>> map2 = new LinkedHashMap<>();
                int sz2 = 50;
                for(int i = 0; i < sz; i++) {
                    LinkedHashMap<Integer, Integer> map3 = new LinkedHashMap<>();
                    for(int j = 0; j < sz2; j++) {
                        map3.put(j, j);
                    }
                    map2.put(i, map3);
                    print("size of map2:%2d i:%2d\n", i, map2.size());
                }
                print("end");
            }
            public void t22() {
                // date test
                long ts = 1473260249L*1000; // 09/07/2016T14:57:29 GMT
                String [] tz = TimeZone.getAvailableIDs();
                Calendar cal0 = Calendar.getInstance();
                Calendar cal1 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
                Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("PST"));
                cal0.setTimeInMillis(ts);
                cal1.setTimeInMillis(ts);
                cal2.setTimeInMillis(ts);
                java.util.Date date0 = cal0.getTime();
                java.util.Date date1 = cal1.getTime();
                java.util.Date date2 = cal2.getTime();
                java.util.Date date3 = new java.util.Date(ts);
                long ts0 = date0.getTime();
                long ts1 = date1.getTime();
                long ts2 = date2.getTime();
                Calendar calb0 = new Calendar.Builder().setDate(cal0.get(Calendar.YEAR), cal0.get(Calendar.MONTH), cal0.get(Calendar.DAY_OF_MONTH)).build();
                Calendar calb1 = new Calendar.Builder().setDate(2016, 8, 7).build();
                long ts3 = calb0.getTimeInMillis();
                assert tz != null;
                assert ts0 != 0;
                assert ts1 != 0;
                assert ts2 != 0;
                assert ts3 != 0;
                assert calb0 != null;
                assert date3 != null;
                print("%04d %02d %02d\n", cal0.get(Calendar.YEAR), cal0.get(Calendar.MONTH), cal0.get(Calendar.DAY_OF_MONTH));
                print("%04d %02d %02d\n", calb0.get(Calendar.YEAR), calb0.get(Calendar.MONTH), calb0.get(Calendar.DAY_OF_MONTH));
                print("%04d %02d %02d\n", calb1.get(Calendar.YEAR), calb1.get(Calendar.MONTH), calb1.get(Calendar.DAY_OF_MONTH));
                print("%d\n", calb1.getTimeInMillis());
                print("%d\n", ts);
                print("date: %s\n", date0.toString());
                print("done\n");
            }
            public void test() {
                try {
                    t22();  
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }

        public void test() {
            SyntaxTest t = new SyntaxTest();
            t.test();
        }
    }
    class Makefile {
        class NodeMF {
            final private String nameNode_;
            final private HashMap<String, NodeMF> mapParents_;
            final private int id_;
            final private int level_;
            private int status_;

            public NodeMF(String nameNode, int id) {
                nameNode_ = nameNode;
                id_ = id;
                level_ = -1;
                status_ = 0;
                mapParents_ = new HashMap<String, NodeMF>();
            }

            public NodeMF(String nameNode, int id, int level) {
                nameNode_ = nameNode;
                id_ = id;
                level_ = level;
                status_ = 0;
                mapParents_ = new HashMap<String, NodeMF>();
            }

            public String name() {
                return nameNode_;
            }

            public int status() {
                return status_;
            }

            public void status(int status) {
                status_ = status;
            }

            public int id() {
                return id_;
            }

            public int level() {
                return level_;
            }

            public void addParent(final NodeMF nodeP) {
                final String nameNode = nodeP.name();
                if (findParent(nameNode) == null) {
                    mapParents_.put(nameNode, nodeP);
                }
            }

            public NodeMF findParent(final String nameNode) {
                if (nameNode == null) {
                    return null;
                }
                return mapParents_.get(nameNode);
            }

            public Iterator<HashMap.Entry<String, NodeMF>> iterator() {
                return mapParents_.entrySet().iterator();
            }

            public void printInfo() {
                System.out.printf("(name:id) %s:%3d level:%d status:%d %n",
                    nameNode_, id_, level_, status_);
            }
        }

        public void printNodes(NodeMF n) {
            if (n == null) {
                return;
            }
            LinkedList<NodeMF> ll = new LinkedList<NodeMF>();
            n.printInfo();
            ll.add(n);
            while (ll.size() != 0) {
                NodeMF c = ll.remove();
                Iterator<HashMap.Entry<String, NodeMF>> it = c.iterator();
                if (it.hasNext() == false) {
                    continue;
                }
                System.out.printf("---- %s children%n", c.name());
                while (it.hasNext()) {
                    HashMap.Entry<String, NodeMF> p = it.next();
                    p.getValue().printInfo();
                    ll.add(p.getValue());
                }
            }
        }

        public boolean makeFileNodesDFS(NodeMF n, Stack<NodeMF> stack) {
            if (n == null) {
                return true;
            }
            Iterator<HashMap.Entry<String, NodeMF>> it = n.iterator();
            if (it.hasNext() == false) {
                n.status(1);
                return true;
            }
            while (it.hasNext()) {
                HashMap.Entry<String, NodeMF> p = it.next();
                stack.push(p.getValue());
                boolean status = makeFileNodesDFS(p.getValue(), stack);
                stack.pop();
                if (status == false) {
                    return false;
                }
            }
            it = n.iterator();
            while (it.hasNext()) {
                HashMap.Entry<String, NodeMF> p = it.next();
                if (p.getValue().status() == 0) {
                    return false;
                }
            }
            n.status(1);
            return true;
        }

        public boolean makeFileNodesBFS(NodeMF n) {
            if (n == null) {
                return true;
            }
            Stack<NodeMF> stack = new Stack<NodeMF>();
            stack.push(n);
            Stack<NodeMF> stack_final = new Stack<NodeMF>();
            stack_final.push(n);
            while (stack.size() != 0) {
                NodeMF c = stack.pop();
                Iterator<HashMap.Entry<String, NodeMF>> it = c.iterator();
                if (it.hasNext() == false) {
                    c.status(1);
                    continue;
                }
                while (it.hasNext()) {
                    HashMap.Entry<String, NodeMF> p = it.next();
                    stack.push(p.getValue());
                    stack_final.push(p.getValue());
                }
            }
            while (stack_final.size() != 0) {
                NodeMF c = stack_final.pop();
                if (c.status() == 0) {
                    Iterator<HashMap.Entry<String, NodeMF>> it = c.iterator();
                    boolean all_status_one = true;
                    while (it.hasNext()) {
                        HashMap.Entry<String, NodeMF> p = it.next();
                        if (p.getValue().status() == 0) {
                            all_status_one = false;
                        }
                    }
                    if (all_status_one == true) {
                        c.status(1);
                    }
                }
                if (c.status() == 0) {
                    System.out.printf("ERROR: %s status = %d%n", c.name(),
                        c.status());
                    return false;
                }
            }
            return true;
        }

        public void getUsedMemory(boolean doPrint) {
            Runtime runtime = Runtime.getRuntime();
            long usedMemory = runtime.totalMemory() - runtime.freeMemory();
            if (doPrint) {
                System.out.printf("Used memory is %d%n", usedMemory);
            }
            runtime.gc();
            usedMemory = runtime.totalMemory() - runtime.freeMemory();
            if (doPrint) {
                System.out.printf("Used memory is %d%n", usedMemory);
            }
        }

        class MakefileTest {
            public void t1() {
                int id = 0;
                String ary[] = { "a", "b", "c", "d", "e" };
                NodeMF n = new NodeMF(ary[id], id);
                id++;
                while (id < 5) {
                    n.addParent(new NodeMF(ary[id], id));
                    id++;
                }
                Iterator<HashMap.Entry<String, NodeMF>> it = n.iterator();
                while (it.hasNext()) {
                    HashMap.Entry<String, NodeMF> p = it.next();
                    p.getValue().printInfo();
                }
            }

            public void t2() {
                String s = "abcdefghijklmnopqrstuvwxyz"
                    + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String ary[] = s.split("");
                int id = 0;
                LinkedList<NodeMF> ll = new LinkedList<NodeMF>();
                int level = 0;
                NodeMF n = new NodeMF(ary[id], id++, level);
                ll.add(n);
                for (int i = 0; i < 15; i++) {
                    NodeMF c = ll.remove();
                    level = c.level() + 1;
                    int numfiles = 2;
                    if (i % 2 == 0) {
                        numfiles = 3;
                    }
                    for (int j = 0; j < numfiles; j++) {
                        NodeMF t = new NodeMF(ary[id], id++, level);
                        ll.add(t);
                        c.addParent(t);
                    }
                }
                ll.clear();
                // printNodes(n);
                System.out.printf("Now doing the make part%n");
                boolean status = makeFileNodesBFS(n);
                if (status == true) {
                    // printNodes(n);
                    System.out.printf("OK PASS%n");
                } else {
                    System.out.printf("FAIL%n");
                }
                getUsedMemory(true);
            }

            public void t3() {
                String s = "abcdefghijklmnopqrstuvwxyz"
                    + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String ary[] = s.split("");
                int id = 0;
                LinkedList<NodeMF> ll = new LinkedList<NodeMF>();
                int level = 0;
                NodeMF n = new NodeMF(ary[id], id++, level);
                ll.add(n);
                for (int i = 0; i < 15; i++) {
                    NodeMF c = ll.remove();
                    level = c.level() + 1;
                    int numfiles = 2;
                    if (i % 2 == 0) {
                        numfiles = 3;
                    }
                    for (int j = 0; j < numfiles; j++) {
                        NodeMF t = new NodeMF(ary[id], id++, level);
                        ll.add(t);
                        c.addParent(t);
                    }
                }
                ll.clear();
                // printNodes(n);
                System.out.printf("Now doing the make part%n");
                Stack<NodeMF> stack = new Stack<NodeMF>();
                stack.push(n);
                boolean status = makeFileNodesDFS(n, stack);
                stack.pop();
                if (status == true) {
                    // printNodes(n);
                    System.out.printf("OK PASS%n");
                } else {
                    System.out.printf("FAIL%n");
                }
                getUsedMemory(true);
            }

            public void test() {
                getUsedMemory(false);
                t2();
                t3();
            }
        }

        public void test() {
            MakefileTest t = new MakefileTest();
            t.test();
        }
    }
    class ExecutorExamples {
        class CallableEx0 implements Callable<Integer> {
            final Integer i_;

            public CallableEx0(int i) {
                i_ = new Integer(i);
            }

            public Integer call() throws Exception {
                int sv = utils_.randInt(100, 1000);
                // System.out.printf("%d sleep %d%n", i_, sv);
                Thread.sleep(sv);
                return i_;
            }
        }

        class RunnableEx0 implements Runnable {
            final Integer i_;
            int v_;

            public RunnableEx0(int i) {
                i_ = new Integer(i);
            }

            public void run() {
                try {
                    int sv = utils_.randInt(100, 1000);
                    Thread.sleep(sv);
                    processV();
                    Thread.sleep(sv);
                    System.out.printf("%2d done %d%n", i_, v_);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            public void processV() {
                v_ = 100;
                for (int i = 0; i < i_.intValue(); i++) {
                    v_ += i;
                }
            }
        }

        ExecutorService exe_;
        final int numThreads_;
        final int numInst_;

        public ExecutorExamples() {
            numThreads_ = 4;
            numInst_ = 12;
            exe_ = Executors.newFixedThreadPool(numThreads_);
        }

        public void run_test_runnable() {
            java.util.List<Runnable> list = new ArrayList<Runnable>();
            for (int i = 0; i < numInst_; i++) {
                Runnable worker = new RunnableEx0(i);
                list.add(worker);
            }
            for (int i = 0; i < numInst_; i++) {
                exe_.execute(list.get(i));
            }
            System.out.printf("Exe calling shutdown%n");
            exe_.shutdown();
            System.out.printf("Exe called  shutdown%n");
            // method 1
            // while(!exe_.isTerminated()) {}
            try {
                int timeout = 10000;
                // method 2
                System.out.printf("awaitTermination %d%n", timeout);
                exe_.awaitTermination(timeout, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.printf("Exe is terminated%n");
        }

        public void run_test_callable1() {
            java.util.List<Future<Integer>> list = new ArrayList<Future<Integer>>();
            Callable<Integer> callable;
            for (int i = 0; i < numInst_; i++) {
                callable = new CallableEx0(i);
                Future<Integer> future = exe_.submit(callable);
                list.add(future);
            }
            // now do blocking wait for all tasks to finish,
            // so the ordering is preserved as 0:numInst_
            for (Future<Integer> fut : list) {
                try {
                    Integer i = fut.get();
                    System.out.printf("Future result i:%d%n", i);
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            exe_.shutdown();
        }

        public void run_test_callable2() {
            Callable<Integer> callable;
            java.util.List<Callable<Integer>> list = new ArrayList<Callable<Integer>>();
            for (int i = 0; i < numInst_; i++) {
                callable = new CallableEx0(i);
                list.add(callable);
            }
            try {
                java.util.List<Future<Integer>> futures = exe_.invokeAll(list);
                exe_.shutdown();
                int timeout = 1000;
                exe_.awaitTermination(timeout, TimeUnit.SECONDS);
                for (Future<Integer> fut : futures) {
                    try {
                        Integer i = fut.get(); // this is blocking, like join
                        System.out.printf("Future result i:%d%n", i);
                    } catch (InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run_test_completion_service0() {
            CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(
                exe_);
            Callable<Integer> callable;
            try {
                for (int i = 0; i < numInst_; i++) {
                    callable = new CallableEx0(i);
                    cs.submit(callable);
                }
                System.out.printf("shutdown called, else never ends%n");
                exe_.shutdown();
                int timeout = 1000;
                exe_.awaitTermination(timeout, TimeUnit.SECONDS);
                for (int i = 0; i < numInst_; i++) {
                    Future<Integer> fut = cs.take();
                    System.out.printf("%2d future: %2d%n", i, fut.get());
                }
                System.out.printf("shutdown could have been called here%n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void run_test_completion_service1() {
            // what if you don't know how many jobs there are and you
            // want to loop until timeout?
            CompletionService<Integer> cs = new ExecutorCompletionService<Integer>(
                exe_);
            Callable<Integer> callable;
            try {
                int sz = 100000;
                for (int i = 0; i < sz; i++) {
                    callable = new CallableEx0(i);
                    cs.submit(callable);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        class ExecutorExamplesTests {
            public void t0() {
                run_test_callable1();
            }

            public void t1() {
                run_test_runnable();
            }

            public void t2() {
                run_test_callable2();
            }

            public void t3() {
                run_test_completion_service0();
            }

            public void test() {
                t3();
            }
        }

        public void test() {
            ExecutorExamplesTests t = new ExecutorExamplesTests();
            t.test();
        }
    }
    class MiscCases {
        public void dynamicProgrammingVsMemoization() {
            // http://stackoverflow.com/questions/6164629/
            // dynamic-programming-and-memoization-bottom-up-
            // vs-top-down-approaches
            //
            // top down is memoization and bottom up is dynamic programming
            // both do caching. top/bottom is based on the computation tree.
            //
            // if memoization, start at top case: fib(100) and work down.
            // this may require partial recomputing, so use a cache for
            // the partial recomputing.
            //
            // if dynamic programming, start at bottom case: fib(1) + fib(2).
            // then return the values up til fib(100) is reach. this avoids
            // recomputing.
            //
            // neither case needs to be recursive, and can be iterative
            //
            // memoization is easier to code, but uses a lot of stacks.
            //
            // dynamic programming requires ordering, or table filling,
            // and skips items that don't need computation, so this may
            // be more complicated
            //
            // complicated problems use more of DP than memoization
            //
            //
            //
        }

        public void towerHanoi(int sz, int src, int dst) {
            if (sz == 0) {
                return;
            }
            ArrayList<Stack<Integer>> s = new ArrayList<Stack<Integer>>();
            for (int i = 0; i < 3; i++) {
                s.add(new Stack<Integer>());
            }
            for (int i = sz - 1; i >= 0; i--) {
                s.get(src).push(new Integer(i));
            }
            int ctr = 0;
            printStacks(s);
            ctr = towerHanoi(sz, s, src, dst, ctr);
            printStacks(s);
            System.out.printf("%d steps\n", ctr);
        }

        private int towerHanoi(int sz, ArrayList<Stack<Integer>> s, int src,
            int dst, int ctr) {
            // recursively call til 1
            // if sz == 1 then stack(dst) = stack(src).pop()
            // else
            // alt = not the src and dst
            // recursive call(src, alt)
            // dst.push(src.pop())
            // recursive call(alt, dst)
            ctr++;
            if (ctr > 2000) {
                return ctr;
            }
            if (sz < 1) {
                return ctr;
            }
            if (sz == 1) {
                s.get(dst).push(s.get(src).pop());
            } else {
                // 00 ^ 01 ^ 11 = 10
                // 00 ^ 10 ^ 11 = 01
                // 01 ^ 10 ^ 11 = 00
                int alt = src ^ dst ^ 0x3;
                ctr = towerHanoi(sz - 1, s, src, alt, ctr);
                s.get(dst).push(s.get(src).pop());
                ctr = towerHanoi(sz - 1, s, alt, dst, ctr);
            }
            return ctr;
        }

        public void printStacks(ArrayList<Stack<Integer>> s) {
            for (int i = 0; i < s.size(); i++) {
                System.out.printf("s[%d] = ", i);
                for (int j = 0; j < s.get(i).size(); j++) {
                    System.out.printf("%d ", s.get(i).get(j).intValue());
                }
                System.out.printf("\n");
            }
            System.out.printf("\n");
        }

        public int greatestCommonDivisor(int n, int m) {
            return -1;
        }

        public int factorial(int n) {
            return 1;
        }

        class Huffman {
            class HuffmanNode implements Comparable<HuffmanNode> {
                private String k_;
                private String v_;
                private int ki_;
                private HuffmanNode l_;
                private HuffmanNode r_;

                public HuffmanNode() {
                    k_ = null;
                    v_ = null;
                    l_ = null;
                    r_ = null;
                    ki_ = -1;
                }

                public HuffmanNode k(String k) {
                    k_ = k;
                    return this;
                }

                public HuffmanNode v(String v) {
                    v_ = v;
                    return this;
                }

                public HuffmanNode l(HuffmanNode l) {
                    l_ = l;
                    return this;
                }

                public HuffmanNode r(HuffmanNode r) {
                    r_ = r;
                    return this;
                }

                public HuffmanNode ki(int i) {
                    ki_ = i;
                    return this;
                }

                public String k() {
                    return k_;
                }

                public String v() {
                    return v_;
                }

                public int ki() {
                    return ki_;
                }

                public HuffmanNode l() {
                    return l_;
                }

                public HuffmanNode r() {
                    return r_;
                }

                public int compareTo(HuffmanNode n) {
                    if (ki() < n.ki()) {
                        return -1;
                    } else if (ki() > n.ki()) {
                        return 1;
                    }
                    return 0;
                }
            }

            class HuffmanTree {
                private HuffmanNode root_;

                public HuffmanTree() {
                    root_ = null;
                }

                public void setRoot(HuffmanNode n) {
                    root_ = n;
                }

                public HuffmanNode insert(String k, String v) {
                    return insert(k, v, root_);
                }

                private HuffmanNode insert(String k, String v, HuffmanNode n) {
                    if (n == null) {
                        n = new HuffmanNode().k(k).v(v);
                    } else if (k.compareTo(n.k()) > 0) {
                        n.l(insert(k, v, n.l()));
                    } else if (k.compareTo(n.k()) < 0) {
                        n.r(insert(k, v, n.r()));
                    }
                    return n;
                }

                public HuffmanNode find(String k) {
                    return find(k, root_);
                }

                private HuffmanNode find(String k, HuffmanNode n) {
                    if (n == null) {
                        return null;
                    } else if (k.compareTo(n.k()) > 0) {
                        return find(k, n.l());
                    } else if (k.compareTo(n.k()) < 0) {
                        return find(k, n.r());
                    }
                    return n;
                }

                class NodeLevel {
                    public HuffmanNode n_;
                    public int level_;

                    public NodeLevel(HuffmanNode n, int level) {
                        n_ = n;
                        level_ = level;
                    }
                }

                public boolean hasPrintInfo() {
                    return true;
                }

                public void printInfo() {
                    Queue<NodeLevel> q = new LinkedList<NodeLevel>();
                    int level = 0;
                    q.add(new NodeLevel(root_, level));
                    while (q.size() != 0) {
                        NodeLevel nl = q.remove();
                        HuffmanNode n = nl.n_;
                        int lvl = nl.level_;
                        if (n.l() != null) {
                            q.add(new NodeLevel(n.l(), lvl + 1));
                        }
                        if (n.r() != null) {
                            q.add(new NodeLevel(n.r(), lvl + 1));
                        }
                        if (lvl != level) {
                            level++;
                            System.out.printf("\n");
                        }
                        System.out.printf("(%d/%s) ", n.ki(), n.v());
                    }
                    System.out.printf("\n");
                }

                public String encode(String s) {
                    StringBuilder ret = new StringBuilder();
                    for (int i = 0; i < s.length(); i++) {
                        String s0 = new String();
                        ret.append(encode(s.charAt(i), root_, s0));
                    }
                    return ret.toString();
                }

                private String encode(char c, HuffmanNode n, String sb) {
                    // System.out.printf("encode %s sb:%s\n", c, sb.toString());
                    if (n == null) {
                        // System.out.printf("encode code000\n");
                        return null;
                    }
                    if (n.v() != null) {
                        if (n.v().charAt(0) == c) {
                            // System.out.printf("encode code002\n");
                            return sb;
                        }
                    }
                    String sl = encode(c, n.l(), sb + "0");
                    String sr = encode(c, n.r(), sb + "1");
                    if (sl != null) {
                        // System.out.printf("encode code003\n");
                        return sl;
                    }
                    return sr;
                }

                public String decode(String s) {
                    StringBuilder sb = new StringBuilder();
                    char ary[] = s.toCharArray();
                    String ret = decode(ary, 0, root_, sb);
                    return ret;
                }

                private String decode(char ary[], int idx, HuffmanNode n,
                    StringBuilder sb) {
                    if (idx > ary.length || n == null) {
                        return sb.toString();
                    }
                    if (n.l() == null && n.r() == null && n.v() != null) {
                        sb.append(n.v());
                        return decode(ary, idx, root_, sb);
                    } else if (idx == ary.length) {
                        return sb.toString();
                    } else if (ary[idx] == '0') {
                        return decode(ary, idx + 1, n.l(), sb);
                    } else if (ary[idx] == '1') {
                        return decode(ary, idx + 1, n.r(), sb);
                    }
                    return sb.toString();
                }
            }

            private HuffmanTree ht_;

            public Huffman() {
                ht_ = new HuffmanTree();
                initCharSet();
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                ht_.printInfo();
            }

            public String encode(String s) {
                return ht_.encode(s);
            }

            public String decode(String s) {
                return ht_.decode(s);
            }

            private void initCharSet() {
                char ary[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                    'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                    's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
                int freq[] = { 26, 12, 21, 20, 25, 8, 14, 13, 24, 7, 9, 15, 17,
                    16, 23, 10, 5, 11, 19, 18, 22, 4, 6, 2,
                    3, 1 };
                // create a pq based on freq of symbols and construct
                // a frequency based tree, which produces a minimum
                // cost prefix code tree. a variable prefix code tree
                // is smaller than a fixed width code tree.
                // a prefix code is where no codeword is a prefix of another.
                // left is labeled 0 and right is labeled 1.
                // high frequency characters have smaller prefix code.
                // this is different from multi string encoding. this
                // is single symbol encoding
                PriorityQueue<HuffmanNode> pq = new PriorityQueue<HuffmanNode>();
                for (int i = 0; i < ary.length; i++) {
                    pq.add(new HuffmanNode().ki(freq[i])
                        .v(String.valueOf(ary[i])));
                }
                while (pq.size() > 1) {
                    HuffmanNode n0 = pq.poll();
                    HuffmanNode n1 = pq.poll();
                    int k = n0.ki() + n1.ki();
                    HuffmanNode n = new HuffmanNode().ki(k);
                    n.l(n1);
                    n.r(n0);
                    // System.out.printf(
                    // "init: new n:(kv:%d,%s) from nl:(%d,%s) nr:(%d,%s)\n",
                    // n.ki(), n.v(), n1.ki(), n1.v(), n0.ki(), n0.v());
                    pq.add(n);
                }
                ht_.setRoot(pq.poll());
            }
        }

        class LZW {
            // example
            // character set: a b c
            // input dict/idx
            // a a 1 001
            // b b 2 010
            // c c 3 011
            // initialization of dictinary done, now build input
            //
            // 0 0 0 0 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 2
            // 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0
            // input set: a b c a b a b c a b c c c a b c a b c c c
            // 1 2 3 4 4 6 5 3 9 12 11
            // input i exists newKey/val/bin output
            // a 0 yes ab 4 100 1
            // b 1 yes bc 5 101 1,2
            // c 2 no ca 6 110 1,2,3
            // ab 4 yes aba 7 111 1,2,3,4
            // ab 6 yes abc 8 1000 1,2,3,4,4
            // ca 8 yes cab 9 1001 1,2,3,4,4,6
            // bc 10 yes bcc 10 1010 1,2,3,4,4,6,5
            // c 11 no cc 11 1011 1,2,3,4,4,6,5,3,
            // cab 14 yes cabc 12 1100 1,2,3,4,4,6,5,3,9
            // cabc 18 yes cabcc 13 1101 1,2,3,4,4,6,5,3,9,12
            // cc 20 yes - 1,2,3,4,4,6,5,3,9,12,11
            //
            // decode:
            // supplied dictionary
            // input dict/idx
            // a a 1 001
            // b b 2 010
            // c c 3 011
            //
            // input stream:
            // 1,2,3,4,4,6,5,3,9,12,11
            // binary stream:
            //
            // 000 000 000 011 111 111 112 222 2222 2233 3333
            // 012 345 678 901 234 567 890 123 4567 8901 2345
            // ----------------------------------------------
            // 001 010 011 100 100 110 101 011 1001 1100 1011
            // 1 2 3 4 4 6 5 3 9 12 11
            //
            // take the first value of a key, not the whole key. for
            // example, if key is ab/4, then append is word+a, not word+ab.
            // same with bc/5, append is word+b, not word+bc.
            //
            // input i exists next key/val output
            // 1 1 yes 1,2 ab 4 a
            // 2 2 yes 2,3 bc 5 b
            // 3 3 yes 3,4 ca 6 c
            // 4 4 yes 4,4 aba 7 ab // ab + 4[0]
            // 5 5 4,6 abc 8 ab
            // 6,5 cab 9 ca
            // 5,3 bcc 10 bc
            // 3,9 cc 11 c
            // 9,12 cabc 12 cab // cab + 9[0]
            // 12,11 cabcc 13 cabc
            // 11 - cc
            //
            // encoder uses a trie (not tst)
            // creates entries in dictionary/trie tree that may never be used
            // what if no match at the dictionary?
            //
            HashMap<String, Integer> dictSI_;
            HashMap<Integer, String> dictIS_;
            int lastDictVal_;

            public LZW() {
                dictSI_ = null;
                dictIS_ = null;
                lastDictVal_ = 0;
            }

            private void initDict() {
                dictSI_ = new HashMap<String, Integer>();
                dictIS_ = new HashMap<Integer, String>();
                String s = "0123456789abcdefghijklmnopqrstuvwxyz!_-.,'";
                char cary[] = s.toCharArray();
                for (int i = 0; i < cary.length; i++) {
                    dictSI_.put(String.valueOf(cary[i]), new Integer(i));
                    dictIS_.put(new Integer(i), String.valueOf(cary[i]));
                }
                lastDictVal_ = cary.length;
            }

            public void printDict() {
                int i = 0;
                int j = 5;
                for (Map.Entry<String, Integer> entry : dictSI_.entrySet()) {
                    System.out.printf("i:%4d: %10s = %5d||", i, entry.getKey(),
                        entry.getValue().intValue());
                    i++;
                    if (i % j == 0) {
                        System.out.printf("\n");
                    }
                }
                System.out.printf("\n");
            }

            public String encode(String input) {
                initDict();
                StringBuilder output = new StringBuilder();
                for (int i = 0, j = 0; j < input.length();) {
                    int lastKey = -1;
                    while (j < input.length()) {
                        // get the longest word in the dict
                        // and update the dict with longest word + 1 char
                        String substr = input.substring(i, j + 1);
                        if (!dictSI_.containsKey(substr)) {
                            dictSI_.put(new String(substr),
                                new Integer(lastDictVal_));
                            lastDictVal_++;
                            break;
                        } else {
                            lastKey = dictSI_.get(substr).intValue();
                            j++;
                        }
                    }
                    if (output.length() != 0) {
                        output.append(",");
                    }
                    output.append(String.valueOf(lastKey));
                    i = j;
                }
                return output.toString();
            }

            public String decode(String input) {
                initDict();
                java.util.List<String> list = Arrays
                    .asList(input.split("\\s*,\\s*"));
                StringBuilder output = new StringBuilder();
                for (int i = 0; i < list.size(); i++) {
                    Integer key = new Integer(list.get(i));
                    if (!dictIS_.containsKey(key)) {
                        break;
                    }
                    String val = dictIS_.get(key);
                    output.append(val);
                    if (i + 1 < list.size()) {
                        Integer k0 = new Integer(list.get(i + 1));
                        String v0 = dictIS_.get(k0);
                        if (v0 == null) {
                            dictIS_.put(lastDictVal_,
                                new String(val + val.charAt(0)));
                        } else {
                            dictIS_.put(lastDictVal_,
                                new String(val + v0.charAt(0)));
                        }
                        lastDictVal_++;
                    }
                }
                return output.toString();
            }
        }

        public void lzwTest1() {
            String s = "abcdababcbcdbcdabcdddaacccaccccaaaacccaaabbbbaaaacccc";
            lzwTest(s);
        }

        public void lzwTest2() {
            String sSet = "abcd";
            int sz = 1000;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < sz; i++) {
                int r = utils_.randInt(0, 3);
                sb.append(sSet.substring(r, r + 1));
            }
            lzwTest(sb.toString());
        }

        public void lzwTest(String s) {
            LZW lzw = new LZW();
            String encoded = lzw.encode(s);
            String decoded = lzw.decode(encoded);
            java.util.List<String> list = Arrays.asList(encoded.split(","));
            System.out.printf("encode s:%s sz:%d\n", s, s.length());
            System.out.printf("encoded: %s sz:%d\n", encoded, list.size());
            System.out.printf("decoded: %s sz:%d\n", decoded, decoded.length());
            if (decoded.equals(s)) {
                System.out.printf("\n\nencode/decode equivalent\n");
            } else {
                System.out.printf("\n\nencode/decode error\n");
            }
        }

        public int greatestPrimeFactor(int m) {
            return 1;
        }

        public void allFactorsOfNumber(int n) {
            // find all numbers that multiply to n
            // allFactorsOfNumber0("", 1, n);
            allFactorsOfNumber1(n + "=1", 2, n);
        }

        public void allFactorsOfNumber1(String prefix, int p, int n) {
            for (int i = p; i < n / 2; i++) {
                int div = n / i;
                if (div == (double) n / (double) (i)) {
                    if (div < i) {
                        return;
                    }
                    System.out.printf(prefix + "*" + i + "*" + div + "\n");
                    allFactorsOfNumber1(prefix + "*" + i, i, div);
                }
            }
        }

        public void allFactorsOfNumber0(String prefix, int p, int n) {
            // this doesn't work for 20
            if (n < 2) {
                return;
            }
            int s = (int) Math.ceil(Math.sqrt(n));
            for (int i = 2; i <= s; i++) {
                if (i >= p && n / i >= i) {
                    System.out.printf(prefix + i + "*" + n / i + "\n");
                    allFactorsOfNumber0(prefix + i + "*", i, n / i);
                }
            }
        }

        public void findTwoNumbersEqualingThird(int ary[]) {
        }

        public void knapsack(int total, int aPrice[], int aWeight[]) {
            // find all combinations in ary that sum to total that
            // has the highest price with weight equaling total
            // knapsack(v,w,n,z)
            // for(w = 0 to z)
            // va[0,w] = 0
            // for(i = 1 to n)
            // for(w = 0 to z)
            // if (w[i] < w) and
            // (v[i] + va[i-1,w-w[i]] > va[i-1,w]){
            // va[i,w] = v[i] + va[i-1,w-w[i]]
            // }
            // else {
            // va[i,w] = va[i-1,w]
            // keep [i,w] = 0
            // }
            // k = z
            // for(i = n downto 1)
            // if(keep[i,k] == 1){
            // output i
            // k = k - w[i]
            // }
            // return va[n,z]
        }

        public void queensProblem() {
            // print all possible ways placing n queens on nxn
            // so that no 2 queens have the same row, column, or diagonal
        }

        public void matrixColoring() {
            // using 4 colors, color a matrix such that no neighbor
            // has the same color up, down, right, left
        }

        public void reconstructPath() {
            // given a bunch of pairs of numbers, reconstruct the
            // path in order. ie given [1,2],[3,1],[5,3], the path is
            // [5,3],[3,1],[1,2]
        }

        public void huffmanTest() {
            if (huffman_ == null) {
                huffman_ = new Huffman();
            }
            String s0 = new String("abcdefghijklmnopqrstuvwxyz");
            // String s1 = new String("00100100110011010001100000000010000110" +
            // "10100000111001000011110111101101000111" +
            // "00001000010111101011111000101000101000" +
            // "000010000101000001");
            String s1 = new String(
                "00100100010011010001100001000010000110101000011110010000011"
                    + "10111101101000111000010000101111010111110001010011010010000"
                    + "10010101001001");
            huffman_.printInfo();
            for (int i = 0; i < s0.length(); i++) {
                String s2 = huffman_.encode(String.valueOf(s0.charAt(i)));
                System.out.printf("s2: %s: %s\n", s0.charAt(i), s2);
            }
            String s2 = huffman_.encode(s0);
            System.out.printf("s2: %s: %s\n", s0, s2);
            String s3 = huffman_.decode(s1);
            System.out.printf("\ns3: %s\n", s3);
        }

        public void lzwTest() {
            LZW lzw = new LZW();
            // String sCharSet = "abc";
            // String sIn0 = "abcababcabcccabcabcc";
            if (lzw != null) {

            }
        }

        public void wildCardTest0() {
            // String s = new String("101??10?");
            String s = new String("10111???");
            char ary[] = s.toCharArray();
            ArrayList<Integer> iary = new ArrayList<Integer>();
            for (int i = 0; i < ary.length; i++) {
                System.out.printf("%s", ary[i]);
                if (ary[i] == '?') {
                    iary.add(new Integer(i));
                }
            }
            System.out.printf("\n");
            wildCard(ary, iary, 0);
        }

        public void wildCard(char ary[], ArrayList<Integer> iary, int idx) {
            //
            // ???
            // 0?? 1??
            // 00? 01? 10? 11?
            // 000 001 010 011 100 101 110 111
            //
            if (idx >= iary.size()) {
                for (int i = 0; i < ary.length; i++) {
                    System.out.printf("%s", ary[i]);
                }
                System.out.printf("\n");
                return;
            }
            ary[iary.get(idx).intValue()] = '0';
            wildCard(ary, iary, idx + 1);
            ary[iary.get(idx).intValue()] = '1';
            wildCard(ary, iary, idx + 1);
        }

        public int medianOfMedians(int ary[], int l, int r) {
            // the median is the value for which half the numbers
            // are greater and half are smaller. if there are 2 numbers,
            // then the median is the arithmetic mean of the middle two numbers
            //
            return 1;
        }

        public void medianOfMediansTest() {
            int ary[] = new int[50];
            for (int i = 0; i < ary.length; i++) {
                ary[i] = i;
            }
            utils_.shuffle(ary);
            for (int i = 0; i < ary.length; i++) {
                System.out.printf("%d ", ary[i]);
            }
            System.out.printf("\n");
            medianOfMedians(ary, 0, ary.length - 1);
        }

        public void commentBinarySearch() {
            // search for 1 in sorted ary
            //
            // 0 1 2 3 4 5 6 7 8 9
            // 0 9
            // 4
            // 0 4
            // 2
            // 0 2
            // 1
            //
            // search for 3
            //
            // 0 1 2 3 4 5 6 7 8 9
            // 0 9
            // 4
            // 0 4
            // 2
            // 2 4
            // 3
            //
            // search for 8
            //
            // 0 1 2 3 4 5 6 7 8 9
            // 0 9
            // 4
            // 4 9
            // 6
            // 6 9
            // 7
            // 7 9
            // 8
            //
        }

        public void commentKnapsack() {
            //
            // maxW = 10
            //
            // i 0 1 2 3 4 5 6 7 8 9
            // v 3 2 4 5 3 2 4 3 1 4
            // w 4 4 3 6 7 4 8 2 2 2
            //
            // ------------------------------------------
            // 0,3,4 0,3,4 0,3,4
            // 1,2,4 2,4,3 3,5,6
            // 8,1,2
            // 9,4,2
            //
            //
            //
            //
            //
            //
            //
            //
        }

        public void commentCoordSum() {
            // 2 coords, find sum of box
            //
            // x sum l->r r->l
            //
            // 0 1 2 3 4 0 1 2 3 4 0 1 2 3 4
            // +---------- -------------- ---------------
            // 0| 1 2 3 4 3 0| 1 3 6 10 13 0|10 9 7 4 3
            // 1| 2 3 4 5 2 1| 2 5 9 14 16 1|14 12 9 5 2
            // 2| 6 7 8 9 1 2| 6 13 21 30 31 2|30 24 17 9 1
            // 3| 4 5 6 7 2 3| 4 9 15 22 24 3|22 18 13 7 2
            // 4| 5 7 3 2 3 4| 5 12 15 17 20 4|20 15 8 5 3
            //
            // y sum u->d d->u
            //
            // 0 1 2 3 4 0 1 2 3 4 0 1 2 3 4
            // +---------- -------------- ---------------
            // 0| 1 2 3 4 3 0| 1 2 3 4 3 0|13 12 10 7 3
            // 1| 2 3 4 5 2 1| 3 5 7 9 5 1|16 14 11 7 2
            // 2| 6 7 8 9 1 2| 9 12 15 18 6 2|31 25 18 10 1
            // 3| 4 5 6 7 2 3|13 17 21 25 8 3|24 20 15 9 2
            // 4| 5 7 3 2 3 4|18 24 24 27 11 4|20 15 8 5 3
            //
        }

        public void commentQuickselect() {
            // returns the n-th smallest element of list within left..right
            // 1) pick pivot, which is floor((l+r)/2)
            // 2) n = partition(l,r,pivot)
            // v = a[pivot]
            // swap(a,pivot,r)
            // store = l
            // for(i = l; i < r; i++)
            // if(a[i] < v)
            // swap(a, i, store++)
            // swap(a, r, store)
            // return store
            // 3) if(n == pivot)
            // return a[n]
            // else if(n < pivot)
            // return quickselect(a, l, pivot-1, n)
            // else
            // return quickselect(a, pivot+1, r, n)
            //
            // n l r p i s 0 1 2 3 4 5 6 7 8 9
            // -----------------------------------
            // 9 5 1 2 4 6 8 7 3 0 // init array
            // 5 0 9 4 0 9 5 1 2 0 6 8 7 3 4 // swap 4, 0
            // 1 9 5 1 2 0 6 8 7 3 4
            // 2 0 1 5 9 2 0 6 8 7 3 4
            // 3 1 1 2 9 5 0 6 8 7 3 4
            // 4 2 1 2 0 5 9 6 8 7 3 4
            // 5 1 2 0 5 9 6 8 7 3 4
            // 6 1 2 0 5 9 6 8 7 3 4
            // 7 1 2 0 5 9 6 8 7 3 4
            // 8 3 1 2 0 3 9 6 8 7 5 4
            // 9 4
            // 1 2 0 3 4 6 8 7 5 9 // return 4
            // return 4, n is on right side, so choose 5+1,9,6
            // 5 5 9 6 5 5 6 8 7 5 9
            // 6 9 7 5 8 // swap 6, 9
            // 5 5 6 9 7 5 8
            // 6 6 6 9 7 5 8
            // 7 6 6 7 9 5 8
            // 8 7 6 7 5 9 8
            // 9 8
            // 6 7 5 8 9 // return 8
            // return 8, n is on left side, so choose 6,7,6
            //
            // -----------------------------------------
            // find 6th smallest element
            //
            // 0 1 2 3 4 5 6 7 8 9 k v i j l
            // -----------------------------------
            // 3 9 7 1 8 2 5 4 0 6 6 3 0 9 0
            // 6 3 6 3 0 9 0
            // 1 3 0
            // 1 9 7 6 3 1
            // 9 2 5 1
            // 1 2 7 6 8 9 5 2
            // 7 0 8 2
            // 1 2 0 6 8 9 5 4 7 8 3
            // 6 3 9 3
            // 1 2 0 3 8 9 5 4 7 6 9 3
            // 6 4 9 3
            // 8 9 5 4 7 6 6 8 4 9 4 3+1:9 = 4:9
            // 6 8 6 8 4 9 4
            // 6 5 6 4
            // 5 6 6 5
            // 5 9 6 4 7 8 6 5
            // 9 4 7 5
            // 4 9 7 6
            // 5 4 6 9 7 8 7 6
            // 9 9 6 final answer is 6
            //
        }

        public void quickSelectTest() {
            System.out.printf("quickselect test\n");
            int ary[] = new int[30];
            for (int i = 0; i < ary.length; i++) {
                ary[i] = i;
            }
            for (int i = 5; i < 15; i++) {
                utils_.shuffle(ary);
                System.out.printf("orig: k:%2d ary: ", i);
                for (int j = 0; j < ary.length; j++) {
                    System.out.printf("%2d ", ary[j]);
                }
                System.out.printf("\n");
                int v = quickSelect(ary, i);
                System.out.printf("k:%2d = %2d: ary: ", i, v);
                for (int j = 0; j < ary.length; j++) {
                    System.out.printf("%2d ", ary[j]);
                }
                System.out.printf("\n");
            }
        }

        public int quickSelect(int ary[], int n) {
            return quickSelect(ary, 0, ary.length - 1, n);
        }

        private int quickSelect(int ary[], int l, int r, int n) {
            if (l >= r) {
                return ary[l];
            }
            int pivot = (int) Math.floor((l + r) / 2);
            pivot = partitionQuickSelect(ary, l, r, pivot);
            if (n == pivot) { // match
                return ary[n];
            } else if (n < pivot) { // nth is in left portion
                return quickSelect(ary, l, pivot - 1, n);
            }
            return quickSelect(ary, pivot + 1, r, n); // nth is in right portion
        }

        public int partitionQuickSelect(int ary[], int l, int r, int pivot) {
            // rearrange elements such that those less than selected
            // pivot are at lower indices, and those larger than selected
            // pivot are at higher indices
            int vPivot = ary[pivot];
            utils_.swap(ary, pivot, r); // move pivot to end
            int storeIdx = l;
            Utils.printObjectLine(ary, "begin");
            for (int i = l; i < r; i++) {
                Utils.printObjectLine(ary,
                    String.format("ary[%d]:%d vpivot:%d", i, ary[i], vPivot));
                if (ary[i] < vPivot) {
                    // swap to the lower index, storeIdx, result is unordered
                    utils_.swap(ary, i, storeIdx);
                    storeIdx++;
                    Utils.printObjectLine(ary, String.format(
                        "change: ary[%d]:%d vpivot:%d", i, ary[i], vPivot));
                }
            }
            utils_.swap(ary, r, storeIdx); // move pivot to the last swapped
                                           // idx+1
            Utils.printObjectLine(ary, "done");
            return storeIdx;
        }

        public boolean isNumberPrime(int v) {
            // or test up to (int)Math.ceil(Math.sqrt(n))
            // or test only the prime numbers up to the sqrt
            if (v <= 1) {
                return false;
            } else if (v <= 3) {
                return true;
            } else if (v % 2 == 0 || v % 3 == 0) {
                return false;
            }
            int i = 5;
            int vSqrt = (int) Math.ceil(Math.sqrt(v));
            while (i <= vSqrt) {
                if (v % i == 0 || v % (i + 2) == 0) {
                    return false;
                }
                i += 3;
            }
            return true;
        }

        public boolean isNumberPrimeFermat(int v) {
            // if v is a prime number, then for any integer a, 2 < a < v,
            // the number (a^v - a) is a multiple of v.
            // if a is not divisible by v, then a^(v-1)
            // for example, if a = 2 and v = 7, then 2^(7-1) = 64, and
            // 64 - 1 = 63. 63 % 7 = 0, so v is prime.
            // for example, if a = 2 and v = 8, then 2^(8-1) = 128, and
            // 128 - 1 = 127. 127 % 8 = 7 is not divisible integer, so v
            // is not prime
            if (v <= 1) {
                return false;
            }
            for (int i = 0; i < 3; i++) {
                // get val_a over several trials
                int a = utils_.randInt(0, v);
                int z = (int) Math.pow(a, v - 1) % v;
                if (z != 0) {
                    return false;
                }
            }
            return true;
        }

        public void allPrimeNumbers(int n) {
            // for(i = 2; i <= n; i++) {
            // mark all multiples of prime i via k*i
            // walk to the next unmarked value, which is a prime
            // store the unmarked to list
            // repeat marking all multiples of prime i via k*i
            boolean ary[] = new boolean[n + 1];
            for (int i = 0; i < ary.length; i++) {
                ary[i] = false;
            }
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 2; i <= n;) {
                // add prime i
                list.add(i);

                // mark all multipls of prime i
                int j = 2 * i;
                for (j = 2 * i; j <= n; j += i) {
                    ary[j] = true;
                }

                // find next prime, which is first unmarked
                for (j = i + 1; j <= n; j++) {
                    if (ary[j] == false) {
                        i = j;
                        break;
                    }
                }
                // if no unmarked found, then exit
                if (j > n) {
                    i = j;
                }
            }
            System.out.printf("primes of %5d: ", n);
            for (int i = 0; i < list.size(); i++) {
                System.out.printf("%d ", list.get(i).intValue());
            }
            System.out.printf("\n");
        }

        public void findPrimeNumbersTest() {
            ArrayList<Integer> list = new ArrayList<Integer>();
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(50);
            list.add(100);
            list.add(200);
            for (int i = 0; i < list.size(); i++) {
                allPrimeNumbers(list.get(i).intValue());
            }
        }

        public void toBeDone() {
            // ---------------------------------------------------------------------
            // greatest common divisor
            // ---------------------------------------------------------------------
            // factorial
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // knapsack with total, price, weight
            // ---------------------------------------------------------------------
            // queens problems
            // ---------------------------------------------------------------------
            // matrix coloring with 4
            // ---------------------------------------------------------------------
            // path reconstruction, given pairs of numbers, reconstruct the
            // path in order. given 1,2 3,1 5,3 the path is 5,3 3,1 1,2
            // ---------------------------------------------------------------------
            // check whether a linked list is palindrome
            // ---------------------------------------------------------------------
            // given array of integers, find all pairs which sum to given number
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // how do you traverse binary tree and output nodes in-order with
            // O(1) space. you can modify the tree
            // ---------------------------------------------------------------------
            // lzw compression
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // number of palindromic subsequences in a string
            //
            // n = strlen(s) - 1
            // for(i = 0; i < n; i++)
            // s2[i<<1] = s2[(i<<1)|1] = s[i]
            // n <<= 1
            // for(i = j = 0; i < n; i+= k)
            // for(; i-j >= 0 &&
            // i+j+1 < n &&
            // s2[i-j] == s2[i+j+1];
            // j++);
            // r[i] = j
            // for(k = 1;
            // k <= j &&
            // i >= k &&
            // r[i-k] != r[i]-k;
            // k++) {
            // r[i+k] = min(r[i+k]+1) >> 1
            // }
            // j = max(0, r[i]-k)
            // res += (r[i]+1)>>1
            // printf("%lld", res)
            //
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
            // ---------------------------------------------------------------------
        }

        class OverlapTest {
            public void comments() {
                // insert pairs [beg,end) in efficient way and determine number
                // of included values, ie
                // ie insert [1,5), [3,10), then [1,10)
                // ie insert [1,5), [6,10), then [1,5),[6,10)

            }
        }

        public void movingAvgTest() {
            int szBuf = 50;
            int lo = 0;
            int hi = 1000;
            int szTest = 1000;
            int aryBuf[] = new int[szBuf];
            int aryTest[] = new int[szTest];
            for (int i = 0; i < szBuf; i++) {
                aryTest[i] = utils_.randInt(lo, hi);
                aryBuf[i] = 0;
            }
            for (int i = szBuf; i < szTest; i++) {
                aryTest[i] = utils_.randInt(lo, hi);
            }
            // now calculate moving avg
            double avgAct = 0;
            double avgEst = 0;
            double avgTest0 = 0;
            long vSumMoving = 0;
            for (int i = 0; i < szTest; i++) {
                int ic = i % szBuf;

                // tail in circular buffer is right before it's overwritten
                int vTail = aryBuf[ic];
                aryBuf[ic] = aryTest[i];

                // get the circular index max
                int jMax = szBuf;
                if (i < szBuf) {
                    jMax = i + 1;
                }

                // calculate the actual average
                int sum = 0;
                for (int j = 0; j < jMax; j++) {
                    sum = sum + aryBuf[j];
                }
                avgAct = (double) (sum) / jMax;

                // calculate the estimated average
                avgEst = avgEst + ((double) aryBuf[ic] - avgEst) / jMax;

                // calculate the test0 moving average
                // this seems to work best if the vSumMoving can
                // fit the sum of the window size, which is
                // max(input) * window_size, ie:
                // 50 * 1,000,000 = 50,000,000. Int is
                // 2^32 = 2.1B signed or 4.2B unsigned

                // if the buffer isn't full yet, just add.
                // then divide by total
                if (i < szBuf) {
                    vSumMoving = vSumMoving + aryBuf[ic];
                } else {
                    vSumMoving = vSumMoving + aryBuf[ic] - vTail;
                }
                avgTest0 = (double) vSumMoving / jMax;
                System.out.printf("movingAvg: act:%7.2f est:%7.2f t0:%7.2f\n",
                    avgAct, avgEst, avgTest0);
            }
        }

        public int minCost(int ary[][], int s, int d) {
            return -1;
        }

        public int fibonacci(int n) {
            int mem[] = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                mem[i] = 0;
            }
            // return fibonacci_memoization(n, mem);
            // return fibonacci_recursive(n);
            return fibonacci_dynamic(n);
        }

        public int fibonacci_recursive(int n) {
            if (n <= 0) {
                return 0;
            } else if (n <= 1) {
                return n;
            }
            System.out.printf("calculate fibonacci %d\n", n);
            // the n-2 will recalculate everything from n-1 except n-2
            return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
        }

        private int fibonacci_dynamic(int n) {
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            }
            // i = 1 because v counts as 1 value
            int sum = 0;
            for (int i = 1, v = 1, prevSum = 0; i < n; i++) {
                sum = v + prevSum;
                System.out.printf("%3d + %3d = %3d\n", prevSum, v, sum);
                prevSum = v;
                v = sum;
            }
            return sum;
        }

        public int fibonacci_memoization(int n, int mem[]) {
            if (n <= 0) {
                return 0;
            } else if (n <= 2) {
                return 1;
            } else if (mem[n] == 0) {
                // the n-2 will reuse the memoization table
                mem[n] = fibonacci_memoization(n - 1, mem)
                    + fibonacci_memoization(n - 2, mem);
                System.out.printf("calculate:   mem[%2d]=%4d\n", n, mem[n]);
            } else {
                System.out.printf("found:       mem[%2d]=%4d\n", n, mem[n]);
            }
            return mem[n];
        }

        public void printLCS(String s0, String s1, int a[][]) {
            System.out.printf("   ");
            for (int j = 0; j < s1.length(); j++) {
                System.out.printf("%2s ", s1.charAt(j));
            }
            System.out.printf("\n");
            for (int i = 0; i < s0.length(); i++) {
                System.out.printf("%2s ", s0.charAt(i));
                for (int j = 0; j < s1.length(); j++) {
                    System.out.printf("%2d ", a[i][j]);
                }
                System.out.printf("\n");
            }
        }

        public int longestCommonSubsequence(String s0, String s1) {
            int a[][] = new int[s0.length()][s1.length()];
            for (int i = 0; i < s0.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    if (i == 0 || j == 0) {
                        a[i][j] = 0;
                    } else if (s0.charAt(i) == s1.charAt(j)) {
                        a[i][j] = a[i - 1][j - 1] + 1;
                    } else if (a[i - 1][j] > a[i][j - 1]) {
                        a[i][j] = a[i - 1][j];
                    } else {
                        a[i][j] = a[i][j - 1];
                    }
                }
            }
            printLCS(s0, s1, a);
            return a[s0.length() - 1][s1.length() - 1];
        }

        public int longestCommonSubsequence1(String s0, String s1) {
            int lcs[][] = new int[s0.length()][s1.length()];
            for (int i = 0; i < s0.length(); i++) {
                lcs[i][0] = 0;
            }
            for (int i = 1; i < s1.length(); i++) {
                lcs[0][i] = 0;
            }
            // for each position of first, check if it's equal to second's char
            // if equal, then increment and propagate.
            // else propagate whichever first or second is greater all
            // the way to the end. the end is the longest value.
            for (int i = 1; i < s0.length(); i++) {
                for (int j = 1; j < s1.length(); j++) {
                    if (s0.charAt(i) == s1.charAt(j)) {
                        lcs[i][j] = lcs[i - 1][j - 1] + 1; // propagate from
                                                           // diag
                    } else if (lcs[i][j - 1] > lcs[i - 1][j]) {
                        lcs[i][j] = lcs[i][j - 1]; // propagate from left
                    } else {
                        lcs[i][j] = lcs[i - 1][j]; // propagate from top
                    }
                }
            }
            for (int i = 0; i < s0.length(); i++) {
                for (int j = 0; j < s1.length(); j++) {
                    System.out.printf("%2d ", lcs[i][j]);
                }
                System.out.printf("\n");
            }
            return lcs[s0.length() - 1][s1.length() - 1];
        }
        public void commentLongestIncreasingSubsequence() {
            // at each char, choose the closest smaller char
            // that has largest total chain size, O(n^2)
            // for each character, loop from beginning of
            // table length. if the char is less than cur char
            // and if its count greater than cur count, then
            // update cur count. this progresses until loop
            // gets to the closest, most recently updated char.
            //
            // ie idx 0 1 2 3 4 5 6 7 8 9
            // char c a c b b c d c e b
            // len 1 1 1 1 1 1 1 1 1 1
            // 2 2 2 2 2 2 2 2 for(j = 0; j < i; j++)
            // 3 3 3 3
            // 3 3
            // 4 4
            // 5
            // prv . . 1 1 1 1 1 1 1 1
            // 4 2 4 2 for(j = 0; j < i; j++)
            // 4 4
            // 5 5
            // 6
            //
            // final table
            // ie idx 0 1 2 3 4 5 6 7 8 9
            // char c a c b b c d c e b
            // len 1 1 2 2 2 3 4 3 5 2
            // prv . . 1 1 1 4 5 4 6 1
            //
            // max len is 5 at idx 8, so trace backward from idx 8
            // in prv: 6 = prv[8], 5 = prv[6], 4 = prv[5]
            // 1 = prv[4], . = prv[1]
            // so: 8->6->5->4->1 = e d c b a and reverse is
            // a b c d e
        }
        public int longestIncreasingSubsequence(String s) {
            int al[] = new int[s.length()];
            int ap[] = new int[s.length()];
            int maxEndI = -1;
            int maxLength = -1;

            for (int i = 1; i < s.length(); i++) {
                al[i] = 1;
                ap[i] = -1;
                for (int j = 0; j < i; j++) {
                    if ((al[i] < al[j] + 1) && (s.charAt(i) > s.charAt(j))) {
                        al[i] = al[j] + 1; // this is for counting
                        ap[i] = j; // this is for chaining
                    }
                }
                if (al[i] > maxLength) {
                    maxEndI = i; // end max position
                    maxLength = al[i];
                }
            }
            System.out.printf("s:%s endi:%2d len:%2d:\t", s, maxEndI,
                maxLength);
            Stack<String> stack = new Stack<String>();
            for (int i = maxEndI; i != -1; i = ap[i]) {
                // trace maxEndI backwards til i == -1 reached
                stack.push(String.valueOf(s.charAt(i)));
            }
            while (stack.size() != 0) {
                System.out.printf("%s ", stack.pop());
            }
            System.out.printf("\n");
            for (int i = 0; i < s.length(); i++) {
                System.out.printf("%2d ", i);
            }
            System.out.printf("\n");
            for (int i = 0; i < s.length(); i++) {
                System.out.printf("%2s ", s.charAt(i));
            }
            System.out.printf("\n");
            for (int i = 0; i < s.length(); i++) {
                System.out.printf("%2d ", al[i]);
            }
            System.out.printf("\n");
            for (int i = 0; i < s.length(); i++) {
                System.out.printf("%2d ", ap[i]);
            }
            System.out.printf("\n");
            return maxLength;
        }
        public void minCostTest() {
            // find min cost to reach from s to d. it is represented
            // by ary[s][d]. if s == d, then cost is 0. if d < s, it is
            // going backwards, so cost is -1.
            // ie in this case, it is:
            // i j cost prev total_cost
            // 0 1 1 n 1
            // 0 2 2 n 2
            // 0 3 3 n 3
            // 0 4 2 n 2
            // 0 5 5 n 5
            //
            // 1 2 2 0 1+2
            // 1 3 3 0 1+3
            // 1 4 4 0 1+4
            // 1 5 5 0 1+5
            //
            // 2 3 5 0 2+5 || 1+2+5 = 7,8
            // 2 4 4 0 2+4 || 1+2+4 = 6,7
            // 2 5 3 0 2+3 || 1+2+3 = 5,6
            //
            // 3 4 1 0 3+1 || 1+3+1 || 1+2+5+1 = 4,5,9
            // 3 5 2 0 3+2 || 1+3+2 || 1+2+5+2 = 5,6,10
            //
            // 4 5 1 0 2+1 || 1+4+1 || 1+2+4+1 || 1+2+5+1+1
            // = 3,6,8,10
            // 5 5 0
            //
            int ary[][] = { { 0, 1, 3, 4, 5, 6, 7, 8, 9, 10 },
                { -1, 0, 1, 3, 4, 5, 6, 7, 8, 9 },
                { -1, -1, 0, 1, 3, 3, 5, 6, 7, 8 },
                { -1, -1, -1, 0, 1, 3, 4, 5, 6, 7 },
                { -1, -1, -1, -1, 0, 1, 3, 4, 5, 6 },
                { -1, -1, -1, -1, -1, 0, 1, 3, 4, 5 },
                { -1, -1, -1, -1, -1, -1, 0, 1, 3, 4 },
                { -1, -1, -1, -1, -1, -1, -1, 0, 1, 3 },
                { -1, -1, -1, -1, -1, -1, -1, -1, 0, 1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, 0 } };
            int sz = ary.length;
            int path[] = new int[sz];
            int cost[] = new int[sz];
            for (int i = 0; i < sz; i++) {
                path[i] = -1;
                cost[i] = 0xffff;
            }
            cost[0] = 0;

            // for each row, check the path, starting from i+1.
            // if the previous cost > current cost, update
            for (int i = 0; i < sz; i++) {
                for (int j = i + 1; j < sz; j++) {
                    int c = cost[i] + ary[i][j];
                    if (cost[j] > c) {
                        cost[j] = c;
                        path[j] = i;
                    }
                }
            }
            System.out.printf("   ");
            for (int i = 0; i < sz; i++) {
                System.out.printf("%2d ", i);
            }
            System.out.printf("\n");
            System.out.printf("   ");
            for (int i = 0; i < sz; i++) {
                System.out.printf("---");
            }
            System.out.printf("\n");
            for (int i = 0; i < sz; i++) {
                System.out.printf("%2d|", i);
                for (int j = 0; j < sz; j++) {
                    System.out.printf("%2d ", ary[i][j]);
                }
                System.out.printf("\n");
            }
            for (int i = 0; i < sz; i++) {
                System.out.printf("path[%d]=%d cost=%d\n", i, path[i], cost[i]);
            }
        }
        public void cnbswocs_(int n, char c[], int i) {
            if (i > n) {
                return;
            } else if (i == n) {
                System.out.printf("s:%s\n", String.valueOf(c));
            } else if (i == 0) {
                c[i] = '0';
                cnbswocs_(n, c, i + 1);
                c[i] = '1';
                cnbswocs_(n, c, i + 1);
            } else {
                if (c[i - 1] == '1') {
                    c[i] = '0';
                    cnbswocs_(n, c, i + 1);
                } else {
                    c[i] = '0';
                    cnbswocs_(n, c, i + 1);
                    c[i] = '1';
                    cnbswocs_(n, c, i + 1);
                }
            }
        }
        public void countNumBinStringsWOConsecutiveOnes(int n) {
            // print all strings which have no consecutive 1s with length n
            // ie N = 3: 000,001,010,100,101

            // permutation of next number, given current number
            char c[] = new char[n];
            cnbswocs_(n, c, 0);
        }
        public void permutation(char a[], int k) {
            // n!/(n-k)!
            //
            // 5!/(2!) = 5*4*3 = 60
            // 6!/(4!) = 6*5 = 30
            // 4!/(4-2)! = 4*3 = 12
            // 4! = 4*3*2 = 24
            // p(4,4) = 4!/(4-4)! = 4*3*2 = 24
            // p(4,3) = 4!/(4-3)! = 4! = 24
            // p(4,2) = 4!/(4-2)! = 4!/2! = 4*3
            // p(6,4) = 6*5*4*3
            // p(6,5) = 6!/(6-5)! = 6!
            //
            // construct trees:
            //
            // 0 1 2
            // abcd
            // abdc
            // acbd
            // acdb
            // adcb
            // adbc
            // bacd
            // badc
            // bcad
            // bcda
            // bdca
            // bdac
            // cbad
            // ...
            // dbca
            // ...
            //
            // p(4,2) = 4!/2! = 12
            // abcd
            // ab ac ad
            // ba bc bd
            // ca cb cd
            // da db dc
            //
            // p(4,3) = 4!/1! = 24
            // abcd
            // abc abd acb acd adb adc
            // bac bad bca bcd bda bdc
            // cab cad cba cbd cda cdb
            // dab dac dba dbc dca dcb
            //
            boolean u[] = new boolean[a.length];
            for (int i = 0; i < u.length; i++) {
                u[i] = false;
            }
            permutation_method_1(a, 0, k);
            // permutation_method_2(a, u, o, k, 0);
        }
        public void permutation_method_2(char a[], boolean u[], char o[], int k,
            int posO) {
            if (posO >= k) {
                System.out.printf("perm: case:%4d s:%s\n", ctr_++,
                    String.valueOf(o, 0, k));
                return;
            }
            for (int j = 0; j < a.length; j++) {
                if (u[j] == false) {
                    u[j] = true;
                    o[posO] = a[j];
                    permutation_method_2(a, u, o, k, posO + 1);
                    u[j] = false;
                }
            }
        }
        public void permutation_method_1(char a[], int i, int n) {
            if (a.length < 1 || i > a.length) {
                return;
            }
            if (i >= n) {
                System.out.printf("perm: case:%4d s:%s\n", ctr_++,
                    String.valueOf(a, 0, n));
            }
            for (int k = i; k < a.length; k++) {
                utils_.swapChar(a, i, k);
                permutation_method_1(a, k + 1, n);
                utils_.swapChar(a, i, k);
            }
        }
        public void combination(char a[], int k) {
            // n!/(k!(n-k)!)
            //
            // abcde choose k
            // 5!/(2!(3)!) = 10
            // 5!/(3!(2)!) = 5*4/2 = 10
            // 5!/(4!(1)!) = 5
            // 6!/(4!2!) = 6*5/(2) = 15
            // 6!/(3!3!) = 6*5*4/(3*2) = 20
            //
            // a
            // abc
            // abd
            // abe
            // acd
            // ace
            // ade
            // b
            // bcd
            // bce
            // bde
            // c
            // cde
            //

            boolean u[] = new boolean[a.length];
            char o[] = new char[k];
            for (int i = 0; i < u.length; i++) {
                u[i] = false;
            }
            // combination_method1(a, u, o, k, 0, 0);
            combination_method2(a, o, k, 0, 0);
        }
        public void combination_method2(char a[], char o[], int k, int posO,
            int j) {
            if (posO >= k) {
                System.out.printf("comb: case:%4d s:%s\n", ctr_++,
                    String.valueOf(o, 0, k));
                return;
            }
            for (int i = j; i < a.length; i++) {
                o[posO] = a[i];
                combination_method2(a, o, k, posO + 1, i + 1);
            }
        }
        public void combination_method1(char a[], boolean u[], char o[], int k,
            int posO, int i) {
            if (posO >= k) {
                System.out.printf("comb: case:%4d s:%s\n", ctr_++,
                    String.valueOf(o, 0, k));
                return;
            }
            for (int j = i; j < a.length; j++) {
                if (u[j] == false) {
                    u[j] = true;
                    o[posO] = a[j];
                    combination_method1(a, u, o, k, posO + 1, j);
                    u[j] = false;
                }
            }
        }
        public void phoneCombo(int aryI[], char aryC[], int idxI, // idx of aryI
            int idxC, // idx of aryC
            int idxO) // idx of offset in a phone key
        {
            if (idxI >= aryI.length || idxC > aryC.length || idxO > 2) {
                return;
            }
            if (idxC == aryC.length) {
                System.out.printf("comb: %s", String.valueOf(aryC));
                return;
            }
            if (aryI[idxI] == 0 || aryI[idxI] == 1) {
                aryC[idxC] = phoneInt2Char(aryI[idxI], 0);
                phoneCombo(aryI, aryC, idxI + 1, idxC + 1, 0);
            } else {
                for (int i = 0; i < 3; i++) {
                    aryC[idxC] = phoneInt2Char(aryI[idxI], i);
                    phoneCombo(aryI, aryC, idxI + 1, idxC + 1, i);
                }
            }
        }

        public char phoneInt2Char(int num, int position) {
            // 1 = 1 2 = abc 3 = def
            // 4 = ghi 5 = jkl 6 = mno
            // 7 = prs 8 = tuv 9 = wxy
            // 0 = 0
            //
            if (position > 2 || num < 0 || num > 9) {
                return '#';
            }
            if (num == 0 || num == 1) {
                return (char) (num + 48); // ascii char
            }
            if (num >= 2 && num <= 6) {
                int offset = (num - 2) * 3;
                return (char) (offset + position + 97);
            }
            if (num == 7) {
                if (position == 0) {
                    return 'p';
                } else if (position == 1) {
                    return 'r';
                } else {
                    return 's';
                }
            }
            if (num == 8) {
                return (char) (116 + position);
            }
            if (num == 9) {
                return (char) (119 + position);
            }
            return '*';
        }

        public void test_combination() {
            // takes 7 digit phone number and prints all possible combos
            // that letters can represent
            // int ai[] = { 1, 2, 3, 4, 5, 0, 7 };
            // char ac[] = { 'x', 'x', 'x', 'x', 'x', 'x', 'x', '\0' };
        }

        public void testHashMapVsTreeMap() {
            System.out.printf("HashMap vs TreeMap performance\n");
            System.out.printf("HashMap iterate is unsorted\n");
            System.out.printf("TreeMap iterate is sorted\n");

            int sz = 1000000;
            int a[] = new int[sz];

            for (int i = 0; i < sz; i++) {
                a[i] = i;
            }
            Utils util = new Utils();
            util.shuffle(a);

            HashMap<Integer, Integer> mHash = new HashMap<Integer, Integer>();
            long tBeg = System.currentTimeMillis();
            for (int i = 0; i < sz; i++) {
                mHash.put(a[i], a[i]);
            }
            long tEnd = System.currentTimeMillis();
            long tDiff = tEnd - tBeg;
            System.out.printf("HashMap insert %d entries time:%d ms\n", sz,
                tDiff);

            tBeg = System.currentTimeMillis();
            for (int i = 0; i < sz; i++) {
                mHash.get(a[i]);
            }
            tEnd = System.currentTimeMillis();
            tDiff = tEnd - tBeg;
            System.out.printf("HashMap get    %d entries time:%d ms\n", sz,
                tDiff);

            TreeMap<Integer, Integer> mTree = new TreeMap<Integer, Integer>();
            tBeg = System.currentTimeMillis();
            for (int i = 0; i < sz; i++) {
                mTree.put(a[i], a[i]);
            }
            tEnd = System.currentTimeMillis();
            tDiff = tEnd - tBeg;
            System.out.printf("TreeMap insert %d entries time:%d ms\n", sz,
                tDiff);

            tBeg = System.currentTimeMillis();
            for (int i = 0; i < sz; i++) {
                mTree.get(a[i]);
            }
            tEnd = System.currentTimeMillis();
            tDiff = tEnd - tBeg;
            System.out.printf("TreeMap get    %d entries time:%d ms\n", sz,
                tDiff);
        }

        public void arraySyntaxTest() {
            // array tests
            int[] a0 = { 0, 1, 2, 3 };
            int a1[][] = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
            int a2[] = { 0, 1, 2, 3 };
            int szX = 3;
            int szY = 2;
            int a3[][];
            a3 = new int[szX][szY];
            for (int i = 0; i < szX; i++) {
                for (int j = 0; j < szY; j++) {
                    a3[i][j] = (i + 1) * 10 + j;
                }
            }
            int a4[][] = new int[szX][];
            for (int i = 0; i < szX; i++) {
                a4[i] = new int[szY];
                for (int j = 0; j < szY; j++) {
                    a4[i][j] = (i + 1) * 10 + j;
                }
            }

            System.out.printf("\n----------------\n");
            System.out.printf("a0: ");
            for (int i = 0; i < a0.length; i++) {
                System.out.printf("(%2d, %2d) ", i, a0[i]);
            }
            System.out.printf("\n----------------\n");
            System.out.printf("a1:\n");
            for (int i = 0; i < a1.length; i++) {
                for (int j = 0; j < a1[i].length; j++) {
                    System.out.printf("(%2d, %2d, %2d) ", i, j, a1[i][j]);
                }
                System.out.printf("\n");
            }
            System.out.printf("----------------\n");
            System.out.printf("a2:\n");
            for (int i = 0; i < a2.length; i++) {
                System.out.printf("(%2d, %2d) ", i, a2[i]);
            }
            System.out.printf("\n----------------\n");
            System.out.printf("a3:\n");
            for (int i = 0; i < a3.length; i++) {
                for (int j = 0; j < a3[i].length; j++) {
                    System.out.printf("(%2d, %2d, %2d) ", i, j, a1[i][j]);
                }
                System.out.printf("\n");
            }
            System.out.printf("\n----------------\n");
            System.out.printf("a4:\n");
            for (int i = 0; i < a4.length; i++) {
                for (int j = 0; j < a4[i].length; j++) {
                    System.out.printf("(%2d, %2d, %2d) ", i, j, a1[i][j]);
                }
                System.out.printf("\n");
            }
        }

        public void sortByStack(Stack<Integer> stack) {
            if (stack == null) {
                return;
            } else if (stack.size() == 0) {
                return;
            }
            Integer v = stack.pop();
            sortByStack(stack);
            sortByStackInsert(stack, v);
        }

        public void sortByStackInsert(Stack<Integer> stack, Integer i) {
            if (stack == null) {
                return;
            } else if (stack.size() == 0) {
                stack.push(i);
            } else if (stack.peek().intValue() < i.intValue()) {
                stack.push(i);
            } else {
                Integer v = stack.pop();
                sortByStackInsert(stack, i);
                stack.push(v);
            }
        }

        public void findThreeSum(int a[], int val) {
            HashMap<Integer, Boolean> h = new HashMap<Integer, Boolean>();
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int i = 0; i < a.length; i++) {
                h.put(a[i], true);
                l.add(a[i]);
            }
            Collections.sort(l);
            int ctr = 0;
            for (int i = 0; i < l.size(); i++) {
                int v0 = l.get(i);
                for (int j = i + 1; j < l.size(); j++) {
                    int v1 = l.get(j);
                    int d = val - v0 - v1;
                    if (d < v1) {
                        continue;
                    }
                    if (h.get(d) != null) {
                        System.out.printf("i:%3d %2d + %2d + %2d = %2d\n", ctr,
                            v0, v1, d, val);
                        ctr++;
                    }
                }
            }
        }

        public void maxContiguousSubarray(int a[]) {
            if (a.length < 1) {
                return;
            }
            int max = a[0];
            int mtmp = a[0];
            int idb = 0;
            int ide = 0;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > mtmp) {
                    mtmp = a[i];
                    idb = i;
                } else {
                    mtmp = a[i] + mtmp;
                }
                if (mtmp > max) {
                    max = mtmp;
                    ide = i;
                }
            }
            for (int i = idb; i <= ide; i++) {
                if (i == idb) {
                    System.out.printf("%d ", a[i]);
                } else {
                    System.out.printf("+ %d ", a[i]);
                }
            }
            System.out.printf("= %d\n", max);
        }

        public void houseRobber(int a[]) {
            // find the max subsequence where positions cannot be contiguous
            if (a.length == 0) {
                return;
            }
            int even = 0;
            int odd = 0;
            ArrayList<Integer> l = new ArrayList<Integer>();
            for (int i = 0; i < a.length; i++) {
                if (i % 2 == 0) {
                    even = even + a[i];
                    if (even < odd) {
                        even = odd;
                    } else {
                        l.add(i);
                    }
                } else {
                    odd = odd + a[i];
                    if (odd < even) {
                        odd = even;
                    } else {
                        l.add(i);
                    }
                }
            }
            if (even > odd) {
                System.out.printf("even: %d\n");
            } else {
                System.out.printf("odd:  %d\n");
            }
        }

        public void commentMaxStock() {
            //
            // 10 1 2
            // 12 2 3
            // 15 3 2
            // 17 4 3
            // 20 5 -5
            // 15 6 -1
            // 14 7 2
            // 16 8
            //
            //
            //
            //
            //
        }

        public void similarPair0() {
            Scanner scanner = new Scanner(System.in);
            try {
                int n = scanner.nextInt();
                int t = scanner.nextInt();
                int s, e, v;
                int sz = 1000001;
                int a[] = new int[sz];
                for (int i = 1; i < n; i++) {
                    s = scanner.nextInt();
                    e = scanner.nextInt();
                    a[e] = s;
                }
                int cnt = 0;
                for (int i = 1; i < sz; i++) {
                    s = a[i];
                    while (s != 0) {
                        v = Math.abs(s - i);
                        if (v <= t) {
                            cnt++;
                        }
                        s = a[s];
                    }
                }
                System.out.println(cnt);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                scanner.close();
            }
        }

        public void similarPair1() {
            Scanner scanner = new Scanner(System.in);
            HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
            try {
                int n = scanner.nextInt();
                int t = scanner.nextInt();
                int s, e, v;
                for (int i = 1; i < n; i++) {
                    s = scanner.nextInt();
                    e = scanner.nextInt();
                    m.put(e, s);
                }
                int cnt = 0;
                Integer tmp = null;
                for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                    e = entry.getKey().intValue();
                    s = entry.getValue().intValue();
                    while (s != -1) {
                        v = Math.abs(s - e);
                        if (v <= t) {
                            cnt++;
                        }
                        tmp = m.get(s);
                        if (tmp == null) {
                            s = -1;
                        } else {
                            s = tmp.intValue();
                        }
                    }
                }
                System.out.println(cnt);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                scanner.close();
            }
        }

        class IntType1 implements Comparable<IntType1> {
            int v_;

            public IntType1(int v) {
                v(v);
            }

            public int v() {
                return v_;
            }

            public void v(int v) {
                v_ = v;
            }

            public int compareTo(IntType1 o) {
                if (v_ == o.v()) {
                    return 0;
                }
                if (v_ < o.v()) {
                    return -1;
                }
                return 1;
            }
        }

        class IntType2 implements Comparable<IntType2> {
            int b_;
            int e_;
            boolean sortByBegin_;

            public IntType2(int b, int e, boolean sortByBegin) {
                b_ = b;
                e_ = e;
                sortByBegin_ = sortByBegin;
            }

            public int b() {
                return b_;
            }

            public int e() {
                return e_;
            }

            public boolean sortByBegin() {
                return sortByBegin_;
            }

            public int compareTo(IntType2 o) {
                if (sortByBegin_ != o.sortByBegin()) {
                    return 0;
                }
                if (sortByBegin_) {
                    if (b_ == o.b()) {
                        return 0;
                    }
                    if (b_ < o.b()) {
                        return -1;
                    }
                    return 1;
                }
                if (e_ == o.e()) {
                    return 0;
                }
                if (e_ < o.e()) {
                    return -1;
                }
                return 1;
            }
        }

        class CacheObj {
            public String name_;
            public int ts_;
            public String v_;
            public CacheObj n_;
            public CacheObj p_;

            public CacheObj() {
                name_ = null;
                v_ = null;
                n_ = null;
                p_ = null;
                ts_ = 0;
            }
        }

        class CacheLRU {
            // hash with head and tail pointers
            int sz_;
            HashMap<String, CacheObj> m_;
            CacheObj h_;
            CacheObj t_;
            int ts_;

            public CacheLRU(int sz) {
                sz_ = sz;
                m_ = new HashMap<String, CacheObj>();
                h_ = null;
                t_ = null;
                ts_ = 0;
            }

            public void add(CacheObj obj) {
                obj.ts_ = ts_++;
                if (m_.size() == 0) {
                    // System.out.printf("add case 0: %s: ", obj.name_);
                    h_ = obj;
                    t_ = obj;
                    h_.n_ = null;
                    h_.p_ = null;
                } else if (m_.size() == sz_) {
                    // System.out.printf("add case 1: %s: ", obj.name_);
                    m_.remove(t_.name_);
                    CacheObj tmp = t_.p_;
                    tmp.n_ = null;
                    t_.p_ = null;
                    t_ = tmp;

                    h_.p_ = obj;
                    obj.n_ = h_;
                    h_ = obj;
                } else if (h_ == t_) {
                    // System.out.printf("add case 2: %s: ", obj.name_);
                    obj.n_ = t_;
                    t_.p_ = obj;
                    h_ = obj;
                } else {
                    // System.out.printf("add case 3: %s: ", obj.name_);
                    h_.p_ = obj;
                    obj.n_ = h_;
                    h_ = obj;
                }
                m_.put(obj.name_, obj);
            }

            public CacheObj access(String s, CacheObj objIn) {
                if (m_.containsKey(s) == false) {
                    add(objIn);
                    return h_;
                }
                CacheObj obj = m_.get(s);
                obj.ts_ = ts_++;
                if (obj == h_) {
                    return obj;
                } else if (obj == t_) {
                    CacheObj tmp = t_.p_;
                    tmp.n_ = null;
                    t_.n_ = h_;
                    t_.p_ = null;
                    h_.p_ = t_;
                    h_ = t_;
                    t_ = tmp;
                } else {
                    obj.p_.n_ = obj.n_;
                    obj.n_.p_ = obj.p_;
                    h_.p_ = obj;
                    obj.p_ = null;
                    obj.n_ = h_;
                    h_ = obj;
                }
                return obj;
            }

            public void printInfo() {
                CacheObj o = h_;
                if (h_ == null || t_ == null) {
                    return;
                }
                // System.out.printf("head: %s ", h_.name_);
                // System.out.printf("tail: %s :", t_.name_);
                while (o != null) {
                    System.out.printf("%s ", o.name_);
                    o = o.n_;
                }
                System.out.printf("\n");
                // System.out.printf("\n-------------------------------\n");
            }
        }

        class MiscCasesTests {
            Utils utils_;

            public MiscCasesTests() {
                utils_ = new Utils();
            }

            public void t00() {
                // for(int i = 20; i < 30; i++) {
                // System.out.printf("start case %d\n", i);
                // allFactorsOfNumber(i);
                // }
                // huffmanTest();
                // wildCardTest0();
                // medianOfMediansTest();
                // quickSelectTest();
                // lzwTest2();
                // findPrimeNumbersTest();
                // deadlockFriendTest();
                // producerConsumerTest();
                // movingAvgTest();
                // minCostTest();
                // longestIncreasingSubsequence("236182394244523469547998");
                // longestIncreasingSubsequence("3223543596572387"); //2345678
                // longestIncreasingSubsequence("521311853966318119");
                // longestIncreasingSubsequence("323433412131412523326555678789012");
                longestIncreasingSubsequence("bbaaccbacdbefd");
                // int n = c.fibonacci(15);
                // System.out.printf("fibonacci: 15 = %d\n", n);
                // countNumBinStringsWOConsecutiveOnes(5);
            }

            public void t01() {
                System.out.printf("permutation test\n");
                String s = "abcd";
                int choose = 2;
                char a[] = s.toCharArray();
                System.out.printf("orig:%s\n", String.valueOf(a));
                ctr_ = 0;
                permutation(a, choose);
            }

            public void t02() {
                System.out.printf("combination test\n");
                String s = "abcdef";
                char a[] = s.toCharArray();
                int choose = 4;
                System.out.printf("orig:%s choose:%d\n", String.valueOf(a),
                    choose);
                ctr_ = 0;
                combination(a, choose);
            }

            public void t03() {
                // stack testing
                int tc = 1;
                if (tc == 0) {
                    Stack<Integer> s = new Stack<Integer>();
                    int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                    for (int i = 0; i < a.length; i++) {
                        s.push(new Integer(a[i]));
                    }
                    StringBuffer sb = new StringBuffer();
                    while (!s.empty()) {
                        sb.append(s.peek().toString() + " ");
                        s.pop();
                    }
                    System.out.printf("%s\n", sb.toString());
                } else if (tc == 1) {
                    // split into reverse polish notation
                    // use shunting yard algorithm
                    // for each symbol
                    // if is number
                    // add to output q
                    // if is function
                    // push to stack
                    // if is operator, o1 // +/*-
                    // while there is operator at top of stack, o2
                    // if o1 is left associative and precedence
                    // o1 <= o2 or if
                    // o1 is right associative and precedence
                    // o1 < o2
                    // // left associative are: */-+
                    // // right associative is: ^
                    // pop off operator stack to output q
                    // push operator to stack
                    // if is (
                    // push to stack
                    // if is )
                    // pop from stack to q until (
                    // if token at top of stack is function token
                    // pop to q
                    // while operator tokens still on stack
                    // pop to q
                    //
                    // to evaluate, do:
                    // for each symbol
                    // if operand // a number
                    // push stack
                    // else if operator // +/-*
                    // op1 = pop stack
                    // op2 = pop stack
                    // val = op2 operator op1
                    // push val to stack
                    // return top of stack
                    //
                    // String s0 = "7 * (1 + 2) + ((2 + (2 + 3 * 3) * 4) + 5) *
                    // 6";
                    // String sa[] = s0.split("\\s+");
                    // String s0 = "7*(10+2)+((2+(2+3*3)*4)+5)*6";
                    // String sa[] = s0.split("[\\*\\(\\)\\+]");
                    // System.out.printf("%s\n", s0);
                    // for(int i = 0; i < sa.length; i++) {
                    // System.out.printf("%2d: %s\n", i, sa[i]);
                    // }

                    Stack<String> st = new Stack<String>();
                    ArrayList<String> l = new ArrayList<String>();
                    String s0 =
                    // "7 * ( 1 + 2 ) + ( ( 2 + ( 2 + 3 * 3 ) * 4 ) + 5 ) * 6";
                    // "5 + ( ( 1 + 2 ) * 4 ) - 3";
                    // "6 - 2 * ( 8 - ( 3 + 2 * 4 ) )";
                    "6 - 4 * ( 8 - ( 2 + 1 * 4 ) )";
                    System.out.printf("%s\n", s0);
                    String sa[] = s0.split("\\s+");
                    for (int i = 0; i < sa.length; i++) {
                        try {
                            l.add(sa[i]);
                        } catch (Exception e) {
                            // - doesn't work with s.equals("-"),
                            // and if matches in a group, - must be last, ie -]
                            if (sa[i].matches("[*/+-]")) {
                                boolean found = false;
                                while (st.size() != 0 && !found) {
                                    String stmp = st.peek();
                                    if (stmp.matches("[*/+-]")) {
                                        if (sa[i].matches("[+-]")) {
                                            l.add(st.pop());
                                        } else {
                                            found = true;
                                        }
                                    } else {
                                        found = true;
                                    }
                                }
                                // System.out.printf("pushing %s\n", sa[i]);
                                st.push(sa[i]);
                            } else if (sa[i].equals("(")) {
                                st.push(sa[i]);
                                // System.out.printf("pushing %s\n", sa[i]);
                            } else if (sa[i].equals(")")) {
                                boolean found = false;
                                while (st.size() != 0 && !found) {
                                    String stmp = st.pop();
                                    if (stmp.equals("(")) {
                                        found = true;
                                    } else {
                                        l.add(stmp);
                                    }
                                }
                            } else {
                                System.out.printf("unrecognized: %s\n", sa[i]);
                            }
                        }
                    }
                    while (st.size() != 0) {
                        l.add(st.pop());
                    }
                    // for(int i = 0; i < l.size(); i++) {
                    // System.out.printf("%2d:%s\n", i, l.get(i));
                    // }
                    for (int i = 0; i < l.size(); i++) {
                        System.out.printf("%s ", l.get(i));
                    }
                    System.out.printf("\n");

                    // now do the evaluation
                    boolean err = false;
                    for (int i = 0; i < l.size() && !err; i++) {
                        try {
                            st.push(l.get(i));
                        } catch (Exception e) {
                            if (l.get(i).matches("[*/+-]")) {
                                if (st.size() >= 2) {
                                    try {
                                        Integer i0 = Integer.valueOf(st.pop());
                                        Integer i1 = Integer.valueOf(st.pop());
                                        int ival = 0;
                                        if (l.get(i).equals("*")) {
                                            ival = i1.intValue()
                                                * i0.intValue();
                                        } else if (l.get(i).equals("/")) {
                                            ival = i1.intValue()
                                                / i0.intValue();
                                        } else if (l.get(i).equals("+")) {
                                            ival = i1.intValue()
                                                + i0.intValue();
                                        } else if (l.get(i).matches("-")) {
                                            ival = i1.intValue()
                                                - i0.intValue();
                                        } else {
                                            System.out
                                                .printf("still err w/ -\n");
                                            err = true;
                                        }
                                        if (!err) {
                                            System.out.printf(
                                                "push eval %d = %d %s %d\n",
                                                ival, i1.intValue(),
                                                l.get(i), i0.intValue());
                                            st.push(String.valueOf(ival));
                                        }
                                    } catch (Exception e2) {
                                        err = true;
                                        System.out.printf("err 002\n");
                                    }
                                } else {
                                    err = true;
                                    System.out.printf("err 003\n");
                                }
                            } else {
                                err = true;
                                System.out.printf("err 004\n");
                            }
                        }
                    }
                    if (err) {
                        System.out.printf("Found error in evaluation\n");
                    } else {
                        try {
                            if (st.size() == 1) {
                                System.out.printf("val = %d\n",
                                    Integer.valueOf(st.peek()));
                            } else {
                                System.out.printf("err with st size:%d\n",
                                    st.size());
                            }
                        } catch (Exception e) {
                            System.out.printf(
                                "exception with final answer %s\n", st.peek());
                        }
                    }
                } else if (tc == 2) {
                    // infix to prefix
                    // 1) reverse given expression
                    // 2) make every ) as ( and every ( as )
                    // 3) apply infix to postfix
                    // 4) reverse that expression
                    //
                    // ie: (a+b^c)*d+e^5
                    // 5^e+d*)c^b+a( // reverse
                    // 5^e+d*(c^b+a) // fix )(
                    // 5e^dcb^a+*+ // infix to postfix
                    // +*+a^bcd^e5 // reverse
                    //
                } else if (tc == 3) {
                    // character parser, doesn't handle negatives
                    String s0 = "7*(11+23)+((12+(2+3*3)*4)+5)*6";
                    System.out.printf("%s\n", s0);
                    char a0[] = s0.toCharArray();
                    StringBuilder sb = new StringBuilder();
                    ArrayList<String> l = new ArrayList<String>();
                    for (int i = 0; i < a0.length; i++) {
                        try {
                            int iv = Character.getNumericValue(a0[i]);
                            if (iv != -1) {
                                sb.append(a0[i]);
                            } else {
                                if (sb.length() != 0) {
                                    l.add(sb.toString());
                                    sb.setLength(0);
                                }
                                l.add(String.valueOf(a0[i]));
                            }
                        } catch (Exception e) {
                        }
                    }
                    if (sb.length() != 0) {
                        l.add(sb.toString());
                        sb.setLength(0);
                    }
                    for (int i = 0; i < l.size(); i++) {
                        System.out.printf("%2d=%s\n", i, l.get(i));
                    }
                }
            }

            public void t04() {
                int m = 3;
                int n = 4;
                int ma[][] = new int[m][n];
                int mb[][] = new int[m][];
                for (int i = 0; i < m; i++) {
                    mb[i] = new int[n];
                    for (int j = 0; j < n; j++) {
                        ma[i][j] = (i + 1) * 10 + j;
                        mb[i][j] = (i + 1) * 10 + j;
                    }
                }
                for (int i = 0; i < m; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.printf("ma[%d][%d]=%d\n", i, j, ma[i][j]);
                        System.out.printf("mb[%d][%d]=%d\n", i, j, ma[i][j]);
                    }
                }
            }

            public void t05() {
                // find common elements in 3 sorted arrays
                int a0[] = { 3, 4, 5, 6, 7, 8, 9, 10, 17, 18 };
                int a1[] = { 1, 4, 5, 6, 11, 12, 15, 16, 17, 19, 20 };
                int a2[] = { 1, 2, 3, 4, 5, 6, 13, 15, 17, 21 };
                int i = 0, j = 0, k = 0;
                while (i < a0.length && j < a1.length && k < a2.length) {
                    if (a0[i] == a1[j] && a1[j] == a2[k]) {
                        System.out.printf("match %d\n", a0[i]);
                        i++;
                        j++;
                        k++;
                    } else if (a0[i] < a1[j]) { // || a0[i] < a2[k]) {
                        i++;
                    } else if (a1[j] < a2[k]) { // || a1[j] < a0[i]) {
                        j++;
                    } else {
                        k++;
                    }
                }
            }

            public void t06() {
                int sz = 100;
                int a[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    a[i] = i;
                }
                int v = 35;
                findThreeSum(a, v);
            }

            public void t08() {
                Stack<Integer> stack = new Stack<Integer>();
                int sz = 20;
                int a[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    a[i] = i;
                }
                Utils util = new Utils();
                util.shuffle(a);
                for (int i = 0; i < sz; i++) {
                    stack.push(new Integer(a[i]));
                }
                sortByStack(stack);
                Utils.printObject(a);
                util.printObject(stack);
            }

            public void t09() {
                int ary[] = { 6, 4, 8, 5, 2, 3, 1, 7 };
                int v = quickSelect(ary, 5);
                System.out.printf("quickSelect v = %d\n", v);
            }

            public void t10() {
                int sz = 25;
                int a[] = new int[sz];
                int vStart = -sz / 2;
                for (int i = 0; i < sz; i++) {
                    a[i] = vStart++;
                }
                utils_.shuffle(a);
                maxContiguousSubarray(a);
            }

            public void t11() {
                // set test
                int a0[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
                int a1[] = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
                TreeSet<Integer> treeSet = new TreeSet<Integer>();
                for (int i = 0; i < a0.length; i++) {
                    treeSet.add(new Integer(a0[i]));
                }
                for (int i = 0; i < a1.length; i++) {
                    if (treeSet.contains(new Integer(a1[i]))) {
                        System.out.printf("tree contains:%d\n", a1[i]);
                    }
                    treeSet.add(new Integer(a1[i]));
                }
                for (Iterator<Integer> it = treeSet.iterator(); it.hasNext();) {
                    System.out.printf("iter:%d\n", it.next().intValue());
                }
            }

            public void t12() {
                Stack<ArrayList<Integer>> s0 = new Stack<ArrayList<Integer>>();
                ArrayList<Stack<Integer>> s1 = new ArrayList<Stack<Integer>>();

                // you can't have array of generic objects, so you have
                // to container it
                // Stack<Integer> s[] = new Stack<Integer>[3];
                // for(int i = 0; i < 3; i++) {
                // s[i] = new Stack<Integer>();
                // }

                for (int i = 0; i < 3; i++) {
                    s0.push(new ArrayList<Integer>());
                    s1.add(new Stack<Integer>());
                    for (int j = 0; j < 5; j++) {
                        s0.get(i).add(new Integer(i * 10 + j));
                        s1.get(i).push(new Integer(i * 10 + j));
                    }
                }
                for (int i = 0; i < 3; i++) {
                    ArrayList<Integer> t0 = s0.get(i);
                    Stack<Integer> t1 = s1.get(i);
                    System.out.printf("arraylist %d: ", i);
                    for (int j = 0; j < t0.size(); j++) {
                        System.out.printf("%d ", t0.get(j).intValue());
                    }
                    System.out.printf("\n");
                    System.out.printf("stack     %d: ", i);
                    for (int j = 0; j < t1.size(); j++) {
                        System.out.printf("%d ", t1.get(j).intValue());
                    }
                    System.out.printf("\n");
                    System.out.printf("stack     %d: ", i);
                    while (t1.size() != 0) {
                        System.out.printf("%d ", t1.pop().intValue());
                    }
                    System.out.printf("\n");
                }
            }

            public void t13() {
                ArrayList<Integer> ary = new ArrayList<Integer>();
                int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                int b[] = { 11, 12, 13, 14, 15, 16, 17, 18, 19 };
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < a.length; i++) {
                    ary.add(0, new Integer(a[i]));
                }
                for (int i = 0; i < ary.size(); i++) {
                    sb.append(String.format("%d ", ary.get(i).intValue()));
                }
                System.out.printf("a: %s\n", sb.toString());
                sb = new StringBuilder();
                Iterator<Integer> iter = ary.iterator();
                while (iter.hasNext()) {
                    sb.append(String.format("%d ", iter.next().intValue()));
                }
                System.out.printf("a: %s\n", sb.toString());
                while (!ary.isEmpty()) {
                    ary.remove(0);
                }
                System.out.printf("ary size after all remove: %d\n",
                    ary.size());
                for (int i = 0; i < a.length; i++) {
                    ary.add(0, new Integer(a[i]));
                }
                for (int i = 0; i < b.length; i++) {
                    ary.set(i, new Integer(b[i]));
                }
                sb = new StringBuilder();
                for (int i = 0; i < ary.size(); i++) {
                    sb.append(String.format("%d ", ary.get(i).intValue()));
                }
                System.out.printf("a: %s\n", sb.toString());
            }

            public void t14() {
                HashMap<String, Integer> m = new HashMap<String, Integer>();
                m.put(new String("aeiou"), new Integer(100));
                String ary[] = { "aeiou", "abcd" };
                for (int i = 0; i < ary.length; i++) {
                    if (m.containsKey(ary[i])) {
                        System.out.printf("t07: m has %s\n", ary[i]);
                    } else {
                        System.out.printf("t07: m does not have %s\n", ary[i]);
                    }
                }
                HashMap<Integer, Integer> m1 = new HashMap<Integer, Integer>();
                m1.put(new Integer(10), new Integer(100));
                Integer ary1[] = { 1, 10 };
                for (int i = 0; i < ary1.length; i++) {
                    if (m1.containsKey(ary1[i])) {
                        System.out.printf("t07: m has %d\n",
                            ary1[i].intValue());
                    } else {
                        System.out.printf("t07: m does not have %d\n",
                            ary1[i].intValue());
                    }
                }
                HashMap<String, Integer> m2 = new HashMap<String, Integer>();
                m2.put("abcd", 1234);
                m2.put("bcde", 2345);
                m2.put("cdef", 3456);
                m2.put("defg", 4567);
                m2.put("efgh", 5678);
                m2.put("fghi", 6789);
                m2.put("ghij", 7890);
                for (String key : m2.keySet()) {
                    System.out.printf("t07 m2 keySet: %s\n", key);
                }
                for (Integer val : m2.values()) {
                    System.out.printf("t07 m2 values: %d\n", val.intValue());
                }
                for (Map.Entry<String, Integer> entry : m2.entrySet()) {
                    System.out.printf("t07 m2 kv: %s/%d\n", entry.getKey(),
                        entry.getValue().intValue());
                }
                Iterator<Map.Entry<String, Integer>> it = m2.entrySet()
                    .iterator();
                while (it.hasNext()) {
                    Map.Entry<String, Integer> pair = it.next();
                    System.out.printf("t07 m2 iter pair: %s/%d\n",
                        pair.getKey(), pair.getValue().intValue());
                }
            }

            public void t16() {
                // tests out random intervals, sort left and sort right
                ArrayList<IntType1> l = new ArrayList<IntType1>();
                int sz = 10;
                int a[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    a[i] = i;
                }
                utils_.shuffle(a);
                for (int i = 0; i < sz; i++) {
                    l.add(new IntType1(a[i]));
                }
                System.out.printf("BEFORE SORT: ");
                for (int i = 0; i < sz; i++) {
                    System.out.printf("%d ", l.get(i).v());
                }
                System.out.printf("\n");
                Collections.sort(l);
                System.out.printf("AFTER  SORT: ");
                for (int i = 0; i < sz; i++) {
                    System.out.printf("%d ", l.get(i).v());
                }
                System.out.printf("\n");
            }

            public void t17() {
                int sz = 10;
                int b[] = new int[sz];
                int e[] = new int[sz];
                for (int i = 0; i < sz; i++) {
                    b[i] = i;
                    e[i] = i;
                }
                utils_.shuffle(b);
                utils_.shuffle(e);
                b[0] = 31;
                e[0] = 34;
                b[1] = 25;
                e[1] = 29;
                b[2] = 10;
                e[2] = 14;
                b[3] = 38;
                e[3] = 45;
                b[4] = 16;
                e[4] = 19;
                b[5] = 28;
                e[5] = 33;
                b[6] = 14;
                e[6] = 18;
                b[7] = 22;
                e[7] = 26;
                b[8] = 19;
                e[8] = 24;
                b[9] = 15;
                e[9] = 22;
                ArrayList<IntType2> lb = new ArrayList<IntType2>();
                ArrayList<IntType2> le = new ArrayList<IntType2>();
                for (int i = 0; i < sz; i++) {
                    lb.add(new IntType2(b[i], e[i], true));
                    le.add(new IntType2(b[i], e[i], false));
                }
                System.out.printf("BEFORE SORT: ");
                for (int i = 0; i < sz; i++) {
                    System.out.printf("(%d,%d) ", lb.get(i).b(), lb.get(i).e());
                }
                System.out.printf("\n");
                Collections.sort(lb);
                Collections.sort(le);
                System.out.printf("AFTER  SORT BY B: ");
                for (int i = 0; i < sz; i++) {
                    System.out.printf("(%d,%d) ", lb.get(i).b(), lb.get(i).e());
                }
                System.out.printf("\n");
                System.out.printf("AFTER  SORT BY E: ");
                for (int i = 0; i < sz; i++) {
                    System.out.printf("(%d,%d) ", le.get(i).b(), le.get(i).e());
                }
                System.out.printf("\n");
            }

            public void t18() { // longest increasing subsequence
                longestIncreasingSubsequence("bbaaccbacdbefd");
            }

            public void t19() { // longest common subsequence
                longestCommonSubsequence("abcaabbabaababbacba",
                    "bcaaabaabbbababbacbababa");
            }

            public void t20() {
                String sBase = "test_";
                for (int i = 0; i < 5; i++) {
                    String sName = sBase + String.valueOf(i);
                    System.out.printf("%s%n", sName);
                }
            }

            public void t21() {
                System.out.printf("generic vs casting%n");
                String s;
                java.util.List<String> l0 = new ArrayList<>();
                l0.add("hello");
                java.util.List<String> l1 = new ArrayList<String>();
                l1.add("hello");
                s = (String) l0.get(0);
                System.out.printf("casted  val:%s%n", s);
                s = l1.get(0);
                System.out.printf("generic val:%s%n", s);
            }
            public void t22() {
                int sz = 5;
                CacheLRU cache = new CacheLRU(sz);
                ArrayList<CacheObj> l = new ArrayList<CacheObj>();
                int numobj = 8;
                String s[] = new String[numobj];
                for (int i = 0; i < numobj; i++) {
                    s[i] = utils_.randString(5);
                    CacheObj o = new CacheObj();
                    o.name_ = s[i];
                    o.ts_ = 0;
                    o.v_ = utils_.randString(5);
                    l.add(o);
                    // System.out.printf("s[%2d] = %s\n", i, s[i]);
                }
                for (int i = 0; i < l.size(); i++) {
                    cache.add(l.get(i));
                }
                for (int i = 0; i < 10; i++) {
                    int iv = utils_.randInt(0, l.size() - 1);
                    System.out.printf("access %s before:  ", s[iv]);
                    cache.printInfo();
                    cache.access(s[iv], l.get(iv));
                    System.out.printf("access %s after :  ", s[iv]);
                    cache.printInfo();
                }
            }
            public void test() {
                t19();
            }
        }

        public void test() {
            MiscCasesTests t = new MiscCasesTests();
            t.test();
        }

        int ctr_;
        private Huffman huffman_;

        public MiscCases() {
            huffman_ = null;
        }
    }
    class LHM extends LinkedHashMap<String, HashMap<String, String>>{
    	static final long serialVersionUID = 1L;
    }
    class HM extends HashMap<String, String>{
    	static final long serialVersionUID = 1L;
    }
    class MimePullTests {
        Utils utils = new Utils();
        public final static String NAME = "name";
        public final static String BODY = "body";
        public final static String TYPE = "type";
        public final static String DISP = "disposition";
        public final static String IDX = "index";
        public final static String SIZE = "size";
        public final static String CRC = "crc";
        public void print(String format, Object... args) {
            System.out.printf(format, args);
        }
        public String generateMIMEParts(
            ByteArrayOutputStream baos, 
            int numParts,
            String boundary,
            LHM mmap) throws IOException {
            StringBuilder sb = new StringBuilder();
            for(Map.Entry<String, HashMap<String, String>> e: mmap.entrySet()) {
                HashMap<String, String> map = e.getValue();
                sb.append(generateMIMEBoundary(boundary, false));
                sb.append(String.format("%s: %s\n", NAME, map.get(NAME)));
                sb.append(map.get(TYPE) + "\n");
                sb.append(map.get(DISP) + "\n");
                sb.append("\n");
                sb.append(map.get(BODY));
            }
            sb.append(generateMIMEBoundary(boundary, true));
            String s = sb.toString();
            baos.write(s.getBytes());
            return s;
        }
        public void populateMIMEMapHeader(
            int numParts, 
            String namePrefix, 
            LHM mmap) {
            for(int i = 0; i < numParts; i++) {
                HashMap<String, String> map = new HashMap<>();
                int szBodyAry = 10;
                int szMinWord = 8;
                int szMaxWord = 8;
                int numCharsPerLine = 50;
                java.util.List<String> listBody = 
                    utils.randStringAry(szMinWord, szMaxWord, numCharsPerLine, szBodyAry);
                StringBuilder sb = new StringBuilder();
                for(String s: listBody) {
                    sb.append(String.format("%s\n", s));
                }
                String body = sb.toString();
                CRC32 crc = new CRC32();
                crc.update(body.getBytes());
                String name = String.format("%s_%02d.file", namePrefix, i);
                map.put(NAME, name);
                map.put(TYPE, String.format("Content-Type: text/plain"));
                map.put(DISP, String.format("Content-Disposition: attachment"));
                map.put(BODY, String.format("%s", body));
                map.put(SIZE, String.format("%d", body.length()));
                map.put(CRC,  String.format("%d", crc.getValue()));
                map.put(IDX,  String.format("%d", i));
                mmap.put(name, map);
            }
        }
        public String generateMIMEBoundary(String boundary, boolean isEnd) {
            if(isEnd) {
                return String.format("\r\n--%s--\r\n", boundary);
            }
            return String.format("\r\n--%s\r\n", boundary);
        }
        class Tests {
            public void t00() throws Exception {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int numParts = 3;
                String boundary = "test123";
                String namePrefix = "attach";
                LHM mmap = new LHM();
                populateMIMEMapHeader(numParts, namePrefix, mmap);
                String mimeString = generateMIMEParts(baos, numParts, boundary, mmap);
                assert mimeString != null;
                InputStream is = new ByteArrayInputStream(baos.toByteArray());
                MIMEMessage mimeMessage = new MIMEMessage(is, boundary);
                java.util.List<MIMEPart> listMIMEParts = mimeMessage.getAttachments();
                int szBuf = 1000;
                byte [] bytes = new byte[szBuf];
                for(MIMEPart mimePart: listMIMEParts) {
                    InputStream isMimePart = mimePart.read();
                    ByteArrayOutputStream osMimePart = new ByteArrayOutputStream();
                    int bytesRead = -1;
                    while((bytesRead = isMimePart.read(bytes, 0, szBuf)) > 0) {
                        osMimePart.write(bytes, 0, bytesRead);
                    }
                    String bodyMime = new String(osMimePart.toByteArray());
                    assert bodyMime != null;
                    java.util.List<String> listName = mimePart.getHeader(NAME);
                    assert (listName != null && listName.size() == 1);
                    String name = listName.get(0);
                    assert (name != null);
                    String bodyRef = mmap.get(name).get(BODY);
                    assert (bodyRef != null && bodyRef.equals(bodyMime));
                }
                mimeMessage.close();
                print("basic MIME pass\n");
            }
            public void t01() throws Exception {
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                int numParts = 3;
                String boundary = "test123";
                String namePrefix = "attach";
                LHM mmap = new LHM();
                populateMIMEMapHeader(numParts, namePrefix, mmap);
                String mimeString = generateMIMEParts(baos, numParts, boundary, mmap);
                assert mimeString != null;
                InputStream is = new ByteArrayInputStream(baos.toByteArray());
                MIMEMessageSubClass1 mimeMessage = new MIMEMessageSubClass1(is, boundary);
                java.util.List<MIMEPart> listMIMEParts = mimeMessage.getAttachments();
                int szBuf = 1000;
                byte [] bytes = new byte[szBuf];
                for(MIMEPart mimePart: listMIMEParts) {
                    InputStream isMimePart = mimePart.read();
                    ByteArrayOutputStream osMimePart = new ByteArrayOutputStream();
                    int bytesRead = -1;
                    while((bytesRead = isMimePart.read(bytes, 0, szBuf)) > 0) {
                        osMimePart.write(bytes, 0, bytesRead);
                    }
                    String bodyMime = new String(osMimePart.toByteArray());
                    assert bodyMime != null;
                    java.util.List<String> listName = mimePart.getHeader(NAME);
                    assert (listName != null && listName.size() == 1);
                    String name = listName.get(0);
                    assert (name != null);
                    String bodyRef = mmap.get(name).get(BODY);
                    assert (bodyRef != null && bodyRef.equals(bodyMime));
                    print("%s:\n%s\n\n", name, bodyRef);
                }
                mimeMessage.close();
                print("basic MIME Subclass pass\n");
            }
            public void test() {
                try {
                    t01();
                } catch(Exception e) {
                    e.printStackTrace();
                }
            }
        }
        public void test() {
            Tests t = new Tests();
            t.test();
        }
    }
    class TempTests {
        Utils utils_;
        public TempTests() {
            utils_ = new Utils();
        }
        class LLNode {
            LLNode n_;
            int v_;

            public LLNode(int v) {
                v_ = v;
            }

            public LLNode v(int v) {
                v_ = v;
                return this;
            }

            public int v() {
                return v_;
            }

            public LLNode n(LLNode n) {
                n_ = n;
                return this;
            }

            public LLNode n() {
                return n_;
            }
        }
        public LLNode reverse_linked_list(LLNode h) {
            if (h == null) {
                return null;
            }
            LLNode c = h;
            LLNode p = null;
            LLNode n = c.n();
            while (c != null) {
                n = c.n();
                c.n(p);
                p = c;
                c = n;
            }
            return p;
        }
        public void print_LL(LLNode h) {
            LLNode c = h;
            while (c != null) {
                System.out.printf("c: %d\n", c.v());
                c = c.n();
            }
        }
        class TempTestsTests {
            public TempTestsTests() {
            }

            public void t_linked_list() {
                LLNode h = new LLNode(0);
                LLNode c = h;
                for (int i = 1; i < 5; i++) {
                    LLNode n = new LLNode(i);
                    c.n(n);
                    c = n;
                }
                System.out.printf("print list\n");
                print_LL(h);
                System.out.printf("reverse list\n");
                c = reverse_linked_list(h);
                System.out.printf("print reverse list\n");
                print_LL(c);
            }
            public void test() {
                t_linked_list();
            }
        }
        public void test() {
            TempTestsTests t = new TempTestsTests();
            t.test();
        }
    }
    public enum EGraphType {
        CIRCLE_GRAPH, TREE_GRAPH
    }
    class PanelSimpleGraph
        extends JPanel
        implements Runnable,
        KeyListener,
        MouseMotionListener,
        MouseListener {
        class GraphCircleInfo {
            public int szCircle;
            public int r;
            public int xOff;
            public int yOff;
            public String spath;
            public boolean isDataSet;
            public HashSet<Integer> s = new HashSet<>();
            public HashMap<Integer, HashMap<Integer, Integer>> m = new HashMap<>();
            public HashMap<Integer, Pair<Integer, Integer>> mCoord = new HashMap<>();
            public HashMap<Integer, Ellipse2D.Double> mCircle = new HashMap<>();
            public HashMap<Integer, Pair<Integer, Integer>> mCircleEdge = new HashMap<>();
            public ArrayList<HashSet<Integer>> ls = new ArrayList<>();
        }

        class GraphTreeInfo {
            public int szCircle;
            public int r;
            public int xOff;
            public int yOff;
            public int maxHeight;
            public String spath;
            public boolean isDataSet;
            public int yInterval;
        }

        final static long serialVersionUID = 0;
        BufferedImage image_;
        Graphics2D g_;
        int w_;
        int h_;
        GraphCircleInfo gci_ = new GraphCircleInfo();
        GraphTreeInfo gti_ = new GraphTreeInfo();
        boolean isDebug_;
        EGraphType graphType_;

        Color idxColor_[] = {
            Color.black,
            Color.blue,
            Color.green,
            Color.magenta,
            Color.red
        };

        public PanelSimpleGraph(EGraphType graphType) {
            super();
            graphType_ = graphType;
        }

        public void keyPressed(KeyEvent e) {
        }

        public void keyTyped(KeyEvent e) {
        }

        public void keyReleased(KeyEvent e) {
        }

        public void mouseMoved(MouseEvent e) {
        }

        public void mouseDragged(MouseEvent e) {
        }

        public void mouseClicked(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void run() {
        }

        protected void setup() throws Exception {
            w_ = getSize().width;
            h_ = getSize().height;
            if (image_ == null) {
                image_ = new BufferedImage(w_, h_,
                    BufferedImage.TYPE_INT_ARGB);
            }
            if (g_ == null) {
                g_ = image_.createGraphics();
            }
        }

        public void setCircleGraphFile(String sfile) {
            gci_.spath = sfile;
        }

        public void setupCircleGraph() throws Exception {
            gci_.szCircle = 16;
            gci_.r = gci_.szCircle;
            gci_.xOff = (int) ((double) gci_.szCircle * 0.25);
            gci_.yOff = (int) ((double) gci_.szCircle * 0.75);
            gci_.isDataSet = false;
            isDebug_ = false;
            if (gci_.spath == null) {
                gci_.spath = "out/graph.txt";
            }
            setDataCircleGraph();
            setNodeCoordinatesCircleGraph();
        }

        public void setTreeGraphFile(String sfile) {
            gci_.spath = sfile;
        }

        public void setupTreeGraph() throws Exception {
            gci_.szCircle = 16;
            gci_.r = gci_.szCircle;
            gci_.xOff = (int) ((double) gci_.szCircle * 0.25);
            gci_.yOff = (int) ((double) gci_.szCircle * 0.75);
            gci_.isDataSet = false;
            isDebug_ = false;
            if (gci_.spath == null) {
                gci_.spath = "out/tree_singlelink.txt";
            }
        }

        public void setupTreeGraphCoordinates(
            BSTNode np,
            BSTNode nc,
            int level,
            int levelPosition,
            HashMap<BSTNode, Pair<Integer, Integer>> m) {

            /**
             * setuTreeGraphCoordinates
             * 
             * @param BSTNode
             *            np node parent
             * @param BSTNode
             *            nc node current
             * 
             * @param level
             *            depth of n, root is 0
             * @param levelPosition
             *            position of n in current level, possible positions
             *            are: 0:pow(2,n)-1
             * @param HashMap<BSTNode,
             *            Pair<x,y>>
             * 
             *            Traverse tree DFS, update levelPosition for each call.
             *            End result is hashmap m gets populated with the x,y
             *            coords.
             */

            if (nc == null) {
                return;
            }

            if (m.containsKey(nc) == true) {
                return;
            }

            int numInt = (int) Math.pow(2, level);
            int xSpace = w_ / numInt;
            int xSpaceMidOffset = xSpace / 2;
            int x = levelPosition * xSpace + xSpaceMidOffset;
            int y = level * gti_.yInterval + gti_.yOff;

            Pair<Integer, Integer> pair = new Pair<>(x, y);
            m.put(nc, pair);

            int levelNext = level + 1;
            int levelPositionNext = 2 * levelPosition;

            if (nc.l() != null) {
                setupTreeGraphCoordinates(
                    nc, nc.l(), levelNext, levelPositionNext + 0, m);
            }

            if (nc.r() != null) {
                setupTreeGraphCoordinates(
                    nc, nc.r(), levelNext, levelPositionNext + 1, m);
            }
        }
        public void paintComponent(Graphics g) {
            if (isDebug_) {
                System.out.println("paint");
            }
            try {
                setup();
                if (graphType_ == EGraphType.CIRCLE_GRAPH) {
                    setupCircleGraph();
                    drawNodesCircleGraph();
                    drawEdgesCircleGraph();
                } else if (graphType_ == EGraphType.TREE_GRAPH) {
                    setupTreeGraph();
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(image_, 0, 0, this);
        }
        public void drawNodesCircleGraph() {
            g_.setBackground(Color.white);
            g_.clearRect(0, 0, w_, h_);
            g_.setPaint(Color.black);
            g_.setFont(new Font("Serif", Font.PLAIN, 10));

            for (Map.Entry<Integer, Pair<Integer, Integer>> e : gci_.mCoord
                .entrySet()) {
                Integer i = e.getKey();
                Pair<Integer, Integer> p = e.getValue();

                String s = String.format("%02d", i);
                int x = p.f().intValue();
                int y = p.s().intValue();
                g_.drawString(s, x, y);

                Ellipse2D.Double cir = gci_.mCircle.get(i);
                g_.draw(cir);
            }
        }
        public void drawEdgesCircleGraph() {
            int idxColor = 0;
            for (Map.Entry<Integer, HashMap<Integer, Integer>> eSrc : gci_.m
                .entrySet()) {
                Pair<Integer, Integer> pSrc = gci_.mCircleEdge
                    .get(eSrc.getKey());
                int srcX = pSrc.f().intValue();
                int srcY = pSrc.s().intValue();

                g_.setPaint(idxColor_[idxColor]);
                idxColor = (idxColor + 1) % idxColor_.length;

                for (Map.Entry<Integer, Integer> eDst : eSrc.getValue()
                    .entrySet()) {
                    Pair<Integer, Integer> pDst = gci_.mCircleEdge
                        .get(eDst.getKey());
                    int dstX = pDst.f().intValue();
                    int dstY = pDst.s().intValue();

                    g_.drawLine(srcX, srcY, dstX, dstY);
                }
            }

        }
        public void setNodeCoordinatesCircleGraph() {
            /**
             * set up x,y coordinates of each node with radius szCircle/2. The
             * degree is 360/numNodes. Starting at 0, or 3PM, the first node's
             * coordinates are calculated. Then the next coordinate is degree T.
             * Then X = cosX and Y = sinY, and negative value is assigned
             * depending on quadrant.
             * 
             */

            if (gci_.isDataSet == false) {
                return;
            }

            int center = (w_ < h_) ? w_ : h_;
            int radius = (int) (center * 2 / 5);
            int rEdge = radius - gci_.r / 2;
            int midH = h_ / 2;

            double degree = 360.0 / gci_.s.size();
            double sumDeg = 0;

            // for each node, calculate the x,y coordinates. the +/- doesn't
            // really matter because the end result is a circle, and ordering
            // doesn't matter
            for (Integer i : gci_.s) {

                double radian = (sumDeg) * Math.PI / 180;
                double dCos = Math.cos(radian);
                double dSin = Math.sin(radian);

                // used for circle
                int x = (int) (dCos * radius) + midH;
                int y = (int) (dSin * radius) + midH;
                gci_.mCircle.put(i,
                    new Ellipse2D.Double(x, y, gci_.r, gci_.r));

                // used for string
                int xStr = x + gci_.xOff;
                int yStr = y + gci_.yOff;
                gci_.mCoord.put(i,
                    new Pair<Integer, Integer>(xStr, yStr));

                // used for edges
                int xEdge = (int) (dCos * rEdge) + midH + gci_.r / 2;
                int yEdge = (int) (dSin * rEdge) + midH + gci_.r / 2;
                gci_.mCircleEdge.put(i,
                    new Pair<Integer, Integer>(xEdge, yEdge));

                sumDeg += degree;
            }
        }
        public void setDataCircleGraph() throws Exception {
            if (gci_.isDataSet == true) {
                return;
            }
            if (gci_.spath == null) {
                return;
            }
            Path path = Paths.get(gci_.spath);
            BufferedReader r = null;
            try {
                r = Files.newBufferedReader(path);
                String s;
                while ((s = r.readLine()) != null) {
                    String sa[] = s.split(",");
                    if (sa.length != 3) {
                        throw new Exception(String.format(
                            "E: sa.length != 3 (%d)", sa.length));
                    }
                    Integer idSrc = Integer.parseInt(sa[0]);
                    Integer idDst = Integer.parseInt(sa[1]);
                    Integer weight = Integer.parseInt(sa[2]);

                    gci_.s.add(idSrc);
                    gci_.s.add(idDst);

                    if (gci_.m.containsKey(idSrc) == false) {
                        gci_.m.put(idSrc, new HashMap<>());
                    }
                    gci_.m.get(idSrc).put(idDst, weight);
                }
                gci_.isDataSet = true;
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                r.close();
            }
        }
        public void setDataTreeGraph() throws Exception {
            if (gci_.isDataSet == true) {
                return;
            }
            if (gci_.spath == null) {
                return;
            }
            Path path = Paths.get(gci_.spath);
            BufferedReader r = null;
            try {
                r = Files.newBufferedReader(path);
                String s;
                while ((s = r.readLine()) != null) {
                    String sa[] = s.split(",");
                    if (sa.length != 2) {
                        throw new Exception(String.format(
                            "E: sa.length != 2 (%d)", sa.length));
                    }
                    Integer idSrc = Integer.parseInt(sa[0]);
                    Integer idDst = Integer.parseInt(sa[1]);
                    gci_.s.add(idSrc);
                    gci_.s.add(idDst);
                }
            } catch (Exception e) {
            } finally {
                r.close();
            }
        }
    }
    class GUISingle implements Runnable {
        EGraphType graphType_;
        public GUISingle(EGraphType graphType) {
            graphType_ = graphType;
        }
        public void run() {
            JFrame frame = new JFrame();
            int x = 800;
            int y = 800;
            frame.setSize(x, y);
            PanelSimpleGraph panel = new PanelSimpleGraph(graphType_);
            Thread t = new Thread(panel);
            frame.setContentPane(panel);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            t.start();
        }
        public void start() {
        }
        public void test() {
            javax.swing.SwingUtilities.invokeLater(this);
        }
    }
}
