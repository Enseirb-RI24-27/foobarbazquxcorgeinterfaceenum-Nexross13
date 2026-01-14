package com.jad;

public enum EBaz implements IBaz {
    BAZ1("Baz1"),
    BAZ2("Baz2"),
    BAZ3("Baz3");

    private String name;

    EBaz(String name) {
        this.name = name;
    }

    //getter
    public String getName() {
        return name;
    }

    @Override
    public void doSomethingLikeABaz() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'doSomethingLikeABaz'");
    }
}
