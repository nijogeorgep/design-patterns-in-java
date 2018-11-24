/**
 * 
 */
package com.cloudwalkers.design.patterns.factory.method;

/**
 * @author nijogeorgep
 *
 */
public abstract class MobileStore {
  public Mobile assemble(String make) {
    Mobile mobile;
    mobile = createMobile(make);
    mobile.chassis();
    mobile.integrity();
    mobile.experience();
    mobile.software();
    mobile.box();
    return mobile;
  }

  protected abstract Mobile createMobile(String make);
}
