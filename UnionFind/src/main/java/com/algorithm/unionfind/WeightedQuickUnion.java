package main.java.com.algorithm.unionfind;

public class WeightedQuickUnion extends QuickUnionUF
{
    protected int[] id;
    protected int[] sz;

    public WeightedQuickUnion(int N) {
        super(N);
        sz = new int[N];
    }

    public void union(int p, int q) {
        int i = root(p);
        int j = root(q);
        if (sz[i] <sz[j]) {
            id[i] = j;
            sz[j] += sz[i];
        } else {
            id[j] = i;
            sz[i] += sz[j];
        }
    }
}
