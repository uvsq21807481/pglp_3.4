package uvsq21807481;

interface Printer {
    void print();
    void copy();
    void fax();
}

interface Scanner {
    void scan();
}

public class SimplePrinter implements Printer{

    @Override
    public void print() { /* print a document */}

    @Override
    public void copy() { throw new UnsupportedOperationException(); }

    @Override
    public void fax() { throw new UnsupportedOperationException(); }

}

class SimpleScanner implements Scanner{

    @Override
    public void scan() { /* scan a document */}
    
}