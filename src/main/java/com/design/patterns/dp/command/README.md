### Command Pattern
It is a behavioral design pattern.
Design pattern that is used to implement undo: the Command pattern.
The Command design pattern helps us encapsulate an operation 
(undo, redo, copy, paste, and so forth) as an object. 

What this simply means is that we create a class that contains 
all the logic and the methods required to implement the operation. 
The advantages of doing this are as follows:

• We don't have to execute a command directly. It can be executed on will.

• The object that invokes the command is decoupled from the object 
that knows how to perform it. 
The invoker does not need to know any implementation details about the command.

• If it makes sense, multiple commands can be grouped to allow the invoker
to execute them in order. This is useful, for instance, when implementing
a multilevel undo command.

####Use cases
Many developers use the undo example as the only use case of the Command
pattern. The truth is that undo is the killer feature of the Command pattern.
However, the Command pattern can actually do much more :

• GUI buttons and menu items: The PyQt example that was already
mentioned uses the Command pattern to implement actions on
buttons and menu items.

• Other operations: Apart from undo, Command can be used to implement
any operation. A few examples are cut, copy, paste, redo, and capitalize text.

• Transactional behavior and logging: Transactional behavior and logging
are important to keep a persistent log of changes. They are used by operating
systems to recover from system crashes, relational databases to implement
transactions, filesystems to implement snapshots, and installers (wizards)
to revert cancelled installations.

• Macros: By macros, in this case, we mean a sequence of actions that can be
recorded and executed on demand at any point in time. Popular editors such
as Emacs and Vim support macros.