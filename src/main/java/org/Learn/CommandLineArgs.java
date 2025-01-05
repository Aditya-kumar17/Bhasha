package org.Learn;

public class CommandLineArgs {


    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Command line arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command line arguments found.");
        }
    }


// PS D:\Study\Test> javac Test.java
// PS D:\Study\Test> java Test args1 args2 args3
// Command line arguments:
// Argument 0: args1
// Argument 1: args2
// Argument 2: args3
// PS D:\Study\Test>
}
