/**
 * 
 */
package com.cloudwalkers.design.patterns.decorator;

/**
 * @author nijogeorgep
 *
 */
public class Mushroom extends ToppingDecorator {

  Pizza pizza;

  public Mushroom(Pizza pizza) {
    this.pizza = pizza;
  }

  @Override
  public String getDescription() {
    return pizza.getDescription() + ", Mushroom";
  }

  @Override
  public double cost() {
    return 0.25 + pizza.cost();
  }

}
