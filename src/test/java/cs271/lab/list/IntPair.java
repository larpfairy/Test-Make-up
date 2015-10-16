package cs271.lab.list;

/**
 * Created by micha_000 on 10/15/2015.
 */
public interface IntPair {
        int first();
        int second();
        IntPair reverse();
        String toString();
        boolean equals(final IntPair that);
}
