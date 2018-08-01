##### Abstract factory
It is just a factory of factory pattern.

In this use case there is DB factory and XMl factory which save data of employees and epartments in Db
and XMl respectively.
![](Abstract%20Factory.png)

Then there is an abstract fatory which is a factory to produce all the factory.
 

######Use cases
Since the Abstract Factory pattern is a generalization of the Factory Method pattern,
it offers the same benefits: it makes tracking an object creation easier, it decouples
an object creation from an object usage, and it gives us the potential to improve the
memory usage and performance of our application.

But a question is raised: how do we know when to use the Factory Method versus
using an Abstract Factory? The answer is that we usually start with the Factory
Method which is simpler. 

If we find out that our application requires many Factory
Methods which it makes sense to combine for creating a family of objects, we end up
with an Abstract Factory.

A benefit of the Abstract Factory that is usually not very visible from a user's
point of view when using the Factory Method is that it gives us the ability to modify
the behavior of our application dynamically (in runtime) by changing the active
Factory Method. 

The classic example is giving the ability to change the look and feel
of an application (for example, Apple-like, Windows-like, and so on) for the user
while the application is in use, without the need to terminate it and start it again