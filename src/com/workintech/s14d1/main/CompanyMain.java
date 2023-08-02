package com.workintech.s14d1.main;

import com.workintech.s14d1.company.*;

import java.util.Arrays;

public class CompanyMain {
    public static void main(String[] args) {
        Employee cook = new Employee(7, "Ayşe");
        cook.work();

        JuniorDeveloper juniorDeveloper1 = new JuniorDeveloper(2,"Cihat");
        juniorDeveloper1.work();
        JuniorDeveloper juniorDeveloper2 = new JuniorDeveloper(3,"Bulut");
        juniorDeveloper2.work();
        JuniorDeveloper[] juniors = new JuniorDeveloper[]{juniorDeveloper1, juniorDeveloper2};

        MidDeveloper midDeveloper1 = new MidDeveloper(4,"Sezer");
        midDeveloper1.work();
        MidDeveloper midDeveloper2 = new MidDeveloper(5,"Kamil");
        midDeveloper2.work();
        //MidDeveloper[] mids = new MidDeveloper[]{midDeveloper1, midDeveloper2};

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(6, "Mahmut");
        seniorDeveloper.work();

        HRManager hrManager = new HRManager(1, "Ali", new JuniorDeveloper[3], new MidDeveloper[2], new SeniorDeveloper[1]);
        hrManager.work();
        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));

        hrManager.addEmployee(0, juniorDeveloper1);
        hrManager.addEmployee(0, midDeveloper1);
        hrManager.addEmployee(0, seniorDeveloper);

        System.out.println("*******************************");
        System.out.println("Juniors: " + Arrays.toString(hrManager.getJuniors()));
        System.out.println("Mids: " + Arrays.toString(hrManager.getMids()));
        System.out.println("Seniors: " + Arrays.toString(hrManager.getSeniors()));
    }
}
