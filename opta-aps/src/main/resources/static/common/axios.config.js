// 后端地址，如果前后台是一个地址，而且Gateway没有配统一标识的话直接用 / 就可以，否则需要配置IP端口和统一标识
axios.defaults.baseURL = '/';
// 超时时长
axios.defaults.timeout = 300000;
// 请求头
axios.defaults.headers.post['Content-Type'] = 'application/json;charset=UTF-8';

// 请求前拦截器
axios.interceptors.request.use(function (config) {
    // 发送前的操作，比如给请求头添加防CSRF攻击的token
    return config;
}, function (error) {
    return Promise.reject(error);
})

// 返回数据前拦截器，对状态码和数据进行预处理
axios.interceptors.response.use(function (res) {
    // 如果没有返回值，应当直接抛出错误
    if (!res.data) {
        new Vue().$message({
            type: 'error',
            message: '无响应数据',
            showClose: true
        });
        return Promise.reject('response.data 无数据');
    }
    return res;
}, function (error) {
    // 未经授权的请求，设置跳转到其他路径
    if (error.response.status === 401) {
        var topwindow = window;
        while (topwindow.self != topwindow.top) {
            topwindow = topwindow.parent;
        }
        topwindow.location.href = error.response.data;
        return;
    } else if (error.response.status === 500 && error.response.data.message !== undefined) {
        new Vue().$message({
            type: 'error',
            message: error.response.data.message,
            showClose: true
        });
    } else if (error.response.status !== 200 && error.response.data !== undefined) {
        // 跳转到异常页面
        window.location.href = "/errorPage.html";
        return;
    }
})
