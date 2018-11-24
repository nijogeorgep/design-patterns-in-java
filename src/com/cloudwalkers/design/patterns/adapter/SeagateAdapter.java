/**
 * 
 */
package com.cloudwalkers.design.patterns.adapter;

/**
 * @author nijogeorgep
 *
 */
public class SeagateAdapter implements Computer {

  SeagateGeneric seagateGenericDrive;

  public SeagateAdapter(SeagateGeneric seagateGenericDrive) {
    this.seagateGenericDrive = seagateGenericDrive;
  }

  @Override
  public void bufferData() {
    seagateGenericDrive.read();
    seagateGenericDrive.read();
    seagateGenericDrive.read();
  }

  @Override
  public void flushData() {
    seagateGenericDrive.write();
    seagateGenericDrive.write();
  }

  @Override
  public void purgeData() {
    System.out.println("Operation Not Supported: Seagate Drive cannot Purge Data...");
  }

}
