import java.io.ByteArrayOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Random;
import java.util.Stack;


class Utils {
    boolean isDebug_ = false;
    long timePrev_;
    Random rand_ = new Random();
    static final String strRef_ = "abcdefghijklmnopqrstuvwxyz"
        + "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + ":;!@#$";
    String strSet_ = strRef_;
    int strSz_ = 0;
    char ac_[];
    int szac_;
    public Utils() {
        timePrev_ = System.currentTimeMillis();
        loadCharSet(null);
    }
    public void setIsDebug(boolean isDebug) {
        isDebug_ = isDebug;
    }
    public boolean randBool() {
        if (rand_.nextInt(2) == 1) {
            return true;
        }
        return false;
    }
    public void randIntAry(int a[], int min, int max) {
        if (a == null) {
            return;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = randInt(min, max);
        }
    }    
    public byte[] randByteAry(int sz) {
        byte [] a = new byte[sz];
        int mod = sz%2;
        int sz2 = sz - mod;
        for(int i = 0; i < sz2; i += 2) {
            int v = randInt(0, 0xffff, true);
            a[i+0] = (byte)(v >> 0);
            a[i+1] = (byte)(v >> 8);
        }
        int v = randInt(0, 0xffff, true);
        for(int i = sz2, j = 0; i < sz; i++, j += 8) {
            a[i] = (byte)(v >> j);
        }
        return a;
    }
    public java.util.List<Integer> randIntAryList(int a[], int szOfResult,
        boolean isUnique) {
        /**
         * Return a list of integers of size szOfResult from input array a. If
         * isUnique and szOfResult > a.length, return null.
         * 
         * First, copy a into a list. Then randomly pick a value from the list
         * and add to return list, delete it if unique, and repeat until
         * szOfResult.
         */
        if (a.length < szOfResult) {
            return null;
        }
        java.util.List<Integer> l = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        int szAry = a.length - 1;
        if (a.length == szOfResult) {
            for (int i = 0; i < szOfResult; i++) {
                ll.add(new Integer(a[i]));
            }
            return ll;
        }
        if (isUnique == false) {
            for (int i = 0; i < szOfResult; i++) {
                int idx = randInt(0, szAry, true);
                ll.add(new Integer(a[idx]));
            }
            return ll;
        }
        // isUnique == true
        for (int i = 0; i < a.length; i++) {
            ll.add(new Integer(a[i]));
        }
        for (int i = 0; i < szOfResult; i++) {
            szAry = ll.size() - 1;
            int idx = randInt(0, szAry, true);
            l.add(ll.get(idx));
            ll.remove(idx);
        }
        return l;
    }
    public java.util.List<Integer> randIntAryList(
        java.util.List<Integer> a, int szOfResult, boolean isUnique) {
        /**
         * Return a list of integers of size szOfResult from input array a. If
         * isUnique and szOfResult > a.length, return null.
         * 
         * First, copy a into a list. Then randomly pick a value from the list
         * and add to return list, delete it if unique, and repeat until
         * szOfResult.
         */
        if (a.size() < szOfResult && isUnique == true) {
            return null;
        }
        java.util.List<Integer> l = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        if (a.size() == szOfResult) {
            for (Integer i : a) {
                l.add(new Integer(i));
            }
            return l;
        }

        int szAry = a.size() - 1;
        if (isUnique == false) {
            for (int i = 0; i < szOfResult; i++) {
                int idx = randInt(0, szAry, true);
                l.add(new Integer(a.get(idx)));
            }
            return l;
        }

        // isUnique == true
        for (int i = 0; i < a.size(); i++) {
            ll.add(new Integer(a.get(i)));
        }
        for (int i = 0; i < szOfResult; i++) {
            szAry = ll.size() - 1;
            int idx = randInt(0, szAry, true);
            l.add(ll.get(idx));
            ll.remove(idx);
        }
        return l;
    }
    public int[] randIntAry(int sz, int min, int max) {
        if (sz <= 0) {
            return null;
        }
        int a[] = new int[sz];
        randIntAry(a, min, max);
        return a;
    }
    public java.util.List<Integer> randIntAryList(int min, int max, int sz) {
        return randIntAryList(min, max, sz, false);
    }
    public java.util.List<Integer> randIntAryList(int min, int max, int sz,
        boolean isInclusive) {
        if (sz <= 0 || max < min) {
            return null;
        }
        java.util.List<Integer> list = new ArrayList<Integer>();
        Integer n;
        for (int i = 0; i < sz; i++) {
            n = new Integer(randInt(min, max, isInclusive));
            list.add(n);
        }
        return list;
    }
    public void randIntegerAry(ArrayList<Integer> a, int sz, int min, int max) {
        if (a == null) {
            return;
        }
        for (int i = 0; i < sz; i++) {
            a.add(new Integer(randInt(min, max)));
        }
    }
    public byte randByte() {
        return randByte((byte)0x00, (byte)0xff, true);
    }
    public byte randByte(byte min, byte max, boolean isInclusive) {
        int v = rand_.nextInt(0x100);
        byte b = (byte)(v & 0xff);
        return b;
    }
    public byte[] randBytes(int sz) {
        byte[] ba = new byte[sz];
        rand_.nextBytes(ba);
        return ba;
    }
    public double randDouble(double min, double max) {
        if (min > max) {
            return -1.0;
        }
        if (min == max) {
            return min;
        }
        double v = max - min - 1.0;
        v = rand_.nextDouble() * (double) v;
        v += min;
        return v;
    }
    public void resetCharSet() {
        loadCharSet(null);
    }
    public void loadCharSet(String s) {
        if (s == null) {
            s = strRef_;
        }
        szac_ = s.length();
        strSz_ = s.length();
        ac_ = s.toCharArray();
        strSet_ = s;
    }
    public void swapChar(char ary[], int i, int j) {
        if (i < 0 || j < 0 || i == j || i >= ary.length || j >= ary.length) {
            return;
        }
        char c = ary[i];
        ary[i] = ary[j];
        ary[j] = c;
    }
    public void swapInt(int ary[], int i, int j) {
        if (i < 0 || j < 0 || i == j || i >= ary.length || j >= ary.length) {
            return;
        }
        int c = ary[i];
        ary[i] = ary[j];
        ary[j] = c;
    }
    public void p(String format, Object... args) {
        print(format, args);
    }
    public void print(String format, Object... args) {
        System.out.printf(format, args);
    }
    public void printTimeDiff() {
        printTimeDiff(true);
    }
    public void printTimeDiff(boolean updateTime) {
        printTimeDiff(updateTime, null);
    }
    public void printTimeDiff(String msg) {
        printTimeDiff(true, msg);
    }
    public void printTimeDiff(boolean updateTime, String msg) {
        long timeEnd = System.currentTimeMillis();
        long diff = timeEnd - timePrev_;
        if(msg == null) {
            System.out.printf("Elapsed Time: %d ms%n", diff);            
        } else {
            System.out.printf("%s Elapsed Time: %d ms%n", msg, diff);
        }
        if (updateTime) {
            updateTime();
        }
        
    }
    public void updateTime() {
        timePrev_ = System.currentTimeMillis();
    }
    public void printInfo() {
        System.out.printf("Hello%n");
    }
    public int randInt(int min, int max) {
        return randInt(min, max, false);
    }
    public int randInt(int min, int max, int exclude, boolean isInclusive) throws Exception {
        final int maxTries = 100;
        boolean stop = false;
        for(int i = 0; i < maxTries && !stop; i++) {
            int v = randInt(min, max, isInclusive);
            if(v != exclude) {
                return v;
            }
        }
        if(stop) {
            throw new Exception("max tries exceeded for randInt\n");
        }
        return min;
    }
    public int randInt(int min, int max, boolean isInclusive) {
        /**
         * returns rand int. If isInclusive, then range is: [min, max] If not
         * inclusive, then range is: [min, max)
         */
        if (max < min) {
            return 0;
        }
        if (max == min && isInclusive == true) {
            return min;
        }
        int n = max - min;
        if (isInclusive == true) {
            n++;
        }
        return (rand_.nextInt(n) + min);
    }
    public int randInt(
        int min, int max, boolean isInclusive, int vExclude) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(vExclude);
        return randInt(min, max, isInclusive, hs);
    }
    public int randInt(
        int min, int max, boolean isInclusive, HashSet<Integer> sExclude) {
        /**
         * choose a randInt except ones in sExclude
         */
        if (max < min) {
            return 0;
        }
        int n = max - min;
        if (n <= sExclude.size()) {
            return 0;
        }
        if (isInclusive == true) {
            n++;
        }
        int res = 0;
        for (int i = 0; i < 100; i++) {
            int vCandidate = rand_.nextInt(n) + min;
            if (min == max && isInclusive == true) {
                vCandidate = min;
            }
            if (sExclude.contains(vCandidate) == false) {
                return vCandidate;
            }
        }
        return res;
    }
    public int randIntGaussian(int min, int max, boolean isInclusive) {
        if (max < min) {
            return 0;
        }
        int n = max - min;
        if (isInclusive == true) {
            n++;
        }
        int halfRange = n / 2;
        int base = min + halfRange;

        if (halfRange % 2 == 1) {
            halfRange++;
        }
        if (isInclusive == false) {
            max--;
        }

        int maxTries = 100;
        int curTries = 0;
        int finalVal = base;

        while (curTries < maxTries) {
            double stdDev = 0.5;
            double randGaussian = rand_.nextGaussian() * stdDev;
            while (randGaussian < -1.0 || randGaussian > 1.0) {
                randGaussian = rand_.nextGaussian() * stdDev;
            }
            double doubleRandVal = (double) halfRange * randGaussian;
            int randVal = 0;
            if (doubleRandVal < 0) {
                randVal = (int) Math.floor(doubleRandVal);
            } else {
                randVal = (int) doubleRandVal;
            }
            finalVal = randVal + base;

            if (isDebug_) {
                System.out.printf(
                    "base:%2d half:%2d gausRand:%2d %2.2f final:%2d%n", base,
                    halfRange, randVal,
                    randGaussian, finalVal);
            }

            if (finalVal >= min && finalVal <= max) {
                return finalVal;
            }
            curTries++;
        }
        if (finalVal < min) {
            finalVal = min;
        }
        if (finalVal > max) {
            finalVal = max;
        }
        return finalVal;
    }
    public String randString(int sz) {
        if (sz <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < sz; i++) {
            c = randChar();
            sb.append(c);
        }
        return sb.toString();
    }
    public String consumeStringThrottle(String s, int minMS, int maxMS) 
        throws InterruptedException {
        if(s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            sb.append(c);
            int randSleepMS = randInt(minMS, maxMS);
            Thread.sleep(randSleepMS);
        }
        return sb.toString();        
    }
    public String randStringThrottle(int sz, int minMS, int maxMS) 
        throws InterruptedException {
        if(sz <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < sz; i++) {
            c = randChar();
            sb.append(c);
            int randSleepMS = randInt(minMS, maxMS);
            Thread.sleep(randSleepMS);
        }
        return sb.toString();        
    }
    public String randStringLine(
        int numCharsPerWord, 
        int numWords,
        String delimiter) {
        
        if(delimiter == null) {
            delimiter = " ";
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < numWords; i++) {
            String s = randString(numCharsPerWord);
            sb.append(s + delimiter);
        }
        return sb.toString();
    }
    public ArrayList<String> randStringArray(int numCharsPerWord,
        int numWordsPerLine, int numLines, String delimiter) {

        if (delimiter == null) {
            delimiter = " ";
        }

        ArrayList<String> a = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numLines; i++) {
            for (int j = 0; j < numWordsPerLine; j++) {
                String s = randString(numCharsPerWord);
                sb.append(s + delimiter);
            }
            a.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return a;
    }
    public char randChar() {
        int i = randInt(0, strSz_, false);
        return strSet_.charAt(i);
    }
    public void loadStringSet(String s) {
        loadCharSet(s);
    }
    public char[] randCharAry(int sz) {
        if (sz <= 0) {
            return null;
        }
        char a[] = new char[sz];
        for (int i = 0; i < a.length; i++) {
            a[i] = randChar();
        }
        return a;
    }
    public char[] getLCAlphaSet() {
        String s = new String("abcdefghijklmnopqrstuvwxyz");
        return s.toCharArray();
    }
    public char rand(char a[]) {
        return a[randInt(0, a.length)];
    }
    public int rand(int a[]) {
        return a[randInt(0, a.length)];
    }
    public void swap(int ary[], int i, int j) {
        int tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }
    public void swap(char ary[], int i, int j) {
        char tmp = ary[i];
        ary[i] = ary[j];
        ary[j] = tmp;
    }
    public void swap(String a[], int i, int j) {
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public void swap(Object a[], int i, int j) {
        Object t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public void shuffle(String a[]) {
        int j;
        for (int i = 0; i < a.length; i++) {
            j = randInt(0, a.length);
            swap(a, i, j);
        }
    }
    public void shuffle(Object a[]) {
        int sz = a.length;
        for(int i = 0; i < sz; i++) {
            int j = randInt(0, sz);
            swap(a, i, j);
        }        
    }
    public void shuffle(Collection<? extends Object> collection) {
        int sz = collection.size();
        Object a[] = collection.toArray();
        for(int i = 0; i < sz; i++) {
            int j = randInt(0, sz);
            swap(a, i, j);
        }
        collection.clear();
        for(int i = 0; i < sz; i++) {
            // This is also not allowed!
            //collection.add(a[i]);
        }
    }
    public void shuffle(java.util.List<? extends Object> list) {
        int sz = list.size();
        Object array[] = list.toArray();
        list.clear();
        for(int i = 0; i < sz; i++) {
            int j = randInt(0, sz);
            swap(array, i, j);
        }
        for(int i = 0; i < sz; i++) {
            // unknown type is not allowed for add
            //list.add(array[i]);
        }
    }
    public void shuffle(java.util.List<?> list, Class<?> clazz) {
        int sz = list.size();
        Object a[] = list.toArray();
        list.clear();
        for(int i = 0; i < sz; i++) {
            int j = randInt(0, sz);
            swap(a, i, j);
        }
        for(int i = 0; i < sz; i++) {
            //list.add(clazz.cast(a[i]));
        }
    }
    public void shuffle(int a[]) {
        int j;
        for (int i = 0; i < a.length; i++) {
            j = randInt(0, a.length);
            swap(a, i, j);
        }
    }
    public void shuffle(char a[]) {
        int j;
        for (int i = 0; i < a.length; i++) {
            j = randInt(0, a.length);
            swap(a, i, j);
        }
    }
    public String randString(int szStrMin, int szStrMax) {
        if (szStrMin <= 0 || szStrMax <= 0 || szStrMin > szStrMax) {
            return null;
        }
        int szStr = randInt(szStrMin, szStrMax);
        return randString(szStr);
    }
    public String randStringThrottle(
        int szStrMin, int szStrMax, int minTimeMS, int maxTimeMS) throws InterruptedException {
        int szStr = randInt(szStrMin, szStrMax);
        return randStringThrottle(szStr, minTimeMS, maxTimeMS);
    }
    public String randString(int szStr, char a[]) {
        if (szStr <= 0 || a.length <= 0) {
            return null;
        }
        char c[] = new char[szStr];
        for (int i = 0; i < szStr; i++) {
            c[i] = a[randInt(0, a.length)];
        }
        String s = new String(c);
        return s;
    }
    public void randStringAry(ArrayList<String> a, int szAry, int szStr) {
        if (a == null) {
            return;
        }
        if (szStr == -1) {
            for (int i = 0; i < szAry; i++) {
                a.add(randString(randInt(2, 19)));
            }
        } else {
            for (int i = 0; i < szAry; i++) {
                a.add(randString(szStr));
            }
        }
    }
    public ArrayList<String> randStringAry(int szAry, int szStr) {
        ArrayList<String> ary = new ArrayList<String>();
        randStringAry(ary, szAry, szStr);
        return ary;
    }
    public ArrayList<String> randStringAry(
        int szMinWord, 
        int szMaxWord, 
        int szMaxNumCharsPerLine, 
        int szNumLines) {
        return randStringAry(szMinWord, szMaxWord, szMaxNumCharsPerLine, szNumLines, " ");
    }
    public ArrayList<String> randStringAry(
        int szMinWord, 
        int szMaxWord, 
        int szMaxNumCharsPerLine, 
        int szNumLines,
        String separator) {
        ArrayList<String> ary = new ArrayList<>();
        for(int i = 0; i < szNumLines; i++) {
            StringBuilder sb = new StringBuilder();
            int numChars = 0;
            while(numChars < szMaxNumCharsPerLine) {
                int szStr = randInt(szMinWord, szMaxWord, true);
                String s = randString(szStr) + separator;
                sb.append(s);
                numChars += s.length();
            }
            ary.add(sb.toString());
        }
        return ary;
    }
    public ArrayList<String> stringPermutations(char charSet[], int szString,
        boolean hasRepeats) {
        // permutations with repetition: k^n
        // permutations without repetition: n!/(n-k)!
        // permutations of multisets: n!/(m1!*m2!*...*mx!)
        ArrayList<String> l = new ArrayList<String>();
        char ary[] = new char[szString];
        if (charSet.length == szString) {
            for (int i = 0; i < charSet.length; i++) {
                ary[i] = charSet[i];
            }
            stringPermutations(l, ary, 0);
        } else if (!hasRepeats) {
            // get all combinations of n choose k
            // then apply heap's algorithm over each combination to get
            // all permutations without repetition
            // is there better way??
            ArrayList<String> lc = stringCombinations(charSet, szString);
            for (int i = 0; i < lc.size(); i++) {
                char subset[] = lc.get(i).toCharArray();
                stringPermutations(l, subset, 0);
            }
        } else {
            stringPermutations(l, charSet, ary, 0, szString, hasRepeats);
        }
        return l;
    }
    public ByteArrayOutputStream arrayStringToByteArrayOutputStream(
        ArrayList<String> l) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for(String s: l) {
            byte[] ba = s.getBytes();
            baos.write(ba, 0, ba.length);
        }
        return baos;
    }
    private void stringPermutations(ArrayList<String> l, char ary[],
        int idxPos) {

        // Heap's algorithm

        if (idxPos == ary.length) {
            l.add(new String(ary));
            return;
        }

        int numChars = ary.length;
        for (int i = 0; i < numChars; i++) {
            stringPermutations(l, ary, idxPos + 1);
            if (i % 2 == 0) {
                swapChar(ary, i, numChars - 1);
            } else {
                swapChar(ary, 0, numChars - 1);
            }
        }
        stringPermutations(l, ary, idxPos + 1);
    }
    private void stringPermutations(ArrayList<String> l, char charSet[],
        char ary[], int idxAry, int szString,
        boolean hasRepeats) {

        if (idxAry == szString) {
            l.add(new String(ary));
            return;
        }
        int numChars = charSet.length;
        if (hasRepeats) {
            for (int i = 0; i < numChars; i++) {
                ary[idxAry] = charSet[i];
                stringPermutations(l, charSet, ary, idxAry + 1, szString,
                    hasRepeats);
            }
        }
    }
    public ArrayList<String> stringCombinations(char charSet[],
        char fixedSet[]) {

        // create combinations of size fixedSet.length, given
        // fixed values in fixedSet, where '\0' is to be filled
        // with chars from charSet

        ArrayList<String> l = new ArrayList<String>();
        return l;
    }
    public ArrayList<String> stringCombinations(char charSet[], int szString) {
        // combination: n!/(k!(n-k)!)
        ArrayList<String> l = new ArrayList<String>();
        char ary[] = new char[szString];
        stringCombinations(l, charSet, 0, ary, 0, szString);
        return l;
    }
    private void stringCombinations(ArrayList<String> l, char charSet[],
        int idxCharSet, char ary[], int idxAry,
        int szString) {

        if (idxAry == szString) {
            l.add(new String(ary));
            return;
        }
        int numChars = charSet.length;
        for (int i = idxCharSet; i < numChars; i++) {
            ary[idxAry] = charSet[i];
            stringCombinations(l, charSet, i + 1, ary, idxAry + 1, szString);
        }
    }
    public HashMap<Integer, String> randHashMap(int szMap, int szStr) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        for (int i = 0; i < szMap; i++) {
            int sz = szStr;
            if (szStr == -1) {
                sz = randInt(2, 19);
            }
            hm.put(new Integer(i), randString(sz));
        }
        return hm;
    }
    public void printHashMapIS(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> e : map.entrySet()) {
            System.out.printf("%3d: %s\n", e.getKey(), e.getValue());
        }
    }
    public ArrayList<Integer> generatePrimes(int n) {
        int max = (int) (n * Math.log(n));
        return getPrimeNumbers(max);
    }
    public ArrayList<Integer> getPrimeNumbers(int n) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        boolean a[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            a[i] = false;
        }
        l.add(2);
        for (int i = 2; i < n; i++) {
            for (int j = 2 * i; j < n; j += i) {
                a[i] = true;
            }
            for (int j = i + 1; j < n; j++) {
                if (!a[i]) {
                    i = j;
                    l.add(i);
                    break;
                }
            }
        }
        return l;
    }
    public static void printObjectLine(int l[], String msg) {
        if (msg == null) {
            msg = "";
        }
        System.out.printf("printObject %s\n", msg);
        for (int i = 0; i < l.length; i++) {
            System.out.printf("%3d ", l[i]);
        }
        System.out.printf("\n");
    }
    public static void printObject(int l[]) {
        System.out.printf("printObject\n");
        for (int i = 0; i < l.length; i++) {
            System.out.printf("%3d: %d\n", i, l[i]);
        }
    }
    public void printObject(Stack<Integer> l) {
        System.out.printf("printObject\n");
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("%3d: %d\n", i, l.elementAt(i).intValue());
        }
    }
    public void printObject(ArrayList<Integer> l) {
        System.out.printf("printObject\n");
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("%3d: %d\n", i, l.get(i).intValue());
        }
    }
    class UtilsTest {
        public UtilsTest() {
        }
        public void t00() {
            System.out.printf("randInt:[0,10)=%d\n", randInt(0, 10));
            System.out.printf("randInt:[0,0)=%d\n", randInt(0, 0));
            System.out.printf("randInt:[2,5)=%d\n", randInt(2, 5));

            int sz = 10;
            int min = 2;
            int max = 15;
            int a[] = new int[sz];
            randIntAry(a, min, max);
            System.out.printf("randIntAry(%d,%d,%d):", sz, min, max);
            for (int i = 0; i < a.length; i++) {
                System.out.printf("%d,", a[i]);
            }
            System.out.printf("\n");

            a = randIntAry(sz, min, max);
            System.out.printf("randIntAry(%d,%d,%d):", sz, min, max);
            for (int i = 0; i < a.length; i++) {
                System.out.printf("%d,", a[i]);
            }
            System.out.printf("\n");

            ArrayList<Integer> al = new ArrayList<Integer>();
            sz = 20;
            min = 3;
            max = 8;
            randIntegerAry(al, sz, min, max);
            System.out.printf("randIntAry(%d,%d,%d):", sz, min, max);
            for (int i = 0; i < al.size(); i++) {
                System.out.printf("%d,", al.get(i));
            }
            System.out.printf("\n");
        }
        public void t01() {
            System.out.printf("randChar:%s\n", randChar());
            int sz = 10;
            char a[] = randCharAry(sz);
            System.out.printf("randCharAry(10):");
            for (int i = 0; i < a.length; i++) {
                System.out.printf("%s,", a[i]);
            }
            System.out.printf("\n");

            System.out.printf("randString(10):%s\n", randString(sz));
            ArrayList<String> al = new ArrayList<String>();
            randStringAry(al, sz, 5);
            System.out.printf("randStringAry(10,5):");
            for (int i = 0; i < al.size(); i++) {
                System.out.printf("%s,", al.get(i));
            }
            System.out.printf("\n");
        }
        public void t02() {
            for (int i = 0; i < 20; i++) {
                System.out.printf("gaussian(100,200)=%d\n",
                    randIntGaussian(100, 200, true));
            }
        }
        public void t03() {
            String s = new String("abcdef");
            char ary[] = s.toCharArray();
            int szString = 3;
            boolean hasRepeats = false;
            ArrayList<String> l = stringPermutations(ary, szString, hasRepeats);
            for (int i = 0; i < l.size(); i++) {
                System.out.printf("i:%3d s:%s\n", i, l.get(i));
            }
        }
        public void t04() {
            String s = new String("abcd");
            char ary[] = s.toCharArray();
            int szString = 4;
            boolean hasRepeats = false;
            ArrayList<String> l = stringPermutations(ary, szString, hasRepeats);
            for (int i = 0; i < l.size(); i++) {
                System.out.printf("i:%3d s:%s\n", i, l.get(i));
            }
        }
        public void t05() {
            System.out.printf("hashcode testing\n");
            int szSet = 10;
            String charSet = "abcdefghij";

            // create 10 prime numbers, 1 for each character
            ArrayList<Integer> lprime = getPrimeNumbers(100);
            int aprime[] = new int[szSet];
            for (int i = 0; i < szSet; i++) {
                aprime[i] = lprime.get(i).intValue();
            }

            loadCharSet(charSet);

            HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

            // generate 10^5 strings combination
            ArrayList<String> lstring = stringPermutations(
                charSet.toCharArray(), 5, true);

            // now generate int hashCode to check uniqueness
            for (int i = 0; i < lstring.size(); i++) {
                int hcode = 0;
                for (int j = 0; j < lstring.get(i).length(); j++) {
                    for (int k = 0; k < charSet.length(); k++) {
                        if (charSet.charAt(k) == lstring.get(i).charAt(j)) {
                            hcode = hcode * aprime[k];
                        }
                    }
                }
                Integer iv = m.get(hcode);
                if (iv == null) {
                    m.put(hcode, 1);
                } else {
                    int v = iv.intValue() + 1;
                    m.put(hcode, v);
                }
            }

        }
        public void t06() {
            String s = randString(10, 20);
            System.out.printf("t0: %d: %s%n", s.length(), s);
        }
        public void t07() {
            java.util.List<Integer> l = randIntAryList(10, 20, 5, true);
            for (int i = 0; i < l.size(); i++) {
                System.out.printf("%d ", l.get(i));
            }
            System.out.printf("%n");
        }
        public void t08() {
            int min = 20;
            int max = 29;
            System.out.printf("gaussian int test, %d-%d inclusive%n", min, max);
            setIsDebug(true);
            for (int i = 0; i < 30; i++) {
                int v = randIntGaussian(min, max, true);
                System.out.printf("%2d%n", v);
            }
            setIsDebug(false);
        }
        public void t09() {
            /* test randIntAry */
            java.util.List<Integer> la = new ArrayList<>();
            int sz = 20;
            boolean isUnique = false;
            boolean res = true;

            // init la:
            HashMap<Integer, MutableInt> m = new HashMap<>();

            for (int i = 0; i < sz; i++) {
                Integer io = new Integer(i);
                MutableInt mio = new MutableInt();
                la.add(io);
                m.put(io, mio);
            }

            int szInput = 40;
            java.util.List<Integer> lRes = randIntAryList(la, szInput,
                isUnique);
            res = lRes.size() == szInput;
            assert res : String.format(
                "randIntAryList 1: sz exp:%d act:%d%n", szInput, lRes.size());
            for (Integer io : lRes) {
                res = m.get(io) != null;
                assert res : String.format("%d not in map%n", io);
            }

            System.out.println("randIntAryList with duplicates passed");

            szInput = 18;
            isUnique = true;
            lRes = randIntAryList(la, szInput, isUnique);
            res = lRes.size() == szInput;
            assert res : String.format(
                "randIntAryList 2: sz exp:%d act:%d%n", szInput, lRes.size());
            for (Integer io : lRes) {
                res = m.get(io) != null;
                assert res : String.format("%d not in map%n", io);
                m.get(io).inc();
                res = m.get(io).get() <= 1;
                assert res : String.format(
                    "expected %d to be unique, but is not%n", io);
            }

            System.out.println("randIntAryList unique passed");

            HashSet<Integer> hs = new HashSet<>();
            int vHalf = sz / 2;
            for (int i = 0; i < vHalf; i++) {
                hs.add(i);
            }
            int numRuns = 1000;
            for (int i = 0; i < numRuns; i++) {
                int v = randInt(0, sz, true, hs);
                res = hs.contains(v) != true;
                assert res : String.format(
                    "randInt exclude failed with %d in set", v);
                res = v >= 0 && v <= sz;
                assert res : String.format(
                    "randInt out of range: %d", v);
            }
            System.out.println("excluding half of set passed");
        }
        public void t10() {
            /* test inclusive and exclusive randInt */
            int min = 10;
            int max = 15;
            int numRuns = 1000;
            boolean res = true;
            int v;

            for (int i = 0; i < numRuns; i++) {
                v = randInt(min, max, false);
                res = v >= min && v < max;
                assert res : String.format("randInt exclusive failed %d", v);
                v = randInt(min, max, true);
                res = v >= min && v <= max;
                assert res : String.format("randInt inclusive failed %d", v);
            }

            System.out.println("randInt test passed");
        }
        public void t11() {
            /* test randIntGaussian */
            int min = 0;
            int max = 100;
            int numRuns = 1000000;

            int a[] = new int[max];
            for (int i = 0; i < max; i++) {
                a[i] = 0;
            }
            for (int i = 0; i < numRuns; i++) {
                int v = randIntGaussian(min, max, false);
                a[v]++;
            }
            System.out.println("gaussian frequency");
            for (int i = 0; i < max; i++) {
                System.out.printf("%03d:%03d%n", i, a[i]);
            }
        }      
        public void t12() {
            byte [] a = randByteAry(3);
            a = randByteAry(4);
            for(int i = 0; i < a.length; i++) {
                System.out.printf("%02x ", a[i]);
                if((i+1) == a.length) {
                    System.out.printf("\n");
                }
            }
            a = randByteAry(7);
            for(int i = 0; i < a.length; i++) {
                System.out.printf("%02x ", a[i]);
                if((i+1) == a.length) {
                    System.out.printf("\n");
                }
            }
            a = randByteAry(12);
            for(int i = 0; i < a.length; i++) {
                System.out.printf("%02x ", a[i]);
                if((i+1) == a.length) {
                    System.out.printf("\n");
                }
            }
            a = randByteAry(13);
            for(int i = 0; i < a.length; i++) {
                System.out.printf("%02x ", a[i]);
                if((i+1) == a.length) {
                    System.out.printf("\n");
                }
            }
            a = randByteAry(27);
            for(int i = 0; i < a.length; i++) {
                System.out.printf("%02x ", a[i]);
                if((i+1) == a.length) {
                    System.out.printf("\n");
                }
            }
        }
        public void t13() {
        	final int sz = 1000;
        	byte [] ba = new byte[sz];
        	short v = 0;
        	for(int i = 0; i < sz; i++) {
        		ba[i]	= (byte)v;
        		v++;
        	}
        	for(int i = 0; i < sz; i++) {
        		print("0x%02x ", ba[i]);
        		if(i % 5 == 0) {
        			print("\n");
        		}
        	}
        }
        public void t14() throws Exception {
        	final byte [] ba = "\r\n".getBytes(StandardCharsets.UTF_8.name());
        	print("ba.length of \\r\\n is %d\n", ba.length);
        }
        public void test() {
        	try {
                t14();        		
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
    }
    public void test() {
        UtilsTest t = new UtilsTest();
        t.test();
    }
}

class Pair<T, U> {
    private T t_;
    private U u_;

    public Pair(T t, U u) {
        setOne(t);
        setTwo(u);
    }

    public T getOne() {
        return t_;
    }

    public U getTwo() {
        return u_;
    }

    public T f() {
        return t_;
    }

    public U s() {
        return u_;
    }

    public void setOne(T t) {
        t_ = t;
    }

    public void setTwo(U u) {
        u_ = u;
    }
}