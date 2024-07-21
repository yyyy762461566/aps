package com.aps.common.domain;

import lombok.Data;

import java.util.concurrent.TimeUnit;

/**
 * TimeWrapper
 * <p>
 * comments: 时间包装类
 *
 * @author YY
 * @version 1.0
 * @date 2024/7/15 11:29
 */
@Data
public class TimeWrapper {

    /**
     * 时长
     */
    private double time;

    /**
     * 时间单位
     */
    private TimeUnit timeUnit;

    /**
     * 将存储的时间转换为指定的时间单位
     * @param targetUnit 目标时间单位
     * @return 以目标时间单位表示的转换后的时间
     */
    public double convertTo(TimeUnit targetUnit) {
        // 先将时间转换为毫秒，然后再转换为目标时间单位
        double timeInMillis = this.time * this.timeUnit.toMillis(1);
        return timeInMillis / targetUnit.toMillis(1);
    }

}
