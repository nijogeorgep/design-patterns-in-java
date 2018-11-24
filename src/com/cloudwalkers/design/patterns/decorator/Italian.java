/**
 * 
 */
package com.cloudwalkers.design.patterns.decorator;

/**
 * @author nijogeorgep
 *
 */
public class Italian extends Pizza {

  public Italian(String description) {
    this.description = description + ", Italian";
  }

  @Override
  public double cost() {
    return 1.20;
  }

}
