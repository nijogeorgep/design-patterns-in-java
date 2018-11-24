/**
 * 
 */
package com.cloudwalkers.design.patterns.template;

/**
 * @author nijogeorgep
 *
 */
public class SoftwareConsultants {

  /**
   * @param args
   */
  public static void main(String[] args) {
    SoftwareProcessor softwareProcessor01 = new CProcessor();
    softwareProcessor01.deliverSoftware();
    SoftwareProcessor softwareProcessor02 = new JavaProcessor();
    softwareProcessor02.deliverSoftware();
  }

}
