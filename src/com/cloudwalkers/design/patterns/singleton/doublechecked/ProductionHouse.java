/**
 * 
 */
package com.cloudwalkers.design.patterns.singleton.doublechecked;

/**
 * @author nijogeorgep
 *
 */
public class ProductionHouse {
  private static ProductionHouse productionHouse = null;

  private ProductionHouse() {}

  public static ProductionHouse getInstance() {
    if (productionHouse == null) {
      synchronized (ProductionHouse.class) {
        if (productionHouse == null) {
          productionHouse = new ProductionHouse();
        }
      }
    }
    return productionHouse;
  }
}
