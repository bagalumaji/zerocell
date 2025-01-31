package com.bagal.pojo;

import com.creditdatamw.zerocell.annotation.Column;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Employee {
    @Column(name = "empId",index = 0)
    private String empId;

    @Column(name = "firstName",index = 1)
    private String firstName;

    @Column(name = "lastName",index = 2)
    private String lastName;

    @Column(name = "email",index = 3)
    private String email;
}
