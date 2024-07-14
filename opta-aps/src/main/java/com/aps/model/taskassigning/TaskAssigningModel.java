package com.aps.model.taskassigning;

import com.aps.model.IModel;
import com.aps.model.taskassigning.domain.Employee;
import com.aps.model.taskassigning.domain.TaskAssigningSolution;
import com.aps.model.taskassigning.score.TaskAssigningConstraintProvider;
import org.optaplanner.core.config.solver.SolverConfig;

import java.time.Duration;

/**
 * @className: ITaskAssigningModel
 * @description: 任务分配模型
 * @author: YY
 * @date: 2023/10/28
 **/
public class TaskAssigningModel implements IModel {

    //TODO 根据数据库配置生成
    private final SolverConfig solverConfig = new SolverConfig()
            .withSolutionClass(TaskAssigningSolution.class)
            .withEntityClasses(Employee.class)
            .withConstraintProviderClass(TaskAssigningConstraintProvider.class)
            // 求解器在此小型数据集上仅运行 5 秒钟。
            // 否则，建议至少运行 5 分钟（“5m”）。
            .withTerminationSpentLimit(Duration.ofMinutes(5));

    @Override
    public SolverConfig buildSolverConfig() {
        return solverConfig;
    }






}
