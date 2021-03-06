package com.wuyi.journey.pay.service.user.dao.impl;



import com.wuyi.journey.common.core.dao.impl.BaseDaoImpl;
import com.wuyi.journey.pay.service.user.dao.UserInfoDao;
import com.wuyi.journey.pay.service.user.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * 用户信息dao实现类
 */
@Repository("userInfoDao")
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo> implements UserInfoDao {
}