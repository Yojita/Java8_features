# Optional Class

Optional class represents either presemce or absence of something.
Technically optional is wrapper class for generic type T, where optional instance is empty if T is null or it's full.

The purpose of optional is to provide return type that can represent the absence of value in scenerio where returning
null might cause unexpected errors.
EX: NullPointerException

Useful Methods :

    1. of(T value) returns an instance of an Optional with a value inside
    2. orElse(T other) returns the value inside an Optional, otherwise returns other
    3. Finally, empty() returns an empty instance of Optional

    


