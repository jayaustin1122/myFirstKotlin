package com.oop1

abstract class Animal {
/*
Abstract Functions
1. it can have abstract functions
2. abstract functions are functions without body/implementation
3. only abstract classes can have abstract functions
4. you cannot create an object from an abstract class
5. abstract is always a superclass only
6. when you inherit from an abstract class you are Required to override all its abstact functions.
 */
    abstract fun walk()
    abstract fun makeSound()
}