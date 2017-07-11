import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

class Multithreading {
    public void comments() {

    }

    class ThreadJob implements Runnable {
        String name_;
        int lo_;
        int hi_;
        int v_;

        public ThreadJob(int id) {
            name_ = "threadjob_" + String.valueOf(id);
            lo_ = -1;
            hi_ = -1;
        }

        public ThreadJob loadRange(int lo, int hi) {
            lo_ = lo;
            hi_ = hi;
            v_ = 0;
            return this;
        }

        public int xor() {
            for (int i = lo_; i <= hi_; i++) {
                v_ ^= i;
            }
            return v_;
        }

        public void run() {
            if (lo_ == -1 || hi_ == -1) {
                return;
            }
            xor();
        }
    }

    class MTQueue {
        int szMax_;
        Object lock_;
        ReentrantLock lock2_; // java.util.concurrent.locks.*
        int h_;
        int t_;
        volatile int v_;
        int a_[];
        int i_;

        public MTQueue(int sz) {
            szMax_ = sz;
            lock_ = new Object();
            lock2_ = new ReentrantLock();
            h_ = 0;
            t_ = 0;
            v_ = 0;
            i_ = 0;
            a_ = new int[szMax_];
            for (int i = 0; i < szMax_; i++) {
                a_[i] = 0;
            }
            // Condition cond0 = lock2_.newCondition();
            // cond0.signal()/await()
        }

        public synchronized int getSz() {
            if (h_ >= t_) {
                return (h_ - t_);
            }
            return (szMax_ - t_ + h_);
        }

        public void inc0() {
            i_++;
        }

        public void dec0() {
            i_--;
        }

        public synchronized void inc1() {
            i_++;
        }

        public synchronized void dec1() {
            i_--;
        }

        public void inc2() {
            synchronized (lock_) {
                i_++;
            }
        }

        public void dec2() {
            synchronized (lock_) {
                i_--;
            }
        }

        public synchronized int geti() {
            return i_;
        }

        public void addqAry(int a[]) {
        }

        public synchronized void addqSync0(int a) {
        }

        public void addqSync1(int a) {
        }

        public void addq(int a) {
        }

        public int getq() {
            return 0;
        }

        public synchronized int getqSync0() {
            return 0;
        }
    }

    class ConsumerProducer {
        class Producer implements Runnable {
            static final int maxq_ = 5;
            private Vector<String> msg_ = new Vector<>();
            int i_ = 1;

            public void run() {
                int max = 10;
                int i = 0;
                try {
                    while (i < max) {
                        put();
                        Thread.sleep(100);
                        i++;
                    }
                } catch (InterruptedException e) {
                    System.out.printf("Producer InterruptedException\n");
                }
                System.out.printf("Producer done\n");
            }

            public synchronized void put() throws InterruptedException {
                while (msg_.size() == maxq_) {
                    System.out.printf("put size is max, waiting\n");
                    wait(); // must be in synchronized block
                }
                String v = String.format("put_%d", i_);
                System.out.printf("put %s\n", v);
                msg_.addElement(v);
                i_++;
                notify(); // must be in synchronized block
            }

            public synchronized String get() throws InterruptedException {
                notify();
                while (msg_.size() == 0) {
                    System.out.printf("get size is 0, waiting\n");
                    wait();
                }
                String msg = (String) msg_.firstElement();
                msg_.removeElement(msg);
                return msg;
            }
        }

        class Consumer implements Runnable {
            Producer producer_;

            Consumer(Producer p) {
                producer_ = p;
            }

            public void run() {
                int max = 10;
                int i = 0;
                try {
                    while (i < max) {
                        String msg = producer_.get();
                        System.out.printf("got msg:%s\n", msg);
                        Thread.sleep(1000);
                        i++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.printf("Consumer done\n");
            }
        }

        public ConsumerProducer() {
        }

        public void test() {
            Producer p = new Producer();
            Thread tp = new Thread(p);
            Consumer c = new Consumer(p);
            Thread tc = new Thread(c);
            tp.start();
            tc.start();
        }
    }

    class UnsafeCircularQueue {
        int a_[];
        int max_;
        int sz_;
        int h_;
        int t_;

        public UnsafeCircularQueue(int sz) {
            max_ = sz;
            a_ = new int[max_];
            for (int i = 0; i < max_; i++) {
                a_[i] = -1;
            }
            sz_ = 0;
            h_ = 0;
            t_ = 0;
        }

        public boolean add(int v) {
            // if(((h_+1) % max_) == t_) {
            if (h_ == t_ && sz_ != 0) {
                return false;
            }
            a_[h_] = v;
            h_ = (h_ + 1) % max_;
            sz_++;
            return true;
        }

        public int get() throws Exception {
            if (h_ == t_ && sz_ == 0) {
                throw new Exception(String
                    .format("UnsafeCircQueue get h == t == %d\n", h_));
            }
            int v = a_[t_];
            a_[t_] = -1;
            t_ = (t_ + 1) % max_;
            sz_--;
            return v;
        }

