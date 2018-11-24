/**
 * 
 */
package com.cloudwalkers.design.patterns.factory.method;

/**
 * @author nijogeorgep
 *
 */
public class MobileStoreCentre {
  @SuppressWarnings("unused")
  public static void main(String args[]) {
    MobileStore mobileStore01 = new NokiaStore();
    MobileStore mobileStore02 = new SonyStore();
    Mobile mobile01 = mobileStore01.assemble("ASeries");
    Mobile mobile02 = mobileStore02.assemble("BSeries");
  }
}
