/**
 * 
 */
package com.cloudwalkers.design.patterns.state;

/**
 * @author nijogeorgep
 *
 */
public class OnlineShopping {

  State currentState;
  SelectionState selectionState;
  PurchaseState purchaseState;
  AuthoriseState authoriseState;
  AssembleState assembleState;
  DispatchState dispatchState;

  public OnlineShopping() {
    selectionState = new SelectionState(this);
    purchaseState = new PurchaseState(this);
    authoriseState = new AuthoriseState(this);
    assembleState = new AssembleState(this);
    dispatchState = new DispatchState(this);
    currentState = selectionState;
  }

  /**
   * @return the currentState
   */
  public synchronized State getCurrentState() {
    return currentState;
  }

  /**
   * @param currentState the currentState to set
   */
  public synchronized void setCurrentState(State currentState) {
    this.currentState = currentState;
  }

  /**
   * @return the selectionState
   */
  public synchronized SelectionState getSelectionState() {
    return selectionState;
  }

  /**
   * @param selectionState the selectionState to set
   */
  public synchronized void setSelectionState(SelectionState selectionState) {
    this.selectionState = selectionState;
  }

  /**
   * @return the purchaseState
   */
  public synchronized PurchaseState getPurchaseState() {
    return purchaseState;
  }

  /**
   * @param purchaseState the purchaseState to set
   */
  public synchronized void setPurchaseState(PurchaseState purchaseState) {
    this.purchaseState = purchaseState;
  }

  /**
   * @return the authoriseState
   */
  public synchronized AuthoriseState getAuthoriseState() {
    return authoriseState;
  }

  /**
   * @param authoriseState the authoriseState to set
   */
  public synchronized void setAuthoriseState(AuthoriseState authoriseState) {
    this.authoriseState = authoriseState;
  }

  /**
   * @return the assembleState
   */
  public synchronized AssembleState getAssembleState() {
    return assembleState;
  }

  /**
   * @param assembleState the assembleState to set
   */
  public synchronized void setAssembleState(AssembleState assembleState) {
    this.assembleState = assembleState;
  }

  /**
   * @return the dispatchState
   */
  public synchronized DispatchState getDispatchState() {
    return dispatchState;
  }

  /**
   * @param dispatchState the dispatchState to set
   */
  public synchronized void setDispatchState(DispatchState dispatchState) {
    this.dispatchState = dispatchState;
  }

  public void purchase(String itemName) {
    System.out.print(itemName);
    currentState.purchase();
  }

  public void authorise() {
    currentState.authorise();
  }

  public void assemble() {
    currentState.assemble();
  }

  public void dispatch() {
    currentState.dispatch();
  }

  public void complete() {
    currentState.complete();
  }

  public void setCurrentState(PurchaseState purchaseState2) {
    // TODO Auto-generated method stub

  }

}
