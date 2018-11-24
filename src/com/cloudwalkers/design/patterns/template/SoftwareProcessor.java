/**
 * 
 */
package com.cloudwalkers.design.patterns.template;

/**
 * @author nijogeorgep
 *
 */
public abstract class SoftwareProcessor {

  public void deliverSoftware() {
    requirementsClarification();
    functionalSpecification();
    technicalSpecification();
    implementModules();
    testModules();
    if (!isPlatformIndependent())
      platformTest();
    supportPhase();
  }

  public void requirementsClarification() {
    System.out.println("Default Requirements Clarification");
  }

  public void functionalSpecification() {
    System.out.println("Default Functional Specification");
  }

  public void technicalSpecification() {
    System.out.println("Default Technical Specification");
  }

  public abstract void implementModules();

  public abstract void testModules();

  public boolean isPlatformIndependent() {
    return false;
  }

  public abstract void platformTest();

  public void supportPhase() {
    System.out.println("Default Support Contract");
  }

}