        public int peek() throws Exception {
            if (h_ == t_ && sz_ == 0) {
                throw new Exception(String
                    .format("UnsafeCircQueue peek h == t == %d\n", h_));
            }
            return a_[t_];
        }

        public int sz() {
            return sz_;
        }

        public int max() {
            return max_;
        }

        public boolean hasPrintInfo() {
            return true;
        }

        public void printInfo() {
            System.out.printf("---- UnsafeCircularQueue printInfo start: ");
            System.out.printf("max:%d, sz:%d tail:%d: ", max_, sz_, t_);
            for (int i = 0, t = t_; i < sz_; i++) {
                System.out.printf("%2d ", a_[t]);
                t++;
                if (t == max_) {
                    t = 0;
                }
            }
            System.out.printf(" ----\n");
        }
    }

    class NotifyWaitMT {
        public void comment() {
            // test consumer/producer with lock on UnsafeCircularQueue
            // where produce and consume are at unequal rates. This
            // forces either consumer to wait until not empty or
            // producer to wait until not full.
            //
            // notify wakes an arbitrary waiting thread,
            // notifyAll wakes all waiting threads unordered.
            //
            // sometimes, using only notify can cause deadlock if
            // it wakes the same type of thread arbitrarily, ie in
            // a one unit consumer/producer condition.
            // better to use notifyAll most of the time.
            //
            // notify doesn't release lock. it informs
            // waiting thread to queue up to re obtain the
            // lock. Once lock is unlocked, the thread
            // in the queue exits the wait() and continues.
            // So a lock.unlock is needed in addition to notify
        }

        UnsafeCircularQueue q_;
        int szQ_;
        ArrayList<Pair<String, Integer>> al_;
        int max_;
        ReentrantLock rlock_;
        AtomicInteger ai_;
        Utils util_;

        class Producer implements Runnable {
            int max_;
            ReentrantLock rlock_;
            AtomicInteger ai_;
            UnsafeCircularQueue q_;
            Utils util_;
            ArrayList<Pair<String, Integer>> al_;
            String name_;
            boolean dbg_;

            public Producer(String name, int max, UnsafeCircularQueue q,
                ReentrantLock rlock, AtomicInteger ai,
                Utils util) {
                name_ = name;
                max_ = max;
                q_ = q;
                rlock_ = rlock;
                ai_ = ai;
                util_ = util;
                dbg_ = false;
            }

            public void setDbg(boolean dbg) {
                dbg_ = dbg;
            }

            public void run() {
                for (int i = 0; i < max_; i++) {
                    // produce();
                    produceSync1();
                    try {
                        Thread.sleep(util_.randInt(10, 20));
                    } catch (Exception e) {
                    }
                }
            }

            public void produce() {
                // not having synchronized keyword with wait or notify
                // will raise exception.

                rlock_.lock();
                try {
                    while (q_.sz() == q_.max()) {
                        System.out.printf("%s wait enter\n", name_);
                        rlock_.wait();
                        System.out.printf("%s wait exit\n", name_);
                    }
                    Integer v = new Integer(ai_.getAndIncrement());
                    q_.add(v);
                    System.out.printf("%s produce %d\n", name_, v);
                    rlock_.notifyAll();
                } catch (Exception e) {
                    // get InterruptedException if rlock_.interrupt() used
                    System.out.printf("%s exception %s\n", name_,
                        e.getMessage());
                } finally {
                    rlock_.unlock();
                }
            }

            public void produceSync() {
                try {
                    synchronized (rlock_) {
                        while (q_.sz() == q_.max()) {
                            System.out.printf("%s wait enter\n", name_);
                            rlock_.wait();
                            System.out.printf("%s wait exit\n", name_);
                        }
                        Integer v = new Integer(ai_.getAndIncrement());
                        q_.add(v);
                        System.out.printf("%s produce %d\n", name_, v);
                        rlock_.notifyAll();
                    }
                } catch (Exception e) {
                    System.out.printf("%s exception %s\n", name_,
                        e.getMessage());
                }
            }

            public void produceSync1() {
                try {
                    synchronized (q_) {
                        while (q_.sz() == q_.max()) {
                            System.out.printf("%s wait enter\n", name_);
                            q_.wait();
                            System.out.printf("%s wait exit\n", name_);
                        }
                        Integer v = new Integer(ai_.getAndIncrement());
                        q_.add(v);
                        System.out.printf("%s produce %d\n", name_, v);
                        q_.notifyAll();
                    }
                } catch (Exception e) {
                }
            }
        }

        class Consumer implements Runnable {
            int max_;
            ReentrantLock rlock_;
            UnsafeCircularQueue q_;
            Utils util_;
            ArrayList<Pair<String, Integer>> al_;
            String name_;
            boolean dbg_;

