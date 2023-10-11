# Static Methods
Static methods don't belong to a particular object, they are not a part of the API of the classes implementing the interface, therefore they have to be called by using the interface name preceding the method name.
Defining static method within an interface is identical to defining one in a class.
Moreover static methods can be invoked within other static and default methods.

The idea behind static interface methods is to provide a simple mechanism that allows us to putting together related methods in one single place without having to create an object.

The same can pretty much be done with abstract classes. The main difference is that abstract classes can have constructors, state, and behavior.

Furthermore, static methods in interfaces make it possible to group related utility methods, without having to create artificial utility classes that are simply placeholders for static methods.