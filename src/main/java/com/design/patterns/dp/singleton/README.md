
##### To make a class singleton

1) Make its constructor private so no other class can directly create an objetc for it.
2) Declare a static method
3) Declare a static member of the same class type in the class
 
 
##### Why in the code have we used the term “Lazy initialization”?
 
Because, the singleton instance will not be created until the }getInstance() method is called here
 
##### The place where singleton should be used
1) when we need to have a common object for reading config file(saves memory).
2) When we need to create a logger object

##### Thread safety
Singleton with lazy initialization is not thread safe. To make it thread safe

1) Use synchronized key word(it is an expensive process because acquiring locks is expensive)
(Also use volatile keyword to make it multithreading safe)

2) Use eager initialization ensures thread safety

3) creating helper class  ensures thread safety

##### Serialization and Deserialization
Serialization is the ability to write an object as a stream. To make desirerlization successful in singleton
we implement Serializable class and overide getResolve()

##### To make singleton class objects non cloneable
the use case is what if we inherit the singleton class and and the child class calls super.clone() to clone the parent object.
To make it non cloneable implement cloneoable and overide clone() method.