import java.util.*;
import java.lang.*;
import java.io.*;
import java.nio.file.*;
import java.nio.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.*;
import java.math.*;

class Utilities {
    long timePrev_;
    Random rand_ = new Random();
    final String strRef_ = 
        "abcdefghijklmnopqrstuvwxyz" + 
        "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + 
        "0123456789";
    String strSet_ = strRef_;
    int strSz_ = 0;
    public Utilities() {
        setStringSize();
        timePrev_ = System.currentTimeMillis();
    }
    public void printTimeDiff() {
        printTimeDiff(true);
    }
    public void printTimeDiff(boolean updateTime) {
        long timeEnd = System.currentTimeMillis();
        long diff = timeEnd - timePrev_;
        System.out.printf("Elapsed Time: %d ms%n", diff);
        if(updateTime) {
            updateTime();
        }
    }
    public void updateTime() {
        timePrev_ = System.currentTimeMillis();
    }
    public void setStringSize() {
        if(strSet_ == null) {
            strSz_ = 0;
        }
        strSz_ = strSet_.length();
    }
    public void printInfo() {
        System.out.printf("Hello%n");
    }
    public int randInt(int min, int max) {
        return randInt(min, max, false);
    }
    public int randInt(int min, int max, boolean isInclusive) {
        if(max < min) {
            return 0;
        }
        int n = max - min;
        if(isInclusive == true) {
            n++;
        }
        return(rand_.nextInt(n) + min);
    }
    public List<Integer> 
    randIntAry(int min, int max, int sz) {
        return randIntAry(min, max, sz, false);
    }
    public List<Integer> 
    randIntAry(int min, int max, int sz, boolean isInclusive) {
        if(sz <= 0 || max < min) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();
        Integer n;
        for(int i = 0; i < sz; i++) {
            n = new Integer(randInt(min, max, isInclusive));
            list.add(n);
        }
        return list;
    }
    public String randString(int min, int max) {
        if(max < min) {
            return null;
        }
        int sz = randInt(min, max, false);
        return randString(sz);
    }
    public String randString(int sz) {
        if(sz <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        char c;
        for(int i = 0; i < sz; i++) {
            c = randChar();
            sb.append(c);
        }
        return sb.toString();
    }
    public char randChar() {
        int i = randInt(0, strSz_, false);
        return strSet_.charAt(i);
    }
    public void loadStringSet(String s) {
        if(s == null) {
            strSet_ = strRef_;
        }
        else {
            strSet_ = s;
        }
        setStringSize();
    }
    class UtilitiesTests {
        public void t0() {
            String s = randString(10,20);
            System.out.printf("t0: %d: %s%n", s.length(), s);
        }
        public void t1() {
            List<Integer> l = randIntAry(10,20,5,true);
            for(int i = 0; i < l.size(); i++) {
                System.out.printf("%d ", l.get(i));
            }
            System.out.printf("%n");
        }
        public void test() {
            t1();
        }
    }
    public void test() {
        UtilitiesTests t = new UtilitiesTests();
        t.test();
    }
}

interface SyntaxExampleInterface1 {
    public void execute(Object d);
}
public class Test {
    private static int vs_ = 2; // ok to declare here, but not inner class
    public static AtomicInteger GID_;
    public int var_abc_;
    public final int var_abd_;
    private static int var_abcd_ = 3;
    Utilities utils_ = new Utilities();

