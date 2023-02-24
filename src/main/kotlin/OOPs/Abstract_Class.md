# Abstract classes

When you use the abstract keyword before a class definition, you make this class abstract. Abstract classes can be thought of as a hybrid of an open class and an interface. There are two main consequences of making a class abstract:

- Abstract classes can have abstract methods or properties. Such elements are marked with an abstract modifier, and they do not have a body. They are just definitions, similar to those in interfaces, that need to be overridden in subclasses.
- Abstract classes cannot be used to create objects. However, you can inherit subclasses from them. This is a result of the first consequence - you cannot create objects with abstract methods or properties. Those need to be overridden. 

You can use abstract classes as a replacement for interfaces, but this is considered a bad practice. Wherever possible, the preference is to use interfaces. Each class can inherit from only one class but implement many interfaces. Interfaces are considered to be an easier concept to learn compared to abstract classes. The key advantage of abstract classes is that they can have non-open methods (on interfaces, all elements are open) and non-abstract properties. 

**Example of interface code**

```kotlin
interface I
    {
        val a: Int = 123 // ERROR! You cannot define non-abstract properties in Interfaces
    }
```

Abstract classes are mainly used when you want to specify a set of generic operations for multiple classes. Let's say that you write an application that draws various shapes in different ways. You might be drawing them on native Android components,  on websites, or on a terminal. Since you draw in different ways on each of those platforms, you need separate classes.

However, there is also another option. Because a  square and a rectangle can be drawn using lines, you can define an abstract class ShapeDrawer, that will define methods drawSquare and drawRectangle based on the abstract method drawLine. Now your drawer classes can inherit from shapeDrawer and only need to define one function drawLine, to have also drawSquare and drawRectangle. 