package cs271.lab.list;

/**
 * Created by micha_000 on 10/15/2015.
 */
public interface Pair<T,F> {
    T first();
    F second();
    Pair reverse();
    String toString();
    boolean equals(final Pair that);
}