            public Consumer(String name, int max, UnsafeCircularQueue q,
                ReentrantLock rlock,
                ArrayList<Pair<String, Integer>> al, Utils util) {
                name_ = name;
                max_ = max;
                q_ = q;
                rlock_ = rlock;
                al_ = al;
                util_ = util;
                dbg_ = false;
            }

            public void setDbg(boolean dbg) {
                dbg_ = dbg;
            }

            public void run() {
                for (int i = 0; i < max_; i++) {
                    // consume();
                    consumeSync1();
                    try {
                        Thread.sleep(util_.randInt(10, 20));
                    } catch (Exception e) {
                    }
                }
            }

            public void consume() {
                // not having synchronized keyword with wait or notify
                // will raise exception.

                rlock_.lock();
                try {
                    while (q_.sz() == 0) {
                        System.out.printf("%s wait enter\n", name_);
                        rlock_.wait(); // this thread, not rlock, waits
                        System.out.printf("%s wait exit\n", name_);
                    }
                    int vi = -1;
                    try {
                        vi = q_.get();
                    } catch (Exception e) {
                        System.out.printf("%s exception with get\n", name_);
                    }
                    Integer v = new Integer(vi);
                    System.out.printf("%s consume %d\n", name_, v);
                    al_.add(new Pair<String, Integer>(name_, v));
                    rlock_.notifyAll();
                } catch (Exception e) {
                    System.out.printf("%s exception %s\n", name_,
                        e.getMessage());
                } finally {
                    rlock_.unlock();
                }
            }

            public void consumeSync() {
                try {
                    synchronized (rlock_) {
                        while (q_.sz() == 0) {
                            System.out.printf("%s wait enter\n", name_);
                            rlock_.wait();
                            System.out.printf("%s wait exit\n", name_);
                        }
                        Integer v = new Integer(q_.get());
                        System.out.printf("%s consume %d\n", name_, v);
                        al_.add(new Pair<String, Integer>(name_, v));
                        rlock_.notifyAll();
                    }
                } catch (Exception e) {
                    System.out.printf("%s exception %s\n", name_,
                        e.getMessage());
                }
            }

            public void consumeSync1() {
                try {
                    synchronized (q_) {
                        while (q_.sz() == 0) {
                            System.out.printf("%s wait enter\n", name_);
                            q_.wait();
                            System.out.printf("%s wait exit\n", name_);
                        }
                        Integer v = new Integer(q_.get());
                        System.out.printf("%s consume %d\n", name_, v);
                        al_.add(new Pair<String, Integer>(name_, v));
                        q_.notifyAll();
                    }
                } catch (Exception e) {
                }
            }
        }

        public NotifyWaitMT(int max, int szQ) {
            reset(max, szQ);
        }

        public void reset(int max, int szQ) {
            max_ = max;
            szQ_ = szQ;
            q_ = new UnsafeCircularQueue(szQ);
            al_ = new ArrayList<Pair<String, Integer>>();
            rlock_ = new ReentrantLock();
            ai_ = new AtomicInteger();
            util_ = new Utils();
        }

        public void t00() {
            int numPro = 4;
            int numThreads = 8;

            ExecutorService exe = Executors.newFixedThreadPool(numThreads);
            Producer rp[] = new Producer[numPro];
            Consumer rc[] = new Consumer[numPro];
            int numProduced = 0;
            for (int i = 0; i < numPro; i++) {
                String name = String.format("p%02d", i);
                int max = util_.randInt(40, 80);
                numProduced += max;
                rp[i] = new Producer(name, max, q_, rlock_, ai_, util_);
                name = String.format("c%02d", i);
                rc[i] = new Consumer(name, max, q_, rlock_, al_, util_);
            }
            if (numProduced == 0) {

            }
            for (int i = 0; i < numPro; i++) {
                exe.execute(rp[i]);
                exe.execute(rc[i]);
            }
            exe.shutdown();
            try {
                exe.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (Exception e) {
            }
            System.out.printf("threadpool await done\n");
            Pair<String, Integer> p;
            System.out.printf("expecting %d vals consumed\n", ai_.get());

            // run once for sanity, and if fail, print out everything
            boolean isPass = true;
            for (int i = 0; i < al_.size(); i++) {
                p = al_.get(i);
                if (p.getTwo() != i) {
                    isPass = false;
                    break;
                }
            }
            if (!isPass) {
                System.out.printf("ERROR in SEQUENCE\n");
                for (int i = 0; i < al_.size(); i++) {
                    p = al_.get(i);
                    System.out.printf("i:%3d thread:%10s val:%d\n", i,
                        p.getOne(), p.getTwo());
                }
            } else {
                System.out.printf("test passed\n");
            }
            System.out.printf("test done\n");
        }

        public void test() {
            t00();
        }
    }

