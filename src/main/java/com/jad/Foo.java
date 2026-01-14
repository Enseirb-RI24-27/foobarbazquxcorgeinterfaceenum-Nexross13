package com.jad;
import java.util.ArrayList;
import java.util.List;

public class Foo implements IFoo {
    private IBaz baz;
    private List<IBar> bars = new ArrayList<>();
    private IQux qux = new Qux();
    private ICorge corge;

    public Foo(IBaz baz) {
        this.baz = baz;
    }

    // Getters
    public IBaz getBaz() {
        return baz;
    }

    public List<IBar> getBars() {
        return bars;
    }

    public IQux getQux() {
        return qux;
    }

    public ICorge getCorge() {
        return corge;
    }

    //setters

    public void setCorge(ICorge corge) {
        this.corge = corge;
    }

    // Methods

    public void addBar(IBar bar) {
        this.bars.add(bar);
    }
}
