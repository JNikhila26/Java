package Day3.Polymorphism;

public class Parent {
    // method to render a shape
    public void Check() {
        System.out.println("Hello Parent");
    }
}

//Polymorphism : the same entity (method or operator or object) can perform
// different operations in different scenarios.

//In the above example, we have created a superclass: Parent and two subclasses: Child1 and Child2.
// Notice the use of the Check() method.

//The main purpose of the Check() method is to Check the shape.
// However, the process of Checking a Child1 is different than the process of Checking a child2.

//Hence, the check() method behaves differently in different classes.
// Or, we can say check() is polymorphic.