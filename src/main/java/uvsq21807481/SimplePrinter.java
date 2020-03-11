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
    public void scan() { thrown new UnsupportedOperationException(); }

    @Override
    public void copy() { thrown new UnsupportedOperationException(); }

    @Override
    public void fax() { thrown new UnsupportedOperationException(); }

}