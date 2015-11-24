
import edu.princeton.cs.algs4.UF;
//import java.io.PrintWriter;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.In;

/**
 * Reads in a an integer <tt>N</tt> and a sequence of pairs of integers
 * (between <tt>0</tt> and <tt>N-1</tt>) from standard input, where each integer
 * in the pair represents some site;
 * if the sites are in different components, merge the two components
 * and print the pair to standard output.
 */

public class testUnionFind{
    
    
        public static void main(String[] args) {
        int N = StdIn.readInt();
        UF uf = new UF(N);
        while (!StdIn.isEmpty()) {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (uf.connected(p, q)) continue;
            uf.union(p, q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(uf.count() + " components");
    }
    
      
    
}