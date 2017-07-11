import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;


class Sorting {
    // quicksort partition
    // v = ary[lo]
    // while true // keep swapping
    // while ary[lo->hi] < v
    // while ary[hi->lo] > v
    // if lo >= hi, break
    // swap
    // return point where ary[hi->lo] <= original ary[lo]
    //
    public Sorting() {
    }

    private void swap(int ary[], int i, int j) {
        int tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }

    public void commentSortDuplicates() {
        /*
         * 0 1 2 3 4 5 6 7 8 9 ------------------- 8 5 8 3 4 2 4 6 8 3
         * 
         * 5 8 3 8 4 2 4 6 8 3 3 5 8 8 4
         * 
         * 0 4 5 9 0 2 3 4 5 7 8 9 0 1 2 3 4 5 6 7 8 9
         * 
         * use mergesort instead of quicksort
         */
    }

    public void commentQuicksort() {
        //
        // 0 1 2 3 4 5 6 7 8 9 k v l h i j
        // -----------------------------------
        // 3 9 7 1 8 2 5 4 0 6 3 0 9 0 9
        // 3 0 8
        // 0 9 7 1 8 2 5 4 3 6 0 8
        // 9 3 1 8
        // 0 3 7 1 8 2 5 4 9 6 1 8
        // 3 2 1 5
        // 0 2 7 1 8 3 5 4 9 6 1 5
        // 7 3 2 5
        // 0 2 3 1 8 7 5 4 9 6 2 5
        // 3 1 2 3
        // 0 2 1 3 8 7 5 4 9 6 2 3
        // 3 3 2 3
        // 0 2 1 0 0 2 0 2
        // 0 2 1 0 0
        // 0 2 1 0 0 0
        // 8 7 5 4 9 6 8 4 9 4 9
        // 8 6 4 9
        // 6 7 5 4 9 8 4 9
        // 9 8 8 9
        // 6 7 5 4 8 9 8 9
        // 8 8 8
        // 6 7 5 4 8 9 8 8 8
        // 2 1 2 1 2 1 2
        // 2 1 1 2
        // 1 2 2 2 2
        // 0 1 2 3 6 7 5 4 8 9 checkpoint
        // 6 7 5 4 6 4 7 4 7
        // 6 4 4 7
        // 4 7 5 6 4 7
        // 7 6 5 7
        // 4 6 5 7 5 7
        // 6 5 5 6
        // 4 5 6 7 5 6
        // 6 6 6
        // 4 5 6 7 6 6 6
        // 9 9 9 9 9 9
        // 0 1 2 3 4 5 6 7 8 9 checkpoint
        //
        //
    }

    public void quickSort(int ary[]) {
        quickSort_(ary, 0, ary.length - 1);
    }

    private void quickSort_(int ary[], int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int k = partition(ary, lo, hi);
        if (k != -1) {
            quickSort_(ary, lo, k - 1);
            quickSort_(ary, k + 1, hi);
        }
    }

    public int partition0(int a[], int l, int r) {
        if (l >= r) {
            return -1;
        }
        int pivot = a[r];
        int lo = l;
        int hi = r;
        int i = l;
        while (lo < hi) {
            if (a[lo] < pivot && lo < hi) {
                if (lo != i)
                    swap(a, lo, i);
                i++;
            }
            lo++;
        }
        swap(a, i, hi);
        return i;
    }

