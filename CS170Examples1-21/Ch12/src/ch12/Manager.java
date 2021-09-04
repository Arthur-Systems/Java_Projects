package ch12;
/**
* Class <b>Manager</b>inherits <b>Employee</b>.
* <b>Manager</b> is used to instantiate objects, return salary and the name of
* object.
*
* @author Yong Gao
* @version 1.1.0
***/
public class Manager extends Employee {
/**
* Instance variable and its value must be greater or equals to 0.
***/
   	protected double salary;
/**
*Constructor to instantiate objects
*
*@param name A <b>String</b> - object name.
*@param salary A <b>double</b> - salary
***/
public Manager( String name, double salary) {
      super( name );  // call superclass constructor
      this.salary = salary;
 }

/**
*Polymorphic method to return the earning
*
*@return <b>double</b> - salary
***/

public double earnings() { return salary; }	//override the method to return salary

/**
*Overriden method to return the manager's name
*
*@return <b>String</b> - object name
***/
public String toString() {	//override the method to print the name
      return "Manager: " + getName();
   }
}
