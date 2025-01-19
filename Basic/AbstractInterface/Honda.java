/**
  * Honda class implements the Car interface.
 * 
 * Interview Questions:
 * 1. How does a class implement an interface?
 *    - A class provides concrete implementations for the methods defined in the interface.
 * 
 * 2. What happens if a class does not implement all methods of the interface?
 *    - The class must be declared abstract if it does not implement all methods of the interface.
 * 
 * 3. Can you instantiate a class that implements an interface?
 *    - Yes, you can instantiate the class if it provides implementations for all methods of the interface.
 * 
 * 4. What is the purpose of the @Override annotation?
 *    - It indicates that a method is overriding a method from an interface or superclass.
 */
public class Honda implements Car {
    @Override
    public void go() {
        System.out.println("Honda is going");
    }

    @Override
    public void stop() {
        System.out.println("Honda is stopping");
    }
}