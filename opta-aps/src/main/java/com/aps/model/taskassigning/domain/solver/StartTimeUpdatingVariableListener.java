package com.aps.model.taskassigning.domain.solver;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import com.aps.model.taskassigning.domain.Employee;
import com.aps.model.taskassigning.domain.Task;
import com.aps.model.taskassigning.domain.TaskAssigningSolution;
import org.optaplanner.core.api.domain.variable.ListVariableListener;
import org.optaplanner.core.api.score.director.ScoreDirector;

import java.util.Date;
import java.util.List;
import java.util.Objects;

public class StartTimeUpdatingVariableListener implements ListVariableListener<TaskAssigningSolution, Employee, Task> {

    @Override
    public void beforeEntityAdded(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee) {
        throw new UnsupportedOperationException("This example does not support adding employees.");
    }

    @Override
    public void afterEntityAdded(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee) {
        throw new UnsupportedOperationException("This example does not support adding employees.");
    }

    @Override
    public void beforeEntityRemoved(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee) {
        throw new UnsupportedOperationException("This example does not support removing employees.");
    }

    @Override
    public void afterEntityRemoved(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee) {
        throw new UnsupportedOperationException("This example does not support removing employees.");
    }

    @Override
    public void afterListVariableElementUnassigned(ScoreDirector<TaskAssigningSolution> scoreDirector, Task task) {
        scoreDirector.beforeVariableChanged(task, "startTime");
        task.setStartTime(null);
        scoreDirector.afterVariableChanged(task, "startTime");
    }

    @Override
    public void beforeListVariableChanged(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee, int startIndex,
            int endIndex) {
        // Do nothing
    }

    @Override
    public void afterListVariableChanged(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee, int startIndex,
            int endIndex) {
        updateStartTime(scoreDirector, employee, startIndex);
    }

    protected void updateStartTime(ScoreDirector<TaskAssigningSolution> scoreDirector, Employee employee, int index) {
        List<Task> tasks = employee.getTasks();
        Date previousEndTime = index == 0 ? null : tasks.get(index - 1).getEndTime();

        for (int i = index; i < tasks.size(); i++) {
            Task t = tasks.get(i);
            Date startTime = calculateStartTime(t, previousEndTime);
            if (!Objects.equals(t.getStartTime(), startTime)) {
                scoreDirector.beforeVariableChanged(t, "startTime");
                t.setStartTime(startTime);
                scoreDirector.afterVariableChanged(t, "startTime");
            }
            previousEndTime = t.getEndTime();
        }
    }

    private Date calculateStartTime(Task task, Date previousEndTime) {
        if (previousEndTime == null) {
            return null;
        }
        return DateUtil.offset(previousEndTime, DateField.MINUTE, task.getReadyTime() * -1);
    }
}
