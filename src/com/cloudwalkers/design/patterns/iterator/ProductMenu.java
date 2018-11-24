/**
 * 
 */
package com.cloudwalkers.design.patterns.iterator;

/**
 * @author nijogeorgep
 *
 */
public class ProductMenu {

  ProductItem[] productItems;
  int maxSize = 0;

  public ProductMenu(int size) {
    maxSize = size;
    productItems = new ProductItem[size];
  }

  public ProductIterator createIterator() {
    return new ProductIterator(productItems);
  }

  public void addReplaceItem(int index, ProductItem productItem) {
    if (index > maxSize)
      System.out.println("Cannot Add as Index Increases MaxSize");
    else
      productItems[index] = productItem;
  }

}
