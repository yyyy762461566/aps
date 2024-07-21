package com.aps.model.taskassigning.domain;

import com.aps.common.domain.AbstractPersistable;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class TaskType extends AbstractPersistable {

    /**
     * 任务类型代码
     */
    private String code;

    /**
     * 任务类型
     */
    private String title;

    /**
     * 基础加工时间（单位分钟）
     */
    private int baseDuration;

    /**
     * 需求技能
     */
    private List<Skill> requiredSkillList;

    public TaskType() {
    }

    public TaskType(long id, String code, String title, int baseDuration) {
        super(id);
        this.code = code;
        this.title = title;
        this.baseDuration = baseDuration;
        requiredSkillList = new ArrayList<>();
    }

    // ************************************************************************
    // Complex methods
    // ************************************************************************

}
