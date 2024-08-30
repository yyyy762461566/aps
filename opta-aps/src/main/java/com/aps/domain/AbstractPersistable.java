package com.aps.domain;

import org.optaplanner.core.api.domain.lookup.PlanningId;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author Administrator
 */
@MappedSuperclass
public abstract class AbstractPersistable implements Serializable {

    @Id
    private Long id;

    public AbstractPersistable() {
    }

    public AbstractPersistable(long id) {
        this.id = id;
    }

    @PlanningId
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "-" + id;
    }

}
