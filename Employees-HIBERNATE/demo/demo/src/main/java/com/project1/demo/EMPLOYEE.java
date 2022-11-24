package com.project1.demo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class EMPLOYEE {
    @Id
   private long id;
    private String name;
    private String address;
    private double salary;

//    public employee(long id,String name,String address,double salary)
//    {
//        this.id=id;
//        this.name=name;
//        this.address=address;
//        this.salary=salary;
//    }
}
