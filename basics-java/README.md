# Java Compilation and Execution Instructions

This guide explains how to compile and run a Java program from the terminal on **Windows** and **Ubuntu Linux**.

## Prerequisites

- Java Development Kit (JDK) installed
- Terminal (Ubuntu) or Command Prompt / PowerShell (Windows) access

## File Structure with Packages

Assume you have the following file structure:

```
project/
└── src/
    └── com/
        └── example/
            └── MyProgram.java
```

Where `MyProgram.java` starts with:

```java
package com.example;

public class MyProgram {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```

## Compilation Instructions

### Ubuntu Linux

1. Open the terminal.
2. Navigate to the `project` directory:
   ```bash
   cd /path/to/project
   ```
3. Compile the Java file:
   ```bash
   javac -d out src/com/example/MyProgram.java
   ```
   This creates the compiled `.class` files in the `out/` directory.

4. Run the program:
   ```bash
   java -cp out com.example.MyProgram
   ```

### Windows

1. Open Command Prompt or PowerShell.
2. Navigate to the `project` directory:
   ```cmd
   cd path\to\project
   ```
3. Compile the Java file:
   ```cmd
   javac -d out src\com\example\MyProgram.java
   ```
4. Run the program:
   ```cmd
   java -cp out com.example.MyProgram
   ```

## Notes

- `-d out` tells the compiler to place class files in the `out/` directory.
- `-cp` sets the classpath for the `java` runtime.
- Ensure the directory structure matches the package declaration.