    public int getGID() {
        return GID_.get();
    }
    public int getGID(boolean inc) {
        if(inc) {
            return GID_.getAndAdd(1);
        }
        return getGID();
    }
    public void setGID(int v) {
        GID_.set(v);
    }       
    public enum Day {
        SUN, MON, TUE, WED, THU, FRI, SAT 
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
    public enum Coin {  // can be extended or implement
        // implicitly impliments Serializable and Comparable
        PENNY(1), NICKEL(5), DIME(10), QUARTER(25);
        private int v_;
        private Coin(int v) {
            v_ = v;
        }   // must be private, else compile error
        public Coin val() {
            switch(v_) {
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
    class NIOTest {
    }
    class IOTest {
        public ArrayList<String>
        listFilesInDirIO(String sPath, boolean isRecursive) 
        {
            ArrayList<String> list = new ArrayList<>(); 
            listFilesInDirIO(sPath, isRecursive, list);
            return list;
        }
        public ArrayList<String>
        listFilesInDirNIO(String sPath, boolean isRecursive)
        {
            ArrayList<String> list = new ArrayList<>(); 
            Path path = Paths.get(sPath);
            try {
                listFilesInDirNIO(path, isRecursive, list);
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            return list;
        }
        public void
        listFilesInDirIO(
            String sPath, 
            boolean isRecursive, 
            ArrayList<String> list)
        {
            File dir = new File(sPath);
            if(dir.exists() == false) {
                return;
            }
            ArrayList<String> listTmp = new ArrayList<>();
            File [] files = dir.listFiles();
            for(int i = 0; i < files.length; i++) {
                if      (files[i].isFile()) {
                    if(files[i].toString().contains(".swp") == false) {
                        listTmp.add(files[i].toString());
                    }
                }
                else if (files[i].isDirectory()) {
                    if(isRecursive) {
                        listFilesInDirIO(
                            files[i].toString(), isRecursive, list);
                    }
                }
            }
            if(listTmp.size() != 0) {
                list.addAll(listTmp);
            }
        }
        public void
        listFilesInDirNIO(
            Path path, 
            boolean isRecursive, 
            ArrayList<String> list) throws IOException
        {
            DirectoryStream<Path> dir = Files.newDirectoryStream(path);
            ArrayList<String> listTmp = new ArrayList<>();
            for(Path f : dir) {
                if      (Files.isDirectory(f)) {
                    if(isRecursive) {
                        listFilesInDirNIO(f, isRecursive, list);
                    }
                }
                else if (Files.isRegularFile(f, LinkOption.NOFOLLOW_LINKS)) {
                    if(f.toString().contains(".swp") == false) {
                        listTmp.add(f.toString());
                    }
                }
            }
            if(listTmp.size() != 0) {
                list.addAll(listTmp);
            }
        }
        class IOTestCases {
            public void t0() {
                String sPath = 
                    "/Users/wayneng/Documents/docs_readonly/src_code" + 
                    "/java/jdk_src_1.8/src/java/lang";
                ArrayList<String> list = listFilesInDirIO(sPath, true);
                for(String s : list) {
                    System.out.println(s);
                }
            }
            public void t1() {
                String sPath = 
                    "/Users/wayneng/Documents/docs_readonly/src_code" + 
                    "/java/jdk_src_1.8/src/java/lang";
                ArrayList<String> list = listFilesInDirNIO(sPath, true);
                for(String s : list) {
                    System.out.println(s);
                }
            }
            public void test() {
                t1();
            }
        }
        public void test() {
            IOTestCases t = new IOTestCases();
            t.test();
        }
    }
    class Syntaxes {
        class SyntaxA {
            private final int v_;
            private static final int vs_ = 1;
            public SyntaxA() {
                v_  = vs_;
            }
            public SyntaxA(int v) {
                v_  = v;
            }
            public final int v() {
                return v_;
            }
            public final void printInfo() {
                System.out.println(v());
            }
        }
        class SyntaxB {
            //private static int vs_ = 2; // compile err: illegal decl inner 
            Day day_;
            public SyntaxB() {
                day_            = Day.SUN;
            }
            public void day(Day d) {
                day_            = d;
            }
            public Day day() {
                return day_;
            }
        }
        class SyntaxEnum {
            public SyntaxEnum() {
            }
            public void test() {
                for(Coin c: Coin.values()) {
                    System.out.printf("%s%n", c);
                }
                System.out.println();
                for(Coin c: Coin.values()) {
                    System.out.printf("%s = %d%n", c, c.intVal());
                }
                System.out.println();
                for(Coin c: Coin.values()) {
                    System.out.printf("%s%n", c.toString());
                }
            }
        }
        class SyntaxTest {
            int var_abc_;           // this is legal
            int var_aaa_ = 5;       // this is legal
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
                System.out.printf("Test.var_abc %d%n", Test.this.var_abc_);
                System.out.printf("Test.var_abcd %d%n", Test.var_abcd_);
                System.out.printf("Test.var_abd %d%n", var_abd_);
                System.out.printf("Test.var_abd %d%n", Test.this.var_abd_);
            }
            public void test() {
                t2();
            }
        }
        public void test() {
            SyntaxTest t = new SyntaxTest();
            t.test();
        }
    }
    class GraphClass {
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
                if(n == null){ 
                    return;
                }
                Integer id = n.getId();
                if(mapOB_.containsKey(id)) {
                    return;
                }
                mapOB_.put(id, n);
                if(isDirected_ == false) {
                    n.addNode(this);
                }
                n.addNodeInbound(this);
            }
            public void addNodeInbound(GraphNodeType1 n) {
                if(n == null) {
                    return;
                }
                Integer id = n.getId();
                if(mapIB_.containsKey(id)) {
                    return;
                }
                mapIB_.put(id, n);
                if(isDirected_ == false) {
                    n.addNodeInbound(this);
                }
            }
            public Iterator<HashMap.Entry<Integer, GraphNodeType1>> 
                iterator() 
            {
                return mapOB_.entrySet().iterator();
            }
            public void printInfo() {
                printInfo(null);
            }
            public void printInfo(String msg) {
                StringBuilder sb = new StringBuilder();
                if(msg != null) {
                    sb.append(msg + " ");
                }
                sb.append("GraphNode: ");
                sb.append(
                    String.format("%3d : isDirected: %d%n", id_, isDirected_));
                sb.append("    OUTBOUND: ");
                for(HashMap.Entry<Integer, GraphNodeType1> e : 
                    mapOB_.entrySet()) 
                {
                    sb.append(String.format("%3d ", e.getKey()));
                }
                sb.append("%n");
                sb.append("    INBOUND:  ");
                for(Integer k: mapIB_.keySet()) {
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
                if(msg != null) {
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
            public EdgeType2(
                GraphNodeType2 nSrc, 
                GraphNodeType2 nDst,
                int weight) 
            {
                nSrc_   = nSrc;
                nDst_   = nDst;
                weight_ = weight;
            }
            public EdgeType2(
                GraphNodeType2 nSrc, 
                GraphNodeType2 nDst) 
            {
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
                if(msg != null) {
                    sb.append(msg + " ");
                }
                sb.append(String.format(
                    "EdgeType2 src:%3d dst:%3d w:%d", 
                    nSrc_.getId(), nDst_.getId(), weight_));
                System.out.println(sb.toString());
            }
        }
        class GraphObjectType2 {
            HashMap<Integer, GraphNodeType2> 
                mNodes_ = new HashMap<>();
            HashMap<Integer, HashMap<Integer, EdgeType2>> 
                mEdgeIn_ = new HashMap<>();
            HashMap<Integer, HashMap<Integer, EdgeType2>> 
                mEdgeOut_ = new HashMap<>();
            public void addNode(GraphNodeType2 n) {
                if(n == null) {
                    return;
                }
                if(mNodes_.containsKey(n.getId())) {
                    return;
                }
                mNodes_.put(n.getId(), n);
            }
            public GraphNodeType2 getNode(Integer id) {
                if(mNodes_.containsKey(id)) {
                    return mNodes_.get(id);
                }
                return mNodes_.get(id); // returns null
            }
            public void addNodeAndEdge(
                GraphNodeType2 n, 
                GraphNodeType2 nDst, 
                boolean isDirected)
            {
                addNode(n);
                addEdge(n, nDst, isDirected);
            }
            public Iterator<GraphNodeType2> iteratorNodes() {
                return mNodes_.values().iterator(); 
            }
            public EdgeType2 addEdgeToMap(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                int weight)
            {
                Integer idSrc   = nSrc.getId();
                Integer idDst   = nDst.getId();
                EdgeType2 edge  = null;

                if(mEdgeOut_.containsKey(idSrc) == false) {
                    mEdgeOut_.put(idSrc, new HashMap<Integer, EdgeType2>());
                }

                if(mEdgeOut_.get(idSrc).containsKey(idDst) == false) {
                    edge = new EdgeType2(nSrc, nDst, weight);
                    mEdgeOut_.get(idSrc).put(idDst, edge);
                }
                else {
                    edge = mEdgeOut_.get(idSrc).get(idDst);
                }

                if(mEdgeIn_.containsKey(idDst) == false) {
                    mEdgeIn_.put(idDst, new HashMap<Integer, EdgeType2>());
                }

                if(mEdgeIn_.get(idDst).containsKey(idSrc) == false) {
                    mEdgeIn_.get(idDst).put(idSrc, edge);
                }

                return edge; 
            }
            public boolean addEdge(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                boolean isDirected,
                int weight)
            {
                if(nSrc == null || nDst == null) {
                    return false;
                }
                Integer idSrc = nSrc.getId();
                Integer idDst = nDst.getId();
                if( mNodes_.containsKey(idSrc) == false ||
                    mNodes_.containsKey(idDst) == false) {
                    System.out.printf("%d or %d not in map%n", idSrc, idDst);
                    return false;
                }
                addEdgeToMap(nSrc, nDst, weight);
                if(isDirected == false) {
                    addEdgeToMap(nDst, nSrc, weight);
                }

                return true;
            }
            public boolean addEdge(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                boolean isDirected)
            {
                return addEdge(nSrc, nDst, isDirected, 1);
            }
            public boolean addEdgeDirected(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst)
            {
                return addEdge(nSrc, nDst, true, 1);
            }
            public boolean addEdgeDirected(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                int weight)
            {
                return addEdge(nSrc, nDst, true, weight);
            }
            public void printInfoNodes(String msg) {
                if(msg != null) {
                    System.out.println(msg);
                }
                for(GraphNodeType2 n : mNodes_.values()) {
                    System.out.printf("%3d%n", n.getId());
                }
            }
            public void printInfoMapIBound(String msg) {
                if(msg != null) {
                    System.out.println(msg);
                }
                for(Map.Entry<Integer, HashMap<Integer, EdgeType2>> m :
                    mEdgeIn_.entrySet()) 
                {
                    System.out.printf("    INCOMING to %d%n", m.getKey());
                    for(EdgeType2 e : m.getValue().values()) {
                        e.printInfo(null);
                    }
                }
            }
            public void printInfoMapOBound(String msg) {
                if(msg != null) {
                    System.out.println(msg);
                }
                for(Map.Entry<Integer, HashMap<Integer, EdgeType2>> m :
                    mEdgeOut_.entrySet()) 
                {
                    System.out.printf("    OUTGOING from %d%n", m.getKey());
                    for(EdgeType2 e : m.getValue().values()) {
                        e.printInfo(null);
                    }
                }
            }
            public void printInfo() {
                printInfo(null);
            }
            public void printInfo(String msg) {
                System.out.printf("----------------------%n");
                if(msg != null) {
                    System.out.printf("%s: ", msg);
                }
                System.out.printf("GraphType2 printInfo%n");
                System.out.printf("    Nodes:%n");
                printInfoNodes(   "    ");    
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
                for(GraphNodeType2 n : mNodes_.values()) {
                    System.out.printf("%2d ", n.getId());
                }
                System.out.printf("%nEdges In:");
                for(Map.Entry<Integer, HashMap<Integer, EdgeType2>> m :
                    mEdgeIn_.entrySet()) 
                {
                    System.out.printf("%n    IN TO     %3d: ", m.getKey());
                    for(Integer dst : m.getValue().keySet()) {
                        System.out.printf("%3d ", dst);
                    }
                }
                System.out.printf("%nEdges Out:");
                for(Map.Entry<Integer, HashMap<Integer, EdgeType2>> m :
                    mEdgeOut_.entrySet()) 
                {
                    System.out.printf("%n    OUT FROM  %3d: ", m.getKey());
                    for(Integer dst : m.getValue().keySet()) {
                        System.out.printf("%3d ", dst);
                    }
                }
                System.out.printf("%n----------------------%n");
            }
        }
        class GraphBuilder {
            GraphNodeType2 nHead_ = null;

            private void graphSetup1Type2(
                int numNodes,
                int numLevels,
                GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> aAryNode,
                boolean isDirected)
            {
                // helper function called by randGraph
                // add numLevels of ArrayList to aAryNode
                // distribute numNodes into numLevels of lists
                // uses semi random distribution of nodes to each ArrayList

                int numRemaining = numNodes;
                int numAvg = numNodes/numLevels;
                int noiseNeg = numAvg/2;
                int noisePos = numAvg/4;
                int minNodes = numAvg - noiseNeg;
                int maxNodes = numAvg;

                if(minNodes <= 0) {
                    minNodes = 1;
                }
                if(maxNodes > numNodes) {
                    maxNodes = numAvg;
                }

                for(int i = 0; i < numLevels; i++) {
                    aAryNode.add(new ArrayList<GraphNodeType2>());
                }
                // distribute the nodes to each level

                // subtract numLevels to guarantee each level has min of 1
                numRemaining -= numLevels;

                for(int i = 0; i < numLevels; i++) {
                    int numNodesInLevel = utils_.randInt(
                        minNodes, maxNodes, true);
                    if( (numNodesInLevel > numRemaining) ||  
                        ((i + 1) == numLevels))
                    {
                        numNodesInLevel = numRemaining;
                    }
                    if(numRemaining < (2*(numLevels-i))) {
                        if(numRemaining < 2) {
                            numNodesInLevel = numRemaining;
                        }
                        else {      // numLevels-i;
                            numNodesInLevel = 2;
                        }
                    }
                    // guarantee each level has at least 1 node
                    // so do j <= numNodes instead of j < numNodes
                    System.out.printf("graphSetup1 row:%d: ", i);
                    for(int j = 0; j <= numNodesInLevel; j++) {
                        GraphNodeType2 n = new GraphNodeType2();
                        graph.addNode(n);
                        aAryNode.get(i).add(n);
                        System.out.printf("%2d ", n.getId());
                        if(i == 0 && j == 0) {
                            nHead_ = n;
                        }
                    }
                    System.out.printf("%n");
                    numRemaining -= numNodesInLevel;
                }
            }
            private Integer graphSetup2Type2GetMaxId(
                int numLevels,
                int inLevel,
                int depth,      // inclusive
                ArrayList<ArrayList<GraphNodeType2>> a)
            {
                // return the max ID of the max Node that is 
                // inLevel + depth
                if(inLevel >= numLevels) {
                    return null;
                }
                int maxId = 0;
                for(int j = 0; j <= depth; j++) {
                    int curLevel = inLevel + j;
                    if(curLevel >= numLevels) {
                        break;
                    }
                    int sz = a.get(curLevel).size() - 1;
                    maxId = a.get(curLevel).get(sz).getId();
                }
                return new Integer(maxId);
            }
            private void graphSetup2Type2(
                int numNodes,
                int numLevels,
                int maxNumEdgesPerNode,
                GraphObjectType2 graph,
                ArrayList<ArrayList<GraphNodeType2>> a,
                boolean isDirected)
            {
                // helper function called by randGraph
                //
                //     input:
                // ArrayList<ArrayList<Node>> a.size == numLevels, with
                // numNodes randomly distributed among those levels. 
                //     output:
                // for the top through next to last levels, make non directed
                // connections with nodes up to two levels down. 
                // for the last level, if a node is unconnected, then 
                // connect to a random, subsequent sibling.

                // hash each node and remove for each one visited
                HashMap<Integer, AtomicInteger> mI = new HashMap<>();
                HashMap<Integer, AtomicInteger> mO = new HashMap<>();

                Iterator<GraphNodeType2> itNodes = graph.iteratorNodes();
                while(itNodes.hasNext()) {
                    GraphNodeType2 curNode = itNodes.next();
                    mI.put(curNode.getId(), new AtomicInteger(0));
                    mO.put(curNode.getId(), new AtomicInteger(0));
                }

                int nextToLastLevel = numLevels - 1;
                GraphNodeType2 nSrc;
                GraphNodeType2 nLevelHead = null;

                // for the top to next to last level
                for(int i = 0; i < nextToLastLevel; i++) {
                    int sz = a.get(i).size() - 1;
                    int maxId = a.get(i).get(sz).getId();
                    nLevelHead = a.get(i).get(sz);

                    // have the connections from current to maxId
                    // if there is a next level, get max id of next level
                    Integer iMaxId = 
                        graphSetup2Type2GetMaxId(numLevels, i, 2, a);
                    if(iMaxId != null) {
                        maxId = iMaxId.intValue();
                    }
                    for(int j = 0; j <= sz; j++) {
                        nSrc = a.get(i).get(j);
                        int numEdges = utils_.randInt(
                            1, maxNumEdgesPerNode, true);
                        for(int k = 0; k < numEdges; k++) {
                            graphSetup3Type2(
                                nSrc, maxId, graph, mI, mO, isDirected);
                        }        

                        // if is directed, make sure every
                        // middle level node has an incoming edge
                        if( (isDirected == true) && 
                            (i != 0) && 
                            (mI.get(nSrc.getId()).get() == 0)) 
                        {
                            int idMin = 0;
                            if(nHead_ != null) {
                                idMin = nHead_.getId().intValue();
                            } 
                            int idMax = nSrc.getId().intValue() - 1;
                            int idDst = utils_.randInt(idMin, idMax, true);
                            GraphNodeType2 nDst = graph.getNode(idDst);
                            graphSetup4Type2(
                                nDst, nSrc, graph, mI, mO, isDirected);
                        }
                    }
                }

                if(nextToLastLevel <= 0) {
                    return;
                }

                // for each node in last level, connect once 
                int sz = a.get(numLevels-1).size();
                for(int j = 0; j < sz; j++) {
                    nSrc = a.get(numLevels-1).get(j);
                    int idSrc = nSrc.getId().intValue();
                    int idMin = nLevelHead.getId().intValue();
                    int idMax = nSrc.getId().intValue() - 1;
                    int idDst = utils_.randInt(idMin, idMax, true);
                    GraphNodeType2 nDst = graph.getNode(idDst);
                    graphSetup4Type2(
                        nDst, nSrc, graph, mI, mO, isDirected);
                }
            }
            public void graphSetup3Type2(
                GraphNodeType2 nSrc,
                int maxId,
                GraphObjectType2 graph,
                HashMap<Integer, AtomicInteger> mI,
                HashMap<Integer, AtomicInteger> mO,
                boolean isDirected)
            {
                // helpder function called by graphSetup2
                // pick a random, subsequent node, and create edge

                int idSrc = nSrc.getId().intValue() + 1; 
                int idDst = utils_.randInt(idSrc, maxId, true);
                GraphNodeType2 nDst = graph.getNode(idDst);
                graph.addEdge(nSrc, nDst, isDirected);
    
                mO.get(idSrc).incrementAndGet();
                mI.get(idDst).incrementAndGet();

                if(isDirected == false){
                    mO.get(idDst).incrementAndGet();
                    mI.get(idSrc).incrementAndGet();
                }
            }
            public void graphSetup4Type2(
                GraphNodeType2 nSrc,
                GraphNodeType2 nDst,
                GraphObjectType2 graph,
                HashMap<Integer, AtomicInteger> mI,
                HashMap<Integer, AtomicInteger> mO,
                boolean isDirected)
            {
                // helpder function called by graphSetup2
                // create edge

                int idSrc = nSrc.getId().intValue(); 
                int idDst = nDst.getId().intValue();
                graph.addEdge(nSrc, nDst, isDirected);
    
                mO.get(idSrc).incrementAndGet();
                mI.get(idDst).incrementAndGet();

                if(isDirected == false){
                    mO.get(idDst).incrementAndGet();
                    mI.get(idSrc).incrementAndGet();
                }
            }
            public GraphObjectType2 randGraph(
                int numNodes,
                int numLevels,
                boolean isDirected) 
            {
                if(numLevels > (2*numNodes)) {
                    return null;
                }

                int maxNumEdgesPerNode = 2;

                GraphObjectType2 graph = new GraphObjectType2();

                ArrayList<ArrayList<GraphNodeType2>> aAryNode = 
                    new ArrayList<>();

                graphSetup1Type2(
                    numNodes, numLevels, graph, aAryNode, isDirected);

                graphSetup2Type2(
                    numNodes, numLevels, maxNumEdgesPerNode, graph, 
                    aAryNode, isDirected);

                return graph;
            }
            public GraphObjectType2 randDirectedGraph(
                int numNodes,
                int numLevels) 
            {
                return null;
            }
        }
        class GraphClassTests {
            public void t0() {
                int numLevels = 4;
                int numNodes = 16;
                boolean isDirected = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = 
                    g.randGraph(numNodes, numLevels, isDirected);
                gt2.printInfoCondensed();
            }
            public void t1() throws Exception {
                int numLevels = 5;
                int numNodes = 20;
                boolean isDirected = false;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = 
                    g.randGraph(numNodes, numLevels, isDirected);
            }
            public void t2() {
                try {
                    for(int i = 0; i < 20; i++) {
                        t1();
                    }
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
            public void t3() {
                boolean isDirected = true;
                int numLevels = 4;
                int numNodes = 12;
                GraphBuilder g = new GraphBuilder();
                GraphObjectType2 gt2 = 
                    g.randGraph(numNodes, numLevels, isDirected);
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
    class SyntaxExamples {
        class ObjInterface1 implements SyntaxExampleInterface1 {
            public void execute(Object d) {
                System.out.println(d.toString());
            }
        }
        public void callObjInterface1(SyntaxExampleInterface1 if1, Object d) {
            if1.execute(d);
        }
        class SyntaxExamplesTests {
            public void t0() {  
                System.out.println("calling new interface instead of class");
                System.out.println("command pattern");
                callObjInterface1(new ObjInterface1(), "hello world");
            }
            public void test() {
                t0();
            }
        }
        public void test() {
            SyntaxExamplesTests t = new SyntaxExamplesTests();
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
                nameNode_       = nameNode;
                id_             = id;
                level_          = -1;
                status_         = 0;
                mapParents_     = new HashMap<String, NodeMF>();
            }
            public NodeMF(String nameNode, int id, int level) {
                nameNode_       = nameNode;
                id_             = id;
                level_          = level;
                status_         = 0;
                mapParents_     = new HashMap<String, NodeMF>();
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
                if(findParent(nameNode) == null) {
                    mapParents_.put(nameNode, nodeP);
                } 
            }
            public NodeMF findParent(final String nameNode) {
                if(nameNode == null) {
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
            if(n == null) {
                return;
            }
            LinkedList<NodeMF> ll = new LinkedList<NodeMF>();
            n.printInfo();
            ll.add(n);
            while(ll.size() != 0) {
                NodeMF c = ll.remove();
                Iterator<HashMap.Entry<String, NodeMF>> it = c.iterator();
                if(it.hasNext() == false) {
                    continue;
                }
                System.out.printf("---- %s children%n", c.name());
                while(it.hasNext()) {
                    HashMap.Entry<String, NodeMF> p = it.next();
                    p.getValue().printInfo();
                    ll.add(p.getValue());
                }
            }
        }
        public boolean makeFileNodesDFS(NodeMF n, Stack<NodeMF> stack) { 
            if(n == null) {
                return true;
            }
            Iterator<HashMap.Entry<String, NodeMF>> it = n.iterator();
            if(it.hasNext() == false){
                n.status(1);
                return true;
            }
            while(it.hasNext()) {
                HashMap.Entry<String, NodeMF> p = it.next();
                stack.push(p.getValue());
                boolean status = makeFileNodesDFS(p.getValue(), stack);
                stack.pop();
                if(status == false) {
                    return false;
                }
            }
            it = n.iterator();
            while(it.hasNext()) {
                HashMap.Entry<String, NodeMF> p = it.next();
                if(p.getValue().status() == 0) {
                    return false;
                }
            }
            n.status(1);
            return true;
        }
        public boolean makeFileNodesBFS(NodeMF n) {
            if(n == null) {
                return true;
            }
            Stack<NodeMF> stack = new Stack<NodeMF>();
            stack.push(n);
            Stack<NodeMF> stack_final = new Stack<NodeMF>();
            stack_final.push(n);
            while(stack.size() != 0) {
                NodeMF c = stack.pop();
                Iterator<HashMap.Entry<String, NodeMF>> it = c.iterator();
                if(it.hasNext() == false) {
                    c.status(1);
                    continue;
                }
                while(it.hasNext()) {
                    HashMap.Entry<String, NodeMF> p = it.next();
                    stack.push(p.getValue());
                    stack_final.push(p.getValue());
                }
            }
            while(stack_final.size() != 0) {
                NodeMF c = stack_final.pop();
                if(c.status() == 0) {
                    Iterator<HashMap.Entry<String, NodeMF>> it = c.iterator();
                    boolean all_status_one = true;
                    while(it.hasNext()) {
                        HashMap.Entry<String, NodeMF> p = it.next();
                        if(p.getValue().status() == 0) {
                            all_status_one = false;
                        }
                    }
                    if(all_status_one == true) {
                        c.status(1);
                    }
                }
                if(c.status() == 0) {
                    System.out.printf("ERROR: %s status = %d%n",
                        c.name(), c.status());
                    return false;
                }
            }
            return true;
        }
        public void getUsedMemory(boolean doPrint) {
            Runtime runtime = Runtime.getRuntime();
            long usedMemory = runtime.totalMemory() - runtime.freeMemory();
            if(doPrint) {
                System.out.printf("Used memory is %d%n", usedMemory);
            }
            runtime.gc();
            usedMemory = runtime.totalMemory() - runtime.freeMemory();
            if(doPrint) {
                System.out.printf("Used memory is %d%n", usedMemory);
            }
        }
        class MakefileTest {
            public void t1() {
                int id = 0;
                String ary[] = { "a", "b", "c", "d", "e" };
                NodeMF n = new NodeMF(ary[id], id);
                id++;
                while(id < 5) {
                    n.addParent(new NodeMF(ary[id], id));
                    id++;
                }
                Iterator<HashMap.Entry<String, NodeMF>> it = n.iterator();
                while(it.hasNext()) {
                    HashMap.Entry<String, NodeMF> p = it.next();
                    p.getValue().printInfo();
                }
            }
            public void t2() {
                String s = "abcdefghijklmnopqrstuvwxyz" + 
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String ary[] = s.split("");
                int id = 0;
                LinkedList<NodeMF> ll = new LinkedList<NodeMF>();
                int level = 0;
                NodeMF n = new NodeMF(ary[id], id++, level);
                ll.add(n);
                for(int i = 0; i < 15; i++) {
                    NodeMF c = ll.remove();
                    level = c.level() + 1;
                    int numfiles = 2;
                    if(i % 2 == 0) {
                        numfiles = 3;
                    }
                    for(int j = 0; j < numfiles; j++) {
                        NodeMF t = new NodeMF(ary[id], id++, level);
                        ll.add(t);
                        c.addParent(t);
                    }
                } 
                ll.clear();
                //printNodes(n);
                System.out.printf("Now doing the make part%n");
                boolean status = makeFileNodesBFS(n);
                if(status == true) {
                    //printNodes(n);
                    System.out.printf("OK PASS%n");
                }
                else {
                    System.out.printf("FAIL%n");
                }
                getUsedMemory(true);
            }
            public void t3() {
                String s = "abcdefghijklmnopqrstuvwxyz" + 
                    "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                String ary[] = s.split("");
                int id = 0;
                LinkedList<NodeMF> ll = new LinkedList<NodeMF>();
                int level = 0;
                NodeMF n = new NodeMF(ary[id], id++, level);
                ll.add(n);
                for(int i = 0; i < 15; i++) {
                    NodeMF c = ll.remove();
                    level = c.level() + 1;
                    int numfiles = 2;
                    if(i % 2 == 0) {
                        numfiles = 3;
                    }
                    for(int j = 0; j < numfiles; j++) {
                        NodeMF t = new NodeMF(ary[id], id++, level);
                        ll.add(t);
                        c.addParent(t);
                    }
                } 
                ll.clear();
                //printNodes(n);
                System.out.printf("Now doing the make part%n");
                Stack<NodeMF> stack = new Stack<NodeMF>();
                stack.push(n);
                boolean status = makeFileNodesDFS(n, stack);
                stack.pop();
                if(status == true) {
                    //printNodes(n);
                    System.out.printf("OK PASS%n");
                }
                else {
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
                int sv = utils_.randInt(100,1000);
                //System.out.printf("%d sleep %d%n", i_, sv);
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
                    int sv = utils_.randInt(100,1000);
                    Thread.sleep(sv);
                    processV();
                    Thread.sleep(sv);
                    System.out.printf("%2d done %d%n", i_, v_);
                }
                catch(Exception e) {
                    e.printStackTrace();
                }
            }
            public void processV() {
                v_ = 100;
                for(int i = 0; i < i_.intValue(); i++) {
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
            List<Runnable> list = new ArrayList<Runnable>();
            for(int i = 0; i < numInst_; i++) {
                Runnable worker = new RunnableEx0(i);
                list.add(worker);
            }
            for(int i = 0; i < numInst_; i++) {
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
            }
            catch(Exception e) {
                e.printStackTrace();
            }
            System.out.printf("Exe is terminated%n");
        }
        public void run_test_callable1() {
            List<Future<Integer>> list = new ArrayList<Future<Integer>>();
            Callable<Integer> callable;
            for(int i = 0; i < numInst_; i++) {
                callable = new CallableEx0(i);
                Future<Integer> future = exe_.submit(callable);
                list.add(future);
            }
            // now do blocking wait for all tasks to finish,
            // so the ordering is preserved as 0:numInst_
            for(Future<Integer> fut : list) {
                try {
                    Integer i = fut.get();
                    System.out.printf("Future result i:%d%n", i);
                }
                catch(InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
            }
            exe_.shutdown();
        }
        public void run_test_callable2() {
            Callable<Integer> callable;
            List<Callable<Integer>> list = new ArrayList<Callable<Integer>>();
            for(int i = 0; i < numInst_; i++) {
                callable = new CallableEx0(i);
                list.add(callable);
            }
            try {
                List<Future<Integer>> futures = exe_.invokeAll(list);
                exe_.shutdown();
                int timeout = 1000;
                exe_.awaitTermination(timeout, TimeUnit.SECONDS);
                for(Future<Integer> fut : futures) {
                    try {
                        Integer i = fut.get();  // this is blocking, like join
                        System.out.printf("Future result i:%d%n", i);
                    }
                    catch(InterruptedException | ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        public void run_test_completion_service0() {
            CompletionService<Integer> cs = new 
                ExecutorCompletionService<Integer>(exe_);
            Callable<Integer> callable;
            try {
                for(int i = 0; i < numInst_; i++) {
                    callable = new CallableEx0(i);
                    cs.submit(callable);
                }
                System.out.printf("shutdown called, else never ends%n");
                exe_.shutdown();
                int timeout = 1000;
                exe_.awaitTermination(timeout, TimeUnit.SECONDS);
                for(int i = 0; i < numInst_; i++) {
                    Future<Integer> fut = cs.take();
                    System.out.printf("%2d future: %2d%n", i, fut.get());
                }
                System.out.printf("shutdown could have been called here%n");
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        public void run_test_completion_service1() {
            // what if you don't know how many jobs there are and you
            // want to loop until timeout?
            CompletionService<Integer> cs = 
                new ExecutorCompletionService<Integer>(exe_);
            Callable<Integer> callable;
            try {
                int sz = 100000;
                for(int i = 0; i < sz; i++) {
                    callable = new CallableEx0(i);
                    cs.submit(callable);
                }
            }
            catch(Exception e) {
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
        public void t0() {
            String sBase = "test_";
            for(int i = 0; i < 5; i++) {
                String sName = sBase + String.valueOf(i);
                System.out.printf("%s%n", sName);
            }
        }
        @SuppressWarnings("unchecked")
        public void t1() {
            System.out.printf("generic vs casting%n");
            String s;
            List l0 = new ArrayList();
            l0.add("hello");
            List<String> l1 = new ArrayList<String>();
            l1.add("hello");
            s = (String)l0.get(0);
            System.out.printf("casted  val:%s%n", s);
            s = l1.get(0);
            System.out.printf("generic val:%s%n", s);
        }
        public void test() {
            t1();
        }
    }
    class TestTests {
        public void t00() {
            Syntaxes t = new Syntaxes();
            t.test();
        }
        public void t01() {
            Makefile t = new Makefile();
            t.test();
        }
        public void t02() {
            ExecutorExamples t = new ExecutorExamples();
            t.test();
        }
        public void t03() {
            utils_.loadStringSet("ab");
            utils_.test();
        }
        public void t04() {
            MiscCases t = new MiscCases();
            t.test();
        }
        public void t05() {
            SyntaxExamples t = new SyntaxExamples();
            t.test();
        }
        public void t06() {
            GraphClass t = new GraphClass();
            t.test();
        }
        public void t07() {
            IOTest t = new IOTest();
            t.test();
        }
        public void test() {
            t06();
        }
    }
    public Test() {
        var_abc_    = 4;
        var_abd_    = 40;
        if(GID_ == null) {
            GID_ = new AtomicInteger();
        }
    }
    public void test() {
        TestTests t = new TestTests();
        utils_.updateTime();
        t.test();
        utils_.printTimeDiff();
    }
    public static void main(String [] args) {
        Test t = new Test();
        t.test();
    }
}
