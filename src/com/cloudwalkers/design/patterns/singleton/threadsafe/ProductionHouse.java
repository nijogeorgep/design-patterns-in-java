/**
 * 
 */
package com.cloudwalkers.design.patterns.singleton.threadsafe;

/**
 * @author nijogeorgep
 *
 */
public class ProductionHouse {
  private static ProductionHouse productionHouse = null;

  private ProductionHouse() {}

  public static synchronized ProductionHouse getInstance() {
    if (productionHouse == null) {
      productionHouse = new ProductionHouse();
    }
    return productionHouse;
  }
}
