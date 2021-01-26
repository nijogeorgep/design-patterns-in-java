/**
 *
 */
package com.cloudwalkers.design.patterns.builder;

/**
 * @author nijogeorgep
 *
 */
public class TestBuilderPattern {
    public static void main(String args[]){
         Computer computer = new Computer.ComputerBuilder("HDD","RAM")
                 .setBluetoothEnabled(true)
                 .setGraphicsCardEnabled(true)
                 .build();

         System.out.println(computer.toString());
    }
}