    class ConsumerProducerLockMT {
        // test consumer/producer with lock on UnsafeCircularQueue
        // this model usage should really be using notify/wait, not
        // locks
        //
        // ReentrantLock has tryLock which acquires only if available
        // at time of invocation, vs lock, which waits and acquires.
        // So if you use only lock, that is the same as doing it
        // with synchronized
        //
        UnsafeCircularQueue q_;
        ArrayList<Pair<String, Integer>> al_;
        int max_;
        MutableInt mi_;
        ReentrantLock rlock_;
        AtomicInteger ai_;
        Utils util_;

        class CPLProducer implements Runnable {
            int max_;
            MutableInt mi_;
            ReentrantLock rlock_;
            AtomicInteger ai_;
            UnsafeCircularQueue q_;
            Utils util_;
            ArrayList<Pair<String, Integer>> al_;
            String name_;

            public CPLProducer(String name, int max, UnsafeCircularQueue q,
                MutableInt mi, ReentrantLock rlock,
                AtomicInteger ai, ArrayList<Pair<String, Integer>> al,
                Utils util) {
                name_ = name;
                max_ = max;
                q_ = q;
                mi_ = mi;
                rlock_ = rlock;
                ai_ = ai;
                al_ = al;
                util_ = util;
            }

            public void run() {
                int i = 0;
                for (; i < max_;) {
                    if (produce()) {
                        i++;
                    }
                    try {
                        Thread.sleep(util_.randInt(10, 20));
                    } catch (Exception e) {
                    }
                }
                System.out.printf("%s produced %d of %d\n", name_, i, max_);
            }

            public boolean produce() {
                rlock_.lock();
                boolean retVal = true;
                try {
                    Integer v = new Integer(mi_.get());
                    if (q_.add(v)) {
                        mi_.inc();
                        ai_.getAndIncrement();
                    } else {
                        retVal = false;
                    }
                } catch (Exception e) {
                    retVal = false;
                } finally {
                    rlock_.unlock();
                }
                return retVal;
            }
        }

        class CPLConsumer implements Runnable {
            int max_;
            MutableInt mi_;
            ReentrantLock rlock_;
            AtomicInteger ai_;
            UnsafeCircularQueue q_;
            Utils util_;
            ArrayList<Pair<String, Integer>> al_;
            String name_;

            public CPLConsumer(String name, int max, UnsafeCircularQueue q,
                MutableInt mi, ReentrantLock rlock,
                AtomicInteger ai, ArrayList<Pair<String, Integer>> al,
                Utils util) {
                name_ = name;
                max_ = max;
                q_ = q;
                mi_ = mi;
                rlock_ = rlock;
                ai_ = ai;
                al_ = al;
                util_ = util;
            }

            public void run() {
                int i = 0;
                int ctr = 0;
                for (; i < max_ && ctr < max_;) {
                    if (consume()) {
                        i++;
                    } else {
                        ctr++;
                    }
                    try {
                        Thread.sleep(util_.randInt(10, 20));
                    } catch (Exception e) {
                    }
                }
                if (i != max_) {
                    System.out.printf("ERROR: %s consumed %d of %d\n",
                        name_, i, max_);
                } else {
                    System.out.printf("%s consumed %d of %d\n", name_, i,
                        max_);
                }
            }

            public boolean consume() {
                rlock_.lock();
                boolean retVal = true;
                try {
                    int v = q_.get();
                    al_.add(
                        new Pair<String, Integer>(name_, new Integer(v)));
                } catch (Exception e) {
                    retVal = false;
                } finally {
                    rlock_.unlock();
                }
                return retVal;
            }
        }

        public ConsumerProducerLockMT(int max) {
            reset(max);
        }

        public void reset(int max) {
            max_ = max;
            q_ = new UnsafeCircularQueue(max_);
            al_ = new ArrayList<Pair<String, Integer>>();
            mi_ = new MutableInt(0);
            rlock_ = new ReentrantLock();
            ai_ = new AtomicInteger();
            util_ = new Utils();
        }

        public void t00() {
            int numPro = 4;
            int numThreads = 8;

            ExecutorService exe = Executors.newFixedThreadPool(numThreads);
            CPLProducer rp[] = new CPLProducer[numPro];
            CPLConsumer rc[] = new CPLConsumer[numPro];
            int numProduced = 0;
            for (int i = 0; i < numPro; i++) {
                String name = String.format("p%02d", i);
                int max = util_.randInt(400, 800);
                numProduced += max;
                rp[i] = new CPLProducer(name, max, q_, mi_, rlock_, ai_,
                    al_, util_);
                name = String.format("c%02d", i);
                rc[i] = new CPLConsumer(name, max, q_, mi_, rlock_, ai_,
                    al_, util_);
            }
            if (numProduced > 0) {

            }
            for (int i = 0; i < numPro; i++) {
                exe.execute(rp[i]);
                exe.execute(rc[i]);
            }
            System.out.print("threadpool shutdown\n");
            exe.shutdown();
            try {
                exe.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
            } catch (Exception e) {
            }
            System.out.printf("threadpool await done\n");
            Pair<String, Integer> p;
            System.out.printf("expecting %d vals consumed\n",
                (mi_.get() - 1));

            // run once for sanity, and if fail, print out everything
            boolean isPass = true;
            for (int i = 0; i < al_.size(); i++) {
                p = al_.get(i);
                if (p.getTwo() != i) {
                    isPass = false;
                    break;
                }
            }
            if (!isPass) {
                System.out.printf("ERROR in SEQUENCE\n");
                for (int i = 0; i < al_.size(); i++) {
                    p = al_.get(i);
                    System.out.printf("i:%3d thread:%10s val:%d\n", i,
                        p.getOne(), p.getTwo());
                }
            }
            System.out.printf("test done\n");
        }

