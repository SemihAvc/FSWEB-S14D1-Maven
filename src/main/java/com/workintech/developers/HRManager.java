package com.workintech.developers;

import com.workintech.developers.Employee;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    private MidDeveloper[] midDevelopers;

    public HRManager(int id, String name, int salary, JuniorDeveloper[] juniorDevelopers, SeniorDeveloper[] seniorDevelopers, MidDeveloper[] midDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.seniorDevelopers = seniorDevelopers;
        this.midDevelopers = midDevelopers;
    }

    public String addEmployee(int index, JuniorDeveloper juniorDeveloper) {
        try {
            if (juniorDevelopers[index] == null) {
                juniorDevelopers[index] = juniorDeveloper;
                return "Employee added successfully";
            } else {
                return "Employee already exists at index " + index;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            return index + " index not found";
        }
    }

    public String addEmployee(int index, SeniorDeveloper seniorDeveloper) {
        try {
            if (seniorDevelopers[index] == null) {
                seniorDevelopers[index] = seniorDeveloper;
                return "Employee added successfully";
            } else {
                return "Employee already exists at index " + index;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            return index + " index not found";
        }
    }

    public String addEmployee(int index, MidDeveloper midDeveloper) {
        try {
            if (midDevelopers[index] == null) {
                midDevelopers[index] = midDeveloper;
                return "Employee added successfully";
            } else {
                return "Employee already exists at index " + index;
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            return index + " index not found";
        }
    }

    @Override
    public void work() {
        setSalary(100000);
        System.out.println(getName() + " HRManager işe girdi...");
    }
}
