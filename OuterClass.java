import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;


public class OuterClass implements HelloInterface {
    private String var0String = null;
    private String var1String = null;  
    private String name = null;
    public OuterClass() {
        this("default0", "default1");
    }
    public OuterClass(String s0, String s1) {
        var0String = s0;
        var1String = s1;        
    }
    public void setName(String name) {
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
    public enum CASETYPE {
        T0, T1, T2
    }
    /*
     * Outer classes cannot be static, only inner classes can be static.
     * Inner classes static means you can instance inner class without
     * first needing to instance outer class:
     * 
     * OuterClass.StaticInnerClass sic = new OuterClass.StaticInnerClass()
     * 
     * Inner class 
     */
    public static class StaticInnerClass {
        private String var0String = null;
        private String var1String = null;
        public StaticInnerClass(String s0, String s1) {
            var0String = s0;
            var1String = s1;
        }
        public String getString(CASETYPE ct) { 
            switch(ct) {
            case T0: 
                return var0String;
            case T1: 
                return var1String;
            default:
                return null;
            }
        }
        public void setString(CASETYPE ct, String s) {
            switch(ct) {
            case T0:
                var0String = s;
                break;
            case T1:
                var1String = s;
                break;
            default:
                break;
            }
        }
        public void printInfo() {
            printInfo("var0String:   %s\n", var0String);
            printInfo("var1String:   %s\n", var1String);
        }
        public static void printInfo(String s, Object... args) {
            OuterClass.printInfo(s, args);
        }
    }
    public class InnerClass {
        private String var0String = null;
        private String var1String = null;
        public InnerClass(String s0, String s1) {
            var0String = s0;
            var1String = s1;
        }
        public String getString(CASETYPE ct) { 
            switch(ct) {
            case T0: 
                return var0String;
            case T1: 
                return var1String;
            default:
                return null;
            }
        }
        public void setString(CASETYPE ct, String s) {
            switch(ct) {
            case T0:
                var0String = s;
                break;
            case T1:
                var1String = s;
                break;
            default:
                break;
            }
        }     
        public void printInfo() {
            printInfo("var0String:   %s\n", var0String);
            printInfo("var1String:   %s\n", var1String);
        }
        // public static void printInfo cannot be declared
        public void printInfo(String s, Object... args) {
            OuterClass.printInfo(s, args);
        }
    }
    public static OuterClass outerInstance = new OuterClass("one", "two") 
    {
        //private String var0String = "one";
        //private String var1String = "two";     
    };
    public static void printInfo(String s, Object... args) {
        System.out.printf(String.format(s, args));
    }
    public void printInfo() {
        printInfo("var0String:   %s\n", var0String);
        printInfo("var1String:   %s\n", var1String);
    }
    public class Test {
        public void t01() {
            OuterClass.StaticInnerClass sic = 
                new OuterClass.StaticInnerClass("oneSIC", "twoSIC");
            sic.printInfo();
        }
        public void t02() {
            OuterClass oc = new OuterClass("oneOC", "twoOC");
            OuterClass.InnerClass ic = oc.new InnerClass("oneIC","twoIC");
            oc.printInfo();
            ic.printInfo();
        }
        public void test() {
            t01();
            t02();
        }
    }
    public void test() {
        try {
            Test t = new Test();
            t.test();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class OuterClassExtended extends OuterClass {
    private String name = null;
    public static class StaticInnerClassExtended extends OuterClass.StaticInnerClass {
        private Integer var0Integer = null;
        private Integer var1Integer = null;
        public void setInteger(CASETYPE ct, Integer i) {
            switch(ct) {
            case T0:
                var0Integer = i;
                break;
            case T1:
                var1Integer = i;
                break;
            default:
                break;
            }
        }
        public Integer getInteger(CASETYPE ct) {
            switch(ct) {
            case T0:
                return var0Integer;
            case T1:
                return var1Integer;
            default:
                return null;
            }            
        }
        @Override
        public void printInfo() {
            super.printInfo();
            //printInfo("var0String:   %s\n", var0String); // cannot access private
            //printInfo("var1String:   %s\n", var1String);
            printInfo("var0Integer:      %d\n", var0Integer);
            printInfo("var1Integer:      %d\n", var1Integer);
        }
        public StaticInnerClassExtended(String s0, String s1, Integer i0, Integer i1) {
            super(s0, s1);
            var0Integer = i0;
            var1Integer = i1;
        }
    }
    /*
     * Inherits methods t00-t02
     */
    public class TestExtended extends OuterClass.Test {
        public void t03() {
            String s0 = "sice_s0";
            String s1 = "sice_s1";
            Integer i0 = 123;
            Integer i1 = 234;
            OuterClassExtended.StaticInnerClassExtended sice = 
                new OuterClassExtended.StaticInnerClassExtended(s0, s1, i0, i1);
            sice.printInfo();
        }
        public void t04() {
            String name = "generic_name";
            OuterClassExtended oce = new OuterClassExtended();
            oce.setName(name);
            name = oce.getName();
            printInfo("t04 name is %s\n", name);
            name = oce.getSuperName();
            printInfo("t04 super name is %s\n", name);            
        }
        public void t05() {
            String name = "generic_name";
            OuterClassExtended oce = new OuterClassExtended();
            oce.setName(name);
            t05(oce);
        }
        public void t05(OuterClass oc) {
            String name = oc.getName();
            printInfo("t05 name is %s\n", name);
            //name = oc.getSuperName();
            //printInfo("t04 super name is %s\n", name);            
        }
        @Override
        public void test() {
            printInfo("==== TestExtended case 1\n");
            t01();
            printInfo("==== TestExtended case 2\n");
            t02();
            printInfo("==== TestExtended case 3\n");
            t03();
            printInfo("==== TestExtended case 4\n");
            t04();
            printInfo("==== TestExtended case 5\n");
            t05();
        }
    }
    @Override 
    public void setName(String name) {
        this.name = name;
        String newname = name + "_super";
        super.setName(newname);
    }
    /*
     * This gets the super's version of name instead of this.name
     */
    public String getSuperName() {
        return super.getName();
    }
    /*
     * If you dont override this getName then it will use super.getName() 
     * which will return super's private variable name instead of current name. 
     */
    @Override
    public String getName() {
        return name;
    }
    @Override 
    public void test() {
        TestExtended test = new TestExtended();
        test.test();
    }
}
class HelloInterfaceSuper implements HelloInterface {
    String name;
    public HelloInterfaceSuper(String name) {
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
class IOFormIIDIS implements Serializable {
    int seqId_;
    int uid_;
    double dVal_;
    double dFinal_;
    long ts_;
    int code_;
    static final long serialVersionUID = 0;

    public IOFormIIDIS() {
        set(-1, -1, 0.0, 0.0, 0, -1);
    }
    public IOFormIIDIS(int seqId, int uid, double dVal, double dFinal, long ts,
        int code) {
        set(seqId, uid, dVal, dFinal, ts, code);
    }
    public void set(int seqId, int uid, double dVal, double dFinal, long ts,
        int code) {
        seqId_ = seqId;
        uid_ = uid;
        dVal_ = dVal;
        dFinal_ = dFinal;
        ts_ = ts;
        code_ = code;
    }
    public void printInfo() {
        printInfo("");
    }
    public void printInfo(String msg) {
        if (msg == null) {
            msg = "";
        }
        System.out.printf("%s seqId:%-10d uid:%-10d val:%-10.2f amt:%-10.2f ",
            msg, seqId_, uid_, dVal_, dFinal_);
        System.out.printf("time:%-10d code:%-d\n", ts_, code_);
    }
}
class ObjectOutputStreamReset extends ObjectOutputStream {
    public ObjectOutputStreamReset(OutputStream out) throws Exception {
        super(out);
    }
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}
class IOFormIIISSS implements Serializable {
    int uid_;
    int idAccount_;
    int idPersonal_;
    String namel_;
    String namef_;
    String passwd_;
    static final long serialVersionUID = 0;
    public IOFormIIISSS() {
        set(-1, -1, -1, null, null, null);
    }
    public IOFormIIISSS(int uid, int idAccount, int idPersonal, String namel,
        String namef, String passwd) {
        set(uid, idAccount, idPersonal, namel, namef, passwd);
    }
    public void set(int uid, int idAccount, int idPersonal, String namel,
        String namef, String passwd) {

        uid_ = uid;
        idAccount_ = idAccount;
        idPersonal_ = idPersonal;
        namel_ = namel;
        namef_ = namef;
        passwd_ = passwd;
    }
    public void printInfo() {
        printInfo("");
    }
    public void printInfo(String msg) {
        if (msg == null) {
            msg = "";
        }
        System.out.printf(
            "%s uid:%-10d acnt:%-10d pid:%-10d name:%-10s,%-10s passwd:%-10s\n",
            msg, uid_, idAccount_,
            idPersonal_, namel_, namef_, passwd_);
    }
}
class SerializableString0 implements Serializable {
    public String s_;
    static final long serialVersionUID = 1123;
    public SerializableString0(String s) {
        s_ = new String(s);
    }
    public String get() {
        return s_;
    }
    public void set(String s) {
        s_ = s;
    }
}
class SerializableString1 implements Serializable {
    public String s_;
    static final long serialVersionUID = 1234;
    public SerializableString1(String s) {
        s_ = new String(s);
    }
    public String get() {
        return s_;
    }
    public void set(String s) {
        s_ = s;
    }
}
class SerializableString2 implements Serializable {
    public String s_;
    static final long serialVersionUID = 1223;
    public SerializableString2(String s) {
        s_ = new String(s);
    }
    public String get() {
        return s_;
    }
    public void set(String s) {
        s_ = s;
    }
}
class SCList implements Serializable {
    static final long serialVersionUID = 8887;
    final public String s_;
    public ArrayList<SChain> l_ = new ArrayList<>();
    public SCList(String s) {
        s_ = new String(s);
    }
    public SCList addSChain(SChain n) {
        l_.add(n);
        return this;
    }
    public ArrayList<SChain> getSChain() {
        return l_;
    }
    public void printInfo() {
        System.out.printf("SCList:  UID:%08d s:%s\n", 
            serialVersionUID, s_);
        for(SChain sc: l_) {
            System.out.printf("    id:%08d s:%s byte_val:", 
                sc.getId(), sc.getString());
            byte ba[] = sc.getString().getBytes();
            for(int i = 0; i < ba.length; i++) {
                System.out.printf("%02x ", ba[i]);
            }
            System.out.printf("%n");
        }
    }
}
class SCChain implements Serializable {
    static final long serialVersionUID = 8889;
    final public String s_;
    public SChain h_ = null;
    public SChain n_ = null;
    public SCChain(String s) {
        s_ = new String(s);
    }
    public SCChain addSChain(SChain n) {
        if(h_ == null) {
            h_ = n;
            n_ = n;
        } else {
            n_ = n_.next(n);
        }
        return this;
    }
    public SChain getSChain() {
        return h_;
    }
    public void printInfo() {
        System.out.printf("SCChain: UID:%08d s:%s\n", 
            serialVersionUID, s_);
        SChain sc = h_;
        while(sc != null) {
            System.out.printf("    id:%08d s:%s\n", 
                sc.getId(), sc.getString());  
            sc = sc.next();
        }
    }
}
class SChain implements Serializable {
    static final long serialVersionUID = 7878;
    final public String s_;
    final public Integer id_;
    public SChain n_ = null;

    public SChain(String s, Integer id) {
        s_  = new String(s);
        id_ = id;
    }
    public String getString() {
        return s_;
    }
    public Integer getId() {
        return id_;
    }
    public SChain next(SChain n) {
        n_ = n;
        return this;
    }
    public SChain next() {
        return n_;
    }
}
class IOOSimpleOuter implements Serializable {
    public int i_;
    public String s_;
    ArrayList<String> ali_;
    static final long serialVersionUID = 0;
    public IOOSimpleOuter() {
        randomize();
    }
    public void randomize(int szAry, int szStr) {
        /*
         * creates random string of szAry strings, each string szStr length
         */
        Utils u = new Utils();
        i_ = u.randInt(10, 99);
        ali_ = new ArrayList<String>();
        int szAryTmp = szAry;
        int szStrTmp = szStr;
        if (szStr == -1) {
            szStrTmp = u.randInt(5, 15);
        }
        s_ = u.randString(szStrTmp);
        if (szAry == -1) {
            szAryTmp = u.randInt(1, 8);
        }
        for (int i = 0; i < szAryTmp; i++) {
            if (szStr == -1) {
                szStrTmp = u.randInt(5, 15);
            }
            ali_.add(u.randString(szStrTmp));
        }
    }
    public void randomize() {
        randomize(5, 10);
    }
    public boolean hasPrintInfo() {
        return true;
    }
    public void printInfo() {
        printInfo(null);
    }
    public void printInfo(String msg) {
        if (msg == null) {
            System.out.printf("printInfo begin\n");
        } else {
            System.out.printf("printInfo begin %s\n", msg);
        }
        System.out.printf("    i:%d string:%s\n", i_, s_);
        for (int i = 0; i < ali_.size(); i++) {
            System.out.printf("    s:%s\n", ali_.get(i));
        }
    }
    public void printInfoCompact() {
        printInfoCompact(null);
    }
    public void printInfoCompact(String msg) {
        if (msg == null) {
            System.out.printf("i:%d, s:%s, ary:  ", i_, s_);
        } else {
            System.out.printf("%s: i:%d, s:%s, ary:  ", msg, i_, s_);
        }
        for (int i = 0; i < ali_.size(); i++) {
            System.out.printf("%s  ", ali_.get(i));
        }
        System.out.printf("\n");
    }
}
class IOOSimpleOuterPtr extends IOOSimpleOuter {
    static final long serialVersionUID = 0;
    IOOSimpleOuterPtr n_;
    public IOOSimpleOuterPtr() {
        super();
        n_ = null;
    }
    public void setNext(IOOSimpleOuterPtr n) {
        n_ = n;
    }
    public IOOSimpleOuterPtr getNext() {
        return n_;
    }
    public static IOOSimpleOuterPtr createChain(int sz) {
        if (sz < 1) {
            return null;
        }
        IOOSimpleOuterPtr h = new IOOSimpleOuterPtr();
        IOOSimpleOuterPtr c = h;
        for (int i = 0; i < sz; i++) {
            c.setNext(new IOOSimpleOuterPtr());
            c = c.getNext();
        }
        return h;
    }
    public void printChain() {
        IOOSimpleOuterPtr c = this;
        while (c != null) {
            c.printInfo();
            c = c.getNext();
        }
    }
    public void printChainCompact() {
        printChainCompact(null);
    }
    public void printChainCompact(String msg) {
        IOOSimpleOuterPtr c = this;
        while (c != null) {
            c.printInfoCompact(msg);
            c = c.getNext();
        }
    }
}
class IOOPtrChain implements Serializable {
    IOOSimpleOuterPtr l_;
    IOOSimpleOuterPtr r_;
    IOOPtrChain n_;
    static final long serialVersionUID = 0;
    public IOOPtrChain() {
        l_ = IOOSimpleOuterPtr.createChain(2);
        r_ = IOOSimpleOuterPtr.createChain(2);
    }
    public void setNext(IOOPtrChain n) {
        n_ = n;
    }
    public IOOPtrChain getNext() {
        return n_;
    }
    public static IOOPtrChain createChain(int sz) {
        IOOPtrChain h = new IOOPtrChain();
        IOOPtrChain c = h;
        for (int i = 0; i < sz; i++) {
            c.setNext(new IOOPtrChain());
            c = c.getNext();
        }
        return h;
    }
    public void printChainCompact() {
        printChainCompact(null);
    }
    public void printChainCompact(String msg) {
        IOOPtrChain c = this;
        while (c != null) {
            l_.printChainCompact("left " + msg);
            r_.printChainCompact("rght " + msg);
            c = c.getNext();
        }
    }
}
class CSerializableOuter implements Serializable {
    /*
     * an inner class is a nested class that is not declared static. 
     * serialization of inner classes (including local and anonymous)
     * is error prone. so programs must not serialize inner classes.
     * 
     * serializing inner class in non static context that has implicit
     * non transient references to enclosing class instances results
     * in serialization of its outer class instance. 
     * 
     * inner classes cannot declare static members other than compile
     * time constant fields. so inner classes also cannot use 
     * serialPersistentFields mechanism to designate serializable fields.
     * 
     * synthetic fields generated by java compilers to implement
     * inner classes are implementation dependent and varies between
     * compilers. differences in such fields can disrupt compatibility
     * and result in conflicting serialVersionUID values.
     */
    static final long serialVersionUID = 0;
    /*
     * even though the code below does compile, do not use Serializable
     * for inner class. 
     * 
     * if inner class must be serializable, then declare the inner
     * class as static
     */
    class CSerializableInner1 implements Serializable {
        static final long serialVersionUID = 1;    
    }
    static class CSerializableInner2 implements Serializable {
        static final long serialVersionUID = 2;
    }
}

class SingletonClasses {
    public class DummyClass {
        int i_;

        public int get() {
            return i_;
        }

        public void set(int i) {
            i_ = i;
        }
    }
    public static class DummyClassStatic {
        int i_;

        public int get() {
            return i_;
        }

        public void set(int i) {
            i_ = i;
        }
    }
    static class SingletonA {
        // this is thread safe
        private static SingletonA instance_;

        private SingletonA() {
        }

        int i_;

        public int get() {
            return i_;
        }

        public void set(int i) {
            i_ = i;
        }

        public static synchronized SingletonA getInstance() {
            if (instance_ == null) {
                instance_ = new SingletonA();
            }
            return instance_;
        }
    }
    static class SingletonB {
        // this is thread safe
        private static class Wrapper {
            static SingletonB instance_ = new SingletonB();
        }

        private SingletonB() {
        }

        public static SingletonB getInstance() {
            return Wrapper.instance_;
        }
    }
    static class SingletonC {
        // double checked locking thread safe
        // synchronized(SingletonC.class) ensures only one instance of
        // singleton class is created
        private static SingletonC instance_;

        private SingletonC() {
        }

        public static SingletonC getInstance() {
            if (instance_ == null) {
                synchronized (SingletonC.class) {
                    instance_ = new SingletonC();
                }
            }
            return instance_;
        }
    }
    static class SingletonD {
        // not thread safe, lazy initialization
        private static SingletonD instance_;

        private SingletonD() {
        }

        public static SingletonD getInstance() {
            if (instance_ == null) {
                instance_ = new SingletonD();
            }
            return instance_;
        }
    }
    static class SingletonE {
        // not thread safe, eager initialization
        private static SingletonE instance_ = new SingletonE();

        private SingletonE() {
        }

        public static SingletonE getInstance() {
            return instance_;
        }
    }
    static class SingletonF {
        // exception safe eager initialization, not thread safe
        private static SingletonF instance_;

        private SingletonF() {
        }

        static {
            try {
                instance_ = new SingletonF();
            } catch (Exception e) {
            }
        }

        public static SingletonF getInstance() {
            return instance_;
        }
    }
    static class SingletonG {
        // thread safe, different from SingletonE because of final,
        // and created at class load time.
        private static final SingletonG instance_ = new SingletonG();

        private SingletonG() {
        }

        public static SingletonG getInstance() {
            return instance_;
        }
    }
    class SingletonTests {
        public void t1() {
            SingletonA a = SingletonA.getInstance();
            SingletonB b = SingletonB.getInstance();
            if (a != null) {

            }
            if (b != null) {

            }
        }

        public void test() {

        }
    }
    public void test() {
    }
}
interface HelloInterface {
    public void sayHi();
    public String getName();
}
interface SingleInterface {
    public int add(int i, int j);
}
class MutableInt {
    int v_;
    public MutableInt() {
        v_ = 0;
    }
    public MutableInt(int i) {
        v_ = i;
    }
    public void incSync() {
        synchronized (this) {
            inc();
        }
    }
    public void decSync() {
        synchronized (this) {
            dec();
        }
    }
    public void inc() {
        v_++;
    }
    public void dec() {
        v_--;
    }
    public void set(int i) {
        v_ = i;
    }
    public int get() {
        return v_;
    }
}
class MutableInteger {
    // Integer is mutable, so do a wrapper
    Integer v_;
    public MutableInteger(int v) {
        v_ = new Integer(v);
    }
    public int intValue() throws Exception {
        if (v_ == null) {
            throw new Exception(
                String.format("MutableInteger null Exception thrown"));
        }
        return v_.intValue();
    }
    public void setValue(int v) {
        v_ = new Integer(v);
    }
    public int v() {
        return v_.intValue();
    }
    public void inc() {
        v_ = new Integer(v() + 1);
    }
}
