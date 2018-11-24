/**
 * 
 */
package com.cloudwalkers.design.patterns.observer;

/**
 * @author 553243
 *
 */
public interface Observer {
  public void update(String stockSymbol, Float stockValue, Integer stockUnits);
}
