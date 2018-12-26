package com.wuyi.journey.web.servercenter.controller.common;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;

/**
 * controller基类
 * Created  by songjh on 2018-12-26 07:44.
 */
public class BaseController {

    /**
     * 获取shiro 的session
     *
     * @return
     */
    protected Session getSession() {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        return session;
    }

}