    private int partition(int ary[], int lo, int hi) {
        if (hi >= ary.length || lo > hi) {
            return -1;
        }
        int i = lo;
        int j = hi;
        int v = ary[lo];
        while (true) {
            while (ary[i] < v) {
                i++; // while ary[lo->hi] < ary[lo]
                if (i == hi) {
                    break;
                }
            }
            while (ary[j] > v) {
                j--; // while ary[hi->lo] > ary[lo]
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            swap(ary, i, j);
        }
        return j; // point where ary[j] <= v
    }

    public void mergeSort(int ary[]) {
        int aux[] = new int[ary.length];
        mergeSort_(ary, aux, 0, ary.length - 1);
    }

    private void mergeSort_(int ary[], int aux[], int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int mid = lo + (int) ((hi - lo) / 2);
        mergeSort_(ary, aux, lo, mid);
        mergeSort_(ary, aux, mid + 1, hi);
        merge(ary, aux, lo, mid, hi);
    }

    private void merge(int ary[], int aux[], int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k < hi + 1; k++) {
            aux[k] = ary[k];
        }
        for (int k = lo; k < hi + 1; k++) {
            if (i > mid) {
                ary[k] = aux[j];
                j++;
            } else if (j > hi) {
                ary[k] = aux[i];
                i++;
            } else if (aux[j] < aux[i]) {
                ary[k] = aux[j];
                j++;
            } else {
                ary[k] = aux[i];
                i++;
            }
        }
    }

    class CompareObj implements Comparable<CompareObj> {
        int a0_;
        int a1_;
        boolean isMin_;

        public CompareObj() {
            isMin_ = true;
        }

        public CompareObj a0(int a) {
            a0_ = a;
            return this;
        }

        public CompareObj a1(int a) {
            a1_ = a;
            return this;
        }

        public CompareObj isMin(boolean isMin) {
            isMin_ = isMin;
            return this;
        }

        public boolean isMin() {
            return isMin_;
        }

        public int a0() {
            return a0_;
        }

        public int a1() {
            return a1_;
        }

        public boolean hasPrintInfo() {
            return true;
        }

        public void printInfo() {
            System.out.printf("CompareObj a[0-1]=%d/%d\n", a0_, a1_);
        }

