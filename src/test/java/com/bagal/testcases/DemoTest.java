package com.bagal.testcases;

import com.bagal.pojo.Employee;
import com.creditdatamw.zerocell.Reader;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

public class DemoTest {
    @Test
    public void demoTest(){

        List<Employee> employees = Reader.of(Employee.class)
                .from(new File("src/test/resources/testdata/data.xlsx"))
                .sheet("Sheet1")
                .skipHeaderRow(true)
                .list();
        System.out.println("employees = " + employees.get(0));
        System.out.println("employees = " + employees.get(1));

        // individual records  ---> first record
        System.out.println("employees.get(0).getEmpId() = " + employees.get(0).getEmpId());
        System.out.println("employees.get(0).getFirstName() = " + employees.get(0).getFirstName());
        System.out.println("employees.get(0).getLastName() = " + employees.get(0).getLastName());
        System.out.println("employees.get(0).getEmail() = " + employees.get(0).getEmail());
    }
}
