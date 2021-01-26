package com.cloudwalkers.design.patterns.command;

public interface FileSystemReceiver {
    public void openFile();
    public void writeFile();
    public void closeFile();
}
