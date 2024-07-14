package com.aps.model.taskassigning.domain;

import com.aps.common.domain.AbstractPersistable;
import com.aps.model.taskassigning.domain.solver.StartTimeUpdatingVariableListener;
import lombok.Data;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.InverseRelationShadowVariable;
import org.optaplanner.core.api.domain.variable.ShadowVariable;

import java.util.Date;

@Data
@PlanningEntity
public class Task extends AbstractPersistable {

    private TaskType taskType;

    private int indexInTaskType;

    private Customer customer;

    private int readyTime;

    private Priority priority;

    // Shadow variables
    @InverseRelationShadowVariable(sourceVariableName = "tasks")
    private Employee employee;

    @ShadowVariable(variableListenerClass = StartTimeUpdatingVariableListener.class,
            sourceEntityClass = Employee.class, sourceVariableName = "tasks")
    private Date startTime;

    @ShadowVariable(variableListenerClass = StartTimeUpdatingVariableListener.class,
            sourceEntityClass = Employee.class, sourceVariableName = "tasks")
    private Date endTime;

    public Task() {
    }

    public Task(long id, TaskType taskType, int indexInTaskType, Customer customer, int readyTime, Priority priority) {
        super(id);
        this.taskType = taskType;
        this.indexInTaskType = indexInTaskType;
        this.customer = customer;
        this.readyTime = readyTime;
        this.priority = priority;
    }


    // ************************************************************************
    // Complex methods
    // ************************************************************************

}
