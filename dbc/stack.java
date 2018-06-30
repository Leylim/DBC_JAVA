package dbc;
/**
 *  @inv !isEmpty() implies top() != null   //  specifies a condition that must hold anytime a client could invoke an object's method
 */
public interface stack {    
	/**
     *  @pre o != null  //specify conditions that must hold before a method can execute
     *  @post !isEmpty()  //specify conditions that must hold after a method completes
     *  @post top() == o
     */
    void push(Object o);
    /**
     *  @pre !isEmpty()
     *  @post @return == top()@pre
     */
    Object pop();
    /**
     *  @pre !isEmpty()
     */
    Object top();
    boolean isEmpty();

}
/*
 * If you find yourself dealing with more complex business 
 * rules in the domain model, Contracts can be used to explicitly 
 * specify assumptions about various method calls, or class usage.
 * Especially in common project libraries it makes sense to specify 
 * contracts to ensure valid usage of API classes throughout the project
 *  team and to ensure these contracts are satisfied in future versions
 */