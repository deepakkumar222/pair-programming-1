package org.tg.ppad.util;

import org.tg.ppad.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

    public static void main(String args[]){
        List<Object[]> listObj = new ArrayList<Object[]>();
        Object[] objects = new Object[5];
        objects[0] = 2;
        objects[1] = "Sudheer";
        objects[2] = "Reddy";
        objects[3] = "32";
        objects[4] = "sudheer@xyz.com";
        listObj.add(objects);

        objects = new Object[5];
        objects[0] = 3;
        objects[1] = "Nitin";
        objects[2] = "K";
        objects[3] = "33";
        objects[4] = "nitin@xyz.com";
        listObj.add(objects);

        System.out.println("listObj:"+listObj);

        List<Employee> employeeList = employeeList(listObj);
        for(Employee employee : employeeList){
            System.out.println("employee data:"+employee);
        }
    }

    public static List<Employee> employeeList(List<Object[]> listObj){
        List<Employee> employeeList = new ArrayList<Employee>();
        
        return employeeList;
    }

}