        public void test() {
            t00();
        }
    }

    class NotifyWaitExamples {
        class NotifyWaitSync extends Thread {
            int total_;
            Random rand_;
            int case_;

            public NotifyWaitSync(int caseNum) {
                total_ = 0;
                rand_ = new Random();
                case_ = caseNum;
            }

            public synchronized int getTotal() {
                return total_;
            }

            public void testSynced() {
                synchronized (this) {
                    for (int i = 0; i < 100; i++) {
                        total_ += i;
                        try {
                            sleep(rand_.nextInt(20));
                        } catch (Exception e) {
                        }
                    }
                    notify();
                }
            }

            public void testNotSynced() {
                for (int i = 0; i < 100; i++) {
                    total_ += i;
                    try {
                        sleep(rand_.nextInt(20));
                    } catch (Exception e) {
                    }
                }
            }

            public void run() {
                if (case_ == 0) {
                    testSynced();
                } else if (case_ == 1) {
                    testNotSynced();
                }
            }
        }

        public NotifyWaitExamples() {
        }

        public void test() {
            t00();
            t01();
            t02();
        }

        public void t00() {
            NotifyWaitSync t = new NotifyWaitSync(0);
            t.start();
            synchronized (t) {
                try {
                    t.wait();
                } catch (Exception e) {
                }
                System.out.printf("total synced is:%d\n", t.getTotal());
            }
        }

        public void t01() {
            NotifyWaitSync t = new NotifyWaitSync(1);
            t.start();
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            System.out.printf("total unsynced is:%d\n", t.getTotal());
        }

        public void t02() {
            NotifyWaitSync t = new NotifyWaitSync(1);
            t.start();
            System.out.printf("total unsynced is:%d\n", t.getTotal());
        }
    }

    class MTQThread extends Thread {
        int sz_;
        MTQueue mtq_;
        String name_;
        Random rand_;
        boolean dbg_;

        public MTQThread(int id, int sz, MTQueue q) {
            sz_ = sz;
            mtq_ = q;
            name_ = "thread_" + String.valueOf(id);
            rand_ = new Random();
            dbg_ = false;
        }

        public void setDbg(boolean dbg) {
            dbg_ = dbg;
        }

        public void tc0() throws Exception {
            for (int i = 0; i < sz_; i++) {
                mtq_.inc0();
                sleep(rand_.nextInt(10));
                mtq_.dec0();
                sleep(rand_.nextInt(10));
                if (dbg_) {
                    System.out.printf("mtqthread %8s v:%d\n", name_,
                        mtq_.geti());
                }
                sleep(rand_.nextInt(10));
            }
            System.out.printf("mtq tc0 %8s v:%d\n", name_, mtq_.geti());
        }

        public void tc1() throws Exception {
            for (int i = 0; i < sz_; i++) {
                mtq_.inc1();
                sleep(rand_.nextInt(10));
                mtq_.dec1();
                sleep(rand_.nextInt(10));
                if (dbg_) {
                    System.out.printf("mtqthread %8s v:%d\n", name_,
                        mtq_.geti());
                }
                sleep(rand_.nextInt(10));
            }
            System.out.printf("mtq tc1 %8s v:%d\n", name_, mtq_.geti());
        }

        public void tc2() throws Exception {
            for (int i = 0; i < sz_; i++) {
                mtq_.inc2();
                sleep(rand_.nextInt(10));
                mtq_.dec2();
                sleep(rand_.nextInt(10));
                if (dbg_) {
                    System.out.printf("mtqthread %8s v:%d\n", name_,
                        mtq_.geti());
                }
                sleep(rand_.nextInt(100));
            }
            System.out.printf("mtq tc2 %8s v:%d\n", name_, mtq_.geti());
        }

        public void run() {
            try {
                // tc0();
                tc1();
                tc2();
            } catch (Exception e) {
            }
        }
    }

    class MultithreadingTests {
        public MultithreadingTests() {
        }

        public void t00() {
            int numThr = 10;
            int szInc = 20;
            MTQueue mtq = new MTQueue(szInc);
            MTQThread qt[] = new MTQThread[numThr];
            for (int i = 0; i < numThr; i++) {
                qt[i] = new MTQThread(i, szInc, mtq);
            }
            for (int i = 0; i < numThr; i++) {
                qt[i].start();
            }
        }

