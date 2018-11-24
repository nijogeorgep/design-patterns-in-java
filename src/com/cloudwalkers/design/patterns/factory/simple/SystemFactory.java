/**
 * 
 */
package com.cloudwalkers.design.patterns.factory.simple;

/**
 * @author nijogeorgep
 *
 */
public class SystemFactory {
  public System createSystem(String type) {
    System system = null;
    if (type.equals("WIN")) {
      system = new WindowsSystem();
    } else if (type.equals("LIN")) {
      system = new LinuxSystem();
    } else if (type.equals("SOL")) {
      system = new SolarisSystem();
    } else if (type.equals("MAC")) {
      system = new MacosSystem();
    } else {
      system = new UnixSystem();
    }
    return system;
  }
}
