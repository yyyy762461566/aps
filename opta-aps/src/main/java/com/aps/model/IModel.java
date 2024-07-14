package com.aps.model;

import org.optaplanner.core.config.solver.SolverConfig;

/**
 * @className: IModel
 * @description: TODO 描述
 * @author: YY
 * @date: 2023/10/28
 **/
public interface IModel {

    /**
     * 构建求解器配置
     * @return 求解器配置对象 {@link SolverConfig}
     */
    SolverConfig buildSolverConfig();


}
