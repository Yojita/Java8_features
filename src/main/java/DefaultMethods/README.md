# Default Methods

Default methods are implicitely public.
Declare them with the default keyword at the begining of the method signature, and they provide an implementation.

In a typical design based on abstractions, where an interface has one or more implementation.
If one more method added to the interface, all the implementation will be forced to implement them too. 

This issue is solved by Default methods as we allowed to add new methods to the interface that are automatically available in the interface. Therefore no need to modify the implementing classes.

Backward compatibility is neatly preserved without having to refactor the implementations.

Default methods incrementally provide additional functionality to a given type without breaking down the implementing classes.
