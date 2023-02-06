### Open and Closed methods in kotlin classes

In Kotlin,

- `open` method: A method that is declared open can be overridden in subclasses. This means that a subclass can provide its own implementation for an open method defined in a parent class.

- `final` method: A method that is declared final cannot be overridden in subclasses. This means that a subclass cannot provide its own implementation for a final method defined in a parent class.

By default, all methods in Kotlin are final, so if you want to allow overriding, you have to explicitly declare a method as open.