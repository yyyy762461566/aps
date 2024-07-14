package com.aps.model.taskassigning.domain;

import com.aps.common.domain.AbstractPersistable;
import lombok.Data;

@Data
public class Customer extends AbstractPersistable {

    private String name;

    public Customer() {
    }

    public Customer(long id) {
        super(id);
    }

    public Customer(long id, String name) {
        this(id);
        this.name = name;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

}
