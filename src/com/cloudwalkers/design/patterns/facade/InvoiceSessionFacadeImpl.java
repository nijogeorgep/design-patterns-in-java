/**
 * 
 */
package com.cloudwalkers.design.patterns.facade;

/**
 * @author nijogeorgep
 *
 */
public class InvoiceSessionFacadeImpl implements InvoiceSessionFacade {

  // This is only for the example, Do not follow
  // this kind of initialisation in your code
  OrderManager orderManager = new OrderManager();
  LedgerManager ledgerManager = new LedgerManager();
  BillingManager billingManager = new BillingManager();

  @Override
  public void addInvoice(Invoice invoice) {
    orderManager.initOnInvoice(invoice.getInvoiceId());
    ledgerManager.initOnInvoice(invoice.getInvoiceId());
    billingManager.initOnInvoice(invoice.getInvoiceId());
  }

  @Override
  public void deleteInvoice(Invoice invoice) {
    orderManager.purgeInvoice(invoice.getInvoiceId());
    ledgerManager.cascadeDeleteInvoice(invoice.getInvoiceId());
    billingManager.deleteInvoice(invoice.getInvoiceId());
  }

}
