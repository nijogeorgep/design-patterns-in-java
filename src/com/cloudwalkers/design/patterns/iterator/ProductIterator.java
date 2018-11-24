/**
 * 
 */
package com.cloudwalkers.design.patterns.iterator;

/**
 * @author nijogeorgep
 *
 */
public class ProductIterator implements Iterator {
  ProductItem[] productItems;
  int marker = 0;

  public ProductIterator(ProductItem[] productItems) {
    this.productItems = productItems;
  }

  @Override
  public boolean hasNext() {
    boolean hasNext = false;
    if (marker < productItems.length)
      hasNext = true;
    return hasNext;
  }

  @Override
  public Object next() {
    ProductItem productItem = null;
    if (marker < productItems.length)
      productItem = productItems[marker++];
    return productItem;
  }
}
