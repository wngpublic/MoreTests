
//-----------------------------------------------------------------------------
//-----------------------------------------------------------------------------
import java.io.*;
import java.util.*;
import java.util.zip.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.util.concurrent.locks.*;
import java.sql.*;
import java.net.*;
import java.nio.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.nio.channels.spi.*;
import java.nio.charset.Charset;
import java.lang.reflect.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.jvnet.mimepull.*;
import java.lang.*;
import java.util.regex.*;
import java.lang.annotation.*;
import javax.annotation.*;


public class TestSingle extends TestClasses {

    public void test(String[] args) {
        try {
            long startTime = System.currentTimeMillis();

            test_invoke(args);

            long endTime = System.currentTimeMillis();
            long diff = endTime - startTime;
            System.out.printf("\nelapsed time:%d ms\n", diff);
        } catch (Exception e) {
            System.out.println("test error: stack trace is following:\n");
            System.err.println(e.getMessage());
        }
    }
    public void test_invoke(String[] args) {
        // use reflection to get the method name based on input int idx
        Object o = new TestCases();
        int idx = 0;
        try {
            idx = Integer.parseInt(args[0]);
        } catch (Exception e) {
        }

        Method m = null;
        String methodName = String.format("t%02d", idx);
        boolean hasArg = false;

        // try getting method either as null or with String[]
        try {
            m = o.getClass().getMethod(methodName);
        } catch (Exception e) {
            try {
                m = o.getClass().getMethod(methodName, String[].class);
                hasArg = true;
            } catch (Exception e2) {
            }
        }

        boolean res = m != null;
        assert res : String.format("method %s not found", methodName);
        try {
            if (hasArg == true) {
                int szArg = args.length;
                if (szArg != 0) {
                    szArg--;
                }
                String sArgs[] = new String[szArg];
                for (int i = 0; i < args.length; i++) {
                    sArgs[i] = args[i + 1];
                }
                Object oArgs = sArgs;
                m.invoke(o, oArgs);
            } else {
                m.invoke(o);
            }
        } catch (Exception e) {
            System.out.printf("error test_invoke on method %s%n", methodName);
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        TestSingle t = new TestSingle();
        t.test(args);
    }
    class TestCases {
        public TestCases() {
        }
        public void t00() { // innerclasstesting
            java.util.List<String> l = new ArrayList<>();
            l.add("listTests");
            l.add("Heap");
            l.add("HashMapSortTest2");
            l.add("HashMapSortTest");
            l.add("BST");
            l.add("InnerClassTesting");
            l.add("GraphAlgorithms");
            l.add("Sorting");
            l.add("BuilderPatternTest");
            l.add("Utils");
            l.add("Tries");
            l.add("MiscCases");
            l.add("Searching");
            l.add("AVL");
            l.add("TempTests");
            l.add("MathClass");
            l.add("GUISingle");
            l.add("Reflection");
            l.add("GraphClass");
            l.add("GraphClassOld");
            l.add("ListTests");
            l.add("Multithreading");
            l.add("BTreeTest");
            l.add("DayNum");
            l.add("Syntaxes");
            l.add("IOTests");
            l.add("Networking");
            l.add("NIOTests");
            l.add("NetworkingNIO");
            l.add("Networking server");
            l.add("Networking client");
            l.add("Networking multiServer");
            l.add("IOPtrChain");
            l.add("Networking");
            l.add("CObserverPattern");
            l.add("Makefile");
            l.add("ExecutorExamples");
            l.add("RegexClass");
            l.add("Syntaxes");
            l.add("IOTests no args");
            l.add("IOTests");
            l.add("Networking");
            l.add("NIOTests");
            l.add("NetworkingNIO");
            l.add("Networking client");
            l.add("Networking server");
            l.add("IOOPtrChain");
            l.add("Networking");
            l.add("CObserverPattern");
            l.add("Makefile");
            l.add("ExecutorExample");
            l.add("RegexClass");
            l.add("Syntaxes");
            l.add("StringAlgorithms");
            l.add("Generics");
            l.add("AnonymousClassesTest");
            l.add("LambdaTest");
            l.add("CompletableFuturesTest");
            l.add("TestCongestedCtr");
            l.add("");
            l.add("");
            for (int i = 0; i < l.size(); i++) {
                System.out.printf("i:%02d %s%n", i, l.get(i));
            }
        }
        public void t01() { // heap
            Heap heap = new Heap();
            heap.test();
        }
        public void t02() { // hashmapsort
            HashMapSortTest2 t = new HashMapSortTest2(1);
            t.test();
        }
        public void t03() { // hashmapsort
            MapTest t = new MapTest(1);
            t.test();
        }
        public void t04() { // bst
            BST test = new BST();
            test.test();
        }
        public void t05() {
            InnerClassTesting a = new InnerClassTesting();
            a.test();
        }
        public void t06() { // graphalgorithms
            GraphAlgorithms gc = new GraphAlgorithms();
            gc.test();
        }
        public void t07() { // sorting
            Sorting t = new Sorting();
            t.test();
        }
        public void t08() { // BuilderPatternTest
            BuilderPatternTest t0 = (new BuilderPatternTest()).a(10).b(20).c(30)
                .d("hello world");
            BuilderPatternTest t1 = new BuilderPatternTest().a(11).b(21).c(31)
                .d("yellow world");
            t0.print();
            t1.print();
        }
        public void t09() { // utils
            Utils util = new Utils();
            util.test();
        }
        public void t10() { // tries
            Tries t = new Tries();
            t.test();
        }
        public void t11() { // misccases
            MiscCases c = new MiscCases();
            c.test();
        }
        public void t12() { // searching
            Searching t = new Searching();
            t.test();
        }
        public void t13() { // avl
            AVL avl = new AVL();
            int ary[] = { 50, 40, 30, 20, 10, 90, 80, 70, 60, 45, 35, 25, 15 };
            for (int i = 0; i < ary.length; i++) {
                avl.insert(ary[i]);
            }
        }
        public void t14() { // TempTests
            TempTests t = new TempTests();
            t.test();
        }
        public void t15() {
            MathClass t = new MathClass();
            t.test();
        }
        public void t16() {
            GUISingle t = new GUISingle(EGraphType.CIRCLE_GRAPH);
            t.test();
        }
        public void t17() {
            Object o = this;
            Method[] allMethods = o.getClass().getMethods();
            for (int i = 0; i < allMethods.length; i++) {
                System.out.printf("method:%s%n", allMethods[i].getName());
                Class<?>[] paramTypes = allMethods[i].getParameterTypes();
                for (int j = 0; j < paramTypes.length; j++) {
                    System.out.printf("    param:%s%n", paramTypes[j]);
                }
            }
        }
        public void t18() {
            GraphClass t = new GraphClass();
            t.test();
        }
        public void t19() {
            GraphClassOld t = new GraphClassOld();
            t.test();
        }
        public void t20() { // listtest
            ListTests ll = new ListTests();
            ll.test();
        }
        public void t21() { // multithreading
            Multithreading mt = new Multithreading();
            mt.test();
        }
        public void t22() { // btree
            BTreeTest bt = new BTreeTest();
            bt.test();
        }
        public void t23() {
            DayNum dayNum_ = DayNum.SUN;
            System.out.printf("DayNum: %s = %d%n", dayNum_,
                dayNum_.intVal());
        }
        public void t24() {
            Syntaxes t = new Syntaxes();
            t.test();
        }
        public void t25(String[] args) { // iotests
            IOTests t = new IOTests();
            t.test(args);
        }
        public void t25() { // iotests
            IOTests t = new IOTests();
            t.test();
        }
        public void t26() { // networking
            Networking t = new Networking();
            t.test();
        }
        public void t27() { // niotests
            NIOTests t = new NIOTests();
            t.test();
        }
        public void t28() { // networkingnio
            NetworkingNIO t = new NetworkingNIO();
            t.test();
        }
        public void t29() { // networking testserver
            Networking t = new Networking();
            t.testServer();
        }
        public void t30() { // networking testclient
            Networking t = new Networking();
            t.testClient();
        }
        public void t31() { // networking testmultiserver
            Networking t = new Networking();
            t.testMultiServer();
        }
        public void t32() { // iooptrchain
            IOOPtrChain t = IOOPtrChain.createChain(5);
            t.printChainCompact();
        }
        public void t33(String args[]) { // networking
            Networking t = new Networking();
            if (args.length == 0 || args.length == 1) {
                t.test();
            } else {
                t.test(args);
            }
        }
        public void t34() { // cobserverpattern
            CObserverPattern t = new CObserverPattern();
            t.test();
        }
        public void t35() { // Makefile
            Makefile t = new Makefile();
            t.test();
        }
        public void t36() {
            ExecutorExamples t = new ExecutorExamples();
            t.test();
        }
        public void t37() {
            RegexClass t = new RegexClass();
            t.test();
        }
        public void t38() {
            Syntaxes t = new Syntaxes();
            t.test();
        }
        public void t39() {
            StringAlgorithms t = new StringAlgorithms();
            t.test();
        }
        public void t40() {
            Generics t = new Generics();
            t.test();
        }
        public void t41() {
            AnonymousClassesTest t = new AnonymousClassesTest();
            t.test();
        }
        public void t42() {
            LambdaTest t = new LambdaTest();
            t.test();
        }
        public void t43() {
            CompletableFuturesTest t = new CompletableFuturesTest();
            t.test();
        }
        public void t44() {
            TestCongestedCtr t = new TestCongestedCtr();
            t.test();
        }
        public void t45() {
            Asynchronous7Cases t = new Asynchronous7Cases();
            t.test();
        }
        public void t46() {
            Asynchronous8Cases t = new Asynchronous8Cases();
            t.test();
        }
        public void t47() {
            ReflectionCases t = new ReflectionCases();
            t.test();
        }
        public void t48() {
            OuterClass t = new OuterClass();
            t.test();
        }
        public void t49() {
            OuterClassExtended t = new OuterClassExtended();
            t.test();
        }
        public void t50() {
            AlgorithmsRanges t = new AlgorithmsRanges();
            t.test();
        }
        public void t51() {
            MimePullTests t = new MimePullTests();
            t.test();
        }
        public void t52() {
            AlgorithmChallenges t = new AlgorithmChallenges();
            t.test();
        }
        public void t53() {
            StackLocal<String> t = new StackLocal<>();
            t.test();
        }
    }
}
