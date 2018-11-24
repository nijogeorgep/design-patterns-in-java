/**
 * 
 */
package com.cloudwalkers.design.patterns.observer;

/**
 * @author nijogeorgep
 *
 */
public class IncomeHandler implements Observer {

  Subject stockData = null;

  public IncomeHandler(Subject stockData) {
    this.stockData = stockData;
    stockData.addObserver(this);
  }

  @Override
  public void update(String stockSymbol, Float stockValue, Integer stockUnits) {
    System.out.println("IncomeHandler received changes... ");
  }

}
