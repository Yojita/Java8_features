# Multiple Inheritance

Java allows multiple inheritance
for Ex: Vehicle interface and Alarm interface has same default methods and method signature  
simply code won't compile, as there's conflict caused by multiple interface inheritance.(a.k.a. Diamond problem)
If car inherit both sets of default methods. So which one to call?

To solve this ambiguity, we must explicitly provide an implementation for the methods:

1. Override the methods and provide custom implementation
2. have our class use the default methods of one of the interfaces.
3. or can use default methods of both of the classes.
