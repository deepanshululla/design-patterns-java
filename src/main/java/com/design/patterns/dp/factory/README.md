##### Factory pattern
It is a creational pattern which hides away the object creation process

A real life example is the jdbc driver, which connects to all sorts of relational databases, be it
oracle,mysql or sql server. 

So driver is an interface provided by jdbc api and the different databses
implement it.

So in a way every vendor has hidden their implementation of jdbc driver 

and to connect to either of the databases

One doesn't need to know the separate details of mysql or oracle ..

The factory class must have a static method.


#####
In a Windows application, we may have different database users (e.g., one user uses Oracle and one may use
Sql Server). Now whenever we need to insert data in our database we need to create either an SqlConnection
or an OracleConnection first; only then we can proceed. 

If we put them into simple if-else, we need to
repeat lots of codes and it doesn’t look good. We can use the factory pattern to solve these types of problems.
The basic structure is defined with an abstract class; our subclasses will be derived from this class. The
subclasses will take the responsibility of the instantiation process.

##### Pizza factory class