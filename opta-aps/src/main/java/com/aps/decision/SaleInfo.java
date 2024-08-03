package com.aps.decision;

import lombok.Data;

import java.lang.reflect.Field;
import java.util.Date;
import java.util.Map;
import java.util.function.Function;

/**
 * SaleInfo
 * <p>
 * comments:
 *
 * @author YY
 * @version 1.0
 * @date 2024/7/23 17:54
 */
@Data
public class SaleInfo implements IExcelObjectWrapper {

    private String goodsNo;

    private String goodsName;

    private String goodsPrice;

    private Date dealDate;

    private Double quantity;

    private String salesArea;

    @Override
    public Map<Integer, Function> getColumnMapping() {
        return Map.of(1, this.setGoodsNo());
    }
}
