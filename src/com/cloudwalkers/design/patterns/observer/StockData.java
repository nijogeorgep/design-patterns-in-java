/**
 * 
 */
package com.cloudwalkers.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author nijogeorgep
 *
 */
public class StockData implements Subject {

  private String stockSymbol = null;
  private Float stockValue = null;
  private Integer stockUnits = null;
  private List<Observer> observers = null;

  public StockData() {
    observers = new ArrayList<Observer>();
  }

  @Override
  public void addObserver(Observer o) {
    observers.add(o);
  }

  @Override
  public void notifyObservers() {
    for (Observer o : observers) {
      o.update(stockSymbol, stockValue, stockUnits);
    }
  }

  @Override
  public void removeObserver(Observer o) {
    observers.remove(o);
  }

  public void setStockData(String stockSymbol, Float stockValue, Integer stockUnits) {
    // In real-time, this method might be invoked with values from a live web
    // service at regular intervals.
    this.stockSymbol = stockSymbol;
    this.stockValue = stockValue;
    this.stockUnits = stockUnits;
    setDataChanged();
  }

  private void setDataChanged() {
    notifyObservers();
  }

}
