package com.cloudwalkers.design.patterns.chainofresponsibility;

import java.util.Scanner;

public class ATMDispenseChain {

    private DispenseChain dispenseChainOne;

    public ATMDispenseChain() {
        this.dispenseChainOne = new Dollar50Dispenser();
        DispenseChain dispenseChainTwo = new Dollar20Dispenser();
        DispenseChain dispenseChainThree = new Dollar10Dispenser();

        dispenseChainOne.setNextChain(dispenseChainTwo);
        dispenseChainTwo.setNextChain(dispenseChainThree);
    }

    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount % 10 != 0) {
                System.out.println("Amount should be in multiple of 10s.");
                return;
            }
            // process the request
            atmDispenser.dispenseChainOne.dispense(new Currency(amount));
        }

    }
}