        public void t01() {
            NotifyWaitExamples t = new NotifyWaitExamples();
            t.test();
        }

        public void test() {
            t01();
        }
    }

    class MTTest1 {
        class MTCalculate implements Runnable {
            // this just adds 1+2+3+...+x with random sleep
            int v_;
            int max_;
            boolean isDone_;
            Utils util_;
            String name_;

            public MTCalculate(String name, int v) {
                name_ = name;
                max_ = v;
                v_ = 0;
                isDone_ = false;
                util_ = new Utils();
            }

            public void run() {
                for (int i = 0; i < max_; i++) {
                    v_ += i;
                    // System.out.printf("%10s:%d\n", name_, i);
                    try {
                        Thread.sleep(util_.randInt(10, 500));
                    } catch (InterruptedException e) {
                    }
                }
                isDone_ = true;
                System.out.printf("%10s:done\n", name_);
            }

            public boolean getDone() {
                return isDone_;
            }

            public int getVal() {
                return v_;
            }

            public String getName() {
                return name_;
            }
        }

        class MTNotifyWait implements Runnable {
            public void run() {
            }
        }

        class MTSync implements Runnable {
            String name_;
            MutableInt mi_;
            AtomicInteger ai_;
            boolean isConsumer_;
            int max_;
            boolean isSynchronized_;
            Utils util_;

            public MTSync(boolean isConsumer, MutableInt mi,
                AtomicInteger ai, String name, int max,
                boolean isSynchronized) {
                isConsumer_ = isConsumer;
                mi_ = mi;
                ai_ = ai;
                name_ = name;
                max_ = max;
                isSynchronized_ = isSynchronized;
                util_ = new Utils();
            }

            public void run() {
                if (ai_ == null) {
                    runMI();
                } else {
                    runAI();
                }
            }

            public void runAI() {
                for (int i = 0; i < max_; i++) {
                    if (isConsumer_) {
                        ai_.getAndDecrement();
                    } else {
                        ai_.getAndIncrement();
                    }
                    try {
                        Thread.sleep(util_.randInt(10, 20));
                    } catch (InterruptedException e) {
                    }
                }
            }

            public void runMI() {
                for (int i = 0; i < max_; i++) {
                    if (isConsumer_) {
                        dec();
                    } else {
                        inc();
                    }
                    try {
                        Thread.sleep(util_.randInt(10, 20));
                    } catch (InterruptedException e) {
                    }
                }
            }

            public void inc() {
                if (isSynchronized_) {
                    mi_.incSync();
                } else {
                    mi_.inc();
                }
            }

            public void dec() {
                if (isSynchronized_) {
                    mi_.decSync();
                } else {
                    mi_.dec();
                }
            }

            public boolean hasPrintInfo() {
                return true;
            }

            public void printInfo() {
                if (ai_ == null) {
                    System.out.printf(
                        "%10s: isConsumer:%10s isSync:%10s valMI:%d\n",
                        name_, isConsumer_,
                        isSynchronized_, mi_.get());
                } else {
                    System.out.printf(
                        "%10s: isConsumer:%10s isSync:%10s valAI:%d\n",
                        name_, isConsumer_,
                        isSynchronized_, ai_.get());
                }
            }
        }

        public MTTest1() {
        }

        public void t01() {
            System.out.printf("test multi thread join\n");
            int numCores = Runtime.getRuntime().availableProcessors();
            int numThreads = numCores * 4;
            Utils util = new Utils();
            Thread t[] = new Thread[numThreads];
            MTCalculate r[] = new MTCalculate[numThreads];
            for (int i = 0; i < numThreads; i++) {
                String name = String.format("t%02d", i);
                int max = util.randInt(10, 20);
                r[i] = new MTCalculate(name, max);
                t[i] = new Thread(r[i]);
            }
            for (int i = 0; i < numThreads; i++) {
                t[i].start();
            }
            try {
                System.out.printf("t01 join start\n");
                for (int i = 0; i < numThreads; i++) {
                    t[i].join();
                }
                System.out.printf("t01 join done\n");
            } catch (InterruptedException e) {
            }
            for (int i = 0; i < numThreads; i++) {
                System.out.printf("%10s: v=%d\n", r[i].getName(),
                    r[i].getVal());
            }
        }

