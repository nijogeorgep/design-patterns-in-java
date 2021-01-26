/**
 * 
 */
package com.cloudwalkers.design.patterns.factory.method;

/**
 * @author nijogeorgep
 *
 */
public class SonyStore extends MobileStore {

  /*
   * (non-Javadoc)
   * 
   * @see com.cts.design.patterns.factory.method.MobileStore#createMobile(java.lang. String)
   */
  @Override
  protected Mobile createMobile(String make) {
    Mobile mobile = null;
    if (make.equals("DSeries")) {
      mobile = new SonyASeries();
    } else if (make.equals("ESeries")) {
      mobile = new SonyASeries();
    } else if (make.equals("FSeries")) {
      mobile = new SonyASeries();
    }
    return mobile;
  }

}
