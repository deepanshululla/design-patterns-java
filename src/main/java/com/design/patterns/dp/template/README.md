##### Template Design pattern

This pattern focuses on eliminating code redundancy. The idea is that we should
be able to redefine certain parts of an algorithm without changing its structure.

In our use case, So there is a parent abstract class which renders the data to the user. This method is 
not overidden by child classes.There are 2 other methods(which are abstract) for reading and processing
 the data which are overridden by child classes.
 


###### Use Case
The Template design pattern focuses on eliminating code repetition. 

If we notice that there is repeatable code in algorithms that have structural similarities, we can keep
the invariant (common) parts of the algorithms in a template method/function and
move the variant (different) parts in action/hook methods/functions.

Pagination is a good use case to use Template. A pagination algorithm can be split
into an abstract (invariant) part and a concrete (variant) part. 

The invariant part takes care of things such as the maximum number of lines/page. The variant part contains
functionality to show the header and footer of a specific page that is paginated.

All application frameworks make use of some form of the Template pattern. When
we use a framework to create a graphical application, we usually inherit from a class
and implement our custom behavior. 

However, before this, a Template method is usually called that implements the part of the application that is always the same,
which is drawing the screen, handling the event loop, resizing and centralizing the window, and so on