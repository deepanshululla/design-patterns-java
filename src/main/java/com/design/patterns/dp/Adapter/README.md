######## Adapter Factory pattern
Structural design patterns deal with the relationships between the entities (such as classes and objects) of a system.
 
A structural design pattern focuses on providing a simple way of composing objects for creating new functionality

Adapter is a structural design pattern that helps us make two incompatible interfaces compatible.
First, let's answer what incompatible interfaces really mean. 

If we have an old component and we want to use it in a new system, or a new component that we want to use in an old system,
the two can rarely communicate without requiring any code changes. But changing the code is not always possible,
either because we don't have access to it (for example, the component is provided as an external library)
or because it is impractical. 

In such cases, we can write an extra layer that makes all the required modifications for enabling the communication
between the two interfaces. This layer is called the Adapter.



##### Use in Ecommerce and Data conversions
E-commerce systems are known examples. Assume that we use an e-commerce system that contains a calculate_total(order) function. 
The function calculates the total amount of an order, but only in Danish Kroner (DKK). 

It is reasonable for our customers to ask us to add support for more popular currencies, 
such as United States Dollars (USD) and Euros (EUR). If we own the source code of the system
we can extend it by adding new functions for doing the conversions from DKK to USD and from DKK to EUR.

But what if we don't have access to the source code of the application because it is provided to us 
only as an external library? In this case, we can still use the library (for example, call its methods),
but we cannot modify/extend it. 

The solution is to write a wrapper (also known as Adapter) that converts 
the data from the given DKK format to the expected USD or EUR format

###### Beyond data conversions

The Adapter pattern is not useful only for data conversions. In general, if you want
to use an interface that expects function_a() but you only have function_b(), you
can use an Adapter to convert (adapt) function_b() to function_a().


###### Use case

The Adapter pattern is used for making things work after they have been
implemented. Usually one of the two incompatible interfaces
is either foreign or old/legacy. If the interface is foreign, it means that we have no
access to the source code. 

If it is old it is usually impractical to refactor it. We can take
it even further and argue that altering the implementation of a legacy component to
meet our needs is not only impractical, but it also violates the open/close principle

. The open/close principle is one of the fundamental principles
of Object-Oriented design (the O of SOLID). It states that a software entity should
be open for extension, but closed for modification. That basically means that we
should be able to extend the behavior of an entity without making source code
modifications. 

Adapter respects the open/closed principle.
Therefore, using an Adapter for making things work after they have been
implemented is a better approach because it:
• Does not require access to the source code of the foreign interface
• Does not violate the open/closed principle