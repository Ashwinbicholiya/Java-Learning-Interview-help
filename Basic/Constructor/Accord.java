package Constructor;

/**
* Interview Questions:
 * 1. What is a constructor in Java?
 *    - A constructor is a special method that is called when an object is instantiated. It is used to initialize the object's state.
 * 
 * 2. Can a class have multiple constructors?
 *    - Yes, a class can have multiple constructors with different parameters (constructor overloading).
 * 
 * 3. What is the purpose of the super() keyword?
 *    - The super() keyword is used to call the constructor of the parent class.
 * 
 * 4. Can a constructor be private?
 *    - Yes, a constructor can be private, which is typically used in singleton patterns.
 */
public class Accord {
    int speed;
    Accord(int speed){
        speed=100;
    }
}