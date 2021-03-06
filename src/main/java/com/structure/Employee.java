package com.structure;

import java.io.Serializable;

public class Employee implements Serializable {
    protected int employeeID;
    protected String firstName;
    protected String lastName;


    public Employee() {}

    public Employee(int employeeID, String firstName, String secondName) {
        this.employeeID = employeeID;
        this.firstName = firstName;
        this.lastName = secondName;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    
    public String getEmployeeData()
    {
    	return String.valueOf(lastName+" "+firstName);
    }


}
