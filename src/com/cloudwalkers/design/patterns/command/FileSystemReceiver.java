package com.cloudwalkers.design.patterns.command;

/**
 * @author nijogeorgep
 *
 */
public interface FileSystemReceiver {
    public void openFile();
    public void writeFile();
    public void closeFile();
}