        public void t00() {
            System.out.printf("test ExecutorService threadPool\n");
            int numCores = Runtime.getRuntime().availableProcessors();
            int numThreads = numCores * 4;
            Utils util = new Utils();
            ExecutorService threadPool = Executors
                .newFixedThreadPool(numThreads);
            MTCalculate r[] = new MTCalculate[numThreads];
            for (int i = 0; i < numThreads; i++) {
                String name = String.format("t%02d", i);
                int max = util.randInt(30, 50);
                r[i] = new MTCalculate(name, max);
                threadPool.execute(r[i]);
            }
            System.out.printf("t00 calling ExecutorService shutdown\n");
            threadPool.shutdown(); // refuse new tasks and run remaining
            try {
                System.out.printf("t00 calling ExecutorService await\n");
                threadPool.awaitTermination(Long.MAX_VALUE,
                    TimeUnit.NANOSECONDS);
            } catch (Exception e) {
                System.out.printf("t00 exception with awaitTermination\n");
            }
            System.out.printf("t00 await done\n");
            for (int i = 0; i < numThreads; i++) {
                System.out.printf("%10s: done:%10s v=%d\n", r[i].getName(),
                    r[i].getDone(), r[i].getVal());
            }
        }

        public void t02(boolean isSync, boolean isAtomic) {
            MutableInt mi = new MutableInt();
            AtomicInteger ai = new AtomicInteger();
            System.out.printf(
                "t02 producer consumer isSync:%s isAtomic:%s\n", isSync,
                isAtomic);
            int numCores = Runtime.getRuntime().availableProcessors();
            int numThreads = numCores * 4;
            int numCP = numCores * 2;
            Utils util = new Utils();
            ExecutorService threadPool = Executors
                .newFixedThreadPool(numThreads);
            MTSync r[] = new MTSync[numThreads];
            for (int i = 0; i < numCP; i++) {
                String name;
                int max = util.randInt(100, 200);
                name = String.format("tconsumer%02d", i);
                if (!isAtomic) {
                    r[i] = new MTSync(true, mi, null, name, max, isSync);
                } else {
                    r[i] = new MTSync(true, mi, ai, name, max, isSync);
                }
                name = String.format("tproducer%02d", i);
                if (!isAtomic) {
                    r[numCP + i] = new MTSync(false, mi, null, name, max,
                        isSync);
                } else {
                    r[numCP + i] = new MTSync(false, mi, ai, name, max,
                        isSync);
                }
            }
            System.out.printf("t02 threadpool exe %d threads\n",
                numThreads);
            for (int i = 0; i < numThreads; i++) {
                threadPool.execute(r[i]);
            }
            System.out.printf("t02 threadpool shutdown\n");
            threadPool.shutdown();
            try {
                System.out.printf("t02 threadpool await\n");
                threadPool.awaitTermination(Long.MAX_VALUE,
                    TimeUnit.NANOSECONDS);
            } catch (Exception e) {
                System.out.printf("t02 exception with awaitTermination\n");
            }
            System.out.printf("t02 await done\n");
            if (!isAtomic) {
                System.out.printf("t02 final MI val:%d\n", mi.get());
            } else {
                System.out.printf("t02 final AI val:%d\n", ai.get());
            }
        }

        public void t03() {
            t02(false, false);
            t02(true, false);
            t02(true, true);
        }

        public void test() {
            t03();
        }
    }

    class FutureCallableTest {
        public FutureCallableTest() {
        }

        class FactorialCall implements Callable<Long> {
            int n_;
            Utils util_;

            public FactorialCall(int n) {
                n_ = n;
                util_ = new Utils();
            }

            public Long call() throws Exception {
                return factorial(n_);
            }

            public long factorial(int n) throws InterruptedException {
                long result = 1;
                while (n != 0) {
                    result *= n;
                    n--;
                    Thread.sleep(util_.randInt(10, 50));
                }
                return result;
            }
        }

        public void t00() {
            System.out.printf("test callable and future\n");
            ExecutorService es = Executors.newFixedThreadPool(4);
            java.util.List<Callable<Long>> l = new ArrayList<Callable<Long>>();
            l.add(new FactorialCall(10));
            l.add(new FactorialCall(12));
            l.add(new FactorialCall(14));
            l.add(new FactorialCall(16));
            try {
                java.util.List<Future<Long>> lfuture = es.invokeAll(l); // blocking
                for (int i = 0; i < lfuture.size(); i++) {
                    try {
                        System.out.printf("factorial i:%d = %d\n", i,
                            lfuture.get(i).get());
                    } catch (Exception e) {
                        System.out.printf("factorial i:%d exception\n", i);
                        e.printStackTrace();
                    }
                }
                es.shutdown();
                es.awaitTermination(20, TimeUnit.SECONDS);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.printf("done test\n");
        }

        public void test() {
            t00();
        }
    }

    class ProducerConsumerExample {
        //
        //
        //
        class Drop {
            private String msg_;
            private boolean empty_ = true;

            public synchronized String take() {
                while (empty_) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                empty_ = true;
                notifyAll();
                return msg_;
            }

            public synchronized void put(String msg) {
                while (!empty_) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                    }
                }
                empty_ = false;
                msg_ = msg;
                notifyAll();
            }
        }

        class Producer implements Runnable {
            private Drop drop_;

            public Producer(Drop drop) {
                drop_ = drop;
            }

