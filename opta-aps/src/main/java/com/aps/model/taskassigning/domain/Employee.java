package com.aps.model.taskassigning.domain;

import com.aps.common.domain.AbstractPersistable;
import lombok.Data;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningListVariable;

import java.util.*;

@Data
@PlanningEntity
public class Employee extends AbstractPersistable {

    private String fullName;

    private Set<Skill> skillSet;

    private Map<Customer, Affinity> affinityMap;

    @PlanningListVariable
    private List<Task> tasks;

    public Employee() {}

    public Employee(long id, String fullName) {
        super(id);
        this.fullName = fullName;
        skillSet = new LinkedHashSet<>();
        tasks = new ArrayList<>();
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

    @Override
    public String toString() {
        return fullName;
    }

}
