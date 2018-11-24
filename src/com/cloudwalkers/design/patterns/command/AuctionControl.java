/**
 * 
 */
package com.cloudwalkers.design.patterns.command;

import java.util.HashMap;
import java.util.Map;

/**
 * @author nijogeorgep
 *
 */
public class AuctionControl {
  Map<String, AuctionItem> auctionItems = new HashMap<String, AuctionItem>();

  public void setAuctionItem(String itemKey, AuctionItem auctionItem) {
    auctionItems.put(itemKey, auctionItem);
  }

  public void presentItem(String itemKey) {
    AuctionItem auctionItem = auctionItems.get(itemKey);
    auctionItem.sell();
  }
}
