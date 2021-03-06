package com.jereibaselibrary.netowrk.listen;

import com.jereibaselibrary.netowrk.HttpUtils;
import com.jereibaselibrary.tools.JRDataResult;


/**
 * Created by zhush on 2016/9/27.
 * E-mail 405086805@qq.com
 */
public interface HandleResponse {
    /**
     * 整理正确的返回值数据
     * @param dataControlResult
     * @param client
     * @return
     */
    public JRDataResult putResponse(JRDataResult dataControlResult, HttpUtils client);
}
