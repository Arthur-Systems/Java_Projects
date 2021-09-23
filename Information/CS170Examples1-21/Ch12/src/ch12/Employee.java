package ch12;
/**
* Super class <b>Employee</b>
* Method <b>getName()</b> and <b>earnings()</b> are used to perform polymorphism,
* <br> return the referenced name and salary of the object.
*

* @author Yong Gao
* @version 1.1.0
***/
public class Employee {
/**
* Private instance variable to store name.
***/
   private String name;

/**
*Constructor to instantiate object of Employee.
*
*@param name A <b>String</b> for name of the object
***/
   public Employee(String name ) {
      this.name = name;
   }
/**
*Return the name
*
*@return <b>String</b> for the name.
***/
   public String getName()
      { return name; }
/**
*Return the salary
*
*@return <b>double</b> for the salary.
***/
   public   double earnings(){return 0.0;}
}
