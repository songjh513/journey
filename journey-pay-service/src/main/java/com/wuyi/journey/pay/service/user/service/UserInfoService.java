
package com.wuyi.journey.pay.service.user.service;



import com.wuyi.journey.common.core.page.PageBean;
import com.wuyi.journey.common.core.page.PageParam;
import com.wuyi.journey.pay.service.user.entity.UserInfo;

import java.util.List;

/**
 * 用户信息service接口
 */
public interface UserInfoService {
	
	/**
	 * 保存
	 */
	void saveData(UserInfo rpUserInfo);

	/**
	 * 更新
	 */
	void updateData(UserInfo rpUserInfo);

	/**
	 * 根据id获取数据
	 * 
	 * @param id
	 * @return
	 */
	UserInfo getDataById(String id);
	

	/**
	 * 获取分页数据
	 * 
	 * @param pageParam
	 * @return
	 */
	PageBean listPage(PageParam pageParam, UserInfo rpUserInfo);


	/**
	 * 根据商户编号获取商户信息
	 * @param merchantNo
	 * @return
	 */
	UserInfo getDataByMerchentNo(String merchantNo);
	
	/**
	 * 根据手机号获取商户信息
	 * @param mobile
	 * @return
	 */
	UserInfo getDataByMobile(String mobile);
	
	/**
	 * 获取所有用户
	 * @return
	 */
	List<UserInfo> listAll();
	
}