package com.aps.decision;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

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
public class SaleInfo {

    @ExcelProperty(value = "商品编码", index = 0)
    private String goodsNo;

    @ExcelProperty(value = "商品名称", index = 1)
    private String goodsName;

    @ExcelProperty(value = "单价", index = 4)
    private BigDecimal goodsPrice;

    @ExcelProperty(value = "下单日期", index = 2)
    private Date dealDate;

    @ExcelProperty(value = "下单数量", index = 3)
    private String quantity;

    @ExcelProperty(value = "销区", index = 5)
    private String salesArea;

}
