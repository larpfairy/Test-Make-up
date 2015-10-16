package cs271.lab.list;

/**
 * Created by micha_000 on 10/15/2015.
 */
public class DefaultIntPair implements Pair<Integer, Integer> {
    protected int first, second;
    public DefaultIntPair(int first, int second){
        this.first = first;
        this.second = second;
    }
    public Integer first(){
        return this.first;
    }
    public Integer second(){
        return this.second;
    }
    public String toString(){
        return "<" + this.first() + ", " + this.second() + ">";
    }
    public boolean equals(final Pair that){
        return (that != null) && (this.first() == that.first()) && (this.second() == that.second());
    }
    public Pair reverse(){
        int temp;
        temp = this.first();
        this.first = this.second();
        this.second = temp;
        return this;
    }
}
