##### Decorator pattern
Design patterns offer us a fourth option that supports extending 
the functionality of an object dynamically (in runtime): Decorators.


A Decorator pattern can add responsibilities to an object dynamically,
and in a transparent manner (without affecting other objects) 

In this example, pizza decorator implements pizza interface which has the bake() method.
Both tomato and cheese pizza extend the decorator to implement the custom bake() method.

Finally we have the PlainPizza class which implements pizza
but can be docrated with either Cheese,Chicken or Tomato pizza decorators
to implement the custom bake functionality.

Both the decorators however call the super.bake() method which calls
the parent's class bake method first.

 
![](Decorator.png)