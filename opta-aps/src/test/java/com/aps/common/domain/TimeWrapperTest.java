package com.aps.common.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

/**
 * TimeWrapperTest
 * <p>
 * comments: 时间包装类测试用例
 *
 * @author YY
 * @version 1.0
 * @date 2024/7/15 11:39
 */
public class TimeWrapperTest {

    @Test
    public void test() {
        TimeWrapper timeWrapper = new TimeWrapper();
        timeWrapper.setTime(1.5);
        timeWrapper.setTimeUnit(TimeUnit.HOURS);

        System.out.println(timeWrapper.convertTo(TimeUnit.MINUTES));

    }


}
