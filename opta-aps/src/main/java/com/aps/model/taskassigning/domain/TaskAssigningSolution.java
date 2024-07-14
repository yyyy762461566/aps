package com.aps.model.taskassigning.domain;

import com.aps.common.domain.AbstractPersistable;
import lombok.Data;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;

import java.util.List;

@Data
@PlanningSolution
public class TaskAssigningSolution extends AbstractPersistable {

    @ProblemFactCollectionProperty
    private List<Skill> skillList;
    @ProblemFactCollectionProperty
    private List<TaskType> taskTypeList;
    @ProblemFactCollectionProperty
    private List<Customer> customerList;
    @ValueRangeProvider
    @ProblemFactCollectionProperty
    private List<Task> taskList;

    @PlanningEntityCollectionProperty
    private List<Employee> employeeList;

    @PlanningScore(bendableHardLevelsSize = 1, bendableSoftLevelsSize = 4)
    private BendableScore score;

    /** Relates to {@link Task#getStartTime()}. */
    private int frozenCutoff; // In minutes

    public TaskAssigningSolution() {
    }

    public TaskAssigningSolution(long id) {
        super(id);
    }

    public TaskAssigningSolution(long id, List<Skill> skillList, List<TaskType> taskTypeList,
                                 List<Customer> customerList, List<Employee> employeeList, List<Task> taskList) {
        this(id);
        this.skillList = skillList;
        this.taskTypeList = taskTypeList;
        this.customerList = customerList;
        this.employeeList = employeeList;
        this.taskList = taskList;
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

}