        public int compareTo(CompareObj o) {
            if (isMin_ == false) {
                if (a0() > o.a0()) {
                    return -1;
                } else if (a0() < o.a0()) {
                    return 1;
                }
            } else {
                if (a0() < o.a0()) {
                    return -1;
                } else if (a0() > o.a0()) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public void priorityQueueTest() {
        int ary[] = { 10, 19, 11, 18, 12, 17, 13, 16, 14, 15 };
        PriorityQueue<CompareObj> pq = new PriorityQueue<CompareObj>();
        for (int i = 0; i < ary.length; i++) {
            CompareObj c = new CompareObj().a0(ary[i]).a1(ary[i] * -1)
                .isMin(true);
            pq.add(c);
        }
        System.out.printf("priorityQueueTest: \n");
        while (pq.peek() != null) {
            CompareObj c = pq.poll();
            c.printInfo();
        }
        System.out.printf("priorityQueueTest with max: \n");
        for (int i = 0; i < ary.length; i++) {
            CompareObj c = new CompareObj().a0(ary[i]).a1(ary[i] * -1)
                .isMin(false);
            pq.add(c);
        }
        while (pq.peek() != null) {
            CompareObj c = pq.poll();
            c.printInfo();
        }
    }

    public void t00() {
        System.out.printf("quicksort test\n");
        int ary[] = { 10, 19, 11, 18, 12, 17, 13, 16, 14, 15 };
        System.out.printf("orig:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
        quickSort(ary);
        System.out.printf("sort:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
    }

    public void t01() {
        System.out.printf("mergesort test\n");
        int ary[] = { 10, 19, 11, 18, 12, 17, 13, 16, 14, 15 };
        System.out.printf("orig:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
        mergeSort(ary);
        System.out.printf("sort:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
    }

    public void test() {
        // priorityQueueTest();
        t00();
        t01();
    }
}



class Searching {
    public void maxSubArray(int a[]) {
        // given array a, find the contiguous subarray that has max sum
        int idxBeg = 0;
        int idxEnd = 0;
        int vMax = 0;
        int vSumCmp = 0;

        for (int i = 0; i < a.length; i++) {
            vSumCmp += a[i];
            if (a[i] > vSumCmp) {
                vSumCmp = a[i];
                if (vSumCmp >= vMax) {
                    idxBeg = i;
                    idxEnd = i;
                }
            }
            if (vSumCmp >= vMax) {
                vMax = vSumCmp;
                idxEnd = i;
            }
        }
        if (idxBeg < idxEnd) {

        }
    }

    public void knapsack(int aw[], int av[], int wMax) {
        // given array a with weight and value, find a subset that produces
        // value <= vMax, whichever is closer. This means if its weight is
        // less, then
        // more of the item can be fit in vMax.
        // There are variations:
        // - largest weight and val fit into vMax,
        // so least number of items subset
        // - smallest weight and val fit into vMax,
        // so most number of items subset
        // - least subset where val == vMax, so exact fit with least items
        // - most subset where val == vMax, so exact fit with most items

        int k[][] = new int[aw.length][wMax];
        for (int i = 0; i < aw.length; i++) {
            for (int j = 0; j < wMax; j++) {
                if (i == 0 || j == 0) {
                    k[i][j] = 0;
                } else if (aw[i - 1] <= j) {
                    int vcur = av[i - 1] + k[i - 1][j - aw[i - 1]];
                    if (vcur > k[i - 1][j]) {
                        k[i][j] = vcur;
                    } else {
                        k[i][j] = k[i - 1][j];
                    }
                } else {
                    k[i][j] = k[i - 1][j];
                }
            }
        }
    }

    public void minCoinsForValue(int numP, int numN, int numD, int numQ,
        int val) {
    }

    public void balancedPartition(int a[]) {
    }

    public int searchStringBoyerMoore(String s, String pat) {
        // boyer moore: search for pat in s
        int szS = s.length();
        int szP = pat.length();
        int a[] = new int[256];
        for (int i = 0; i < 256; i++) {
            a[i] = -1;
        }
        for (int i = 0; i < szP; i++) {
            a[pat.charAt(i)] = i;
        }
        int skip = 0;
        for (int i = 0; i <= (szS - szP); i += skip) {
            skip = 0;
            for (int j = szP - 1; j >= 0; j--) {
                System.out.printf("i:%2d j:%2d pat:%s s:%s\n", i, j,
                    pat.charAt(j), s.charAt(i + j));
                if (pat.charAt(j) != s.charAt(i + j)) {
                    skip = j - a[s.charAt(i + j)];
                    if (skip < 1) {
                        skip = 1;
                    }
                    break;
                }
            }
            if (skip == 0) {
                return i;
            }
        }
        return -1;
    }

    class CIntStr implements Comparable<CIntStr> {
        int i_;
        char c_;
        double d_;
        boolean intMode_;

        public CIntStr(char c) {
            d_ = 0.0;
            c_ = c;
            i_ = 0;
            intMode_ = true;
        }

        public CIntStr i(int i) {
            i_ = i;
            return this;
        }

        public CIntStr d(double d) {
            d_ = d;
            return this;
        }

        public CIntStr intMode(boolean isIntMode) {
            intMode_ = isIntMode;
            return this;
        }

        public char c() {
            return c_;
        }

        public int i() {
            return i_;
        }

        public double d() {
            return d_;
        }

        public boolean isIntMode() {
            return intMode_;
        }

        public int compareTo(CIntStr o) {
            if (d_ < o.d_) {
                return -1;
            } else if (d_ > o.d_) {
                return 1;
            } else if (c_ < o.c_) {
                return -1;
            } else if (c_ > o.c_) {
                return 1;
            }
            return 0;
        }
    }

    public void printNumActiveLogs(ArrayList<Pair<Integer, Integer>> li) {
        if (li == null) {
            return;
        }
        ArrayList<CIntStr> la = new ArrayList<CIntStr>();
        for (int i = 0; i < li.size(); i++) {
            la.add(new CIntStr('b').i(li.get(i).getOne().intValue()));
            la.add(new CIntStr('e').i(li.get(i).getTwo().intValue()));
        }
        Collections.sort(la);
        // or do your own sorting algorithm, maybe quicksort
        int cnt = 0;
        for (int i = 0; i < la.size(); i++) {
            if (la.get(i).c() == 'b') {
                cnt++;
            } else {
                cnt--;
            }
            System.out.printf("(%3d, %2d) ", la.get(i).i(), cnt);
        }
    }

    class SearchingTests {
        public SearchingTests() {
        }

        public void t01() {
            System.out.printf("BM search\n");
            String s = "abcdabdbcdeabcdeabca";
            String pat = "abcde";
            int res = searchStringBoyerMoore(s, pat);
            if (res != -1) {
                for (int i = 0; i < s.length(); i++) {
                    System.out.printf("%2d ", i);
                }
                System.out.printf("\n");
                for (int i = 0; i < s.length(); i++) {
                    System.out.printf("%2s ", s.charAt(i));
                }
                System.out.printf("\n");
                System.out.printf("found %s in %s at position %d\n", pat, s,
                    res);
            }
        }

        public void t02() {
            int max = 200;
            int c = 0;
            int interval = 20;
            ArrayList<Pair<Integer, Integer>> al = new ArrayList<Pair<Integer, Integer>>();
            Utils utils = new Utils();
            while (c < max) {
                int b = utils.randInt(c, c + interval);
                int e = utils.randInt(b + 1, b + 1 + interval);
                c = b;
                System.out.printf("add b:%3d e:%3d\n", b, e);
                al.add(new Pair<Integer, Integer>(b, e));
            }
            System.out.printf("printNumActiveLogs\n");
            printNumActiveLogs(al);
        }

        public void test() {
            t02();
        }
    }

    public Searching() {
    }

    public void test() {
        SearchingTests test = new SearchingTests();
        test.test();
    }
}
class Heap {
    // create ArrayList
    // insert adds to back of list, then swim up
    // pop gets from head of list, and removes back of list and inserts
    // to front of list, and sinks. return the original top of list
    // sink is not recursive. it looks left or right child and compares
    // and swaps until settled. left or right child is i*2/i*2+1
    // swim is (int)(i-1)/2
    //
    // L=i*2+1 R=i*2+2 | L=i*2 R=i*2+1
    // 0 | 1
    // 1 2 | 2 3
    // 3 4 5 6 | 4 5 6 7
    //
    //
    private ArrayList<Integer> list_;

    public Heap() {
        list_ = new ArrayList<Integer>();
    }

    public int size() {
        return list_.size();
    }

    public void printList() {
        for (int i = 0; i < list_.size(); i++) {
            System.out.printf("%d ", list_.get(i).intValue());
        }
        System.out.printf("\n");
    }

    public void insert(int v) {
        Integer vInt = new Integer(v);
        list_.add(vInt);
        int idx = list_.size() - 1;
        swim(vInt, idx);
    }

    public Integer pop() {
        if (list_.size() == 0) {
            return null;
        }
        Integer vRet = list_.get(0);
        Integer vTmp = list_.get(list_.size() - 1);
        list_.remove(list_.size() - 1);
        if (list_.size() != 0) {
            list_.set(0, vTmp);
            sink(vTmp, 0);
        }
        return vRet;
    }

    private void swap(int x, int y) {
        if (x >= list_.size() || y >= list_.size()) {
            return;
        }
        Integer tmpX = list_.get(x);
        list_.set(x, list_.get(y));
        list_.set(y, tmpX);
    }

    private void sink(Integer vInt, int idx) {
        //
        // L=i*2+1 R=i*2+2 | L=i*2 R=i*2+1
        // 0 | 1
        // 1 2 | 2 3
        // 3 4 5 6 | 4 5 6 7
        // 7 8 9 a b c d e | 8 9 a b c d e f
        //
        // L = i+1, R = i+2
        //
        // v = lesser of the left or right child
        // swap while input > v and repeat
        //
        // sink(int k) {
        // while(2*k <= N)
        // j = 2*k
        // if(j < N)
        // if(a[j] < a[j+1])
        // j++
        // if(a[k] >= a[j])
        // return
        // swap(k, j)
        // k = j
        //

        int iMax = idx + 1;
        while (iMax < list_.size()) {
            // this should be the left index
            Integer vTmpMax = list_.get(iMax);
            // this should be right index
            int iR = iMax + 1;
            // get the index of larger of the left and right values
            if ((iR) < list_.size()) {
                Integer vTmpR = list_.get(iR);
                if (vTmpMax.compareTo(vTmpR) > 0) {
                    vTmpMax = vTmpR;
                    iMax = iR;
                }
            }
            // if current value is less than max child value, stop sink
            // this <= implies that this is a min heap
            if (vInt.compareTo(vTmpMax) <= 0) {
                return;
            }
            swap(idx, iMax);
            idx = iMax;
            iMax = iMax * 2;
        }
    }

    private void swim(Integer vInt, int idx) {
        int i = (int) ((idx - 1) / 2);
        while (i >= 0) {
            Integer vTmp = list_.get(i);
            if (vInt.compareTo(vTmp) < 0) {
                swap(idx, i);
                idx = i;
                if (i == 0) {
                    break;
                }
                i = (int) ((idx - 1) / 2);
            } else {
                break;
            }
        }
    }

    public void test() {
        t00();
        t01();
        t02();
    }

    public void t00() {
        System.out.printf("Heap example\n");
        int ary[] = { 19, 20, 16, 15, 11, 18, 12, 10, 14, 13, 17 };
        System.out.printf("orig:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < ary.length; i++) {
            insert(ary[i]);
        }
        // printList();
        System.out.printf("pop: ");
        while (size() != 0) {
            System.out.printf("%d ", pop().intValue());
        }
        System.out.printf("\n");
    }

    public void t01() {
        System.out.printf("PriorityQueue example\n");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        int ary[] = { 19, 20, 16, 15, 11, 18, 12, 10, 14, 13, 17 };
        System.out.printf("orig:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < ary.length; i++) {
            pq.add(new Integer(ary[i]));
        }
        System.out.printf("pop: ");
        while (pq.size() != 0) {
            System.out.printf("%d ", pq.poll().intValue());
        }
        System.out.printf("\n");
    }

    public void t02() {
        System.out.printf("PriorityQueue max example\n");
        // the initial capacity can be any size
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10,
            Collections.reverseOrder());
        int ary[] = { 19, 20, 16, 15, 11, 18, 12, 10, 14, 13, 17 };
        System.out.printf("orig:");
        for (int i = 0; i < ary.length; i++) {
            System.out.printf("%d ", ary[i]);
        }
        System.out.printf("\n");
        for (int i = 0; i < ary.length; i++) {
            pq.add(new Integer(ary[i]));
        }
        System.out.printf("pop: ");
        while (pq.size() != 0) {
            System.out.printf("%d ", pq.poll().intValue());
        }
        System.out.printf("\n");
    }
}
/**
 * Double ended priority queue. 
 * It uses balanced BST, where min is leftmost and max is
 * rightmost. An alternative is minmax heap. Both implementations
 * done here, and a switch is used to designate which is used.
 * Pairing heap is also implemented. 
 * 
 * @author wayneng
 *
 */
class DoubleEndedPriorityQueue <E> {
	public boolean isEmpty() {
		return false;
	}
	public int size() {
		return 0;
    }
	public E getMin() {
		return null;
	}
	public E getMax() {
		return null;
	}
	public void put(E e) {
		
	}
	public E removeMin() {
		return null;
	}
	public E removeMax() {
		return null;
	}
	/**
	 * Balanced BST of DEPQ.
	 * 
	 * @author wayneng
	 *
	 */
	class DEPQ_BST {
		
	}
	/**
	 * MinMaxHeap of DEPQ.
	 * 
	 * @author wayneng
	 *
	 */
	class DEPQ_MMH {
		
	}
	/**
	 * PairingHeap of DEPQ.
	 * 
	 * @author wayneng
	 *
	 */
	class DEPQ_PAIRING {
		
	}
}

class HeapFibonacci {
	
}

class HeapBinary {
	
}

class HeapBinomial {
	
}

class HeapPairing {
	public Integer getMin() {
		return null;
	}
	public void merge(HeapPairing heap1, HeapPairing heap2) {
		
	}
	public void insert() {
		
	}
	public void deleteMin() {
		
	}
}
