# COMPX201 Assignment 1: Linked List and Lottery Simulation

## Description

This project is an assignment for COMPX201, which consists of two parts:
1.  Implementation of a dynamic linked list for Strings in Java (StrLinkedList).
2.  A program that simulates a lottery draw using the linked list implementation (LottoDraw) will later show in Part2 URL

## Features

### Part One: String Linked List (`StrLinkedList.java`)

A custom dynamic linked list implementation (`StrLinkedList`) with the following functionalities:

* `isEmpty()`: Returns `true` if the list is empty, `false` otherwise.
* `getLength()`: Returns the number of nodes in the list. 
* `hasValue(String s)`: Returns `true` if the list contains a node with the value `s`, `false` otherwise. 
* `getValueAt(int i)`: Returns the String value at a given position `i`.
* `add(String s)`: Adds a new node with the String value `s` to the head of the list. 
* `remove(String s)`: Removes the first node with the String value `s`. 
* `print()`: Prints all values in the list in order, separated by "->". 

The `StrLinkedList` class includes an inner `Node` class to store the String value and a reference to the next node. 


## How to Compile and Run

The Java code should be compiled and run as a console program from the command line.
PLZ run test.java, not main.java
