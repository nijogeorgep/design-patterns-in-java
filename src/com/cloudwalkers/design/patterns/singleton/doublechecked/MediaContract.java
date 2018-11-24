/**
 * 
 */
package com.cloudwalkers.design.patterns.singleton.doublechecked;

/**
 * @author nijogeorgep
 *
 */
public class MediaContract extends Thread {
  public void run() {
    getProductionHouse();
  }

  public void getProductionHouse() {
    ProductionHouse productionHouse = ProductionHouse.getInstance();
    System.out.println(productionHouse.toString());
  }

  public static void main(String args[]) {
    MediaContract thread01 = new MediaContract();
    thread01.start();
    MediaContract thread02 = new MediaContract();
    thread02.start();
  }

}
