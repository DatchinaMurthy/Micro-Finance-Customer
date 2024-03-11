package com.ds.microfinance.customer.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class Customer {


    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private String mobile;
    @Column
    private String panNo;

}
