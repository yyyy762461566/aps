package com.aps.decision;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.junit.jupiter.api.Test;

/**
 * @className: ReadSaleInfoTest
 * @description: TODO 描述
 * @author: YY
 * @date: 2024/8/3
 **/
public class ReadSaleInfoTest {

    @Test
    public void readSaleInfoShouldSuccess() {
        String filePath = "C:\\Users\\YY\\Idea_Project_WorkSpace\\aps\\opta-aps\\src\\main\\resources\\data\\sales_data.csv";
        EasyExcel.read(filePath, SaleInfo.class, new PageReadListener<SaleInfo>(dataList -> {
            System.out.println(dataList.size());
        })).sheet().doRead();


    }


}
