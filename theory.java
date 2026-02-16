/* Java was developed by Sun Microsystems (a subsicidiry company of Oracle)  
Initiated by James Gosling in 1991 
1st version released in 1995 
Green Tream 

Name Evolution - 
GreenTalk (Extension = .gt) -> Oak (symbol of strength)  -> Java 

Version History -
Java SE 8 (LTS - Long Term Support) - Released in 18th March 2014

Features of Java - 
1. Object Oriented
2. Platform Independent
3. Simple and Secured
4. Architecture Neutral ( 32 bit, 64 bit )
5. Java is strongly typed language) if any language ask to write the data type before then it is strongly typed lang  . 
(In the terms of JVM it is not strongly typed (Dynamic))
Java = Compiled + Interpreted Language
6. Multithreaded
(Multiple tasks can be performed simultaneously)


** JAVA vs C++ **
1. No explicit pointers in Java unlike C++ for security measures
2. No multiple inheritance in Java (to avoid ambiguity) but we can partially achieve it through interfaces
3. No operator overloading in Java , however + operator can be overloaded to concatenate strings
4. No need to deallocate the memory , Java has an automatic garbage collector to manage memory
5. Errors and Exceptions are different in JAVA
6. Java does not have access specifiers like C++ (eg: friend, protected etc.) , Java has access modifiers (eg: public, private, default, protected)
Note -> If u are not mentioming any access modifier it is considered as default access modifier
7. Java connections equivalent to STL in C++
8. We don't call function as function , we call it as methods in Java
9. Abstraction in Java is achieved through abstract classes and interfaces.
10. C++ is semi oriented but Java is not 100% but almost object oriented.
11. C++ is single thread but Java is multi thread



JDK - Java Development Kit (Compiler + JRE + API's)
JRE - Java Runtime Environment (JVM + Libraries)
JVM - Java Virtual Machine (Interprets the bytecode to machine code)   -> WOrks on Runtime Environment -> Uses Interpreter + JIT Compiler (Just In Time Compiler)


** Platform Independency -
platform - it is like our OS (Operating System)
JAVA works on WORA (Write Once Run Anywhere) policy

JVM Architecture -
----------------------------------
1. Class Loader - Loads the .class files (bytecode files)
2. Bytecode Verifier - Verifies the bytecode for security purpose
3. Interpreter - Interprets the bytecode to machine code line by line
4. JIT Compiler - It is used to improve the performance of the application by compiling the bytecode to machine code in a single go
5. Runtime Data Areas - It is used to store the data during the execution of the program        

Flow chart of Java Program Execution -
Source Code (.java)  ->  Compiler (javac)  ->  Bytecode (.class)  ->  JVM  ->  Machine Code (Execution)

Flow chart of JVM Architecture -
Source Code (.java)  ->  Compiler (javac)  ->  Bytecode (.class)  ->  Class Loader  ->  Bytecode Verifier (memory area) ->  Interpreter + JIT Compiler (execution engine)  ->  Runtime Data Areas  ->  Machine Code (Execution)

While laoding the claases to the class loader , JVM looks for the first class with main method to start the execution of the program



Class Loader - 
-----------------
1. Bootstrap class loader ->  loads the inbild classes of Java (rt.jar)
2. Extension class loader ->  loads the extension libraries (ext folder) 
3. System/Application class loader ->  loads the classes from your code  (environment variable)





-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Data Types in Java -
1. Primitive Data Types - byte, short, int, long, float, double, char

-> Numeric Data Types - int(4 bytes) , byte(1 byte), short(2 bytes), long(8 bytes), float(4 bytes)(upto 7 decimals), double(8 bytes)(upto 16 decimals).
-> Character Data Type - char(2 bytes) , boolean(1 bite , and also depends on the JVM implementation)
2. Non-Primitive Data Types - String, Arrays, Classes, Interfaces, etc.
-> Arrays and Strings are considered as Class in JAVA.



----------------------------------------------------------------------------------------------------------------------------------------------

----Package ----
is equivalent to namespace in C++
Package is set or collection of realted classes , interfaces and subpackages
Types ->  1. Inbuild Package      2. User defined Package

Inbuild Packages -> 
1.java.lang
2.java.util
3.java.io

User defined Packages ->
1. We can create our own package by using the package keyword followed by the package name
2. We can import the package using the import keyword followed by the package name and class name

Benefits of Packages ->
1. It helps in avoiding name conflicts btw classes.
2. It makes the code modular and well-documented.
3. Provides more security using access modifiers.


*/