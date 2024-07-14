package com.aps.ap.domain.material;

import com.aps.common.domain.AbstractPersistable;
import com.aps.common.domain.MaterialTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品系列表
 * @TableName SCHED_AP_MO_ML
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ProductMaterial extends AbstractPersistable implements Serializable {

    /**
     * 部门id
     */
    private String sectionId;

    /**
     * 物料主键
     */
    private String mlId;

    /**
     * 物料类型:成品:PR,部件：COMP,零件：PA
     */
    private MaterialTypeEnum mlType;

    /**
     * 准备时间
     */
    private BigDecimal rt;

    /**
     * 单件加工时间
     */
    private BigDecimal ut;

    /**
     * 分批批量(分批生产、交货数量）
     */
    private BigDecimal bq;

    /**
     * 首批时间
     */
    private BigDecimal ft;

    /**
     * 节拍（单位天）
     */
    private BigDecimal tt;

    /**
     * 后处置时间
     */
    private BigDecimal at;

    /**
     * 缓冲时间（单位天）
     */
    private BigDecimal bt;

    /**
     * 周期计算公式
     */
    private String formula;

    /**
     * 周期上限
     */
    private Double topCycle;

    /**
     * 周期下限
     */
    private Double minCycle;

    /**
     * 备注
     */
    private String comment;

    private String createUserid;

    private String createUsername;

    private Date createTime;

    private String modifyUserid;

    private String modifyUsername;

    private Date modifyTime;

    private static final long serialVersionUID = 1L;
}