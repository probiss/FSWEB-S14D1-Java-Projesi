package com.workintech.s14d1.company;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    public MidDeveloper(long id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(35000);
        System.out.println( getName() + " mid developer begin to work.");
    }
}
