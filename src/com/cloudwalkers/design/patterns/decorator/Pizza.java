/**
 * 
 */
package com.cloudwalkers.design.patterns.decorator;

/**
 * @author nijogeorgep
 *
 */
public abstract class Pizza {
  protected String description = null;

  public String getDescription() {
    return description;
  }

  public abstract double cost();
}
