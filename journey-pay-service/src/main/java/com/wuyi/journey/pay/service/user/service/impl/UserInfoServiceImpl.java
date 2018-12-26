package com.wuyi.journey.pay.service.user.service.impl;


import com.wuyi.journey.common.core.enums.PublicStatusEnum;
import com.wuyi.journey.common.core.page.PageBean;
import com.wuyi.journey.common.core.page.PageParam;
import com.wuyi.journey.pay.service.user.dao.UserInfoDao;
import com.wuyi.journey.pay.service.user.entity.UserInfo;
import com.wuyi.journey.pay.service.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户信息service实现类
 */
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserInfoDao userInfoDao;

	
	@Override
	public void saveData(UserInfo userInfo) {
		userInfoDao.insert(userInfo);
	}

	@Override
	public void updateData(UserInfo userInfo) {
		userInfoDao.update(userInfo);
	}

	@Override
	public UserInfo getDataById(String id) {
		return userInfoDao.getById(id);
	}

	@Override
	public PageBean listPage(PageParam pageParam, UserInfo userInfo) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userNo", userInfo.getUserNo());
		return userInfoDao.listPage(pageParam, paramMap);
	}
	


    /**
     * 根据商户编号获取商户信息
     *
     * @param merchantNo
     * @return
     */
    @Override
    public UserInfo getDataByMerchentNo(String merchantNo) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("userNo", merchantNo);
		paramMap.put("status", PublicStatusEnum.ACTIVE.name());
		return userInfoDao.getBy(paramMap);
    }
    
    /**
	 * 根据手机号获取商户信息
	 * @param mobile
	 * @return
	 */
    @Override
    public UserInfo getDataByMobile(String mobile){
    	Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("mobile", mobile);
		paramMap.put("status", PublicStatusEnum.ACTIVE.name());
		return userInfoDao.getBy(paramMap);
    }
    
    /**
	 * 获取所有用户
	 * @return
	 */
    @Override
    public List<UserInfo> listAll(){
    	Map<String, Object> paramMap = new HashMap<String, Object>();
		paramMap.put("status", PublicStatusEnum.ACTIVE.name());
		return userInfoDao.listBy(paramMap);
	}
}