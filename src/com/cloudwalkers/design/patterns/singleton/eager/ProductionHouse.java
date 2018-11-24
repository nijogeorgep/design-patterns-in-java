/**
 * 
 */
package com.cloudwalkers.design.patterns.singleton.eager;

/**
 * @author nijogeorgep
 *
 */
public class ProductionHouse {
  private static ProductionHouse productionHouse = new ProductionHouse();

  private ProductionHouse() {}

  public static synchronized ProductionHouse getInstance() {
    return productionHouse;
  }
}
