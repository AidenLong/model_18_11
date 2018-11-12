package com.me.proxy.demo;

public class ProxyLawyer implements ILawSuit {

    ILawSuit lawSuit;

    public ProxyLawyer(ILawSuit iLawSuit) {
        this.lawSuit = iLawSuit;
    }

    @Override
    public void submit(String proof) {
        lawSuit.submit(proof);
    }

    @Override
    public void defend() {
        lawSuit.defend();
    }
}
