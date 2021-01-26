package com.cloudwalkers.design.patterns.chainofresponsibility;

public interface DispenseChain {
    public void setNextChain(DispenseChain nextChain);
    public void dispense(Currency currency);
}
