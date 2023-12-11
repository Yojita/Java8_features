# Functions

predefined functional interfaces available in java.util.function package

## Definition

t represents a function which takes in one argument and produces a result. Hence this functional interface takes in 2
generics namely as follows:

    T: denotes the type of the input argument
    R: denotes the return type of the function

Methods in Function Interface

    1. apply()    R apply(T t) 

Parameters: This method takes in only one parameter t which is the function argument
Return Type: This method returns the function result which is of type R.

    2. andThen()  default <V> Function<T, V> andThen(Function<? super R, ? extends V> after)

It returns a composed function wherein the parameterized function will be executed after the first one. If evaluation of
either function throws an error, it is relayed to the caller of the composed function.
where V is the type of output of the after function, and of the composed function

Parameters: This method accepts a parameter after which is the function to be applied after the current one.

Return Value: This method returns a composed function that applies the current function first and then the after
function

Exception: This method throws NullPointerException if the after function is null.

    3. compose()   default <V> Function<V, R> compose(Function<? super V, ? extends T> before)

It returns a composed function wherein the parameterized function will be executed first and then the first one. If
evaluation of either function throws an error, it is relayed to the caller of the composed function.
Where V is the type of input of the before function, and of the composed function

Parameters: This method accepts a parameter before which is the function to be applied first and then the current one

Return Value: This method returns a composed function that applies the current function after the parameterized function

Exception: This method throws NullPointerException if the before function is null.

    4. identity()  static <T> Function<T, T> identity()

This method returns a function that returns its only argument.
where T denotes the type of the argument and the value to be returned

Returns: This method returns a function that returns its own argument

## References

[GeeksForGeeks](https://www.geeksforgeeks.org/function-interface-in-java-with-examples/)

