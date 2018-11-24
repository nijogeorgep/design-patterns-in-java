/**
 * 
 */
package com.cloudwalkers.design.patterns.state;

/**
 * @author nijogeorgep
 *
 */
public interface State {
  public void purchase();

  public void authorise();

  public void assemble();

  public void dispatch();

  public void complete();
}
