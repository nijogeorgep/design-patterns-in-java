package com.cloudwalkers.design.patterns.command;

public class FileSystemClient {

    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fileSystemReceiver = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fileSystemReceiver);

        //Creating invoker and associating with Command
        FileInvoker fileInvoker = new FileInvoker(openFileCommand);

        //perform action on invoker object
        fileInvoker.executeCommand();


        WriteFileCommand writeFileCommand = new WriteFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(writeFileCommand);
        fileInvoker.executeCommand();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fileSystemReceiver);
        fileInvoker = new FileInvoker(closeFileCommand);
        fileInvoker.executeCommand();
    }
}
