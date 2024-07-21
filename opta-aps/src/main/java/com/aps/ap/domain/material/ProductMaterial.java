package com.aps.ap.domain.material;

import com.aps.common.domain.AbstractPersistable;
import com.aps.common.domain.MaterialTypeEnum;
import com.aps.common.domain.TimeWrapper;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.util.Date;

/**
 * 产品系列表
 */
@Entity(name = "AP_PRODUCT_MATERIAL")
@EqualsAndHashCode(callSuper = true)
@Data
public class ProductMaterial extends AbstractPersistable {

    /**
     * 部门id
     */
    private String deptId;

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
    private TimeWrapper readyTime;

    /**
     * 单件加工时间
     */
    private TimeWrapper uniqueTime;

    /**
     * 分批批量(分批生产、交货数量）
     */
    private Double bq;

    /**
     * 首批时间
     */
    private TimeWrapper ft;

    /**
     * 节拍
     */
    private TimeWrapper tt;

    /**
     * 后处置时间
     */
    private TimeWrapper at;

    /**
     * 缓冲时间（单位天）
     */
    private TimeWrapper bt;

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

}