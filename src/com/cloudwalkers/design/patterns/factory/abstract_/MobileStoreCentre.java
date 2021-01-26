/**
 * 
 */
package com.cloudwalkers.design.patterns.factory.abstract_;

import com.cloudwalkers.design.patterns.factory.method.Mobile;
import com.cloudwalkers.design.patterns.factory.method.MobileStore;

/**
 * @author nijogeorgep
 *
 */
public class MobileStoreCentre {

  /**
   * @param args
   */
  public static void main(String[] args) {

    MobileStore mobileStore = MobileStoreFactory.getMobileStore("Nokia");
    Mobile mobile = mobileStore.assemble("ASeries");
    mobile.experience();
    System.out.println("");
    mobileStore = MobileStoreFactory.getMobileStore("Sony");
    mobile = mobileStore.assemble("ASeries");
    mobile.experience();
  }

}
