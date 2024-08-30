/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aps.resource;

import cn.hutool.json.JSONUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@Controller
public class BasicController {

    // http://127.0.0.1:8080/html
    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/view/{route}/{page}")
    public String dynamicRoute(@PathVariable("route") String route, @PathVariable("page") String page, Model model) {
        if ("crud".equalsIgnoreCase(page)) {
            model.addAttribute("columnsJson", JSONUtil.toJsonStr(getColumns()));
        }
        return String.format("/view/%s/%s", route, page);
    }

    private String getColumns() {
        return "[[" +
                "{type: 'checkbox', fixed: 'left'}," +
                "{field: 'id', fixed: 'left', width: 80, title: 'ID', sort: true, totalRowText: '合计：'}," +
                "{field: 'username', width: 80, title: '用户'}," +
                "{field: 'email',title: '邮箱', hide: 0,width: 150,edit: 'text'}," +
                "{field: 'sex', width: 80, title: '性别', sort: true}," +
                "{field: 'experience', width: 100, title: '积分', sort: true, totalRow: '{{= d.TOTAL_NUMS }}'}," +
                "{field: 'checkin', title: '打卡', width: 100, sort: true, totalRow: '{{= parseInt(d.TOTAL_NUMS) }} 次'}," +
                "{field: 'ip', title: 'IP', width: 120}," +
                "{field: 'joinTime', title: '加入时间', width: 120}," +
                "{fixed: 'right', title: '操作', width: 134, minWidth: 125, toolbar: '#barDemo'}" +
                "]]";
    }

}
