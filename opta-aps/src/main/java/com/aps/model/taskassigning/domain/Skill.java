package com.aps.model.taskassigning.domain;

import com.aps.domain.AbstractPersistable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Skill
 * <p>
 * comments: 技能
 *
 * @author YY
 * @version 1.0
 * @date 2023/10/19 15:25
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class Skill extends AbstractPersistable {

    /**
     * 技能名称
     */
    private String name;

    public Skill() {
    }

    public Skill(long id, String name) {
        super(id);
        this.name = name;
    }

}
