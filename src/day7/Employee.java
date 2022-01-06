package day7;

import java.time.LocalDate;
import java.util.logging.Logger;

public class Employee{

    private String name;
    private double salary;
    private LocalDate joiningDate;

    public Employee(String name, double salary, LocalDate joiningDate){
        Logger.getGlobal().info(name);
        Logger.getGlobal().info(String.valueOf(salary));
        Logger.getGlobal().info(String.valueOf(joiningDate));

    }

}
