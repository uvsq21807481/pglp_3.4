package uvsq21807481;

interface Printer {
    void print();
    void fax();
}

interface Scanner {
    void scan();
}

interface Copier {
    void copy();
}

public class SimplePrinter implements Printer{

    @Override
    public void print() { /* print a document */}

    @Override
    public void fax() { throw new UnsupportedOperationException(); }

}

class SimpleScanner implements Scanner{

    @Override
    public void scan() { /* scan a document */}
}

class SimpleCopier implements Copier{

    @Override
    public void copy() { /* copies a document */}
}