            public void run() {
                String importantInfo[] = { "mare eats oats",
                    "does eat oats", "little lamb eat ivy",
                    "a kid will eat ivy too" };
                Random random = new Random();
                for (int i = 0; i < importantInfo.length; i++) {
                    drop_.put(importantInfo[i]);
                    try {
                        Thread.sleep(random.nextInt(5000));
                    } catch (InterruptedException e) {
                    }
                }
                drop_.put("DONE");
            }
        }

        class Consumer implements Runnable {
            private Drop drop_;

            public Consumer(Drop drop) {
                drop_ = drop;
            }

            public void run() {
                Random random = new Random();
                for (String msg = drop_.take(); !msg
                    .equals("DONE"); msg = drop_.take()) {
                    System.out.printf("MSG RCV: %s\n", msg);
                    try {
                        Thread.sleep(random.nextInt(5000));
                    } catch (InterruptedException e) {
                    }
                }
                System.out.printf("DONE\n");
            }
        }

        public ProducerConsumerExample() {
            Drop drop = new Drop();
            (new Thread(new Producer(drop))).start();
            (new Thread(new Consumer(drop))).start();
        }
    }

    class NonBlockingAtomicExample {
        // nonblocking is concurrent that derive thread safety not
        // from locks, but from low level atomic hardware primitives
        // such as compare and swap, volatile. They are difficult
        // to design and implement but have much better throughput.
        //
        //
        //
        private long v0_ = 0;

        public synchronized long getV0() {
            return v0_;
        }

        public synchronized long incV0() {
            return ++v0_;
        }

        private AtomicLong v1_;

        public long getV1() {
            return v1_.get();
        }

        public long incV1() {
            long v;
            do {
                v = v1_.get();
            } while (!v1_.compareAndSet(v, v + 1));
            return v + 1;
        }
    }

    class DeadlockFriend {
        String name_;

        public DeadlockFriend(String name) {
            name_ = name;
        }

        public String getName() {
            return name_;
        }

        public synchronized void bow(DeadlockFriend bower) {
            System.out.printf("%s: %s has bowed to me\n", name_,
                bower.getName());
            bower.bowBack(this);
        }

        public synchronized void bowBack(DeadlockFriend bower) {
            System.out.printf("%s: %s has bowed back to me\n", name_,
                bower.getName());
        }
    }

    class MTTests {
        public MTTests() {
        }

        public void t00() {
            MultithreadingTests tests = new MultithreadingTests();
            tests.test();
        }

        public void t01() {
            System.out.printf("ConsumerProducer test\n");
            ConsumerProducer cp = new ConsumerProducer();
            cp.test();
        }

        public void t02() {
            System.out.printf("Number of cores:%d\n",
                Runtime.getRuntime().availableProcessors());
        }

        public void t03() {
            MTTest1 t = new MTTest1();
            t.test();
        }

        public void t04() {
            System.out.printf("UnsafeCircularQueue basic test\n");
            int sz = 5;
            int max = 20;
            UnsafeCircularQueue q = new UnsafeCircularQueue(sz);
            ArrayList<Integer> al = new ArrayList<Integer>();
            for (int i = 0; i < max; i++) {
                if (!q.add(i)) {
                    try {
                        int v = q.get();
                        al.add(new Integer(v));
                        q.printInfo();
                        q.add(i);
                        q.printInfo();
                    } catch (Exception e) {
                        System.out.printf("exception q.get\n");
                    }
                } else {
                    q.printInfo();
                }
            }
            try {
                while (q.sz() != 0) {
                    int v = q.get();
                    al.add(new Integer(v));
                    q.printInfo();
                }
            } catch (Exception e) {
                System.out.printf("exception q.get at end\n");
            }
            System.out.printf("UnsafeCircularQueue test end\n");
        }

        public void t05() {
            ConsumerProducerLockMT t = new ConsumerProducerLockMT(5);
            t.test();
        }

        public void t06() {
            NotifyWaitMT t = new NotifyWaitMT(100, 1);
            t.test();
        }

        public void t07() {
            FutureCallableTest t = new FutureCallableTest();
            t.test();
        }

        public void t08() {
            // declared final because f0/f1 accessed from within inner class
            // of thread
            final DeadlockFriend f0 = new DeadlockFriend("A");
            final DeadlockFriend f1 = new DeadlockFriend("B");
            new Thread(new Runnable() {
                public void run() {
                    f0.bow(f1);
                }
            }).start();
            new Thread(new Runnable() {
                public void run() {
                    f1.bow(f0);
                }
            }).start();

        }

        public void t09() {
            ProducerConsumerExample c = new ProducerConsumerExample();
            if (c != null) {
            }
        }

        public void t10() {
        }

        public void t11() {
        }

        public void t12() {
        }

        public void test() {
            // t02();
            // t01();
            // t03();
            // t04();
            // t05();
            // t06();
            t07();
        }
    }

    public Multithreading() {
    }

    public void test() {
        MTTests t = new MTTests();
        t.test();
    }
}