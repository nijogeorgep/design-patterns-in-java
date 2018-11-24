/**
 * 
 */
package com.cloudwalkers.design.patterns.facade;

/**
 * @author nijogeorgep
 *
 */
public interface InvoiceSessionFacade {
  public void addInvoice(Invoice invoice);

  public void deleteInvoice(Invoice invoice);
}
