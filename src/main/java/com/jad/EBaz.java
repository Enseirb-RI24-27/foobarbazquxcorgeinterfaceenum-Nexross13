package com.jad;

public enum EBaz implements IBaz {
    BAZ1("BAZ1"),
    BAZ2("BAZ2"),
    BAZ3("BAZ3");

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
