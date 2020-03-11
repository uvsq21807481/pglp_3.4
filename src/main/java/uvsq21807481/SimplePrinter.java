package uvsq21807481;

interface Printer {
    void print();
    void scan();
    void copy();
    void fax();
}

public class SimplePrinter implements Printer{

    @Override
    public void print() { /* print a document */}

    @Override
    public void scan() { throw new UnsupportedOperationException(); }

    @Override
    public void copy() { throw new UnsupportedOperationException(); }

    @Override
    public void fax() { throw new UnsupportedOperationException(); }

}