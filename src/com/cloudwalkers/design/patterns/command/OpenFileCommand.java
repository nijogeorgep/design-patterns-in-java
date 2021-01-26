package com.cloudwalkers.design.patterns.command;

/**
 * @author nijogeorgep
 *
 */
public class OpenFileCommand implements Command{

    private FileSystemReceiver fileSystem;

    public OpenFileCommand(FileSystemReceiver fileSystem) {
        this.fileSystem = fileSystem;
    }

    @Override
    public void execute() {
        this.fileSystem.openFile();
    }
}
