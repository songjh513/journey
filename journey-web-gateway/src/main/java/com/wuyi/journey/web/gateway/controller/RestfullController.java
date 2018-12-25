package com.wuyi.journey.web.gateway.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created  by songjh on 2018-10-13 10:59.
 */
@RestController
public class RestfullController {

    @RequestMapping("/api/{path}")
    public String requestDispatch(@PathVariable String path, HttpServletRequest request, HttpServletResponse response)  {
        return "hello:"+path;
    }

}
