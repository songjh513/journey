package com.wuyi.journey.web.servercenter.controller.common;

import com.alibaba.fastjson.JSONObject;

/**
 * Created  by songjh on 2019-04-04 05:31.
 */
public class AlipayOpenApiRequst {

    private String appId;

    public String getAppId() {
        return appId;
    }

    private String apiName;

    private String bizContent;

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }


    public String getBizContent() {
        return bizContent;
    }

    public void setBizContent(String bizContent) {
        this.bizContent = bizContent;
    }

    @Override
    public String toString() {
        return "AlipayOpenApiRequst{" +
                "appId='" + appId + '\'' +
                ", apiName='" + apiName + '\'' +
                ", bizContent=" + bizContent +
                '}';
    }
}
