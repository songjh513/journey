package com.wuyi.journey.web.servercenter.controller.common;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.shiro.crypto.hash.Hash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created  by songjh on 2019-04-04 05:30.
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/apiRequest.json",method={RequestMethod.GET,RequestMethod.POST})
    public @ResponseBody Response requestDispatch( AlipayOpenApiRequst requst, HttpServletRequest request)  {

        HashMap<String, Object> map = new HashMap<>();
        map.put("msg","success");

        Response response = new Response();

        System.out.println(requst);

        JSONObject parse = JSONObject.parseObject(requst.getBizContent());

        response.setResult(parse);

        System.out.println(parse.toJSONString());

        return response;
    }


    public static void main(String[] args) {
        AlipayOpenApiRequst alipayOpenApiRequst = new AlipayOpenApiRequst();
        alipayOpenApiRequst.setBizContent("{\n" +
                "        \"requestId\": {\n" +
                "            \"name\": \"requestId\",\n" +
                "            \"require\": true\n" +
                "        }");
        JSONObject parse = JSONObject.parseObject(alipayOpenApiRequst.getBizContent());
        System.out.println(parse.toJSONString());
    }
}
