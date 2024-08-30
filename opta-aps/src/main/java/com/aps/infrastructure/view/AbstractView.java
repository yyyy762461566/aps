package com.aps.infrastructure.view;

import java.util.List;

/**
 * AbstractView
 * <p>
 * comments: 抽象视图对象
 *
 * @author YY
 * @version 1.0
 * @date 2024/8/29 21:28
 */
public abstract class AbstractView {

    /**
     * 视图ID
     */
    private String id;

    /**
     * 视图组件集合
     */
    private List<IViewComponent> viewComponents;

}
