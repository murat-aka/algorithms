import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;
import edu.princeton.cs.algs4.StdOut;


/**
 * <b>Monte Carlo simulation.</b> To estimate the percolation threshold, 
 * The fraction of sites that are opened when the system percolates provides an estimate of the percolation threshold.
 * For example, if sites are opened in a 20-by-20 lattice, then our estimate of the percolation threshold is 204/400 = 0.51 because the system percolates when the 204th site is opened.
 * By repeating this computation experiment T times and averaging the results, we obtain a more accurate estimate of the percolation threshold. 
 * Assuming T is sufficiently large (say, at least 30), provides a 95% confidence interval for the percolation threshold:
 */
public class PercolationStats {
    private final double[] thresholds;
    private final int n;
    private final int t;
    
    /**
     * perform T independent computational experiments on an N-by-N grid
     * @param N grid size
     * @param T no of samples
     */
    public PercolationStats(int N, int T) {
        if (N < 0 || T < 1) {
            throw new IllegalArgumentException("N or T < 0");
        }
        // perform T independent computational experiments on an N-by-N grid
        thresholds = new double[T];
        n = N;
        t = T;
        runMonteCarloSimulation();
    }

    /**
     * return the mean of the sampled tresholds
     * @return the mean of the tresholds
     */
    public double mean() {
        return StdStats.mean(thresholds);
    }

    /**
     * return the standard deviation of the sampled tresholds
     * @return the standard deviation of the tresholds
     */
    public double stddev() {
        return StdStats.stddev(thresholds);
    }

    /**
     * run T sampled percolation simulations on grid N
     */
    private void runMonteCarloSimulation() {
        final int N = n;
        final int T = t;
        final double totalSites = N*N;
        
        for (int i = 0; i < T; i++) {
            double noOfOpenSites = 0;
            final Percolation percolation = new Percolation(N);
            
            while (!percolation.percolates()) {
                final int randI = randInt(N);
                final int randJ = randInt(N);
                
                if (!percolation.isOpen(randI, randJ)) {
                    percolation.open(randI, randJ);
                    noOfOpenSites++;
                }
            }
            
            // Percolation complete; now record threshold
            final double threshold = noOfOpenSites / totalSites;
            thresholds[i] = threshold;
        }
    }
    
    /**
     * main method to run the simulation
     * @param args two strings, N and T
     */
    public static void main(final String[] args) {
        if (args.length < 2) {
            StdOut.println("You must pass two arguments");
        }

        final int N = Integer.valueOf(args[0]);
        final int T = Integer.valueOf(args[1]);
        
        final PercolationStats stats = new PercolationStats(N, T);
        
        final double mean = stats.mean();
        final double stddev = stats.stddev();
        StdOut.println("mean                    = " + mean);
        StdOut.println("stddev                  = " + stddev);
        StdOut.println("95% confidence interval = " 
                +
                (mean - (1.96*stddev/Math.sqrt(T)))
                + ", "
                +
                (mean + (1.96*stddev/Math.sqrt(T))));
    }
    
    /**
     * low  endpoint of 95% confidence interval
     * 
     */
    public double confidenceLo(){
        
        final PercolationStats stats = new PercolationStats(n, t);
        final double mean = stats.mean();
        final double stddev = stats.stddev();
        double confidenceLo = (mean - (1.96*stddev/Math.sqrt(t)));
        return confidenceLo;
    }
    
    
    /**
     * high endpoint of 95% confidence interval
     */
    public double confidenceHi(){
        final PercolationStats stats = new PercolationStats(n, t);
        final double mean = stats.mean();
        final double stddev = stats.stddev();
        double confidenceHi = (mean + (1.96*stddev/Math.sqrt(t)));
        return confidenceHi;
    }


    private static int randInt(final int noOfBlockedSites) {
        return StdRandom.uniform(noOfBlockedSites) + 1;
    }
}