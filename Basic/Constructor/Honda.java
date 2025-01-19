package Constructor;

/**
 * Honda class extends Accord and uses the constructor of the parent class.
 * 
 * Interview Questions:
 * 1. How does a subclass call the constructor of its superclass?
 *    - A subclass calls the constructor of its superclass using the super() keyword.
 * 
 * 2. What happens if a subclass does not call the constructor of its superclass?
 *    - If a subclass does not explicitly call the constructor of its superclass, the default constructor of the superclass is called automatically.
 * 
 * 3. Can a subclass override the constructor of its superclass?
 *    - No, constructors are not inherited, so they cannot be overridden. However, a subclass can call the constructor of its superclass.
 */
public class Honda extends Accord {
    Honda(){
        super(120);
        System.out.println("Honda is created");
    }
}