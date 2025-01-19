/**
 * BMW abstract class defines the blueprint for BMW cars.
 * 
 * Interview Questions:
 * 1. What is an abstract class in Java?
 *    - An abstract class is a class that cannot be instantiated and is meant to be subclassed. It can contain abstract methods (without implementation) and concrete methods (with implementation).
 * 
 * 2. Why use abstract classes?
 *    - To provide a common base class with shared code and to define methods that must be implemented by subclasses.
 * 
 * 3. Can an abstract class have constructors?
 *    - Yes, an abstract class can have constructors, which are called when a subclass is instantiated.
 * 
 * 4. Can an abstract class implement interfaces?
 *    - Yes, an abstract class can implement interfaces and provide implementations for some or all of the interface methods.
 */
public abstract class BMW {
    // Abstract method for accelerating
    abstract void accelerate();

    // Abstract method for braking
    abstract void brake();
}