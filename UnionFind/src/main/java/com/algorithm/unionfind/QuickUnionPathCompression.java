package main.java.com.algorithm.unionfind;

public class QuickUnionPathCompression extends WeightedQuickUnion
{
    public QuickUnionPathCompression(int N) {
        super(N);
    }

    protected int root(int i) {
        while (i != id[i]) {
            id[i] = id[ id[i] ];
            i = id[i];
        }
        return i;
    }
}
