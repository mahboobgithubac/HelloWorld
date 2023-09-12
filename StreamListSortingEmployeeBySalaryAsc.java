package com.org.java8sort;
import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamListSortingEmployeeBySalaryAsc {
    public static void main(String[] args) {

        // sort employee by salary in ascending order
        List < Employee > employees = new ArrayList < Employee > ();
        employees.add(new Employee(10, "Ramesh", 30, 400000));
        employees.add(new Employee(20, "John", 29, 350000));
        employees.add(new Employee(30, "Tom", 30, 450000));
        employees.add(new Employee(40, "Pramod", 29, 500000));

        List < Employee > employeesSortedList1 = employees.stream()
            .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
        System.out.println(employeesSortedList1);

        List < Employee > employeesSortedList2 = employees.stream()
            .sorted(Comparator.comparingLong(Employee::getSalary)).collect(Collectors.toList()); //ascending order
        System.out.println(employeesSortedList2);
        Predicate<Integer> p=x->x>50;
        System.out.println(p.test(55));
        
        
        List < Employee > employeesSortedListByName = employees.stream()
                .sorted((o1, o2) -> (int)(o1.getSalary() - o2.getSalary())).collect(Collectors.toList());
            System.out.println(employeesSortedList1);
        
    }
}