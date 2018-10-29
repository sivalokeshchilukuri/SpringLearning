# SpringLearning
Spring 5.1.1 Learning


1.Spring Container: responsibility is to create and manage the objects and injecting their dependencies.
Inversion of Control: Create and manage Objects

Dependency Injection: Manage Dependencies

2.What is the purpose for the no arg constructor? 
When you don’t define any constructor in your class, compiler defines default one for you, 
however when you declare any constructor 
(in your example you have already defined a parameterized constructor), 
compiler doesn’t do it for you. Since you have defined a constructor in class code, 
compiler didn’t create default one. While creating object you are invoking default one, 
which doesn’t exist in class code. Then the code gives an compilation error.


3.
For "prototype" scoped beans, Spring does not call the destroy method.
In contrast to the other scopes, Spring does not manage the complete lifecycle of a prototype bean: 
the container instantiates, configures, and otherwise assembles a prototype object, 
and hands it to the client, with no further record of that prototype instance.

Thus, although initialization lifecycle callback methods are called on all objects regardless of scope, 
in the case of prototypes, configured destruction lifecycle callbacks are not called. 
The client code must clean up prototype-scoped objects and release expensive resources that the 
prototype bean(s) are holding. 
