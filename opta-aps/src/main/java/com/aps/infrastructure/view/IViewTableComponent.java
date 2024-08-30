package com.aps.infrastructure.view;

import java.util.List;

/**
 * IViewTableComponent
 * <p>
 * comments: 视图表格组件
 *
 * @author YY
 * @version 1.0
 * @date 2024/8/29 21:41
 */
public interface IViewTableComponent extends IViewComponent {


    List<column> getColumns();

    class column {

        private String field;

        private String title;

        private Integer width = 180;

        private String fixed;

        private boolean sort = Boolean.TRUE;

        private String totalRowText;

    }

}
