# Functional Interfaces

## Definition

All functional interfaces have an informative ```@FunctionalInterface``` annotation. This clearly communicates the
purpose of the interface, and also allows a compiler to generate an error if the annotated interface does not satisfy
the conditions.

At first, this annotation seems to be useless. Even without it, our interface will be treated as functional as long as
it has just one abstract method.

By using the ```@FunctionalInterface``` annotation, the compiler will trigger an error in response to any attempt to
break the predefined structure of a functional interface. It is also a very handy tool to make our application
architecture easier to understand for other developers.

However, let’s imagine a big project with several interfaces; it’s hard to control everything manually. An interface,
which was designed to be functional, could accidentally be changed by adding another abstract method/methods, rendering
it unusable as a functional interface.

Any interface with a SAM(Single Abstract Method) is a functional interface, and its implementation may be treated as
lambda expressions.

Default methods are not abstract and do not count in functional interface.

Functional interface can have n number of default methods.
Functional Interface can have methods of object class.

Java provides predefined functional interfaces to deal with functional programming using lambda and method references.

```BiConsumer<T,U>```    It represents an operation that accepts two input arguments and returns no result.
```Consumer<T>``` It represents an operation that accepts a single argument and returns no result.
```Function<T,R>``` It represents a function that accepts one argument and returns a result.
```Predicate<T>```    It represents a predicate (boolean-valued function) of one argument.
```Supplier<T>```    It represents a supplier of results.

## References

[Baeldung](https://www.baeldung.com/java-8-functional-interfaces )
[JavaTpoint](https://www.javatpoint.com/java-8-functional-interfaces)