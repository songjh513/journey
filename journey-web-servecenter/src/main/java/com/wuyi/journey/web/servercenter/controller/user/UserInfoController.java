package com.wuyi.journey.web.servercenter.controller.user;

import com.wuyi.journey.common.core.entity.ApiPageListResultVo;
import com.wuyi.journey.common.core.page.PageBean;
import com.wuyi.journey.common.core.page.PageParam;
import com.wuyi.journey.pay.service.user.entity.UserInfo;
import com.wuyi.journey.pay.service.user.service.UserInfoService;
import com.wuyi.journey.common.core.utils.ResultFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created  by songjh on 2018-12-26 07:45.
 */
@Controller
@RequestMapping("/user/info")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    /**
     * 函数功能说明 ： 查询用户信息
     *
     * @参数： @return
     * @return String
     * @throws
     */
    @RequestMapping(value = "/list", method ={RequestMethod.POST,RequestMethod.GET})
    @ResponseBody
    public ApiPageListResultVo list(UserInfo rpUserInfo, PageParam pageParam) {
        PageBean pageBean = userInfoService.listPage(pageParam, rpUserInfo);
        return ResultFactory.createPageListResult(pageBean);
    }
}
