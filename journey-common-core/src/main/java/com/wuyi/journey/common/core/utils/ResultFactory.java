package com.wuyi.journey.common.core.utils;

import com.wuyi.journey.common.core.entity.ApiPageListResultVo;
import com.wuyi.journey.common.core.entity.PageListVO;
import com.wuyi.journey.common.core.page.PageBean;

/**
 * Created  by songjh on 2018-12-26 07:47.
 */
public class ResultFactory {

    public static ApiPageListResultVo createPageListResult(PageBean pageBean) {
        ApiPageListResultVo apiPageListResultVo = new ApiPageListResultVo();
        apiPageListResultVo.setCode(200);
        apiPageListResultVo.setSucceed(true);
        apiPageListResultVo.setMsg("调用成功");
        PageListVO pageListVO = new PageListVO();
        pageListVO.setTotal(pageBean.getTotalCount());
        pageListVO.setPage(pageBean.getCurrentPage());
        pageListVO.setPageSize(pageBean.getNumPerPage());
        pageListVO.setPageData(pageBean.getRecordList());
        apiPageListResultVo.setData(pageListVO);
        return apiPageListResultVo;
    }
}
