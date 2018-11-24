/**
 * 
 */
package com.cloudwalkers.design.patterns.factory.abstract_;

import com.cloudwalkers.design.patterns.factory.method.MobileStore;
import com.cloudwalkers.design.patterns.factory.method.NokiaStore;
import com.cloudwalkers.design.patterns.factory.method.SonyStore;

/**
 * @author nijogeorgep
 * 
 *         The Abstract Factory Design Pattern will instantiate the appropriate abstract factory.
 */
public class MobileStoreFactory {
  // Get Abstract Factory
  public static MobileStore getMobileStore(String mobileStore) {
    MobileStore mStore = null;
    if ("Nokia".equalsIgnoreCase(mobileStore))
      mStore = new NokiaStore();
    else if ("Sony".equalsIgnoreCase(mobileStore))
      mStore = new SonyStore();
    return mStore;
  }
}
