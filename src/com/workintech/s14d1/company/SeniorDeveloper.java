package com.workintech.s14d1.company;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(long id, String name) {
        super(id, name);
    }

    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(50000);
        System.out.println( getName() + " senior developer begin to work.");
    }
}

