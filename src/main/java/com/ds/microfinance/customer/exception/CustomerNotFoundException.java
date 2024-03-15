package com.ds.microfinance.customer.exception;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CustomerNotFoundException extends RuntimeException{

    private int id;
    private String mob;
    private String pan;

    public CustomerNotFoundException(int id, String mob, String pan) {
        super(String.format(" '%d' not found with %s:%s",id,mob,pan));
        this.id = id;
        this.mob = mob;
        this.pan = pan;
    }


    public int getId() {
        return id;
    }

    public String getMob() {
        return mob;
    }

    public String getPan() {
        return pan;
    }
}
