#### Inversion of Control and Dependency Injection

Basically if class A wants to have an instance of Class B, we can either do it by
composition where in we create an instance of class B in class A or we can use a 
container like spring to which we can delegate the instance creation.

This assigning control to a seperate container is called IoC and the process of
defning the dependencies is called dependency injection.

The dependecy injection in spring can be used at constructor level,
setter level or at field level.
