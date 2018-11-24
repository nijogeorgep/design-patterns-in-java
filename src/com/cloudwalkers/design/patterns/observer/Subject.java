/**
 * 
 */
package com.cloudwalkers.design.patterns.observer;

/**
 * @author nijogeorgep
 *
 */
public interface Subject {
  public void addObserver(Observer o);

  public void removeObserver(Observer o);

  public void notifyObservers();
}
